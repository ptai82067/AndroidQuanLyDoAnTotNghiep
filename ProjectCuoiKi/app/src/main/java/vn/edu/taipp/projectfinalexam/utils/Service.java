package vn.edu.taipp.projectfinalexam.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.taipp.projectfinalexam.model_dto.BoMon;
import vn.edu.taipp.projectfinalexam.model_dto.DoAn;
import vn.edu.taipp.projectfinalexam.model_dto.GiangVien;
import vn.edu.taipp.projectfinalexam.model_dto.Identifiable;
import vn.edu.taipp.projectfinalexam.model_dto.SinhVien;

public class Service {
    private static final String SINHVIEN_TABLE_NAME = "SinhVien";
    private static final String DOAN_TABLE_NAME = "DoAn";
    private static final String GIANGVIEN_TABLE_NAME = "GiangVien";
    private static final String BOMON_TABLE_NAME = "BoMon";

    private final ApiService apiService;
    private final Gson gson;

    public Service() {
        this.apiService = ApiService.apiService;
        this.gson = ApiService.gson;
    }

    // Callback interface cho kết quả bất đồng bộ
    public interface ServiceCallback<T> {
        void onSuccess(T result);
        void onFailure(String error);
    }

    // Lấy danh sách SinhVien
    public void getSinhVienList(final ServiceCallback<List<SinhVien>> callback) {

        APIDataCache cache = APIDataCache.getInstance();
        List<SinhVien> cachedData = cache.getListFromCache(SINHVIEN_TABLE_NAME, SinhVien.class);

        if (!cachedData.isEmpty()) {
            callback.onSuccess(cachedData); // Trả về dữ liệu từ cache
            return;
        }
        fetchListFromApi(SINHVIEN_TABLE_NAME, new TypeToken<List<SinhVien>>() {}.getType(), callback);
    }

    // Lấy danh sách DoAn
    public void getDoAnList(final ServiceCallback<List<DoAn>> callback) {
        fetchListFromApi(DOAN_TABLE_NAME, new TypeToken<List<DoAn>>() {}.getType(), callback);
    }

    // Lấy danh sách GiangVien
    public void getGiangVienList(final ServiceCallback<List<GiangVien>> callback) {
        fetchListFromApi(GIANGVIEN_TABLE_NAME, new TypeToken<List<GiangVien>>() {}.getType(), callback);
    }

    // Lấy danh sách BoMon
    public void getBoMonList(final ServiceCallback<List<BoMon>> callback) {
        fetchListFromApi(BOMON_TABLE_NAME, new TypeToken<List<BoMon>>() {}.getType(), callback);
    }

    // Phương thức chung để lấy danh sách từ API với enqueue
    private <T extends Identifiable> void fetchListFromApi(String endpoint, Type type, final ServiceCallback<List<T>> callback) {
        Call<ResponseBody> call = apiService.get(endpoint);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful() && response.body() != null) {
                    try {
                        String jsonResponse = response.body().string();
                        List<T> result = gson.fromJson(jsonResponse, type);

                        // Lưu danh sách vào APIDataCache
                        APIDataCache cache = APIDataCache.getInstance();
                        cache.addListToCache(endpoint, result);

                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure("Parsing error: " + e.getMessage());
                    }
                } else {
                    callback.onFailure("Failed with code: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callback.onFailure("Request failed: " + t.getMessage());
            }
        });
    }

}
