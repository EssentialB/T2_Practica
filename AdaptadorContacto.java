package com.example.t2.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t2.R;
import com.example.t2.Entidades.Contacto;

import java.util.List;

public class AdaptadorContacto extends RecyclerView.Adapter<AdaptadorContacto.ContactViewHolder> {

    List<Contacto> Contactos;
    public AdaptadorContacto(List<Contacto> Contactos){
        this.Contactos = Contactos;
    }
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto, parent, false);
        return new ContactViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder vh, int position) {
        Contacto Contacto = Contactos.get(position);
        TextView NombreContactotV = vh.itemView.findViewById(R.id.NombreContactotv);
        TextView NumeroContactotV = vh.itemView.findViewById(R.id.NumeroContactotv);
        NombreContactotV.setText(Contacto.Nombre);
        NumeroContactotV.setText(Contacto.Numero);
    }

    @Override
    public int getItemCount() {
        return Contactos.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}


