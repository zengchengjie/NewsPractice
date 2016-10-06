package com.example.zcj.newspractice.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zcj on 2016/10/5.
 */
public class NewsAdapter extends RecyclerView.Adapter {
//    private
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder<>{
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
