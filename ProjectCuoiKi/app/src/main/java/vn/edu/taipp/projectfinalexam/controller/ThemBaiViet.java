package vn.edu.taipp.projectfinalexam.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiVietRequest;
import vn.edu.taipp.projectfinalexam.utils.APIClient;

public class ThemBaiViet extends AppCompatActivity {
    private EditText etTieuDe, etNoiDung;

    private Button btnDangBai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_bai_viet);
        etTieuDe = findViewById(R.id.et_tieu_de);
        etNoiDung = findViewById(R.id.et_noi_dung);

        btnDangBai = findViewById(R.id.btn_dang_bai);
        btnDangBai.setOnClickListener(v -> {
            String tieuDe = etTieuDe.getText().toString();
            String noiDung = etNoiDung.getText().toString();

            String ngayTao = "2025-01-13"; // Hoặc lấy thời gian thực
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
            int id = sharedPreferences.getInt("Id", 0); // Giá trị mặc định là ""

            int maNguoiTao = id; // ID người tạo, có thể lấy từ dữ liệu người dùng

            BaiVietRequest baiVietRequest = new BaiVietRequest(tieuDe, noiDung, ngayTao, maNguoiTao);
            new Thread(() -> {
                try {
                    String response = APIClient.post("BaiViet",baiVietRequest);
                    setResult(99);
                    finish();
                    runOnUiThread(() -> {
                        // Xử lý kết quả từ API (thông báo thành công)
                        Toast.makeText(getApplicationContext(), "Bài viết đã được thêm thành công!", Toast.LENGTH_SHORT).show();


                    });
                } catch (IOException e) {
                    runOnUiThread(() -> {
                        // Xử lý lỗi
                        Toast.makeText(getApplicationContext(), "Có lỗi khi thêm bài viết!", Toast.LENGTH_SHORT).show();
                    });
                }
            }).start();
        });
        }
}