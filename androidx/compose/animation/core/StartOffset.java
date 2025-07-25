package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffset m106027boximpl(long j) {
        return new StartOffset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m106029constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ long m106030constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m106045getDelayEo1U57Q();
        }
        return m106028constructorimpl(i, i2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106031equalsimpl(long j, Object obj) {
        if (!(obj instanceof StartOffset) || j != ((StartOffset) obj).m106037unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106032equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getOffsetMillis-impl  reason: not valid java name */
    public static final int m106033getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q  reason: not valid java name */
    public static final int m106034getOffsetTypeEo1U57Q(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StartOffsetType.Companion.m106046getFastForwardEo1U57Q();
        }
        if (!z) {
            return StartOffsetType.Companion.m106045getDelayEo1U57Q();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106035hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106036toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m106031equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m106035hashCodeimpl(this.value);
    }

    public String toString() {
        return m106036toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m106037unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m106028constructorimpl(int i, int i2) {
        return m106029constructorimpl(i * i2);
    }
}
