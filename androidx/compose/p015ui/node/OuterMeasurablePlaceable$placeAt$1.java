package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OuterMeasurablePlaceable.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable$placeAt$1 */
/* loaded from: classes.dex */
public final class OuterMeasurablePlaceable$placeAt$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;
    final /* synthetic */ long $position;
    final /* synthetic */ float $zIndex;
    final /* synthetic */ OuterMeasurablePlaceable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OuterMeasurablePlaceable$placeAt$1(OuterMeasurablePlaceable outerMeasurablePlaceable, long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        super(0);
        this.this$0 = outerMeasurablePlaceable;
        this.$position = j;
        this.$zIndex = f;
        this.$layerBlock = function1;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.m109184placeOuterWrapperf8xVGno(this.$position, this.$zIndex, this.$layerBlock);
    }
}
