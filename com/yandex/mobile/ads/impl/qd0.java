package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qd0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31607ur f84299a;
    @NotNull

    /* renamed from: b */
    private final as1 f84300b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd0(InterfaceC31607ur interfaceC31607ur) {
        this(interfaceC31607ur, as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31607ur m30405a() {
        this.f84300b.getClass();
        as1.m35789c();
        return this.f84299a;
    }

    public qd0(@NotNull InterfaceC31607ur defaultHostAccessChecker, @NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(defaultHostAccessChecker, "defaultHostAccessChecker");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f84299a = defaultHostAccessChecker;
        this.f84300b = sdkSettings;
    }
}
