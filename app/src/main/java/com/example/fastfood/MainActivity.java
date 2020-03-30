package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void primera_pantalla(View v){
        Intent intent = new Intent(this,Sandwish.class);
        startActivity(intent);
    }

    public void segunda_pantalla(View v){
        Intent intent = new Intent(this,Nosotros.class);
        startActivity(intent);
    }
}
