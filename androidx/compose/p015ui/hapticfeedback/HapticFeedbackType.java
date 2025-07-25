package androidx.compose.p015ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HapticFeedbackType.kt */
@Metadata
/* renamed from: androidx.compose.ui.hapticfeedback.HapticFeedbackType */
/* loaded from: classes.dex */
public final class HapticFeedbackType {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: HapticFeedbackType.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.hapticfeedback.HapticFeedbackType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
        public final int m108147getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m108149getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
        public final int m108148getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m108150getTextHandleMove5zf0vsI();
        }

        @NotNull
        public final List<HapticFeedbackType> values() {
            List<HapticFeedbackType> m17163p;
            m17163p = C37563v.m17163p(HapticFeedbackType.m108140boximpl(m108147getLongPress5zf0vsI()), HapticFeedbackType.m108140boximpl(m108148getTextHandleMove5zf0vsI()));
            return m17163p;
        }
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m108140boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108142equalsimpl(int i, Object obj) {
        if (!(obj instanceof HapticFeedbackType) || i != ((HapticFeedbackType) obj).m108146unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108143equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108144hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108145toStringimpl(int i) {
        Companion companion = Companion;
        if (m108143equalsimpl0(i, companion.m108147getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m108143equalsimpl0(i, companion.m108148getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m108142equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108144hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108145toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108146unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108141constructorimpl(int i) {
        return i;
    }
}
