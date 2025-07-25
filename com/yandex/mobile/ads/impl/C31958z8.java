package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z8 */
/* loaded from: classes8.dex */
public final class C31958z8 {
    @NotNull

    /* renamed from: a */
    private final C30538i9 f88762a;
    @Nullable

    /* renamed from: b */
    private final String f88763b;

    public C31958z8(@NotNull C30538i9 adTagUri, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adTagUri, "adTagUri");
        this.f88762a = adTagUri;
        this.f88763b = str;
    }

    @NotNull
    /* renamed from: a */
    public final C30538i9 m26319a() {
        return this.f88762a;
    }

    @Nullable
    /* renamed from: b */
    public final String m26318b() {
        return this.f88763b;
    }
}
