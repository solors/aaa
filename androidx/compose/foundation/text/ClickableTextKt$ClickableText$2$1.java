package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ClickableText.kt */
@Metadata
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$2$1 extends Lambda implements Function1<TextLayoutResult, Unit> {
    final /* synthetic */ SnapshotState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTextKt$ClickableText$2$1(SnapshotState<TextLayoutResult> snapshotState, Function1<? super TextLayoutResult, Unit> function1) {
        super(1);
        this.$layoutResult = snapshotState;
        this.$onTextLayout = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$layoutResult.setValue(it);
        this.$onTextLayout.invoke(it);
    }
}
