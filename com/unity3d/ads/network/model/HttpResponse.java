package com.unity3d.ads.network.model;

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
    private final Map<String, Object> headers;
    private final int statusCode;
    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body) {
        this(body, 0, null, null, 14, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    @NotNull
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.headers;
    }

    @NotNull
    public final String component4() {
        return this.urlString;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int i, @NotNull Map<String, ? extends Object> headers, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return new HttpResponse(body, i, headers, urlString);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (Intrinsics.m17075f(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && Intrinsics.m17075f(this.headers, httpResponse.headers) && Intrinsics.m17075f(this.urlString, httpResponse.urlString)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i) {
        this(body, i, null, null, 12, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends Object> headers) {
        this(body, i, headers, null, 8, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    public HttpResponse(@NotNull Object body, int i, @NotNull Map<String, ? extends Object> headers, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? C37559r0.m17284j() : map, (i2 & 8) != 0 ? "" : str);
    }
}
