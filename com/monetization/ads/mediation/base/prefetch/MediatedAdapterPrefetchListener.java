package com.monetization.ads.mediation.base.prefetch;

import androidx.annotation.MainThread;
import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedAdapterPrefetchListener {
    @MainThread
    void onPrefetchFailed(@Nullable Integer num, @Nullable String str);

    @MainThread
    void onPrefetched(@NotNull MediatedPrefetchAdapterData mediatedPrefetchAdapterData);
}
