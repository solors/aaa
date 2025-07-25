package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.network.client.HttpPostBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpPostRequest<T extends HttpPostBody> implements HttpRequest {
    @NotNull
    private final T body;
    private final boolean emptyUserAgent;
    private final boolean gzipEncoding;
    @NotNull
    private final Map<String, String> headers;
    private final long timeoutMillis;
    @NotNull
    private final String url;

    public HttpPostRequest(@NotNull String url, @NotNull T body, @NotNull Map<String, String> headers, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.body = body;
        this.headers = headers;
        this.gzipEncoding = z;
        this.emptyUserAgent = z2;
        this.timeoutMillis = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpPostRequest copy$default(HttpPostRequest httpPostRequest, String str, HttpPostBody httpPostBody, Map map, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpPostRequest.getUrl();
        }
        T t = httpPostBody;
        if ((i & 2) != 0) {
            t = httpPostRequest.body;
        }
        T t2 = t;
        Map<String, String> map2 = map;
        if ((i & 4) != 0) {
            map2 = httpPostRequest.getHeaders();
        }
        Map map3 = map2;
        if ((i & 8) != 0) {
            z = httpPostRequest.getGzipEncoding();
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = httpPostRequest.getEmptyUserAgent();
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            j = httpPostRequest.getTimeoutMillis();
        }
        return httpPostRequest.copy(str, t2, map3, z3, z4, j);
    }

    @NotNull
    public final String component1() {
        return getUrl();
    }

    @NotNull
    public final T component2() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> component3() {
        return getHeaders();
    }

    public final boolean component4() {
        return getGzipEncoding();
    }

    public final boolean component5() {
        return getEmptyUserAgent();
    }

    public final long component6() {
        return getTimeoutMillis();
    }

    @NotNull
    public final HttpPostRequest<T> copy(@NotNull String url, @NotNull T body, @NotNull Map<String, String> headers, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpPostRequest<>(url, body, headers, z, z2, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof HttpPostRequest) {
                HttpPostRequest httpPostRequest = (HttpPostRequest) obj;
                if (!Intrinsics.m17075f(getUrl(), httpPostRequest.getUrl()) || !Intrinsics.m17075f(this.body, httpPostRequest.body) || !Intrinsics.m17075f(getHeaders(), httpPostRequest.getHeaders()) || getGzipEncoding() != httpPostRequest.getGzipEncoding() || getEmptyUserAgent() != httpPostRequest.getEmptyUserAgent() || getTimeoutMillis() != httpPostRequest.getTimeoutMillis()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final T getBody() {
        return this.body;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2;
        String url = getUrl();
        int i3 = 0;
        if (url != null) {
            i = url.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        T t = this.body;
        if (t != null) {
            i2 = t.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Map<String, String> headers = getHeaders();
        if (headers != null) {
            i3 = headers.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        boolean gzipEncoding = getGzipEncoding();
        int i7 = 1;
        int i8 = gzipEncoding;
        if (gzipEncoding != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        boolean emptyUserAgent = getEmptyUserAgent();
        if (!emptyUserAgent) {
            i7 = emptyUserAgent ? 1 : 0;
        }
        return ((i9 + i7) * 31) + Long.hashCode(getTimeoutMillis());
    }

    @NotNull
    public String toString() {
        return "HttpPostRequest(url=" + getUrl() + ", body=" + this.body + ", headers=" + getHeaders() + ", gzipEncoding=" + getGzipEncoding() + ", emptyUserAgent=" + getEmptyUserAgent() + ", timeoutMillis=" + getTimeoutMillis() + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HttpPostRequest(java.lang.String r10, com.mobilefuse.sdk.network.client.HttpPostBody r11, java.util.Map r12, boolean r13, boolean r14, long r15, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto La
            java.util.Map r0 = kotlin.collections.C37554o0.m17366j()
            r4 = r0
            goto Lb
        La:
            r4 = r12
        Lb:
            r0 = r17 & 8
            if (r0 == 0) goto L12
            r0 = 1
            r5 = r0
            goto L13
        L12:
            r5 = r13
        L13:
            r0 = r17 & 16
            if (r0 == 0) goto L1a
            r0 = 0
            r6 = r0
            goto L1b
        L1a:
            r6 = r14
        L1b:
            r0 = r17 & 32
            if (r0 == 0) goto L23
            r0 = 10000(0x2710, double:4.9407E-320)
            r7 = r0
            goto L24
        L23:
            r7 = r15
        L24:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.network.client.HttpPostRequest.<init>(java.lang.String, com.mobilefuse.sdk.network.client.HttpPostBody, java.util.Map, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
