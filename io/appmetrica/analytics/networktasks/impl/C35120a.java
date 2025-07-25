package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.networktasks.impl.a */
/* loaded from: classes9.dex */
public final class C35120a {
    /* renamed from: a */
    public static Response m20660a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod("GET");
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder withSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i = AbstractC35121b.f95850a;
        return withSslSocketFactory.withConnectTimeout(i).withReadTimeout(i).build().newCall(withMethod.build()).execute();
    }
}
