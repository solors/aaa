package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.network.Call;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class HttpClient implements Call.Factory {

    /* loaded from: classes7.dex */
    public static class Builder {
        private long connectTimeout;
        private ExecutorService executor;
        private final ArrayList<Interceptor> interceptors;
        private long readTimeout;

        Builder(List<Interceptor> list) {
            ArrayList<Interceptor> arrayList = new ArrayList<>();
            this.interceptors = arrayList;
            arrayList.addAll(list);
        }

        public Builder addAsFirstInterceptor(@NonNull Interceptor interceptor) {
            this.interceptors.add(0, interceptor);
            return this;
        }

        public Builder addInterceptor(@NonNull Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public HttpClient build() {
            return new AutoValue_HttpClient(this.executor, Collections.unmodifiableList(this.interceptors), this.connectTimeout, this.readTimeout);
        }

        public Builder connectTimeout(long j, @NonNull TimeUnit timeUnit) {
            this.connectTimeout = timeUnit.toMillis(j);
            return this;
        }

        public Builder executor(@NonNull ExecutorService executorService) {
            this.executor = executorService;
            return this;
        }

        public Builder readTimeout(long j, @NonNull TimeUnit timeUnit) {
            this.readTimeout = timeUnit.toMillis(j);
            return this;
        }
    }

    @NonNull
    public static Builder builder() {
        Builder executor = new Builder(Collections.emptyList()).executor(Executors.newFixedThreadPool(10));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return executor.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit);
    }

    @NonNull
    public Builder buildUpon() {
        Builder executor = new Builder(interceptors()).executor(executor());
        long connectTimeoutMillis = connectTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return executor.connectTimeout(connectTimeoutMillis, timeUnit).readTimeout(connectTimeoutMillis(), timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long connectTimeoutMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract ExecutorService executor();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract List<Interceptor> interceptors();

    @Override // com.smaato.sdk.core.network.Call.Factory
    @NonNull
    public Call newCall(@NonNull Request request) {
        return new RealCall(this, request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long readTimeoutMillis();
}
