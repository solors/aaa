package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskExtensions.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.extensions.TaskExtensionsKt", m17094f = "TaskExtensions.kt", m17093l = {17, 30}, m17092m = "withRetry")
@Metadata
/* loaded from: classes7.dex */
public final class TaskExtensionsKt$withRetry$1<T> extends AbstractC37589d {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExtensionsKt$withRetry$1(Continuation<? super TaskExtensionsKt$withRetry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
    }
}
