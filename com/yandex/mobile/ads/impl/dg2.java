package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class dg2 implements InstreamAdBreak {
    @NotNull

    /* renamed from: a */
    private final C31920yr f78128a;
    @NotNull

    /* renamed from: b */
    private final fg2 f78129b;

    public /* synthetic */ dg2(C31920yr c31920yr) {
        this(c31920yr, new fg2());
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof dg2) && Intrinsics.m17075f(((dg2) obj).f78128a, this.f78128a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NotNull
    public final InstreamAdBreakPosition getAdBreakPosition() {
        InstreamAdBreakPosition.Type type;
        fg2 fg2Var = this.f78129b;
        C32011zr corePosition = this.f78128a.m26633b();
        fg2Var.getClass();
        Intrinsics.checkNotNullParameter(corePosition, "corePosition");
        int ordinal = corePosition.m26012a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    type = InstreamAdBreakPosition.Type.POSITION;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                type = InstreamAdBreakPosition.Type.MILLISECONDS;
            }
        } else {
            type = InstreamAdBreakPosition.Type.PERCENTS;
        }
        return new InstreamAdBreakPosition(type, corePosition.m26011b());
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NotNull
    public final String getType() {
        return this.f78128a.m26630e();
    }

    public final int hashCode() {
        return this.f78128a.hashCode();
    }

    public dg2(@NotNull C31920yr adBreak, @NotNull fg2 adBreakPositionAdapter) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPositionAdapter, "adBreakPositionAdapter");
        this.f78128a = adBreak;
        this.f78129b = adBreakPositionAdapter;
    }
}
