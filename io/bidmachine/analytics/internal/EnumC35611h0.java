package io.bidmachine.analytics.internal;

import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: io.bidmachine.analytics.internal.h0 */
/* loaded from: classes9.dex */
public enum EnumC35611h0 {
    Get("GET"),
    Post("POST");
    

    /* renamed from: a */
    private final String f96469a;

    EnumC35611h0(String str) {
        this.f96469a = str;
    }

    /* renamed from: a */
    public final void m20205a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f96469a);
        }
    }
}
