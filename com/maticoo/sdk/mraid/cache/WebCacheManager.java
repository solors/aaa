package com.maticoo.sdk.mraid.cache;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class WebCacheManager {
    private List<BaseInterceptor> cacheInterceptors = new ArrayList();

    public static WebCacheManager newInstance() {
        return new WebCacheManager();
    }

    public void addCacheInterceptor(BaseInterceptor baseInterceptor) {
        if (baseInterceptor != null) {
            this.cacheInterceptors.add(baseInterceptor);
        }
    }

    @RequiresApi(api = 21)
    public WebResourceResponse interceptWebResRequest(WebResourceRequest webResourceRequest) {
        return interceptWebResRequest(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }

    public WebResourceResponse interceptWebResRequest(String str) {
        return interceptWebResRequest(str, null);
    }

    private WebResourceResponse interceptWebResRequest(String str, Map<String, String> map) {
        if (this.cacheInterceptors.isEmpty()) {
            return null;
        }
        return new DefaultInterceptorChain(this.cacheInterceptors, str, map, 0).proceed(str, map);
    }
}
