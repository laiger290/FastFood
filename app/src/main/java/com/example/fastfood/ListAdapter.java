package com.example.fastfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<objeto> {
    private List<objeto> mdatos;
    private Context mContext;
    private int resoureLayout;
    public ListAdapter(@NonNull Context context, int resource,List<objeto> objects) {
        super(context, resource, objects);
        this.mdatos = objects;
        this.mContext = context;
        this.resoureLayout = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(resoureLayout, null);

        }
        objeto objeto1 = mdatos.get(position);
        ImageView imagen = view.findViewById(R.id.imageView);
        imagen.setImageResource(objeto1.getIdentificador());


        TextView bottom = view.findViewById(R.id.bottom5);
        bottom.setText(objeto1.getNombre());

        return view;
    }

}
