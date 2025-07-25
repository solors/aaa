package com.pubmatic.sdk.common.browser;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.R$drawable;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBAlertDialog;
import com.pubmatic.sdk.common.utility.POBDeepLinkUtil;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import java.util.ArrayList;
import java.util.List;
import p978t3.WebViewRenderException;

/* loaded from: classes7.dex */
public class POBInternalBrowserActivity extends Activity {
    @Nullable

    /* renamed from: a */
    private static List<InternalBrowserListener> f70055a;
    @Nullable

    /* renamed from: b */
    private ImageView f70056b;
    @Nullable

    /* renamed from: c */
    private ImageView f70057c;
    @Nullable

    /* renamed from: d */
    private WebView f70058d;
    @Nullable

    /* renamed from: e */
    private ProgressBar f70059e;

    /* renamed from: f */
    private int f70060f;
    @Nullable

    /* renamed from: g */
    private AlertDialog f70061g;
    @Nullable

    /* renamed from: h */
    private ViewGroup f70062h;

    /* loaded from: classes7.dex */
    public interface InternalBrowserListener {
        void onBrowserDismiss();

        void onBrowserStart();

        void onExternalBrowserClick(@NonNull String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26686a implements View.OnClickListener {
        View$OnClickListenerC26686a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$b */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26687b implements View.OnClickListener {
        View$OnClickListenerC26687b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.m40640l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$c */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26688c implements View.OnClickListener {
        View$OnClickListenerC26688c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInternalBrowserActivity.this.f70058d != null) {
                POBInternalBrowserActivity.this.f70058d.goForward();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$d */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26689d implements View.OnClickListener {
        View$OnClickListenerC26689d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInternalBrowserActivity.this.f70058d != null) {
                POBInternalBrowserActivity.this.f70058d.reload();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$e */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26690e implements View.OnClickListener {
        View$OnClickListenerC26690e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.m40642j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.common.browser.POBInternalBrowserActivity$f */
    /* loaded from: classes7.dex */
    public class C26691f extends WebViewClient {
        private C26691f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (POBInternalBrowserActivity.this.f70059e != null) {
                POBInternalBrowserActivity.this.f70059e.setVisibility(8);
            }
            if (POBInternalBrowserActivity.this.f70058d != null) {
                if (POBInternalBrowserActivity.this.f70056b != null) {
                    POBInternalBrowserActivity pOBInternalBrowserActivity = POBInternalBrowserActivity.this;
                    pOBInternalBrowserActivity.m40666a(pOBInternalBrowserActivity.f70056b, POBInternalBrowserActivity.this.f70058d.canGoBack());
                }
                if (POBInternalBrowserActivity.this.f70057c != null) {
                    POBInternalBrowserActivity pOBInternalBrowserActivity2 = POBInternalBrowserActivity.this;
                    pOBInternalBrowserActivity2.m40666a(pOBInternalBrowserActivity2.f70057c, POBInternalBrowserActivity.this.f70058d.canGoForward());
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (POBInternalBrowserActivity.this.f70059e != null) {
                POBInternalBrowserActivity.this.f70059e.setVisibility(0);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ProgressBar unused = POBInternalBrowserActivity.this.f70059e;
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            POBLog.warn("POBInternalBrowserActivity", "SSL error: %s", sslError);
            if (POBInternalBrowserActivity.this.f70059e != null) {
                POBInternalBrowserActivity.this.f70059e.setVisibility(8);
            }
            String str = "Connection to this site is not secure: " + POBInternalBrowserActivity.this.m40657b(sslError.getPrimaryError());
            if (!POBInternalBrowserActivity.this.isFinishing()) {
                if (POBInternalBrowserActivity.this.f70061g == null) {
                    AlertDialog.Builder build = POBAlertDialog.build(POBInternalBrowserActivity.this, "Warning!", str, new C26692a(this, sslErrorHandler));
                    if (build != null) {
                        try {
                            POBInternalBrowserActivity.this.f70061g = build.create();
                            POBInternalBrowserActivity.this.f70061g.show();
                            return;
                        } catch (Exception unused) {
                            POBLog.error("POBInternalBrowserActivity", "Error showing ssl error dialog.", new Object[0]);
                            return;
                        }
                    }
                    return;
                } else if (!POBInternalBrowserActivity.this.f70061g.isShowing()) {
                    POBInternalBrowserActivity.this.f70061g.setMessage(str);
                    POBInternalBrowserActivity.this.f70061g.show();
                    return;
                } else {
                    return;
                }
            }
            POBLog.warn("POBInternalBrowserActivity", "Error showing ssl error dialog as activity is finishing!", new Object[0]);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            POBInternalBrowserActivity.this.m40645h();
            POBInternalBrowserActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }

        /* synthetic */ C26691f(POBInternalBrowserActivity pOBInternalBrowserActivity, View$OnClickListenerC26686a view$OnClickListenerC26686a) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return POBDeepLinkUtil.validateAndRedirect(POBInternalBrowserActivity.this, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (POBInternalBrowserActivity.this.f70059e != null) {
                POBInternalBrowserActivity.this.f70059e.setVisibility(8);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: b */
    public String m40657b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "SSL Error." : "Certificate Invalid." : "Invalid Date." : "Untrusted Certificate." : "Domain Name Mismatched." : "Certificate Expired." : "Certificate Invalid.";
    }

    /* renamed from: i */
    private void m40643i() {
        List<InternalBrowserListener> list = f70055a;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f70060f == internalBrowserListener.hashCode()) {
                    internalBrowserListener.onBrowserDismiss();
                    m40664a(internalBrowserListener);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m40642j() {
        List<InternalBrowserListener> list = f70055a;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f70058d != null && internalBrowserListener.hashCode() == this.f70060f) {
                    String url = this.f70058d.getUrl();
                    if (url != null) {
                        internalBrowserListener.onExternalBrowserClick(url);
                    } else {
                        POBLog.debug("POBInternalBrowserActivity", "Can't open external browser as url is not available.", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m40641k() {
        List<InternalBrowserListener> list = f70055a;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f70060f == internalBrowserListener.hashCode()) {
                    internalBrowserListener.onBrowserStart();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m40640l() {
        WebView webView = this.f70058d;
        if (webView != null && webView.canGoBack()) {
            this.f70058d.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public static void startNewActivity(@NonNull Context context, @NonNull String str, @NonNull InternalBrowserListener internalBrowserListener) {
        if (f70055a == null) {
            f70055a = new ArrayList();
        }
        f70055a.add(internalBrowserListener);
        Intent intent = new Intent(context, POBInternalBrowserActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("url", str);
        intent.putExtra("listener_hash_code", internalBrowserListener.hashCode());
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e) {
            POBLog.error("POBInternalBrowserActivity", "Error starting internal browser activity: %s", e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m40640l();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m40655c());
        this.f70062h = (ViewGroup) findViewById(16908290);
        this.f70060f = getIntent().getIntExtra("listener_hash_code", 0);
        m40659a(getIntent().getStringExtra("url"));
        m40641k();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        POBLog.debug("POBInternalBrowserActivity", "Activity on destroy called.", new Object[0]);
        m40645h();
        AlertDialog alertDialog = this.f70061g;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f70061g = null;
        }
        super.onDestroy();
        m40643i();
    }

    @NonNull
    /* renamed from: c */
    private RelativeLayout m40655c() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        m40665a(relativeLayout);
        return relativeLayout;
    }

    @NonNull
    /* renamed from: d */
    private ImageView m40653d() {
        ImageView m40667a = m40667a(R$drawable.pob_ic_action_web_site);
        m40667a.setOnClickListener(new View$OnClickListenerC26690e());
        return m40667a;
    }

    /* renamed from: e */
    private ImageView m40651e() {
        ImageView m40667a = m40667a(R$drawable.pob_ic_action_forward);
        this.f70057c = m40667a;
        m40666a(m40667a, false);
        this.f70057c.setOnClickListener(new View$OnClickListenerC26688c());
        return this.f70057c;
    }

    @NonNull
    /* renamed from: f */
    private ImageView m40649f() {
        ImageView m40667a = m40667a(R$drawable.pob_ic_action_refresh);
        m40667a.setOnClickListener(new View$OnClickListenerC26689d());
        return m40667a;
    }

    @Nullable
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: g */
    private WebView m40647g() {
        POBWebView createInstance = POBWebView.createInstance(POBUtils.resolveWebViewContext(this));
        if (createInstance != null) {
            WebSettings settings = createInstance.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            createInstance.setWebViewClient(new C26691f(this, null));
        }
        return createInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m40645h() {
        ViewGroup viewGroup = this.f70062h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f70062h = null;
        }
        WebView webView = this.f70058d;
        if (webView != null) {
            webView.setWebViewClient(null);
            this.f70058d.destroy();
            this.f70058d = null;
        }
    }

    @NonNull
    /* renamed from: b */
    private ImageView m40658b() {
        ImageView m40667a = m40667a(R$drawable.pob_ic_action_cancel);
        m40667a.setOnClickListener(new View$OnClickListenerC26686a());
        return m40667a;
    }

    /* renamed from: a */
    private void m40664a(@NonNull InternalBrowserListener internalBrowserListener) {
        List<InternalBrowserListener> list = f70055a;
        if (list != null) {
            list.remove(internalBrowserListener);
            if (f70055a.isEmpty()) {
                f70055a = null;
            }
        }
    }

    /* renamed from: a */
    private void m40659a(@Nullable String str) {
        if (this.f70058d != null && !POBUtils.isNullOrEmpty(str)) {
            POBLog.debug("POBInternalBrowserActivity", "Loading url in internal browser : %s", str);
            this.f70058d.loadUrl(str);
            return;
        }
        POBLog.warn("POBInternalBrowserActivity", "Unable to open internal browser : %s", "Invalid url");
    }

    /* renamed from: a */
    private void m40665a(RelativeLayout relativeLayout) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, POBUtils.convertDpToPixel(40));
        layoutParams.addRule(12);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(R$id.pob_dialog_id);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams2.setMargins(2, 4, 2, 2);
        linearLayout.addView(m40658b(), layoutParams2);
        linearLayout.addView(m40668a(), layoutParams2);
        linearLayout.addView(m40651e(), layoutParams2);
        linearLayout.addView(m40649f(), layoutParams2);
        linearLayout.addView(m40653d(), layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, linearLayout.getId());
        WebView m40647g = m40647g();
        this.f70058d = m40647g;
        if (m40647g != null) {
            relativeLayout.addView(m40647g, layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(13);
            ProgressBar progressBar = new ProgressBar(this, null, 16842871);
            this.f70059e = progressBar;
            relativeLayout.addView(progressBar, layoutParams4);
            return;
        }
        finish();
    }

    @NonNull
    /* renamed from: a */
    private ImageView m40668a() {
        ImageView m40667a = m40667a(R$drawable.pob_ic_action_back);
        this.f70056b = m40667a;
        m40666a(m40667a, false);
        this.f70056b.setOnClickListener(new View$OnClickListenerC26687b());
        return this.f70056b;
    }

    @NonNull
    /* renamed from: a */
    private ImageView m40667a(int i) {
        ImageView imageView = new ImageView(this);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setImageResource(i);
        imageView.setBackgroundColor(getResources().getColor(17170446, getTheme()));
        imageView.setScaleType(scaleType);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40666a(@NonNull ImageView imageView, boolean z) {
        if (z) {
            imageView.setEnabled(true);
            imageView.setImageAlpha(255);
            return;
        }
        imageView.setEnabled(false);
        imageView.setImageAlpha(160);
    }
}
