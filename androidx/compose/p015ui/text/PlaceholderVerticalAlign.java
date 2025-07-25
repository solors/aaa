package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Placeholder.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.PlaceholderVerticalAlign */
/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m109324constructorimpl(1);
    private static final int Top = m109324constructorimpl(2);
    private static final int Bottom = m109324constructorimpl(3);
    private static final int Center = m109324constructorimpl(4);
    private static final int TextTop = m109324constructorimpl(5);
    private static final int TextBottom = m109324constructorimpl(6);
    private static final int TextCenter = m109324constructorimpl(7);

    /* compiled from: Placeholder.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.PlaceholderVerticalAlign$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc  reason: not valid java name */
        public final int m109330getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc  reason: not valid java name */
        public final int m109331getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc  reason: not valid java name */
        public final int m109332getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc  reason: not valid java name */
        public final int m109333getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc  reason: not valid java name */
        public final int m109334getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc  reason: not valid java name */
        public final int m109335getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc  reason: not valid java name */
        public final int m109336getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m109323boximpl(int i) {
        return new PlaceholderVerticalAlign(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109325equalsimpl(int i, Object obj) {
        if (!(obj instanceof PlaceholderVerticalAlign) || i != ((PlaceholderVerticalAlign) obj).m109329unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109326equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109327hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109328toStringimpl(int i) {
        if (m109326equalsimpl0(i, AboveBaseline)) {
            return "AboveBaseline";
        }
        if (m109326equalsimpl0(i, Top)) {
            return "Top";
        }
        if (m109326equalsimpl0(i, Bottom)) {
            return "Bottom";
        }
        if (m109326equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m109326equalsimpl0(i, TextTop)) {
            return "TextTop";
        }
        if (m109326equalsimpl0(i, TextBottom)) {
            return "TextBottom";
        }
        if (m109326equalsimpl0(i, TextCenter)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109325equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109327hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109328toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109329unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109324constructorimpl(int i) {
        return i;
    }
}
