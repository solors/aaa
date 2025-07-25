package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.ironsource.InterfaceC20048hg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.InterfaceC20859k;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* renamed from: com.ironsource.of */
/* loaded from: classes6.dex */
public class C20583of implements InterfaceC20048hg {

    /* renamed from: g */
    private static final String f52310g = "loadWithUrl | webView is not null";

    /* renamed from: h */
    private static final String f52311h = "of";

    /* renamed from: i */
    private static final String f52312i = "file://";

    /* renamed from: a */
    private final String f52313a;

    /* renamed from: b */
    private String f52314b;

    /* renamed from: c */
    private WebView f52315c;

    /* renamed from: d */
    private C20467mf f52316d;

    /* renamed from: e */
    private C20047hf f52317e;

    /* renamed from: f */
    private Context f52318f;

    /* renamed from: com.ironsource.of$a */
    /* loaded from: classes6.dex */
    public class RunnableC20584a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f52319a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f52320b;

        /* renamed from: c */
        final /* synthetic */ String f52321c;

        RunnableC20584a(String str, JSONObject jSONObject, String str2) {
            C20583of.this = r1;
            this.f52319a = str;
            this.f52320b = jSONObject;
            this.f52321c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20583of.this.f52315c != null) {
                C21223xf.m54137a(C21145vp.f54251q, new C20968sf().m54959a(C20517nb.f52154A, C20583of.f52310g).m54960a());
            }
            try {
                C20583of.this.m55997b(this.f52319a);
                C20583of.this.f52315c.loadUrl(C20583of.this.m56004a(this.f52320b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C20583of.this.f52313a);
                C20583of.this.f52316d.m56329a(this.f52321c, jSONObject);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                C20583of.this.m55996b(this.f52319a, e.getMessage());
                C21223xf.m54137a(C21145vp.f54251q, new C20968sf().m54959a(C20517nb.f52154A, e.getMessage()).m54960a());
            }
        }
    }

    /* renamed from: com.ironsource.of$b */
    /* loaded from: classes6.dex */
    public class RunnableC20585b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f52323a;

        /* renamed from: b */
        final /* synthetic */ String f52324b;

        RunnableC20585b(String str, String str2) {
            C20583of.this = r1;
            this.f52323a = str;
            this.f52324b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C20583of.this.f52315c != null) {
                    C20583of.this.f52315c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C20583of.this.f52313a);
                if (C20583of.this.f52316d != null) {
                    C20583of.this.f52316d.m56329a(this.f52323a, jSONObject);
                    C20583of.this.f52316d.m56325b();
                }
                C20583of.this.f52316d = null;
                C20583of.this.f52318f = null;
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                String str = C20583of.f52311h;
                Log.e(str, "performCleanup | could not destroy ISNAdView webView ID: " + C20583of.this.f52313a);
                C21223xf.m54137a(C21145vp.f54252r, new C20968sf().m54959a(C20517nb.f52154A, e.getMessage()).m54960a());
                C20583of.this.m55996b(this.f52324b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.of$c */
    /* loaded from: classes6.dex */
    public class C20586c implements InterfaceC20048hg.InterfaceC20049a {

        /* renamed from: a */
        final /* synthetic */ String f52326a;

        C20586c(String str) {
            C20583of.this = r1;
            this.f52326a = str;
        }

        @Override // com.ironsource.InterfaceC20048hg.InterfaceC20049a
        /* renamed from: a */
        public void mo55985a(String str) {
            String str2 = C20583of.f52311h;
            Logger.m54970i(str2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C20583of.this.m55996b(this.f52326a, str);
        }

        @Override // com.ironsource.InterfaceC20048hg.InterfaceC20049a
        /* renamed from: b */
        public void mo55984b(String str) {
            String str2 = C20583of.f52311h;
            Logger.m54970i(str2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C20583of.this.f52315c.getParent()).removeView(C20583of.this.f52315c);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C20583of.this.m55987e();
        }
    }

    /* renamed from: com.ironsource.of$d */
    /* loaded from: classes6.dex */
    public class C20587d extends WebChromeClient {
        private C20587d() {
            C20583of.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(new C20587d());
            webView2.setWebViewClient(new C20588e(C20583of.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m54970i("onCreateWindow", "onCreateWindow");
            return true;
        }

        /* synthetic */ C20587d(C20583of c20583of, RunnableC20584a runnableC20584a) {
            this();
        }
    }

    /* renamed from: com.ironsource.of$e */
    /* loaded from: classes6.dex */
    private class C20588e extends WebViewClient {
        private C20588e() {
            C20583of.this = r1;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            WebViewRenderException.m3275a(this);
            String str = C20583of.f52311h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.m54972e(str, sb2.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent m55327a = new OpenUrlActivity.C20808e(new InterfaceC20859k.C20861b()).m55326a(str).m55324b(false).m55327a(context);
            m55327a.addFlags(268435456);
            context.startActivity(m55327a);
            return true;
        }

        /* synthetic */ C20588e(C20583of c20583of, RunnableC20584a runnableC20584a) {
            this();
        }
    }

    public C20583of(InterfaceC20205kf interfaceC20205kf, Context context, String str, C20047hf c20047hf) {
        this.f52318f = context;
        C20467mf c20467mf = new C20467mf();
        this.f52316d = c20467mf;
        c20467mf.m56315g(str);
        this.f52313a = str;
        this.f52316d.m56336a(interfaceC20205kf);
        this.f52317e = c20047hf;
    }

    /* renamed from: e */
    public synchronized void m55987e() {
        mo56003a("", "");
    }

    /* renamed from: b */
    public String m56000b() {
        return this.f52313a;
    }

    /* renamed from: c */
    public C20467mf m55994c() {
        return this.f52316d;
    }

    /* renamed from: d */
    public C20047hf m55990d() {
        return this.f52317e;
    }

    @Override // com.ironsource.InterfaceC20048hg
    public WebView getPresentingView() {
        return this.f52315c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f52316d.m56321c(str);
    }

    /* renamed from: d */
    private String m55988d(String str) {
        String substring = str.substring(str.indexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1);
        return substring.substring(substring.indexOf(RemoteSettings.FORWARD_SLASH_STRING));
    }

    /* renamed from: e */
    public void m55986e(String str) {
        this.f52314b = str;
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: c */
    public void mo55991c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f52316d.m56330a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            String str3 = f52311h;
            Logger.m54970i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: b */
    public void m55997b(String str) {
        Logger.m54970i(f52311h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f52318f);
        this.f52315c = webView;
        webView.addJavascriptInterface(new C20263lf(this), C20096if.f50574e);
        this.f52315c.setWebViewClient(new C20521nf(new C20586c(str)));
        this.f52315c.setWebChromeClient(new C20587d(this, null));
        C21281yu.m53935a(this.f52315c);
        this.f52316d.m56337a(this.f52315c);
    }

    /* renamed from: c */
    private boolean m55992c(String str) {
        return str.startsWith(".");
    }

    /* renamed from: a */
    public String m56004a(String str) {
        if (m55992c(str)) {
            return "file://" + this.f52314b + m55988d(str);
        }
        return str;
    }

    /* renamed from: b */
    public void m55996b(String str, String str2) {
        C20467mf c20467mf = this.f52316d;
        if (c20467mf != null) {
            c20467mf.m56331a(str, str2);
        }
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: b */
    public void mo55995b(JSONObject jSONObject, String str, String str2) {
        C21130ve.f54189a.m54467d(new RunnableC20584a(str2, jSONObject, str));
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public synchronized void mo56003a(String str, String str2) {
        if (this.f52318f == null) {
            return;
        }
        Logger.m54970i(f52311h, "performCleanup");
        C21130ve.f54189a.m54467d(new RunnableC20585b(str, str2));
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public void mo56002a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            m55996b(str3, C21114v8.C21117c.f53905D);
            return;
        }
        String str4 = f52311h;
        Logger.m54970i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C21114v8.C21122h.f54092t0)) {
                this.f52315c.onPause();
            } else if (!str.equals(C21114v8.C21122h.f54094u0)) {
                m55996b(str3, C21114v8.C21117c.f53904C);
                return;
            } else {
                this.f52315c.onResume();
            }
            this.f52316d.m56316f(str2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            m55996b(str3, C21114v8.C21117c.f53906E);
        }
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public void mo56001a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f52316d.m56317e(str);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            String str3 = f52311h;
            Logger.m54970i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }
}
