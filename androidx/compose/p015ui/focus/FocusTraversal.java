package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.focus.FocusDirection */
/* loaded from: classes.dex */
public final class FocusTraversal {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Next = m107225constructorimpl(1);
    private static final int Previous = m107225constructorimpl(2);
    private static final int Left = m107225constructorimpl(3);
    private static final int Right = m107225constructorimpl(4);

    /* renamed from: Up */
    private static final int f402Up = m107225constructorimpl(5);
    private static final int Down = m107225constructorimpl(6);

    /* renamed from: In */
    private static final int f401In = m107225constructorimpl(7);
    private static final int Out = m107225constructorimpl(8);

    private /* synthetic */ FocusTraversal(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FocusTraversal m107224boximpl(int i) {
        return new FocusTraversal(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107226equalsimpl(int i, Object obj) {
        if (!(obj instanceof FocusTraversal) || i != ((FocusTraversal) obj).m107230unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107227equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107228hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107229toStringimpl(int i) {
        if (m107227equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m107227equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m107227equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m107227equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m107227equalsimpl0(i, f402Up)) {
            return "Up";
        }
        if (m107227equalsimpl0(i, Down)) {
            return "Down";
        }
        if (m107227equalsimpl0(i, f401In)) {
            return "In";
        }
        if (m107227equalsimpl0(i, Out)) {
            return "Out";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m107226equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107228hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107229toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107230unboximpl() {
        return this.value;
    }

    /* compiled from: FocusTraversal.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusDirection$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s  reason: not valid java name */
        public final int m107233getDowndhqQ8s() {
            return FocusTraversal.Down;
        }

        /* renamed from: getIn-dhqQ-8s  reason: not valid java name */
        public final int m107234getIndhqQ8s() {
            return FocusTraversal.f401In;
        }

        /* renamed from: getLeft-dhqQ-8s  reason: not valid java name */
        public final int m107235getLeftdhqQ8s() {
            return FocusTraversal.Left;
        }

        /* renamed from: getNext-dhqQ-8s  reason: not valid java name */
        public final int m107236getNextdhqQ8s() {
            return FocusTraversal.Next;
        }

        /* renamed from: getOut-dhqQ-8s  reason: not valid java name */
        public final int m107237getOutdhqQ8s() {
            return FocusTraversal.Out;
        }

        /* renamed from: getPrevious-dhqQ-8s  reason: not valid java name */
        public final int m107238getPreviousdhqQ8s() {
            return FocusTraversal.Previous;
        }

        /* renamed from: getRight-dhqQ-8s  reason: not valid java name */
        public final int m107239getRightdhqQ8s() {
            return FocusTraversal.Right;
        }

        /* renamed from: getUp-dhqQ-8s  reason: not valid java name */
        public final int m107240getUpdhqQ8s() {
            return FocusTraversal.f402Up;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m107231getIndhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m107232getOutdhqQ8s$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107225constructorimpl(int i) {
        return i;
    }
}
