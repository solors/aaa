package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: NestedScrollModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource */
/* loaded from: classes.dex */
public final class NestedScrollSource {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Drag = m108787constructorimpl(1);
    private static final int Fling = m108787constructorimpl(2);
    private static final int Relocate = m108787constructorimpl(3);
    private final int value;

    private /* synthetic */ NestedScrollSource(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m108786boximpl(int i) {
        return new NestedScrollSource(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108788equalsimpl(int i, Object obj) {
        if (!(obj instanceof NestedScrollSource) || i != ((NestedScrollSource) obj).m108792unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108789equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108790hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108791toStringimpl(int i) {
        if (m108789equalsimpl0(i, Drag)) {
            return "Drag";
        }
        if (m108789equalsimpl0(i, Fling)) {
            return "Fling";
        }
        if (m108789equalsimpl0(i, Relocate)) {
            return "Relocate";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m108788equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108790hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108791toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108792unboximpl() {
        return this.value;
    }

    /* compiled from: NestedScrollModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDrag-WNlRxjI  reason: not valid java name */
        public final int m108794getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI  reason: not valid java name */
        public final int m108795getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI  reason: not valid java name */
        public final int m108796getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI$annotations  reason: not valid java name */
        public static /* synthetic */ void m108793getRelocateWNlRxjI$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108787constructorimpl(int i) {
        return i;
    }
}
