package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidBuildHeaderBiddingToken.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", m17094f = "AndroidBuildHeaderBiddingToken.kt", m17093l = {34, 47, 50, 52}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidBuildHeaderBiddingToken$invoke$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidBuildHeaderBiddingToken this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBuildHeaderBiddingToken$invoke$1(AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken, Continuation<? super AndroidBuildHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidBuildHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(false, this);
    }
}
