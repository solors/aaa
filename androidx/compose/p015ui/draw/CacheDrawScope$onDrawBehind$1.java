package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1 */
/* loaded from: classes.dex */
final class CacheDrawScope$onDrawBehind$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ Function1<DrawScope, Unit> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CacheDrawScope$onDrawBehind$1(Function1<? super DrawScope, Unit> function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        this.$block.invoke(onDrawWithContent);
        onDrawWithContent.drawContent();
    }
}
