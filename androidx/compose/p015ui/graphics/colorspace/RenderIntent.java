package androidx.compose.p015ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderIntent.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent */
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m107902constructorimpl(0);
    private static final int Relative = m107902constructorimpl(1);
    private static final int Saturation = m107902constructorimpl(2);
    private static final int Absolute = m107902constructorimpl(3);

    /* compiled from: RenderIntent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA  reason: not valid java name */
        public final int m107908getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA  reason: not valid java name */
        public final int m107909getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA  reason: not valid java name */
        public final int m107910getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA  reason: not valid java name */
        public final int m107911getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }
    }

    private /* synthetic */ RenderIntent(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ RenderIntent m107901boximpl(int i) {
        return new RenderIntent(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107903equalsimpl(int i, Object obj) {
        if (!(obj instanceof RenderIntent) || i != ((RenderIntent) obj).m107907unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107904equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107905hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107906toStringimpl(int i) {
        if (m107904equalsimpl0(i, Perceptual)) {
            return "Perceptual";
        }
        if (m107904equalsimpl0(i, Relative)) {
            return "Relative";
        }
        if (m107904equalsimpl0(i, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m107904equalsimpl0(i, Absolute)) {
            return "Absolute";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107903equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107905hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107906toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107907unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107902constructorimpl(int i) {
        return i;
    }
}
