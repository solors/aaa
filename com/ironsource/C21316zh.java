package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.zh */
/* loaded from: classes6.dex */
public final class C21316zh extends C19610b1 {
    public C21316zh() {
        this("", null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21316zh(@NotNull String adUnitId, @Nullable C21046ts c21046ts) {
        super(IronSource.AD_UNIT.INTERSTITIAL, adUnitId, null, c21046ts, 4, null);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }
}
