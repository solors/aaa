package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: VertexMode.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.VertexMode */
/* loaded from: classes.dex */
public final class VertexMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m107871constructorimpl(0);
    private static final int TriangleStrip = m107871constructorimpl(1);
    private static final int TriangleFan = m107871constructorimpl(2);

    /* compiled from: VertexMode.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.VertexMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI  reason: not valid java name */
        public final int m107877getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI  reason: not valid java name */
        public final int m107878getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI  reason: not valid java name */
        public final int m107879getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }
    }

    private /* synthetic */ VertexMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ VertexMode m107870boximpl(int i) {
        return new VertexMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107872equalsimpl(int i, Object obj) {
        if (!(obj instanceof VertexMode) || i != ((VertexMode) obj).m107876unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107873equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107874hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107875toStringimpl(int i) {
        if (m107873equalsimpl0(i, Triangles)) {
            return "Triangles";
        }
        if (m107873equalsimpl0(i, TriangleStrip)) {
            return "TriangleStrip";
        }
        if (m107873equalsimpl0(i, TriangleFan)) {
            return "TriangleFan";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107872equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107874hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107875toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107876unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107871constructorimpl(int i) {
        return i;
    }
}
