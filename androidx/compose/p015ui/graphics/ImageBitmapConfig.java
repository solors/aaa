package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageBitmap.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.ImageBitmapConfig */
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m107706constructorimpl(0);
    private static final int Alpha8 = m107706constructorimpl(1);
    private static final int Rgb565 = m107706constructorimpl(2);
    private static final int F16 = m107706constructorimpl(3);
    private static final int Gpu = m107706constructorimpl(4);

    /* compiled from: ImageBitmap.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.ImageBitmapConfig$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ  reason: not valid java name */
        public final int m107712getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ  reason: not valid java name */
        public final int m107713getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ  reason: not valid java name */
        public final int m107714getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ  reason: not valid java name */
        public final int m107715getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ  reason: not valid java name */
        public final int m107716getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m107705boximpl(int i) {
        return new ImageBitmapConfig(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107707equalsimpl(int i, Object obj) {
        if (!(obj instanceof ImageBitmapConfig) || i != ((ImageBitmapConfig) obj).m107711unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107708equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107709hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107710toStringimpl(int i) {
        if (m107708equalsimpl0(i, Argb8888)) {
            return "Argb8888";
        }
        if (m107708equalsimpl0(i, Alpha8)) {
            return "Alpha8";
        }
        if (m107708equalsimpl0(i, Rgb565)) {
            return "Rgb565";
        }
        if (m107708equalsimpl0(i, F16)) {
            return "F16";
        }
        if (m107708equalsimpl0(i, Gpu)) {
            return "Gpu";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107707equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m107709hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107710toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107711unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107706constructorimpl(int i) {
        return i;
    }
}
