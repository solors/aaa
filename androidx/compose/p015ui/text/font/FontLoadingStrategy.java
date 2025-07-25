package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontLoadingStrategy.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy */
/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m109445constructorimpl(0);
    private static final int OptionalLocal = m109445constructorimpl(1);
    private static final int Async = m109445constructorimpl(2);

    /* compiled from: FontLoadingStrategy.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ  reason: not valid java name */
        public final int m109451getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ  reason: not valid java name */
        public final int m109452getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ  reason: not valid java name */
        public final int m109453getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m109444boximpl(int i) {
        return new FontLoadingStrategy(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109446equalsimpl(int i, Object obj) {
        if (!(obj instanceof FontLoadingStrategy) || i != ((FontLoadingStrategy) obj).m109450unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109447equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109448hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109449toStringimpl(int i) {
        if (m109447equalsimpl0(i, Blocking)) {
            return "Blocking";
        }
        if (m109447equalsimpl0(i, OptionalLocal)) {
            return "Optional";
        }
        if (m109447equalsimpl0(i, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m109446equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m109448hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109449toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109450unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m109445constructorimpl(int i) {
        return i;
    }
}
