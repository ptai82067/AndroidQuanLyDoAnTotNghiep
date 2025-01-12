package vn.edu.taipp.projectfinalexam.controller;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiViet;
import vn.edu.taipp.projectfinalexam.model_dto.SinhVien;
import vn.edu.taipp.projectfinalexam.utils.Service;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentBaiViet#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBaiViet extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<String> gvs = new ArrayList<>();
    List<String> tieudes = new ArrayList<>();
    List<String> dates = new ArrayList<>();
    List<String> contents = new ArrayList<>();
    List<Integer> listID = new ArrayList<>();
    MyAdapter adapter;
    private ImageButton btnThemBaiViet;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentBaiViet() {
        // Required empty public constructor
    }
    int imgArray[] = {R.drawable.cn2,R.drawable.cn2,R.drawable.cn2,R.drawable.cn2};
    /**
     * Use this factory method to create a new instance of
     * this fragment using thie provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCn2.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentBaiViet newInstance(String param1, String param2) {
        FragmentBaiViet fragment = new FragmentBaiViet();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_baiviet, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new MyAdapter(gvs,dates,tieudes,contents);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        try {
            Service service = new Service();
            service.getBaiVietList(new Service.ServiceCallback<List<BaiViet>>() {
                @Override
                public void onSuccess(List<BaiViet> baiVietList) {
                    gvs.clear();
                    tieudes.clear();
                    dates.clear();
                    contents.clear();
                    listID.clear();
                    loadBaiVietData();

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
        adapter.setOnItemClickListener(position -> {
            // Lấy thông tin bài viết tại vị trí được nhấn
            String tieude = tieudes.get(position);
            String content = contents.get(position);
            int id = listID.get(position);
            // Truyền thông tin sang Fragment/Activity chi tiết bài viết
            BaiVietDetailFragment detailFragment = BaiVietDetailFragment.newInstance(tieude, content,id);
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, detailFragment)
                    .addToBackStack(null) // Cho phép quay lại
                    .commit();
        });
        btnThemBaiViet = view.findViewById(R.id.btnThemBaiViet);
        btnThemBaiViet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getContext(),ThemBaiViet.class);
                startActivityForResult(myIntent, 1);
            }
        });
        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 99) {
            // Gọi lại API để lấy danh sách bài viết mới và cập nhật
            gvs.clear();
            tieudes.clear();
            dates.clear();
            contents.clear();
            listID.clear();
            loadBaiVietData();
        }
    }

    private void loadBaiVietData() {
        Service service = new Service();
        service.getBaiVietList(new Service.ServiceCallback<List<BaiViet>>() {
            @Override
            public void onSuccess(List<BaiViet> baiVietList) {
                for (BaiViet i : baiVietList) {
                    gvs.add(i.getGiang_vien().getHoTen());
                    dates.add(i.getNgayTao());
                    tieudes.add(i.getTieuDe());
                    contents.add(i.getNoiDung());
                    listID.add(i.getId());
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(String error) {
                System.err.println("Error: " + error);
            }
        });
    }

}