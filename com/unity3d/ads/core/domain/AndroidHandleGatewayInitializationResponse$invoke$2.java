package com.unity3d.ads.core.domain;

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

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2", m17094f = "AndroidHandleGatewayInitializationResponse.kt", m17093l = {36}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class AndroidHandleGatewayInitializationResponse$invoke$2 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AndroidHandleGatewayInitializationResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayInitializationResponse$invoke$2(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse, Continuation<? super AndroidHandleGatewayInitializationResponse$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidHandleGatewayInitializationResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AndroidHandleGatewayInitializationResponse$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;
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
            triggerInitializationCompletedRequest = this.this$0.triggerInitializationCompletedRequest;
            this.label = 1;
            if (triggerInitializationCompletedRequest.invoke(this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AndroidHandleGatewayInitializationResponse$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
