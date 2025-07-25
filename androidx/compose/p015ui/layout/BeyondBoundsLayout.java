package androidx.compose.p015ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout */
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope */
    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @Nullable
    /* renamed from: layout-o7g1Pn8 */
    <T> T mo106429layouto7g1Pn8(int i, @NotNull Function1<? super BeyondBoundsScope, ? extends T> function1);

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection */
    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int Before = m108998constructorimpl(1);
        private static final int After = m108998constructorimpl(2);
        private static final int Left = m108998constructorimpl(3);
        private static final int Right = m108998constructorimpl(4);
        private static final int Above = m108998constructorimpl(5);
        private static final int Below = m108998constructorimpl(6);

        /* compiled from: BeyondBoundsLayout.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE  reason: not valid java name */
            public final int m109004getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE  reason: not valid java name */
            public final int m109005getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE  reason: not valid java name */
            public final int m109006getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE  reason: not valid java name */
            public final int m109007getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE  reason: not valid java name */
            public final int m109008getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE  reason: not valid java name */
            public final int m109009getRighthoxUOeE() {
                return LayoutDirection.Right;
            }
        }

        private /* synthetic */ LayoutDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m108997boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m108999equalsimpl(int i, Object obj) {
            if (!(obj instanceof LayoutDirection) || i != ((LayoutDirection) obj).m109003unboximpl()) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m109000equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m109001hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m109002toStringimpl(int i) {
            if (m109000equalsimpl0(i, Before)) {
                return "Before";
            }
            if (m109000equalsimpl0(i, After)) {
                return "After";
            }
            if (m109000equalsimpl0(i, Left)) {
                return "Left";
            }
            if (m109000equalsimpl0(i, Right)) {
                return "Right";
            }
            if (m109000equalsimpl0(i, Above)) {
                return "Above";
            }
            if (m109000equalsimpl0(i, Below)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m108999equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m109001hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m109002toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m109003unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m108998constructorimpl(int i) {
            return i;
        }
    }
}
