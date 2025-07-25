package androidx.compose.p015ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.p015ui.graphics.StampedPathEffectStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPathEffect.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPathEffect_androidKt */
/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    @NotNull
    public static final PathEffect actualChainPathEffect(@NotNull PathEffect outer, @NotNull PathEffect inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        return new AndroidPathEffect(new ComposePathEffect(((AndroidPathEffect) outer).getNativePathEffect(), ((AndroidPathEffect) inner).getNativePathEffect()));
    }

    @NotNull
    public static final PathEffect actualCornerPathEffect(float f) {
        return new AndroidPathEffect(new CornerPathEffect(f));
    }

    @NotNull
    public static final PathEffect actualDashPathEffect(@NotNull float[] intervals, float f) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        return new AndroidPathEffect(new DashPathEffect(intervals, f));
    }

    @NotNull
    /* renamed from: actualStampedPathEffect-7aD1DOk */
    public static final PathEffect m107427actualStampedPathEffect7aD1DOk(@NotNull Path shape, float f, float f2, int i) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (shape instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) shape).getInternalPath(), f, f2, m107428toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final PathEffect asAndroidPathEffect(@NotNull PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(pathEffect, "<this>");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    @NotNull
    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo */
    public static final PathDashPathEffect.Style m107428toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        if (StampedPathEffectStyle.m107817equalsimpl0(i, companion.m107821getMorphYpspkwk())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (StampedPathEffectStyle.m107817equalsimpl0(i, companion.m107822getRotateYpspkwk())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        if (StampedPathEffectStyle.m107817equalsimpl0(i, companion.m107823getTranslateYpspkwk())) {
            return PathDashPathEffect.Style.TRANSLATE;
        }
        return PathDashPathEffect.Style.TRANSLATE;
    }

    @NotNull
    public static final PathEffect toComposePathEffect(@NotNull PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(pathEffect, "<this>");
        return new AndroidPathEffect(pathEffect);
    }
}
