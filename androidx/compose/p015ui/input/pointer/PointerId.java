package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerId */
/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerId m108877boximpl(long j) {
        return new PointerId(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108879equalsimpl(long j, Object obj) {
        if (!(obj instanceof PointerId) || j != ((PointerId) obj).m108883unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108880equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108881hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108882toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m108879equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m108881hashCodeimpl(this.value);
    }

    public String toString() {
        return m108882toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m108883unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m108878constructorimpl(long j) {
        return j;
    }
}
