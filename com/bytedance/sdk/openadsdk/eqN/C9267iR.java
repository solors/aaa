package com.bytedance.sdk.openadsdk.eqN;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.iR */
/* loaded from: classes3.dex */
public class C9267iR {

    /* renamed from: IL */
    private long f20693IL;

    /* renamed from: bX */
    private long f20694bX;

    /* renamed from: bg */
    private long f20695bg;
    private long eqN;

    /* renamed from: zx */
    private long f20696zx;

    /* renamed from: IL */
    public void m83245IL(long j) {
        if (this.f20693IL <= 0) {
            this.f20693IL = j;
        }
    }

    /* renamed from: bX */
    public void m83244bX(long j) {
        if (this.f20694bX <= 0) {
            this.f20694bX = j;
        }
    }

    /* renamed from: bg */
    public void m83242bg(long j) {
        if (this.f20695bg <= 0) {
            this.f20695bg = j;
        }
    }

    public void eqN(long j) {
        if (this.eqN <= 0) {
            this.eqN = j;
        }
    }

    /* renamed from: zx */
    public void m83239zx(long j) {
        if (this.f20696zx <= 0) {
            this.f20696zx = j;
        }
    }

    /* renamed from: IL */
    public JSONObject m83246IL() {
        return m83240bg((JSONObject) null);
    }

    /* renamed from: bg */
    public boolean m83243bg() {
        return this.f20695bg > 0;
    }

    /* renamed from: bg */
    public void m83241bg(long j, float f) {
        if (f > 0.0f) {
            m83242bg(j);
        }
        double d = f;
        if (d >= 0.25d) {
            m83242bg(j);
            m83245IL(j);
        }
        if (d >= 0.5d) {
            m83242bg(j);
            m83245IL(j);
            m83244bX(j);
        }
        if (d >= 0.75d) {
            m83242bg(j);
            m83245IL(j);
            m83244bX(j);
            eqN(j);
        }
        if (f >= 1.0f) {
            m83242bg(j);
            m83245IL(j);
            m83244bX(j);
            eqN(j);
            m83239zx(j);
        }
    }

    /* renamed from: bg */
    public JSONObject m83240bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.f20695bg;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.f20693IL;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.f20694bX;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.eqN;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.f20696zx;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
