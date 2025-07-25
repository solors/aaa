package androidx.compose.p015ui.node;

import androidx.compose.p015ui.draw.BuildDrawCacheParams;
import androidx.compose.p015ui.draw.DrawCacheModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawEntity.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.DrawEntity$updateCache$1 */
/* loaded from: classes.dex */
public final class DrawEntity$updateCache$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ DrawEntity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawEntity$updateCache$1(DrawEntity drawEntity) {
        super(0);
        this.this$0 = drawEntity;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DrawCacheModifier drawCacheModifier;
        BuildDrawCacheParams buildDrawCacheParams;
        drawCacheModifier = this.this$0.cacheDrawModifier;
        if (drawCacheModifier != null) {
            buildDrawCacheParams = this.this$0.buildCacheParams;
            drawCacheModifier.onBuildCache(buildDrawCacheParams);
        }
        this.this$0.invalidateCache = false;
    }
}
