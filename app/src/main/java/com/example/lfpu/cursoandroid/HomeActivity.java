package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    ListView lstLista;
    List<String> lstAndroidVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle bundle = getIntent().getExtras();
        setTitle(bundle.getString("email"));

        lstLista = findViewById(R.id.lst_lista);

        lstAndroidVersion = new ArrayList<>();
        lstAndroidVersion.add("hola");
        lstAndroidVersion.add("mundo");
        lstAndroidVersion.add("android");
        lstAndroidVersion.add("java");

        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this,android.R.layout.simple_list_item_1,lstAndroidVersion);

        lstLista.setAdapter(arrayAdapter);

    }
}
