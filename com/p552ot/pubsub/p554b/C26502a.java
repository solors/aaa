package com.p552ot.pubsub.p554b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.b.a */
/* loaded from: classes7.dex */
public class C26502a {

    /* renamed from: a */
    public static final String f69295a = "disable_log";

    /* renamed from: b */
    public static final String f69296b = "event";

    /* renamed from: c */
    public static final String f69297c = "events";

    /* renamed from: d */
    public static final String f69298d = "level";

    /* renamed from: e */
    public static final String f69299e = "sample";

    /* renamed from: f */
    public static final String f69300f = "needIds";

    /* renamed from: g */
    public static final String f69301g = "bannedParams";

    /* renamed from: h */
    public static final String f69302h = "version";

    /* renamed from: i */
    private static final String f69303i = "AppConfigUpdater";

    /* renamed from: j */
    private static final long f69304j = 172800000;

    /* renamed from: k */
    private static final String f69305k = "hash";

    /* renamed from: l */
    private static final String f69306l = "appId";

    /* renamed from: m */
    private static final String f69307m = "apps";

    /* renamed from: n */
    private static final String f69308n = "type";

    /* renamed from: o */
    private static final String f69309o = "status";

    /* renamed from: p */
    private static final String f69310p = "deleted";

    /* renamed from: q */
    private static final String f69311q = "Android";

    /* renamed from: s */
    private static final int f69313s = 0;

    /* renamed from: t */
    private static final int f69314t = 1;

    /* renamed from: u */
    private static final int f69315u = 2;

    /* renamed from: v */
    private static final int f69316v = 100;

    /* renamed from: x */
    private static final long f69318x = 1800000;

    /* renamed from: z */
    private static final int f69320z = 0;

    /* renamed from: r */
    private static AtomicBoolean f69312r = new AtomicBoolean(false);

    /* renamed from: w */
    private static ConcurrentHashMap<String, Long> f69317w = new ConcurrentHashMap<>();

    /* renamed from: y */
    private static HandlerC26504b f69319y = new HandlerC26504b(Looper.getMainLooper(), null);

    /* renamed from: A */
    private static ConcurrentHashMap<String, Boolean> f69292A = new ConcurrentHashMap<>();

    /* renamed from: B */
    private static ConcurrentHashMap<String, Boolean> f69293B = new ConcurrentHashMap<>();

    /* renamed from: C */
    private static String f69294C = "";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.b.a$a */
    /* loaded from: classes7.dex */
    public static class C26503a {

        /* renamed from: a */
        private static final C26502a f69321a = new C26502a(null);

        private C26503a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.b.a$b */
    /* loaded from: classes7.dex */
    public static class HandlerC26504b extends Handler {
        /* synthetic */ HandlerC26504b(Looper looper, RunnableC26505b runnableC26505b) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C26586j.m41080a(C26502a.f69303i, "ScheduleCloudHandler.handleMessage, msg.what=" + message.what);
            if (message.what == 0) {
                Object obj = message.obj;
                if (obj != null) {
                    try {
                        String str = (String) obj;
                        C26586j.m41080a(C26502a.f69303i, "ScheduleCloudHandler.handleMessage, appId: " + str);
                        C26580e.m41105a(new RunnableC26507d(this, str));
                        return;
                    } catch (Exception e) {
                        C26586j.m41074b(C26502a.f69303i, "handleMessage error: " + e.getMessage());
                        return;
                    }
                }
                C26586j.m41080a(C26502a.f69303i, "ScheduleCloudHandler.handleMessage, msg.obj is null");
            }
        }

        private HandlerC26504b(Looper looper) {
            super(looper);
        }
    }

    /* synthetic */ C26502a(RunnableC26505b runnableC26505b) {
        this();
    }

