package androidx.compose.p015ui.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputModeManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.InputMode */
/* loaded from: classes.dex */
public final class InputMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m108152constructorimpl(1);
    private static final int Keyboard = m108152constructorimpl(2);

    /* compiled from: InputModeManager.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.InputMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU  reason: not valid java name */
        public final int m108158getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU  reason: not valid java name */
        public final int m108159getTouchaOaMEAU() {
            return InputMode.Touch;
        }
    }

    private /* synthetic */ InputMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputMode m108151boximpl(int i) {
        return new InputMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108153equalsimpl(int i, Object obj) {
        if (!(obj instanceof InputMode) || i != ((InputMode) obj).m108157unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108154equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108155hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108156toStringimpl(int i) {
        if (m108154equalsimpl0(i, Touch)) {
            return "Touch";
        }
        if (m108154equalsimpl0(i, Keyboard)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m108153equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108155hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108156toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108157unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108152constructorimpl(int i) {
        return i;
    }
}
