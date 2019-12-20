package com.chenyg.bottom_navigation_demo.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.chenyg.bottom_navigation_demo.R;
import com.chenyg.bottom_navigation_demo.activity.TravelSelectDetailsActivity;
import com.chenyg.bottom_navigation_demo.entity.TravelMessage;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TravelSelectAdapter extends RecyclerView.Adapter<TravelSelectAdapter.TravelSelectViewHolder>{
    Context context;

    List<TravelMessage> travelMessages = new ArrayList<TravelMessage>();

    public TravelSelectAdapter(Context context) {
        this.context = context;
    }

    public void setTravelMessages(List<TravelMessage> travelMessages) {
        this.travelMessages = travelMessages;
    }

    @NonNull
    @Override
    public TravelSelectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.travel_item,parent,false);
        return new TravelSelectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TravelSelectViewHolder holder, int position) {
        TravelMessage message = travelMessages.get(position);
        holder.textName.setText(String.valueOf(message.getName()));
        holder.textType.setText(String.valueOf(message.getType()));
        holder.textGrade.setText(String.valueOf(message.getGrade()));
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        holder.imageGo.setImageResource(R.drawable.ic_keyboard_arrow_right_black_24dp);
        holder.ratingBar.setRating(3);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 调用拨打电话，给10010拨打电话
               /* Uri uri = Uri.parse("tel:10010");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                holder.itemView.getContext().startActivity(intent);*/
                // 直接拨打电话，需要加上权限 <uses-permission id="android.permission.CALL_PHONE" />
                /*Uri callUri = Uri.parse("tel:10010");
                Intent intent = new Intent(Intent.ACTION_CALL, callUri);
                holder.itemView.getContext().startActivity(intent);*/
                Intent intent = new Intent(context, TravelSelectDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return travelMessages.size();
    }

    static class TravelSelectViewHolder extends RecyclerView.ViewHolder{
        TextView textName,textType,textGrade;
        ImageView imageView,imageGo;
        RatingBar ratingBar;
        public TravelSelectViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textName);
            textGrade = itemView.findViewById(R.id.textGrade);
            textType = itemView.findViewById(R.id.textType);
            imageView = itemView.findViewById(R.id.imageView);
            imageGo = itemView.findViewById(R.id.imageGo);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
