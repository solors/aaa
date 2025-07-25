package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ch2 implements Reward {
    @NotNull

    /* renamed from: a */
    private final ln1 f77629a;

    public ch2(@NotNull ln1 rewardData) {
        Intrinsics.checkNotNullParameter(rewardData, "rewardData");
        this.f77629a = rewardData;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ch2) && Intrinsics.m17075f(((ch2) obj).f77629a, this.f77629a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f77629a.getAmount();
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    @NotNull
    public final String getType() {
        return this.f77629a.getType();
    }

    public final int hashCode() {
        return this.f77629a.hashCode();
    }
}
