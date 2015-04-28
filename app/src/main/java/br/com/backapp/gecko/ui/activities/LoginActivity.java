package br.com.backapp.gecko.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import br.com.backapp.gecko.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class LoginActivity extends ActionBarActivity {

    @InjectView(R.id.button_login) Button buttonLogin;

    @InjectView(R.id.button_signup) Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        if (savedInstanceState == null) {
            // TODO: Recuperar estado.
        }
        configureUi();
    }

    private void configureUi() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                LoginActivity.this.startActivity(intent);
            }
        });
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                LoginActivity.this.startActivity(intent);
            }
        });
    }

}
