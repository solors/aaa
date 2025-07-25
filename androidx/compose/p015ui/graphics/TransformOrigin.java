package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransformOrigin.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.TransformOrigin */
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* compiled from: TransformOrigin.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.TransformOrigin$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ  reason: not valid java name */
        public final long m107869getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }
    }

    private /* synthetic */ TransformOrigin(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m107856boximpl(long j) {
        return new TransformOrigin(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m107857component1impl(long j) {
        return m107864getPivotFractionXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m107858component2impl(long j) {
        return m107865getPivotFractionYimpl(j);
    }

    /* renamed from: copy-zey9I6w  reason: not valid java name */
    public static final long m107860copyzey9I6w(long j, float f, float f2) {
        return TransformOriginKt.TransformOrigin(f, f2);
    }

    /* renamed from: copy-zey9I6w$default  reason: not valid java name */
    public static /* synthetic */ long m107861copyzey9I6w$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m107864getPivotFractionXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m107865getPivotFractionYimpl(j);
        }
        return m107860copyzey9I6w(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107862equalsimpl(long j, Object obj) {
        if (!(obj instanceof TransformOrigin) || j != ((TransformOrigin) obj).m107868unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107863equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getPivotFractionX-impl  reason: not valid java name */
    public static final float m107864getPivotFractionXimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl  reason: not valid java name */
    public static final float m107865getPivotFractionYimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107866hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107867toStringimpl(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m107862equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m107866hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m107867toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m107868unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m107859constructorimpl(long j) {
        return j;
    }
}
