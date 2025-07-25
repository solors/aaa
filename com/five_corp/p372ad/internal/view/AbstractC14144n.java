package com.five_corp.p372ad.internal.view;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.cache.C13743p;
import com.five_corp.p372ad.internal.layouter.C13827e;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.p373ad.format_config.C13659b;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.view.n */
/* loaded from: classes4.dex */
public abstract class AbstractC14144n {

    /* renamed from: a */
    public static final /* synthetic */ int f26804a = 0;

    /* renamed from: a */
    public static boolean m78057a(Uri uri, InterfaceC14143m interfaceC14143m, C13836a c13836a) {
        boolean z = true;
        try {
            if (uri.equals(Uri.parse("https://macro.fivecdm.com/click"))) {
                ((C13827e) interfaceC14143m).f25793h.mo78292a();
            } else if (uri.equals(Uri.parse("https://macro.fivecdm.com/closeDeprecated"))) {
                ((C13827e) interfaceC14143m).f25793h.mo78285b();
            } else {
                z = false;
            }
        } catch (Throwable th) {
            c13836a.m78269a(th);
        }
        return z;
    }

    /* renamed from: a */
    public static void m78056a(WebView webView, C13743p c13743p, C13659b c13659b, InterfaceC14143m interfaceC14143m, C13836a c13836a) {
        WebViewClient c14141k;
        StringBuilder sb2 = new StringBuilder("<html><head><meta charset='utf-8' />");
        sb2.append(String.format("<meta name='viewport' content='width=%dpx' />", Integer.valueOf(c13659b.f25342a)));
        sb2.append("</head><body style='margin:0;padding:0'>");
        String replace = c13659b.f25344c.replace("{{install-url}}", "https://macro.fivecdm.com/click").replace("{{back-url}}", "https://macro.fivecdm.com/closeDeprecated").replace("{{replay-url}}", "https://macro.fivecdm.com/replay");
        List<C13691u> list = c13659b.f25343b;
        if (list != null) {
            for (C13691u c13691u : list) {
                C13741n c13741n = (C13741n) c13743p.f25537a.get(c13691u);
                if (c13741n != null && c13741n.m78408d()) {
                    String str = "{{resource:" + c13691u.f25402b + "}}";
                    replace = replace.replace(str, AdPayload.FILE_SCHEME + c13741n.m78409c());
                }
            }
        }
        sb2.append(replace);
        sb2.append("</body></html>");
        String sb3 = sb2.toString();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        webView.setBackgroundColor(-1);
        webView.setScrollBarStyle(0);
        webView.setVisibility(8);
        webView.setLayerType(1, null);
        webView.setOnLongClickListener(new View$OnLongClickListenerC14139i());
        if (Build.VERSION.SDK_INT >= 26) {
            c14141k = new C14142l(interfaceC14143m, c13836a);
        } else {
            c14141k = new C14141k(interfaceC14143m, c13836a);
        }
        webView.setWebViewClient(c14141k);
        webView.loadDataWithBaseURL("", sb3, "text/html", "UTF-8", "");
    }
}
