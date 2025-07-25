package androidx.compose.animation.core;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$OffsetToVector$1 extends Lambda implements Function1<Offset, AnimationVector2D> {
    public static final VectorConvertersKt$OffsetToVector$1 INSTANCE = new VectorConvertersKt$OffsetToVector$1();

    VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
        return m106055invokek4lQ0M(offset.m107301unboximpl());
    }

    @NotNull
    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final AnimationVector2D m106055invokek4lQ0M(long j) {
        return new AnimationVector2D(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
    }
}
