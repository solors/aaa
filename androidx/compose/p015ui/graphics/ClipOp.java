package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ClipOp.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.ClipOp */
/* loaded from: classes.dex */
public final class ClipOp {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m107509constructorimpl(0);
    private static final int Intersect = m107509constructorimpl(1);
    private final int value;

    /* compiled from: ClipOp.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.ClipOp$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo  reason: not valid java name */
        public final int m107515getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo  reason: not valid java name */
        public final int m107516getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }
    }

    private /* synthetic */ ClipOp(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ClipOp m107508boximpl(int i) {
        return new ClipOp(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107510equalsimpl(int i, Object obj) {
        if (!(obj instanceof ClipOp) || i != ((ClipOp) obj).m107514unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107511equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107512hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107513toStringimpl(int i) {
        if (m107511equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m107511equalsimpl0(i, Intersect)) {
            return "Intersect";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107510equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107512hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107513toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107514unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107509constructorimpl(int i) {
        return i;
    }
}
