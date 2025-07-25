package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: StoreExceptionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public interface StoreExceptionHandler {
    void handleStoreException(@NotNull StoreEvent storeEvent, int i, @NotNull Exception exc);
}
