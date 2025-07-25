package com.ironsource.mediationsdk.model;

import com.ironsource.C19721co;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i, @NotNull String placementName, boolean z, @Nullable C19721co c19721co) {
        super(i, placementName, z, c19721co);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
