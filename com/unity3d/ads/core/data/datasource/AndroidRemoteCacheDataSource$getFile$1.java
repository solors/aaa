package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidRemoteCacheDataSource.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", m17094f = "AndroidRemoteCacheDataSource.kt", m17093l = {52, 60}, m17092m = "getFile")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidRemoteCacheDataSource$getFile$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$getFile$1(AndroidRemoteCacheDataSource androidRemoteCacheDataSource, Continuation<? super AndroidRemoteCacheDataSource$getFile$1> continuation) {
        super(continuation);
        this.this$0 = androidRemoteCacheDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFile(null, null, null, null, this);
    }
}
