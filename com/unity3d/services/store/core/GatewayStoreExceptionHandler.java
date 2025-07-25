package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GatewayStoreExceptionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@NotNull StoreEvent storeEvent, int i, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(storeEvent, "storeEvent");
        Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
