package com.chh.music.model;

import org.json.JSONObject;

/**
 * Created by chenhao on 16/9/10.
 */
public class Music {


    /**
     *  {
     "name": "不痛",
     "extension": "mp3",
     "volumeDelta": -1.03,
     "sr": 44100,
     "dfsId": 1158885255683578,
     "playTime": 247145,
     "bitrate": 96000,
     "id": 10088817,
     "size": 2999411
     },
     */

    private String name;
    private String extension;
    private double volumeDelta;
    private String sr;
    private long dfsId;
    private long playTime;
    private long bitrate;
    private long id;
    private long size;

    public Music(){

    }

    public Music(JSONObject object){
        setName(object.optString("name"));
        setExtension(object.optString("extension"));
        setVolumeDelta(object.optDouble("volumeDelta"));
        setSr(object.optString("sr"));
        setDfsId(object.optLong("dfsId"));
        setPlayTime(object.optLong("playTime"));
        setBitrate(object.optLong("bitrate"));
        setId(object.optLong("id"));
        setSize(object.optLong("size"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getVolumeDelta() {
        return volumeDelta;
    }

    public void setVolumeDelta(double volumeDelta) {
        this.volumeDelta = volumeDelta;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public long getDfsId() {
        return dfsId;
    }

    public void setDfsId(long dfsId) {
        this.dfsId = dfsId;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }

    public long getBitrate() {
        return bitrate;
    }

    public void setBitrate(long bitrate) {
        this.bitrate = bitrate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
