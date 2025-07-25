package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.k7 */
/* loaded from: classes3.dex */
public class C10001k7 {
    /* renamed from: a */
    public HttpsURLConnection m81220a(AbstractC9754c2 request) {
        HttpsURLConnection httpsURLConnection;
        Intrinsics.checkNotNullParameter(request, "request");
        URLConnection openConnection = new URL(request.m81934e()).openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            httpsURLConnection = (HttpsURLConnection) openConnection;
        } else {
            httpsURLConnection = null;
        }
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}
