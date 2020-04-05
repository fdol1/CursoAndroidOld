package com.example.lfpu.cursoandroid;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    //Recibe por parametro es el contexto, es decir la referencia a la activity
    //donde a sido insetado el fragmento
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("CicloVida","Fragment onAttach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("CicloVida","Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
