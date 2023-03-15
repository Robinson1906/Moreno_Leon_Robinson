package com.example.moreno_leon_robinson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonalizado extends  RecyclerView.Adapter<AdaptadorPersonalizado.ViewHolder> {

    private ArrayList<producto> listadoinformacion;

    public AdaptadorPersonalizado(ArrayList<producto> listadoinformacion) {
        this.listadoinformacion = listadoinformacion;
    }

    @NonNull
    @Override
    public AdaptadorPersonalizado.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View miview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_productos,parent,false);
        return new ViewHolder(miview);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPersonalizado.ViewHolder holder, int position) {

        producto miproducto = listadoinformacion.get(position);
        holder.enlazar(miproducto);

    }

    @Override
    public int getItemCount() {
        return listadoinformacion.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre,precio;
        private ImageView producto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.item_nombre);
            precio = itemView.findViewById(R.id.item_precio);
            producto = itemView.findViewById(R.id.item_img);
        }
        public  void  enlazar(producto miproducto){
            nombre.setText(miproducto.getNombre());
            precio.setText(miproducto.getPrecio().toString());

        }

    }
}