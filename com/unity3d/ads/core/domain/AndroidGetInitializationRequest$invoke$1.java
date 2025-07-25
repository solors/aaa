package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidGetInitializationRequest.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequest", m17094f = "AndroidGetInitializationRequest.kt", m17093l = {11, 15}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetInitializationRequest$invoke$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetInitializationRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetInitializationRequest$invoke$1(AndroidGetInitializationRequest androidGetInitializationRequest, Continuation<? super AndroidGetInitializationRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetInitializationRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
