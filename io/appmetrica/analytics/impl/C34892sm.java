package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.sm */
/* loaded from: classes9.dex */
public final class C34892sm implements TempCacheStorage {

    /* renamed from: a */
    public final TempCacheStorage f95340a;

    public C34892sm(@NotNull Context context, @NotNull EnumC34311Wl enumC34311Wl, @NotNull TempCacheStorage tempCacheStorage) {
        this.f95340a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return this.f95340a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j, @NotNull byte[] bArr) {
        return this.f95340a.put(str, j, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        this.f95340a.remove(j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j) {
        this.f95340a.removeOlderThan(str, j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    public final Collection<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        return this.f95340a.get(str, i);
    }
}
