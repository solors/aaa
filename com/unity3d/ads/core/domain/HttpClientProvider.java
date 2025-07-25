package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.core.HttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpClientProvider {
    @Nullable
    Object invoke(@NotNull Continuation<? super HttpClient> continuation);
}
