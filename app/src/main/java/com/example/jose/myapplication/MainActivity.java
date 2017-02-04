package com.example.jose.myapplication;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        EditText editUsername = (EditText) findViewById(R.id.edit_username);
        String username = editUsername.getText().toString();

        EditText editPassword= (EditText) findViewById(R.id.edit_password);
        String password = editPassword.getText().toString();

        if("sebba".equals(username) && "123456".equals(password)){
            Log.d("LOGIN", "DEU CERTO");
            showMessage("Welcome to Portal UFG");
        }

        else
            Log.d("LOGIN", "DEU RUIM");

    }

    private void showMessage(String message){
        Snackbar.make(findViewById(R.id.activity_main),message,Snackbar.LENGTH_LONG).show();
    }
}
