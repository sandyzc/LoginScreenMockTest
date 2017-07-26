package com.sandyz.mocktestlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Login_welcome extends AppCompatActivity {

    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_welcome);

        username= (TextView)findViewById(R.id.username);

        String user= getIntent().getExtras().getString("Email");
        username.setText(user);
    }
}
