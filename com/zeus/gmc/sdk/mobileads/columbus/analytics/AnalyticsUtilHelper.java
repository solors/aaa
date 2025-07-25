package com.zeus.gmc.sdk.mobileads.columbus.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base.Actions;
import com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base.AdAction;
import com.zeus.gmc.sdk.mobileads.msa.analytics.pubsub.PubSubManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AnalyticsUtilHelper {
    private static volatile AnalyticsUtilHelper analyticsUtilHelper;
    private Context mContext;

    private AnalyticsUtilHelper(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void addParam(AdAction adAction, String str, Object obj) {
        if (adAction != null && !TextUtils.isEmpty(str) && obj != null) {
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

    public static AnalyticsUtilHelper getInstance(Context context) {
        if (analyticsUtilHelper == null) {
            synchronized (AnalyticsUtilHelper.class) {
                if (analyticsUtilHelper == null) {
                    analyticsUtilHelper = new AnalyticsUtilHelper(context);
                }
            }
        }
        return analyticsUtilHelper;
    }

    public static void init(Context context) {
        PubSubManager.init(context);
    }

    public static void setUploadInterval(Context context, int i) {
        PubSubManager.setUploadInterval(context, i);
    }

    public void trackAction(HashMap<String, Object> hashMap, List<String> list) {
        if (hashMap != null) {
            AdAction newAdAction = Actions.newAdAction("nativeAd", String.valueOf(hashMap.get("e")));
            if (list != null && list.size() > 0) {
                newAdAction.addAdMonitor(list);
            }
            String str = (String) hashMap.get("configKey");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            hashMap.remove("configKey");
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                addParam(newAdAction, entry.getKey(), entry.getValue());
            }
            com.zeus.gmc.sdk.mobileads.msa.analytics.AnalyticsUtilHelper.getInstance(this.mContext).trackAction("com.miui.systemAdSolution", str, newAdAction.getMap());
        }
    }
}
