package com.example.felipe.muralufg_pacote2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.felipe.muralufg_pacote2.model.Evento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EventosActivity extends ActionBarActivity {

    EventosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        List<Evento> colors = new ArrayList();
        Date dataInicio = new Date();
        Date dataFim = new Date();
        colors.add(new Evento("1", "teste1", dataInicio, dataFim, "Teste de evento1", "Inf"));
        colors.add(new Evento("2", "teste2", dataInicio, dataFim, "Teste de evento2", "Inf"));

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        adapter = new EventosAdapter(colors);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_eventos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
