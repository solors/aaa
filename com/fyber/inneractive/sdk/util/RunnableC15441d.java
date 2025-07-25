package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.measurement.C14586e;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.web.AbstractC15529i;
import com.fyber.inneractive.sdk.web.AbstractC15532j0;
import com.fyber.inneractive.sdk.web.C15521e;
import com.iab.omid.library.fyber.ScriptInjector;

/* renamed from: com.fyber.inneractive.sdk.util.d */
/* loaded from: classes4.dex */
public final class RunnableC15441d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object[] f30589a = null;

    /* renamed from: b */
    public final /* synthetic */ C15521e f30590b;

    public RunnableC15441d(C15521e c15521e) {
        this.f30590b = c15521e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C15521e c15521e = this.f30590b;
        Object[] objArr = this.f30589a;
        c15521e.getClass();
        Void[] voidArr = (Void[]) objArr;
        long currentTimeMillis = System.currentTimeMillis();
        String str = c15521e.f30752g;
        if (c15521e.f30753h) {
            AbstractC15529i abstractC15529i = c15521e.f30757l;
            String str2 = c15521e.f30754i;
            String str3 = c15521e.f30755j;
            AbstractC15532j0 abstractC15532j0 = (AbstractC15532j0) abstractC15529i;
            abstractC15532j0.getClass();
            StringBuilder sb2 = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            if (TextUtils.isEmpty(str)) {
                IAlog.m76529a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                if (abstractC15532j0.f30793F) {
                    String m76481b = AbstractC15459m.m76481b("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(m76481b)) {
                        sb2.append(m76481b);
                    }
                }
                sb2.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.f27060O;
                boolean m77916a = iAConfigManager.f27097u.f27275b.m77916a(false, "use_js_inline");
                if (m77916a && iAConfigManager.f27070H.f26973b != null) {
                    sb2.append("<script type=\"text/javascript\">");
                    sb2.append(iAConfigManager.f27070H.f26973b);
                    sb2.append("</script>");
                } else {
                    sb2.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(str2);
                }
                sb2.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(str3);
                }
                sb2.append("</style><body id=\"iaBody\">");
                if (abstractC15532j0.f30789B && abstractC15532j0.mo76375m()) {
                    if (m77916a && iAConfigManager.f27070H.f26974c != null) {
                        sb2.append("<style type=\"text/css\">");
                        sb2.append(iAConfigManager.f27070H.f26974c);
                        sb2.append("</style>");
                    } else {
                        sb2.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    }
                    if (m77916a && iAConfigManager.f27070H.f26975d != null) {
                        sb2.append("<script type=\"text/javascript\">");
                        sb2.append(iAConfigManager.f27070H.f26975d);
                        sb2.append("</script>");
                    } else {
                        sb2.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    }
                }
                String m76481b2 = AbstractC15459m.m76481b("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(m76481b2)) {
                    sb2.append("<div id='iaScriptBr' style='display:none;'>");
                    sb2.append(m76481b2);
                    sb2.append("</div>");
                    if (IAlog.f30554a >= 2) {
                        sb2.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb2.append(str);
                sb2.append("</body></html>");
                if (abstractC15532j0.f30795H != null) {
                    AbstractC14552x abstractC14552x = abstractC15532j0.f30785s;
                    if (abstractC14552x != null) {
                        AbstractC15386e mo77807c = abstractC14552x.mo77807c();
                        if (mo77807c != null && mo77807c.f30454J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C14586e c14586e = abstractC15532j0.f30795H;
                        String sb3 = sb2.toString();
                        if (z) {
                            StringBuilder sb4 = new StringBuilder();
                            if (!TextUtils.isEmpty(c14586e.f27620c)) {
                                sb4.append(c14586e.f27620c);
                            }
                            if (!TextUtils.isEmpty(c14586e.f27621d)) {
                                sb4.append(c14586e.f27621d);
                            }
                            sb3 = ScriptInjector.injectScriptContentIntoHtml(sb4.toString(), sb3);
                        }
                        if (!TextUtils.isEmpty(c14586e.f27619b)) {
                            str = ScriptInjector.injectScriptContentIntoHtml(c14586e.f27619b, sb3);
                        } else {
                            str = sb3;
                        }
                    }
                } else {
                    str = sb2.toString();
                }
            }
            str = null;
        }
        AbstractC15529i abstractC15529i2 = c15521e.f30757l;
        abstractC15529i2.getClass();
        IAlog.m76529a("%sbuild html string took %d msec", IAlog.m76531a(abstractC15529i2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C15521e c15521e2 = this.f30590b;
        if (c15521e2.f30751f) {
            return;
        }
        c15521e2.f30748c = new RunnableC15443e(c15521e2, str);
        c15521e2.m76403a().post(this.f30590b.f30748c);
    }
}
