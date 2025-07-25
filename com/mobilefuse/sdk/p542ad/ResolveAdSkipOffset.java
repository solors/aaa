package com.mobilefuse.sdk.p542ad;

import com.mobilefuse.sdk.math.MathMf;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.ad.AdSkipOffsetResolver */
/* loaded from: classes7.dex */
public final class ResolveAdSkipOffset {
    public static final float UNSKIPPABLE = -1.0f;

    public static final float resolveAdSkipOffset(@Nullable Float f, float f2, float f3) {
        if (f != null) {
            f2 = MathMf.minPreferPositive(f.floatValue(), f2);
        }
        return Math.max(f2, f3);
    }

    public static /* synthetic */ float resolveAdSkipOffset$default(Float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = -1.0f;
        }
        if ((i & 4) != 0) {
            f3 = -1.0f;
        }
        return resolveAdSkipOffset(f, f2, f3);
    }
}
