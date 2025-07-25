package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import ge.FlowCollector;
import ge.InterfaceC33327h;
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

/* compiled from: Ripple.kt */
@DebugMetadata(m17095c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", m17094f = "Ripple.kt", m17093l = {356}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, Continuation<? super Ripple$rememberUpdatedInstance$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, continuation);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
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
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC33327h<Interaction> interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            FlowCollector<Interaction> flowCollector = new FlowCollector<Interaction>() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$invokeSuspend$$inlined$collect$1
                @Override // ge.FlowCollector
                @Nullable
                public Object emit(Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    Interaction interaction2 = interaction;
                    if (interaction2 instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction2, coroutineScope);
                    } else if (interaction2 instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction2).getPress());
                    } else if (interaction2 instanceof PressInteraction.Cancel) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Cancel) interaction2).getPress());
                    } else {
                        RippleIndicationInstance.this.updateStateLayer$material_ripple_release(interaction2, coroutineScope);
                    }
                    return Unit.f99208a;
                }
            };
            this.label = 1;
            if (interactions.collect(flowCollector, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((Ripple$rememberUpdatedInstance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
