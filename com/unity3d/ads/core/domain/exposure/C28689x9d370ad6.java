package com.unity3d.ads.core.domain.exposure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1", m17094f = "CommonAdViewerExposedFunctions.kt", m17093l = {289}, m17092m = "invoke")
@Metadata
/* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 */
/* loaded from: classes7.dex */
public final class C28689x9d370ad6 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28689x9d370ad6(CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, Continuation<? super C28689x9d370ad6> continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (Continuation<Object>) this);
    }
}
