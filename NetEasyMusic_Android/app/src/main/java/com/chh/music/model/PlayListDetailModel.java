package com.chh.music.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhao on 16/9/10.
 */
public class PlayListDetailModel extends PlayListModel{

    private List<Track> tracks = new ArrayList<Track>();

    public PlayListDetailModel(){

    }

    public PlayListDetailModel(JSONObject object){
        super(object);
        JSONArray jsonArray = object.optJSONArray("tracks");
        if(jsonArray != null) {
            for (int i = 0; i < jsonArray.length(); i++) {
                tracks.add(new Track(jsonArray.optJSONObject(i)));
            }
        }
    }

}
