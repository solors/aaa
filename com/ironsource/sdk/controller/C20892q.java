package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C20086i9;
import com.ironsource.C21109v3;
import com.ironsource.C21189wp;
import com.ironsource.InterfaceC20474mj;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.q */
/* loaded from: classes6.dex */
public class C20892q {

    /* renamed from: b */
    private static final String f53174b = "q";

    /* renamed from: c */
    private static final String f53175c = "getPermissions";

    /* renamed from: d */
    private static final String f53176d = "isPermissionGranted";

    /* renamed from: e */
    private static final String f53177e = "permissions";

    /* renamed from: f */
    private static final String f53178f = "permission";

    /* renamed from: g */
    private static final String f53179g = "status";

    /* renamed from: h */
    private static final String f53180h = "functionName";

    /* renamed from: i */
    private static final String f53181i = "functionParams";

    /* renamed from: j */
    private static final String f53182j = "success";

    /* renamed from: k */
    private static final String f53183k = "fail";

    /* renamed from: l */
    private static final String f53184l = "unhandledPermission";

    /* renamed from: a */
    private Context f53185a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.sdk.controller.q$b */
    /* loaded from: classes6.dex */
    public static class C20894b {

        /* renamed from: a */
        String f53186a;

        /* renamed from: b */
        JSONObject f53187b;

        /* renamed from: c */
        String f53188c;

        /* renamed from: d */
        String f53189d;

        private C20894b() {
        }
    }

    public C20892q(Context context) {
        this.f53185a = context;
    }

    /* renamed from: a */
    private C20894b m55206a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C20894b c20894b = new C20894b();
        c20894b.f53186a = jSONObject.optString("functionName");
        c20894b.f53187b = jSONObject.optJSONObject("functionParams");
        c20894b.f53188c = jSONObject.optString("success");
        c20894b.f53189d = jSONObject.optString("fail");
        return c20894b;
    }

    /* renamed from: b */
    public void m55203b(JSONObject jSONObject, C20894b c20894b, InterfaceC20474mj interfaceC20474mj) {
        String str;
        boolean z;
        C21189wp c21189wp = new C21189wp();
        try {
            String string = jSONObject.getString(f53178f);
            c21189wp.m54311b(f53178f, string);
            if (C21109v3.m54518d(this.f53185a, string)) {
                c21189wp.m54311b("status", String.valueOf(C21109v3.m54520c(this.f53185a, string)));
                str = c20894b.f53188c;
                z = true;
            } else {
                c21189wp.m54311b("status", f53184l);
                str = c20894b.f53189d;
                z = false;
            }
            interfaceC20474mj.mo54986a(z, str, c21189wp);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            c21189wp.m54311b("errMsg", e.getMessage());
            interfaceC20474mj.mo54986a(false, c20894b.f53189d, c21189wp);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m55205a(String str, InterfaceC20474mj interfaceC20474mj) throws Exception {
        C20894b m55206a = m55206a(str);
        if (f53175c.equals(m55206a.f53186a)) {
            m55204a(m55206a.f53187b, m55206a, interfaceC20474mj);
        } else if (f53176d.equals(m55206a.f53186a)) {
            m55203b(m55206a.f53187b, m55206a, interfaceC20474mj);
        } else {
            String str2 = f53174b;
            Logger.m54970i(str2, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    /* renamed from: a */
    public void m55204a(JSONObject jSONObject, C20894b c20894b, InterfaceC20474mj interfaceC20474mj) {
        C21189wp c21189wp = new C21189wp();
        try {
            c21189wp.m54316a("permissions", C21109v3.m54524a(this.f53185a, jSONObject.getJSONArray("permissions")));
            interfaceC20474mj.mo54986a(true, c20894b.f53188c, c21189wp);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            String str = f53174b;
            Logger.m54970i(str, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
            c21189wp.m54311b("errMsg", e.getMessage());
            interfaceC20474mj.mo54986a(false, c20894b.f53189d, c21189wp);
        }
    }
}
