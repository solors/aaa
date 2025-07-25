package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g42;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class o41 {
    @NotNull

    /* renamed from: a */
    private final g42.EnumC30362a f83297a;
    @Nullable

    /* renamed from: b */
    private final String f83298b;

    public o41(@NotNull g42.EnumC30362a validationStatus, @Nullable String str) {
        Intrinsics.checkNotNullParameter(validationStatus, "validationStatus");
        this.f83297a = validationStatus;
        this.f83298b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m31180a() {
        return this.f83298b;
    }

    @NotNull
    /* renamed from: b */
    public final g42.EnumC30362a m31179b() {
        return this.f83297a;
    }
}
