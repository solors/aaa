package com.maticoo.sdk.utils;

import android.os.Build;
import com.maticoo.sdk.MaticooAdsConstant;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.model.Placement;
import com.maticoo.sdk.utils.prefs.Preference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PlacementUtils {
    public static String getMediation(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(MaticooAdsConstant.KEY_AD_MEDIATION)) == null || !(obj instanceof String)) {
            return MaticooAdsConstant.VALUE_AD_MEDIATION;
        }
        return (String) obj;
    }

    public static Placement getPlacement(String str) {
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value != null && value.getPls() != null) {
            return value.getPls().get(str);
        }
        return null;
    }

    public static Object[] getPlacement2(String str) {
        boolean z;
        boolean z2;
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value == null) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[2];
        if (z) {
            objArr[0] = 1;
            return objArr;
        }
        if (value.getPls() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            objArr[0] = 2;
            return objArr;
        }
        Placement placement = value.getPls().get(str);
        if (placement == null) {
            objArr[0] = 3;
            return objArr;
        }
        objArr[0] = 0;
        objArr[1] = placement;
        return objArr;
    }

    public static JSONObject placementEventParams(String str, int i) {
        return placementEventParams(null, str, i);
    }

    public static JSONObject placementEventParamsWithChildType(String str, int i, int i2) {
        return placementEventParamsWithChildType(null, str, i, i2);
    }

    public static JSONObject placementEventParams(AdBean adBean, String str, int i) {
        Map<String, Object> eventMap;
        JSONObject jSONObject = new JSONObject();
        if (adBean != null && (eventMap = adBean.getEventMap()) != null) {
            for (String str2 : eventMap.keySet()) {
                JSONUtil.put(jSONObject, str2, eventMap.get(str2));
            }
        }
        JSONUtil.put(jSONObject, KeyConstants.RequestBody.KEY_PID, str);
        JSONUtil.put(jSONObject, "ad_type", Integer.valueOf(i));
        JSONUtil.put(jSONObject, "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        return jSONObject;
    }

    public static JSONObject placementEventParamsWithChildType(AdBean adBean, String str, int i, int i2) {
        JSONObject placementEventParams = placementEventParams(adBean, str, i);
        JSONUtil.put(placementEventParams, "ad_child_type", Integer.valueOf(i2));
        return placementEventParams;
    }
}
