package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Placeable.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1 */
/* loaded from: classes.dex */
final class PlaceableKt$DefaultLayerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    public static final PlaceableKt$DefaultLayerBlock$1 INSTANCE = new PlaceableKt$DefaultLayerBlock$1();

    PlaceableKt$DefaultLayerBlock$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.f99208a;
    }
}
