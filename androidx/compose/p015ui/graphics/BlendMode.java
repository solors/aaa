package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: BlendMode.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.BlendMode */
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m107438constructorimpl(0);
    private static final int Src = m107438constructorimpl(1);
    private static final int Dst = m107438constructorimpl(2);
    private static final int SrcOver = m107438constructorimpl(3);
    private static final int DstOver = m107438constructorimpl(4);
    private static final int SrcIn = m107438constructorimpl(5);
    private static final int DstIn = m107438constructorimpl(6);
    private static final int SrcOut = m107438constructorimpl(7);
    private static final int DstOut = m107438constructorimpl(8);
    private static final int SrcAtop = m107438constructorimpl(9);
    private static final int DstAtop = m107438constructorimpl(10);
    private static final int Xor = m107438constructorimpl(11);
    private static final int Plus = m107438constructorimpl(12);
    private static final int Modulate = m107438constructorimpl(13);
    private static final int Screen = m107438constructorimpl(14);
    private static final int Overlay = m107438constructorimpl(15);
    private static final int Darken = m107438constructorimpl(16);
    private static final int Lighten = m107438constructorimpl(17);
    private static final int ColorDodge = m107438constructorimpl(18);
    private static final int ColorBurn = m107438constructorimpl(19);
    private static final int Hardlight = m107438constructorimpl(20);
    private static final int Softlight = m107438constructorimpl(21);
    private static final int Difference = m107438constructorimpl(22);
    private static final int Exclusion = m107438constructorimpl(23);
    private static final int Multiply = m107438constructorimpl(24);
    private static final int Hue = m107438constructorimpl(25);
    private static final int Saturation = m107438constructorimpl(26);
    private static final int Color = m107438constructorimpl(27);
    private static final int Luminosity = m107438constructorimpl(28);

    /* compiled from: BlendMode.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.BlendMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClear-0nO6VwU  reason: not valid java name */
        public final int m107444getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU  reason: not valid java name */
        public final int m107445getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU  reason: not valid java name */
        public final int m107446getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU  reason: not valid java name */
        public final int m107447getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU  reason: not valid java name */
        public final int m107448getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU  reason: not valid java name */
        public final int m107449getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU  reason: not valid java name */
        public final int m107450getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU  reason: not valid java name */
        public final int m107451getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU  reason: not valid java name */
        public final int m107452getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU  reason: not valid java name */
        public final int m107453getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU  reason: not valid java name */
        public final int m107454getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU  reason: not valid java name */
        public final int m107455getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU  reason: not valid java name */
        public final int m107456getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU  reason: not valid java name */
        public final int m107457getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU  reason: not valid java name */
        public final int m107458getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU  reason: not valid java name */
        public final int m107459getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU  reason: not valid java name */
        public final int m107460getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU  reason: not valid java name */
        public final int m107461getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU  reason: not valid java name */
        public final int m107462getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU  reason: not valid java name */
        public final int m107463getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU  reason: not valid java name */
        public final int m107464getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU  reason: not valid java name */
        public final int m107465getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU  reason: not valid java name */
        public final int m107466getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU  reason: not valid java name */
        public final int m107467getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU  reason: not valid java name */
        public final int m107468getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU  reason: not valid java name */
        public final int m107469getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU  reason: not valid java name */
        public final int m107470getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU  reason: not valid java name */
        public final int m107471getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU  reason: not valid java name */
        public final int m107472getXor0nO6VwU() {
            return BlendMode.Xor;
        }
    }

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlendMode m107437boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107439equalsimpl(int i, Object obj) {
        if (!(obj instanceof BlendMode) || i != ((BlendMode) obj).m107443unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107440equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107441hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107442toStringimpl(int i) {
        if (m107440equalsimpl0(i, Clear)) {
            return "Clear";
        }
        if (m107440equalsimpl0(i, Src)) {
            return "Src";
        }
        if (m107440equalsimpl0(i, Dst)) {
            return "Dst";
        }
        if (m107440equalsimpl0(i, SrcOver)) {
            return "SrcOver";
        }
        if (m107440equalsimpl0(i, DstOver)) {
            return "DstOver";
        }
        if (m107440equalsimpl0(i, SrcIn)) {
            return "SrcIn";
        }
        if (m107440equalsimpl0(i, DstIn)) {
            return "DstIn";
        }
        if (m107440equalsimpl0(i, SrcOut)) {
            return "SrcOut";
        }
        if (m107440equalsimpl0(i, DstOut)) {
            return "DstOut";
        }
        if (m107440equalsimpl0(i, SrcAtop)) {
            return "SrcAtop";
        }
        if (m107440equalsimpl0(i, DstAtop)) {
            return "DstAtop";
        }
        if (m107440equalsimpl0(i, Xor)) {
            return "Xor";
        }
        if (m107440equalsimpl0(i, Plus)) {
            return "Plus";
        }
        if (m107440equalsimpl0(i, Modulate)) {
            return "Modulate";
        }
        if (m107440equalsimpl0(i, Screen)) {
            return "Screen";
        }
        if (m107440equalsimpl0(i, Overlay)) {
            return "Overlay";
        }
        if (m107440equalsimpl0(i, Darken)) {
            return "Darken";
        }
        if (m107440equalsimpl0(i, Lighten)) {
            return "Lighten";
        }
        if (m107440equalsimpl0(i, ColorDodge)) {
            return "ColorDodge";
        }
        if (m107440equalsimpl0(i, ColorBurn)) {
            return "ColorBurn";
        }
        if (m107440equalsimpl0(i, Hardlight)) {
            return "HardLight";
        }
        if (m107440equalsimpl0(i, Softlight)) {
            return "Softlight";
        }
        if (m107440equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m107440equalsimpl0(i, Exclusion)) {
            return "Exclusion";
        }
        if (m107440equalsimpl0(i, Multiply)) {
            return "Multiply";
        }
        if (m107440equalsimpl0(i, Hue)) {
            return "Hue";
        }
        if (m107440equalsimpl0(i, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m107440equalsimpl0(i, Color)) {
            return "Color";
        }
        if (m107440equalsimpl0(i, Luminosity)) {
            return "Luminosity";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107439equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107441hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107442toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107443unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107438constructorimpl(int i) {
        return i;
    }
}
