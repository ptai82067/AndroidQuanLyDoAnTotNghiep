package vn.edu.taipp.projectfinalexam.utils;
import static androidx.core.app.PendingIntentCompat.getActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.taipp.projectfinalexam.model_dto.GiangVien;
import vn.edu.taipp.projectfinalexam.model_dto.Identifiable;
import vn.edu.taipp.projectfinalexam.model_dto.LoginResponse;
import vn.edu.taipp.projectfinalexam.model_dto.SinhVien;

public class LoginHandler {
    private final ApiService apiService;
    private final Context context;  // Khai báo context
    public LoginHandler( Context context) {
        this.context = context;
        // Tạo instance của ApiService
        apiService = RetrofitClient.getInstance().create(ApiService.class);
    }

    public void login(String username, String password, LoginCallback callback) {
        // Tạo payload JSON
        Map<String, String> payload = Map.of(
                "username", username,
                "password", password
        );

        // Gọi API đăng nhập
        apiService.login(payload).enqueue(new Callback<Map<String, Object>>() {
            @Override
            public void onResponse(Call<Map<String, Object>> call, Response<Map<String, Object>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Gson gson = new Gson();
                    String json = gson.toJson(response.body());

                    // Chuyển đổi JSON sang LoginResponse

                    LoginResponse loginResponse = gson.fromJson(json, LoginResponse.class);

                    if ("success".equals(loginResponse.getStatus())) {
                        callback.onSuccess(loginResponse); // Truyền đối tượng đã xử lý
                    } else {
                        callback.onFailure("Lỗi từ server"); // Lỗi từ server
                    }
                } else {
                    callback.onFailure("API error: " + response.code());
                }
            }




            @Override
            public void onFailure(Call<Map<String, Object>> call, Throwable t) {
                callback.onFailure("Network error: " + t.getMessage()); // Lỗi mạng
            }
        });
    }




    // Interface callback để trả kết quả
    public interface LoginCallback {
        void onSuccess(LoginResponse response);

        void onFailure(String errorMessage);
    }


}
