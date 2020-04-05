package com.example.lfpu.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class KotlinActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn_1)

        btn1.setOnClickListener { view ->
            Toast.makeText(this,"Click en el boton 1", Toast.LENGTH_SHORT).show()
        }

        val txt2: TextView = findViewById(R.id.edt_texto)
        txt2.setOnClickListener(this)

        Log.i("Log_logico","Estoy en el onCreate")
    }

    fun onClicHobby(view: View) {
        val checkBox: CheckBox = view as CheckBox
        val checked: Boolean = checkBox.isChecked

        when(view.id){
            R.id.cbx_deporte -> {
                if(checked){
                    Toast.makeText(this, "Se marcó deportes", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "se desmarcó deportes", Toast.LENGTH_LONG).show()
                }

            }
            R.id.cbx_video_juego -> {
                if(checked){
                    Toast.makeText(this, "Se marcó video juegos", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "se desmarcó video juegos", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun onClicSexoSeleccionado(view: View) {

        when(view.id){
            R.id.rdbtn_hombre -> {
                Toast.makeText(this,"Se selecciono hombre",Toast.LENGTH_SHORT).show()
            }
            R.id.rdbtn_mujer -> {
                Toast.makeText(this,"Se selecciono mujer",Toast.LENGTH_SHORT).show()
            }
            R.id.rdbtn_indefinido -> {
                Toast.makeText(this,"Se selecciono indefinido",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"Click en texto 2", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Log_logico","Estoy en el onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log_logico","Estoy en el onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Log_logico","Estoy en el onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Log_logico","Estoy en el onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Log_logico","Estoy en el onDestroy")
    }
}
