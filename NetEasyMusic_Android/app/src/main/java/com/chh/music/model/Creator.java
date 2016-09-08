package com.chh.music.model;

import org.json.JSONObject;

/**
 * Created by chenhao on 16/9/8.
 */
public class Creator {


    /**
     *  "creator": {
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
     */
    private boolean followed;
    private String remarkName;
    private String expertTags;
    private int userId;
    private int authority;
    private int userType;
    private long backgroundImgId;
    private String description;
    private int city;
    private boolean mutual;
    private String avatarUrl;
    private String detailDescription;
    private int province;
    private String avatarImgIdStr;
    private String signature;
    private long birthday;
    private String nickname;
    private int vipType;
    private int avatarImgId;
    private boolean defaultAvatar;
    private int djStatus;
    private int accountStatus;
    private String backgroundImgIdStr;
    private String backgroundUrl;
    private int gender;
    private int authStatus;


    public Creator(){

    }

    public Creator(JSONObject object){
        followed = object.optBoolean("followed");
        remarkName = object.optString("remarkName");
        expertTags = object.optString("expertTags");
        userId = object.optInt("userId");
        authority = object.optInt("authority");
        userType = object.optInt("userType");
        backgroundImgId = object.optLong("backgroundImgId");
        description = object.optString("description");
        city = object.optInt("city");
        mutual = object.optBoolean("mutual");
        avatarUrl = object.optString("avatarUrl");
        detailDescription = object.optString("detailDescription");
        province = object.optInt("province");
        avatarImgIdStr = object.optString("avatarImgIdStr");
        signature = object.optString("signature");
        birthday = object.optLong("birthday");
        nickname = object.optString("nickname");
        vipType = object.optInt("vipType");
        avatarImgId = object.optInt("avatarImgId");
        defaultAvatar = object.optBoolean("defaultAvatar");
        djStatus = object.optInt("djStatus");
        accountStatus = object.optInt("accountStatus");
        backgroundImgIdStr = object.optString("backgroundImgIdStr");
        backgroundUrl = object.optString("backgroundUrl");
        gender = object.optInt("gender");
        authStatus = object.optInt("authStatus");
    }


    public boolean isFollowd() {
        return followed;
    }

    public void setFollowd(boolean followd) {
        this.followed = followd;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getExpertTags() {
        return expertTags;
    }

    public void setExpertTags(String expertTags) {
        this.expertTags = expertTags;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public long getBackgroundImgId() {
        return backgroundImgId;
    }

    public void setBackgroundImgId(long backgroundImgId) {
        this.backgroundImgId = backgroundImgId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public boolean isMutual() {
        return mutual;
    }

    public void setMutual(boolean mutual) {
        this.mutual = mutual;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public String getAvatarImgIdStr() {
        return avatarImgIdStr;
    }

    public void setAvatarImgIdStr(String avatarImgIdStr) {
        this.avatarImgIdStr = avatarImgIdStr;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getVipType() {
        return vipType;
    }

    public void setVipType(int vipType) {
        this.vipType = vipType;
    }

    public int getAvatarImgId() {
        return avatarImgId;
    }

    public void setAvatarImgId(int avatarImgId) {
        this.avatarImgId = avatarImgId;
    }

    public boolean isDefaultAvatar() {
        return defaultAvatar;
    }

    public void setDefaultAvatar(boolean defaultAvatar) {
        this.defaultAvatar = defaultAvatar;
    }

    public int getDjStatus() {
        return djStatus;
    }

    public void setDjStatus(int djStatus) {
        this.djStatus = djStatus;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getBackgroundImgIdStr() {
        return backgroundImgIdStr;
    }

    public void setBackgroundImgIdStr(String backgroundImgIdStr) {
        this.backgroundImgIdStr = backgroundImgIdStr;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }
}
