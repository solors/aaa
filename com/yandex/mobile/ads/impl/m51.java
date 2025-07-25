package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class m51 {
    @NotNull

    /* renamed from: a */
    private final l51 f82053a;
    @NotNull

    /* renamed from: b */
    private final l51 f82054b;

    public /* synthetic */ m51() {
        this(new y11(), new fi1());
    }

    @NotNull
    /* renamed from: a */
    public final l51 m32091a(@NotNull xm1 responseNativeType) {
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        int ordinal = responseNativeType.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                return this.f82054b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.f82053a;
    }

    public m51(@NotNull l51 nativeAdCreator, @NotNull l51 promoAdCreator) {
        Intrinsics.checkNotNullParameter(nativeAdCreator, "nativeAdCreator");
        Intrinsics.checkNotNullParameter(promoAdCreator, "promoAdCreator");
        this.f82053a = nativeAdCreator;
        this.f82054b = promoAdCreator;
    }
}
