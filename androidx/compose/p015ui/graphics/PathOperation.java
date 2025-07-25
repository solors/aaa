package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathOperation.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.PathOperation */
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m107773constructorimpl(0);
    private static final int Intersect = m107773constructorimpl(1);
    private static final int Union = m107773constructorimpl(2);
    private static final int Xor = m107773constructorimpl(3);
    private static final int ReverseDifference = m107773constructorimpl(4);

    /* compiled from: PathOperation.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PathOperation$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c  reason: not valid java name */
        public final int m107779getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c  reason: not valid java name */
        public final int m107780getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c  reason: not valid java name */
        public final int m107781getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c  reason: not valid java name */
        public final int m107782getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c  reason: not valid java name */
        public final int m107783getXorb3I0S0c() {
            return PathOperation.Xor;
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PathOperation m107772boximpl(int i) {
        return new PathOperation(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107774equalsimpl(int i, Object obj) {
        if (!(obj instanceof PathOperation) || i != ((PathOperation) obj).m107778unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107775equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107776hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107777toStringimpl(int i) {
        if (m107775equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m107775equalsimpl0(i, Intersect)) {
            return "Intersect";
        }
        if (m107775equalsimpl0(i, Union)) {
            return "Union";
        }
        if (m107775equalsimpl0(i, Xor)) {
            return "Xor";
        }
        if (m107775equalsimpl0(i, ReverseDifference)) {
            return "ReverseDifference";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107774equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107776hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107777toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107778unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107773constructorimpl(int i) {
        return i;
    }
}
