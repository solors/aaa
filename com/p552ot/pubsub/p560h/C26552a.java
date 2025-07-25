package com.p552ot.pubsub.p560h;

import android.content.Context;
import android.text.TextUtils;
import com.p552ot.pubsub.BuildConfig;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p553a.C26485b;
import com.p552ot.pubsub.p554b.C26502a;
import com.p552ot.pubsub.p559g.C26537b;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26587k;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26596q;
import com.p552ot.pubsub.util.C26599t;
import com.p552ot.pubsub.util.C26601v;
import com.p552ot.pubsub.util.DeviceUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.h.a */
/* loaded from: classes7.dex */
public class C26552a {

    /* renamed from: a */
    protected static final int f69574a = 1;

    /* renamed from: b */
    public static final int f69575b = 0;

    /* renamed from: c */
    public static final int f69576c = 1;

    /* renamed from: d */
    public static final int f69577d = 2;

    /* renamed from: e */
    private static final String f69578e = "BaseMessage";

    /* renamed from: f */
    private String f69579f;

    /* renamed from: g */
    private long f69580g;

    /* renamed from: h */
    private String f69581h;

    /* renamed from: i */
    private String f69582i;

    /* renamed from: j */
    private String f69583j;

    /* renamed from: k */
    private int f69584k;

    /* renamed from: l */
    private JSONObject f69585l;

    /* renamed from: m */
    private long f69586m;

    /* renamed from: com.ot.pubsub.h.a$a */
    /* loaded from: classes7.dex */
    public static class C26553a {

        /* renamed from: a */
        private long f69587a;

        /* renamed from: b */
        private String f69588b;

        /* renamed from: c */
        private String f69589c;

        /* renamed from: d */
        private String f69590d;

        /* renamed from: e */
        private int f69591e;

        /* renamed from: f */
        private JSONObject f69592f;

        /* renamed from: g */
        private long f69593g;

        /* renamed from: a */
        public C26553a m41202a(long j) {
            this.f69587a = this.f69587a;
            return this;
        }

        /* renamed from: b */
        public C26553a m41196b(String str) {
            this.f69589c = str;
            return this;
        }

        /* renamed from: c */
        public C26553a m41194c(String str) {
            this.f69590d = str;
            return this;
        }

        /* renamed from: a */
        public C26553a m41200a(String str) {
            this.f69588b = str;
            return this;
        }

        /* renamed from: b */
        public C26553a m41198b(long j) {
            this.f69593g = j;
            return this;
        }

        /* renamed from: a */
        public C26553a m41203a(int i) {
            this.f69591e = i;
            return this;
        }

        /* renamed from: a */
        public C26553a m41199a(JSONObject jSONObject) {
            this.f69592f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C26552a m41204a() {
            return new C26552a(this);
        }
    }

    /* renamed from: com.ot.pubsub.h.a$b */
    /* loaded from: classes7.dex */
    static class C26554b {

        /* renamed from: a */
        static final String f69594a = "protocol_ver";

        C26554b() {
        }
    }

    /* renamed from: com.ot.pubsub.h.a$c */
    /* loaded from: classes7.dex */
    public static class C26555c {

        /* renamed from: A */
        public static String f69595A = "ot_privacy_policy";

        /* renamed from: B */
        public static String f69596B = "market_name";

        /* renamed from: C */
        public static String f69597C = "ot_hybrid_type";

        /* renamed from: a */
        public static String f69598a = "event";

        /* renamed from: b */
        public static String f69599b = "oaid";

        /* renamed from: c */
        public static String f69600c = "gaid";

        /* renamed from: d */
        public static String f69601d = "instance_id";

        /* renamed from: e */
        public static String f69602e = "mfrs";

        /* renamed from: f */
        public static String f69603f = "model";

        /* renamed from: g */
        public static String f69604g = "platform";

        /* renamed from: h */
        public static String f69605h = "miui";

        /* renamed from: i */
        public static String f69606i = "build";

        /* renamed from: j */
        public static String f69607j = "os_ver";

        /* renamed from: k */
        public static String f69608k = "app_id";

        /* renamed from: l */
        public static String f69609l = "app_ver";

        /* renamed from: m */
        public static String f69610m = "pkg";

        /* renamed from: n */
        public static String f69611n = "channel";

        /* renamed from: o */
        public static String f69612o = "e_ts";

        /* renamed from: p */
        public static String f69613p = "tz";

        /* renamed from: q */
        public static String f69614q = "net";

        /* renamed from: r */
        public static String f69615r = "region";

        /* renamed from: s */
        public static String f69616s = "plugin_id";

        /* renamed from: t */
        public static String f69617t = "sdk_ver";

        /* renamed from: u */
        public static String f69618u = "uid";

        /* renamed from: v */
        public static String f69619v = "uid_type";

        /* renamed from: w */
        public static String f69620w = "sid";

        /* renamed from: x */
        public static String f69621x = "sdk_mode";

        /* renamed from: y */
        public static String f69622y = "ot_first_day";

        /* renamed from: z */
        public static String f69623z = "ot_test_env";

