package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.k2 */
/* loaded from: classes3.dex */
public abstract class AbstractC9994k2 {

    /* renamed from: a */
    public static final C9995a f22465a = new C9995a(null);

    /* renamed from: com.chartboost.sdk.impl.k2$a */
    /* loaded from: classes3.dex */
    public static final class C9995a {
        public C9995a() {
        }

        /* renamed from: a */
        public final SSLSocketFactory m81230a() {
            SSLContext sSLContext;
            if (Build.VERSION.SDK_INT >= 29) {
                sSLContext = SSLContext.getInstance("TLSv1.3");
            } else {
                sSLContext = SSLContext.getInstance("TLSv1.2");
            }
            if (NetworkHelper.m79775a()) {
                sSLContext.init(null, new X509TrustManager[]{C10023l9.m81170c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public /* synthetic */ C9995a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static final SSLSocketFactory m81231a() {
        return f22465a.m81230a();
    }
}
