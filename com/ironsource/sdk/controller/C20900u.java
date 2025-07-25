package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C20056hm;
import com.ironsource.C20086i9;
import com.ironsource.C20776rt;
import com.ironsource.C21189wp;
import com.ironsource.InterfaceC20474mj;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.u */
/* loaded from: classes6.dex */
public class C20900u {

    /* renamed from: d */
    private static final String f53196d = "u";

    /* renamed from: e */
    private static final String f53197e = "updateToken";

    /* renamed from: f */
    private static final String f53198f = "getToken";

    /* renamed from: g */
    private static final String f53199g = "functionName";

    /* renamed from: h */
    private static final String f53200h = "functionParams";

    /* renamed from: i */
    private static final String f53201i = "success";

    /* renamed from: j */
    private static final String f53202j = "fail";

    /* renamed from: b */
    private Context f53204b;

    /* renamed from: a */
    private C20056hm f53203a = new C20056hm();

    /* renamed from: c */
    private C20776rt f53205c = new C20776rt();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.sdk.controller.u$b */
    /* loaded from: classes6.dex */
    public static class C20902b {

        /* renamed from: a */
        String f53206a;

        /* renamed from: b */
        JSONObject f53207b;

        /* renamed from: c */
        String f53208c;

        /* renamed from: d */
        String f53209d;

        private C20902b() {
        }
    }

    public C20900u(Context context) {
        this.f53204b = context;
    }

    /* renamed from: a */
    private C20902b m55189a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C20902b c20902b = new C20902b();
        c20902b.f53206a = jSONObject.optString("functionName");
        c20902b.f53207b = jSONObject.optJSONObject("functionParams");
        c20902b.f53208c = jSONObject.optString("success");
        c20902b.f53209d = jSONObject.optString("fail");
        return c20902b;
    }

    /* renamed from: a */
    private void m55190a(C20902b c20902b, InterfaceC20474mj interfaceC20474mj) {
        try {
            JSONObject m55436a = this.f53205c.m55436a();
            Iterator<String> keys = m55436a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = m55436a.get(next);
                if (obj instanceof String) {
                    m55436a.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC20474mj.mo54984a(true, c20902b.f53208c, m55436a);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            interfaceC20474mj.mo54985a(false, c20902b.f53209d, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m55188a(String str, InterfaceC20474mj interfaceC20474mj) throws Exception {
        C20902b m55189a = m55189a(str);
        if (f53197e.equals(m55189a.f53206a)) {
            m55187a(m55189a.f53207b, m55189a, interfaceC20474mj);
        } else if (f53198f.equals(m55189a.f53206a)) {
            m55190a(m55189a, interfaceC20474mj);
        } else {
            String str2 = f53196d;
            Logger.m54970i(str2, "unhandled API request " + str);
        }
    }

    /* renamed from: a */
    public void m55187a(JSONObject jSONObject, C20902b c20902b, InterfaceC20474mj interfaceC20474mj) {
        C21189wp c21189wp = new C21189wp();
        try {
            this.f53203a.m58082a(jSONObject);
            interfaceC20474mj.mo54986a(true, c20902b.f53208c, c21189wp);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            String str = f53196d;
            Logger.m54970i(str, "updateToken exception " + e.getMessage());
            interfaceC20474mj.mo54986a(false, c20902b.f53209d, c21189wp);
        }
    }
}
