package com.example.asus.photo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.firebase.storage.UploadTask;

import java.util.List;

/**
 * Created by Asus on 22-Apr-18.
 */

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.imageViewHolder> {

    private Context mContext;
    private List<UploadTask> mUpload;


    public imageAdapter(Context context,List<UploadTask> Uploads){

        mContext=context;
        mUpload=Uploads;


    }

    @Override
    public imageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.image_item,parent,false);
        return new imageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(imageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
         //  View v= LayoutInflater.from(mContext).inflate(R.layout.image_item,parent,false);
       return mUpload.size();
    }

    public  class imageViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;


        public imageViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view_upload);

        }
    }
}
