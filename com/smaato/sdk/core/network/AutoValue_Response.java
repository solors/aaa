package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.network.Response;
import java.net.HttpURLConnection;

/* renamed from: com.smaato.sdk.core.network.g */
/* loaded from: classes7.dex */
final class AutoValue_Response extends Response {

    /* renamed from: b */
    private final Request f71812b;

    /* renamed from: c */
    private final int f71813c;

    /* renamed from: d */
    private final Headers f71814d;

    /* renamed from: f */
    private final MimeType f71815f;

    /* renamed from: g */
    private final Response.Body f71816g;

    /* renamed from: h */
    private final String f71817h;

    /* renamed from: i */
    private final HttpURLConnection f71818i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_Response.java */
    /* renamed from: com.smaato.sdk.core.network.g$b */
    /* loaded from: classes7.dex */
    public static final class C27225b extends Response.Builder {

        /* renamed from: a */
        private Request f71819a;

        /* renamed from: b */
        private Integer f71820b;

        /* renamed from: c */
        private Headers f71821c;

        /* renamed from: d */
        private MimeType f71822d;

        /* renamed from: e */
        private Response.Body f71823e;

        /* renamed from: f */
        private String f71824f;

        /* renamed from: g */
        private HttpURLConnection f71825g;

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder body(Response.Body body) {
            if (body != null) {
                this.f71823e = body;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response build() {
            String str = "";
            if (this.f71819a == null) {
                str = " request";
            }
            if (this.f71820b == null) {
                str = str + " responseCode";
            }
            if (this.f71821c == null) {
                str = str + " headers";
            }
            if (this.f71823e == null) {
                str = str + " body";
            }
            if (this.f71825g == null) {
                str = str + " connection";
            }
            if (str.isEmpty()) {
                return new AutoValue_Response(this.f71819a, this.f71820b.intValue(), this.f71821c, this.f71822d, this.f71823e, this.f71824f, this.f71825g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder connection(HttpURLConnection httpURLConnection) {
            if (httpURLConnection != null) {
                this.f71825g = httpURLConnection;
                return this;
            }
            throw new NullPointerException("Null connection");
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder encoding(String str) {
            this.f71824f = str;
            return this;
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder headers(Headers headers) {
            if (headers != null) {
                this.f71821c = headers;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder mimeType(MimeType mimeType) {
            this.f71822d = mimeType;
            return this;
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder request(Request request) {
            if (request != null) {
                this.f71819a = request;
                return this;
            }
            throw new NullPointerException("Null request");
        }

        @Override // com.smaato.sdk.core.network.Response.Builder
        public Response.Builder responseCode(int i) {
            this.f71820b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // com.smaato.sdk.core.network.Response
    @NonNull
    public Response.Body body() {
        return this.f71816g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.smaato.sdk.core.network.Response
    @NonNull
    public HttpURLConnection connection() {
        return this.f71818i;
    }

    @Override // com.smaato.sdk.core.network.Response
    @Nullable
    public String encoding() {
        return this.f71817h;
    }

    public boolean equals(Object obj) {
        MimeType mimeType;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (this.f71812b.equals(response.request()) && this.f71813c == response.responseCode() && this.f71814d.equals(response.headers()) && ((mimeType = this.f71815f) != null ? mimeType.equals(response.mimeType()) : response.mimeType() == null) && this.f71816g.equals(response.body()) && ((str = this.f71817h) != null ? str.equals(response.encoding()) : response.encoding() == null) && this.f71818i.equals(response.connection())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f71812b.hashCode() ^ 1000003) * 1000003) ^ this.f71813c) * 1000003) ^ this.f71814d.hashCode()) * 1000003;
        MimeType mimeType = this.f71815f;
        int i = 0;
        if (mimeType == null) {
            hashCode = 0;
        } else {
            hashCode = mimeType.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f71816g.hashCode()) * 1000003;
        String str = this.f71817h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f71818i.hashCode();
    }

    @Override // com.smaato.sdk.core.network.Response
    @NonNull
    public Headers headers() {
        return this.f71814d;
    }

    @Override // com.smaato.sdk.core.network.Response
    @Nullable
    public MimeType mimeType() {
        return this.f71815f;
    }

    @Override // com.smaato.sdk.core.network.Response
    @NonNull
    public Request request() {
        return this.f71812b;
    }

    @Override // com.smaato.sdk.core.network.Response
    public int responseCode() {
        return this.f71813c;
    }

    public String toString() {
        return "Response{request=" + this.f71812b + ", responseCode=" + this.f71813c + ", headers=" + this.f71814d + ", mimeType=" + this.f71815f + ", body=" + this.f71816g + ", encoding=" + this.f71817h + ", connection=" + this.f71818i + "}";
    }

    private AutoValue_Response(Request request, int i, Headers headers, @Nullable MimeType mimeType, Response.Body body, @Nullable String str, HttpURLConnection httpURLConnection) {
        this.f71812b = request;
        this.f71813c = i;
        this.f71814d = headers;
        this.f71815f = mimeType;
        this.f71816g = body;
        this.f71817h = str;
        this.f71818i = httpURLConnection;
    }
}
