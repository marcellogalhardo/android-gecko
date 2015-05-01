package br.com.backapp.gecko.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import br.com.backapp.gecko.R;
import br.com.backapp.gecko.ui.adapters.GameListAdapter;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class GameListActivity extends ActionBarActivity {

    @InjectView(R.id.recyclerview_game_list) RecyclerView recyclerViewGameList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
        ButterKnife.inject(this);
        if (savedInstanceState == null) {
            // TODO: Recuperar estado.
        }
        configureUi();
    }

    private void configureUi() {
        mLayoutManager = new LinearLayoutManager(this);
        recyclerViewGameList.setLayoutManager(mLayoutManager);
        mAdapter = new GameListAdapter(new String[] {"Teste", "teste2"});
        recyclerViewGameList.setAdapter(mAdapter);
    }

}
