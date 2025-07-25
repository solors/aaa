package io.appmetrica.analytics.modulesapi.internal.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface NetworkClientWithCacheControl {
    @Nullable
    String getETag();

    void onError();

    void onNotModified();

    void onResponse(@NotNull String str, @NotNull byte[] bArr);
}
