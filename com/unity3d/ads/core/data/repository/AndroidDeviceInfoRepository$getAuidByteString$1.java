package com.unity3d.ads.core.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDeviceInfoRepository.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository", m17094f = "AndroidDeviceInfoRepository.kt", m17093l = {38}, m17092m = "getAuidByteString")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidDeviceInfoRepository$getAuidByteString$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidDeviceInfoRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeviceInfoRepository$getAuidByteString$1(AndroidDeviceInfoRepository androidDeviceInfoRepository, Continuation<? super AndroidDeviceInfoRepository$getAuidByteString$1> continuation) {
        super(continuation);
        this.this$0 = androidDeviceInfoRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAuidByteString(this);
    }
}
