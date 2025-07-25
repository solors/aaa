package com.mobilefuse.sdk.network.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpGetRequest implements HttpRequest {
    private final boolean emptyUserAgent;
    private final boolean gzipEncoding;
    @NotNull
    private final Map<String, String> headers;
    private final long timeoutMillis;
    @NotNull
    private final String url;

    public HttpGetRequest(@NotNull String url, @NotNull Map<String, String> headers, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.headers = headers;
        this.gzipEncoding = z;
        this.emptyUserAgent = z2;
        this.timeoutMillis = j;
    }

    public static /* synthetic */ HttpGetRequest copy$default(HttpGetRequest httpGetRequest, String str, Map map, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpGetRequest.getUrl();
        }
        Map<String, String> map2 = map;
        if ((i & 2) != 0) {
            map2 = httpGetRequest.getHeaders();
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            z = httpGetRequest.getGzipEncoding();
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = httpGetRequest.getEmptyUserAgent();
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            j = httpGetRequest.getTimeoutMillis();
        }
        return httpGetRequest.copy(str, map3, z3, z4, j);
    }

    @NotNull
    public final String component1() {
        return getUrl();
    }

    @NotNull
    public final Map<String, String> component2() {
        return getHeaders();
    }

    public final boolean component3() {
        return getGzipEncoding();
    }

    public final boolean component4() {
        return getEmptyUserAgent();
    }

    public final long component5() {
        return getTimeoutMillis();
    }

    @NotNull
    public final HttpGetRequest copy(@NotNull String url, @NotNull Map<String, String> headers, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpGetRequest(url, headers, z, z2, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof HttpGetRequest) {
                HttpGetRequest httpGetRequest = (HttpGetRequest) obj;
                if (!Intrinsics.m17075f(getUrl(), httpGetRequest.getUrl()) || !Intrinsics.m17075f(getHeaders(), httpGetRequest.getHeaders()) || getGzipEncoding() != httpGetRequest.getGzipEncoding() || getEmptyUserAgent() != httpGetRequest.getEmptyUserAgent() || getTimeoutMillis() != httpGetRequest.getTimeoutMillis()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public boolean getEmptyUserAgent() {
        return this.emptyUserAgent;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public boolean getGzipEncoding() {
        return this.gzipEncoding;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    @NotNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        String url = getUrl();
        int i2 = 0;
        if (url != null) {
            i = url.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Map<String, String> headers = getHeaders();
        if (headers != null) {
            i2 = headers.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean gzipEncoding = getGzipEncoding();
        int i5 = 1;
        int i6 = gzipEncoding;
        if (gzipEncoding) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean emptyUserAgent = getEmptyUserAgent();
        if (!emptyUserAgent) {
            i5 = emptyUserAgent;
        }
        return ((i7 + i5) * 31) + Long.hashCode(getTimeoutMillis());
    }

    @NotNull
    public String toString() {
        return "HttpGetRequest(url=" + getUrl() + ", headers=" + getHeaders() + ", gzipEncoding=" + getGzipEncoding() + ", emptyUserAgent=" + getEmptyUserAgent() + ", timeoutMillis=" + getTimeoutMillis() + ")";
    }

    public /* synthetic */ HttpGetRequest(String str, Map map, boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C37559r0.m17284j() : map, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? 10000L : j);
    }
}
