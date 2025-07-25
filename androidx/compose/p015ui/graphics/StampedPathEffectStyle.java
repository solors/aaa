package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathEffect.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.StampedPathEffectStyle */
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m107815constructorimpl(0);
    private static final int Rotate = m107815constructorimpl(1);
    private static final int Morph = m107815constructorimpl(2);

    /* compiled from: PathEffect.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.StampedPathEffectStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk  reason: not valid java name */
        public final int m107821getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk  reason: not valid java name */
        public final int m107822getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk  reason: not valid java name */
        public final int m107823getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m107814boximpl(int i) {
        return new StampedPathEffectStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107816equalsimpl(int i, Object obj) {
        if (!(obj instanceof StampedPathEffectStyle) || i != ((StampedPathEffectStyle) obj).m107820unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107817equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107818hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107819toStringimpl(int i) {
        if (m107817equalsimpl0(i, Translate)) {
            return "Translate";
        }
        if (m107817equalsimpl0(i, Rotate)) {
            return "Rotate";
        }
        if (m107817equalsimpl0(i, Morph)) {
            return "Morph";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107816equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107818hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107819toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107820unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107815constructorimpl(int i) {
        return i;
    }
}
