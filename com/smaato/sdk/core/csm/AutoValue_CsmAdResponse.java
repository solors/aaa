package com.smaato.sdk.core.csm;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.csm.CsmAdResponse;
import java.util.List;

/* renamed from: com.smaato.sdk.core.csm.a */
/* loaded from: classes7.dex */
final class AutoValue_CsmAdResponse extends CsmAdResponse {

    /* renamed from: a */
    private final List<Network> f71440a;

    /* renamed from: b */
    private final String f71441b;

    /* renamed from: c */
    private final String f71442c;

    /* compiled from: AutoValue_CsmAdResponse.java */
    /* renamed from: com.smaato.sdk.core.csm.a$b */
    /* loaded from: classes7.dex */
    static final class C27065b extends CsmAdResponse.Builder {

        /* renamed from: a */
        private List<Network> f71443a;

        /* renamed from: b */
        private String f71444b;

        /* renamed from: c */
        private String f71445c;

        @Override // com.smaato.sdk.core.csm.CsmAdResponse.Builder
        public CsmAdResponse build() {
            String str = "";
            if (this.f71443a == null) {
                str = " networks";
            }
            if (this.f71444b == null) {
                str = str + " sessionId";
            }
            if (this.f71445c == null) {
                str = str + " passback";
            }
            if (str.isEmpty()) {
                return new AutoValue_CsmAdResponse(this.f71443a, this.f71444b, this.f71445c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.csm.CsmAdResponse.Builder
        public CsmAdResponse.Builder setNetworks(List<Network> list) {
            if (list != null) {
                this.f71443a = list;
                return this;
            }
            throw new NullPointerException("Null networks");
        }

        @Override // com.smaato.sdk.core.csm.CsmAdResponse.Builder
        public CsmAdResponse.Builder setPassback(String str) {
            if (str != null) {
                this.f71445c = str;
                return this;
            }
            throw new NullPointerException("Null passback");
        }

        @Override // com.smaato.sdk.core.csm.CsmAdResponse.Builder
        public CsmAdResponse.Builder setSessionId(String str) {
            if (str != null) {
                this.f71444b = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CsmAdResponse)) {
            return false;
        }
        CsmAdResponse csmAdResponse = (CsmAdResponse) obj;
        if (this.f71440a.equals(csmAdResponse.getNetworks()) && this.f71441b.equals(csmAdResponse.getSessionId()) && this.f71442c.equals(csmAdResponse.getPassback())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.csm.CsmAdResponse
    @NonNull
    public List<Network> getNetworks() {
        return this.f71440a;
    }

    @Override // com.smaato.sdk.core.csm.CsmAdResponse
    @NonNull
    public String getPassback() {
        return this.f71442c;
    }

    @Override // com.smaato.sdk.core.csm.CsmAdResponse
    @NonNull
    public String getSessionId() {
        return this.f71441b;
    }

    public int hashCode() {
        return ((((this.f71440a.hashCode() ^ 1000003) * 1000003) ^ this.f71441b.hashCode()) * 1000003) ^ this.f71442c.hashCode();
    }

    public String toString() {
        return "CsmAdResponse{networks=" + this.f71440a + ", sessionId=" + this.f71441b + ", passback=" + this.f71442c + "}";
    }

    private AutoValue_CsmAdResponse(List<Network> list, String str, String str2) {
        this.f71440a = list;
        this.f71441b = str;
        this.f71442c = str2;
    }
}
