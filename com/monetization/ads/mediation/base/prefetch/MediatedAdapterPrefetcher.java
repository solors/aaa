package com.monetization.ads.mediation.base.prefetch;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedAdapterPrefetcher {
    void onInvalidate();

    void prefetchAd(@NotNull Context context, @NotNull Map<String, String> map, @NotNull MediatedAdapterPrefetchListener mediatedAdapterPrefetchListener);
}
