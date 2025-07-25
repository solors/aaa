package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasicText.kt */
@Metadata
/* loaded from: classes.dex */
final class BasicTextKt$BasicText$4 extends Lambda implements Function1<TextLayoutResult, Unit> {
    public static final BasicTextKt$BasicText$4 INSTANCE = new BasicTextKt$BasicText$4();

    BasicTextKt$BasicText$4() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return Unit.f99208a;
    }
}
