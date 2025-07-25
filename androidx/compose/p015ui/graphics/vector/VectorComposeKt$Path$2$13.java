package androidx.compose.p015ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13 */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$13 extends Lambda implements Function2<PathComponent, Float, Unit> {
    public static final VectorComposeKt$Path$2$13 INSTANCE = new VectorComposeKt$Path$2$13();

    VectorComposeKt$Path$2$13() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PathComponent pathComponent, Float f) {
        invoke(pathComponent, f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull PathComponent set, float f) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setTrimPathEnd(f);
    }
}
