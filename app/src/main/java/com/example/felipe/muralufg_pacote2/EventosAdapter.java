package com.example.felipe.muralufg_pacote2;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.felipe.muralufg_pacote2.R;
import com.example.felipe.muralufg_pacote2.model.Evento;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.EventosViewHolder> {

    private List<Evento> eventos;

    public EventosAdapter(List<Evento> eventos){
        this.eventos = eventos;
    }

    @Override
    public EventosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_evento, viewGroup, false);
        EventosViewHolder pvh = new EventosViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(EventosViewHolder holder, final int position) {
        holder.eventoId.setText(eventos.get(position).getId());
        holder.eventoNome.setText(eventos.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return eventos.size();
    }

    public static class EventosViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView eventoId;
        TextView eventoNome;

        EventosViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card);
            eventoId = (TextView)itemView.findViewById(R.id.eventoId);
            eventoNome = (TextView)itemView.findViewById(R.id.eventoNome);
        }
    }

    public void remove(int position) {
        eventos.remove(position);
        notifyDataSetChanged();
        notifyItemRemoved(position);
    }

    public void add(int position, Evento evento) {
        eventos.add(position, evento);
        notifyDataSetChanged();
    }

}
