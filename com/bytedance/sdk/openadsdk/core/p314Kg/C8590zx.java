package com.bytedance.sdk.openadsdk.core.p314Kg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.utils.C7755iR;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.p314Kg.C8557bX;
import com.bytedance.sdk.openadsdk.core.p316PX.C8657ldr;
import com.bytedance.sdk.openadsdk.core.p316PX.C8668zx;
import com.bytedance.sdk.openadsdk.eqN.C9165bX;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.Kg.zx */
/* loaded from: classes3.dex */
public class C8590zx extends C7268eqN implements C8557bX.InterfaceC8560bX {

    /* renamed from: IL */
    protected boolean f18938IL;

    /* renamed from: Kg */
    private String f18939Kg;

    /* renamed from: PX */
    private int f18940PX;

    /* renamed from: Ta */
    private long f18941Ta;

    /* renamed from: VB */
    private InterfaceC8595IL f18942VB;

    /* renamed from: WR */
    private int f18943WR;

    /* renamed from: bX */
    AtomicBoolean f18944bX;

    /* renamed from: bg */
    protected boolean f18945bg;

    /* renamed from: eo */
    private List<String> f18946eo;
    AtomicBoolean eqN;

    /* renamed from: iR */
    private AbstractC8967tuV f18947iR;
    private C8596bX ldr;

