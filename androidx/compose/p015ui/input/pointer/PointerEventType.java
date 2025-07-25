package androidx.compose.p015ui.input.pointer;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerEventType */
/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m108845constructorimpl(0);
    private static final int Press = m108845constructorimpl(1);
    private static final int Release = m108845constructorimpl(2);
    private static final int Move = m108845constructorimpl(3);
    private static final int Enter = m108845constructorimpl(4);
    private static final int Exit = m108845constructorimpl(5);
    private static final int Scroll = m108845constructorimpl(6);

    /* compiled from: PointerEvent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerEventType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEnter-7fucELk  reason: not valid java name */
        public final int m108851getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk  reason: not valid java name */
        public final int m108852getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk  reason: not valid java name */
        public final int m108853getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk  reason: not valid java name */
        public final int m108854getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk  reason: not valid java name */
        public final int m108855getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk  reason: not valid java name */
        public final int m108856getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk  reason: not valid java name */
        public final int m108857getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }
    }

    private /* synthetic */ PointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerEventType m108844boximpl(int i) {
        return new PointerEventType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108846equalsimpl(int i, Object obj) {
        if (!(obj instanceof PointerEventType) || i != ((PointerEventType) obj).m108850unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108847equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108848hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108849toStringimpl(int i) {
        if (m108847equalsimpl0(i, Press)) {
            return "Press";
        }
        if (m108847equalsimpl0(i, Release)) {
            return "Release";
        }
        if (m108847equalsimpl0(i, Move)) {
            return "Move";
        }
        if (m108847equalsimpl0(i, Enter)) {
            return "Enter";
        }
        if (m108847equalsimpl0(i, Exit)) {
            return "Exit";
        }
        if (m108847equalsimpl0(i, Scroll)) {
            return "Scroll";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m108846equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108848hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108849toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108850unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m108845constructorimpl(int i) {
        return i;
    }
}
