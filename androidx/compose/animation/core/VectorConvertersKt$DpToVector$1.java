package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$1 extends Lambda implements Function1<C1059Dp, AnimationVector1D> {
    public static final VectorConvertersKt$DpToVector$1 INSTANCE = new VectorConvertersKt$DpToVector$1();

    VectorConvertersKt$DpToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(C1059Dp c1059Dp) {
        return m106049invoke0680j_4(c1059Dp.m109748unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0680j_4  reason: not valid java name */
    public final AnimationVector1D m106049invoke0680j_4(float f) {
        return new AnimationVector1D(f);
    }
}
