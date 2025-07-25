package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LineHeightStyle.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.style.LineHeightStyle */
/* loaded from: classes.dex */
public final class LineHeightStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final LineHeightStyle Default = new LineHeightStyle(Alignment.Companion.m109620getProportionalPIaL0Z0(), Trim.Companion.m109631getBothEVpEnUU(), null);
    private final int alignment;
    private final int trim;

    /* compiled from: LineHeightStyle.kt */
    @ExperimentalTextApi
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment */
    /* loaded from: classes.dex */
    public static final class Alignment {
        private final int topPercentage;
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int Top = m109612constructorimpl(0);
        private static final int Center = m109612constructorimpl(50);
        private static final int Proportional = m109612constructorimpl(-1);
        private static final int Bottom = m109612constructorimpl(100);

        /* compiled from: LineHeightStyle.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment$Companion */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0  reason: not valid java name */
            public final int m109618getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0  reason: not valid java name */
            public final int m109619getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0  reason: not valid java name */
            public final int m109620getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0  reason: not valid java name */
            public final int m109621getTopPIaL0Z0() {
                return Alignment.Top;
            }
        }

        private /* synthetic */ Alignment(int i) {
            this.topPercentage = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Alignment m109611boximpl(int i) {
            return new Alignment(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m109612constructorimpl(int i) {
            boolean z;
            boolean z2 = true;
            if (i >= 0 && i < 101) {
                z = true;
            } else {
                z = false;
            }
            if (!z && i != -1) {
                z2 = false;
            }
            if (z2) {
                return i;
            }
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m109613equalsimpl(int i, Object obj) {
            if (!(obj instanceof Alignment) || i != ((Alignment) obj).m109617unboximpl()) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m109614equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m109615hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m109616toStringimpl(int i) {
            if (i == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (i == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (i == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (i == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + i + ')';
        }

        public boolean equals(Object obj) {
            return m109613equalsimpl(this.topPercentage, obj);
        }

        public int hashCode() {
            return m109615hashCodeimpl(this.topPercentage);
        }

        @NotNull
        public String toString() {
            return m109616toStringimpl(this.topPercentage);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m109617unboximpl() {
            return this.topPercentage;
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    public /* synthetic */ LineHeightStyle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        if (Alignment.m109614equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m109625equalsimpl0(this.trim, lineHeightStyle.trim)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0  reason: not valid java name */
    public final int m109609getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getTrim-EVpEnUU  reason: not valid java name */
    public final int m109610getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (Alignment.m109615hashCodeimpl(this.alignment) * 31) + Trim.m109626hashCodeimpl(this.trim);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m109616toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m109629toStringimpl(this.trim)) + ')';
    }

    private LineHeightStyle(int i, int i2) {
        this.alignment = i;
        this.trim = i2;
    }

    /* compiled from: LineHeightStyle.kt */
    @ExperimentalTextApi
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim */
    /* loaded from: classes.dex */
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m109623constructorimpl(1);
        private static final int LastLineBottom = m109623constructorimpl(16);
        private static final int Both = m109623constructorimpl(17);
        private static final int None = m109623constructorimpl(0);

        /* compiled from: LineHeightStyle.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim$Companion */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU  reason: not valid java name */
            public final int m109631getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU  reason: not valid java name */
            public final int m109632getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU  reason: not valid java name */
            public final int m109633getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU  reason: not valid java name */
            public final int m109634getNoneEVpEnUU() {
                return Trim.None;
            }
        }

        private /* synthetic */ Trim(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Trim m109622boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m109624equalsimpl(int i, Object obj) {
            if (!(obj instanceof Trim) || i != ((Trim) obj).m109630unboximpl()) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m109625equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m109626hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release  reason: not valid java name */
        public static final boolean m109627isTrimFirstLineTopimpl$ui_text_release(int i) {
            if ((i & 1) > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release  reason: not valid java name */
        public static final boolean m109628isTrimLastLineBottomimpl$ui_text_release(int i) {
            if ((i & 16) > 0) {
                return true;
            }
            return false;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m109629toStringimpl(int i) {
            if (i == FirstLineTop) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == LastLineBottom) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == Both) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i == None) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m109624equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m109626hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m109629toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m109630unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m109623constructorimpl(int i) {
            return i;
        }
    }
}
