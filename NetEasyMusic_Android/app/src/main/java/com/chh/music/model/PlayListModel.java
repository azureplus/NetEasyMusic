package com.chh.music.model;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by chenhao on 16/9/8.
 */
public class PlayListModel {
    /*
         {
            "updateTime": 1473250098314,
            "creator": {
                "followed": false,
                "remarkName": null,
                "expertTags": null,
                "userId": 101701960,
                "authority": 0,
                "userType": 0,
                "backgroundImgId": 3406287025457028,
                "description": "",
                "city": 440600,
                "mutual": false,
                "avatarUrl": "http://p3.music.126.net/JLY1rFEgc8dICagflViB_g==/3399689962708524.jpg",
                "detailDescription": "",
                "province": 440000,
                "avatarImgIdStr": "3399689962708524",
                "signature": "Think of wind",
                "birthday": 878381805115,
                "nickname": "Glam_King",
                "vipType": 0,
                "avatarImgId": 3399689962708524,
                "defaultAvatar": false,
                "djStatus": 0,
                "accountStatus": 0,
                "backgroundImgIdStr": "3406287025457028",
                "backgroundUrl": "http://p1.music.126.net/v1mjI-gbwYRMHVnrRnQRmw==/3406287025457028.jpg",
                "gender": 1,
                "authStatus": 0
            },
            "trackUpdateTime": 1473327282211,
            "userId": 101701960,
            "coverImgUrl": "http://p4.music.126.net/RdzsQ5IU4B5WQ5t449NpAg==/2946691204159243.jpg",
            "commentCount": 18,
            "artists": null,
            "newImported": false,
            "commentThreadId": "A_PL_0_399192064",
            "subscribed": false,
            "privacy": 0,
            "id": 399192064,
            "trackCount": 54,
            "specialType": 0,
            "status": 0,
            "description": "喜欢孤独的人必然也喜欢爱情，因为唯独在爱情当中，才能最圆满最深刻地体会孤独，而且这还必须是不可成就不会成就的爱情，就这么闭户独居，你不会感到孤独；但是在一个人的怀抱与自己的小房间之间拉锯，且终于舍弃前者回到密室，你的孤独才是完美的。——《我执》",
            "subscribedCount": 487,
            "tags": [
                "粤语",
                "流行",
                "孤独"
            ],
            "trackNumberUpdateTime": 1472873201008,
            "tracks": null,
            "highQuality": false,
            "subscribers": [],
            "playCount": 58794,
            "coverImgId": 2946691204159243,
            "createTime": 1465617194844,
            "name": "「粤语」单身生活的你过得好吗？",
            "cloudTrackCount": 0,
            "shareCount": 7,
            "adType": 0,
            "totalDuration": 0
        },
     */

    private long updateTime;
    private Creator creator;
    private long trackUpdateTime;
    private long userId;
    private String coverImgUrl;
    private int commentCount;
    private String artists;
    private boolean newImported;
    private String commentThreadId;
    private boolean subscribed;
    private int privacy;
    private int id;
    private int trackCount;
    private int specialType;
    private int status;
    private String description;
    private int subscribedCount;
    private String[] tags ;
    private long trackNumberUpdateTime;
    private String tracks;
    private boolean highQuality;
    private String[] subscribers;
    private int playCount;
    private long coverImgId;
    private long createTime;
    private String name;
    private int cloudTrackCount;
    private int shareCount;
    private int adType;
    private int totalDuration;

    public PlayListModel(){

    }

    public PlayListModel(JSONObject jsonObject){

        updateTime = jsonObject.optLong("updateTime");
        creator = new Creator(jsonObject.optJSONObject("creator"));
        trackUpdateTime = jsonObject.optLong("trackUpdateTime");
        userId = jsonObject.optLong("userId");
        coverImgUrl = jsonObject.optString("coverImgUrl");
        commentCount = jsonObject.optInt("commentCount");
        artists = jsonObject.optString("artists");
        newImported = jsonObject.optBoolean("newImported");
        commentThreadId = jsonObject.optString("commentThreadId");
        subscribed = jsonObject.optBoolean("subscribed");
        privacy = jsonObject.optInt("privacy");
        id = jsonObject.optInt("id");
        trackCount = jsonObject.optInt("trackCount");
        specialType = jsonObject.optInt("specialType");
        status = jsonObject.optInt("status");
        specialType = jsonObject.optInt("specialType");
        status = jsonObject.optInt("status");
        description = jsonObject.optString("description");
        subscribedCount = jsonObject.optInt("subscribedCount");
        JSONArray tagsJsonArr = jsonObject.optJSONArray("tags");
        tags = new String[tagsJsonArr.length()];
        for(int i= 0; i < tagsJsonArr.length(); i++){
            tags[i] = tagsJsonArr.optString(i);
        }
        trackNumberUpdateTime = jsonObject.optLong("trackNumberUpdateTime");
        tracks = jsonObject.optString("tracks");
        highQuality = jsonObject.optBoolean("highQuality");
        JSONArray subscribersJsonArr = jsonObject.optJSONArray("subscribers");
        subscribers = new String[subscribersJsonArr.length()];
        for(int i=0; i< subscribersJsonArr.length(); i++){
            subscribers[i] = subscribersJsonArr.optString(i);
        }
        playCount = jsonObject.optInt("playCount");
        coverImgId = jsonObject.optLong("coverImgId");
        createTime = jsonObject.optLong("createTime");
        name = jsonObject.optString("name");
        cloudTrackCount = jsonObject.optInt("cloudTrackCount");
        shareCount = jsonObject.optInt("shareCount");
        adType = jsonObject.optInt("adType");
        totalDuration = jsonObject.optInt("totalDuration");
    }


    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public long getTrackUpdateTime() {
        return trackUpdateTime;
    }

    public void setTrackUpdateTime(long trackUpdateTime) {
        this.trackUpdateTime = trackUpdateTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public boolean isNewImported() {
        return newImported;
    }

    public void setNewImported(boolean newImported) {
        this.newImported = newImported;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public int getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getSpecialType() {
        return specialType;
    }

    public void setSpecialType(int specialType) {
        this.specialType = specialType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSubscribedCount() {
        return subscribedCount;
    }

    public void setSubscribedCount(int subscribedCount) {
        this.subscribedCount = subscribedCount;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public long getTrackNumberUpdateTime() {
        return trackNumberUpdateTime;
    }

    public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
        this.trackNumberUpdateTime = trackNumberUpdateTime;
    }

    public String getTracks() {
        return tracks;
    }

    public void setTracks(String tracks) {
        this.tracks = tracks;
    }

    public boolean isHighQuality() {
        return highQuality;
    }

    public void setHighQuality(boolean highQuality) {
        this.highQuality = highQuality;
    }

    public String[] getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(String[] subscribers) {
        this.subscribers = subscribers;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public long getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(long coverImgId) {
        this.coverImgId = coverImgId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCloudTrackCount() {
        return cloudTrackCount;
    }

    public void setCloudTrackCount(int cloudTrackCount) {
        this.cloudTrackCount = cloudTrackCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getAdType() {
        return adType;
    }

    public void setAdType(int adType) {
        this.adType = adType;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }
}
