package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt */
/* loaded from: classes7.dex */
public final class WebRequestToHttpRequest {
    @NotNull
    public static final HttpRequest toHttpRequest(@NotNull WebRequest webRequest) {
        Intrinsics.checkNotNullParameter(webRequest, "<this>");
        String url = webRequest.getUrl().toString();
        String requestType = webRequest.getRequestType();
        Intrinsics.checkNotNullExpressionValue(requestType, "requestType");
        RequestType valueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        Intrinsics.checkNotNullExpressionValue(url, "toString()");
        Intrinsics.checkNotNullExpressionValue(headers, "headers");
        return new HttpRequest(url, null, valueOf, body, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}
