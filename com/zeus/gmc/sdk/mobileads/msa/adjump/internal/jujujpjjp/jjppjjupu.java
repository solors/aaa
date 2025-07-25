package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.AdInfoBean;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32794puujujuupp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32795uppjpjj;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* loaded from: classes8.dex */
public class jjppjjupu {
    private static final String jjuuju = "jump_fail";
    private static final String jujujpjjp = "UrlWebViewParser";
    private static final String uppjpjj = "jump_success";
    private JSONObject jjppjjupu;
    private AtomicInteger jjuj = new AtomicInteger(0);
    private long jpjjjjp;
    private boolean jupppjuju;
    private WebView juupuj;
    private InterfaceC32784uppjpjj pppjujup;
    private int puujujuupp;
    private String puuuuj;
    private AdInfoBean ujjuupp;
    private String ujpupujju;
    private C32794puujujuupp uppj;
    private Context upupjjppj;
    private InterfaceC32782jjuuju uujpuuupj;

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu$jjuuju */
    /* loaded from: classes8.dex */
    public interface InterfaceC32782jjuuju {
        void jujujpjjp(C32795uppjpjj c32795uppjpjj);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu$jujujpjjp */
    /* loaded from: classes8.dex */
    public class C32783jujujpjjp extends WebViewClient {
        public C32783jujujpjjp() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            MLog.m25877i(jjppjjupu.jujujpjjp, "onPageFinished  " + str);
            if (jjppjjupu.this.jupppjuju) {
                return;
            }
            if (jjppjjupu.this.jjuj.get() == 0) {
                jjppjjupu jjppjjupuVar = jjppjjupu.this;
                jjppjjupuVar.uppjpjj(jjppjjupuVar.ujpupujju);
            }
            jjppjjupu.this.jjuj.decrementAndGet();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            MLog.m25877i(jjppjjupu.jujujpjjp, "onPageStarted  " + str);
            if (jjppjjupu.this.jupppjuju) {
                if (webView != null) {
                    try {
                        webView.stopLoading();
                    } catch (Exception unused) {
                    }
                }
            } else if (!TextUtils.isEmpty(str) && !upupjjppj.uppjpjj(str) && !upupjjppj.jujujpjjp(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                if (webView != null) {
                    webView.stopLoading();
                }
                jjppjjupu.this.jupppjuju = true;
                jjppjjupu.this.uppjpjj(str);
                jjppjjupu.this.puujujuupp(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (!jjppjjupu.this.jupppjuju) {
                jjppjjupu.this.puuuuj = str;
                jjppjjupu.this.jupppjuju = true;
                jjppjjupu jjppjjupuVar = jjppjjupu.this;
                jjppjjupuVar.uppjpjj(jjppjjupuVar.ujpupujju);
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            MLog.m25877i(jjppjjupu.jujujpjjp, "shouldOverrideUrlLoading " + str);
            jjppjjupu.this.jjuj.incrementAndGet();
            if (!TextUtils.isEmpty(str)) {
                try {
                    jjppjjupu.this.jjppjjupu.put(String.valueOf(jjppjjupu.uppjpjj(jjppjjupu.this)), str);
                    jjppjjupu.this.jujujpjjp(str);
                } catch (JSONException e) {
                    MLog.m25878e(jjppjjupu.jujujpjjp, "Put jumpDetail exception", e);
                }
            }
            if (webView != null) {
                webView.loadUrl(str);
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jjppjjupu$uppjpjj */
    /* loaded from: classes8.dex */
    public interface InterfaceC32784uppjpjj {
        void jujujpjjp(String str);
    }

    public jjppjjupu(Context context, AdInfoBean adInfoBean, C32794puujujuupp c32794puujujuupp, InterfaceC32784uppjpjj interfaceC32784uppjpjj) {
        try {
            this.juupuj = new WebView(context);
            this.ujjuupp = adInfoBean;
            this.upupjjppj = upupjjppj.uppjpjj(context);
            this.uppj = c32794puujujuupp;
            this.pppjujup = interfaceC32784uppjpjj;
            uppjpjj();
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "init e : ", e);
        }
    }

    public static /* synthetic */ int uppjpjj(jjppjjupu jjppjjupuVar) {
        int i = jjppjjupuVar.puujujuupp + 1;
        jjppjjupuVar.puujujuupp = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void puujujuupp(String str) {
        InterfaceC32782jjuuju interfaceC32782jjuuju = this.uujpuuupj;
        if (interfaceC32782jjuuju != null) {
            interfaceC32782jjuuju.jujujpjjp(C32795uppjpjj.jujujpjjp().uppjpjj(this.puujujuupp).uppjpjj(System.currentTimeMillis() - this.jpjjjjp).jujujpjjp(this.ujjuupp.getAdId()).jjuuju(this.jjppjjupu.toString()).uppjpjj(str).jujujpjjp(this.puuuuj).puujujuupp(uppjpjj));
        }
    }

    private void uppjpjj() {
        WebSettings settings = this.juupuj.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        jujujpjjp();
    }

    public void jjuuju(String str) {
        this.ujpupujju = str;
        if (this.juupuj != null && !TextUtils.isEmpty(str)) {
            this.jpjjjjp = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            this.jjppjjupu = jSONObject;
            try {
                jSONObject.put(String.valueOf(this.puujujuupp), str);
            } catch (JSONException e) {
                MLog.m25878e(jujujpjjp, "Put jumpDetail exception", e);
            }
            try {
                this.juupuj.setWebViewClient(new C32783jujujpjjp());
                if (str.contains("<html>") && str.contains("</html>")) {
                    this.juupuj.loadData(str, "text/html", "UTF-8");
                    return;
                } else {
                    this.juupuj.loadUrl(str);
                    return;
                }
            } catch (Exception e2) {
                jjuuju();
                MLog.m25878e(jujujpjjp, "WebView parse e : ", e2);
                InterfaceC32782jjuuju interfaceC32782jjuuju = this.uujpuuupj;
                if (interfaceC32782jjuuju != null) {
                    interfaceC32782jjuuju.jujujpjjp(C32795uppjpjj.jujujpjjp().uppjpjj(this.puujujuupp).uppjpjj(System.currentTimeMillis() - this.jpjjjjp).jujujpjjp(this.ujjuupp.getAdId()).puujujuupp(jjuuju));
                    return;
                }
                return;
            }
        }
        uppjpjj(str);
    }

    public void jujujpjjp(InterfaceC32782jjuuju interfaceC32782jjuuju) {
        this.uujpuuupj = interfaceC32782jjuuju;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jujujpjjp(String str) {
        if (this.puujujuupp > this.ujjuupp.getMaxJumptimes()) {
            MLog.m25877i(jujujpjjp, "Jump too many times");
            this.puujujuupp = -1;
            WebView webView = this.juupuj;
            if (webView != null) {
                webView.stopLoading();
            }
            this.jupppjuju = true;
            uppjpjj(str);
            jjuuju();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uppjpjj(String str) {
        jjuuju();
        InterfaceC32784uppjpjj interfaceC32784uppjpjj = this.pppjujup;
        if (interfaceC32784uppjpjj != null) {
            interfaceC32784uppjpjj.jujujpjjp(str);
            this.pppjujup = null;
        }
    }

    private void jujujpjjp() {
        CookieSyncManager.createInstance(this.upupjjppj);
        CookieSyncManager.getInstance().startSync();
    }

    private void puujujuupp() {
        CookieSyncManager.createInstance(this.upupjjppj);
        CookieManager.getInstance().removeAllCookie();
        CookieSyncManager.getInstance().sync();
        this.juupuj.setWebViewClient(null);
        this.juupuj.clearCache(true);
        ViewGroup viewGroup = (ViewGroup) this.juupuj.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.juupuj);
        }
        this.juupuj.removeAllViews();
        this.juupuj.destroy();
    }

    private void jjuuju() {
        if (this.juupuj != null) {
            puujujuupp();
            this.juupuj = null;
        }
    }
}
