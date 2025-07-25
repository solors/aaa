package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathFillType.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.PathFillType */
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m107764constructorimpl(0);
    private static final int EvenOdd = m107764constructorimpl(1);

    /* compiled from: PathFillType.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PathFillType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os  reason: not valid java name */
        public final int m107770getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os  reason: not valid java name */
        public final int m107771getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }
    }

    private /* synthetic */ PathFillType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PathFillType m107763boximpl(int i) {
        return new PathFillType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107765equalsimpl(int i, Object obj) {
        if (!(obj instanceof PathFillType) || i != ((PathFillType) obj).m107769unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107766equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107767hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107768toStringimpl(int i) {
        if (m107766equalsimpl0(i, NonZero)) {
            return "NonZero";
        }
        if (m107766equalsimpl0(i, EvenOdd)) {
            return "EvenOdd";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107765equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107767hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107768toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107769unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107764constructorimpl(int i) {
        return i;
    }
}
