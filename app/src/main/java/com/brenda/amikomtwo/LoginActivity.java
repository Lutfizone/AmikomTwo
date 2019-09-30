package com.brenda.amikomtwo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EdtNim;
    EditText EdtPass;
    Button   btnlogin;
    String nim = "17.11.0953";
    String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.e("onCrate","mulai");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtNim = findViewById(R.id.EdtNim);
        EdtPass = findViewById(R.id.EdtPass);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        Log.e("onCrate","selesai");
    }

    @Override
    public void onClick(View view) {
        Log.e("onCreate","Mulai");
        if(nim.equals(EdtNim.getText().toString())
            && password.equals(EdtPass.getText().toString())){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this,"Login Gagal",Toast.LENGTH_SHORT).show();
        }
        Log.e("onCreate", "Selesai");
    }

    @Override
    protected void onStart(){
        Log.e("onStart","Mulai");
        super.onStart();
        Log.e("onStart","Selesai");
    }

    @Override
    protected void onRestart(){
        Log.e("onRestart", "Mulai");
        super.onRestart();
        Log.e("onRestart","Selesai");
    }

    @Override
    protected void onResume(){
        Log.e("onResume","Mulai");
        super.onResume();
        Log.e("onResume","Selesai");
    }

    @Override
    protected void onStop(){
        Log.e("onStop","Mulai");
        super.onStop();
        Log.e("onStop","Selesai");
    }

    @Override
    protected void onDestroy(){
        Log.e("onDestroy","Mulai");
        super.onDestroy();
        Log.e("onDestroy","Selesai");
    }
}
