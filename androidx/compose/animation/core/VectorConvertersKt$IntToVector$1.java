package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntToVector$1 extends Lambda implements Function1<Integer, AnimationVector1D> {
    public static final VectorConvertersKt$IntToVector$1 INSTANCE = new VectorConvertersKt$IntToVector$1();

    VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    @NotNull
    public final AnimationVector1D invoke(int i) {
        return new AnimationVector1D(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(Integer num) {
        return invoke(num.intValue());
    }
}
