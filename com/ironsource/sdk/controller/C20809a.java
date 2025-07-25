package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C20086i9;
import com.ironsource.C20170ju;
import com.ironsource.C20635pf;
import com.ironsource.C21189wp;
import com.ironsource.InterfaceC20205kf;
import com.ironsource.InterfaceC20474mj;
import com.ironsource.InterfaceC21239xu;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.a */
/* loaded from: classes6.dex */
public class C20809a implements InterfaceC20205kf {

    /* renamed from: d */
    private static final String f52943d = "loadWithUrl";

    /* renamed from: e */
    private static final String f52944e = "sendMessage";

    /* renamed from: f */
    public static final String f52945f = "removeAdView";

    /* renamed from: g */
    public static final String f52946g = "webviewAction";

    /* renamed from: h */
    public static final String f52947h = "handleGetViewVisibility";

    /* renamed from: i */
    private static final String f52948i = "functionName";

    /* renamed from: j */
    private static final String f52949j = "functionParams";

    /* renamed from: k */
    private static final String f52950k = "success";

    /* renamed from: l */
    private static final String f52951l = "fail";

    /* renamed from: m */
    public static final String f52952m = "errMsg";

    /* renamed from: n */
    private static final String f52953n = "%s | unsupported AdViews API";

    /* renamed from: a */
    private InterfaceC21239xu f52954a;

    /* renamed from: b */
    private C20635pf f52955b = C20635pf.m55832a();

    /* renamed from: c */
    private Context f52956c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.sdk.controller.a$b */
    /* loaded from: classes6.dex */
    public static class C20811b {

        /* renamed from: a */
        String f52957a;

        /* renamed from: b */
        JSONObject f52958b;

        /* renamed from: c */
        String f52959c;

        /* renamed from: d */
        String f52960d;

        private C20811b() {
        }
    }

    public C20809a(Context context) {
        this.f52956c = context;
    }

    /* renamed from: a */
    private C20811b m55321a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C20811b c20811b = new C20811b();
        c20811b.f52957a = jSONObject.optString("functionName");
        c20811b.f52958b = jSONObject.optJSONObject("functionParams");
        c20811b.f52959c = jSONObject.optString("success");
        c20811b.f52960d = jSONObject.optString("fail");
        return c20811b;
    }

    /* renamed from: a */
    public void m55322a(InterfaceC21239xu interfaceC21239xu) {
        this.f52954a = interfaceC21239xu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m55320a(String str, InterfaceC20474mj interfaceC20474mj) throws Exception {
        char c;
        C20811b m55321a = m55321a(str);
        C21189wp c21189wp = new C21189wp();
        try {
            String str2 = m55321a.f52957a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f52945f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(f52946g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.f52955b.m55831a(this, m55321a.f52958b, this.f52956c, m55321a.f52959c, m55321a.f52960d);
            } else if (c == 1) {
                this.f52955b.m55822d(m55321a.f52958b, m55321a.f52959c, m55321a.f52960d);
            } else if (c == 2) {
                this.f52955b.m55824c(m55321a.f52958b, m55321a.f52959c, m55321a.f52960d);
            } else if (c == 3) {
                this.f52955b.m55828a(m55321a.f52958b, m55321a.f52959c, m55321a.f52960d);
            } else if (c != 4) {
                throw new IllegalArgumentException(String.format(f52953n, m55321a.f52957a));
            } else {
                this.f52955b.m55826b(m55321a.f52958b, m55321a.f52959c, m55321a.f52960d);
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            c21189wp.m54311b("errMsg", e.getMessage());
            String m55825c = this.f52955b.m55825c(m55321a.f52958b);
            if (!TextUtils.isEmpty(m55825c)) {
                c21189wp.m54311b("adViewId", m55825c);
            }
            interfaceC20474mj.mo54986a(false, m55321a.f52960d, c21189wp);
        }
    }

    @Override // com.ironsource.InterfaceC20205kf
    /* renamed from: a */
    public void mo55319a(String str, String str2, String str3) {
        mo55318a(str, C20170ju.m57779a(str2, str3));
    }

    @Override // com.ironsource.InterfaceC20205kf
    /* renamed from: a */
    public void mo55318a(String str, JSONObject jSONObject) {
        if (this.f52954a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f52954a.mo54085a(str, jSONObject);
    }
}
