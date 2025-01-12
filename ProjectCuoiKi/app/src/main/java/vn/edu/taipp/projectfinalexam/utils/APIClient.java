package vn.edu.taipp.projectfinalexam.utils;

import android.widget.Toast;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class APIClient {

    private static final ApiService apiService = ApiService.apiService;
    private static final Gson gson = new Gson();

    // Phương thức GET danh sách từ API
    public static String get(String endpoint) throws IOException {
        Call<ResponseBody> call = apiService.get(endpoint);
        Response<ResponseBody> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body().string();
        } else {
            throw new IOException("Lỗi khi gọi GET API: " + response.message());
        }
    }

    // Phương thức GET chi tiết đối tượng từ API
    public static String show(String endpoint, String id) throws IOException {
        Call<ResponseBody> call = apiService.show(endpoint, id);
        Response<ResponseBody> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body().string();
        } else {
            throw new IOException("Lỗi khi gọi SHOW API: " + response.message());
        }
    }

    // Phương thức POST dữ liệu (truyền vào một Object)
    public static String post(String endpoint, Object data) throws IOException {
        String jsonData = gson.toJson(data); // Chuyển đổi Object thành JSON
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), jsonData);
        Call<ResponseBody> call = apiService.post(endpoint, body);
        Response<ResponseBody> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body().string();
        } else {
            throw new IOException("Lỗi khi gọi POST API: " + response.message());
        }
    }

    // Phương thức PUT cập nhật dữ liệu (truyền vào một Object)
    public static String put(String endpoint, Object data) throws IOException {
        String jsonData = gson.toJson(data); // Chuyển đổi Object thành JSON
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), jsonData);
        Call<ResponseBody> call = apiService.put(endpoint, body);
        Response<ResponseBody> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body().string();
        } else {
            throw new IOException("Lỗi khi gọi PUT API: " + response.message());
        }
    }

    // Phương thức DELETE một đối tượng trên API
    public static String delete(String endpoint, String id) throws IOException {
        Call<ResponseBody> call = apiService.delete(endpoint, id);
        Response<ResponseBody> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body().string();
        } else {
            throw new IOException("Lỗi khi gọi DELETE API: " + response.message());
        }
    }
}
