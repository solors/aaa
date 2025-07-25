package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.SnapshotState;
import ge.FlowCollector;
import ge.InterfaceC33327h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PressInteraction.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", m17094f = "PressInteraction.kt", m17093l = {85}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class PressInteractionKt$collectIsPressedAsState$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isPressed;
    final /* synthetic */ InteractionSource $this_collectIsPressedAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1(InteractionSource interactionSource, SnapshotState<Boolean> snapshotState, Continuation<? super PressInteractionKt$collectIsPressedAsState$1> continuation) {
        super(2, continuation);
        this.$this_collectIsPressedAsState = interactionSource;
        this.$isPressed = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PressInteractionKt$collectIsPressedAsState$1(this.$this_collectIsPressedAsState, this.$isPressed, continuation);
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
            final ArrayList arrayList = new ArrayList();
            InterfaceC33327h<Interaction> interactions = this.$this_collectIsPressedAsState.getInteractions();
            final SnapshotState<Boolean> snapshotState = this.$isPressed;
            FlowCollector<Interaction> flowCollector = new FlowCollector<Interaction>() { // from class: androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1.1
                @Override // ge.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Interaction interaction, Continuation continuation) {
                    return emit2(interaction, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(@NotNull Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    snapshotState.setValue(boxing.m17100a(!arrayList.isEmpty()));
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
        return ((PressInteractionKt$collectIsPressedAsState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
