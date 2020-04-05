package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnIniciar;
    TextView edtUsuario, edtClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btn_iniciar);
        edtUsuario = findViewById(R.id.edt_usuario);
        edtClave = findViewById(R.id.edt_clave);

        btnIniciar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("APP","on click");
        String email = edtUsuario.getText().toString();
        String clave = edtClave.getText().toString();
        if(!email.isEmpty() && !clave.isEmpty()){
            Intent intentLogin = new Intent(this,HomeActivity.class);
            intentLogin.putExtra("email",email);
            startActivity(intentLogin);
        }
    }
}
