package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.e0 */
/* loaded from: classes4.dex */
public final class C15522e0 {

    /* renamed from: a */
    public final String f30758a;

    /* renamed from: b */
    public final String f30759b;

    /* renamed from: c */
    public final HashMap f30760c;

    public C15522e0(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders;
        this.f30758a = webResourceRequest.getUrl().toString();
        this.f30759b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            requestHeaders = Collections.emptyMap();
        } else {
            requestHeaders = webResourceRequest.getRequestHeaders();
        }
        this.f30760c = new HashMap(requestHeaders);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15522e0.class != obj.getClass()) {
            return false;
        }
        C15522e0 c15522e0 = (C15522e0) obj;
        if (!this.f30758a.equals(c15522e0.f30758a) || !this.f30759b.equals(c15522e0.f30759b)) {
            return false;
        }
        return this.f30760c.equals(c15522e0.f30760c);
    }

    public final int hashCode() {
        int hashCode = this.f30759b.hashCode();
        return this.f30760c.hashCode() + ((hashCode + (this.f30758a.hashCode() * 31)) * 31);
    }
}
