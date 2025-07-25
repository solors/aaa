package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Invocation.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.adplayer.Invocation$handle$2", m17094f = "Invocation.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class Invocation$handle$2 extends AbstractC37596l implements Function1<Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Invocation$handle$2(Continuation<? super Invocation$handle$2> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new Invocation$handle$2(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((Invocation$handle$2) create(continuation)).invokeSuspend(Unit.f99208a);
    }
}
