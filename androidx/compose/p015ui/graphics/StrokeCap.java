package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: StrokeCap.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.StrokeCap */
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m107825constructorimpl(0);
    private static final int Round = m107825constructorimpl(1);
    private static final int Square = m107825constructorimpl(2);

    /* compiled from: StrokeCap.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.StrokeCap$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButt-KaPHkGw  reason: not valid java name */
        public final int m107831getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw  reason: not valid java name */
        public final int m107832getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw  reason: not valid java name */
        public final int m107833getSquareKaPHkGw() {
            return StrokeCap.Square;
        }
    }

    private /* synthetic */ StrokeCap(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StrokeCap m107824boximpl(int i) {
        return new StrokeCap(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107826equalsimpl(int i, Object obj) {
        if (!(obj instanceof StrokeCap) || i != ((StrokeCap) obj).m107830unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107827equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107828hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107829toStringimpl(int i) {
        if (m107827equalsimpl0(i, Butt)) {
            return "Butt";
        }
        if (m107827equalsimpl0(i, Round)) {
            return "Round";
        }
        if (m107827equalsimpl0(i, Square)) {
            return "Square";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107826equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107828hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107829toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107830unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107825constructorimpl(int i) {
        return i;
    }
}
