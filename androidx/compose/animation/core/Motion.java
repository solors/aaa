package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;

/* compiled from: SpringSimulation.kt */
@Metadata
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Motion m106013boximpl(long j) {
        return new Motion(j);
    }

    /* renamed from: copy-XB9eQnU  reason: not valid java name */
    public static final long m106015copyXB9eQnU(long j, float f, float f2) {
        return SpringSimulationKt.Motion(f, f2);
    }

    /* renamed from: copy-XB9eQnU$default  reason: not valid java name */
    public static /* synthetic */ long m106016copyXB9eQnU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m106019getValueimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m106020getVelocityimpl(j);
        }
        return m106015copyXB9eQnU(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106017equalsimpl(long j, Object obj) {
        if (!(obj instanceof Motion) || j != ((Motion) obj).m106023unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106018equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m106019getValueimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl  reason: not valid java name */
    public static final float m106020getVelocityimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106021hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106022toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m106017equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m106021hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m106022toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m106023unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m106014constructorimpl(long j) {
        return j;
    }
}
