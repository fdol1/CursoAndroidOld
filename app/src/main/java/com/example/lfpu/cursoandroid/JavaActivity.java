package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JavaActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn_1);

        btn1.setOnClickListener( view -> {
            Toast.makeText(this, "click en boton", Toast.LENGTH_LONG).show();
        });

        TextView txt2 = findViewById(R.id.edt_texto);
        txt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"click en el texto", Toast.LENGTH_LONG).show();
    }
}
