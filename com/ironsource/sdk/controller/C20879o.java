package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C20086i9;
import com.ironsource.C21189wp;
import com.ironsource.C21322zm;
import com.ironsource.InterfaceC20474mj;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.o */
/* loaded from: classes6.dex */
public class C20879o {

    /* renamed from: c */
    private static final String f53147c = "o";

    /* renamed from: d */
    private static final String f53148d = "activate";

    /* renamed from: e */
    private static final String f53149e = "startSession";

    /* renamed from: f */
    private static final String f53150f = "finishSession";

    /* renamed from: g */
    private static final String f53151g = "impressionOccurred";

    /* renamed from: h */
    private static final String f53152h = "getOmidData";

    /* renamed from: i */
    private static final String f53153i = "omidFunction";

    /* renamed from: j */
    private static final String f53154j = "omidParams";

    /* renamed from: k */
    private static final String f53155k = "success";

    /* renamed from: l */
    private static final String f53156l = "fail";

    /* renamed from: m */
    private static final String f53157m = "%s | unsupported OMID API";

    /* renamed from: a */
    private final Context f53158a;

    /* renamed from: b */
    private final C21322zm f53159b = new C21322zm();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.sdk.controller.o$b */
    /* loaded from: classes6.dex */
    public static class C20881b {

        /* renamed from: a */
        String f53160a;

        /* renamed from: b */
        JSONObject f53161b;

        /* renamed from: c */
        String f53162c;

        /* renamed from: d */
        String f53163d;

        private C20881b() {
        }
    }

    public C20879o(Context context) {
        this.f53158a = context;
    }

    /* renamed from: a */
    private C20881b m55214a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C20881b c20881b = new C20881b();
        c20881b.f53160a = jSONObject.optString(f53153i);
        c20881b.f53161b = jSONObject.optJSONObject(f53154j);
        c20881b.f53162c = jSONObject.optString("success");
        c20881b.f53163d = jSONObject.optString("fail");
        return c20881b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m55213a(String str, InterfaceC20474mj interfaceC20474mj) throws Exception {
        char c;
        C20881b m55214a = m55214a(str);
        C21189wp c21189wp = new C21189wp();
        JSONObject jSONObject = m55214a.f53161b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                c21189wp.m54311b("adViewId", optString);
            }
        }
        try {
            String str2 = m55214a.f53160a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -984459207:
                    if (str2.equals(f53152h)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 70701699:
                    if (str2.equals(f53150f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1208109646:
                    if (str2.equals(f53151g)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1850541012:
                    if (str2.equals(f53149e)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    this.f53159b.m53782d(m55214a.f53161b);
                } else if (c == 2) {
                    this.f53159b.m53784b(m55214a.f53161b);
                } else if (c == 3) {
                    this.f53159b.m53783c(m55214a.f53161b);
                } else if (c != 4) {
                    throw new IllegalArgumentException(String.format(f53157m, m55214a.f53160a));
                }
                interfaceC20474mj.mo54986a(true, m55214a.f53162c, c21189wp);
            }
            this.f53159b.m53788a(this.f53158a);
            c21189wp = this.f53159b.m53789a();
            interfaceC20474mj.mo54986a(true, m55214a.f53162c, c21189wp);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            c21189wp.m54311b("errMsg", e.getMessage());
            Logger.m54970i(f53147c, "OMIDJSAdapter " + m55214a.f53160a + " Exception: " + e.getMessage());
            interfaceC20474mj.mo54986a(false, m55214a.f53163d, c21189wp);
        }
    }
}
