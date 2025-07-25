package com.mbridge.msdk.mbsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p438c.CommonBitmapUtil;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoader;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebViewClient;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.l */
/* loaded from: classes6.dex */
public final class WindVaneWebViewClient extends BaseWebViewClient {

    /* renamed from: b */
    public static boolean f57780b = true;

    /* renamed from: a */
    protected String f57781a = null;

    /* renamed from: c */
    private int f57782c = 0;

    /* renamed from: d */
    private IWebViewListener f57783d;

    @RequiresApi(api = 11)
    /* renamed from: a */
    private WebResourceResponse m51047a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && WindVaneUtil.m51051d(str)) {
                SameLogTool.m51822c("WindVaneWebViewClient", "is image " + str);
                Bitmap m52262a = CommonImageLoader.m52263a(MBSDKContext.m52746m().m52792c()).m52262a(str);
                SameLogTool.m51822c("WindVaneWebViewClient", "find image from cache " + str);
                if (m52262a != null && !m52262a.isRecycled()) {
                    return new WebResourceResponse(WindVaneUtil.m51050e(str), C20517nb.f52167N, CommonBitmapUtil.m52264a(m52262a));
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f57781a = str;
        IWebViewListener iWebViewListener = this.f57783d;
        if (iWebViewListener != null) {
            iWebViewListener.mo51073a(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse m51047a = m51047a(str);
        if (m51047a != null) {
            SameLogTool.m51822c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
            return m51047a;
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
