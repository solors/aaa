package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.lp */
/* loaded from: classes6.dex */
public final class C20285lp extends C19610b1 {
    public C20285lp() {
        this("");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20285lp(@NotNull String adUnitId) {
        super(IronSource.AD_UNIT.REWARDED_VIDEO, adUnitId, null, null, 12, null);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }
}
