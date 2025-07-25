package androidx.compose.animation.core;

import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$RectToVector$2 extends Lambda implements Function1<AnimationVector4D, Rect> {
    public static final VectorConvertersKt$RectToVector$2 INSTANCE = new VectorConvertersKt$RectToVector$2();

    VectorConvertersKt$RectToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Rect invoke(@NotNull AnimationVector4D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Rect(it.getV1(), it.getV2(), it.getV3(), it.getV4());
    }
}
