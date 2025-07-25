package com.p551my.target;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.s5 */
/* loaded from: classes7.dex */
public final class C26084s5 {

    /* renamed from: a */
    public final Map f67854a;

    /* renamed from: b */
    public final Map f67855b;

    /* renamed from: c */
    public final long f67856c;

    /* renamed from: d */
    public final int f67857d;

    /* renamed from: e */
    public boolean f67858e;

    /* renamed from: com.my.target.s5$a */
    /* loaded from: classes7.dex */
    public static final class C26085a {

        /* renamed from: a */
        public final int f67859a;

        /* renamed from: b */
        public boolean f67860b = false;

        public C26085a(int i) {
            this.f67859a = i;
        }

        /* renamed from: a */
        public C26084s5 m42906a() {
            C26084s5 c26084s5 = new C26084s5(this.f67859a, "myTarget", 0);
            c26084s5.m42910a(this.f67860b);
            return c26084s5;
        }

        /* renamed from: b */
        public C26084s5 m42903b() {
            C26084s5 c26084s5 = new C26084s5(this.f67859a, "myTarget", 4);
            c26084s5.m42910a(this.f67860b);
            return c26084s5;
        }

        /* renamed from: a */
        public C26084s5 m42905a(String str, float f) {
            C26084s5 c26084s5 = new C26084s5(this.f67859a, str, 5);
            c26084s5.m42910a(this.f67860b);
            c26084s5.f67854a.put("priority", Float.valueOf(f));
            return c26084s5;
        }

        /* renamed from: a */
        public void m42904a(boolean z) {
            this.f67860b = z;
        }
    }

    public C26084s5(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        this.f67854a = hashMap;
        this.f67855b = new HashMap();
        this.f67857d = i2;
        this.f67856c = System.currentTimeMillis();
        hashMap.put("slot", Integer.valueOf(i));
        hashMap.put("network", str);
    }

    /* renamed from: a */
    public void m42912a(int i, long j) {
        Long l = (Long) this.f67855b.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        m42908b(i, j);
    }

    /* renamed from: b */
    public void m42909b() {
        m42908b(this.f67857d, System.currentTimeMillis() - this.f67856c);
    }

    /* renamed from: a */
    public String m42914a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : this.f67854a.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry entry2 : this.f67855b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", entry2.getKey());
                jSONObject2.put("value", entry2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public void m42907b(final Context context) {
        if (!this.f67858e) {
            AbstractC25846ja.m43680a("MetricMessage: Metrics sending disabled");
        } else if (this.f67855b.isEmpty()) {
            AbstractC25846ja.m43680a("MetricMessage: Metrics not send: empty");
        } else {
            C25834j1 m43096a = C26051r1.m43090b().m43096a();
            if (m43096a == null) {
                AbstractC25846ja.m43680a("MetricMessage: Metrics not send: basic info not collected");
                return;
            }
            this.f67854a.put("instanceId", m43096a.f67025a);
            this.f67854a.put("os", m43096a.f67026b);
            this.f67854a.put("osver", m43096a.f67027c);
            this.f67854a.put("app", m43096a.f67028d);
            this.f67854a.put("appver", m43096a.f67029e);
            this.f67854a.put("sdkver", m43096a.f67030f);
            AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.we
                @Override // java.lang.Runnable
                public final void run() {
                    C26084s5.this.m42911a(context);
                }
            });
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m42911a(Context context) {
        String m42914a = m42914a();
        AbstractC25846ja.m43680a("MetricMessage: Send metrics message - \n " + m42914a);
        C25626a2.m44246a().m44185a("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(m42914a.getBytes(StandardCharsets.UTF_8), 0), context);
    }

    /* renamed from: b */
    public void m42908b(int i, long j) {
        this.f67855b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: a */
    public static C26085a m42913a(int i) {
        return new C26085a(i);
    }

    /* renamed from: a */
    public void m42910a(boolean z) {
        this.f67858e = z;
    }
}
