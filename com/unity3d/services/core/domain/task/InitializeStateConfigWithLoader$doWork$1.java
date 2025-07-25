package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateConfigWithLoader.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", m17094f = "InitializeStateConfigWithLoader.kt", m17093l = {33}, m17092m = "doWork-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateConfigWithLoader$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, Continuation<? super InitializeStateConfigWithLoader$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo110264doWorkgIAlus = this.this$0.mo110264doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        m6959e = C42688d.m6959e();
        if (mo110264doWorkgIAlus == m6959e) {
            return mo110264doWorkgIAlus;
        }
        return Result.m14550a(mo110264doWorkgIAlus);
    }
}
