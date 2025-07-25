package com.smaato.sdk.core.mvvm.view;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class ViewDelegateStorage {
    private final Map<UUID, SmaatoSdkViewDelegate> storage = new ConcurrentHashMap();

    public void add(UUID uuid, SmaatoSdkViewDelegate smaatoSdkViewDelegate) {
        this.storage.put(uuid, smaatoSdkViewDelegate);
    }

    @Nullable
    public SmaatoSdkViewDelegate get(UUID uuid) {
        return this.storage.get(uuid);
    }

    public void remove(UUID uuid) {
        this.storage.remove(uuid);
    }
}
