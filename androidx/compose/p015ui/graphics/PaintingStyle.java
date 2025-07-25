package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PaintingStyle.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.PaintingStyle */
/* loaded from: classes.dex */
public final class PaintingStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m107751constructorimpl(0);
    private static final int Stroke = m107751constructorimpl(1);
    private final int value;

    /* compiled from: PaintingStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PaintingStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getFill-TiuSbCo  reason: not valid java name */
        public final int m107757getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo  reason: not valid java name */
        public final int m107758getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }
    }

    private /* synthetic */ PaintingStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m107750boximpl(int i) {
        return new PaintingStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107752equalsimpl(int i, Object obj) {
        if (!(obj instanceof PaintingStyle) || i != ((PaintingStyle) obj).m107756unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107753equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107754hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107755toStringimpl(int i) {
        if (m107753equalsimpl0(i, Fill)) {
            return "Fill";
        }
        if (m107753equalsimpl0(i, Stroke)) {
            return "Stroke";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107752equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107754hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107755toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107756unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107751constructorimpl(int i) {
        return i;
    }
}
