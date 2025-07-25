package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.Invocation;
import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", m17094f = "HandleInvocationsFromAdViewer.kt", m17093l = {161}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class HandleInvocationsFromAdViewer$invoke$2 extends AbstractC37596l implements Function2<FlowCollector<? super Invocation>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onSubscription;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandleInvocationsFromAdViewer$invoke$2(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super HandleInvocationsFromAdViewer$invoke$2> continuation) {
        super(2, continuation);
        this.$onSubscription = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HandleInvocationsFromAdViewer$invoke$2(this.$onSubscription, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull FlowCollector<? super Invocation> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((HandleInvocationsFromAdViewer$invoke$2) create(flowCollector, continuation)).invokeSuspend(Unit.f99208a);
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
            Function1<Continuation<? super Unit>, Object> function1 = this.$onSubscription;
            this.label = 1;
            if (function1.invoke(this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }
}
