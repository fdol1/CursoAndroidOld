package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtUsiario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle bundle = getIntent().getExtras();

        txtUsiario = findViewById(R.id.txtUsuario);
        txtUsiario.setText(bundle.getString("email"));
    }
}
