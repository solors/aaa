package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class od0 implements Callable<nd0> {
    @NotNull

    /* renamed from: a */
    private final String f83455a;
    @NotNull

    /* renamed from: b */
    private final qd0 f83456b;

    public od0(@NotNull String checkHost, @NotNull InterfaceC31607ur defaultHostAccessChecker, @NotNull qd0 hostAccessCheckerProvider) {
        Intrinsics.checkNotNullParameter(checkHost, "checkHost");
        Intrinsics.checkNotNullParameter(defaultHostAccessChecker, "defaultHostAccessChecker");
        Intrinsics.checkNotNullParameter(hostAccessCheckerProvider, "hostAccessCheckerProvider");
        this.f83455a = checkHost;
        this.f83456b = hostAccessCheckerProvider;
    }

    @Override // java.util.concurrent.Callable
    @NotNull
    /* renamed from: a */
    public final nd0 call() {
        boolean mo28686a = this.f83456b.m30405a().mo28686a(this.f83455a);
        um0.m28728a(new Object[0]);
        return new nd0(mo28686a);
    }
}
