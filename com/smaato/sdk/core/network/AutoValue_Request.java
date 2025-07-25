package com.smaato.sdk.core.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.network.Request;

/* renamed from: com.smaato.sdk.core.network.f */
/* loaded from: classes7.dex */
final class AutoValue_Request extends Request {

    /* renamed from: a */
    private final Uri f71802a;

    /* renamed from: b */
    private final String f71803b;

    /* renamed from: c */
    private final Headers f71804c;

    /* renamed from: d */
    private final Request.Body f71805d;

    /* renamed from: e */
    private final boolean f71806e;

    /* compiled from: AutoValue_Request.java */
    /* renamed from: com.smaato.sdk.core.network.f$b */
    /* loaded from: classes7.dex */
    static final class C27223b extends Request.Builder {

        /* renamed from: a */
        private Uri f71807a;

        /* renamed from: b */
        private String f71808b;

        /* renamed from: c */
        private Headers f71809c;

        /* renamed from: d */
        private Request.Body f71810d;

        /* renamed from: e */
        private Boolean f71811e;

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request.Builder body(Request.Body body) {
            this.f71810d = body;
            return this;
        }

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request build() {
            String str = "";
            if (this.f71807a == null) {
                str = " uri";
            }
            if (this.f71808b == null) {
                str = str + " method";
            }
            if (this.f71809c == null) {
                str = str + " headers";
            }
            if (this.f71811e == null) {
                str = str + " followRedirects";
            }
            if (str.isEmpty()) {
                return new AutoValue_Request(this.f71807a, this.f71808b, this.f71809c, this.f71810d, this.f71811e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request.Builder followRedirects(boolean z) {
            this.f71811e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request.Builder headers(Headers headers) {
            if (headers != null) {
                this.f71809c = headers;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request.Builder method(String str) {
            if (str != null) {
                this.f71808b = str;
                return this;
            }
            throw new NullPointerException("Null method");
        }

        @Override // com.smaato.sdk.core.network.Request.Builder
        public Request.Builder uri(Uri uri) {
            if (uri != null) {
                this.f71807a = uri;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    @Override // com.smaato.sdk.core.network.Request
    @Nullable
    public Request.Body body() {
        return this.f71805d;
    }

    public boolean equals(Object obj) {
        Request.Body body;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        if (this.f71802a.equals(request.uri()) && this.f71803b.equals(request.method()) && this.f71804c.equals(request.headers()) && ((body = this.f71805d) != null ? body.equals(request.body()) : request.body() == null) && this.f71806e == request.followRedirects()) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.network.Request
    boolean followRedirects() {
        return this.f71806e;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((this.f71802a.hashCode() ^ 1000003) * 1000003) ^ this.f71803b.hashCode()) * 1000003) ^ this.f71804c.hashCode()) * 1000003;
        Request.Body body = this.f71805d;
        if (body == null) {
            hashCode = 0;
        } else {
            hashCode = body.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        if (this.f71806e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 ^ i;
    }

    @Override // com.smaato.sdk.core.network.Request
    @NonNull
    public Headers headers() {
        return this.f71804c;
    }

    @Override // com.smaato.sdk.core.network.Request
    @NonNull
    public String method() {
        return this.f71803b;
    }

    public String toString() {
        return "Request{uri=" + this.f71802a + ", method=" + this.f71803b + ", headers=" + this.f71804c + ", body=" + this.f71805d + ", followRedirects=" + this.f71806e + "}";
    }

    @Override // com.smaato.sdk.core.network.Request
    @NonNull
    public Uri uri() {
        return this.f71802a;
    }

    private AutoValue_Request(Uri uri, String str, Headers headers, @Nullable Request.Body body, boolean z) {
        this.f71802a = uri;
        this.f71803b = str;
        this.f71804c = headers;
        this.f71805d = body;
        this.f71806e = z;
    }
}
