package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.request.WebRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt */
/* loaded from: classes7.dex */
public final class HttpRequestToWebRequest {
    @NotNull
    public static final WebRequest toWebRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        WebRequest webRequest = new WebRequest(httpRequest.getBaseURL(), httpRequest.getMethod().toString(), httpRequest.getHeaders(), httpRequest.getConnectTimeout(), httpRequest.getReadTimeout());
        Object body = httpRequest.getBody();
        if (body instanceof String) {
            webRequest.setBody((String) httpRequest.getBody());
        } else if (body instanceof byte[]) {
            webRequest.setBody((byte[]) httpRequest.getBody());
        }
        return webRequest;
    }
}
