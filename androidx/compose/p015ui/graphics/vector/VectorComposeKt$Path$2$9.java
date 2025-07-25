package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9 */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends Lambda implements Function2<PathComponent, StrokeJoin, Unit> {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
        m108127invokekLtJ_vA(pathComponent, strokeJoin.m107840unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-kLtJ_vA  reason: not valid java name */
    public final void m108127invokekLtJ_vA(@NotNull PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m108111setStrokeLineJoinWw9F2mQ(i);
    }
}
