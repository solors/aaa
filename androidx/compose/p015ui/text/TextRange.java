package androidx.compose.p015ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextRange.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.TextRange */
/* loaded from: classes.dex */
public final class TextRange {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* compiled from: TextRange.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.TextRange$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-d9O1mEE  reason: not valid java name */
        public final long m109387getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextRange m109370boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: contains-5zc-tL8  reason: not valid java name */
    public static final boolean m109372contains5zctL8(long j, long j2) {
        if (m109380getMinimpl(j) <= m109380getMinimpl(j2) && m109379getMaximpl(j2) <= m109379getMaximpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: contains-impl  reason: not valid java name */
    public static final boolean m109373containsimpl(long j, int i) {
        int m109380getMinimpl = m109380getMinimpl(j);
        if (i >= m109379getMaximpl(j) || m109380getMinimpl > i) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109374equalsimpl(long j, Object obj) {
        if (!(obj instanceof TextRange) || j != ((TextRange) obj).m109386unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109375equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getCollapsed-impl  reason: not valid java name */
    public static final boolean m109376getCollapsedimpl(long j) {
        if (m109382getStartimpl(j) == m109377getEndimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEnd-impl  reason: not valid java name */
    public static final int m109377getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getLength-impl  reason: not valid java name */
    public static final int m109378getLengthimpl(long j) {
        return m109379getMaximpl(j) - m109380getMinimpl(j);
    }

    /* renamed from: getMax-impl  reason: not valid java name */
    public static final int m109379getMaximpl(long j) {
        if (m109382getStartimpl(j) > m109377getEndimpl(j)) {
            return m109382getStartimpl(j);
        }
        return m109377getEndimpl(j);
    }

    /* renamed from: getMin-impl  reason: not valid java name */
    public static final int m109380getMinimpl(long j) {
        if (m109382getStartimpl(j) > m109377getEndimpl(j)) {
            return m109377getEndimpl(j);
        }
        return m109382getStartimpl(j);
    }

    /* renamed from: getReversed-impl  reason: not valid java name */
    public static final boolean m109381getReversedimpl(long j) {
        if (m109382getStartimpl(j) > m109377getEndimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getStart-impl  reason: not valid java name */
    public static final int m109382getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109383hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: intersects-5zc-tL8  reason: not valid java name */
    public static final boolean m109384intersects5zctL8(long j, long j2) {
        if (m109380getMinimpl(j) < m109379getMaximpl(j2) && m109380getMinimpl(j2) < m109379getMaximpl(j)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109385toStringimpl(long j) {
        return "TextRange(" + m109382getStartimpl(j) + ", " + m109377getEndimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m109374equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109383hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m109385toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109386unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109371constructorimpl(long j) {
        return j;
    }
}
