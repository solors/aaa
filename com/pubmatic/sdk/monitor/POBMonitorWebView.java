package com.pubmatic.sdk.monitor;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.AssetHelper;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* loaded from: classes7.dex */
public class POBMonitorWebView extends WebView {

    /* renamed from: a */
    private List<String> f70382a;
    public boolean isLoaded;

    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorWebView$a */
    /* loaded from: classes7.dex */
    class C26755a implements InterfaceC26759e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC26759e f70383a;

        C26755a(InterfaceC26759e interfaceC26759e) {
            this.f70383a = interfaceC26759e;
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.InterfaceC26759e
        /* renamed from: a */
        public void mo40491a() {
            POBMonitorWebView.this.isLoaded = true;
            this.f70383a.mo40491a();
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.InterfaceC26759e
        /* renamed from: b */
        public void mo40490b() {
            this.f70383a.mo40490b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorWebView$b */
    /* loaded from: classes7.dex */
    public class RunnableC26756b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f70385a;

        RunnableC26756b(String str) {
            this.f70385a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMonitorWebView.this.evaluateJavascript(String.format("pmMonitor.broadcast('%s')", this.f70385a), new C26761b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorWebView$c */
    /* loaded from: classes7.dex */
    public static class C26757c {

        /* renamed from: a */
        Context f70387a;

        /* synthetic */ C26757c(Context context, C26755a c26755a) {
            this(context);
        }

        @JavascriptInterface
        public void nativeCall(String str) {
            JSONObject jSONObject;
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.optString("name", "").startsWith("share") && (jSONObject = jSONObject2.getJSONObject("params")) != null) {
                    POBUtils.runOnMainThread(new RunnableC26762c(this, jSONObject));
                }
            } catch (JSONException e) {
                POBLog.debug("POBMonitorWebView", e.getLocalizedMessage(), new Object[0]);
            }
        }

        private C26757c(Context context) {
            this.f70387a = context;
        }
    }

    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorWebView$d */
    /* loaded from: classes7.dex */
    private static class C26758d extends WebViewClient {

        /* renamed from: a */
        InterfaceC26759e f70388a;

        /* synthetic */ C26758d(InterfaceC26759e interfaceC26759e, C26755a c26755a) {
            this(interfaceC26759e);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f70388a.mo40491a();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            POBLog.warn("POBMonitorWebView", "WebView Render process gone.", new Object[0]);
            this.f70388a.mo40490b();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        private C26758d(InterfaceC26759e interfaceC26759e) {
            this.f70388a = interfaceC26759e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorWebView$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC26759e {
        /* renamed from: a */
        void mo40491a();

        /* renamed from: b */
        void mo40490b();
    }

    public POBMonitorWebView(Context context) {
        super(context);
        this.isLoaded = false;
        this.f70382a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m40493a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.setFlags(268435456);
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e) {
            POBLog.warn("POBMonitorWebView", "Unable to share data via intent. Error: %s", e.getMessage());
        }
    }

    public void appendData(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!m40492a(jSONObject2)) {
            this.f70382a.add(jSONObject2);
            return;
        }
        Iterator<String> it = this.f70382a.iterator();
        while (it.hasNext()) {
            m40492a(it.next());
            it.remove();
        }
    }

    public void initWebView(InterfaceC26759e interfaceC26759e) {
        getSettings().setJavaScriptEnabled(true);
        clearCache(true);
        clearHistory();
        setWebViewClient(new C26758d(new C26755a(interfaceC26759e), null));
        setWebChromeClient(new WebChromeClient());
        addJavascriptInterface(new C26757c(getContext(), null), "nativeBridge");
    }

    /* renamed from: a */
    private boolean m40492a(String str) {
        if (this.isLoaded) {
            post(new RunnableC26756b(str));
            return true;
        }
        return false;
    }
}
