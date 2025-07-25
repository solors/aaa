package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", m17094f = "AndroidGetUniversalRequestSharedData.kt", m17093l = {24}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetUniversalRequestSharedData$invoke$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetUniversalRequestSharedData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetUniversalRequestSharedData$invoke$1(AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData, Continuation<? super AndroidGetUniversalRequestSharedData$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetUniversalRequestSharedData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
