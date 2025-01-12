package vn.edu.taipp.projectfinalexam.controller;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiViet;
import vn.edu.taipp.projectfinalexam.model_dto.BinhLuan;
import vn.edu.taipp.projectfinalexam.utils.Service;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new FragmentCn1()).commit();
        }
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            if(item.getItemId()==R.id.nav_home){
                selectedFragment = new FragmentCn1();
            } else if (item.getItemId()==R.id.nav_recy) {
                selectedFragment = new FragmentBaiVietGiangVien();
            }else if (item.getItemId()==R.id.nav_vp2) {
                selectedFragment = new FragmentCn3();
            }else {
                selectedFragment = new FragmentCn4();

            }
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFragment).commit();
            }
            return true;
        });
        try {
            Service service = new Service();
            service.getBinhLuanList(new Service.ServiceCallback<List<BinhLuan>>() {
                @Override
                public void onSuccess(List<BinhLuan> binhLuanList) {
                }

                @Override
                public void onFailure(String error) {
                    // Xử lý lỗi khi gọi API
                    System.err.println("Error: " + error);
                }
            });

            service.getBaiVietList(new Service.ServiceCallback<List<BaiViet>>() {
                @Override
                public void onSuccess(List<BaiViet> baiVietList) {
                }

                @Override
                public void onFailure(String error) {
                    // Xử lý lỗi khi gọi API
                    System.err.println("Error: " + error);
                }
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}