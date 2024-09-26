package com.alvarofernandez.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = 0;
    }


    public void funcionIncrementar(View view) {
        numero++;
        Toast.makeText(this, "Tu número ahora es: "+ numero, Toast.LENGTH_SHORT).show();
    }
}