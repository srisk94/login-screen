package com.example.srima.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import static com.example.srima.loginscreen.R.id.str;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String email="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9+)*(\\.[A-Za-z]{2,})$";
         email = getString(R.id.str);
        EditText e=(EditText)findViewById(R.id.str);


    }
}
