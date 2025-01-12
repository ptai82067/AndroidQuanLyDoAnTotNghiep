package vn.edu.taipp.projectfinalexam.tabbed_navigation;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import vn.edu.taipp.projectfinalexam.R;
import vn.edu.taipp.projectfinalexam.controller.SubActivity;
import vn.edu.taipp.projectfinalexam.model_dto.LoginResponse;
import vn.edu.taipp.projectfinalexam.model_dto.UserDetails;
import vn.edu.taipp.projectfinalexam.utils.ApiService;
import vn.edu.taipp.projectfinalexam.utils.LoginHandler;

public class LoginTabFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText edtUsername, edtPassword;
    private Button btnLogin;
    private TextView tvErrorMessage;
    private ApiService apiService;
    private String mParam1;
    private String mParam2;
    public LoginTabFragment() {
        // Required empty public constructor
    }

    public static LoginTabFragment newInstance(String param1, String param2) {
        LoginTabFragment fragment = new LoginTabFragment();
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
        View view = inflater.inflate(R.layout.fragment_login_tab, container, false);

        edtUsername = view.findViewById(R.id.edt_username);
        edtPassword = view.findViewById(R.id.edt_password);
        btnLogin = view.findViewById(R.id.btn_login);
        tvErrorMessage = view.findViewById(R.id.tv_error_message);

        // Đặt sự kiện click cho nút đăng nhập
        btnLogin.setOnClickListener(v -> {
            String username = edtUsername.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                tvErrorMessage.setText("Vui lòng điền đầy đủ thông tin!");
                tvErrorMessage.setVisibility(View.VISIBLE);
            } else {
                tvErrorMessage.setVisibility(View.GONE);
                login(username, password);
            }
        });

        return view;
    }

    private void login(String username, String password) {

        LoginHandler loginHandler = new LoginHandler(requireContext());



        loginHandler.login(username, password, new LoginHandler.LoginCallback() {
            @Override
            public void onSuccess(LoginResponse response) {
                SharedPreferences sharedPreferences = requireContext().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                    UserDetails userDetails = response.getUserDetails();
                    editor.putString("HoTen", userDetails.getHoTen());
                    editor.putString("Email", userDetails.getEmail());
                    editor.putInt("Id", userDetails.getMaGiangVien());



                editor.putString("Role", response.getRole());
                editor.putInt("UserId", response.getUserId());

                // Đừng quên gọi apply() để lưu lại dữ liệu
                editor.apply();


                // Chuyển sang màn hình tiếp theo
                Intent myIntent = new Intent(requireActivity(), SubActivity.class);
                startActivity(myIntent);
            }

            @Override
            public void onFailure(String errorMessage) {
                // Hiển thị lỗi khi đăng nhập thất bại
                tvErrorMessage.setText(errorMessage);
                tvErrorMessage.setVisibility(View.VISIBLE);
            }
        });

    }
}
