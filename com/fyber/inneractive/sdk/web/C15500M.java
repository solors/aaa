package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.fyber.inneractive.sdk.util.AbstractC15415F;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import p978t3.WebViewRenderException;

/* renamed from: com.fyber.inneractive.sdk.web.M */
/* loaded from: classes4.dex */
public final class C15500M extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C15509W f30676a;

    public C15500M(C15509W c15509w) {
        this.f30676a = c15509w;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        Activity activity = (Activity) AbstractC15471s.m76459a(this.f30676a.f30708q);
        if (activity != null) {
            activity.finish();
        }
        AbstractC15465p.f30612b.postDelayed(new RunnableC15499L(this), 1000L);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        if (str.endsWith("success")) {
            C15509W c15509w = this.f30676a;
            RunnableC15501N runnableC15501N = c15509w.f30707p;
            if (runnableC15501N != null) {
                AbstractC15465p.f30612b.removeCallbacks(runnableC15501N);
                c15509w.f30707p = null;
            }
            C15509W c15509w2 = this.f30676a;
            c15509w2.getClass();
            IAlog.m76529a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.m76531a(c15509w2), Long.valueOf(System.currentTimeMillis() - this.f30676a.f30706o));
            this.f30676a.f30703l = true;
            return true;
        } else if (!str.startsWith("exit")) {
            return false;
        } else {
            Activity activity = (Activity) AbstractC15471s.m76459a(this.f30676a.f30708q);
            if (activity == null) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("target");
                boolean equals = TextUtils.equals("mail", parse.getAuthority());
                if (equals) {
                    str2 = "android.intent.action.SENDTO";
                } else {
                    str2 = "android.intent.action.VIEW";
                }
                Intent intent = new Intent(str2, Uri.parse(queryParameter));
                if (equals) {
                    intent = Intent.createChooser(intent, "Choose an application");
                }
                AbstractC15415F.m76538a(activity, intent);
            } catch (Throwable th) {
                AbstractC14743z.m77653a(th, null, null);
            }
            return true;
        }
    }
}
