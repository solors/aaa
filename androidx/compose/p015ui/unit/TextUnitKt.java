package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextUnit.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.TextUnitKt */
/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    @ExperimentalUnitApi
    /* renamed from: TextUnit-anM5pPY  reason: not valid java name */
    public static final long m109927TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: checkArithmetic--R2X_6o  reason: not valid java name */
    public static final void m109928checkArithmeticR2X_6o(long j) {
        if (!m109933isUnspecifiedR2X_6o(j)) {
            return;
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    /* renamed from: checkArithmetic-NB67dxo  reason: not valid java name */
    public static final void m109929checkArithmeticNB67dxo(long j, long j2) {
        boolean z;
        if (!m109933isUnspecifiedR2X_6o(j) && !m109933isUnspecifiedR2X_6o(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextUnitType.m109943equalsimpl0(TextUnit.m109914getTypeUIouoOA(j), TextUnit.m109914getTypeUIouoOA(j2))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m109945toStringimpl(TextUnit.m109914getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m109945toStringimpl(TextUnit.m109914getTypeUIouoOA(j2)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    /* renamed from: checkArithmetic-vU-0ePk  reason: not valid java name */
    public static final void m109930checkArithmeticvU0ePk(long j, long j2, long j3) {
        boolean z;
        boolean z2 = true;
        if (!m109933isUnspecifiedR2X_6o(j) && !m109933isUnspecifiedR2X_6o(j2) && !m109933isUnspecifiedR2X_6o(j3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!TextUnitType.m109943equalsimpl0(TextUnit.m109914getTypeUIouoOA(j), TextUnit.m109914getTypeUIouoOA(j2)) || !TextUnitType.m109943equalsimpl0(TextUnit.m109914getTypeUIouoOA(j2), TextUnit.m109914getTypeUIouoOA(j3))) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m109945toStringimpl(TextUnit.m109914getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m109945toStringimpl(TextUnit.m109914getTypeUIouoOA(j2)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* renamed from: isSpecified--R2X_6o  reason: not valid java name */
    public static final boolean m109931isSpecifiedR2X_6o(long j) {
        return !m109933isUnspecifiedR2X_6o(j);
    }

    /* renamed from: isUnspecified--R2X_6o  reason: not valid java name */
    public static final boolean m109933isUnspecifiedR2X_6o(long j) {
        if (TextUnit.m109913getRawTypeimpl(j) == 0) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-C3pnCVY  reason: not valid java name */
    public static final long m109935lerpC3pnCVY(long j, long j2, float f) {
        m109929checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m109913getRawTypeimpl(j), MathHelpers.lerp(TextUnit.m109915getValueimpl(j), TextUnit.m109915getValueimpl(j2), f));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m109907constructorimpl(j | (Float.floatToIntBits(f) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ  reason: not valid java name */
    public static final long m109936takeOrElseeAf_CNQ(long j, @NotNull Functions<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!m109933isUnspecifiedR2X_6o(j))) {
            return block.invoke().m109924unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m109938timesmpE4wyQ(float f, long j) {
        m109928checkArithmeticR2X_6o(j);
        return pack(TextUnit.m109913getRawTypeimpl(j), f * TextUnit.m109915getValueimpl(j));
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m109937timesmpE4wyQ(double d, long j) {
        m109928checkArithmeticR2X_6o(j);
        return pack(TextUnit.m109913getRawTypeimpl(j), ((float) d) * TextUnit.m109915getValueimpl(j));
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m109939timesmpE4wyQ(int i, long j) {
        m109928checkArithmeticR2X_6o(j);
        return pack(TextUnit.m109913getRawTypeimpl(j), i * TextUnit.m109915getValueimpl(j));
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m109932isSpecifiedR2X_6o$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m109934isUnspecifiedR2X_6o$annotations(long j) {
    }
}
