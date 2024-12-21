package vn.edu.taipp.projectfinalexam.controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.model_dto.SinhVien;
import vn.edu.taipp.projectfinalexam.utils.Service;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCn2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCn2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<String> data = new ArrayList<>();
    List<String> title = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCn2() {
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
    public static FragmentCn2 newInstance(String param1, String param2) {
        FragmentCn2 fragment = new FragmentCn2();
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
        View view = inflater.inflate(R.layout.fragment_cn2, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        MyAdapter adapter = new MyAdapter(data,title);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        try {
            Service service = new Service();
            service.getSinhVienList(new Service.ServiceCallback<List<SinhVien>>() {
                @Override
                public void onSuccess(List<SinhVien> sinhVienList) {
                        for (SinhVien i : sinhVienList) {
                            data.add(String.valueOf(i.getId()));
                            title.add(i.getHoTen());
                        }
                        adapter.notifyDataSetChanged();

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





        return view;
    }
}