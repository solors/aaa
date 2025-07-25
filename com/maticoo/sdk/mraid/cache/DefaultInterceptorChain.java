package com.maticoo.sdk.mraid.cache;

import android.webkit.WebResourceResponse;
import com.maticoo.sdk.mraid.cache.WebResInterceptor;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class DefaultInterceptorChain implements WebResInterceptor.Chain {
    private int index;
    private List<BaseInterceptor> interceptors;
    private Map<String, String> requestHeaders;
    private String requestUrl;

    public DefaultInterceptorChain(List<BaseInterceptor> list, String str, Map<String, String> map, int i) {
        this.interceptors = list;
        this.requestUrl = str;
        this.requestHeaders = map;
        this.index = i;
    }

    @Override // com.maticoo.sdk.mraid.cache.WebResInterceptor.Chain
    public Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.maticoo.sdk.mraid.cache.WebResInterceptor.Chain
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Override // com.maticoo.sdk.mraid.cache.WebResInterceptor.Chain
    public WebResourceResponse proceed(String str, Map<String, String> map) {
        if (this.index >= this.interceptors.size()) {
            return null;
        }
        return this.interceptors.get(this.index).intercept(new DefaultInterceptorChain(this.interceptors, this.requestUrl, this.requestHeaders, this.index + 1));
    }
}
