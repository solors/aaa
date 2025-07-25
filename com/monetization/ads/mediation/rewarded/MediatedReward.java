package com.monetization.ads.mediation.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedReward {

    /* renamed from: a */
    private final int f66546a;
    @NotNull

    /* renamed from: b */
    private final String f66547b;

    public MediatedReward(int i, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f66546a = i;
        this.f66547b = type;
    }

    public final int getAmount() {
        return this.f66546a;
    }

    @NotNull
    public final String getType() {
        return this.f66547b;
    }
}
