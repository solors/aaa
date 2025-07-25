package com.unity3d.ads.core.domain;

import com.unity3d.services.core.properties.SdkProperties;
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

/* compiled from: TriggerInitializeListener.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", m17094f = "TriggerInitializeListener.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class TriggerInitializeListener$success$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TriggerInitializeListener$success$1(Continuation<? super TriggerInitializeListener$success$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TriggerInitializeListener$success$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            SdkProperties.notifyInitializationComplete();
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TriggerInitializeListener$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
