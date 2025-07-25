package androidx.compose.p015ui.input.rotary;

import androidx.compose.p015ui.input.focus.FocusAwareEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: RotaryInputModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt$focusAwareCallback$1 */
/* loaded from: classes.dex */
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements Function1<FocusAwareEvent, Boolean> {
    final /* synthetic */ Function1<RotaryScrollEvent, Boolean> $this_focusAwareCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputModifierKt$focusAwareCallback$1(Function1<? super RotaryScrollEvent, Boolean> function1) {
        super(1);
        this.$this_focusAwareCallback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull FocusAwareEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof RotaryScrollEvent) {
            return this.$this_focusAwareCallback.invoke(e);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
