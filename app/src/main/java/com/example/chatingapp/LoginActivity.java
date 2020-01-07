package com.example.chatingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity{
    Button btn_inter;
    TextInputEditText input_id;
    String id;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        input_id = findViewById(R.id.input_id);
        btn_inter = findViewById(R.id.btn_inter_click);


        btn_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = input_id.getText().toString();
                intent = new Intent(LoginActivity.this , ChatActivity.class);
                intent.putExtra("name",id);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        id = input_id.getText().toString();
    }
}
