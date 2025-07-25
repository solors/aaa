package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.iahb.IahbExt;

/* renamed from: com.smaato.sdk.iahb.b */
/* loaded from: classes7.dex */
final class AutoValue_IahbExt extends IahbExt {

    /* renamed from: a */
    private final String f72038a;

    /* renamed from: b */
    private final String f72039b;

    /* renamed from: c */
    private final long f72040c;

    /* renamed from: d */
    private final ImpressionCountingType f72041d;

    /* compiled from: AutoValue_IahbExt.java */
    /* renamed from: com.smaato.sdk.iahb.b$b */
    /* loaded from: classes7.dex */
    static final class C27351b extends IahbExt.AbstractC27339a {

        /* renamed from: a */
        private String f72042a;

        /* renamed from: b */
        private String f72043b;

        /* renamed from: c */
        private Long f72044c;

        /* renamed from: d */
        private ImpressionCountingType f72045d;

        @Override // com.smaato.sdk.iahb.IahbExt.AbstractC27339a
        /* renamed from: a */
        IahbExt.AbstractC27339a mo39277a(String str) {
            if (str != null) {
                this.f72042a = str;
                return this;
            }
            throw new NullPointerException("Null adspaceid");
        }

        @Override // com.smaato.sdk.iahb.IahbExt.AbstractC27339a
        /* renamed from: b */
        IahbExt.AbstractC27339a mo39276b(String str) {
            if (str != null) {
                this.f72043b = str;
                return this;
            }
            throw new NullPointerException("Null adtype");
        }

        @Override // com.smaato.sdk.iahb.IahbExt.AbstractC27339a
        /* renamed from: c */
        IahbExt mo39275c() {
            String str = "";
            if (this.f72042a == null) {
                str = " adspaceid";
            }
            if (this.f72043b == null) {
                str = str + " adtype";
            }
            if (this.f72044c == null) {
                str = str + " expiresAt";
            }
            if (this.f72045d == null) {
                str = str + " impressionMeasurement";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbExt(this.f72042a, this.f72043b, this.f72044c.longValue(), this.f72045d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.iahb.IahbExt.AbstractC27339a
        /* renamed from: e */
        IahbExt.AbstractC27339a mo39274e(long j) {
            this.f72044c = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.smaato.sdk.iahb.IahbExt.AbstractC27339a
        /* renamed from: f */
        public IahbExt.AbstractC27339a mo39273f(ImpressionCountingType impressionCountingType) {
            if (impressionCountingType != null) {
                this.f72045d = impressionCountingType;
                return this;
            }
            throw new NullPointerException("Null impressionMeasurement");
        }
    }

    @Override // com.smaato.sdk.iahb.IahbExt
    @NonNull
    String adspaceid() {
        return this.f72038a;
    }

    @Override // com.smaato.sdk.iahb.IahbExt
    @NonNull
    String adtype() {
        return this.f72039b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbExt)) {
            return false;
        }
        IahbExt iahbExt = (IahbExt) obj;
        if (this.f72038a.equals(iahbExt.adspaceid()) && this.f72039b.equals(iahbExt.adtype()) && this.f72040c == iahbExt.expiresAt() && this.f72041d.equals(iahbExt.impressionMeasurement())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.iahb.IahbExt
    long expiresAt() {
        return this.f72040c;
    }

    public int hashCode() {
        long j = this.f72040c;
        return ((((((this.f72038a.hashCode() ^ 1000003) * 1000003) ^ this.f72039b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f72041d.hashCode();
    }

    @Override // com.smaato.sdk.iahb.IahbExt
    ImpressionCountingType impressionMeasurement() {
        return this.f72041d;
    }

    public String toString() {
        return "IahbExt{adspaceid=" + this.f72038a + ", adtype=" + this.f72039b + ", expiresAt=" + this.f72040c + ", impressionMeasurement=" + this.f72041d + "}";
    }

    private AutoValue_IahbExt(String str, String str2, long j, ImpressionCountingType impressionCountingType) {
        this.f72038a = str;
        this.f72039b = str2;
        this.f72040c = j;
        this.f72041d = impressionCountingType;
    }
}
