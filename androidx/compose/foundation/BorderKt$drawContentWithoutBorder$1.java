package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Border.kt */
@Metadata
/* loaded from: classes.dex */
final class BorderKt$drawContentWithoutBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public static final BorderKt$drawContentWithoutBorder$1 INSTANCE = new BorderKt$drawContentWithoutBorder$1();

    BorderKt$drawContentWithoutBorder$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
    }
}
