package androidx.compose.p015ui;

import androidx.compose.p015ui.focus.FocusEventModifier;
import androidx.compose.p015ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1 */
/* loaded from: classes.dex */
/* synthetic */ class ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1 extends FunctionReferenceImpl implements Function1<FocusState, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(Object obj) {
        super(1, obj, FocusEventModifier.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocusState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FocusEventModifier) this.receiver).onFocusEvent(p0);
    }
}
