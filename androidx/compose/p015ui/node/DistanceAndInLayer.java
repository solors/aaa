package androidx.compose.p015ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;

/* compiled from: HitTestResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.DistanceAndInLayer */
/* loaded from: classes.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    private /* synthetic */ DistanceAndInLayer(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m109098boximpl(long j) {
        return new DistanceAndInLayer(j);
    }

    /* renamed from: compareTo-S_HNhKs  reason: not valid java name */
    public static final int m109099compareToS_HNhKs(long j, long j2) {
        boolean m109105isInLayerimpl = m109105isInLayerimpl(j);
        if (m109105isInLayerimpl != m109105isInLayerimpl(j2)) {
            if (m109105isInLayerimpl) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(m109103getDistanceimpl(j) - m109103getDistanceimpl(j2));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109101equalsimpl(long j, Object obj) {
        if (!(obj instanceof DistanceAndInLayer) || j != ((DistanceAndInLayer) obj).m109107unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109102equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m109103getDistanceimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109104hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInLayer-impl  reason: not valid java name */
    public static final boolean m109105isInLayerimpl(long j) {
        if (((int) (j & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109106toStringimpl(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m109101equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m109104hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m109106toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109107unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109100constructorimpl(long j) {
        return j;
    }
}
