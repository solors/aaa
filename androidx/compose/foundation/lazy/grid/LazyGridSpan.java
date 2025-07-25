package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata
/* renamed from: androidx.compose.foundation.lazy.grid.GridItemSpan */
/* loaded from: classes.dex */
public final class LazyGridSpan {
    private final long packedValue;

    private /* synthetic */ LazyGridSpan(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LazyGridSpan m106454boximpl(long j) {
        return new LazyGridSpan(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106456equalsimpl(long j, Object obj) {
        if (!(obj instanceof LazyGridSpan) || j != ((LazyGridSpan) obj).m106461unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106457equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getCurrentLineSpan-impl  reason: not valid java name */
    public static final int m106458getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106459hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106460toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m106456equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m106459hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m106460toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m106461unboximpl() {
        return this.packedValue;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getCurrentLineSpan$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m106455constructorimpl(long j) {
        return j;
    }
}
