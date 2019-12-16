package com.example.uas72170170;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mahasiswa extends AppCompatActivity implements View.OnClickListener{
    EditText editNama, editNim, editAlamat, editEmail;
    Button buttonSubmit;

    String textNama, textNIM, textAlamat, textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        editNama = findViewById(R.id.editText5);
        editNim = findViewById(R.id.editText4);
        editAlamat = findViewById(R.id.editText2);
        editEmail = findViewById(R.id.editText6);
        buttonSubmit = findViewById(R.id.button);
        buttonSubmit.setOnClickListener(this);

    }
    public void onClick(View view){
        validasiData();
    }
    public void validasiData(){
        textEmail = editEmail.getText().toString();
        textNama  = editNama.getText().toString();
        textAlamat = editAlamat.getText().toString();

        if(TextUtils.isEmpty(textNama)){
            editNama.setError("Nama tidak boleh Kosong");
        }
        if
        (TextUtils.isEmpty(textEmail)){
            editEmail.setError("Email tidak boleh kosong");

        }
        if(TextUtils.isEmpty(textNIM)) {
            editNim.setError("NIM tidak boleh kosong!");
        }
    }
}
