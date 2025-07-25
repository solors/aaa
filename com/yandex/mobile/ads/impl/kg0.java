package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kg0 implements InterfaceC30017bg<bh0> {
    @NotNull

    /* renamed from: a */
    private final dy1 f81416a;

    public /* synthetic */ kg0() {
        this(new dy1());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30017bg
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final boolean mo32562a(@NotNull bh0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String value2 = value.m35470f();
        if (value2 != null) {
            this.f81416a.getClass();
            Intrinsics.checkNotNullParameter(value2, "value");
            if (value2.length() > 0 && !Intrinsics.m17075f("null", value2)) {
                return true;
            }
        }
        return false;
    }

    public kg0(@NotNull dy1 stringAssetValueValidator) {
        Intrinsics.checkNotNullParameter(stringAssetValueValidator, "stringAssetValueValidator");
        this.f81416a = stringAssetValueValidator;
    }
}
