package androidx.compose.p015ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorModel.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel */
/* loaded from: classes.dex */
public final class ColorModel {
    private static final long Cmyk;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    /* compiled from: ColorModel.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw  reason: not valid java name */
        public final long m107890getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw  reason: not valid java name */
        public final long m107891getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw  reason: not valid java name */
        public final long m107892getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw  reason: not valid java name */
        public final long m107893getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        Rgb = m107883constructorimpl((0 & 4294967295L) | j2);
        Xyz = m107883constructorimpl((1 & 4294967295L) | j2);
        Lab = m107883constructorimpl(j2 | (2 & 4294967295L));
        Cmyk = m107883constructorimpl((j & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorModel m107882boximpl(long j) {
        return new ColorModel(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107884equalsimpl(long j, Object obj) {
        if (!(obj instanceof ColorModel) || j != ((ColorModel) obj).m107889unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107885equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getComponentCount-impl  reason: not valid java name */
    public static final int m107886getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107887hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107888toStringimpl(long j) {
        if (m107885equalsimpl0(j, Rgb)) {
            return "Rgb";
        }
        if (m107885equalsimpl0(j, Xyz)) {
            return "Xyz";
        }
        if (m107885equalsimpl0(j, Lab)) {
            return "Lab";
        }
        if (m107885equalsimpl0(j, Cmyk)) {
            return "Cmyk";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107884equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m107887hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m107888toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m107889unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m107883constructorimpl(long j) {
        return j;
    }
}
