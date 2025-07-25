package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.vl */
/* loaded from: classes6.dex */
public final class C21141vl extends C19610b1 {
    public C21141vl() {
        this("", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21141vl(@NotNull String adUnitId, @Nullable Placement placement) {
        super(IronSource.AD_UNIT.NATIVE_AD, adUnitId, placement, null, 8, null);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public /* synthetic */ C21141vl(String str, Placement placement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : placement);
    }
}
