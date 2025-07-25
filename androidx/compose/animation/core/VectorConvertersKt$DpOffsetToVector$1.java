package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$1 extends Lambda implements Function1<DpOffset, AnimationVector2D> {
    public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1();

    VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
        return m106047invokejoFl9I(dpOffset.m109803unboximpl());
    }

    @NotNull
    /* renamed from: invoke-jo-Fl9I  reason: not valid java name */
    public final AnimationVector2D m106047invokejoFl9I(long j) {
        return new AnimationVector2D(DpOffset.m109795getXD9Ej5fM(j), DpOffset.m109797getYD9Ej5fM(j));
    }
}
