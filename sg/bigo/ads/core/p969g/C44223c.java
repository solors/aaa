package sg.bigo.ads.core.p969g;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43819d;

/* renamed from: sg.bigo.ads.core.g.c */
/* loaded from: classes10.dex */
public class C44223c extends WebChromeClient {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3536a(WebView webView, String str, String str2) {
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster == null) {
            return C43819d.m4922a(1, 1, Bitmap.Config.ARGB_8888);
        }
        return defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
        return m3631a(webView, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
        return m3631a(webView, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
        return m3631a(webView, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull JsPromptResult jsPromptResult) {
        return m3631a(webView, jsPromptResult);
    }

    /* renamed from: a */
    private static boolean m3631a(@NonNull WebView webView, @NonNull JsResult jsResult) {
        if (webView.getContext() instanceof Activity) {
            return false;
        }
        jsResult.confirm();
        return true;
    }
}
