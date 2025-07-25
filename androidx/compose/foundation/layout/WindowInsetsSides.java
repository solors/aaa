package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsets.kt */
@Metadata
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* compiled from: WindowInsets.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m106394getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m106396getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m106397getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM  reason: not valid java name */
        public final int m106398getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM  reason: not valid java name */
        public final int m106399getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM  reason: not valid java name */
        public final int m106400getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM  reason: not valid java name */
        public final int m106401getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM  reason: not valid java name */
        public final int m106402getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM  reason: not valid java name */
        public final int m106403getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM  reason: not valid java name */
        public final int m106404getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM  reason: not valid java name */
        public final int m106405getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }
    }

    static {
        int m106384constructorimpl = m106384constructorimpl(8);
        AllowLeftInLtr = m106384constructorimpl;
        int m106384constructorimpl2 = m106384constructorimpl(4);
        AllowRightInLtr = m106384constructorimpl2;
        int m106384constructorimpl3 = m106384constructorimpl(2);
        AllowLeftInRtl = m106384constructorimpl3;
        int m106384constructorimpl4 = m106384constructorimpl(1);
        AllowRightInRtl = m106384constructorimpl4;
        Start = m106389plusgK_yJZ4(m106384constructorimpl, m106384constructorimpl4);
        End = m106389plusgK_yJZ4(m106384constructorimpl2, m106384constructorimpl3);
        int m106384constructorimpl5 = m106384constructorimpl(16);
        Top = m106384constructorimpl5;
        int m106384constructorimpl6 = m106384constructorimpl(32);
        Bottom = m106384constructorimpl6;
        int m106389plusgK_yJZ4 = m106389plusgK_yJZ4(m106384constructorimpl, m106384constructorimpl3);
        Left = m106389plusgK_yJZ4;
        int m106389plusgK_yJZ42 = m106389plusgK_yJZ4(m106384constructorimpl2, m106384constructorimpl4);
        Right = m106389plusgK_yJZ42;
        Horizontal = m106389plusgK_yJZ4(m106389plusgK_yJZ4, m106389plusgK_yJZ42);
        Vertical = m106389plusgK_yJZ4(m106384constructorimpl5, m106384constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m106383boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106385equalsimpl(int i, Object obj) {
        if (!(obj instanceof WindowInsetsSides) || i != ((WindowInsetsSides) obj).m106393unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106386equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release  reason: not valid java name */
    public static final boolean m106387hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106388hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: plus-gK_yJZ4  reason: not valid java name */
    public static final int m106389plusgK_yJZ4(int i, int i2) {
        return m106384constructorimpl(i | i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106390toStringimpl(int i) {
        return "WindowInsetsSides(" + m106391valueToStringimpl(i) + ')';
    }

    /* renamed from: valueToString-impl  reason: not valid java name */
    private static final String m106391valueToStringimpl(int i) {
        StringBuilder sb2 = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            m106392valueToString_impl$lambda0$appendPlus(sb2, "Bottom");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: valueToString_impl$lambda-0$appendPlus  reason: not valid java name */
    private static final void m106392valueToString_impl$lambda0$appendPlus(StringBuilder sb2, String str) {
        boolean z;
        if (sb2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return m106385equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m106388hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m106390toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106393unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m106384constructorimpl(int i) {
        return i;
    }
}
