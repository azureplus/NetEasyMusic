package com.chh.music.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.chh.music.R;
import com.chh.music.model.PlayListModel;
import com.chh.music.net.VolleyUtil;

import java.util.List;

import static com.chh.music.R.drawable.placeholder_disk_380;

/**
 * Created by chenhao on 16/9/8.
 */
public class PlayListAdapter extends RecyclerView.Adapter {
    private List<PlayListModel> mDatas;
    private Context mContext;

    public PlayListAdapter(Context context, List<PlayListModel> models){
        this.mContext = context;
        this.mDatas = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        return new PlayListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        PlayListModel model = mDatas.get(position);
        if(holder instanceof PlayListViewHolder) {
            ((PlayListViewHolder) holder).ivCover.setImageResource(R.drawable.placeholder_disk_380);
            VolleyUtil.loadImage(((PlayListViewHolder) holder).ivCover, model.getCoverImgUrl());

            ((PlayListViewHolder) holder).tvName.setText(model.getName());
            int playCount = model.getPlayCount();
            if(playCount < 100000){
                ((PlayListViewHolder) holder).tvPlayCount.setText(""+ playCount);
            }else{
                ((PlayListViewHolder) holder).tvPlayCount.setText(playCount/10000+ "万");

            }
            ((PlayListViewHolder) holder).tvUserName.setText(model.getCreator().getNickname());
        }
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

     class PlayListViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivCover = null;
        public TextView tvName = null;
        public RelativeLayout rlBodyView = null;
        public TextView tvPlayCount;
        public TextView tvUserName;

        private int getItemBodyViewWidth(){
            //body width = height = Screen width - 3* item maigin
            int margin = mContext.getResources().getDimensionPixelSize(R.dimen.play_list_item_margin);
            int screenWidth = mContext.getResources().getDisplayMetrics().widthPixels;
            return (screenWidth - 3*margin)/2;
        }

        public PlayListViewHolder(View itemView) {
            super(itemView);
            rlBodyView = (RelativeLayout) itemView.findViewById(R.id.item_body);
            int bodyWidth = getItemBodyViewWidth();
            rlBodyView.setLayoutParams(new RelativeLayout.LayoutParams(bodyWidth, bodyWidth));
            ivCover = (ImageView) itemView.findViewById(R.id.iv_cover);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvPlayCount = (TextView) itemView.findViewById(R.id.tv_play_count);
            tvUserName = (TextView) itemView.findViewById(R.id.tv_user_name);

        }
    }
}
