package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges._Ranges;

/* compiled from: Constraints.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.ConstraintsKt */
/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return Constraints.Companion.m109697createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        int m16917e;
        if (i != Integer.MAX_VALUE) {
            m16917e = _Ranges.m16917e(i + i2, 0);
            return m16917e;
        }
        return i;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m109701constrain4WqzIAM(long j, long j2) {
        int m16908n;
        int m16908n2;
        m16908n = _Ranges.m16908n(IntSize.m109894getWidthimpl(j2), Constraints.m109692getMinWidthimpl(j), Constraints.m109690getMaxWidthimpl(j));
        m16908n2 = _Ranges.m16908n(IntSize.m109893getHeightimpl(j2), Constraints.m109691getMinHeightimpl(j), Constraints.m109689getMaxHeightimpl(j));
        return IntSizeKt.IntSize(m16908n, m16908n2);
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m109702constrainN9IONVI(long j, long j2) {
        int m16908n;
        int m16908n2;
        int m16908n3;
        int m16908n4;
        m16908n = _Ranges.m16908n(Constraints.m109692getMinWidthimpl(j2), Constraints.m109692getMinWidthimpl(j), Constraints.m109690getMaxWidthimpl(j));
        m16908n2 = _Ranges.m16908n(Constraints.m109690getMaxWidthimpl(j2), Constraints.m109692getMinWidthimpl(j), Constraints.m109690getMaxWidthimpl(j));
        m16908n3 = _Ranges.m16908n(Constraints.m109691getMinHeightimpl(j2), Constraints.m109691getMinHeightimpl(j), Constraints.m109689getMaxHeightimpl(j));
        m16908n4 = _Ranges.m16908n(Constraints.m109689getMaxHeightimpl(j2), Constraints.m109691getMinHeightimpl(j), Constraints.m109689getMaxHeightimpl(j));
        return Constraints(m16908n, m16908n2, m16908n3, m16908n4);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m109703constrainHeightK40F9xA(long j, int i) {
        int m16908n;
        m16908n = _Ranges.m16908n(i, Constraints.m109691getMinHeightimpl(j), Constraints.m109689getMaxHeightimpl(j));
        return m16908n;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m109704constrainWidthK40F9xA(long j, int i) {
        int m16908n;
        m16908n = _Ranges.m16908n(i, Constraints.m109692getMinWidthimpl(j), Constraints.m109690getMaxWidthimpl(j));
        return m16908n;
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    public static final boolean m109705isSatisfiedBy4WqzIAM(long j, long j2) {
        boolean z;
        boolean z2;
        int m109692getMinWidthimpl = Constraints.m109692getMinWidthimpl(j);
        int m109690getMaxWidthimpl = Constraints.m109690getMaxWidthimpl(j);
        int m109894getWidthimpl = IntSize.m109894getWidthimpl(j2);
        if (m109692getMinWidthimpl <= m109894getWidthimpl && m109894getWidthimpl <= m109690getMaxWidthimpl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int m109691getMinHeightimpl = Constraints.m109691getMinHeightimpl(j);
            int m109689getMaxHeightimpl = Constraints.m109689getMaxHeightimpl(j);
            int m109893getHeightimpl = IntSize.m109893getHeightimpl(j2);
            if (m109691getMinHeightimpl <= m109893getHeightimpl && m109893getHeightimpl <= m109689getMaxHeightimpl) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m109706offsetNN6EwU(long j, int i, int i2) {
        int m16917e;
        int m16917e2;
        m16917e = _Ranges.m16917e(Constraints.m109692getMinWidthimpl(j) + i, 0);
        int addMaxWithMinimum = addMaxWithMinimum(Constraints.m109690getMaxWidthimpl(j), i);
        m16917e2 = _Ranges.m16917e(Constraints.m109691getMinHeightimpl(j) + i2, 0);
        return Constraints(m16917e, addMaxWithMinimum, m16917e2, addMaxWithMinimum(Constraints.m109689getMaxHeightimpl(j), i2));
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m109707offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m109706offsetNN6EwU(j, i, i2);
    }
}
