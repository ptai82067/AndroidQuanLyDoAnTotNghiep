package vn.edu.taipp.projectfinalexam.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import vn.edu.taipp.projectfinalexam.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCn4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCn4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCn4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCn4.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCn4 newInstance(String param1, String param2) {
        FragmentCn4 fragment = new FragmentCn4();
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
        View view = inflater.inflate(R.layout.fragment_cn4, container, false);
        // Lấy SharedPreferences
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);

// Truy xuất các giá trị đã lưu
        String hoTen = sharedPreferences.getString("HoTen", ""); // Giá trị mặc định là ""
        String email = sharedPreferences.getString("Email", ""); // Giá trị mặc định là ""
        int id = sharedPreferences.getInt("Id", 0); // Giá trị mặc định là ""
        String role = sharedPreferences.getString("Role", ""); // Giá trị mặc định là ""
        int userId = sharedPreferences.getInt("UserId", -1); // Giá trị mặc định là -1 nếu không tìm thấy

// Sử dụng thông tin đã lấy
        Toast.makeText(getContext(), role + "--"+id, Toast.LENGTH_SHORT).show();
        return view;
    }
}