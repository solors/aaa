package androidx.compose.p015ui.text.font;

import com.maticoo.sdk.MaticooAdsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontSynthesis.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontSynthesis */
/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int None = m109467constructorimpl(0);
    private static final int All = m109467constructorimpl(1);
    private static final int Weight = m109467constructorimpl(2);
    private static final int Style = m109467constructorimpl(3);

    /* compiled from: FontSynthesis.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.FontSynthesis$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAll-GVVA2EU  reason: not valid java name */
        public final int m109475getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU  reason: not valid java name */
        public final int m109476getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU  reason: not valid java name */
        public final int m109477getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU  reason: not valid java name */
        public final int m109478getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m109466boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109468equalsimpl(int i, Object obj) {
        if (!(obj instanceof FontSynthesis) || i != ((FontSynthesis) obj).m109474unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109469equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109470hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isStyleOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m109471isStyleOnimpl$ui_text_release(int i) {
        if (!m109469equalsimpl0(i, All) && !m109469equalsimpl0(i, Style)) {
            return false;
        }
        return true;
    }

    /* renamed from: isWeightOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m109472isWeightOnimpl$ui_text_release(int i) {
        if (!m109469equalsimpl0(i, All) && !m109469equalsimpl0(i, Weight)) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109473toStringimpl(int i) {
        if (m109469equalsimpl0(i, None)) {
            return MaticooAdsConstant.VALUE_AD_MEDIATION;
        }
        if (m109469equalsimpl0(i, All)) {
            return "All";
        }
        if (m109469equalsimpl0(i, Weight)) {
            return "Weight";
        }
        if (m109469equalsimpl0(i, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109468equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109470hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109473toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109474unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109467constructorimpl(int i) {
        return i;
    }
}
