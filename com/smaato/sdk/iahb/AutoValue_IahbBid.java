package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.iahb.IahbBid;

/* renamed from: com.smaato.sdk.iahb.a */
/* loaded from: classes7.dex */
final class AutoValue_IahbBid extends IahbBid {

    /* renamed from: a */
    private final String f72032a;

    /* renamed from: b */
    private final String f72033b;

    /* renamed from: c */
    private final IahbExt f72034c;

    /* compiled from: AutoValue_IahbBid.java */
    /* renamed from: com.smaato.sdk.iahb.a$b */
    /* loaded from: classes7.dex */
    static final class C27349b extends IahbBid.AbstractC27338a {

        /* renamed from: a */
        private String f72035a;

        /* renamed from: b */
        private String f72036b;

        /* renamed from: c */
        private IahbExt f72037c;

        @Override // com.smaato.sdk.iahb.IahbBid.AbstractC27338a
        /* renamed from: a */
        IahbBid.AbstractC27338a mo39281a(@Nullable String str) {
            if (str != null) {
                this.f72035a = str;
                return this;
            }
            throw new NullPointerException("Null adm");
        }

        @Override // com.smaato.sdk.iahb.IahbBid.AbstractC27338a
        /* renamed from: b */
        IahbBid mo39280b() {
            String str = "";
            if (this.f72035a == null) {
                str = " adm";
            }
            if (this.f72037c == null) {
                str = str + " ext";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbBid(this.f72035a, this.f72036b, this.f72037c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.iahb.IahbBid.AbstractC27338a
        /* renamed from: d */
        IahbBid.AbstractC27338a mo39279d(@Nullable String str) {
            this.f72036b = str;
            return this;
        }

        @Override // com.smaato.sdk.iahb.IahbBid.AbstractC27338a
        /* renamed from: e */
        IahbBid.AbstractC27338a mo39278e(@Nullable IahbExt iahbExt) {
            if (iahbExt != null) {
                this.f72037c = iahbExt;
                return this;
            }
            throw new NullPointerException("Null ext");
        }
    }

    @Override // com.smaato.sdk.iahb.IahbBid
    @NonNull
    String adm() {
        return this.f72032a;
    }

    @Override // com.smaato.sdk.iahb.IahbBid
    @Nullable
    String bundleId() {
        return this.f72033b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbBid)) {
            return false;
        }
        IahbBid iahbBid = (IahbBid) obj;
        if (this.f72032a.equals(iahbBid.adm()) && ((str = this.f72033b) != null ? str.equals(iahbBid.bundleId()) : iahbBid.bundleId() == null) && this.f72034c.equals(iahbBid.ext())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.iahb.IahbBid
    @NonNull
    IahbExt ext() {
        return this.f72034c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f72032a.hashCode() ^ 1000003) * 1000003;
        String str = this.f72033b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f72034c.hashCode();
    }

    public String toString() {
        return "IahbBid{adm=" + this.f72032a + ", bundleId=" + this.f72033b + ", ext=" + this.f72034c + "}";
    }

    private AutoValue_IahbBid(String str, @Nullable String str2, IahbExt iahbExt) {
        this.f72032a = str;
        this.f72033b = str2;
        this.f72034c = iahbExt;
    }
}
