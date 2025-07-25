package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements Function1<IntSize, AnimationVector2D> {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntSize intSize) {
        return m106053invokeozmzZPI(intSize.m109898unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final AnimationVector2D m106053invokeozmzZPI(long j) {
        return new AnimationVector2D(IntSize.m109894getWidthimpl(j), IntSize.m109893getHeightimpl(j));
    }
}
