package androidx.compose.material;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.PointerEventKt;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* compiled from: Slider.kt */
@Metadata
/* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 */
/* loaded from: classes.dex */
final class C0762xaefe3945 extends Lambda implements Function1<PointerInputChange, Unit> {
    final /* synthetic */ Ref $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0762xaefe3945(State<? extends Function2<? super Boolean, ? super Float, Unit>> state, Ref ref, boolean z) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = ref;
        this.$isRtl = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        float m107291getXimpl = Offset.m107291getXimpl(PointerEventKt.positionChange(it));
        Function2<Boolean, Float, Unit> value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.f99319b);
        if (this.$isRtl) {
            m107291getXimpl = -m107291getXimpl;
        }
        value.mo105910invoke(valueOf, Float.valueOf(m107291getXimpl));
    }
}
