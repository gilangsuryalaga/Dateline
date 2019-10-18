package com.example.dateline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<Content> mList;

    public RecyclerViewAdapter(Context mContext, List<Content> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvJudul;
        private TextView tvHarga;
        private ImageView ivAlbum;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivAlbum = (ImageView) itemView.findViewById(R.id.iv_album);
            tvHarga = (TextView) itemView.findViewById(R.id.tv_harga);
            tvJudul = (TextView) itemView.findViewById(R.id.tv_judul);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_home,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tvJudul.setText(mList.get(position).getJudul());
        holder.tvHarga.setText(mList.get(position).getHarga());
        holder.ivAlbum.setImageResource(mList.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
