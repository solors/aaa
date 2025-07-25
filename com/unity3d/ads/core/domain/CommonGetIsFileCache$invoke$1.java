package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonGetIsFileCache.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", m17094f = "CommonGetIsFileCache.kt", m17093l = {22}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetIsFileCache$invoke$1 extends AbstractC37589d {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetIsFileCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGetIsFileCache$invoke$1(CommonGetIsFileCache commonGetIsFileCache, Continuation<? super CommonGetIsFileCache$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetIsFileCache;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
