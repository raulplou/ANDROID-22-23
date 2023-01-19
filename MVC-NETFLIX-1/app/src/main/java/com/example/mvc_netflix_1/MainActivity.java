package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.controller.UserController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.model.pojo.User;

public class MainActivity extends AppCompatActivity {
    private MainActivity view;
    private StudentController controller;
    private StudentWS model;
    private UserWS modelUser;
    private UserController controllerUser;
    private Button btn;
    private EditText edtText1;
    private EditText edtText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGAR VIEW
        view = this;
        //CARGAR MODEL
        //MODEL + VIEW
        controller = new StudentController(model, view);
        controllerUser = new UserController(modelUser, view);
        //CASO DE USO -> OBTENER ESTUDIANTE
        controller.getStudent();
        controllerUser.getUser();
        btn = (Button) findViewById(R.id.btnEnviar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EmailNuevo = edtText1.getText().toString();
                String PasswordNueva = edtText2.getText().toString();

                modelUser.getUser(EmailNuevo, PasswordNueva);
                printUserDetails(modelUser.getUser(EmailNuevo, PasswordNueva));
            }
        });
    }

    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME", student.getName());
        Log.d("MainActivity - SURNAME",student.getSurname());
    }

    public void printUserDetails(User user){
        EditText em = (EditText) findViewById(R.id.edtText1);
        em.setText(user.getEmail());
        EditText pass = (EditText) findViewById(R.id.edtText2);
        pass.setText(user.getPassword());
    }
}