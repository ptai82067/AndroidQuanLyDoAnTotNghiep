package vn.edu.taipp.projectfinalexam.controller;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.BaiViet;
import vn.edu.taipp.projectfinalexam.model_dto.BinhLuan;
import vn.edu.taipp.projectfinalexam.utils.Service;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BaiVietDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class BaiVietDetailFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    List<BinhLuan> allComments = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BaiVietDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BaiVietDetailFragment newInstance(String param1, String param2, int param3) {
        BaiVietDetailFragment fragment = new BaiVietDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    public BaiVietDetailFragment() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_bai_viet_detail, container, false);

        // Nhận dữ liệu từ arguments
        String tieude = getArguments().getString(ARG_PARAM1);
        String content = getArguments().getString(ARG_PARAM2);
        int maBaiViet  = getArguments().getInt(ARG_PARAM3);

        // Hiển thị dữ liệu
        TextView tvTieuDe = view.findViewById(R.id.tv_tieude);
        TextView tvNoiDung = view.findViewById(R.id.tv_noidung);
        tvTieuDe.setText(tieude);
        tvNoiDung.setText(content);

        // TODO: Thêm danh sách bình luận vào RecyclerView
        // Danh sách bình luận
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_binh_luan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<BinhLuan> binhLuanList = getCommentsForPost(maBaiViet); // Lấy bình luận theo mã bài viết
        BinhLuanAdapter adapter = new BinhLuanAdapter(binhLuanList);
        recyclerView.setAdapter(adapter);
        return view;

    }


    public List<BinhLuan> getCommentsForPost(int maBaiViet) {
        // Dữ liệu mẫu

        try {
            Service service = new Service();
            service.getBinhLuanList(new Service.ServiceCallback<List<BinhLuan>>() {
                @Override
                public void onSuccess(List<BinhLuan> binhLuanList) {
                    allComments = binhLuanList;
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

        // Lọc bình luận cho bài viết
        return allComments.stream()
                .filter(bl -> bl.getBaiViet().getMaBaiViet() == maBaiViet)
                .collect(Collectors.toList());
    }

}