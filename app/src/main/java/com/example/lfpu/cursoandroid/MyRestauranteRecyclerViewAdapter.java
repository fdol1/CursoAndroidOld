package com.example.lfpu.cursoandroid;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lfpu.cursoandroid.RestauranteFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Restaurante} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyRestauranteRecyclerViewAdapter extends RecyclerView.Adapter<MyRestauranteRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private final List<Restaurante> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyRestauranteRecyclerViewAdapter(Context context,List<Restaurante> items, OnListFragmentInteractionListener listener) {
        context = context;
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_restaurante, parent, false);
        return new ViewHolder(view);
    }
    //dibuja cada uno de los elementos de la lista. Se lanza las veces de la cantidad de elementos
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        //rescatamos a info del elemento que ocupa la posicion psotion
        holder.mItem = mValues.get(position);
        holder.txtTitulo.setText(holder.mItem.getNombres());
        holder.txtDireccion.setText(holder.mItem.getDireccion());
        holder.ratingBarValoracion.setRating(holder.mItem.getValoracion());

        Glide.with(context)
                .load(holder.mItem.getUrlFoto())
                .centerCrop()
                .into(holder.imgFoto);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    //Es una clase interna declara dentro de este adaptar
    //Mapea los objetos del layout, los coge y los asigna a una variable final del tipo de elemento que este sea
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView txtTitulo;
        public final TextView txtDireccion;
        public final ImageView imgFoto;
        public final RatingBar ratingBarValoracion;
        public Restaurante mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            txtTitulo = view.findViewById(R.id.txtTitulo);
            txtDireccion = view.findViewById(R.id.txt_direccion);
            imgFoto = view.findViewById(R.id.imgFoto);
            ratingBarValoracion = view.findViewById(R.id.ratingBar_valoracion);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + txtTitulo.getText() + "'";
        }
    }
}
