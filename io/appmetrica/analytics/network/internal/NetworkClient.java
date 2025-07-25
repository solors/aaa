package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.C35116c;
import io.appmetrica.analytics.network.impl.C35117d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class NetworkClient {

    /* renamed from: a */
    private final Integer f95824a;

    /* renamed from: b */
    private final Integer f95825b;

    /* renamed from: c */
    private final SSLSocketFactory f95826c;

    /* renamed from: d */
    private final Boolean f95827d;

    /* renamed from: e */
    private final Boolean f95828e;

    /* renamed from: f */
    private final int f95829f;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private Integer f95830a;

        /* renamed from: b */
        private Integer f95831b;

        /* renamed from: c */
        private SSLSocketFactory f95832c;

        /* renamed from: d */
        private Boolean f95833d;

        /* renamed from: e */
        private Boolean f95834e;

        /* renamed from: f */
        private Integer f95835f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f95830a, this.f95831b, this.f95832c, this.f95833d, this.f95834e, this.f95835f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i) {
            this.f95830a = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z) {
            this.f95834e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i) {
            this.f95835f = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i) {
            this.f95831b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f95832c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z) {
            this.f95833d = Boolean.valueOf(z);
            return this;
        }
    }

    /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f95824a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f95828e;
    }

    public int getMaxResponseSize() {
        return this.f95829f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f95825b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f95826c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f95827d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new C35116c(this, request, new C35117d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f95824a + ", readTimeout=" + this.f95825b + ", sslSocketFactory=" + this.f95826c + ", useCaches=" + this.f95827d + ", instanceFollowRedirects=" + this.f95828e + ", maxResponseSize=" + this.f95829f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f95824a = num;
        this.f95825b = num2;
        this.f95826c = sSLSocketFactory;
        this.f95827d = bool;
        this.f95828e = bool2;
        this.f95829f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
