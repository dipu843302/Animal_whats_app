package com.example.recylcerview_whatsaap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {



    private List<ModelClass>userList;
    public Adapter(List<ModelClass>userList){
        this.userList=userList;
    }

    @NonNull

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=userList.get(position).getImageView1();
        String name=userList.get(position).getTextview1();
        String time=userList.get(position).getTextview2();
        String message=userList.get(position).getTextview3();
        holder.setData(resource,name,time,message);

    }



    @Override
    public int getItemCount() {
        return userList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);



        }

        public void setData(int resource, String name, String time, String message) {
            imageView.setImageResource(resource);
            textView1.setText(message);
            textView2.setText(time);
            textView3.setText(message);
        }
    }
}
