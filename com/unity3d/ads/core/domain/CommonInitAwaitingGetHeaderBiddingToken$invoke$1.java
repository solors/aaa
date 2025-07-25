package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", m17094f = "CommonInitAwaitingGetHeaderBiddingToken.kt", m17093l = {52, 64}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken$invoke$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInitAwaitingGetHeaderBiddingToken$invoke$1(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, Continuation<? super CommonInitAwaitingGetHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
