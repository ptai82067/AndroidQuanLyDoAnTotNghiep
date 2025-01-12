package vn.edu.taipp.projectfinalexam.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiViet;
import vn.edu.taipp.projectfinalexam.model_dto.BinhLuan;
import vn.edu.taipp.projectfinalexam.tabbed_navigation.ViewPagerAdapter;
import vn.edu.taipp.projectfinalexam.utils.Service;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ViewPagerAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Signup"));
        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new ViewPagerAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
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

//    private void getAPI() {
//        ApiService.apiService.show("Khoa", "2")
//                .enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                        if (response.isSuccessful() && response.body() != null) {
//                            try {
//                                String json = response.body().string(); // Lấy chuỗi JSON
//                                Log.d("API_RESPONSE", "JSON: " + json); // In JSON để kiểm tra
//
//                                Khoa khoa = new Gson().fromJson(json, Khoa.class); // Parse JSON
//                                tvKhoaID.setText(String.valueOf(khoa.getId()));
//                                tvTenKhoa.setText(String.valueOf(khoa.getTenKhoa()) );
//                            } catch (IOException e) {
//                                Log.e("API_ERROR", "Lỗi đọc JSON", e);
//                            }
//                        } else {
//                            Log.e("API_ERROR", "Không có dữ liệu hoặc phản hồi không thành công");
//                            Log.d("API_STATUS", "HTTP Code: " + response.code());
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//                        Log.e("API_FAILURE", "Error: " + t.getMessage(), t);
//                    }
//                });
//    }

}