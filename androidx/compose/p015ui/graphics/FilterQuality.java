package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import com.maticoo.sdk.MaticooAdsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FilterQuality.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.FilterQuality */
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int None = m107606constructorimpl(0);
    private static final int Low = m107606constructorimpl(1);
    private static final int Medium = m107606constructorimpl(2);
    private static final int High = m107606constructorimpl(3);

    /* compiled from: FilterQuality.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.FilterQuality$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I  reason: not valid java name */
        public final int m107612getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I  reason: not valid java name */
        public final int m107613getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I  reason: not valid java name */
        public final int m107614getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I  reason: not valid java name */
        public final int m107615getNonefv9h1I() {
            return FilterQuality.None;
        }
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FilterQuality m107605boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107607equalsimpl(int i, Object obj) {
        if (!(obj instanceof FilterQuality) || i != ((FilterQuality) obj).m107611unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107608equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107609hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107610toStringimpl(int i) {
        if (m107608equalsimpl0(i, None)) {
            return MaticooAdsConstant.VALUE_AD_MEDIATION;
        }
        if (m107608equalsimpl0(i, Low)) {
            return "Low";
        }
        if (m107608equalsimpl0(i, Medium)) {
            return "Medium";
        }
        if (m107608equalsimpl0(i, High)) {
            return "High";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107607equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m107609hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107610toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107611unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107606constructorimpl(int i) {
        return i;
    }
}
