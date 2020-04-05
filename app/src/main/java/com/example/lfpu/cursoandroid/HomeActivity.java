package com.example.lfpu.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

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
        lstAndroidVersion.add("Pie");
        lstAndroidVersion.add("Oreo");
        lstAndroidVersion.add("Lollipop");

        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this,android.R.layout.simple_list_item_1,lstAndroidVersion);

        lstLista.setAdapter(arrayAdapter);

        lstLista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("APP",lstAndroidVersion.get(position));
    }
}
