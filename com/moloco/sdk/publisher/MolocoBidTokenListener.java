package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface MolocoBidTokenListener {
    void onBidTokenResult(@NotNull String str, @Nullable MolocoAdError.ErrorType errorType);
}
