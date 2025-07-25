package kotlin.time;

import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DurationUnitJvm.kt */
@Metadata
/* renamed from: kotlin.time.d */
/* loaded from: classes7.dex */
class C37701d {
    /* renamed from: a */
    public static final double m16450a(double d, @NotNull DurationUnitJvm sourceUnit, @NotNull DurationUnitJvm targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.m25156c().convert(1L, sourceUnit.m25156c());
        if (convert > 0) {
            return d * convert;
        }
        return d / sourceUnit.m25156c().convert(1L, targetUnit.m25156c());
    }

    /* renamed from: b */
    public static final long m16449b(long j, @NotNull DurationUnitJvm sourceUnit, @NotNull DurationUnitJvm targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.m25156c().convert(j, sourceUnit.m25156c());
    }

    /* renamed from: c */
    public static final long m16448c(long j, @NotNull DurationUnitJvm sourceUnit, @NotNull DurationUnitJvm targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.m25156c().convert(j, sourceUnit.m25156c());
    }
}
