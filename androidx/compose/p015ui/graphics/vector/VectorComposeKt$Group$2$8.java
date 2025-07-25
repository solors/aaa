package androidx.compose.p015ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8 */
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$8 extends Lambda implements Function2<Vector, Float, Unit> {
    public static final VectorComposeKt$Group$2$8 INSTANCE = new VectorComposeKt$Group$2$8();

    VectorComposeKt$Group$2$8() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Vector vector, Float f) {
        invoke(vector, f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull Vector set, float f) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setTranslationY(f);
    }
}
