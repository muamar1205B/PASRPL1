package com.example.pasrpl1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter <ListAdapter.ListviewHolder> {
   private ArrayList<Club> listClub;
    public ListAdapter(ArrayList<Club> list ){
       this.listClub = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_club,parent,false);
     return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewHolder holder, int position) {
    Club club = listClub.get(position);
    Glide.with(holder.itemView.getContext())
    .load(club.getFoto())
    .apply(new RequestOptions().override(55,55))
    .into(holder.imgPhoto);
    holder.tvName.setText(club.getName());
    holder.tvDetail.setText(club.getDetail());

    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

     class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

         ListviewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_club);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);


         }
    }
}
