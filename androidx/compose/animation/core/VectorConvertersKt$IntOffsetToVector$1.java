package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements Function1<IntOffset, AnimationVector2D> {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
        return m106051invokegyyYBs(intOffset.m109861unboximpl());
    }

    @NotNull
    /* renamed from: invoke--gyyYBs  reason: not valid java name */
    public final AnimationVector2D m106051invokegyyYBs(long j) {
        return new AnimationVector2D(IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j));
    }
}
