package com.davidgd.buscador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.UsuarioViewHolder> {

    Context context;
    List<Usuario> listaUsuarios;

    //Constructoes generados
    public AdaptadorUsuarios(Context context, List<Usuario> listaUsuarios) {
        this.context = context;
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_usuario, viewGroup, false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.tvPalabra.setText(listaUsuarios.get(i).getPalabra());
        usuarioViewHolder.tvDef.setText(listaUsuarios.get(i).getDef());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        TextView tvPalabra, tvDef;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPalabra = itemView.findViewById(R.id.tvPalabra);
            tvDef = itemView.findViewById(R.id.tvDef);
        }
    }

    public void filtrar(ArrayList<Usuario> filtroUsuarios){
        this.listaUsuarios = filtroUsuarios;
        notifyDataSetChanged();
    }
}
