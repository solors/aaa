package com.unity3d.ads.core.domain.exposure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1", m17094f = "CommonAdViewerExposedFunctions.kt", m17093l = {222}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$getPrivacy$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(CommonAdViewerExposedFunctionsKt$getPrivacy$1 commonAdViewerExposedFunctionsKt$getPrivacy$1, Continuation<? super CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$getPrivacy$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (Continuation<Object>) this);
    }
}
