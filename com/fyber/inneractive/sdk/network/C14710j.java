package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.j */
/* loaded from: classes4.dex */
public final class C14710j extends C14714l {

    /* renamed from: g */
    public final HttpURLConnection f27879g;

    public C14710j(HttpURLConnection httpURLConnection, int i, FilterInputStream filterInputStream, Map map, String str) {
        this.f27879g = httpURLConnection;
        this.f27882a = i;
        this.f27884c = filterInputStream;
        this.f27885d = map;
        this.f27886e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.C14714l
    /* renamed from: a */
    public final void mo77681a() {
        try {
            HttpURLConnection httpURLConnection = this.f27879g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.mo77681a();
    }
}
