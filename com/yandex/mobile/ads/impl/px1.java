package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qd1;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class px1 extends C30306fd {

    /* renamed from: h */
    public static final /* synthetic */ int f84108h = 0;

    /* renamed from: com.yandex.mobile.ads.impl.px1$a */
    /* loaded from: classes8.dex */
    public static final class C31158a {
        private C31158a() {
        }

        @Nullable
        /* renamed from: a */
        public static px1 m30568a(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.m17073h(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.m17073h(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.m17074g(cls3);
                return new px1(cls, cls2, cls3);
            } catch (Exception e) {
                int i = qd1.f84303c;
                qd1.C31196a.m30396a().getClass();
                qd1.m30403a(5, "unable to load android socket classes", e);
                return null;
            }
        }

        public /* synthetic */ C31158a(int i) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ px1 m30569a() {
            return m30568a("com.android.org.conscrypt");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px1(@NotNull Class<? super SSLSocket> sslSocketClass, @NotNull Class<? super SSLSocketFactory> sslSocketFactoryClass, @NotNull Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
    }
}
