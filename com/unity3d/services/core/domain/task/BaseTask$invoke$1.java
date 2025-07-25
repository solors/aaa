package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTask.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", m17094f = "BaseTask.kt", m17093l = {11}, m17092m = "invoke-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseTask$invoke$1(Continuation<? super BaseTask$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110266invokegIAlus = BaseTask.DefaultImpls.m110266invokegIAlus(null, null, this);
        m6959e = C42688d.m6959e();
        if (m110266invokegIAlus == m6959e) {
            return m110266invokegIAlus;
        }
        return Result.m14550a(m110266invokegIAlus);
    }
}
