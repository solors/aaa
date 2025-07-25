package com.mobilefuse.sdk.assetsmanager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AssetManager.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AssetManager {
    @NotNull
    String getSpecificAssetAbsolutePath(@NotNull String str);

    @Nullable
    byte[] getSpecificAssetBytes(@NotNull String str);

    void requestAssetsManifest();
}
