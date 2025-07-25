package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.smaato.sdk.core.network.c */
/* loaded from: classes7.dex */
final class AutoValue_HttpClient extends HttpClient {

    /* renamed from: a */
    private final ExecutorService f71782a;

    /* renamed from: b */
    private final List<Interceptor> f71783b;

    /* renamed from: c */
    private final long f71784c;

    /* renamed from: d */
    private final long f71785d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_HttpClient(ExecutorService executorService, List<Interceptor> list, long j, long j2) {
        if (executorService != null) {
            this.f71782a = executorService;
            if (list != null) {
                this.f71783b = list;
                this.f71784c = j;
                this.f71785d = j2;
                return;
            }
            throw new NullPointerException("Null interceptors");
        }
        throw new NullPointerException("Null executor");
    }

    @Override // com.smaato.sdk.core.network.HttpClient
    long connectTimeoutMillis() {
        return this.f71784c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpClient)) {
            return false;
        }
        HttpClient httpClient = (HttpClient) obj;
        if (this.f71782a.equals(httpClient.executor()) && this.f71783b.equals(httpClient.interceptors()) && this.f71784c == httpClient.connectTimeoutMillis() && this.f71785d == httpClient.readTimeoutMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.network.HttpClient
    @NonNull
    ExecutorService executor() {
        return this.f71782a;
    }

    public int hashCode() {
        long j = this.f71784c;
        long j2 = this.f71785d;
        return ((((((this.f71782a.hashCode() ^ 1000003) * 1000003) ^ this.f71783b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.smaato.sdk.core.network.HttpClient
    @NonNull
    List<Interceptor> interceptors() {
        return this.f71783b;
    }

    @Override // com.smaato.sdk.core.network.HttpClient
    long readTimeoutMillis() {
        return this.f71785d;
    }

    public String toString() {
        return "HttpClient{executor=" + this.f71782a + ", interceptors=" + this.f71783b + ", connectTimeoutMillis=" + this.f71784c + ", readTimeoutMillis=" + this.f71785d + "}";
    }
}
