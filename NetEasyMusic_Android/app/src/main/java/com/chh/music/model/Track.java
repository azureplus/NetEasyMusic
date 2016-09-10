package com.chh.music.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhao on 16/9/10.
 */
public class Track extends BaseModel {
    private Music bMusic;
    private Music hMusic;
    private Music mMusic;
    private Music lMusic;
    private long hearTime;
    private long mvid;
    private String disc;
    private List<Artist> artists = new ArrayList<Artist>();
    private long duration;
    private long id;
    private Album album;
    private int fee;
    private int no;
    private String rtUrl;
    private String ringtone;
    private String[] rtUrls;
    private int score;
    private String rurl;
    private int status;
    private int ftype;
    private String mp3Url;
    private String audition;
    private int playedNum;
    private String commentThreadId;
    private long copyrightId;
    private String name;
    private int rtype;
    private String crbt;
    private int popularity;
    private int dayPlays;
    private String[] alias;
    private String copyFrom;
    private int position;
    private boolean starred;
    private int starredNum;

    public Track(){

    }

    public Track(JSONObject object){
        setbMusic(new Music(object.optJSONObject("bMusic")));
        sethMusic(new Music(object.optJSONObject("hMusic")));
        setmMusic(new Music(object.optJSONObject("mMusic")));
        setlMusic(new Music(object.optJSONObject("lMusic")));
        setHearTime(object.optLong("hearTime"));
        setMvid(object.optLong("mvid"));
        setDisc(object.optString("disc"));
        JSONArray jsonArray = object.optJSONArray("artists");
        if(jsonArray != null){
            for(int i=0; i<jsonArray.length();i++){
                artists.add(new Artist(jsonArray.optJSONObject(i)));
            }
        }
        setDuration(object.optLong("duration"));
        setId(object.optLong("id"));
        setAlbum(new Album(object.optJSONObject("album")));
        setFee(object.optInt("fee"));
        setNo(object.optInt("no"));
        setRtUrl(object.optString("rtUrl"));
        setStatus(object.optInt("status"));
        setFtype(object.optInt("ftype"));
        setMp3Url(object.optString("mp3Url"));
        setAudition(object.optString("audition"));
        setPlayedNum(object.optInt("playedNum"));
        setCommentThreadId(object.optString("commentThreadId"));
        setCopyrightId(object.optLong("copyrightId"));
        setName(object.optString("name"));
        setRtype(object.optInt("rtype"));
        setCrbt(object.optString("crbt"));
        setPopularity(object.optInt("popularity"));
        setDayPlays(object.optInt("dayPlays"));
        setAlias(jsonArr2StirngArr(object.optJSONArray("alias")));
        setCopyFrom(object.optString("copyFrom"));
        setPosition(object.optInt("position"));
        setStarred(object.optBoolean("starred"));
        setStarredNum(object.optInt("starredNum"));
    }


    /**
     * {
     "bMusic": {
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
     "hearTime": 0,
     "mvid": 5331160,
     "hMusic": {
     "name": "不痛",
     "extension": "mp3",
     "volumeDelta": -1.42,
     "sr": 44100,
     "dfsId": 1075322371972447,
     "playTime": 247145,
     "bitrate": 320000,
     "id": 10088815,
     "size": 9913291
     },
     "disc": "",
     "artists": [
     {
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
     ],
     "duration": 247145,
     "id": 327091,
     "album": {
     "status": 1,
     "blurPicUrl": "http://p4.music.126.net/N3NCeR-aC-c9qTYruCkWzg==/45079976755877.jpg",
     "copyrightId": 1011,
     "name": "梦里花",
     "companyId": 0,
     "description": "",
     "pic": 45079976755877,
     "commentThreadId": "R_AL_3_32361",
     "publishTime": 1167580800000,
     "briefDesc": "",
     "company": "福茂唱片",
     "picId": 45079976755877,
     "alias": [],
     "picUrl": "http://p3.music.126.net/N3NCeR-aC-c9qTYruCkWzg==/45079976755877.jpg",
     "artists": [
     {
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
     "picUrl": "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
     "trans": "",
     "id": 0
     },
     "type": "专辑",
     "id": 32361,
     "tags": "",
     "size": 11
     },
     "fee": 8,
     "no": 2,
     "rtUrl": null,
     "ringtone": "600902000008872629",
     "rtUrls": null,
     "score": 100,
     "rurl": null,
     "status": 0,
     "ftype": 0,
     "mp3Url": "http://m2.music.126.net/ffaNQCoNGoWrVYqKmUtVlw==/1158885255683578.mp3",
     "audition": null,
     "playedNum": 0,
     "commentThreadId": "R_SO_4_327091",
     "mMusic": {
     "name": "不痛",
     "extension": "mp3",
     "volumeDelta": -0.99,
     "sr": 44100,
     "dfsId": 1187472558005653,
     "playTime": 247145,
     "bitrate": 160000,
     "id": 10088816,
     "size": 4975104
     },

     "copyrightId": 1011,
     "name": "不痛",
     "rtype": 0,
     "crbt": "3dec1abc5a8d7f813a50d5dcccbda483",
     "popularity": 100,
     "dayPlays": 0,
     "alias": [],
     "copyFrom": "",
     "position": 2,
     "starred": false,
     "starredNum": 0
     },
     */
    public Music getbMusic() {
        return bMusic;
    }

    public void setbMusic(Music bMusic) {
        this.bMusic = bMusic;
    }

    public Music gethMusic() {
        return hMusic;
    }

    public void sethMusic(Music hMusic) {
        this.hMusic = hMusic;
    }

    public Music getmMusic() {
        return mMusic;
    }

    public void setmMusic(Music mMusic) {
        this.mMusic = mMusic;
    }

    public Music getlMusic() {
        return lMusic;
    }

    public void setlMusic(Music lMusic) {
        this.lMusic = lMusic;
    }

    public long getHearTime() {
        return hearTime;
    }

    public void setHearTime(long hearTime) {
        this.hearTime = hearTime;
    }

    public long getMvid() {
        return mvid;
    }

    public void setMvid(long mvid) {
        this.mvid = mvid;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getRtUrl() {
        return rtUrl;
    }

    public void setRtUrl(String rtUrl) {
        this.rtUrl = rtUrl;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String[] getRtUrls() {
        return rtUrls;
    }

    public void setRtUrls(String[] rtUrls) {
        this.rtUrls = rtUrls;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRurl() {
        return rurl;
    }

    public void setRurl(String rurl) {
        this.rurl = rurl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFtype() {
        return ftype;
    }

    public void setFtype(int ftype) {
        this.ftype = ftype;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public String getAudition() {
        return audition;
    }

    public void setAudition(String audition) {
        this.audition = audition;
    }

    public int getPlayedNum() {
        return playedNum;
    }

    public void setPlayedNum(int playedNum) {
        this.playedNum = playedNum;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
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

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public String getCrbt() {
        return crbt;
    }

    public void setCrbt(String crbt) {
        this.crbt = crbt;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getDayPlays() {
        return dayPlays;
    }

    public void setDayPlays(int dayPlays) {
        this.dayPlays = dayPlays;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public String getCopyFrom() {
        return copyFrom;
    }

    public void setCopyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public int getStarredNum() {
        return starredNum;
    }

    public void setStarredNum(int starredNum) {
        this.starredNum = starredNum;
    }
}
