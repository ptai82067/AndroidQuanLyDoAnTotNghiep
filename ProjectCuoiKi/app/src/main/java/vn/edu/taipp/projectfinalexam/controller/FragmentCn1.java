package vn.edu.taipp.projectfinalexam.controller;

import static android.widget.Toast.LENGTH_SHORT;

import static androidx.fragment.app.FragmentManager.TAG;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.io.IOException;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.utils.APIClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCn1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCn1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCn1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCn1.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCn1 newInstance(String param1, String param2) {
        FragmentCn1 fragment = new FragmentCn1();
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

    @SuppressLint("RestrictedApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cn1, container, false);
    }
}