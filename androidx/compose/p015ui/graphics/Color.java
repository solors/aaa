package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.graphics.colorspace.ColorSpace;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p015ui.graphics.colorspace.Connector;
import androidx.compose.p015ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ULong;
import p804nd.UnsignedUtils;

/* compiled from: Color.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.Color */
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m107517boximpl(long j) {
        return new Color(j);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m107518component1impl(long j) {
        return m107533getRedimpl(j);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m107519component2impl(long j) {
        return m107532getGreenimpl(j);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m107520component3impl(long j) {
        return m107530getBlueimpl(j);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m107521component4impl(long j) {
        return m107529getAlphaimpl(j);
    }

    @Stable
    @NotNull
    /* renamed from: component5-impl */
    public static final ColorSpace m107522component5impl(long j) {
        return m107531getColorSpaceimpl(j);
    }

    /* renamed from: convert-vNxB06k */
    public static final long m107524convertvNxB06k(long j, @NotNull ColorSpace colorSpace) {
        float[] m107574getComponents8_81llA;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (Intrinsics.m17075f(colorSpace, m107531getColorSpaceimpl(j))) {
            return j;
        }
        Connector m107896connectYBCOT_4$default = ColorSpaceKt.m107896connectYBCOT_4$default(m107531getColorSpaceimpl(j), colorSpace, 0, 2, null);
        m107574getComponents8_81llA = ColorKt.m107574getComponents8_81llA(j);
        m107896connectYBCOT_4$default.transform(m107574getComponents8_81llA);
        return ColorKt.Color(m107574getComponents8_81llA[0], m107574getComponents8_81llA[1], m107574getComponents8_81llA[2], m107574getComponents8_81llA[3], colorSpace);
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m107525copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m107531getColorSpaceimpl(j));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m107526copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m107529getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m107533getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m107532getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m107530getBlueimpl(j);
        }
        return m107525copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: equals-impl */
    public static boolean m107527equalsimpl(long j, Object obj) {
        if (!(obj instanceof Color) || j != ((Color) obj).m107537unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m107528equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlpha-impl */
    public static final float m107529getAlphaimpl(long j) {
        float m14560e;
        float f;
        if (ULong.m14617c(63 & j) == 0) {
            m14560e = (float) UnsignedUtils.m14560e(ULong.m14617c(ULong.m14617c(j >>> 56) & 255));
            f = 255.0f;
        } else {
            m14560e = (float) UnsignedUtils.m14560e(ULong.m14617c(ULong.m14617c(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return m14560e / f;
    }

    /* renamed from: getBlue-impl */
    public static final float m107530getBlueimpl(long j) {
        if (ULong.m14617c(63 & j) == 0) {
            return ((float) UnsignedUtils.m14560e(ULong.m14617c(ULong.m14617c(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m107638toFloatimpl(Float16.m107622constructorimpl((short) ULong.m14617c(ULong.m14617c(j >>> 16) & 65535)));
    }

    @NotNull
    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m107531getColorSpaceimpl(long j) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[(int) ULong.m14617c(j & 63)];
    }

    /* renamed from: getGreen-impl */
    public static final float m107532getGreenimpl(long j) {
        if (ULong.m14617c(63 & j) == 0) {
            return ((float) UnsignedUtils.m14560e(ULong.m14617c(ULong.m14617c(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m107638toFloatimpl(Float16.m107622constructorimpl((short) ULong.m14617c(ULong.m14617c(j >>> 32) & 65535)));
    }

    /* renamed from: getRed-impl */
    public static final float m107533getRedimpl(long j) {
        if (ULong.m14617c(63 & j) == 0) {
            return ((float) UnsignedUtils.m14560e(ULong.m14617c(ULong.m14617c(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m107638toFloatimpl(Float16.m107622constructorimpl((short) ULong.m14617c(ULong.m14617c(j >>> 48) & 65535)));
    }

    /* renamed from: hashCode-impl */
    public static int m107534hashCodeimpl(long j) {
        return ULong.m14615e(j);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m107535toStringimpl(long j) {
        return "Color(" + m107533getRedimpl(j) + ", " + m107532getGreenimpl(j) + ", " + m107530getBlueimpl(j) + ", " + m107529getAlphaimpl(j) + ", " + m107531getColorSpaceimpl(j).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m107527equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m107536getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m107534hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107535toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m107537unboximpl() {
        return this.value;
    }

    /* compiled from: Color.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Color$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m107551hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m107566hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hslToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = (i + (f / 30.0f)) % 12.0f;
            return f3 - ((f2 * Math.min(f3, 1.0f - f3)) * Math.max(-1.0f, Math.min(f4 - 3, Math.min(9 - f4, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m107552hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m107567hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hsvToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = (i + (f / 60.0f)) % 6.0f;
            return f3 - ((f2 * f3) * Math.max(0.0f, Math.min(f4, Math.min(4 - f4, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m107553getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m107554getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m107555getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m107556getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m107557getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m107558getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m107559getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m107560getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m107561getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m107562getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m107563getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m107564getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m107565getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
            if (r0 != false) goto L19;
         */
        /* renamed from: hsl-JlNiLsg */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long m107566hslJlNiLsg(float r6, float r7, float r8, float r9, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.Rgb r10) {
            /*
                r5 = this;
                java.lang.String r0 = "colorSpace"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = 0
                int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 > 0) goto L14
                r1 = 1135869952(0x43b40000, float:360.0)
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 > 0) goto L14
                r1 = r2
                goto L15
            L14:
                r1 = r3
            L15:
                if (r1 == 0) goto L34
                int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                r4 = 1065353216(0x3f800000, float:1.0)
                if (r1 > 0) goto L23
                int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r1 > 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                if (r1 == 0) goto L34
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L30
                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r0 > 0) goto L30
                r0 = r2
                goto L31
            L30:
                r0 = r3
            L31:
                if (r0 == 0) goto L34
                goto L35
            L34:
                r2 = r3
            L35:
                if (r2 == 0) goto L4b
                float r0 = r5.hslToRgbComponent(r3, r6, r7, r8)
                r1 = 8
                float r1 = r5.hslToRgbComponent(r1, r6, r7, r8)
                r2 = 4
                float r6 = r5.hslToRgbComponent(r2, r6, r7, r8)
                long r6 = androidx.compose.p015ui.graphics.ColorKt.Color(r0, r1, r6, r9, r10)
                return r6
            L4b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "HSL ("
                r9.append(r10)
                r9.append(r6)
                java.lang.String r6 = ", "
                r9.append(r6)
                r9.append(r7)
                r9.append(r6)
                r9.append(r8)
                java.lang.String r6 = ") must be in range (0..360, 0..1, 0..1)"
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.Color.Companion.m107566hslJlNiLsg(float, float, float, float, androidx.compose.ui.graphics.colorspace.Rgb):long");
        }

        /* renamed from: hsv-JlNiLsg */
        public final long m107567hsvJlNiLsg(float f, float f2, float f3, float f4, @NotNull Rgb colorSpace) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            boolean z4 = false;
            if (0.0f <= f && f <= 360.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (0.0f <= f2 && f2 <= 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (0.0f <= f3 && f3 <= 1.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                return ColorKt.Color(hsvToRgbComponent(5, f, f2, f3), hsvToRgbComponent(3, f, f2, f3), hsvToRgbComponent(1, f, f2, f3), f4, colorSpace);
            }
            throw new IllegalArgumentException(("HSV (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m107538getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m107539getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m107540getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m107541getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m107542getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m107543getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m107544getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m107545getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m107546getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m107547getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m107548getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m107549getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m107550getYellow0d7_KjU$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl */
    public static long m107523constructorimpl(long j) {
        return j;
    }
}
