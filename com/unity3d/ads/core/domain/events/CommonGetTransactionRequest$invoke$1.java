package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonGetTransactionRequest.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", m17094f = "CommonGetTransactionRequest.kt", m17093l = {14}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetTransactionRequest$invoke$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetTransactionRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGetTransactionRequest$invoke$1(CommonGetTransactionRequest commonGetTransactionRequest, Continuation<? super CommonGetTransactionRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetTransactionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
