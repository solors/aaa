package com.p552ot.pubsub.p555c;

import android.content.Context;
import android.text.TextUtils;
import com.p552ot.pubsub.p559g.C26549l;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.p552ot.pubsub.p561i.p562a.C26560b;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26599t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.c.f */
/* loaded from: classes7.dex */
public class C26526f {

    /* renamed from: a */
    public static final JSONObject f69414a = new JSONObject();

    /* renamed from: b */
    private static final String f69415b = "SecretKeyManager";

    /* renamed from: c */
    private static final String f69416c = "secretKey";

    /* renamed from: d */
    private static final String f69417d = "sid";

    /* renamed from: e */
    private static final String f69418e = "key";

    /* renamed from: f */
    private Context f69419f;

    /* renamed from: g */
    private JSONObject f69420g;

    /* renamed from: h */
    private String[] f69421h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.c.f$a */
    /* loaded from: classes7.dex */
    public static final class C26527a {

        /* renamed from: a */
        private static final C26526f f69422a = new C26526f();

        private C26527a() {
        }
    }

    /* renamed from: a */
    public static C26526f m41324a() {
        return C26527a.f69422a;
    }

    /* renamed from: d */
    private void m41321d() {
        if (C26586j.f69734a) {
            if (!TextUtils.isEmpty(this.f69421h[0]) && !TextUtils.isEmpty(this.f69421h[1])) {
                C26586j.m41080a(f69415b, "key  and sid is valid! ");
            } else {
                C26586j.m41080a(f69415b, "key or sid is invalid!");
            }
        }
    }

    /* renamed from: e */
    private JSONObject m41320e() {
        JSONObject jSONObject = this.f69420g;
        if (jSONObject == null && (jSONObject = m41319f()) != null) {
            this.f69420g = jSONObject;
        }
        if (jSONObject == null) {
            return m41322c();
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONObject m41319f() {
        try {
            String m40980d = C26599t.m40980d();
            if (TextUtils.isEmpty(m40980d)) {
                return null;
            }
            return new JSONObject(C26522b.m41355b(this.f69419f, m40980d));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public synchronized String[] m41323b() {
        String str;
        String str2;
        JSONObject m41320e = m41320e();
        String[] strArr = this.f69421h;
        if (m41320e != null) {
            str = m41320e.optString("key");
        } else {
            str = "";
        }
        strArr[0] = str;
        String[] strArr2 = this.f69421h;
        if (m41320e != null) {
            str2 = m41320e.optString("sid");
        } else {
            str2 = "";
        }
        strArr2[1] = str2;
        m41321d();
        return this.f69421h;
    }

    /* renamed from: c */
    public JSONObject m41322c() {
        try {
        } catch (Exception e) {
            C26586j.m41074b(f69415b, "requestSecretData: " + e.toString());
        }
        if (C26590l.m41044c(f69415b)) {
            return f69414a;
        }
        byte[] m41374a = C26521a.m41374a();
        String m41352a = C26523c.m41352a(C26525e.m41327a(m41374a));
        HashMap hashMap = new HashMap();
        hashMap.put(f69416c, m41352a);
        String m41185a = C26560b.m41185a(C26549l.m41237a().m41231c(), (Map<String, String>) hashMap, true);
        if (!TextUtils.isEmpty(m41185a)) {
            JSONObject jSONObject = new JSONObject(m41185a);
            int optInt = jSONObject.optInt(C26559a.f69635d);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optInt == 0 && optJSONObject != null) {
                String optString = optJSONObject.optString("key");
                String optString2 = optJSONObject.optString("sid");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    String m41352a2 = C26523c.m41352a(C26521a.m41366b(C26523c.m41353a(optString), m41374a));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", m41352a2);
                    jSONObject2.put("sid", optString2);
                    this.f69420g = jSONObject2;
                    C26599t.m40982c(C26522b.m41358a(this.f69419f, jSONObject2.toString()));
                    C26599t.m40990b(System.currentTimeMillis());
                }
            }
        }
        return this.f69420g;
    }

    private C26526f() {
        this.f69420g = null;
        this.f69421h = new String[2];
        this.f69419f = C26577b.m41121a();
    }
}
