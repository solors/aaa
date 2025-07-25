package com.maticoo.sdk.p405ad.utils.webview;

import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* renamed from: com.maticoo.sdk.ad.utils.webview.AdsWebView */
/* loaded from: classes6.dex */
public class AdsWebView {
    private BaseWebView mAdView;

    /* renamed from: com.maticoo.sdk.ad.utils.webview.AdsWebView$AdtWebViewHolder */
    /* loaded from: classes6.dex */
    private static final class AdtWebViewHolder {
        private static final AdsWebView sInstance = new AdsWebView();

        private AdtWebViewHolder() {
        }
    }

    public static AdsWebView getInstance() {
        return AdtWebViewHolder.sInstance;
    }

    public void destroy(BaseWebView baseWebView, String str) {
        if (baseWebView == null) {
            return;
        }
        baseWebView.destroy(str);
    }

    public BaseWebView getAdView() {
        BaseWebView baseWebView = this.mAdView;
        if (baseWebView != null && !baseWebView.isDestroyed()) {
            return this.mAdView;
        }
        init();
        return this.mAdView;
    }

    public void init() {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.ad.utils.webview.AdsWebView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AdsWebView.this.mAdView != null && !AdsWebView.this.mAdView.isDestroyed()) {
                        AdsWebView.this.mAdView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                    }
                    AdsWebView.this.mAdView = new BaseWebView(ApplicationUtil.getInstance().getApplicationContext());
                } catch (Throwable th) {
                    DeveloperLog.LogD("AdsWebView", th);
                    CrashUtil.getSingleton().reportSDKException(th, "AdsWebView");
                }
            }
        });
    }

    private AdsWebView() {
    }
}
