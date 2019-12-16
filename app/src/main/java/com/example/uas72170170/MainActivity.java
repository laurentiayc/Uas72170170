package com.example.uas72170170;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();

        Button btnSignIn = (Button) findViewById(R.id.btnDosen);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dosen.class);
                startActivity(intent);
            }
        });

        Button btnSignDosen = (Button)findViewById(R.id.btnMhs);
        btnSignDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Mahasiswa.class);
                startActivity(intent);
            }
        });
    }
}