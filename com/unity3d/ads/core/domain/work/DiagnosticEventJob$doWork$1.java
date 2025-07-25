package com.unity3d.ads.core.domain.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DiagnosticEventJob.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", m17094f = "DiagnosticEventJob.kt", m17093l = {22, 25, 27}, m17092m = "doWork")
@Metadata
/* loaded from: classes7.dex */
public final class DiagnosticEventJob$doWork$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiagnosticEventJob this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob$doWork$1(DiagnosticEventJob diagnosticEventJob, Continuation<? super DiagnosticEventJob$doWork$1> continuation) {
        super(continuation);
        this.this$0 = diagnosticEventJob;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
