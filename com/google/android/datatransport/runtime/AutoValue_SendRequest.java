package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* loaded from: classes4.dex */
final class AutoValue_SendRequest extends SendRequest {

    /* renamed from: a */
    private final TransportContext f31020a;

    /* renamed from: b */
    private final String f31021b;

    /* renamed from: c */
    private final Event<?> f31022c;

    /* renamed from: d */
    private final Transformer<?, byte[]> f31023d;

    /* renamed from: e */
    private final Encoding f31024e;

    /* loaded from: classes4.dex */
    static final class Builder extends SendRequest.Builder {

        /* renamed from: a */
        private TransportContext f31025a;

        /* renamed from: b */
        private String f31026b;

        /* renamed from: c */
        private Event<?> f31027c;

        /* renamed from: d */
        private Transformer<?, byte[]> f31028d;

        /* renamed from: e */
        private Encoding f31029e;

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: a */
        SendRequest.Builder mo76315a(Encoding encoding) {
            if (encoding != null) {
                this.f31029e = encoding;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: b */
        SendRequest.Builder mo76314b(Event<?> event) {
            if (event != null) {
                this.f31027c = event;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String str = "";
            if (this.f31025a == null) {
                str = " transportContext";
            }
            if (this.f31026b == null) {
                str = str + " transportName";
            }
            if (this.f31027c == null) {
                str = str + " event";
            }
            if (this.f31028d == null) {
                str = str + " transformer";
            }
            if (this.f31029e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.f31025a, this.f31026b, this.f31027c, this.f31028d, this.f31029e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: c */
        SendRequest.Builder mo76313c(Transformer<?, byte[]> transformer) {
            if (transformer != null) {
                this.f31028d = transformer;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext != null) {
                this.f31025a = transportContext;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            if (str != null) {
                this.f31026b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: a */
    Event<?> mo76317a() {
        return this.f31022c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: b */
    Transformer<?, byte[]> mo76316b() {
        return this.f31023d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        if (this.f31020a.equals(sendRequest.getTransportContext()) && this.f31021b.equals(sendRequest.getTransportName()) && this.f31022c.equals(sendRequest.mo76317a()) && this.f31023d.equals(sendRequest.mo76316b()) && this.f31024e.equals(sendRequest.getEncoding())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
        return this.f31024e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
        return this.f31020a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
        return this.f31021b;
    }

    public int hashCode() {
        return ((((((((this.f31020a.hashCode() ^ 1000003) * 1000003) ^ this.f31021b.hashCode()) * 1000003) ^ this.f31022c.hashCode()) * 1000003) ^ this.f31023d.hashCode()) * 1000003) ^ this.f31024e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f31020a + ", transportName=" + this.f31021b + ", event=" + this.f31022c + ", transformer=" + this.f31023d + ", encoding=" + this.f31024e + "}";
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
        this.f31020a = transportContext;
        this.f31021b = str;
        this.f31022c = event;
        this.f31023d = transformer;
        this.f31024e = encoding;
    }
}
