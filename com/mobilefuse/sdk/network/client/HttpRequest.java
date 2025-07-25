package com.mobilefuse.sdk.network.client;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpRequest {
    boolean getEmptyUserAgent();

    boolean getGzipEncoding();

    @NotNull
    Map<String, String> getHeaders();

    long getTimeoutMillis();

    @NotNull
    String getUrl();
}
