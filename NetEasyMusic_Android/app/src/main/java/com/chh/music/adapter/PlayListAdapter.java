package com.chh.music.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chh.music.model.PlayListModel;

import java.util.List;

/**
 * Created by chenhao on 16/9/8.
 */
public class PlayListAdapter extends RecyclerView.Adapter {
    private List<PlayListModel> mDatas;

    public PlayListAdapter(List<PlayListModel> models){
        mDatas = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class PlayListViewHolder extends RecyclerView.ViewHolder{
        public PlayListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
