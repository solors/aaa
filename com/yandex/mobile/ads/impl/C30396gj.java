package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gj */
/* loaded from: classes8.dex */
public class C30396gj {
    @NotNull

    /* renamed from: a */
    private final qu1 f79673a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C30396gj(@NotNull qu1 sizeInfo) {
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.f79673a = sizeInfo;
    }

    @NotNull
    /* renamed from: a */
    public final qu1 m33827a() {
        return this.f79673a;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof C30396gj) && Intrinsics.m17075f(((C30396gj) obj).f79673a, this.f79673a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79673a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f79673a.toString();
    }
}
