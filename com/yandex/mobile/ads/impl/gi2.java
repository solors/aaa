package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class gi2 extends AbstractC31638v8 {

    /* renamed from: f */
    private WebView f79668f;

    /* renamed from: g */
    private Long f79669g = null;

    /* renamed from: h */
    private final Map<String, r52> f79670h;

    /* renamed from: i */
    private final String f79671i;

    /* renamed from: com.yandex.mobile.ads.impl.gi2$a */
    /* loaded from: classes8.dex */
    final class RunnableC30395a implements Runnable {

        /* renamed from: b */
        private final WebView f79672b;

        RunnableC30395a(gi2 gi2Var) {
            this.f79672b = gi2Var.f79668f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f79672b.destroy();
        }
    }

    public gi2(String str, Map map) {
        this.f79670h = map;
        this.f79671i = str;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31638v8
    /* renamed from: b */
    public final void mo28497b() {
        long convert;
        super.mo28497b();
        if (this.f79669g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f79669g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC30395a(this), Math.max(4000 - convert, 2000L));
        this.f79668f = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31638v8
    /* renamed from: a */
    public final void mo28510a() {
        WebView webView = new WebView(ti2.m29147a().m29145b());
        this.f79668f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m28508a(this.f79668f);
        WebView webView2 = this.f79668f;
        String str = this.f79671i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f79670h.keySet()) {
            String externalForm = this.f79670h.get(str2).m30145a().toExternalForm();
            WebView webView3 = this.f79668f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f79669g = Long.valueOf(System.nanoTime());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31638v8
    /* renamed from: a */
    public final void mo28504a(xh2 xh2Var, C31338s8 c31338s8) {
        JSONObject jSONObject = new JSONObject();
        Map<String, r52> m29823d = c31338s8.m29823d();
        for (String str : m29823d.keySet()) {
            ki2.m32540a(jSONObject, str, m29823d.get(str));
        }
        m28503a(xh2Var, c31338s8, jSONObject);
    }
}
