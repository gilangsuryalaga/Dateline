package com.example.dateline;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapterList extends RecyclerView.Adapter<RecyclerViewAdapterList.MyViewHolder> {
    Context mContext;
    List<ListContent> mList;
    Dialog mDialog;

    public RecyclerViewAdapterList(Context mContext, List<ListContent> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_content;
        private TextView tvJudul;
        private TextView tvHarga;
        private ImageView ivAlbum;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            item_content = (LinearLayout)itemView.findViewById(R.id.content_item_id);
            ivAlbum = (ImageView) itemView.findViewById(R.id.iv_album);
            tvHarga = (TextView) itemView.findViewById(R.id.tv_harga);
            tvJudul = (TextView) itemView.findViewById(R.id.tv_judul);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapterList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_list,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        mDialog = new Dialog( mContext );
        mDialog.setContentView(R.layout.dialog_content);
        mDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );

        vHolder.item_content.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView dialog_judul = (TextView) mDialog.findViewById( R.id.tv_dialog_judul );
                TextView dialog_harga = (TextView) mDialog.findViewById( R.id.tv_dialog_harga );
                ImageView iv_dialog= (ImageView)mDialog.findViewById( R.id.iv_dialog );
                iv_dialog.setImageResource(mList.get(vHolder.getAdapterPosition()).getPhoto());
                dialog_harga.setText( mList.get( vHolder.getAdapterPosition()).getHarga());
                dialog_judul.setText( mList.get( vHolder.getAdapterPosition()).getJudul());

                Toast.makeText( mContext,"Test Click" + String.valueOf( vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                mDialog.show();
            }
        } );
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterList.MyViewHolder holder, int position) {

        holder.tvJudul.setText(mList.get(position).getJudul());
        holder.tvHarga.setText(mList.get(position).getHarga());
        holder.ivAlbum.setImageResource(mList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}