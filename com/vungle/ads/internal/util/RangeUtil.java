package com.vungle.ads.internal.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.util.q */
/* loaded from: classes7.dex */
public final class RangeUtil {
    @NotNull
    public static final RangeUtil INSTANCE = new RangeUtil();

    private RangeUtil() {
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return rangeUtil.isInRange(i, i2, i3);
    }

    public final boolean isInRange(float f, float f2, float f3) {
        return f2 <= f && f <= f3;
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, float f, float f2, float f3, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = Float.MAX_VALUE;
        }
        return rangeUtil.isInRange(f, f2, f3);
    }

    public final boolean isInRange(int i, int i2, int i3) {
        return i2 <= i && i <= i3;
    }
}
