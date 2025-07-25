package com.unity3d.ads.core.domain.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UniversalRequestJob.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", m17094f = "UniversalRequestJob.kt", m17093l = {25, 28, 31}, m17092m = "doWork$suspendImpl")
@Metadata
/* loaded from: classes7.dex */
public final class UniversalRequestJob$doWork$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestJob this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob$doWork$1(UniversalRequestJob universalRequestJob, Continuation<? super UniversalRequestJob$doWork$1> continuation) {
        super(continuation);
        this.this$0 = universalRequestJob;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UniversalRequestJob.doWork$suspendImpl(this.this$0, this);
    }
}
