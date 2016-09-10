package com.chh.music.model;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by chenhao on 16/9/10.
 */
public class Artist {

    /**
     *   {
     "img1v1Url": "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "name": "张韶涵",
     "briefDesc": "",
     "albumSize": 0,
     "img1v1Id": 0,
     "musicSize": 0,
     "alias": [],
     "picId": 0,
     "picUrl": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "trans": "",
     "id": 10562
     }
     */

    private String img1v1Url;
    private String name;
    private String briefDesc;
    private int albumSize;
    private long img1v1Id;
    private long musicSize;
    private String[] alias;
    private long picId;
    private String picUrl;
    private String trans;
    private int id;

    public Artist(){

    }

    public Artist(JSONObject object){
        setImg1v1Url(object.optString("img1v1Url"));
        setName(object.optString("name"));
        setBriefDesc(object.optString("briefDesc"));
        setAlbumSize(object.optInt("albumSize"));
        setImg1v1Id(object.optLong("img1v1Id"));
        setMusicSize(object.optLong("musicSize"));
        JSONArray aliasJsonArr = object.optJSONArray("alias");
        alias = new String[aliasJsonArr.length()];
        for(int i=0; i<= aliasJsonArr.length();i++){
            alias[i] = aliasJsonArr.optString(i);
        }
        setPicId(object.optLong("picId"));
        setPicUrl(object.optString("picUrl"));
        setTrans(object.optString("trans"));
        setId(object.optInt("id"));
    }

    public String getImg1v1Url() {
        return img1v1Url;
    }

    public void setImg1v1Url(String img1v1Url) {
        this.img1v1Url = img1v1Url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public int getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(int albumSize) {
        this.albumSize = albumSize;
    }

    public long getImg1v1Id() {
        return img1v1Id;
    }

    public void setImg1v1Id(long img1v1Id) {
        this.img1v1Id = img1v1Id;
    }

    public long getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(long musicSize) {
        this.musicSize = musicSize;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
