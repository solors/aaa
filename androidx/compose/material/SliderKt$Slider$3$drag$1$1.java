package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: Slider.kt */
@DebugMetadata(m17095c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", m17094f = "Slider.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class SliderKt$Slider$3$drag$1$1 extends AbstractC37596l implements InterfaceC45268n<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$drag$1$1(State<? extends Function1<? super Float, Unit>> state, Continuation<? super SliderKt$Slider$3$drag$1$1> continuation) {
        super(3, continuation);
        this.$gestureEndAction = state;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            this.$gestureEndAction.getValue().invoke(boxing.m17098c(this.F$0));
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, continuation);
        sliderKt$Slider$3$drag$1$1.F$0 = f;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(Unit.f99208a);
    }
}
