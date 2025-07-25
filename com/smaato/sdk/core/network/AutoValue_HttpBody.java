package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.HttpBody;
import java.io.InputStream;

/* renamed from: com.smaato.sdk.core.network.b */
/* loaded from: classes7.dex */
final class AutoValue_HttpBody extends HttpBody {

    /* renamed from: a */
    private final InputStream f71778a;

    /* renamed from: b */
    private final long f71779b;

    /* compiled from: AutoValue_HttpBody.java */
    /* renamed from: com.smaato.sdk.core.network.b$b */
    /* loaded from: classes7.dex */
    static final class C27219b extends HttpBody.AbstractC27227a {

        /* renamed from: a */
        private InputStream f71780a;

        /* renamed from: b */
        private Long f71781b;

        @Override // com.smaato.sdk.core.network.HttpBody.AbstractC27227a
        /* renamed from: a */
        HttpBody mo39429a() {
            String str = "";
            if (this.f71780a == null) {
                str = " source";
            }
            if (this.f71781b == null) {
                str = str + " contentLength";
            }
            if (str.isEmpty()) {
                return new AutoValue_HttpBody(this.f71780a, this.f71781b.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.network.HttpBody.AbstractC27227a
        /* renamed from: b */
        HttpBody.AbstractC27227a mo39428b(long j) {
            this.f71781b = Long.valueOf(j);
            return this;
        }

        @Override // com.smaato.sdk.core.network.HttpBody.AbstractC27227a
        /* renamed from: c */
        HttpBody.AbstractC27227a mo39427c(InputStream inputStream) {
            if (inputStream != null) {
                this.f71780a = inputStream;
                return this;
            }
            throw new NullPointerException("Null source");
        }
    }

    @Override // com.smaato.sdk.core.network.Response.Body
    public long contentLength() {
        return this.f71779b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpBody)) {
            return false;
        }
        HttpBody httpBody = (HttpBody) obj;
        if (this.f71778a.equals(httpBody.source()) && this.f71779b == httpBody.contentLength()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f71779b;
        return ((this.f71778a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.smaato.sdk.core.network.Response.Body
    @NonNull
    public InputStream source() {
        return this.f71778a;
    }

    public String toString() {
        return "HttpBody{source=" + this.f71778a + ", contentLength=" + this.f71779b + "}";
    }

    private AutoValue_HttpBody(InputStream inputStream, long j) {
        this.f71778a = inputStream;
        this.f71779b = j;
    }
}
