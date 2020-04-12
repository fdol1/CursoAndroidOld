package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast, btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btn_toast);
        btnSnackBar = findViewById(R.id.btn_snackBar);

        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_toast){
            Toast.makeText(this,"Botón de mensaje tipo TOAST",Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.btn_snackBar){
            Snackbar.make(v,"Botón de mensaje tipo SNACKBAR",Snackbar.LENGTH_SHORT).show();
        }
    }
}
