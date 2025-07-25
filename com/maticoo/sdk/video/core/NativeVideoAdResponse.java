package com.maticoo.sdk.video.core;

import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.maticoo.sdk.video.p407vo.AdsVO;
import com.maticoo.sdk.video.p407vo.NativeVideoAdVO;
import com.maticoo.sdk.video.util.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NativeVideoAdResponse {
    private int errCode;
    private String errMsg;
    private List<NativeVideoAdVO> nativeVideoAdVOList = new ArrayList();

    private static String optStringHelper(JSONObject jSONObject, String... strArr) {
        return Utils.optStringHelper(jSONObject, strArr);
    }

    public static NativeVideoAdResponse parseData(String str) {
        int i;
        NativeVideoAdResponse nativeVideoAdResponse = new NativeVideoAdResponse();
        try {
            Log.i("ZcoupSDK.TAG", "NativeVideoAdResponse::responseData==" + str);
            JSONObject jSONObject = new JSONObject(str);
            nativeVideoAdResponse.errMsg = jSONObject.optString("err_msg");
            nativeVideoAdResponse.errCode = jSONObject.optInt("err_no", -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        NativeVideoAdVO nativeVideoAdVO = new NativeVideoAdVO();
                        nativeVideoAdVO.iconUrl = optStringHelper(optJSONObject, "native_adobj", "icon");
                        nativeVideoAdVO.title = optStringHelper(optJSONObject, "native_adobj", "title");
                        nativeVideoAdVO.imageUrl = optStringHelper(optJSONObject, "native_adobj", "image");
                        nativeVideoAdVO.desc = optStringHelper(optJSONObject, "native_adobj", CampaignEx.JSON_KEY_DESC);
                        nativeVideoAdVO.buttonStr = optStringHelper(optJSONObject, "native_adobj", "button");
                        nativeVideoAdVO.rate = optStringHelper(optJSONObject, "native_adobj", "star");
                        nativeVideoAdVO.choicesLinkUrl = optStringHelper(optJSONObject, "native_adobj", "choices_link_url");
                        boolean z = true;
                        if ("1".equals(optStringHelper(optJSONObject, "native_adobj", CampaignEx.JSON_KEY_OFFER_TYPE))) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        nativeVideoAdVO.offerType = i;
                        nativeVideoAdVO.adid = optJSONObject.optString(Constants.ADID);
                        nativeVideoAdVO.impid = optJSONObject.optString("impid");
                        nativeVideoAdVO.landingType = AdsVO.LANDING_TYPE.getLandingType(optJSONObject.optString(CampaignEx.JSON_KEY_LANDING_TYPE));
                        nativeVideoAdVO.expireTime = optJSONObject.optLong("ad_expire_time", -1L);
                        nativeVideoAdVO.setSlotId(optJSONObject.optString("slot_id"));
                        nativeVideoAdVO.setChannel(optJSONObject.optString(AppsFlyerProperties.CHANNEL));
                        nativeVideoAdVO.setCountry(optJSONObject.optString("country"));
                        nativeVideoAdVO.setLoadTime(optJSONObject.optInt("load_time"));
                        nativeVideoAdVO.setClickTime(optJSONObject.optInt("click_time"));
                        String optString = optJSONObject.optString("tbk");
                        int optInt = optJSONObject.optInt("tbk_t", 0);
                        if (optInt == 2) {
                            nativeVideoAdVO.impTBK = optString;
                        } else if (optInt == 3) {
                            nativeVideoAdVO.clkTBK = optString;
                        }
                        if (1 != optJSONObject.optInt("pre_click", -1)) {
                            z = false;
                        }
                        nativeVideoAdVO.preClick = z;
                        nativeVideoAdVO.clickUrl = optJSONObject.optString("clk_url");
                        nativeVideoAdVO.final_url = optJSONObject.optString("final_url");
                        nativeVideoAdVO.url_schema = optJSONObject.optString("url_schema");
                        try {
                            nativeVideoAdVO.vastXmlData = new String(Base64.decode(optJSONObject.optString("vast_xml_data"), 2));
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        }
                        nativeVideoAdVO.setLp(optJSONObject.optInt("lp", 0));
                        nativeVideoAdVO.setRemind(optJSONObject.optString("remind"));
                        nativeVideoAdResponse.nativeVideoAdVOList.add(nativeVideoAdVO);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return nativeVideoAdResponse;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public NativeVideoAdVO getFirstNativeVideoAdVO() {
        return this.nativeVideoAdVOList.get(0);
    }

    public List<NativeVideoAdVO> getNativeVideoAdVOList() {
        return this.nativeVideoAdVOList;
    }

    public boolean hasError() {
        if (this.errCode != 0) {
            return true;
        }
        return false;
    }

    public void setErrCode(int i) {
        this.errCode = i;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }
}
