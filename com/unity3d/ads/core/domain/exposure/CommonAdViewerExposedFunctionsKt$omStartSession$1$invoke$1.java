package com.unity3d.ads.core.domain.exposure;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1", m17094f = "CommonAdViewerExposedFunctions.kt", m17093l = {340}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$omStartSession$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(CommonAdViewerExposedFunctionsKt$omStartSession$1 commonAdViewerExposedFunctionsKt$omStartSession$1, Continuation<? super CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$omStartSession$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (Continuation<? super Unit>) this);
    }
}
