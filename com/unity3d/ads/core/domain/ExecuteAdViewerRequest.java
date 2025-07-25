package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExecuteAdViewerRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface ExecuteAdViewerRequest {
    @Nullable
    Object invoke(@NotNull RequestType requestType, @NotNull Object[] objArr, @NotNull Continuation<? super HttpResponse> continuation);
}
