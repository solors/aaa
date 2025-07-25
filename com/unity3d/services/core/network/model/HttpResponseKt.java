package com.unity3d.services.core.network.model;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(@NotNull HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        if (200 > statusCode || statusCode >= 300) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final HttpResponse toHttpResponse(@NotNull UnityAdsNetworkException unityAdsNetworkException) {
        int i;
        Map m17284j;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        if (code != null) {
            i = code.intValue();
        } else {
            i = IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        }
        int i2 = i;
        m17284j = C37559r0.m17284j();
        String url = unityAdsNetworkException.getUrl();
        if (url == null) {
            str = "";
        } else {
            str = url;
        }
        String protocol = unityAdsNetworkException.getProtocol();
        if (protocol == null) {
            str2 = "";
        } else {
            str2 = protocol;
        }
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", i2, m17284j, str, str2, client, 0L, 64, null);
    }
}
