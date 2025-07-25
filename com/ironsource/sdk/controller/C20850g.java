package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.sdk.controller.g */
/* loaded from: classes6.dex */
public final class C20850g {

    /* renamed from: c */
    private static final String f53081c = "com.ironsource.sdk.controller.g";

    /* renamed from: d */
    private static final String f53082d = "functionName";

    /* renamed from: e */
    private static final String f53083e = "params";

    /* renamed from: f */
    private static final String f53084f = "hash";

    /* renamed from: a */
    private final C20813b f53085a;

    /* renamed from: b */
    private final C20896s f53086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20850g(C20813b c20813b, C20896s c20896s) {
        this.f53085a = c20813b;
        this.f53086b = c20896s;
    }

    /* renamed from: a */
    private String m55238a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private void m55237b(String str, String str2, String str3) {
        this.f53085a.m55317a(m55238a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f53081c;
            Logger.m54970i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f53086b.m55200a(str, str2, str3)) {
                m55239a(str, str2);
            } else {
                m55237b(str, str2, str3);
            }
        } catch (Exception e) {
            m55240a(e);
        }
    }

    /* renamed from: a */
    private void m55240a(Exception exc) {
        IronLog.INTERNAL.error(exc.toString());
        String str = f53081c;
        Logger.m54970i(str, "messageHandler failed with exception " + exc.getMessage());
    }

    /* renamed from: a */
    private void m55239a(String str, String str2) throws Exception {
        this.f53085a.m55316a(str, str2);
    }
}