    /* renamed from: d */
    private static void m41421d(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            f69317w.put(list.get(i), Long.valueOf(System.currentTimeMillis() + f69318x));
        }
    }

    /* renamed from: f */
    private static boolean m41419f(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f69293B;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str) && f69293B.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m41418g(String str) {
        if (!C26587k.m41063a()) {
            C26586j.m41080a(f69303i, "net is not connected!");
            return false;
        }
        C26516l m41388f = C26511h.m41408a().m41388f(str);
        if (m41388f == null) {
            return true;
        }
        long j = m41388f.f69359c;
        if (j >= System.currentTimeMillis() && j - System.currentTimeMillis() <= f69304j && !m41419f(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m41417h(String str) {
        Long l = f69317w.get(str);
        if (l != null && l.longValue() - System.currentTimeMillis() >= 0 && l.longValue() - System.currentTimeMillis() <= f69318x) {
            return false;
        }
        return true;
    }

    private C26502a() {
        String m40965l = C26599t.m40965l();
        if (!TextUtils.isEmpty(m40965l)) {
            f69294C = m40965l;
            return;
        }
        String m41038i = C26590l.m41038i();
        if (TextUtils.isEmpty(m41038i)) {
            return;
        }
        f69294C = m41038i;
        C26599t.m40968i(m41038i);
    }

    /* renamed from: a */
    public static C26502a m41443a() {
        return C26503a.f69321a;
    }

    /* renamed from: b */
    public void m41429b(String str) {
        C26580e.m41105a(new RunnableC26505b(this, str));
    }

    /* renamed from: c */
    public void m41424c(String str) {
        if (m41418g(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m41428b(arrayList);
            return;
        }
        C26586j.m41080a(f69303i, "AppConfigUpdater Does not meet prerequisites for request");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m41428b(List<String> list) {
        C26586j.m41080a(f69303i, "pullCloudData start, appIds: " + list.toString());
        if (C26590l.m41044c(f69303i)) {
            return;
        }
        if (f69312r.compareAndSet(false, true)) {
            HashMap hashMap = new HashMap();
            try {
                try {
                    String m41038i = C26590l.m41038i();
                    if (!TextUtils.isEmpty(m41038i)) {
                        f69294C = m41038i;
                        C26599t.m40968i(m41038i);
                    }
                    hashMap.put("ov", C26590l.m41043d());
                    hashMap.put(C26517m.f69364c, C26590l.m41045c());
                    hashMap.put("ii", C26590l.m41039h() ? "1" : "0");
                    hashMap.put(C26517m.f69366e, BuildConfig.SDK_VERSION);
                    hashMap.put(C26517m.f69374m, C26577b.m41114c());
                    hashMap.put("av", C26590l.m41042e());
                    hashMap.put(C26517m.f69368g, DeviceUtil.m41132a());
                    hashMap.put("re", m41038i);
                    hashMap.put(C26517m.f69370i, m41423c(list));
                    hashMap.put(C26517m.f69371j, C26577b.m41111e());
                    hashMap.put("platform", "Android");
                    hashMap.put(C26517m.f69375n, "1");
                    String m41229e = C26549l.m41237a().m41229e();
                    C26586j.m41080a(f69303i, "pullData:" + m41229e);
                    String m41185a = C26560b.m41185a(m41229e, (Map<String, String>) hashMap, true);
                    C26586j.m41080a(f69303i, "response:" + m41185a);
                    m41441a(m41185a, list);
                } catch (Exception e) {
                    C26586j.m41074b(f69303i, "pullCloudData error: " + e.getMessage());
                }
            } finally {
                f69312r.set(false);
            }
        }
    }

    /* renamed from: a */
    public void m41442a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f69293B.put(str, Boolean.FALSE);
    }

    /* renamed from: d */
    public void m41422d(String str) {
        if (TextUtils.isEmpty(f69294C) || TextUtils.isEmpty(str) || TextUtils.equals(f69294C, str)) {
            return;
        }
        for (Map.Entry<String, Boolean> entry : f69293B.entrySet()) {
            entry.setValue(Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public static void m41441a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(C26559a.f69635d) == 0) {
                m41421d(list);
                m41435a(jSONObject.optJSONObject("data").optJSONArray(f69307m), list);
            }
        } catch (Exception e) {
            C26586j.m41080a(f69303i, "saveAppCloudData: " + e.toString());
        }
    }

    /* renamed from: c */
    private static String m41423c(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                jSONObject.put("appId", str);
                if (m41419f(str)) {
                    jSONObject.put("hash", "");
                } else {
                    jSONObject.put("hash", C26511h.m41408a().m41390d(str));
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    private static void m41435a(JSONArray jSONArray, List<String> list) throws JSONException {
        C26586j.m41080a(f69303i, "updateDataToDb start");
        long currentTimeMillis = System.currentTimeMillis() + 86400000 + new Random().nextInt(86400000);
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject == null ? "" : optJSONObject.optString("appId");
                C26586j.m41080a(f69303i, "appId: " + optString);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                    m41439a(optString, optJSONObject, currentTimeMillis);
                }
            }
            m41436a(list, currentTimeMillis, arrayList);
            for (String str : list) {
                f69293B.put(str, Boolean.FALSE);
            }
            return;
        }
        m41437a(list, currentTimeMillis);
    }

    /* renamed from: a */
    private static void m41439a(String str, JSONObject jSONObject, long j) throws JSONException {
        int optInt = jSONObject == null ? 0 : jSONObject.optInt("version");
        int m41389e = C26511h.m41408a().m41389e(str);
        C26586j.m41080a(f69303i, "local version: " + m41389e + ", server version: " + optInt);
        if (m41389e > 0 && optInt <= m41389e && !m41419f(str)) {
            m41432a(jSONObject, j);
            return;
        }
        int optInt2 = jSONObject != null ? jSONObject.optInt("type") : -1;
        C26586j.m41080a(f69303i, "type: " + optInt2);
        if (optInt2 == 0 || optInt2 == 1 || m41419f(str)) {
            m41431a(jSONObject, j, optInt);
        } else if (optInt2 == 2) {
            m41426b(jSONObject, j);
        } else {
            C26586j.m41080a(f69303i, "handleData do nothing!");
        }
    }

    /* renamed from: b */
    private static void m41426b(JSONObject jSONObject, long j) {
        ArrayList<C26516l> arrayList = new ArrayList<>();
        if (jSONObject != null && jSONObject.has("events")) {
            C26516l c26516l = new C26516l();
            c26516l.f69360d = jSONObject.optString("hash");
            String optString = jSONObject.optString("appId");
            c26516l.f69357a = optString;
            c26516l.f69358b = m41427b(jSONObject);
            c26516l.f69359c = j;
            c26516l.f69361e = m41440a(optString, jSONObject);
            arrayList.add(c26516l);
        } else {
            C26586j.m41080a(f69303i, "handleIncrementalUpdate config is not change!");
        }
        if (!arrayList.isEmpty()) {
            C26511h.m41408a().m41398a(arrayList);
        } else {
            C26586j.m41080a(f69303i, "handleIncrementalUpdate no configuration can be updated!");
        }
    }

    /* renamed from: a */
    private static void m41432a(JSONObject jSONObject, long j) {
        ArrayList<C26516l> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            C26516l c26516l = new C26516l();
            c26516l.f69357a = jSONObject.optString("appId");
            c26516l.f69359c = j;
            arrayList.add(c26516l);
        }
        if (!arrayList.isEmpty()) {
            C26511h.m41408a().m41398a(arrayList);
        } else {
            C26586j.m41080a(f69303i, "updateMinVersionData no timestamp can be updated!");
        }
    }

    /* renamed from: b */
    private static int m41427b(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt(f69299e, 100);
            if (optInt < 0 || optInt > 100) {
                return 100;
            }
            return optInt;
        } catch (Exception e) {
            C26586j.m41080a(f69303i, "getCommonSample Exception:" + e.getMessage());
            return 100;
        }
    }

    /* renamed from: a */
    private static void m41431a(JSONObject jSONObject, long j, int i) throws JSONException {
        C26516l m41388f;
        JSONObject jSONObject2;
        ArrayList<C26516l> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            C26516l c26516l = new C26516l();
            c26516l.f69360d = jSONObject.optString("hash");
            c26516l.f69357a = jSONObject.optString("appId");
            c26516l.f69358b = m41427b(jSONObject);
            c26516l.f69359c = j;
            if (!jSONObject.has("events") && (m41388f = C26511h.m41408a().m41388f(c26516l.f69357a)) != null && (jSONObject2 = m41388f.f69361e) != null && jSONObject2.optJSONArray("events") != null) {
                jSONObject.put("events", m41388f.f69361e.optJSONArray("events"));
            }
            c26516l.f69361e = jSONObject;
            arrayList.add(c26516l);
        }
        if (!arrayList.isEmpty()) {
            C26511h.m41408a().m41398a(arrayList);
        } else {
            C26586j.m41080a(f69303i, "handleFullOrNoNewData no configuration can be updated!");
        }
    }

    /* renamed from: a */
    private static JSONObject m41440a(String str, JSONObject jSONObject) {
        try {
            C26516l m41388f = C26511h.m41408a().m41388f(str);
            jSONObject.put("events", m41434a(m41388f != null ? m41388f.f69361e.optJSONArray("events") : null, jSONObject.optJSONArray("events")));
            return jSONObject;
        } catch (Exception e) {
            C26586j.m41074b(f69303i, "mergeConfig: " + e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static JSONArray m41434a(JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        while (jSONArray2 != null) {
            try {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                String optString = optJSONObject.optString("event");
                int i2 = 0;
                while (true) {
                    if (jSONArray == null || i2 >= jSONArray.length()) {
                        break;
                    } else if (TextUtils.equals(optString, jSONArray.optJSONObject(i2).optString("event"))) {
                        jSONArray.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!optJSONObject.has("status") || (optJSONObject.has("status") && !TextUtils.equals(optJSONObject.optString("status"), f69310p))) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    jSONArray.put(optJSONObject);
                }
                i++;
            } catch (Exception e) {
                C26586j.m41074b(f69303i, "mergeEventsElement error:" + e.toString());
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static void m41436a(List<String> list, long j, List<String> list2) {
        try {
            if (list.size() != list2.size()) {
                list.removeAll(list2);
                m41437a(list, j);
            }
        } catch (Exception e) {
            C26586j.m41074b(f69303i, "handleInvalidAppIds error:" + e.toString());
        }
    }

    /* renamed from: a */
    private static void m41437a(List<String> list, long j) {
        try {
            ArrayList<C26516l> arrayList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                C26516l c26516l = new C26516l();
                c26516l.f69357a = list.get(i);
                c26516l.f69358b = 100L;
                c26516l.f69359c = j;
                arrayList.add(c26516l);
            }
            C26511h.m41408a().m41398a(arrayList);
        } catch (Exception e) {
            C26586j.m41074b(f69303i, "handleError" + e.toString());
        }
    }

    /* renamed from: a */
    public void m41433a(JSONObject jSONObject) {
        C26580e.m41105a(new RunnableC26506c(this, jSONObject));
    }
}
