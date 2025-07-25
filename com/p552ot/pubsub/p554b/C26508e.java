package com.p552ot.pubsub.p554b;

import android.text.TextUtils;
import com.p552ot.pubsub.BuildConfig;
import com.p552ot.pubsub.p559g.C26549l;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.p552ot.pubsub.p561i.p562a.C26560b;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26587k;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26599t;
import com.p552ot.pubsub.util.DeviceUtil;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.b.e */
/* loaded from: classes7.dex */
public class C26508e {

    /* renamed from: a */
    public static final String f69328a = "l";

    /* renamed from: b */
    private static final String f69329b = "CommonConfigUpdater";

    /* renamed from: c */
    private static final String f69330c = "t";

    /* renamed from: d */
    private static final String f69331d = "levels";

    /* renamed from: e */
    private static final String f69332e = "Android";

    /* renamed from: f */
    private static ConcurrentHashMap<Integer, Integer> f69333f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static final long f69334g = 172800000;

    /* renamed from: a */
    public static void m41415a() {
        C26580e.m41105a(new RunnableC26509f());
    }

    /* renamed from: b */
    public static void m41413b() {
        if (m41411d()) {
            m41410e();
        } else {
            C26586j.m41080a(f69329b, "CommonConfigUpdater Does not meet prerequisites for request");
        }
    }

    /* renamed from: c */
    public static Map<Integer, Integer> m41412c() {
        try {
        } catch (Exception e) {
            C26586j.m41080a(f69329b, "getLevelIntervalConfig: " + e.toString());
        }
        if (!f69333f.isEmpty()) {
            return f69333f;
        }
        String m40971h = C26599t.m40971h();
        if (!TextUtils.isEmpty(m40971h)) {
            JSONArray optJSONArray = new JSONObject(m40971h).optJSONArray(f69331d);
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("l");
                int optInt2 = jSONObject.optInt("t");
                if (optInt > 0 && optInt2 > 0) {
                    f69333f.put(Integer.valueOf(optInt), Integer.valueOf(optInt2));
                }
            }
        }
        if (f69333f.isEmpty()) {
            return m41409f();
        }
        return f69333f;
    }

    /* renamed from: d */
    private static boolean m41411d() {
        if (!C26587k.m41063a()) {
            C26586j.m41074b(f69329b, "net is not connected!");
            return false;
        } else if (TextUtils.isEmpty(C26599t.m40971h())) {
            return true;
        } else {
            long m40969i = C26599t.m40969i();
            if (m40969i >= System.currentTimeMillis() && m40969i - System.currentTimeMillis() <= f69334g) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: e */
    private static void m41410e() {
        String str;
        if (C26590l.m41044c(f69329b)) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("ov", C26590l.m41043d());
            hashMap.put(C26517m.f69364c, C26590l.m41045c());
            if (C26590l.m41039h()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("ii", str);
            hashMap.put(C26517m.f69366e, BuildConfig.SDK_VERSION);
            hashMap.put(C26517m.f69374m, C26577b.m41114c());
            hashMap.put("av", C26590l.m41042e());
            hashMap.put(C26517m.f69368g, DeviceUtil.m41132a());
            hashMap.put("re", C26590l.m41038i());
            hashMap.put("platform", "Android");
            String m41230d = C26549l.m41237a().m41230d();
            String m41185a = C26560b.m41185a(m41230d, (Map<String, String>) hashMap, true);
            C26586j.m41080a(f69329b, "url:" + m41230d + " response:" + m41185a);
            m41414a(m41185a);
        } catch (IOException e) {
            C26586j.m41080a(f69329b, "requestCloudData: " + e.toString());
        }
    }

    /* renamed from: f */
    private static HashMap<Integer, Integer> m41409f() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1000);
        hashMap.put(2, 15000);
        hashMap.put(3, Integer.valueOf((int) TimeUtils.FIFTEEN_MINUTES_IN_MS));
        return hashMap;
    }

    /* renamed from: a */
    private static void m41414a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(C26559a.f69635d) == 0) {
                String optString = jSONObject.optString(C26559a.f69636e);
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("regionUrl");
                    if (optJSONObject2 != null) {
                        C26549l.m41237a().m41235a(optJSONObject2);
                    }
                    C26599t.m40974f(optJSONObject.toString());
                    C26599t.m40970h(optString);
                }
                C26599t.m40979d(System.currentTimeMillis() + 86400000 + new Random().nextInt(86400000));
            }
        } catch (JSONException e) {
            C26586j.m41080a(f69329b, "saveCommonCloudData: " + e.toString());
        }
    }
}
