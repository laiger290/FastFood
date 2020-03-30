package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        ImageView image = findViewById(R.id.imageViewsandwich);
        TextView textView = findViewById(R.id.textViewnombre);
        TextView textView2 = findViewById(R.id.textViewdescripcion);
        TextView textView3 = findViewById(R.id.textViewprecio);

        image.setImageResource(getIntent().getIntExtra("image",0));
        textView.setText(getIntent().getStringExtra("nombre"));
        textView2.setText(getIntent().getStringExtra("descripcion"));
        textView3.setText(getIntent().getStringExtra("precio"));

    }
}
