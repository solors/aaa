package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidGetAdPlayerContext.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", m17094f = "AndroidGetAdPlayerContext.kt", m17093l = {15}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetAdPlayerContext$invoke$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetAdPlayerContext this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetAdPlayerContext$invoke$1(AndroidGetAdPlayerContext androidGetAdPlayerContext, Continuation<? super AndroidGetAdPlayerContext$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetAdPlayerContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
