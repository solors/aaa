package p978t3;

import java.util.List;

/* renamed from: t3.a */
/* loaded from: classes6.dex */
public class WebViewRenderException {

    /* renamed from: a */
    private static List<WebViewRenderExceptionCallback> f116480a;

    /* renamed from: a */
    public static void m3275a(Object obj) {
        List<WebViewRenderExceptionCallback> list = f116480a;
        if (list == null) {
            return;
        }
        for (WebViewRenderExceptionCallback webViewRenderExceptionCallback : list) {
            webViewRenderExceptionCallback.m3274a(obj);
        }
    }
}
