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
/* compiled from: InitializeStateReset.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.InitializeStateReset", m17094f = "InitializeStateReset.kt", m17093l = {33}, m17092m = "doWork-gIAlu-s$suspendImpl")
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateReset$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, Continuation<? super InitializeStateReset$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110280doWorkgIAlus$suspendImpl = InitializeStateReset.m110280doWorkgIAlus$suspendImpl(this.this$0, null, this);
        m6959e = C42688d.m6959e();
        if (m110280doWorkgIAlus$suspendImpl == m6959e) {
            return m110280doWorkgIAlus$suspendImpl;
        }
        return Result.m14550a(m110280doWorkgIAlus$suspendImpl);
    }
}
