package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class x42 {

    /* renamed from: a */
    private final boolean f87549a;

    /* renamed from: b */
    private final Float f87550b;

    /* renamed from: c */
    private final boolean f87551c = true;

    /* renamed from: d */
    private final nf1 f87552d;

    private x42(boolean z, Float f, nf1 nf1Var) {
        this.f87549a = z;
        this.f87550b = f;
        this.f87552d = nf1Var;
    }

    /* renamed from: a */
    public final JSONObject m27663a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f87549a);
            if (this.f87549a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f87550b);
            }
            jSONObject.put("autoPlay", this.f87551c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f87552d);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static x42 m27661a(nf1 nf1Var) {
        return new x42(false, null, nf1Var);
    }

    /* renamed from: a */
    public static x42 m27662a(float f, nf1 nf1Var) {
        return new x42(true, Float.valueOf(f), nf1Var);
    }
}
