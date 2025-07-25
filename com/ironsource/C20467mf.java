package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mf */
/* loaded from: classes6.dex */
public class C20467mf {

    /* renamed from: a */
    private InterfaceC20205kf f52031a;

    /* renamed from: c */
    private WebView f52033c;

    /* renamed from: d */
    private String f52034d;

    /* renamed from: e */
    private String f52035e = C20467mf.class.getSimpleName();

    /* renamed from: f */
    private String[] f52036f = {"handleGetViewVisibility"};

    /* renamed from: g */
    private final String[] f52037g = {C20096if.f50577h, C20096if.f50578i, C20096if.f50576g, "handleGetViewVisibility", C20096if.f50579j};

    /* renamed from: b */
    private C19854eu f52032b = new C19854eu();

    /* renamed from: com.ironsource.mf$a */
    /* loaded from: classes6.dex */
    class RunnableC20468a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f52038a;

        /* renamed from: b */
        final /* synthetic */ String f52039b;

        /* renamed from: c */
        final /* synthetic */ String f52040c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f52041d;

        RunnableC20468a(String str, String str2, String str3, JSONObject jSONObject) {
            C20467mf.this = r1;
            this.f52038a = str;
            this.f52039b = str2;
            this.f52040c = str3;
            this.f52041d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C20467mf.this.m56323b(this.f52038a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f52038a;
                    Log.e(C20467mf.this.f52035e, str);
                    C20467mf.this.m56331a(this.f52039b, str);
                } else if (this.f52038a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C20467mf.this.m56317e(this.f52040c);
                } else if (this.f52038a.equalsIgnoreCase(C20096if.f50579j) || this.f52038a.equalsIgnoreCase(C20096if.f50578i)) {
                    C20467mf.this.m56330a(this.f52041d.getString("params"), this.f52040c, this.f52039b);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f52038a;
                Log.e(C20467mf.this.f52035e, str2);
                C20467mf.this.m56331a(this.f52039b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.mf$b */
    /* loaded from: classes6.dex */
    public class RunnableC20469b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f52043a;

        /* renamed from: b */
        final /* synthetic */ String f52044b;

        RunnableC20469b(String str, String str2) {
            C20467mf.this = r1;
            this.f52043a = str;
            this.f52044b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C20467mf.this.f52033c.evaluateJavascript(this.f52043a, null);
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                String str = C20467mf.this.f52035e;
                Log.e(str, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f52044b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    /* renamed from: d */
    private void m56320d() {
        if (this.f52031a == null || this.f52032b == null) {
            return;
        }
        m56329a(C20096if.f50570a, m56338a());
    }

    /* renamed from: h */
    private boolean m56314h(String str) {
        for (String str2 : this.f52036f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m56313i(String str) {
        return str.equalsIgnoreCase(C20096if.f50580k);
    }

    /* renamed from: c */
    public String m56322c() {
        return this.f52034d;
    }

    /* renamed from: e */
    public void m56318e() {
        if (this.f52031a == null || this.f52032b == null) {
            return;
        }
        m56329a(C20096if.f50571b, m56338a());
    }

    /* renamed from: f */
    public void m56316f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f52034d);
            m56329a(str, jSONObject);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: g */
    public void m56315g(String str) {
        this.f52034d = str;
    }

    /* renamed from: a */
    private String m56333a(String str) {
        return String.format(C20096if.f50590u, str);
    }

    /* renamed from: d */
    private void m56319d(String str) {
        C21130ve.f54189a.m54467d(new RunnableC20469b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    /* renamed from: b */
    public void m56325b() {
        this.f52031a = null;
        this.f52032b = null;
    }

    /* renamed from: c */
    public void m56321c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !m56314h(optString)) {
                m56329a(jSONObject.optString(C20096if.f50591v, C20096if.f50572c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                m56326a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            String str2 = this.f52035e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: e */
    public void m56317e(String str) throws JSONException {
        JSONObject m58744a = this.f52032b.m58744a();
        m58744a.put("adViewId", this.f52034d);
        m56329a(str, m58744a);
    }

    /* renamed from: b */
    public boolean m56323b(String str) {
        for (String str2 : this.f52037g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject m56338a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C20096if.f50588s, this.f52032b.m58744a());
            jSONObject.put(C20096if.f50585p, jSONObject2);
            jSONObject.put("adViewId", m56322c());
            return jSONObject;
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* renamed from: a */
    private JSONObject m56327a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f52032b.m58744a());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            String str = this.f52035e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public void m56337a(WebView webView) {
        this.f52033c = webView;
    }

    /* renamed from: a */
    public void m56336a(InterfaceC20205kf interfaceC20205kf) {
        this.f52031a = interfaceC20205kf;
    }

    /* renamed from: a */
    public void m56332a(String str, int i, boolean z) {
        this.f52032b.m58742a(str, i, z);
        if (m56313i(str)) {
            m56320d();
        }
    }

    /* renamed from: a */
    public void m56331a(String str, String str2) {
        InterfaceC20205kf interfaceC20205kf = this.f52031a;
        if (interfaceC20205kf != null) {
            interfaceC20205kf.mo55319a(str, str2, this.f52034d);
        }
    }

    /* renamed from: a */
    public void m56330a(String str, String str2, String str3) throws JSONException {
        if (this.f52033c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f52035e, str4);
            this.f52031a.mo55319a(str3, str4, this.f52034d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            str = "\"" + str + "\"";
        }
        m56319d(m56333a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f52034d);
        m56329a(str2, jSONObject);
    }

    /* renamed from: a */
    public void m56329a(String str, JSONObject jSONObject) {
        InterfaceC20205kf interfaceC20205kf = this.f52031a;
        if (interfaceC20205kf != null) {
            interfaceC20205kf.mo55318a(str, jSONObject);
        }
    }

    /* renamed from: a */
    void m56328a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f52031a == null) {
            C21223xf.m54137a(C21145vp.f54254t, new C20968sf().m54959a(C20517nb.f52199y, "mDelegate is null").m54960a());
        } else {
            C21130ve.f54189a.m54467d(new RunnableC20468a(str, str3, str2, jSONObject));
        }
    }

    /* renamed from: a */
    public void m56326a(JSONObject jSONObject, String str, String str2) throws JSONException {
        m56330a(m56327a(jSONObject).toString(), str, str2);
    }
}
