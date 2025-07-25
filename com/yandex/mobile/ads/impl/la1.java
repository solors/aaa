package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class la1 {

    /* renamed from: a */
    private final int f81756a;

    /* renamed from: b */
    private final int f81757b;
    @Nullable

    /* renamed from: c */
    private final SSLSocketFactory f81758c;

    public la1(int i, int i2, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f81756a = i;
        this.f81757b = i2;
        this.f81758c = sSLSocketFactory;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1Var = (la1) obj;
        if (this.f81756a == la1Var.f81756a && this.f81757b == la1Var.f81757b && Intrinsics.m17075f(this.f81758c, la1Var.f81758c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31295a = nt1.m31295a(this.f81757b, Integer.hashCode(this.f81756a) * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.f81758c;
        if (sSLSocketFactory == null) {
            hashCode = 0;
        } else {
            hashCode = sSLSocketFactory.hashCode();
        }
        return m31295a + hashCode;
    }

    @NotNull
    public final String toString() {
        int i = this.f81756a;
        int i2 = this.f81757b;
        SSLSocketFactory sSLSocketFactory = this.f81758c;
        return "OkHttpConfiguration(connectionTimeoutMs=" + i + ", readTimeoutMs=" + i2 + ", sslSocketFactory=" + sSLSocketFactory + ")";
    }
}
