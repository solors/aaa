package com.maticoo.sdk.videocache.headers;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class EmptyHeadersInjector implements HeaderInjector {
    @Override // com.maticoo.sdk.videocache.headers.HeaderInjector
    public Map<String, String> addHeaders(String str) {
        return new HashMap();
    }
}
