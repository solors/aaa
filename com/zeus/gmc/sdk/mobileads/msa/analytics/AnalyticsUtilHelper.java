package com.zeus.gmc.sdk.mobileads.msa.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnaaata.C32810atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa.C32815atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa.C32816atntntntanaan;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public class AnalyticsUtilHelper {
    private static final String atnntnannta = "AnalyticsUtilHelper";
    private static volatile AnalyticsUtilHelper atntntntanaan;
    private Context atntaanaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.AnalyticsUtilHelper$atnntnannta */
    /* loaded from: classes8.dex */
    public class RunnableC32796atnntnannta implements Runnable {
        final /* synthetic */ String atnntnannta;
        final /* synthetic */ Map atntntntanaan;

        RunnableC32796atnntnannta(String str, Map map) {
            this.atnntnannta = str;
            this.atntntntanaan = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean atnntnannta = new C32815atnntnannta(this.atnntnannta, this.atntntntanaan, AnalyticsUtilHelper.this).atnntnannta();
            C32821atntntntanaan.atnntnannta(AnalyticsUtilHelper.atnntnannta, "moitor success=" + atnntnannta);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.AnalyticsUtilHelper$atntntntanaan */
    /* loaded from: classes8.dex */
    public class RunnableC32797atntntntanaan implements Runnable {
        final /* synthetic */ List atnntnannta;
        final /* synthetic */ Map atntntntanaan;

        RunnableC32797atntntntanaan(List list, Map map) {
            this.atnntnannta = list;
            this.atntntntanaan = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.atnntnannta) {
                boolean atnntnannta = new C32815atnntnannta(str, this.atntntntanaan, AnalyticsUtilHelper.this).atnntnannta();
                C32821atntntntanaan.atnntnannta(AnalyticsUtilHelper.atnntnannta, "moitor success=" + atnntnannta);
            }
        }
    }

    private AnalyticsUtilHelper(Context context) {
        this.atntaanaa = context;
    }

    private List<String> atnntnannta(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                C32821atntntntanaan.atnntnannta(atnntnannta, "Moitor init url = \n" + str);
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains("api.ad.xiaomi.com") && !str.contains("_sn_")) {
                        str = str.contains("?") ? str + "&_sn_=" + UUID.randomUUID().toString() : str + "?_sn_=" + UUID.randomUUID().toString();
                    }
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static AnalyticsUtilHelper getInstance(Context context) {
        if (atntntntanaan == null) {
            synchronized (AnalyticsUtilHelper.class) {
                if (atntntntanaan == null) {
                    atntntntanaan = new AnalyticsUtilHelper(context);
                }
            }
        }
        return atntntntanaan;
    }

    public void trackAction(String str, String str2, Map<String, Object> map) {
        if (map != null) {
            try {
                map.put(C32805atnntnannta.atntntntanaan, str2);
                map.put(C32805atnntnannta.atnannttnnata, str);
                List<String> list = (List) map.get(C32805atnntnannta.atntatt);
                if (list != null && list.size() > 0) {
                    Integer num = 1;
                    Object obj = map.get("parallelism");
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    Object obj2 = map.get(C32805atnntnannta.atnattat);
                    if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                        atnntnannta(list, num.intValue(), new HashMap(map));
                    } else {
                        atnntnannta(list, num.intValue(), null);
                    }
                }
                map.remove(C32805atnntnannta.atntatt);
                map.remove("parallelism");
                map.remove(C32805atnntnannta.atnattat);
            } catch (Exception e) {
                C32821atntntntanaan.atntntntanaan(atnntnannta, "get monitors :", e);
            }
            C32810atnntnannta.atnntnannta().atnntnannta(this.atntaanaa, map);
        }
    }

    private void atnntnannta(List<String> list, int i, Map<String, Object> map) {
        List<String> atnntnannta2 = atnntnannta(list);
        if (i > 1) {
            for (String str : atnntnannta2) {
                C32816atntntntanaan.atnntnannta(new RunnableC32796atnntnannta(str, map));
            }
            return;
        }
        C32816atntntntanaan.atnntnannta(new RunnableC32797atntntntanaan(atnntnannta2, map));
    }

    public void trackAction(Map<String, Object> map) {
        if (map != null) {
            C32810atnntnannta.atnntnannta().atnntnannta(this.atntaanaa, map);
        }
    }
}
