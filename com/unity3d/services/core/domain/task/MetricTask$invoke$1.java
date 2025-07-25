package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MetricTask.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.MetricTask", m17094f = "MetricTask.kt", m17093l = {24}, m17092m = "invoke-gIAlu-s$suspendImpl")
@Metadata
/* loaded from: classes7.dex */
public final class MetricTask$invoke$1 extends AbstractC37589d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, Continuation<? super MetricTask$invoke$1> continuation) {
        super(continuation);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110282invokegIAlus$suspendImpl = MetricTask.m110282invokegIAlus$suspendImpl(this.this$0, null, this);
        m6959e = C42688d.m6959e();
        if (m110282invokegIAlus$suspendImpl == m6959e) {
            return m110282invokegIAlus$suspendImpl;
        }
        return Result.m14550a(m110282invokegIAlus$suspendImpl);
    }
}
