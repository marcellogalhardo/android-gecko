package br.com.backapp.gecko.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import br.com.backapp.gecko.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class GameListActivity extends ActionBarActivity {

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

    }

}
