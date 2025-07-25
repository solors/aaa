package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidGetAdDataRefreshRequest.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest", m17094f = "AndroidGetAdDataRefreshRequest.kt", m17093l = {25, 34}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetAdDataRefreshRequest$invoke$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetAdDataRefreshRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetAdDataRefreshRequest$invoke$1(AndroidGetAdDataRefreshRequest androidGetAdDataRefreshRequest, Continuation<? super AndroidGetAdDataRefreshRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetAdDataRefreshRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
