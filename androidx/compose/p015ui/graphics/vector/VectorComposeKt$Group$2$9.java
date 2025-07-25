package androidx.compose.p015ui.graphics.vector;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 */
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$9 extends Lambda implements Function2<Vector, List<? extends PathNode>, Unit> {
    public static final VectorComposeKt$Group$2$9 INSTANCE = new VectorComposeKt$Group$2$9();

    VectorComposeKt$Group$2$9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Vector vector, List<? extends PathNode> list) {
        invoke2(vector, list);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Vector set, @NotNull List<? extends PathNode> it) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        set.setClipPathData(it);
    }
}
