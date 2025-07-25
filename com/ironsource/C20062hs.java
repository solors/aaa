package com.ironsource;

import com.ironsource.C21114v8;
import org.json.JSONObject;

/* renamed from: com.ironsource.hs */
/* loaded from: classes6.dex */
public class C20062hs {

    /* renamed from: a */
    private final JSONObject f50489a;

    public C20062hs(JSONObject jSONObject) {
        this.f50489a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public boolean m58075a() {
        return this.f50489a.optBoolean("uxt", false);
    }

    /* renamed from: b */
    public boolean m58074b() {
        return this.f50489a.optBoolean(C21114v8.C21115a.f53890n, false);
    }

    /* renamed from: c */
    public boolean m58073c() {
        return this.f50489a.optBoolean(C21114v8.C21115a.f53891o, false);
    }

    /* renamed from: d */
    public boolean m58072d() {
        return this.f50489a.optBoolean(C21114v8.C21115a.f53887k, false);
    }

    /* renamed from: e */
    public boolean m58071e() {
        return this.f50489a.optBoolean(C21114v8.C21115a.f53889m, false);
    }
}
