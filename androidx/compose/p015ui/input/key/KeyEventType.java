package androidx.compose.p015ui.input.key;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.key.KeyEventType */
/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m108752constructorimpl(0);
    private static final int KeyUp = m108752constructorimpl(1);
    private static final int KeyDown = m108752constructorimpl(2);

    /* compiled from: KeyEvent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.key.KeyEventType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY  reason: not valid java name */
        public final int m108758getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY  reason: not valid java name */
        public final int m108759getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY  reason: not valid java name */
        public final int m108760getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }
    }

    private /* synthetic */ KeyEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEventType m108751boximpl(int i) {
        return new KeyEventType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108753equalsimpl(int i, Object obj) {
        if (!(obj instanceof KeyEventType) || i != ((KeyEventType) obj).m108757unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108754equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108755hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108756toStringimpl(int i) {
        if (m108754equalsimpl0(i, KeyUp)) {
            return "KeyUp";
        }
        if (m108754equalsimpl0(i, KeyDown)) {
            return "KeyDown";
        }
        if (m108754equalsimpl0(i, Unknown)) {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m108753equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108755hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108756toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108757unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108752constructorimpl(int i) {
        return i;
    }
}
