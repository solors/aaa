package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dp.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes.dex */
public final class C1059Dp implements Comparable<C1059Dp> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m109734constructorimpl(0.0f);
    private static final float Infinity = m109734constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m109734constructorimpl(Float.NaN);
    private final float value;

    private /* synthetic */ C1059Dp(float f) {
        this.value = f;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C1059Dp m109732boximpl(float f) {
        return new C1059Dp(f);
    }

    @Stable
    /* renamed from: div-0680j_4  reason: not valid java name */
    public static final float m109735div0680j_4(float f, float f2) {
        return f / f2;
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m109736divu2uoSUM(float f, float f2) {
        return m109734constructorimpl(f / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109738equalsimpl(float f, Object obj) {
        if (!(obj instanceof C1059Dp)) {
            return false;
        }
        if (!Intrinsics.m17075f(Float.valueOf(f), Float.valueOf(((C1059Dp) obj).m109748unboximpl()))) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109739equalsimpl0(float f, float f2) {
        return Intrinsics.m17075f(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109740hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    @Stable
    /* renamed from: minus-5rwHm24  reason: not valid java name */
    public static final float m109741minus5rwHm24(float f, float f2) {
        return m109734constructorimpl(f - f2);
    }

    @Stable
    /* renamed from: plus-5rwHm24  reason: not valid java name */
    public static final float m109742plus5rwHm24(float f, float f2) {
        return m109734constructorimpl(f + f2);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m109743timesu2uoSUM(float f, float f2) {
        return m109734constructorimpl(f * f2);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109745toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM  reason: not valid java name */
    public static final float m109746unaryMinusD9Ej5fM(float f) {
        return m109734constructorimpl(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C1059Dp c1059Dp) {
        return m109747compareTo0680j_4(c1059Dp.m109748unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public int m109747compareTo0680j_4(float f) {
        return m109733compareTo0680j_4(this.value, f);
    }

    public boolean equals(Object obj) {
        return m109738equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m109740hashCodeimpl(this.value);
    }

    @Stable
    @NotNull
    public String toString() {
        return m109745toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m109748unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public static int m109733compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m109737divu2uoSUM(float f, int i) {
        return m109734constructorimpl(f / i);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m109744timesu2uoSUM(float f, int i) {
        return m109734constructorimpl(f * i);
    }

    /* compiled from: Dp.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.Dp$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM  reason: not valid java name */
        public final float m109752getHairlineD9Ej5fM() {
            return C1059Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM  reason: not valid java name */
        public final float m109753getInfinityD9Ej5fM() {
            return C1059Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM  reason: not valid java name */
        public final float m109754getUnspecifiedD9Ej5fM() {
            return C1059Dp.Unspecified;
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m109749getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m109750getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m109751getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m109734constructorimpl(float f) {
        return f;
    }
}
