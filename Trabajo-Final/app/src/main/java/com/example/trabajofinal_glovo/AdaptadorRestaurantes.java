package com.example.trabajofinal_glovo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajofinal_glovo.entities.Restaurantes;

import java.util.ArrayList;

public class AdaptadorRestaurantes extends RecyclerView.Adapter<AdaptadorRestaurantes.ViewHolderRestaurantes> implements View.OnClickListener {

    ArrayList<Restaurantes> listaRestaurantes;
    private View.OnClickListener listener;

    public AdaptadorRestaurantes(ArrayList<Restaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @Override
    public ViewHolderRestaurantes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_restaurantes,null,false);
        view.setOnClickListener(this);
        return new ViewHolderRestaurantes(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderRestaurantes holder, int position) {
        holder.etiNombre.setText(listaRestaurantes.get(position).getNombreRestaurante());
        holder.etiCategoria.setText(listaRestaurantes.get(position).getCategoria());
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null){
            listener.onClick(view);
        }
    }

    public class ViewHolderRestaurantes extends RecyclerView.ViewHolder {

        TextView etiNombre,etiCategoria;

        public ViewHolderRestaurantes(View itemView) {
            super(itemView);
            etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etiCategoria = (TextView) itemView.findViewById(R.id.idCategoria);
        }
    }
}
