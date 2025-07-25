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
final class VectorConvertersKt$RectToVector$1 extends Lambda implements Function1<Rect, AnimationVector4D> {
    public static final VectorConvertersKt$RectToVector$1 INSTANCE = new VectorConvertersKt$RectToVector$1();

    VectorConvertersKt$RectToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final AnimationVector4D invoke(@NotNull Rect it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
    }
}
