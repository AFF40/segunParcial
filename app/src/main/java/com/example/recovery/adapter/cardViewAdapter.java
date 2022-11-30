package com.example.recovery.adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recovery.R;
import com.example.recovery.model.Image;

import java.util.ArrayList;


public class cardViewAdapter extends RecyclerView.Adapter <cardViewAdapter.CardViewHolder> {

    //lista de imagenes
    private ArrayList<Image> images;
    private int resource;
    private Activity activity;
    public cardViewAdapter(ArrayList<android.media.Image> Images, int resource, Activity activity){
        this.images = images;
        this.resource=resource;
        this.activity=activity;
    }
//error
    public cardViewAdapter(ArrayList<Image> buildImage, int cardview_image, FragmentActivity activity) {
    }
//error
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Image image = images.get(position);
        //images
        holder.usernameCardView.setText(image.getUsername());
        holder.cantidaddias.setText(image.getCantidadDias());
        holder.cantidadMegusta.setText(image.getCantidadMegusta());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class CardViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imageCardView;
        private TextView usernameCardView;
        private TextView cantidaddias;
        private TextView cantidadMegusta;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCardView = itemView.findViewById(R.id.imageCardView);
            usernameCardView = itemView.findViewById(R.id.usernameCardView);
            cantidaddias = itemView.findViewById(R.id.cantidaDiasCardView);
            cantidadMegusta = itemView.findViewById(R.id.cantidaMegustaCardView);


        }
    }
}
