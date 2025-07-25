package com.pubmatic.sdk.common.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;

/* loaded from: classes7.dex */
public class POBWebView extends WebView {
    @Nullable

    /* renamed from: a */
    private WebViewBackPress f70330a;
    @Nullable

    /* renamed from: b */
    private OnFocusChangedListener f70331b;
    @Nullable

    /* renamed from: c */
    private MutableContextWrapper f70332c;

    /* loaded from: classes7.dex */
    public interface OnFocusChangedListener {
        void onFocusChanged(boolean z);
    }

    /* loaded from: classes7.dex */
    public interface WebViewBackPress {
        void onBackPress();
    }

    protected POBWebView(@NonNull Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Nullable
    public static POBWebView createInstance(@NonNull Context context) {
        POBWebView pOBWebView;
        MutableContextWrapper mutableContextWrapper;
        try {
            mutableContextWrapper = new MutableContextWrapper(context);
            pOBWebView = new POBWebView(mutableContextWrapper);
        } catch (Exception unused) {
            pOBWebView = null;
        }
        try {
            pOBWebView.f70332c = mutableContextWrapper;
        } catch (Exception unused2) {
            POBLog.error("POBWebView", "Unable to instantiate Web View", new Object[0]);
            return pOBWebView;
        }
        return pOBWebView;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (i == 4) {
                WebViewBackPress webViewBackPress = this.f70330a;
                if (webViewBackPress != null) {
                    webViewBackPress.onBackPress();
                    return true;
                }
            } else {
                POBLog.debug("POBWebView", "default case, keyCode:" + i, new Object[0]);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        POBLog.debug("POBWebView", "hasWindowFocus :" + z, new Object[0]);
        OnFocusChangedListener onFocusChangedListener = this.f70331b;
        if (onFocusChangedListener != null) {
            onFocusChangedListener.onFocusChanged(z);
        }
    }

    public void setBaseContext(@NonNull Context context) {
        MutableContextWrapper mutableContextWrapper = this.f70332c;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(context);
        }
    }

    public void setOnfocusChangedListener(@Nullable OnFocusChangedListener onFocusChangedListener) {
        this.f70331b = onFocusChangedListener;
    }

    public void setWebViewBackPress(@Nullable WebViewBackPress webViewBackPress) {
        this.f70330a = webViewBackPress;
    }
}
