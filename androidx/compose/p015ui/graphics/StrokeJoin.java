package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: StrokeJoin.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.StrokeJoin */
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m107835constructorimpl(0);
    private static final int Round = m107835constructorimpl(1);
    private static final int Bevel = m107835constructorimpl(2);

    /* compiled from: StrokeJoin.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.StrokeJoin$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8  reason: not valid java name */
        public final int m107841getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8  reason: not valid java name */
        public final int m107842getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8  reason: not valid java name */
        public final int m107843getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }
    }

    private /* synthetic */ StrokeJoin(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m107834boximpl(int i) {
        return new StrokeJoin(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107836equalsimpl(int i, Object obj) {
        if (!(obj instanceof StrokeJoin) || i != ((StrokeJoin) obj).m107840unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107837equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107838hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107839toStringimpl(int i) {
        if (m107837equalsimpl0(i, Miter)) {
            return "Miter";
        }
        if (m107837equalsimpl0(i, Round)) {
            return "Round";
        }
        if (m107837equalsimpl0(i, Bevel)) {
            return "Bevel";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107836equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107838hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107839toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107840unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107835constructorimpl(int i) {
        return i;
    }
}
