package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.RealChain;
import java.util.List;

/* renamed from: com.smaato.sdk.core.network.e */
/* loaded from: classes7.dex */
final class AutoValue_RealChain extends RealChain {

    /* renamed from: a */
    private final Call f71790a;

    /* renamed from: b */
    private final Request f71791b;

    /* renamed from: c */
    private final long f71792c;

    /* renamed from: d */
    private final long f71793d;

    /* renamed from: e */
    private final List<Interceptor> f71794e;

    /* renamed from: f */
    private final int f71795f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_RealChain.java */
    /* renamed from: com.smaato.sdk.core.network.e$b */
    /* loaded from: classes7.dex */
    public static final class C27221b extends RealChain.AbstractC27234a {

        /* renamed from: a */
        private Call f71796a;

        /* renamed from: b */
        private Request f71797b;

        /* renamed from: c */
        private Long f71798c;

        /* renamed from: d */
        private Long f71799d;

        /* renamed from: e */
        private List<Interceptor> f71800e;

        /* renamed from: f */
        private Integer f71801f;

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: a */
        RealChain mo39418a() {
            String str = "";
            if (this.f71796a == null) {
                str = " call";
            }
            if (this.f71797b == null) {
                str = str + " request";
            }
            if (this.f71798c == null) {
                str = str + " connectTimeoutMillis";
            }
            if (this.f71799d == null) {
                str = str + " readTimeoutMillis";
            }
            if (this.f71800e == null) {
                str = str + " interceptors";
            }
            if (this.f71801f == null) {
                str = str + " index";
            }
            if (str.isEmpty()) {
                return new AutoValue_RealChain(this.f71796a, this.f71797b, this.f71798c.longValue(), this.f71799d.longValue(), this.f71800e, this.f71801f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: b */
        RealChain.AbstractC27234a mo39417b(Call call) {
            if (call != null) {
                this.f71796a = call;
                return this;
            }
            throw new NullPointerException("Null call");
        }

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: c */
        RealChain.AbstractC27234a mo39416c(long j) {
            this.f71798c = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: d */
        public RealChain.AbstractC27234a mo39415d(int i) {
            this.f71801f = Integer.valueOf(i);
            return this;
        }

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: e */
        RealChain.AbstractC27234a mo39414e(List<Interceptor> list) {
            if (list != null) {
                this.f71800e = list;
                return this;
            }
            throw new NullPointerException("Null interceptors");
        }

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: f */
        RealChain.AbstractC27234a mo39413f(long j) {
            this.f71799d = Long.valueOf(j);
            return this;
        }

        @Override // com.smaato.sdk.core.network.RealChain.AbstractC27234a
        /* renamed from: g */
        RealChain.AbstractC27234a mo39412g(Request request) {
            if (request != null) {
                this.f71797b = request;
                return this;
            }
            throw new NullPointerException("Null request");
        }
    }

    @Override // com.smaato.sdk.core.network.RealChain
    /* renamed from: b */
    int mo39420b() {
        return this.f71795f;
    }

    @Override // com.smaato.sdk.core.network.RealChain
    @NonNull
    /* renamed from: c */
    List<Interceptor> mo39419c() {
        return this.f71794e;
    }

    @Override // com.smaato.sdk.core.network.Interceptor.Chain
    @NonNull
    public Call call() {
        return this.f71790a;
    }

    @Override // com.smaato.sdk.core.network.Interceptor.Chain
    public long connectTimeoutMillis() {
        return this.f71792c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealChain)) {
            return false;
        }
        RealChain realChain = (RealChain) obj;
        if (this.f71790a.equals(realChain.call()) && this.f71791b.equals(realChain.request()) && this.f71792c == realChain.connectTimeoutMillis() && this.f71793d == realChain.readTimeoutMillis() && this.f71794e.equals(realChain.mo39419c()) && this.f71795f == realChain.mo39420b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f71792c;
        long j2 = this.f71793d;
        return ((((((((((this.f71790a.hashCode() ^ 1000003) * 1000003) ^ this.f71791b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f71794e.hashCode()) * 1000003) ^ this.f71795f;
    }

    @Override // com.smaato.sdk.core.network.Interceptor.Chain
    public long readTimeoutMillis() {
        return this.f71793d;
    }

    @Override // com.smaato.sdk.core.network.Interceptor.Chain
    @NonNull
    public Request request() {
        return this.f71791b;
    }

    public String toString() {
        return "RealChain{call=" + this.f71790a + ", request=" + this.f71791b + ", connectTimeoutMillis=" + this.f71792c + ", readTimeoutMillis=" + this.f71793d + ", interceptors=" + this.f71794e + ", index=" + this.f71795f + "}";
    }

    private AutoValue_RealChain(Call call, Request request, long j, long j2, List<Interceptor> list, int i) {
        this.f71790a = call;
        this.f71791b = request;
        this.f71792c = j;
        this.f71793d = j2;
        this.f71794e = list;
        this.f71795f = i;
    }
}
