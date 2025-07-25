package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.mbridge.msdk.mbsignalcommon.base.WindVaneKeyMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.g */
/* loaded from: classes6.dex */
public final class WindVaneCallJs {

    /* renamed from: a */
    private static WindVaneCallJs f57762a = new WindVaneCallJs();

    private WindVaneCallJs() {
    }

    /* renamed from: a */
    public static WindVaneCallJs m51063a() {
        return f57762a;
    }

    /* renamed from: b */
    public final void m51058b(Object obj, String str) {
        if (obj instanceof CallMethodContext) {
            CallMethodContext callMethodContext = (CallMethodContext) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", callMethodContext.f57745g);
            } else {
                str = WindVaneUtil.m51052c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", callMethodContext.f57745g, str);
            WindVaneWebView windVaneWebView = callMethodContext.f57740b;
            if (windVaneWebView != null && !windVaneWebView.isDestoryed()) {
                try {
                    callMethodContext.f57740b.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m51059a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof CallMethodContext) {
            CallMethodContext callMethodContext = (CallMethodContext) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, WindVaneUtil.m51052c(str2));
            }
            WindVaneWebView windVaneWebView = callMethodContext.f57740b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                callMethodContext.f57740b.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m51061a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, WindVaneUtil.m51052c(str2));
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m51060a(Object obj, String str) {
        if (obj instanceof CallMethodContext) {
            CallMethodContext callMethodContext = (CallMethodContext) obj;
            String format = TextUtils.isEmpty(str) ? String.format("javascript:window.WindVane.onSuccess(%s,'');", callMethodContext.f57745g) : String.format("javascript:window.WindVane.onSuccess(%s,'%s');", callMethodContext.f57745g, WindVaneUtil.m51052c(str));
            WindVaneWebView windVaneWebView = callMethodContext.f57740b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                callMethodContext.f57740b.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m51062a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", SimpleSignInService.SDK_VERSION);
            f57762a.m51061a(webView, WindVaneKeyMap.f57638j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f57762a.m51061a(webView, WindVaneKeyMap.f57638j, "");
        } catch (Throwable unused2) {
            f57762a.m51061a(webView, WindVaneKeyMap.f57638j, "");
        }
    }
}
