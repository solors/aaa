package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFileFromLocalStorage.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", m17094f = "ConfigFileFromLocalStorage.kt", m17093l = {27}, m17092m = "doWork-gIAlu-s")
@Metadata
/* loaded from: classes7.dex */
public final class ConfigFileFromLocalStorage$doWork$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, Continuation<? super ConfigFileFromLocalStorage$doWork$1> continuation) {
        super(continuation);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m110267doWorkgIAlus = this.this$0.m110267doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        m6959e = C42688d.m6959e();
        if (m110267doWorkgIAlus == m6959e) {
            return m110267doWorkgIAlus;
        }
        return Result.m14550a(m110267doWorkgIAlus);
    }
}
