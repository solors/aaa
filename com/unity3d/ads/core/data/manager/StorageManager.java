package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: StorageManager.kt */
@Metadata
/* loaded from: classes7.dex */
public interface StorageManager {
    void addStorageLocation(@NotNull StorageManager.StorageType storageType, @NotNull String str);

    @NotNull
    Storage getStorage(@NotNull StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(@NotNull StorageManager.StorageType storageType);

    boolean init(@NotNull Context context);

    void initStorage(@NotNull StorageManager.StorageType storageType);

    void removeStorage(@NotNull StorageManager.StorageType storageType);
}
