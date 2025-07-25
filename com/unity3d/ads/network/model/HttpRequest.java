package com.unity3d.ads.network.model;

import androidx.media3.exoplayer.RendererCapabilities;
import com.unity3d.ads.network.model.HttpBody;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpRequest {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    @NotNull
    private final String baseURL;
    @NotNull
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    @NotNull
    private final Map<String, List<String>> headers;
    @NotNull
    private final RequestType method;
    @NotNull
    private final Map<String, String> parameters;
    @NotNull
    private final String path;
    @Nullable
    private final Integer port;
    private final int readTimeout;
    @NotNull
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: HttpRequest.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
        String str4;
        String str5;
        RequestType requestType2;
        HttpBody httpBody2;
        Map<String, List<String>> map3;
        Map<String, String> map4;
        String str6;
        Integer num2;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i5 & 1) != 0) {
            str4 = httpRequest.baseURL;
        } else {
            str4 = str;
        }
        if ((i5 & 2) != 0) {
            str5 = httpRequest.path;
        } else {
            str5 = str2;
        }
        if ((i5 & 4) != 0) {
            requestType2 = httpRequest.method;
        } else {
            requestType2 = requestType;
        }
        if ((i5 & 8) != 0) {
            httpBody2 = httpRequest.body;
        } else {
            httpBody2 = httpBody;
        }
        if ((i5 & 16) != 0) {
            map3 = httpRequest.headers;
        } else {
            map3 = map;
        }
        if ((i5 & 32) != 0) {
            map4 = httpRequest.parameters;
        } else {
            map4 = map2;
        }
        if ((i5 & 64) != 0) {
            str6 = httpRequest.scheme;
        } else {
            str6 = str3;
        }
        if ((i5 & 128) != 0) {
            num2 = httpRequest.port;
        } else {
            num2 = num;
        }
        if ((i5 & 256) != 0) {
            i6 = httpRequest.connectTimeout;
        } else {
            i6 = i;
        }
        if ((i5 & 512) != 0) {
            i7 = httpRequest.readTimeout;
        } else {
            i7 = i2;
        }
        if ((i5 & 1024) != 0) {
            i8 = httpRequest.writeTimeout;
        } else {
            i8 = i3;
        }
        if ((i5 & 2048) != 0) {
            i9 = httpRequest.callTimeout;
        } else {
            i9 = i4;
        }
        return httpRequest.copy(str4, str5, requestType2, httpBody2, map3, map4, str6, num2, i6, i7, i8, i9);
    }

    @NotNull
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    @NotNull
    public final String component2() {
        return this.path;
    }

    @NotNull
    public final RequestType component3() {
        return this.method;
    }

    @NotNull
    public final HttpBody component4() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @NotNull
    public final String component7() {
        return this.scheme;
    }

    @Nullable
    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    @NotNull
    public final HttpRequest copy(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (Intrinsics.m17075f(this.baseURL, httpRequest.baseURL) && Intrinsics.m17075f(this.path, httpRequest.path) && this.method == httpRequest.method && Intrinsics.m17075f(this.body, httpRequest.body) && Intrinsics.m17075f(this.headers, httpRequest.headers) && Intrinsics.m17075f(this.parameters, httpRequest.parameters) && Intrinsics.m17075f(this.scheme, httpRequest.scheme) && Intrinsics.m17075f(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getBaseURL() {
        return this.baseURL;
    }

    @NotNull
    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((((((hashCode2 + hashCode) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout);
    }

    @NotNull
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, 3968, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, 0, 0, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i, int i2) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, 0, 0, 3072, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, 0, 2048, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? RequestType.GET : requestType, (i5 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i5 & 16) != 0 ? C37559r0.m17284j() : map, (i5 & 32) != 0 ? C37559r0.m17284j() : map2, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) == 0 ? i4 : 30000);
    }
}
