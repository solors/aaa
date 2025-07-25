package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ko1 {
    @NotNull

    /* renamed from: a */
    private final C31026oa f81508a;
    @NotNull

    /* renamed from: b */
    private final Proxy f81509b;
    @NotNull

    /* renamed from: c */
    private final InetSocketAddress f81510c;

    public ko1(@NotNull C31026oa address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f81508a = address;
        this.f81509b = proxy;
        this.f81510c = socketAddress;
    }

    @NotNull
    /* renamed from: a */
    public final C31026oa m32474a() {
        return this.f81508a;
    }

    @NotNull
    /* renamed from: b */
    public final Proxy m32473b() {
        return this.f81509b;
    }

    /* renamed from: c */
    public final boolean m32472c() {
        if (this.f81508a.m31123j() != null && this.f81509b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: d */
    public final InetSocketAddress m32471d() {
        return this.f81510c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof ko1) {
            ko1 ko1Var = (ko1) obj;
            if (Intrinsics.m17075f(ko1Var.f81508a, this.f81508a) && Intrinsics.m17075f(ko1Var.f81509b, this.f81509b) && Intrinsics.m17075f(ko1Var.f81510c, this.f81510c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f81509b.hashCode();
        return this.f81510c.hashCode() + ((hashCode + ((this.f81508a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        InetSocketAddress inetSocketAddress = this.f81510c;
        return "Route{" + inetSocketAddress + "}";
    }
}
