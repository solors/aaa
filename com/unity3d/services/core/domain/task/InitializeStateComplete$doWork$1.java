package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateComplete;
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
/* compiled from: InitializeStateComplete.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.InitializeStateComplete", m17094f = "InitializeStateComplete.kt", m17093l = {18}, m17092m = "doWork-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateComplete$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, Continuation<? super InitializeStateComplete$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110271doWorkgIAlus = this.this$0.m110271doWorkgIAlus((InitializeStateComplete.Params) null, (Continuation<? super Result<Unit>>) this);
        m6959e = C42688d.m6959e();
        if (m110271doWorkgIAlus == m6959e) {
            return m110271doWorkgIAlus;
        }
        return Result.m14550a(m110271doWorkgIAlus);
    }
}
