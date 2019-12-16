package com.example.uas72170170;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dosen extends AppCompatActivity implements View.OnClickListener{
    EditText editNama, editNidn, editAlamat, editEmail, editGelar;
    Button buttonSubmit;

    String textNama, textNIDN, textAlamat, textEmail, textGelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);

        editNama = findViewById(R.id.editText5);
        editNidn = findViewById(R.id.editText4);
        editAlamat = findViewById(R.id.editText2);
        editEmail = findViewById(R.id.editText6);
        editGelar = findViewById(R.id.editText7);
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
        textGelar = editGelar.getText().toString();
        textNIDN = editNidn.getText().toString();

        if(TextUtils.isEmpty(textNama)){
            editNama.setError("Nama tidak boleh Kosong");
        }
        if
        (TextUtils.isEmpty(textEmail)){
            editEmail.setError("Email tidak boleh kosong");

        }
        if(TextUtils.isEmpty(textNIDN)) {
            editNidn.setError("NiDN tidak boleh kosong!");
        }
    }
}
