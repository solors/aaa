package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonCacheFile.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.CommonCacheFile", m17094f = "CommonCacheFile.kt", m17093l = {27}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class CommonCacheFile$invoke$1 extends AbstractC37589d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonCacheFile this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCacheFile$invoke$1(CommonCacheFile commonCacheFile, Continuation<? super CommonCacheFile$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonCacheFile;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, 0, this);
    }
}
