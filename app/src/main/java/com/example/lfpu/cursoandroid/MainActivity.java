package com.example.lfpu.cursoandroid;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    Boolean modoDia = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Carga del fragmento por defecto
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new FragmentModoDia())
                .commit();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                Fragment fragment = null;
                if(modoDia){
                    fragment = new FragmentModoNoche();
                }else{
                    fragment = new FragmentModoDia();
                }

                modoDia = !modoDia;

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, fragment)
                        .commit();
            }
        });
    }

}
