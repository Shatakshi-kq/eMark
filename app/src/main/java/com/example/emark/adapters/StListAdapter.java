package com.example.emark.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.emark.R;
import com.example.emark.lib.models.Users;

import java.util.List;

public class StListAdapter extends RecyclerView.Adapter<StListAdapter.ViewHolder> {
    Context context;
    List<Users> stList;

    public StListAdapter(Context context, List<Users> stList) {
        this.context = context;
        this.stList = stList;
    }

    @NonNull
    @Override
    public StListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.stlistitem, parent ,false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StListAdapter.ViewHolder holder, int position) {
       holder.name.setText(stList.get(position).getName());
       holder.status.setText("Active");
       Glide.with(context).load(stList.get(position).getImgUrl()).into(holder.dp);
    }

    @Override
    public int getItemCount() {
        return stList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name , status;
        View parentView;
        ImageView dp;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            this.parentView = itemView;
            this.name = itemView.findViewById(R.id.name);
            this.status = itemView.findViewById(R.id.status);
            this.dp = itemView.findViewById(R.id.dp);


        }
    }

}
