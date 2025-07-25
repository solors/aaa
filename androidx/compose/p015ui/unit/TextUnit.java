package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextUnit.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.TextUnit */
/* loaded from: classes.dex */
public final class TextUnit {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m109940boximpl(companion.m109949getUnspecifiedUIouoOA()), TextUnitType.m109940boximpl(companion.m109948getSpUIouoOA()), TextUnitType.m109940boximpl(companion.m109947getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnit m109905boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o  reason: not valid java name */
    public static final int m109906compareToR2X_6o(long j, long j2) {
        TextUnitKt.m109929checkArithmeticNB67dxo(j, j2);
        return Float.compare(m109915getValueimpl(j), m109915getValueimpl(j2));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m109909divkPz2Gy4(long j, float f) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), m109915getValueimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109911equalsimpl(long j, Object obj) {
        if (!(obj instanceof TextUnit) || j != ((TextUnit) obj).m109924unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109912equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getRawType-impl  reason: not valid java name */
    public static final long m109913getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA  reason: not valid java name */
    public static final long m109914getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m109913getRawTypeimpl(j) >>> 32)].m109946unboximpl();
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m109915getValueimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109916hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEm-impl  reason: not valid java name */
    public static final boolean m109917isEmimpl(long j) {
        if (m109913getRawTypeimpl(j) == 8589934592L) {
            return true;
        }
        return false;
    }

    /* renamed from: isSp-impl  reason: not valid java name */
    public static final boolean m109918isSpimpl(long j) {
        if (m109913getRawTypeimpl(j) == 4294967296L) {
            return true;
        }
        return false;
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m109920timeskPz2Gy4(long j, float f) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), m109915getValueimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109922toStringimpl(long j) {
        long m109914getTypeUIouoOA = m109914getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m109943equalsimpl0(m109914getTypeUIouoOA, companion.m109949getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m109943equalsimpl0(m109914getTypeUIouoOA, companion.m109948getSpUIouoOA())) {
            return m109915getValueimpl(j) + ".sp";
        } else if (TextUnitType.m109943equalsimpl0(m109914getTypeUIouoOA, companion.m109947getEmUIouoOA())) {
            return m109915getValueimpl(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    /* renamed from: unaryMinus-XSAIIZE  reason: not valid java name */
    public static final long m109923unaryMinusXSAIIZE(long j) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), -m109915getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m109911equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109916hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m109922toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109924unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m109908divkPz2Gy4(long j, double d) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), (float) (m109915getValueimpl(j) / d));
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m109919timeskPz2Gy4(long j, double d) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), (float) (m109915getValueimpl(j) * d));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m109910divkPz2Gy4(long j, int i) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), m109915getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m109921timeskPz2Gy4(long j, int i) {
        TextUnitKt.m109928checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m109913getRawTypeimpl(j), m109915getValueimpl(j) * i);
    }

    /* compiled from: TextUnit.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.TextUnit$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE  reason: not valid java name */
        public final long m109926getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations  reason: not valid java name */
        public static /* synthetic */ void m109925getUnspecifiedXSAIIZE$annotations() {
        }
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109907constructorimpl(long j) {
        return j;
    }
}