        C26555c() {
        }
    }

    /* renamed from: a */
    public long m41223a() {
        return this.f69580g;
    }

    /* renamed from: b */
    public String m41216b() {
        return this.f69581h;
    }

    /* renamed from: c */
    public String m41213c() {
        return this.f69582i;
    }

    /* renamed from: d */
    public String m41211d() {
        return this.f69583j;
    }

    /* renamed from: e */
    public int m41209e() {
        return this.f69584k;
    }

    /* renamed from: f */
    public JSONObject m41208f() {
        return this.f69585l;
    }

    /* renamed from: g */
    public long m41207g() {
        return this.f69586m;
    }

    /* renamed from: h */
    public String m41206h() {
        return this.f69579f;
    }

    /* renamed from: i */
    public boolean m41205i() {
        try {
            JSONObject jSONObject = this.f69585l;
            if (jSONObject != null && jSONObject.has(C26485b.f69245b) && this.f69585l.has(C26485b.f69244a) && !TextUtils.isEmpty(this.f69581h)) {
                if (!TextUtils.isEmpty(this.f69582i)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            C26586j.m41073b(f69578e, "check event isValid error, ", e);
            return false;
        }
    }

    public C26552a() {
    }

    /* renamed from: a */
    public void m41221a(long j) {
        this.f69580g = j;
    }

    /* renamed from: b */
    public void m41214b(String str) {
        this.f69582i = str;
    }

    /* renamed from: c */
    public void m41212c(String str) {
        this.f69583j = str;
    }

    /* renamed from: d */
    public void m41210d(String str) {
        this.f69579f = str;
    }

    private C26552a(C26553a c26553a) {
        this.f69580g = c26553a.f69587a;
        this.f69581h = c26553a.f69588b;
        this.f69582i = c26553a.f69589c;
        this.f69583j = c26553a.f69590d;
        this.f69584k = c26553a.f69591e;
        this.f69585l = c26553a.f69592f;
        this.f69586m = c26553a.f69593g;
    }

    /* renamed from: a */
    public void m41220a(String str) {
        this.f69581h = str;
    }

    /* renamed from: b */
    public void m41215b(long j) {
        this.f69586m = j;
    }

    /* renamed from: a */
    public void m41222a(int i) {
        this.f69584k = i;
    }

    /* renamed from: a */
    public void m41217a(JSONObject jSONObject) {
        this.f69585l = jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m41219a(String str, Configuration configuration, PubSubTrack.IEventHook iEventHook, C26596q c26596q) throws JSONException {
        return m41218a(str, configuration, iEventHook, "", c26596q);
    }

    /* renamed from: a */
    public static JSONObject m41218a(String str, Configuration configuration, PubSubTrack.IEventHook iEventHook, String str2, C26596q c26596q) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context m41116b = C26577b.m41116b();
        jSONObject.put(C26555c.f69598a, str);
        if (iEventHook != null && iEventHook.isRecommendEvent(str)) {
            String m41131a = DeviceUtil.m41131a(m41116b);
            if (!TextUtils.isEmpty(m41131a)) {
                jSONObject.put(C26555c.f69600c, m41131a);
            }
        }
        jSONObject.put(C26555c.f69601d, C26537b.m41287a().m41284b());
        jSONObject.put(C26555c.f69602e, DeviceUtil.m41128c());
        jSONObject.put(C26555c.f69603f, DeviceUtil.m41132a());
        jSONObject.put(C26555c.f69604g, "Android");
        jSONObject.put(C26555c.f69605h, C26590l.m41043d());
        jSONObject.put(C26555c.f69606i, C26590l.m41045c());
        jSONObject.put(C26555c.f69607j, C26590l.m41042e());
        jSONObject.put(C26555c.f69609l, C26577b.m41114c());
        jSONObject.put(C26555c.f69612o, System.currentTimeMillis());
        jSONObject.put(C26555c.f69613p, C26590l.m41047b());
        jSONObject.put(C26555c.f69614q, C26587k.m41059b(m41116b).toString());
        String m41038i = C26590l.m41038i();
        C26502a.m41443a().m41422d(m41038i);
        jSONObject.put(C26555c.f69615r, m41038i);
        jSONObject.put(C26555c.f69617t, BuildConfig.SDK_VERSION);
        jSONObject.put(C26555c.f69608k, configuration.getAppId());
        jSONObject.put(C26555c.f69610m, C26577b.m41111e());
        jSONObject.put(C26555c.f69611n, !TextUtils.isEmpty(configuration.getChannel()) ? configuration.getChannel() : "default");
        jSONObject.put(C26555c.f69620w, C26590l.m41041f());
        jSONObject.put(C26555c.f69621x, "sdk");
        jSONObject.put(C26555c.f69622y, C26601v.m40950d(C26599t.m40973g()));
        if (C26586j.f69736c) {
            jSONObject.put(C26555c.f69623z, true);
        }
        jSONObject.put(C26555c.f69595A, c26596q.m41014a());
        jSONObject.put(C26555c.f69596B, DeviceUtil.m41129b());
        return jSONObject;
    }
}
