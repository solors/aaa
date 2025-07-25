package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpResponse {
    @NotNull
    private final String body;
    private final long requestTimestamp;
    private final long responseTimestamp;
    private final int statusCode;

    public HttpResponse(@NotNull String body, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
        this.statusCode = i;
        this.requestTimestamp = j;
        this.responseTimestamp = j2;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, String str, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = httpResponse.requestTimestamp;
        }
        long j3 = j;
        if ((i2 & 8) != 0) {
            j2 = httpResponse.responseTimestamp;
        }
        return httpResponse.copy(str, i3, j3, j2);
    }

    @NotNull
    public final String component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final long component3() {
        return this.requestTimestamp;
    }

    public final long component4() {
        return this.responseTimestamp;
    }

    @NotNull
    public final HttpResponse copy(@NotNull String body, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new HttpResponse(body, i, j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof HttpResponse) {
                HttpResponse httpResponse = (HttpResponse) obj;
                if (!Intrinsics.m17075f(this.body, httpResponse.body) || this.statusCode != httpResponse.statusCode || this.requestTimestamp != httpResponse.requestTimestamp || this.responseTimestamp != httpResponse.responseTimestamp) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public final long getResponseTimestamp() {
        return this.responseTimestamp;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int i;
        String str = this.body;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + Integer.hashCode(this.statusCode)) * 31) + Long.hashCode(this.requestTimestamp)) * 31) + Long.hashCode(this.responseTimestamp);
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", requestTimestamp=" + this.requestTimestamp + ", responseTimestamp=" + this.responseTimestamp + ")";
    }
}
