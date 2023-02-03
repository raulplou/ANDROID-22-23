package com.example.skill4parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity6 extends AppCompatActivity {

    private static final String TAG = "Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Log.i("info", "Valor Información");
        Log.d("Debug", "Valor Debug");
        Log.w("Warning", "Valor Warning");
        Log.e("Error", "Valor Error");
        Log.v("Verbose", "Valor Verbose");

        Log.i(TAG, "Mensaje Seguimiento 1");
        Log.i(TAG, "Mensaje Seguimiento 2");
        Log.i(TAG, "Mensaje Seguimiento 3");
        Log.i(TAG, "Mensaje Seguimiento 4");
        Log.i(TAG, "Mensaje Seguimiento 5");

    }
}