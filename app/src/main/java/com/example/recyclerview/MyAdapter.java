package com.example.recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolderr> {
    String groupData[], fnameData[], lnameData[], stitleData[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String group[], String fname[], String lname[], String stitle[], int img[]){
        context = ct;
        groupData= group;
        fnameData = fname;
        lnameData = lname;
        stitleData = stitle;
        images = img;

    }
    @NonNull
    @Override
    public MyViewHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolderr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderr holder, int position) {
        holder.fname1.setText(fnameData[position]);
        holder.lname2.setText(lnameData[position]);
        holder.group1.setText(groupData[position]);
        holder.title1.setText(stitleData[position]);
        holder.image1.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolderr extends RecyclerView.ViewHolder{
        TextView fname1, lname2, title1, group1;
        ImageView image1;
        public MyViewHolderr(@NonNull View itemView) {
            super(itemView);
            fname1 = itemView.findViewById(R.id.fname);
            lname2 = itemView.findViewById(R.id.lname);
            title1 = itemView.findViewById(R.id.stitle);
            group1 = itemView.findViewById(R.id.group);
            image1 = itemView.findViewById(R.id.imageView2);

        }
    }
}