    /* renamed from: zx */
    private C8581rri f18948zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.Kg.zx$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC8595IL {
        /* renamed from: IL */
        View mo85603IL();

        /* renamed from: bg */
        View mo85602bg();

        /* renamed from: bg */
        void mo85601bg(int i, int i2);

        /* renamed from: bg */
        void mo85600bg(View view, int i);

        /* renamed from: e_ */
        void mo85599e_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.Kg.zx$bg */
    /* loaded from: classes3.dex */
    public static class C8597bg extends C7268eqN.C7272bg {

        /* renamed from: bg */
        public static final Set<String> f18955bg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.bg.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };

        /* renamed from: IL */
        C8557bX.InterfaceC8560bX f18956IL;

        public C8597bg(C8557bX.InterfaceC8560bX interfaceC8560bX) {
            this.f18956IL = interfaceC8560bX;
        }

        /* renamed from: bg */
        private void m85593bg(String str) {
            int lastIndexOf;
            C8557bX.InterfaceC8560bX interfaceC8560bX;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!f18955bg.contains(str.substring(lastIndexOf).toLowerCase()) || (interfaceC8560bX = this.f18956IL) == null) {
                    return;
                }
                interfaceC8560bX.mo85616IL(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C8557bX.InterfaceC8560bX interfaceC8560bX = this.f18956IL;
            if (interfaceC8560bX != null) {
                interfaceC8560bX.mo85612bg();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null && webResourceResponse != null && webResourceRequest.getUrl() != null) {
                if (webResourceRequest.isForMainFrame()) {
                    m85592bg(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
                }
                m85593bg(webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f18956IL.mo85605bg(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            m85593bg(webResourceRequest.getUrl().toString());
        }

        /* renamed from: bg */
        private void m85592bg(String str, int i, String str2) {
            C8557bX.InterfaceC8560bX interfaceC8560bX = this.f18956IL;
            if (interfaceC8560bX != null) {
                interfaceC8560bX.mo85611bg(106, i);
            }
        }
    }

    public C8590zx(Context context) {
        super(context);
        this.f18945bg = false;
        this.f18938IL = false;
        this.f18944bX = new AtomicBoolean(false);
        this.eqN = new AtomicBoolean(false);
        this.f18943WR = 0;
    }

    private void xxp() {
        if (this.f18946eo == null) {
            C9165bX.m83442IL(this.f18947iR, this.f18939Kg, "dsp_html_success_url", (JSONObject) null);
        } else {
            C9165bX.m83428bg(new AbstractRunnableC7227Kg("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C8590zx.this.f18946eo != null && C8590zx.this.eqN.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            for (String str : C8590zx.this.f18946eo) {
                                jSONArray.put(str);
                            }
                            jSONObject.put("url", jSONArray);
                            C9165bX.m83442IL(C8590zx.this.f18947iR, C8590zx.this.f18939Kg, "dsp_html_error_url", jSONObject);
                            C8590zx.this.f18946eo = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: Lq */
    public void m85615Lq() {
        InterfaceC8595IL interfaceC8595IL = this.f18942VB;
        if (interfaceC8595IL != null) {
            interfaceC8595IL.mo85599e_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.f18941Ta);
        } catch (Throwable unused) {
        }
        C9165bX.m83442IL(this.f18947iR, this.f18939Kg, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.p238WR.C7268eqN
    /* renamed from: PX */
    public void mo85614PX() {
        this.ldr.m85598IL();
        super.mo85614PX();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p238WR.C7268eqN, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18945bg) {
            this.ldr.m85595bg(getWebView());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p238WR.C7268eqN, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.ldr.m85597bg();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.f18940PX / 100.0f);
        } catch (Throwable unused) {
        }
        C9165bX.m83442IL(this.f18947iR, this.f18939Kg, "load_rate", jSONObject);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f18938IL = z;
        this.ldr.m85594bg(z);
    }

    /* renamed from: vb */
    public void m85604vb() {
        String str;
        this.f18944bX.set(false);
        String rgo = this.f18947iR.rgo();
        if (TextUtils.isEmpty(rgo)) {
            return;
        }
        String m85333bg = C8668zx.m85333bg(rgo);
        if (TextUtils.isEmpty(m85333bg)) {
            str = rgo;
        } else {
            str = m85333bg;
        }
        this.f18943WR = 0;
        m89392bg(null, str, "text/html", "UTF-8", null);
        this.f18941Ta = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.p314Kg.C8557bX.InterfaceC8560bX
    /* renamed from: IL */
    public void mo85616IL(String str) {
        if (this.f18946eo == null) {
            this.f18946eo = new ArrayList();
        }
        this.f18946eo.add(str);
    }

    /* renamed from: bg */
    public void m85606bg(AbstractC8967tuV abstractC8967tuV, InterfaceC8595IL interfaceC8595IL, String str) {
        this.f18942VB = interfaceC8595IL;
        this.f18947iR = abstractC8967tuV;
        this.f18939Kg = str;
        this.ldr = new C8596bX();
        this.f18948zx = new C8581rri(getContext());
        setWebViewClient(new C8597bg(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                C8590zx.this.f18940PX = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    C8590zx.this.mo85612bg();
                }
            }
        });
        C7755iR.m87832IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = C8590zx.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            C8590zx.this.f18948zx.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.Kg.zx$bX */
    /* loaded from: classes3.dex */
    public static class C8596bX {

        /* renamed from: bg */
        protected int f18954bg = 0;

        /* renamed from: IL */
        private C8657ldr f18953IL = C8657ldr.m85356bg();

        C8596bX() {
        }

        /* renamed from: IL */
        public void m85598IL() {
            m85597bg();
        }

        /* renamed from: bg */
        public void m85595bg(WebView webView) {
            if (webView != null && this.f18954bg == 0) {
                if (this.f18953IL == null) {
                    this.f18953IL = C8657ldr.m85356bg();
                }
                this.f18953IL.m85351bg(webView);
                this.f18953IL.m85368IL();
                this.f18954bg = 1;
            }
        }

        /* renamed from: bg */
        public void m85594bg(boolean z) {
            C8657ldr c8657ldr;
            if (this.f18954bg == 1 && z && (c8657ldr = this.f18953IL) != null) {
                c8657ldr.m85358bX();
                this.f18954bg = 3;
            }
        }

        /* renamed from: bg */
        public void m85596bg(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            C8657ldr c8657ldr = this.f18953IL;
            if (c8657ldr != null) {
                c8657ldr.m85353bg(view, friendlyObstructionPurpose);
            }
        }

        /* renamed from: bg */
        public void m85597bg() {
            C8657ldr c8657ldr;
            int i = this.f18954bg;
            if (i != 0 && i != 4 && (c8657ldr = this.f18953IL) != null) {
                c8657ldr.eqN();
            }
            this.f18954bg = 4;
            this.f18953IL = null;
        }
    }

    /* renamed from: bg */
    public void m85610bg(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.ldr.m85596bg(view, friendlyObstructionPurpose);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.p314Kg.C8557bX.InterfaceC8560bX
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo85605bg(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p314Kg.C8590zx.mo85605bg(java.lang.String):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.p314Kg.C8557bX.InterfaceC8560bX
    /* renamed from: bg */
    public void mo85611bg(int i, int i2) {
        InterfaceC8595IL interfaceC8595IL = this.f18942VB;
        if (interfaceC8595IL != null) {
            interfaceC8595IL.mo85601bg(i, i2);
        }
        this.f18943WR = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.f18941Ta);
        } catch (Throwable unused) {
        }
        C9165bX.m83442IL(this.f18947iR, this.f18939Kg, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p314Kg.C8557bX.InterfaceC8560bX
    /* renamed from: bg */
    public void mo85612bg() {
        if (this.f18944bX.compareAndSet(false, true)) {
            this.f18945bg = true;
            this.ldr.m85595bg(getWebView());
            this.ldr.m85594bg(this.f18938IL);
            m85615Lq();
            xxp();
        }
    }
}
