package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateConfig.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.InitializeStateConfig", m17094f = "InitializeStateConfig.kt", m17093l = {24}, m17092m = "doWork-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateConfig$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, Continuation<? super InitializeStateConfig$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110272doWorkgIAlus = this.this$0.m110272doWorkgIAlus((InitializeStateConfig.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        m6959e = C42688d.m6959e();
        if (m110272doWorkgIAlus == m6959e) {
            return m110272doWorkgIAlus;
        }
        return Result.m14550a(m110272doWorkgIAlus);
    }
}
