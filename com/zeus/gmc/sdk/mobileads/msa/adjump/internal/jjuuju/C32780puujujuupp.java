package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.analytics.AnalyticsUtilHelper;
import com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base.Actions;
import com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base.AdAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.puujujuupp */
/* loaded from: classes8.dex */
public class C32780puujujuupp {
    private static final String jujujpjjp = "TrackUtils";
    public static final List<String> uppjpjj = new ArrayList();

    private C32780puujujuupp() {
    }

    public static boolean jujujpjjp(Context context, C32779jujujpjjp c32779jujujpjjp) {
        String str = c32779jujujpjjp.jjuuju;
        if (!TextUtils.isEmpty(str) && uppjpjj.contains(str)) {
            HashMap hashMap = new HashMap();
            jujujpjjp(hashMap, "configKey", c32779jujujpjjp.jpjjjjp);
            jujujpjjp(hashMap, "e", c32779jujujpjjp.jjuuju);
            jujujpjjp(hashMap, "t", Long.valueOf(System.currentTimeMillis()));
            jujujpjjp(hashMap, "tagId", c32779jujujpjjp.puujujuupp);
            jujujpjjp(hashMap, "ex", c32779jujujpjjp.jupppjuju);
            jujujpjjp(hashMap, "ext_param", c32779jujujpjjp.jujujpjjp(context));
            jujujpjjp(context, hashMap);
            return true;
        }
        MLog.m25877i(jujujpjjp, "This event 【" + str + "】 ban report！");
        return false;
    }

    private static void jujujpjjp(HashMap<String, Object> hashMap, String str, Object obj) {
        if (hashMap == null || TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == -1) {
            return;
        }
        if ((obj instanceof Long) && ((Long) obj).longValue() == -1) {
            return;
        }
        if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
            return;
        }
        hashMap.put(str, obj);
    }

    public static void jujujpjjp(Context context, HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            AdAction newAdAction = Actions.newAdAction("nativeAd", String.valueOf(hashMap.get("e")));
            String str = (String) hashMap.get("configKey");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            hashMap.remove("configKey");
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                jujujpjjp(newAdAction, entry.getKey(), entry.getValue());
            }
            AnalyticsUtilHelper.getInstance(context).trackAction("com.miui.systemAdSolution", str, newAdAction.getMap());
        }
    }

    private static void jujujpjjp(AdAction adAction, String str, Object obj) {
        if (adAction == null || TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if (obj instanceof Boolean) {
            adAction.addParam(str, (Boolean) obj);
        }
        if (obj instanceof Integer) {
            adAction.addParam(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            adAction.addParam(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            adAction.addParam(str, (String) obj);
        }
        if (obj instanceof JSONObject) {
            adAction.addParam(str, (JSONObject) obj);
        }
    }
}
