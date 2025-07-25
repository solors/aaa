package androidx.compose.animation.core;

import androidx.compose.p015ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$SizeToVector$1 extends Lambda implements Function1<Size, AnimationVector2D> {
    public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1();

    VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Size size) {
        return m106057invokeuvyYCjk(size.m107365unboximpl());
    }

    @NotNull
    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final AnimationVector2D m106057invokeuvyYCjk(long j) {
        return new AnimationVector2D(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j));
    }
}
