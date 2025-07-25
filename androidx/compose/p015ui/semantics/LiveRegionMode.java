package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsProperties.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.semantics.LiveRegionMode */
/* loaded from: classes.dex */
public final class LiveRegionMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m109265constructorimpl(0);
    private static final int Assertive = m109265constructorimpl(1);

    /* compiled from: SemanticsProperties.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.LiveRegionMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAssertive-0phEisY  reason: not valid java name */
        public final int m109271getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY  reason: not valid java name */
        public final int m109272getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }
    }

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m109264boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109266equalsimpl(int i, Object obj) {
        if (!(obj instanceof LiveRegionMode) || i != ((LiveRegionMode) obj).m109270unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109267equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109268hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109269toStringimpl(int i) {
        if (m109267equalsimpl0(i, Polite)) {
            return "Polite";
        }
        if (m109267equalsimpl0(i, Assertive)) {
            return "Assertive";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m109266equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109268hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109269toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109270unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m109265constructorimpl(int i) {
        return i;
    }
}
