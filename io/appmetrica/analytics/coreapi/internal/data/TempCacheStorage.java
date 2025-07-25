package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface TempCacheStorage {

    @Metadata
    /* loaded from: classes9.dex */
    public interface Entry {
        @NotNull
        byte[] getData();

        long getId();

        @NotNull
        String getScope();

        long getTimestamp();
    }

    @Nullable
    Entry get(@NotNull String str);

    @NotNull
    Collection<Entry> get(@NotNull String str, int i);

    long put(@NotNull String str, long j, @NotNull byte[] bArr);

    void remove(long j);

    void removeOlderThan(@NotNull String str, long j);
}
