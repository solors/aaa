package com.ironsource.mediationsdk.model;

import com.ironsource.C19721co;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class Placement extends BasePlacement {
    @NotNull

    /* renamed from: e */
    private String f51715e;

    /* renamed from: f */
    private int f51716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i, @NotNull String placementName, boolean z, @NotNull String rewardName, int i2, @Nullable C19721co c19721co) {
        super(i, placementName, z, c19721co);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f51716f = i2;
        this.f51715e = rewardName;
    }

    public final int getRewardAmount() {
        return this.f51716f;
    }

    @NotNull
    public final String getRewardName() {
        return this.f51715e;
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.f51715e + " , amount: " + this.f51716f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(@NotNull BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.isDefault(), placement.getPlacementAvailabilitySettings());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f51715e = "";
    }
}
