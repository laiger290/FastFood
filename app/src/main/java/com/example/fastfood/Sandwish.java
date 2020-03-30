package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Sandwish extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private List<objeto> mLista = new ArrayList<>();
    ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwish);
        mListView = findViewById(R.id.listView);

        mLista.add( new objeto("PULLED PORK",R.mipmap.ic_pulledpork_foreground,"CONTIENE 200 GRAMOS DE PUERCO " +
                "100 GRAMOS DE COLESLAW, " +
                "RICA SALSA BARBECUE " + "Y TOCINO!!!","$9.990"));
        mLista.add( new objeto("AMERICANA",R.mipmap.ic_americana_foreground,"CONTIENE 200 GRAMOS DE CARNE DE TERNERA " +
                "100 GRAMOS DE LECHUGA, " +
                "AROZ DE CEBOLLA QUESO CHEDDAR " + "Y TOCINO!!!","$12.990"));
        mLista.add( new objeto("PESCADO",R.mipmap.ic_pescado_foreground,"CONTIENE 200 GRAMOS DE PESCADO " +
                "100 GRAMOS DE LECHUGA HIDROPONICA, " +
                "RICA SALSA PICANTE " + "Y QUESO COTTAGE!!!","$14.990"));
        mLista.add( new objeto("POLLO",R.mipmap.ic_pollo_foreground,"CONTIENE 200 GRAMOS DE POLLO " +
                "100 GRAMOS DE ESPINACA, " +
                "RICA SALSA DE LIMON " + "Y QUESO AZUL !!!","$5.990"));
        mLista.add( new objeto("VEGANA",R.mipmap.ic_vegana_foreground,"CONTIENE 200 GRAMOS DE HUMMUS DE GARBANZOS " +
                "100 GRAMOS DE LECHUGA, " +
                "RICA SALSA DE AJO " + "Y ALMENDRAS!!!","$15.990"));
        mAdapter = new ListAdapter(Sandwish.this,R.layout.item_row,mLista);
        mListView.setOnItemClickListener(this);
        mListView.setAdapter(mAdapter);

        //datos = (ListView) findViewById(R.id.datos);
        //ArrayList<objeto> lista = new ArrayList<objeto>();
        //lista.add(new objeto("churrasco","444","el medio shandish",5555));
        //ArrayAdapter <objeto> adapter = new ArrayAdapter<objeto>(Sandwish.this,android.R.layout.simple_list_item_1,lista);
        //datos.setAdapter(adapter);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,Final.class);
        intent.putExtra("image",mAdapter.getItem(position).getIdentificador());
        intent.putExtra("nombre",mAdapter.getItem(position).getNombre());
        intent.putExtra("descripcion",mAdapter.getItem(position).getDescripcion());
        intent.putExtra("precio",mAdapter.getItem(position).getPrecio());
        startActivity(intent);
    }
}
