package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface ConnectionStatusWatcher {

    /* loaded from: classes7.dex */
    public interface Callback {
        void onConnectionStateChanged();
    }

    boolean isCallbackRegistered();

    void registerCallback(@NonNull Callback callback);

    void unregisterCallback();
}
