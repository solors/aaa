package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateNetworkError.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", m17094f = "InitializeStateNetworkError.kt", m17093l = {33}, m17092m = "doWork-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateNetworkError$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, Continuation<? super InitializeStateNetworkError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110279doWorkgIAlus = this.this$0.m110279doWorkgIAlus((InitializeStateNetworkError.Params) null, (Continuation<? super Result<Unit>>) this);
        m6959e = C42688d.m6959e();
        if (m110279doWorkgIAlus == m6959e) {
            return m110279doWorkgIAlus;
        }
        return Result.m14550a(m110279doWorkgIAlus);
    }
}
