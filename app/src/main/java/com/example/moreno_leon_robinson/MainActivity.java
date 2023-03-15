package com.example.moreno_leon_robinson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private  ArrayList<producto> listadoprincipalp;
    private RecyclerView listado_productos;

     private ArrayList<producto> listaprincipalproductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        listado_productos = findViewById(R.id.listado_producto);

        AdaptadorPersonalizado miadaptador = new AdaptadorPersonalizado(listaprincipalproductos);

        listado_productos.setAdapter(miadaptador);
        listado_productos.setLayoutManager(new LinearLayoutManager(this));
    }
    public  void  cargarDatos(){
        producto producto1 = new producto();
        producto1.setNombre("computador hp");
        producto1.setPrecio(500000.0);
        producto1.setUrlimagen("https://image.pngaaa.com/699/1149699-middle.png");



        producto producto2 = new producto("teclado DEll",20000.0,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fes%2Ffree-png-tqrvo&psig=AOvVaw1Jq5s_3rraEkjsJmAGhwAi&ust=1678917157695000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCKCH3viz3P0CFQAAAAAdAAAAABAD");
        producto producto3 = new producto("mause",1000.0,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngegg.com%2Fes%2Fpng-efbyj&psig=AOvVaw38zi3uTJLu2Prw0j1UHcf9&ust=1678917270730000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCNi8r6603P0CFQAAAAAdAAAAABAG");

        listaprincipalproductos = new ArrayList<>();
        listaprincipalproductos.add(producto1);
        listaprincipalproductos.add(producto2);
        listaprincipalproductos.add(producto3);
    }
}