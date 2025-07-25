package com.pubmatic.sdk.webrendering.p566ui;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

@MainThread
/* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer */
/* loaded from: classes7.dex */
public class POBHTMLRenderer implements POBHTMLViewClient.HTMLViewClientListener {
    @Nullable

    /* renamed from: a */
    private POBHtmlRendererListener f71277a;
    @Nullable

    /* renamed from: b */
    private POBWebView f71278b;

    /* renamed from: c */
    private boolean f71279c;
    @NonNull

    /* renamed from: d */
    private final Formatter f71280d;

    /* renamed from: e */
    private long f71281e = 15;
    @Nullable

    /* renamed from: f */
    private POBTimeoutHandler f71282f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer$a */
    /* loaded from: classes7.dex */
    public class C26950a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26950a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBHTMLRenderer pOBHTMLRenderer = POBHTMLRenderer.this;
            pOBHTMLRenderer.notifyError(new POBError(1009, String.format("Unable to render creative within %s seconds.", Long.valueOf(pOBHTMLRenderer.f71281e))));
        }
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer$b */
    /* loaded from: classes7.dex */
    class RunnableC26951b implements Runnable {
        RunnableC26951b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBHTMLRenderer.this.invalidateWebView();
        }
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer$c */
    /* loaded from: classes7.dex */
    class View$OnTouchListenerC26952c implements View.OnTouchListener {
        View$OnTouchListenerC26952c() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                POBHTMLRenderer.this.f71279c = true;
                return false;
            }
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public POBHTMLRenderer(@NonNull POBWebView pOBWebView, @NonNull POBHTMLViewClient pOBHTMLViewClient) {
        this.f71278b = pOBWebView;
        pOBWebView.setWebViewClient(pOBHTMLViewClient);
        this.f71278b.setOnTouchListener(new View$OnTouchListenerC26952c());
        pOBHTMLViewClient.setHTMLClientListener(this);
        this.f71280d = new Formatter(Locale.getDefault());
    }

    @MainThread
    /* renamed from: b */
    private void m39831b() {
        if (this.f71282f == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26950a());
            this.f71282f = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.f71281e * 1000);
        }
    }

    public void destroy() {
        m39834a();
        POBWebView pOBWebView = this.f71278b;
        if (pOBWebView != null) {
            pOBWebView.postDelayed(new RunnableC26951b(), 1000L);
        }
    }

    public void invalidateWebView() {
        POBWebView pOBWebView = this.f71278b;
        if (pOBWebView != null) {
            pOBWebView.setWebViewClient(null);
            this.f71278b.stopLoading();
            this.f71278b.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            this.f71278b.clearHistory();
            this.f71278b.destroy();
            this.f71278b = null;
        }
    }

    public boolean isUserInteracted() {
        return this.f71279c;
    }

    public void loadHTML(@Nullable String str, @Nullable String str2, boolean z) {
        if (this.f71278b != null) {
            if (str != null) {
                try {
                    if (z) {
                        this.f71280d.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1\"/><style>body{margin:0;padding:0;}div{display:block;width:100%%;height:100%%;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                    } else {
                        this.f71280d.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0\"/><style>body{margin:0;padding:0;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                    }
                    String valueOf = String.valueOf(this.f71280d);
                    this.f71280d.close();
                    Trace.endSection();
                    Trace.beginSection("POB Rendering");
                    this.f71278b.loadDataWithBaseURL(str2, valueOf, "text/html", StandardCharsets.UTF_8.name(), null);
                    if (!z) {
                        m39831b();
                    }
                } catch (OutOfMemoryError | IllegalFormatException e) {
                    notifyError(new POBError(1009, "Unable to render creative, due to " + e.getMessage()));
                }
            } else if (str2 != null) {
                Trace.endSection();
                Trace.beginSection("POB Rendering");
                this.f71278b.loadUrl(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyError(POBError pOBError) {
        m39834a();
        POBHtmlRendererListener pOBHtmlRendererListener = this.f71277a;
        if (pOBHtmlRendererListener != null) {
            pOBHtmlRendererListener.onViewRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient.HTMLViewClientListener
    public void onPageFinished(@NonNull WebView webView) {
        m39834a();
        POBHtmlRendererListener pOBHtmlRendererListener = this.f71277a;
        if (pOBHtmlRendererListener != null) {
            pOBHtmlRendererListener.onViewRendered(webView);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient.HTMLViewClientListener
    public void onReceivedError(@NonNull POBError pOBError) {
        notifyError(pOBError);
    }

    public void setRendererViewListener(@Nullable POBHtmlRendererListener pOBHtmlRendererListener) {
        this.f71277a = pOBHtmlRendererListener;
    }

    public void setRenderingTimeout(int i) {
        this.f71281e = i;
    }

    public void setUserInteracted(boolean z) {
        this.f71279c = z;
    }

    @Override // com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient.HTMLViewClientListener
    public boolean shouldOverrideUrlLoading(@Nullable String str) {
        POBHtmlRendererListener pOBHtmlRendererListener = this.f71277a;
        if (pOBHtmlRendererListener == null || !this.f71279c) {
            return false;
        }
        this.f71279c = false;
        pOBHtmlRendererListener.onViewClicked(str);
        return true;
    }

    /* renamed from: a */
    private void m39834a() {
        POBTimeoutHandler pOBTimeoutHandler = this.f71282f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f71282f = null;
        }
    }
}
