package androidx.compose.p015ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1 */
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$1 extends Lambda implements Function2<Vector, String, Unit> {
    public static final VectorComposeKt$Group$2$1 INSTANCE = new VectorComposeKt$Group$2$1();

    VectorComposeKt$Group$2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Vector vector, String str) {
        invoke2(vector, str);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Vector set, @NotNull String it) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        set.setName(it);
    }
}
