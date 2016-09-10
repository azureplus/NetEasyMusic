package com.chh.music.model;

import org.json.JSONArray;

/**
 * Created by chenhao on 16/9/10.
 */
public class BaseModel {

    public String[] jsonArr2StirngArr(JSONArray jsonArray){
        if(jsonArray == null){
            return null;
        }
        String[] strigArr = new String[jsonArray.length()];
        for(int i=0; i< jsonArray.length(); i++){
            strigArr[i] = jsonArray.optString(i);
        }
        return strigArr;
    }
}
