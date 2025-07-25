package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: Slider.kt */
@DebugMetadata(m17095c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", m17094f = "Slider.kt", m17093l = {IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class RangeSliderLogic$captureThumb$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $draggingStart;
    final /* synthetic */ Interaction $interaction;
    int label;
    final /* synthetic */ RangeSliderLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z, Interaction interaction, Continuation<? super RangeSliderLogic$captureThumb$1> continuation) {
        super(2, continuation);
        this.this$0 = rangeSliderLogic;
        this.$draggingStart = z;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RangeSliderLogic$captureThumb$1(this.this$0, this.$draggingStart, this.$interaction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            MutableInteractionSource activeInteraction = this.this$0.activeInteraction(this.$draggingStart);
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (activeInteraction.emit(interaction, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RangeSliderLogic$captureThumb$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
