package com.maticoo.sdk.p405ad.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.maticoo.sdk.core.imp.nativead.MediaContentImpl;
import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.nativead.NativeAdOptions;
import com.maticoo.sdk.p405ad.utils.error.Error;
import com.maticoo.sdk.p405ad.utils.error.ErrorBuilder;
import com.maticoo.sdk.p405ad.utils.webview.BaseWebView;
import com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient;
import com.maticoo.sdk.p405ad.utils.webview.JsBridge;
import com.maticoo.sdk.p405ad.utils.webview.JsBridgeConstants;
import com.maticoo.sdk.utils.ViewUtils;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.nativead.view.MediaView */
/* loaded from: classes6.dex */
public class MediaView extends FrameLayout implements JsBridge.MessageListener {
    private static final String TAG = "zMaticoo_MediaView";
    private ImageView adChoiceView;
    private MediaClickListener clickListener;
    private BaseWebView contentWebView;
    private boolean isAdClosed;
    private boolean isAttachToWindow;
    private boolean isContentLoaded;
    protected JsBridge jsBridge;
    private NativeAd.MediaContent mediaContent;

    /* renamed from: com.maticoo.sdk.ad.nativead.view.MediaView$MediaClickListener */
    /* loaded from: classes6.dex */
    public interface MediaClickListener {
        void onLogoClick();

        void onMediaClick(WebView webView, String str, String str2);

        void onRenderFailed(Error error, RenderProcessGoneDetail renderProcessGoneDetail);

        void onVideoCompleted();

        void onVideoMuted(int i);

        void onVideoStarted();
    }

    public MediaView(@NonNull Context context) {
        super(context);
        this.isAdClosed = false;
        this.isAttachToWindow = false;
        this.isContentLoaded = false;
        init(context, null);
    }

    private void displayAdChoice(int i) {
        ImageView imageView = this.adChoiceView;
        if (imageView != null) {
            ViewUtils.removeFromParent(imageView);
        } else {
            this.adChoiceView = ViewUtils.createLargeLogoView(getContext());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.adChoiceView.getLayoutParams();
        layoutParams.gravity = getAdChoiceGravity(i);
        this.adChoiceView.setLayoutParams(layoutParams);
        this.adChoiceView.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.ad.nativead.view.MediaView.2
            {
                MediaView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaView.this.clickListener != null) {
                    MediaView.this.clickListener.onLogoClick();
                }
            }
        });
        addView(this.adChoiceView);
        this.adChoiceView.bringToFront();
    }

    private int getAdChoiceGravity(int i) {
        if (i != 1) {
            if (i != 2) {
                return 8388691;
            }
            return 8388693;
        }
        return 8388661;
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super.setTag(TAG);
        this.contentWebView = new BaseWebView(context);
        this.contentWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.contentWebView.setWebViewClient(new BaseWebViewClient() { // from class: com.maticoo.sdk.ad.nativead.view.MediaView.1
            {
                MediaView.this = this;
            }

            @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient, android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                    webView.destroy();
                }
                if (MediaView.this.clickListener != null) {
                    MediaView.this.clickListener.onRenderFailed(ErrorBuilder.build(312), renderProcessGoneDetail);
                    return true;
                }
                return true;
            }

            @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                DeveloperLog.LogD("BannerWebClient， shouldOverrideUrlLoading ， url = " + str);
                if (super.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                MediaView.this.clickListener.onMediaClick(MediaView.this.contentWebView, "native-inner", str);
                return true;
            }
        });
        addView(this.contentWebView);
        JsBridge jsBridge = new JsBridge();
        this.jsBridge = jsBridge;
        jsBridge.setMessageListener(this);
        this.jsBridge.injectJavaScript(this.contentWebView, "sdk");
        this.contentWebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
    }

    private void loadWebViewContent() {
        NativeAd.MediaContent mediaContent;
        NativeAdOptions nativeAdOptions;
        if (this.isContentLoaded || !this.isAttachToWindow || (mediaContent = this.mediaContent) == null) {
            return;
        }
        try {
            this.contentWebView.loadUrl(mediaContent.getContentUrl());
            NativeAd.MediaContent mediaContent2 = this.mediaContent;
            if ((mediaContent2 instanceof MediaContentImpl) && (nativeAdOptions = ((MediaContentImpl) mediaContent2).getNativeAdOptions()) != null) {
                displayAdChoice(nativeAdOptions.getAdChoicesPlacement());
            }
            this.isContentLoaded = true;
        } catch (Exception e) {
            DeveloperLog.LogE(e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e);
        }
    }

    public void close() {
        this.isAdClosed = true;
        pause();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachToWindow = true;
        DeveloperLog.LogD("onAttachedToWindow");
        loadWebViewContent();
        resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachToWindow = false;
        DeveloperLog.LogD("onDetachedFromWindow");
        pause();
    }

    @Override // com.maticoo.sdk.p405ad.utils.webview.JsBridge.MessageListener
    public void onReceiveMessage(String str, JSONObject jSONObject) {
        if (JsBridgeConstants.METHOD_VIDEO_IMPL.equals(str)) {
            MediaClickListener mediaClickListener = this.clickListener;
            if (mediaClickListener != null) {
                mediaClickListener.onVideoStarted();
            }
        } else if ("video_completed".equals(str)) {
            MediaClickListener mediaClickListener2 = this.clickListener;
            if (mediaClickListener2 != null) {
                mediaClickListener2.onVideoCompleted();
            }
        } else if ("click".equals(str)) {
            String optString = jSONObject.optString(C21114v8.C21122h.f54038L);
            String optString2 = jSONObject.optString("url");
            MediaClickListener mediaClickListener3 = this.clickListener;
            if (mediaClickListener3 != null) {
                mediaClickListener3.onMediaClick(this.contentWebView, optString, optString2);
            }
        } else if (JsBridgeConstants.METHOD_TRUMPET.equals(str)) {
            int optInt = jSONObject.optInt("isMute", -1);
            MediaClickListener mediaClickListener4 = this.clickListener;
            if (mediaClickListener4 != null) {
                mediaClickListener4.onVideoMuted(optInt);
            }
        }
    }

    public void pause() {
        JsBridge jsBridge = this.jsBridge;
        if (jsBridge != null) {
            jsBridge.reportEvent(JsBridgeConstants.EVENT_PAUSE);
        }
    }

    public void resume() {
        JsBridge jsBridge;
        if (!this.isAdClosed && (jsBridge = this.jsBridge) != null) {
            jsBridge.reportEvent(JsBridgeConstants.EVENT_RESUME);
        }
    }

    public void setMediaClickListener(MediaClickListener mediaClickListener) {
        this.clickListener = mediaClickListener;
    }

    public void setMediaContent(NativeAd.MediaContent mediaContent) {
        this.mediaContent = mediaContent;
        loadWebViewContent();
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
    }

    @Override // android.view.View
    public void setTag(Object obj) {
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isAdClosed = false;
        this.isAttachToWindow = false;
        this.isContentLoaded = false;
        init(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isAdClosed = false;
        this.isAttachToWindow = false;
        this.isContentLoaded = false;
        init(context, attributeSet);
    }
}
