package com.aysenti.tiapp.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.aysenti.tiapp.R;
import com.aysenti.tiapp.model.Picture;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PictureAdapterRecyclerView  extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{
    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity){
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource,viewGroup,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder pictureViewHolder, int i) {
        Picture picture = pictures.get(i);
        pictureViewHolder.nameCard.setText(picture.getUserName());
        pictureViewHolder.timeCard.setText(picture.getTime());
        pictureViewHolder.LikeNumberCard.setText(picture.getLike_number());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView nameCard;
        private TextView timeCard;
        private TextView LikeNumberCard;

        public PictureViewHolder(View itemView){
            super(itemView);
            pictureCard = itemView.findViewById(R.id.text_name_card);
            nameCard = itemView.findViewById(R.id.text_name_card);
            timeCard = itemView.findViewById(R.id.text_nro_dias_card);
            LikeNumberCard = itemView.findViewById(R.id.like_number_card);
        }
    }

}
