package com.example.mvp_netflix_01.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp_netflix_01.R;
import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.User;
import com.example.mvp_netflix_01.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{
    private EditText edtUserLogin;
    private EditText edtPasswordLogin;
    private Button btnLogin;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initPresenter();
    }

    private void initComponents(){
        edtUserLogin = findViewById(R.id.edtUserLogin);
        edtPasswordLogin = findViewById(R.id.edtPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void initPresenter(){
        loginPresenter = new LoginPresenter();
        loginPresenter.listFilms(null);
    }

    @Override
    public void successLogin(User user, String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failureLogin(String err) {
        Toast.makeText(this,err, Toast.LENGTH_SHORT).show();
    }
}