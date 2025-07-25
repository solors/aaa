package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import com.smaato.sdk.iahb.IahbResponse;

/* renamed from: com.smaato.sdk.iahb.c */
/* loaded from: classes7.dex */
final class AutoValue_IahbResponse extends IahbResponse {

    /* renamed from: a */
    private final String f72046a;

    /* renamed from: b */
    private final IahbBid f72047b;

    /* compiled from: AutoValue_IahbResponse.java */
    /* renamed from: com.smaato.sdk.iahb.c$b */
    /* loaded from: classes7.dex */
    static final class C27353b extends IahbResponse.AbstractC27340a {

        /* renamed from: a */
        private String f72048a;

        /* renamed from: b */
        private IahbBid f72049b;

        @Override // com.smaato.sdk.iahb.IahbResponse.AbstractC27340a
        /* renamed from: a */
        IahbResponse.AbstractC27340a mo39272a(IahbBid iahbBid) {
            if (iahbBid != null) {
                this.f72049b = iahbBid;
                return this;
            }
            throw new NullPointerException("Null bid");
        }

        @Override // com.smaato.sdk.iahb.IahbResponse.AbstractC27340a
        /* renamed from: b */
        IahbResponse.AbstractC27340a mo39271b(String str) {
            if (str != null) {
                this.f72048a = str;
                return this;
            }
            throw new NullPointerException("Null bidId");
        }

        @Override // com.smaato.sdk.iahb.IahbResponse.AbstractC27340a
        /* renamed from: c */
        IahbResponse mo39270c() {
            String str = "";
            if (this.f72048a == null) {
                str = " bidId";
            }
            if (this.f72049b == null) {
                str = str + " bid";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbResponse(this.f72048a, this.f72049b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    @Override // com.smaato.sdk.iahb.IahbResponse
    @NonNull
    IahbBid bid() {
        return this.f72047b;
    }

    @Override // com.smaato.sdk.iahb.IahbResponse
    @NonNull
    String bidId() {
        return this.f72046a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbResponse)) {
            return false;
        }
        IahbResponse iahbResponse = (IahbResponse) obj;
        if (this.f72046a.equals(iahbResponse.bidId()) && this.f72047b.equals(iahbResponse.bid())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f72046a.hashCode() ^ 1000003) * 1000003) ^ this.f72047b.hashCode();
    }

    public String toString() {
        return "IahbResponse{bidId=" + this.f72046a + ", bid=" + this.f72047b + "}";
    }

    private AutoValue_IahbResponse(String str, IahbBid iahbBid) {
        this.f72046a = str;
        this.f72047b = iahbBid;
    }
}
