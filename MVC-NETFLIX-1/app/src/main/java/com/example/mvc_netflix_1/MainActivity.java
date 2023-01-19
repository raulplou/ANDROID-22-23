package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.controller.UserController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.model.pojo.User;

public class MainActivity extends AppCompatActivity {
    private UserController controller;
    private MainActivity view;
    //private StudentWS model;
    private UserWS model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGAR VIEW
        view = this;
        //CARGAR MODEL

        //MODEL + VIEW
        controller = new UserController(model, view);
        //CASO DE USO -> OBTENER ESTUDIANTE
        controller.getUser();
    }

    public void printUserDetails(User user){
        Log.d("MainActivity - EMAIL", user.getEmail());
        Log.d("MainActivity - PASSWORD",user.getPassword());
    }
}