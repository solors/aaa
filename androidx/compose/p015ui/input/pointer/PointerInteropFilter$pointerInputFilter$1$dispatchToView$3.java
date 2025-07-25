package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.input.pointer.PointerInteropFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerInteropFilter.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 */
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends Lambda implements Function1<MotionEvent, Unit> {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
            if (this.this$1.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
            } else {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
            }
            pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
            return;
        }
        this.this$1.getOnTouchEvent().invoke(motionEvent);
    }
}
