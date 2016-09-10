package com.chh.music.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhao on 16/9/10.
 */
public class Album extends BaseModel{


    /**
     *  "album": {
     "status": 3,
     "blurPicUrl": "http://p4.music.126.net/HQxTggMCB7AHUXN-ZFEtmA==/1371091013186741.jpg",
     "copyrightId": 0,
     "name": "小梦大半",
     "companyId": 0,
     "description": "",
     "pic": 1371091013186741,
     "commentThreadId": "R_AL_3_34780579",
     "publishTime": 1469462400007,
     "briefDesc": "",
     "company": "上海趣果",
     "picId": 1371091013186741,
     "alias": [],
     "picUrl": "http://p4.music.126.net/HQxTggMCB7AHUXN-ZFEtmA==/1371091013186741.jpg",
     "artists": [
     {
     "img1v1Url": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "name": "陈粒",
     "briefDesc": "",
     "albumSize": 0,
     "img1v1Id": 0,
     "musicSize": 0,
     "alias": [],
     "picId": 0,
     "picUrl": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "trans": "",
     "id": 1007170
     }
     ],
     "songs": null,
     "artist": {
     "img1v1Url": "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "name": "",
     "briefDesc": "",
     "albumSize": 0,
     "img1v1Id": 0,
     "musicSize": 0,
     "alias": [],
     "picId": 0,
     "picUrl": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "trans": "",
     "id": 0
     },
     "type": "专辑",
     "id": 34780579,
     "tags": "",
     "size": 10
     },
     */

    private int status;
    private String blurPicUrl;
    private long copyrightId;
    private String name;
    private long companyId;
    private String description;
    private long pic;
    private String commentThreadId;
    private long publishTime;
    private String briefDesc;
    private String company;
    private long picId;
    private String[] alias;
    private String picUrl;
    private List<Artist> artists = new ArrayList<Artist>();
    private Artist artist;
    private String type;
    private String[] tags;
    private int size;
    private String picId_str;
    //TODO:
    private String[] songs;


    public Album(){

    }

    public Album(JSONObject object){
        setStatus(object.optInt("status"));
        setBlurPicUrl(object.optString("blurPicUrl"));
        setCopyrightId(object.optLong("copyrightId"));
        setName(object.optString("name"));
        setCompanyId(object.optLong("companyId"));
        setDescription(object.optString("description"));
        setPic(object.optLong("pic"));
        setCommentThreadId(object.optString("commentThreadId"));
        setPublishTime(object.optLong("publishTime"));
        setBriefDesc(object.optString("briefDesc"));
        setCompany(object.optString("company"));
        setPicId(object.optLong("picId"));
        setAlias(jsonArr2StirngArr(object.optJSONArray("alias")));
        setPicUrl(object.optString("picUrl"));
        JSONArray jsonArray = object.optJSONArray("artists");
        if(jsonArray != null) {
            for (int i=0; i< jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.optJSONObject(i);
                artists.add(new Artist(jsonObject));
            }
        }
        artist = new Artist(object.optJSONObject("artist"));
        setType(object.optString("type"));
        setTags(jsonArr2StirngArr(object.optJSONArray("tags")));
        setSize(object.optInt("size"));
        setPicId_str(object.optString("picId_str"));
        songs = null;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBlurPicUrl() {
        return blurPicUrl;
    }

    public void setBlurPicUrl(String blurPicUrl) {
        this.blurPicUrl = blurPicUrl;
    }

    public long getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(long copyrightId) {
        this.copyrightId = copyrightId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPic() {
        return pic;
    }

    public void setPic(long pic) {
        this.pic = pic;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPicId_str() {
        return picId_str;
    }

    public void setPicId_str(String picId_str) {
        this.picId_str = picId_str;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }
}
