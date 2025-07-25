package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointMode.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.PointMode */
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Points = m107786constructorimpl(0);
    private static final int Lines = m107786constructorimpl(1);
    private static final int Polygon = m107786constructorimpl(2);

    /* compiled from: PointMode.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PointMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLines-r_lszbg  reason: not valid java name */
        public final int m107792getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg  reason: not valid java name */
        public final int m107793getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg  reason: not valid java name */
        public final int m107794getPolygonr_lszbg() {
            return PointMode.Polygon;
        }
    }

    private /* synthetic */ PointMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointMode m107785boximpl(int i) {
        return new PointMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107787equalsimpl(int i, Object obj) {
        if (!(obj instanceof PointMode) || i != ((PointMode) obj).m107791unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107788equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107789hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107790toStringimpl(int i) {
        if (m107788equalsimpl0(i, Points)) {
            return "Points";
        }
        if (m107788equalsimpl0(i, Lines)) {
            return "Lines";
        }
        if (m107788equalsimpl0(i, Polygon)) {
            return "Polygon";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107787equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107789hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107790toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107791unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107786constructorimpl(int i) {
        return i;
    }
}
