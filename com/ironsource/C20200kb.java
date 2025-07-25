package com.ironsource;

import com.ironsource.InterfaceC20197k9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.kb */
/* loaded from: classes6.dex */
public class C20200kb {

    /* renamed from: e */
    static final String f50834e = "euid";

    /* renamed from: f */
    static final String f50835f = "esat";

    /* renamed from: g */
    static final String f50836g = "esfr";

    /* renamed from: h */
    static final int f50837h = 1;

    /* renamed from: a */
    private int f50838a;

    /* renamed from: b */
    private long f50839b;

    /* renamed from: c */
    private int f50840c;

    /* renamed from: d */
    private final JSONObject f50841d;

    public C20200kb(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    /* renamed from: a */
    public String m57658a() {
        return this.f50841d.toString();
    }

    /* renamed from: b */
    public JSONObject m57654b() {
        return this.f50841d;
    }

    /* renamed from: c */
    public int m57653c() {
        return this.f50838a;
    }

    /* renamed from: d */
    public long m57652d() {
        return this.f50839b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C20200kb c20200kb = (C20200kb) obj;
        if (this.f50838a != c20200kb.f50838a || this.f50839b != c20200kb.f50839b || this.f50840c != c20200kb.f50840c || !C20974sj.m54949a(this.f50841d, c20200kb.f50841d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f50838a) * 31) + Long.hashCode(this.f50839b)) * 31) + this.f50841d.toString().hashCode()) * 31) + this.f50840c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + m57653c() + ",\"timestamp\":" + m57652d() + "," + m57658a().substring(1) + "}").replace(",", "\n");
    }

    public C20200kb(int i, long j, JSONObject jSONObject) {
        this.f50840c = 1;
        this.f50838a = i;
        this.f50839b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f50841d = jSONObject;
        if (!jSONObject.has(f50834e)) {
            m57655a(f50834e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f50835f)) {
            this.f50840c = jSONObject.optInt(f50835f, 1);
        } else {
            m57655a(f50835f, Integer.valueOf(this.f50840c));
        }
    }

    /* renamed from: a */
    public void m57657a(int i) {
        this.f50838a = i;
    }

    public C20200kb(int i, JSONObject jSONObject) {
        this(i, new InterfaceC20197k9.C20198a().mo57675a(), jSONObject);
    }

    /* renamed from: a */
    public void m57656a(String str) {
        m57655a(f50836g, str);
        int i = this.f50840c + 1;
        this.f50840c = i;
        m57655a(f50835f, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m57655a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f50841d.put(str, obj);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
