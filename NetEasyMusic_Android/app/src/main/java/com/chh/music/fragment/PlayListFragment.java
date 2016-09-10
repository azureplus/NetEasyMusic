package com.chh.music.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.chh.music.MusicApplication;
import com.chh.music.R;
import com.chh.music.adapter.PlayListAdapter;
import com.chh.music.constant.API;
import com.chh.music.model.PlayListModel;
import com.chh.music.utils.CHHLog;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chenhao on 16/9/7.
 */
public class PlayListFragment extends BaseFragment implements PlayListAdapter.OnItemClickListener {

    private List<PlayListModel> mPlayListModels = new ArrayList<PlayListModel>();
    private RecyclerView mPlayListRecyclerView;
    private PlayListAdapter mPlayListAdapter;

    public static PlayListFragment newInstance(String title){
        PlayListFragment fragment = new PlayListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TITLE, title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitle = getArguments().getString(KEY_TITLE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist, container, false);
        mPlayListRecyclerView = (RecyclerView) view.findViewById(R.id.playlist_recyclerview);
        mPlayListRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration(){

            @Override
            public void getItemOffsets(
                    Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int margin = getContext().getResources().getDimensionPixelSize(R.dimen.play_list_item_margin);
                int position = parent.getChildAdapterPosition(view);
                if(position % 2 == 0) {
                    outRect.set(margin, margin, margin/2, 0);
                }else{
                    outRect.set(1 * margin/2, margin, margin, 0);
                }

            }
        });
        mPlayListRecyclerView.setHasFixedSize(true);
        mPlayListRecyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        mPlayListAdapter = new PlayListAdapter(getContext(), mPlayListModels);
        mPlayListRecyclerView.setAdapter(mPlayListAdapter);
        mPlayListAdapter.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        CHHLog.d("PlayListFragment onResume");
        requestServer();
    }


    private void requestServer(){
        String url = "http://"+ API.HOST +"/playlist/list";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){

            @Override
            public void onResponse(JSONObject object) {
                CHHLog.d("PlayListFragment" +object.toString());
                boolean isSuccess = object.optInt("code") == 200;
                if(isSuccess){
                    JSONArray playlists = object.optJSONArray("playlists");
                    for(int i = 0; i< playlists.length(); i++){
                        PlayListModel model = new PlayListModel(playlists.optJSONObject(i));
                        mPlayListModels.add(model);
                    }
                    mPlayListAdapter.notifyDataSetChanged();
                }

            }
        }, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError volleyError) {
                CHHLog.d("PlayListFragment" +volleyError.toString());
            }
        });
        MusicApplication.getInstance().getHttpQueue().add(request);
    }

    @Override
    public void onItemClick(View view, PlayListModel model) {
        if(model != null){
            Toast.makeText(getContext(), "click playlist id=" +model.getId(), Toast.LENGTH_SHORT).show();

        }
    }
}
