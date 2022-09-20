package com.firstapp.recycler_stagger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StaggerAdapter extends RecyclerView.Adapter<StaggerAdapter.StaggerViewHolder>{

    List<StaggerPojo> staggerPojoList=new ArrayList<>();
    OnItemClick onItemClick;

    public StaggerAdapter(List<StaggerPojo> applicationContext, List<StaggerPojo> staggerPojoList, OnItemClick onItemClick) {
        this.staggerPojoList = staggerPojoList;
        this.onItemClick = onItemClick;
    }

    public StaggerAdapter(Context applicationContext, List<StaggerPojo> pojoList, List<StaggerPojo> staggerPojoList){
        this.staggerPojoList=staggerPojoList;
    }


    @NonNull
    @Override
    public StaggerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item,parent,false);

        return new StaggerViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull StaggerViewHolder holder, int position) {
        holder.imageView.setImageResource(staggerPojoList.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return staggerPojoList.size();
    }

    public class StaggerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;


        public StaggerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_View1);
        }
    }
}
