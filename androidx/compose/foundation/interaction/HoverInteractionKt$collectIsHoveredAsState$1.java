package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
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
/* compiled from: HoverInteraction.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", m17094f = "HoverInteraction.kt", m17093l = {69}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class HoverInteractionKt$collectIsHoveredAsState$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1(InteractionSource interactionSource, SnapshotState<Boolean> snapshotState, Continuation<? super HoverInteractionKt$collectIsHoveredAsState$1> continuation) {
        super(2, continuation);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HoverInteractionKt$collectIsHoveredAsState$1(this.$this_collectIsHoveredAsState, this.$isHovered, continuation);
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
            InterfaceC33327h<Interaction> interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final SnapshotState<Boolean> snapshotState = this.$isHovered;
            FlowCollector<Interaction> flowCollector = new FlowCollector<Interaction>() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1.1
                @Override // ge.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Interaction interaction, Continuation continuation) {
                    return emit2(interaction, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(@NotNull Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
