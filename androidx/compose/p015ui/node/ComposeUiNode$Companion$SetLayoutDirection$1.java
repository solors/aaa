package androidx.compose.p015ui.node;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposeUiNode.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1 */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements Function2<ComposeUiNode, LayoutDirection, Unit> {
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 INSTANCE = new ComposeUiNode$Companion$SetLayoutDirection$1();

    ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        invoke2(composeUiNode, layoutDirection);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull LayoutDirection it) {
        Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
        Intrinsics.checkNotNullParameter(it, "it");
        composeUiNode.setLayoutDirection(it);
    }
}
