package kotlin.time;

import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.time.f */
/* loaded from: classes7.dex */
public final class longSaturatedMath {
    /* renamed from: a */
    private static final long m16445a(long j) {
        if (j < 0) {
            return Duration.f99494c.m16473b();
        }
        return Duration.f99494c.m16474a();
    }

    /* renamed from: b */
    public static final long m16444b(long j, long j2, @NotNull DurationUnitJvm unit) {
        boolean z;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Duration.m16501L(m16445a(j2));
        }
        return m16443c(j, j2, unit);
    }

    /* renamed from: c */
    private static final long m16443c(long j, long j2, DurationUnitJvm durationUnitJvm) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnitJvm durationUnitJvm2 = DurationUnitJvm.f90129f;
            if (durationUnitJvm.compareTo(durationUnitJvm2) < 0) {
                long m16449b = C37701d.m16449b(1L, durationUnitJvm2, durationUnitJvm);
                long j4 = (j % m16449b) - (j2 % m16449b);
                Duration.C37699a c37699a = Duration.f99494c;
                return Duration.m16507F(C37700c.m16451t((j / m16449b) - (j2 / m16449b), durationUnitJvm2), C37700c.m16451t(j4, durationUnitJvm));
            }
            return Duration.m16501L(m16445a(j3));
        }
        return C37700c.m16451t(j3, durationUnitJvm);
    }

    /* renamed from: d */
    public static final long m16442d(long j, long j2, @NotNull DurationUnitJvm unit) {
        boolean z;
        Intrinsics.checkNotNullParameter(unit, "unit");
        boolean z2 = true;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == j2) {
                return Duration.f99494c.m16472c();
            }
            return Duration.m16501L(m16445a(j2));
        }
        if ((1 | (j - 1)) != Long.MAX_VALUE) {
            z2 = false;
        }
        if (z2) {
            return m16445a(j);
        }
        return m16443c(j, j2, unit);
    }
}
