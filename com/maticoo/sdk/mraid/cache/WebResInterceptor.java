package com.maticoo.sdk.mraid.cache;

import android.webkit.WebResourceResponse;
import java.util.Map;

/* loaded from: classes6.dex */
interface WebResInterceptor {

    /* loaded from: classes6.dex */
    public interface Chain {
        Map<String, String> getRequestHeaders();

        String getRequestUrl();

        WebResourceResponse proceed(String str, Map<String, String> map);
    }

    WebResourceResponse intercept(Chain chain);
}
