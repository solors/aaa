package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class ai0 {
    @NotNull

    /* renamed from: a */
    private static final zh0 f76799a = new zh0(fl1.EnumC30324b.f79131S, fl1.EnumC30324b.f79130R, fl1.EnumC30324b.f79132T, fl1.EnumC30324b.f79133U);
    @NotNull

    /* renamed from: b */
    private static final zh0 f76800b = new zh0(fl1.EnumC30324b.f79161y, fl1.EnumC30324b.f79160x, fl1.EnumC30324b.f79162z, fl1.EnumC30324b.f79113A);

    @NotNull
    /* renamed from: a */
    public static zh0 m35859a(@NotNull EnumC30451h9 adStructureType) {
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        int ordinal = adStructureType.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return f76800b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return f76799a;
    }
}
