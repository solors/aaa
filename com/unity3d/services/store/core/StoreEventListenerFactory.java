package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StoreEventListenerFactory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class StoreEventListenerFactory {
    @NotNull
    private final StoreWebViewEventSender storeWebViewEventSender;

    public StoreEventListenerFactory(@NotNull StoreWebViewEventSender storeWebViewEventSender) {
        Intrinsics.checkNotNullParameter(storeWebViewEventSender, "storeWebViewEventSender");
        this.storeWebViewEventSender = storeWebViewEventSender;
    }

    public static /* synthetic */ StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return storeEventListenerFactory.invoke(i, z);
    }

    @NotNull
    public final StoreEventListener invoke() {
        return invoke$default(this, 0, false, 3, null);
    }

    @NotNull
    public final StoreEventListener invoke(int i) {
        return invoke$default(this, i, false, 2, null);
    }

    @NotNull
    public final StoreEventListener invoke(int i, boolean z) {
        return new WebViewStoreEventListener(i, this.storeWebViewEventSender, z);
    }
}
