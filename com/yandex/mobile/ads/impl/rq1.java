package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC30672ju;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rq1 implements InterfaceC30672ju.InterfaceC30673a {
    @NotNull

    /* renamed from: a */
    private final String f84860a;
    @Nullable

    /* renamed from: b */
    private final SSLSocketFactory f84861b;

    /* renamed from: c */
    private final boolean f84862c;

    public rq1(@NotNull String userAgent, @Nullable SSLSocketFactory sSLSocketFactory, boolean z) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f84860a = userAgent;
        this.f84861b = sSLSocketFactory;
        this.f84862c = z;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju.InterfaceC30673a
    @NotNull
    /* renamed from: a */
    public final InterfaceC30672ju mo28285a() {
        if (this.f84862c) {
            int i = ka1.f81354c;
            return new na1(ka1.m32611a(8000, 8000, this.f84861b), this.f84860a, new cf0());
        }
        return new oq1(this.f84860a, new cf0(), this.f84861b);
    }
}
