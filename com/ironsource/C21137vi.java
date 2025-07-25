package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import com.ironsource.mediationsdk.metadata.C20419a;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.vi */
/* loaded from: classes6.dex */
public class C21137vi {

    /* renamed from: a */
    C19812ed f54214a = new C19812ed();

    /* renamed from: a */
    public void m54432a(int i) {
        this.f54214a.m58816a(C19577ad.f49088Y, Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m54424b(int i) {
        if (i >= 0) {
            this.f54214a.m58816a(C19577ad.f49043B0, Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public void m54420c(int i) {
        this.f54214a.m58816a(C19577ad.f49084W, Integer.valueOf(i));
    }

    /* renamed from: d */
    public void m54418d(String str) {
        this.f54214a.m58816a(C20419a.f51685i, str);
    }

    /* renamed from: e */
    public void m54417e(String str) {
        this.f54214a.m58816a(C19577ad.f49057I0, str);
    }

    /* renamed from: f */
    public void m54416f(String str) {
        this.f54214a.m58816a(C19577ad.f49142u, str);
    }

    /* renamed from: g */
    public void m54415g(String str) {
        this.f54214a.m58816a(C19577ad.f49048E, str);
    }

    /* renamed from: h */
    public void m54414h(String str) {
        this.f54214a.m58816a("sid", str);
    }

    /* renamed from: i */
    public void m54413i(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f54214a.m58816a(C19577ad.f49082V, str);
        }
    }

    /* renamed from: a */
    public void m54431a(Context context) {
        this.f54214a.m58818a(context);
    }

    /* renamed from: b */
    public void m54423b(String str) {
        this.f54214a.m58816a(C19577ad.f49141t0, str);
    }

    /* renamed from: c */
    public void m54419c(String str) {
        this.f54214a.m58816a(C19577ad.f49145v0, str);
    }

    /* renamed from: a */
    public void m54430a(@NotNull IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(C19577ad.f49100c1, waterfallConfiguration.getFloor());
                jSONObject.put(C19577ad.f49103d1, waterfallConfiguration.getCeiling());
            } catch (JSONException e) {
                C20086i9.m57997d().m58003a(e);
            }
        }
        if (jSONObject.length() == 0) {
            this.f54214a.m58817a(C19577ad.f49097b1, C20670q2.m55692a(ad_unit));
        } else {
            this.f54214a.m58815a(C19577ad.f49097b1, jSONObject, C20670q2.m55692a(ad_unit));
        }
    }

    /* renamed from: b */
    public void m54422b(JSONObject jSONObject) {
        this.f54214a.m58816a(C19577ad.f49067N0, (Object) jSONObject);
    }

    /* renamed from: a */
    public void m54429a(@NotNull C21076ue c21076ue) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C19577ad.f49148x, c21076ue.m54654a());
            hashMap.put(C19577ad.f49146w, c21076ue.m54653b());
            hashMap.put("sdkv", c21076ue.m54652c());
            this.f54214a.m58813a(hashMap);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: b */
    public void m54421b(boolean z) {
        this.f54214a.m58816a("gpi", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void m54428a(Boolean bool) {
        this.f54214a.m58816a(C19577ad.f49045C0, bool);
    }

    /* renamed from: a */
    public void m54427a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f54214a.m58816a(C19577ad.f49149x0, str);
    }

    /* renamed from: a */
    public void m54426a(JSONObject jSONObject) {
        this.f54214a.m58816a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void m54425a(boolean z) {
        this.f54214a.m58816a(C19577ad.f49153z0, Boolean.valueOf(z));
    }
}
