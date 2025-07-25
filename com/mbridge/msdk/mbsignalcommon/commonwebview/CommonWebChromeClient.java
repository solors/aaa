package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.a */
/* loaded from: classes6.dex */
public final class CommonWebChromeClient extends WebChromeClient {

    /* renamed from: a */
    private CopyOnWriteArrayList<WebChromeClient> f57692a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void m51126a(WebChromeClient webChromeClient) {
        this.f57692a.add(webChromeClient);
    }

    /* renamed from: b */
    public final void m51125b(WebChromeClient webChromeClient) {
        this.f57692a.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onConsoleMessage(String str, int i, String str2) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onCreateWindow(webView, z, z2, message);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onJsTimeout();
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f57692a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebChromeClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f57692a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebChromeClient", e.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onReachedMaxAppCacheSize(j, j2, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z = false;
        try {
            Iterator<WebChromeClient> it = this.f57692a.iterator();
            while (it.hasNext()) {
                z = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("CommonWebChromeClient", e.getMessage());
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().onConsoleMessage(consoleMessage);
        }
        return z;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f57692a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, i, customViewCallback);
        }
    }
}
