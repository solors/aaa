package com.maticoo.sdk.video.core;

import android.util.Log;
import com.maticoo.sdk.video.p407vo.CreativeVO;
import com.maticoo.sdk.video.util.ContextHolder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RewardedVideoCreativeResponse {
    public static final String CreativePath = ContextHolder.getGlobalAppContext().getCacheDir().getAbsolutePath() + "/creative/";
    private String country;
    public List<CreativeVO> creativeList = new ArrayList();
    private String errMsg;
    private boolean isWifi;
    private String slotId;
    private int totalCreatives;
    private int totalVideos;

    public static RewardedVideoCreativeResponse parseData(String str) {
        RewardedVideoCreativeResponse rewardedVideoCreativeResponse = new RewardedVideoCreativeResponse();
        try {
            Log.i("ZcoupSDK.TAG", "RewardedVideoCreativeResponse::responseData==" + str);
            JSONObject jSONObject = new JSONObject(str);
            rewardedVideoCreativeResponse.errMsg = jSONObject.optString("error");
            rewardedVideoCreativeResponse.country = jSONObject.optString("country");
            rewardedVideoCreativeResponse.totalCreatives = jSONObject.optInt("total_creatives");
            rewardedVideoCreativeResponse.totalVideos = jSONObject.optInt("total_videos");
            rewardedVideoCreativeResponse.isWifi = jSONObject.optBoolean("is_wifi", false);
            rewardedVideoCreativeResponse.slotId = jSONObject.optString("slot_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        CreativeVO creativeVO = new CreativeVO();
                        String optString = optJSONObject.optString("cid");
                        creativeVO.setCid(optString);
                        creativeVO.setUrl(optJSONObject.optString("url"));
                        creativeVO.setType(CreativeVO.CreativeType.getType(optJSONObject.optString("type")));
                        creativeVO.setWidth(optJSONObject.optInt("width"));
                        creativeVO.setHeight(optJSONObject.optInt("height"));
                        creativeVO.setPath(CreativePath + optString);
                        creativeVO.setPlayTime(0);
                        creativeVO.setStatus(0);
                        rewardedVideoCreativeResponse.creativeList.add(creativeVO);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return rewardedVideoCreativeResponse;
    }

    public String getCountry() {
        return this.country;
    }

    public List<CreativeVO> getCreativeList() {
        return this.creativeList;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getSlotId() {
        return this.slotId;
    }

    public int getTotalCreatives() {
        return this.totalCreatives;
    }

    public int getTotalVideos() {
        return this.totalVideos;
    }

    public boolean hasError() {
        return !"ok".equals(this.errMsg);
    }

    public boolean isWifi() {
        return this.isWifi;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCreativeList(List<CreativeVO> list) {
        this.creativeList = list;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setSlotId(String str) {
        this.slotId = str;
    }

    public void setTotalCreatives(int i) {
        this.totalCreatives = i;
    }

    public void setTotalVideos(int i) {
        this.totalVideos = i;
    }

    public void setWifi(boolean z) {
        this.isWifi = z;
    }

    public String toString() {
        return "RewardedVideoCreativeResponse{errMsg='" + this.errMsg + "', creativeList=" + this.creativeList + ", country='" + this.country + "', totalCreatives=" + this.totalCreatives + ", totalVideos=" + this.totalVideos + ", isWifi=" + this.isWifi + ", slotId='" + this.slotId + "'}";
    }
}
