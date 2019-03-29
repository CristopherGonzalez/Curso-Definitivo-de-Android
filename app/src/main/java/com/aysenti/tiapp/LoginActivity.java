package com.aysenti.tiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aysenti.tiapp.view.RegisterAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        //Puede ser igual LoginActivity.this en el primer parametro
        Intent intent = new Intent(this, RegisterAccountActivity.class);
        startActivity(intent);
    }
}
