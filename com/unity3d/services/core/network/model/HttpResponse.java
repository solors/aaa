package com.unity3d.services.core.network.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpResponse {
    @NotNull
    private final Object body;
    @NotNull
    private final String client;
    private final long contentSize;
    @NotNull
    private final Map<String, List<String>> headers;
    @NotNull
    private final String protocol;
    private final int statusCode;
    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, Object obj2) {
        Object obj3;
        int i3;
        Map<String, List<String>> map2;
        String str4;
        String str5;
        String str6;
        long j2;
        if ((i2 & 1) != 0) {
            obj3 = httpResponse.body;
        } else {
            obj3 = obj;
        }
        if ((i2 & 2) != 0) {
            i3 = httpResponse.statusCode;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            map2 = httpResponse.headers;
        } else {
            map2 = map;
        }
        if ((i2 & 8) != 0) {
            str4 = httpResponse.urlString;
        } else {
            str4 = str;
        }
        if ((i2 & 16) != 0) {
            str5 = httpResponse.protocol;
        } else {
            str5 = str2;
        }
        if ((i2 & 32) != 0) {
            str6 = httpResponse.client;
        } else {
            str6 = str3;
        }
        if ((i2 & 64) != 0) {
            j2 = httpResponse.contentSize;
        } else {
            j2 = j;
        }
        return httpResponse.copy(obj3, i3, map2, str4, str5, str6, j2);
    }

    @NotNull
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    @NotNull
    public final String component4() {
        return this.urlString;
    }

    @NotNull
    public final String component5() {
        return this.protocol;
    }

    @NotNull
    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long j) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
        return new HttpResponse(body, i, headers, urlString, protocol, client, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (Intrinsics.m17075f(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && Intrinsics.m17075f(this.headers, httpResponse.headers) && Intrinsics.m17075f(this.urlString, httpResponse.urlString) && Intrinsics.m17075f(this.protocol, httpResponse.protocol) && Intrinsics.m17075f(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + Long.hashCode(this.contentSize);
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i) {
        this(body, i, null, null, null, null, 0L, 124, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers) {
        this(body, i, headers, null, null, null, 0L, 120, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString) {
        this(body, i, headers, urlString, null, null, 0L, 112, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol) {
        this(body, i, headers, urlString, protocol, null, 0L, 96, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client) {
        this(body, i, headers, urlString, protocol, client, 0L, 64, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long j) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? C37559r0.m17284j() : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }
}
