package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.util.MathHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextGeometricTransform.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextGeometricTransformKt */
/* loaded from: classes.dex */
public final class TextGeometricTransformKt {
    @NotNull
    public static final TextGeometricTransform lerp(@NotNull TextGeometricTransform start, @NotNull TextGeometricTransform stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextGeometricTransform(MathHelpers.lerp(start.getScaleX(), stop.getScaleX(), f), MathHelpers.lerp(start.getSkewX(), stop.getSkewX(), f));
    }
}
