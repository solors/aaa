package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.w3 */
/* loaded from: classes9.dex */
public final class C34977w3 implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a */
    public final NetworkClientWithCacheControl f95538a;

    public C34977w3(@NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f95538a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    @Nullable
    public final String getOldETag() {
        return this.f95538a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f95538a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f95538a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(@NotNull String str, @NotNull byte[] bArr) {
        this.f95538a.onResponse(str, bArr);
    }
}
