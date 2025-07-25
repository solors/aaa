package com.mobilefuse.sdk.p543rx;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.rx.AdvertisingIdFlowKt */
/* loaded from: classes7.dex */
public final class AdvertisingIdFlow {
    @NotNull
    public static final <T> Flow<T> waitForAdvertisingId(@NotNull Flow<? extends T> waitForAdvertisingId) {
        Intrinsics.checkNotNullParameter(waitForAdvertisingId, "$this$waitForAdvertisingId");
        return FlowKt.flow(new AdvertisingIdFlowKt$waitForAdvertisingId$$inlined$transform$1(waitForAdvertisingId));
    }
}
