package com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32462ciiio2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cciccio.C32530coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.experience.DataManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.coi222o222 */
/* loaded from: classes8.dex */
public class C32646coi222o222 {
    private static final String c2oc2i = "logevents";
    private static final int c2oc2o = 600000;
    private static long cioccoiococ = 0;
    public static final List<String> coi222o222 = new ArrayList();
    private static final String coo2iico = "AdEventConfig";

    private C32646coi222o222() {
    }

    public static synchronized boolean coi222o222(String str) {
        synchronized (C32646coi222o222.class) {
            try {
                C32530coi222o222.cioccoiococ().c2oc2i();
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "isReportAdEvent:", e);
            }
            if (C32647coo2iico.cc2o22co2c.contains(str)) {
                return true;
            }
            long j = cioccoiococ;
            if (j == 0 || C32462ciiio2o.coo2iico(j, 600000L)) {
                String cache = ConfigCache.getInstance().getCache();
                if (!TextUtils.isEmpty(cache) && cache.startsWith("{")) {
                    coo2iico(new JSONObject(cache).optJSONArray(c2oc2i));
                    cioccoiococ = System.currentTimeMillis();
                }
                return false;
            }
            if (coi222o222.contains(str)) {
                if (DataManager.getUserExperienceFlag(GlobalHolder.getApplicationContext())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized Boolean coo2iico(String str) {
        Boolean valueOf;
        synchronized (C32646coi222o222.class) {
            try {
                valueOf = Boolean.valueOf(coi222o222.contains(str));
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "isContains:", e);
                return Boolean.FALSE;
            }
        }
        return valueOf;
    }

    private static synchronized void coo2iico(JSONArray jSONArray) {
        synchronized (C32646coi222o222.class) {
            if (jSONArray == null) {
                MLog.m25887i(coo2iico, "jsonArray is null");
                return;
            }
            coi222o222.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String optString = jSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        MLog.m25892d(coo2iico, "logEvent: " + optString);
                        coi222o222.add(optString);
                    }
                } catch (Exception e) {
                    MLog.m25888e(coo2iico, "LogEventsConfigResponse saveToList error", e);
                }
            }
            AdJumpHandlerUtils.addAllConfigEvents(coi222o222);
        }
    }
}
