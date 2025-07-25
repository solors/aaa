package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharJVM;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: Float16.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Float16 */
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m107622constructorimpl((short) 5120);
    private static final short LowestValue = m107622constructorimpl((short) -1025);
    private static final short MaxValue = m107622constructorimpl((short) 31743);
    private static final short MinNormal = m107622constructorimpl((short) 1024);
    private static final short MinValue = m107622constructorimpl((short) 1);
    private static final short NaN = m107622constructorimpl((short) 32256);
    private static final short NegativeInfinity = m107622constructorimpl((short) -1024);
    private static final short NegativeZero = m107622constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m107622constructorimpl((short) 31744);
    private static final short PositiveZero = m107622constructorimpl((short) 0);
    private static final short One = m107621constructorimpl(1.0f);
    private static final short NegativeOne = m107621constructorimpl(-1.0f);

    /* compiled from: Float16.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Float16$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            int i6 = 31;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i2 = 512;
                    i7 = i2;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            } else {
                int i8 = (i4 - 127) + 15;
                if (i8 >= 31) {
                    i6 = 49;
                } else if (i8 <= 0) {
                    if (i8 >= -10) {
                        int i9 = (i5 | 8388608) >> (1 - i8);
                        if ((i9 & 4096) != 0) {
                            i9 += 8192;
                        }
                        i2 = i9 >> 13;
                        i6 = 0;
                        i7 = i2;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i7 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    } else {
                        i6 = i8;
                    }
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            }
            return (short) i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s) {
            if ((s & 32768) != 0) {
                return 32768 - (s & 65535);
            }
            return s & 65535;
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m107649getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m107650getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m107651getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m107652getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m107653getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m107654getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m107655getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m107656getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m107657getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m107658getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        C37606l c37606l = C37606l.f99324a;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m107616absoluteValueslo4al4(short s) {
        return m107622constructorimpl((short) (s & Short.MAX_VALUE));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m107617boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m107618ceilslo4al4(short s) {
        int i = s & 65535;
        int i2 = i & FP16_COMBINED;
        int i3 = 1;
        if (i2 < 15360) {
            int i4 = 32768 & i;
            int i5 = ~(i >> 15);
            if (i2 == 0) {
                i3 = 0;
            }
            i = ((-(i5 & i3)) & 15360) | i4;
        } else if (i2 < 25600) {
            int i6 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (i6 & ((i >> 15) - 1))) & (~i6);
        }
        return m107622constructorimpl((short) i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m107622constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107623equalsimpl(short s, Object obj) {
        if (!(obj instanceof Float16) || s != ((Float16) obj).m107648unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107624equalsimpl0(short s, short s2) {
        if (s == s2) {
            return true;
        }
        return false;
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m107625floorslo4al4(short s) {
        int i = 65535;
        int i2 = s & 65535;
        int i3 = i2 & FP16_COMBINED;
        if (i3 < 15360) {
            int i4 = i2 & 32768;
            if (i2 <= 32768) {
                i = 0;
            }
            i2 = (i & 15360) | i4;
        } else if (i3 < 25600) {
            int i5 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((-(i2 >> 15)) & i5)) & (~i5);
        }
        return m107622constructorimpl((short) i2);
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m107626getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m107627getSignslo4al4(short s) {
        if (m107632isNaNimpl(s)) {
            return NaN;
        }
        if (m107619compareTo41bOqos(s, NegativeZero) < 0) {
            return NegativeOne;
        }
        if (m107619compareTo41bOqos(s, PositiveZero) > 0) {
            return One;
        }
        return s;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m107628getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107629hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m107630isFiniteimpl(short s) {
        if ((s & Short.MAX_VALUE) != FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m107631isInfiniteimpl(short s) {
        if ((s & Short.MAX_VALUE) == FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m107632isNaNimpl(short s) {
        if ((s & Short.MAX_VALUE) > FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m107633isNormalizedimpl(short s) {
        int i = s & FP16_EXPONENT_MAX;
        if (i != 0 && i != FP16_EXPONENT_MAX) {
            return true;
        }
        return false;
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m107634roundslo4al4(short s) {
        int i = 65535;
        int i2 = s & 65535;
        int i3 = i2 & FP16_COMBINED;
        if (i3 < 15360) {
            int i4 = i2 & 32768;
            if (i3 < 14336) {
                i = 0;
            }
            i2 = i4 | (i & 15360);
        } else if (i3 < 25600) {
            int i5 = 25 - (i3 >> 10);
            i2 = (i2 + (1 << (i5 - 1))) & (~((1 << i5) - 1));
        }
        return m107622constructorimpl((short) i2);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m107635toBitsimpl(short s) {
        if (m107632isNaNimpl(s)) {
            return NaN;
        }
        return s & 65535;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m107636toByteimpl(short s) {
        return (byte) m107638toFloatimpl(s);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m107637toDoubleimpl(short s) {
        return m107638toFloatimpl(s);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m107638toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = s & 65535;
        int i5 = 32768 & i4;
        int i6 = (i4 >>> 10) & 31;
        int i7 = i4 & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                C37606l c37606l = C37606l.f99324a;
                float intBitsToFloat = Float.intBitsToFloat(i7 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i = (i6 - 15) + 127;
            }
            int i9 = i;
            i2 = i8;
            i3 = i9;
        }
        int i10 = i3 << 23;
        C37606l c37606l2 = C37606l.f99324a;
        return Float.intBitsToFloat(i10 | (i5 << 16) | i2);
    }

    @NotNull
    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m107639toHexStringimpl(short s) {
        int checkRadix;
        int checkRadix2;
        StringBuilder sb2 = new StringBuilder();
        int i = s & 65535;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = i & 1023;
        if (i3 == 31) {
            if (i4 == 0) {
                if (i2 != 0) {
                    sb2.append('-');
                }
                sb2.append("Infinity");
            } else {
                sb2.append("NaN");
            }
        } else {
            if (i2 == 1) {
                sb2.append('-');
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    sb2.append("0x0.0p0");
                } else {
                    sb2.append("0x0.");
                    checkRadix2 = CharJVM.checkRadix(16);
                    String num = Integer.toString(i4, checkRadix2);
                    Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                    sb2.append(new Regex("0{2,}$").m16764g(num, ""));
                    sb2.append("p-14");
                }
            } else {
                sb2.append("0x1.");
                checkRadix = CharJVM.checkRadix(16);
                String num2 = Integer.toString(i4, checkRadix);
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").m16764g(num2, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i3 - 15));
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "o.toString()");
        return sb3;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m107640toIntimpl(short s) {
        return (int) m107638toFloatimpl(s);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m107641toLongimpl(short s) {
        return m107638toFloatimpl(s);
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m107642toRawBitsimpl(short s) {
        return s & 65535;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m107643toShortimpl(short s) {
        return (short) m107638toFloatimpl(s);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107644toStringimpl(short s) {
        return String.valueOf(m107638toFloatimpl(s));
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m107645truncslo4al4(short s) {
        int i;
        int i2 = s & 65535;
        int i3 = i2 & FP16_COMBINED;
        if (i3 < 15360) {
            i = 32768;
        } else {
            if (i3 < 25600) {
                i = ~((1 << (25 - (i3 >> 10))) - 1);
            }
            return m107622constructorimpl((short) i2);
        }
        i2 &= i;
        return m107622constructorimpl((short) i2);
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m107646withSignqCeQghg(short s, short s2) {
        return m107622constructorimpl((short) ((s & Short.MAX_VALUE) | (s2 & 32768)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m107647compareTo41bOqos(float16.m107648unboximpl());
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m107647compareTo41bOqos(short s) {
        return m107619compareTo41bOqos(this.halfValue, s);
    }

    public boolean equals(Object obj) {
        return m107623equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m107629hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m107644toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m107648unboximpl() {
        return this.halfValue;
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m107619compareTo41bOqos(short s, short s2) {
        if (m107632isNaNimpl(s)) {
            return !m107632isNaNimpl(s2) ? 1 : 0;
        }
        if (m107632isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = Companion;
        return Intrinsics.m17071j(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m107621constructorimpl(float f) {
        return m107622constructorimpl(Companion.floatToHalf(f));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m107620constructorimpl(double d) {
        return m107621constructorimpl((float) d);
    }
}
