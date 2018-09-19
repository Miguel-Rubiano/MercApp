package com.example.pacho.mercapp.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pacho.mercapp.Adaptadores.Entidades.Productos;
import com.example.pacho.mercapp.R;

import java.util.List;

public class ListaProductosAdapter extends RecyclerView.Adapter<ListaProductosAdapter.ProductosHolder> {
    List<Productos> listaProductos;

    @NonNull
    @Override
    public ProductosHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductosHolder productosHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductosHolder extends RecyclerView.ViewHolder {

        ImageView imgPro;
        TextView txtNom,txtPre,txtPes,txtExi;

        public ProductosHolder(@NonNull View itemView) {
            super(itemView);

            txtNom = (EditText) itemView.findViewById(R.id.txt_nom_pro);
            txtPre = (EditText) itemView.findViewById(R.id.txt_pre_pro);
            txtPes = (EditText) itemView.findViewById(R.id.txt_pes_pro);
            txtExi = (EditText) itemView.findViewById(R.id.txt_exi_pro);
        }
    }
}
