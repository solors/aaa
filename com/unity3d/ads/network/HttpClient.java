package com.unity3d.ads.network;

import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpClient {
    @Nullable
    Object execute(@NotNull HttpRequest httpRequest, @NotNull Continuation<? super HttpResponse> continuation);
}
