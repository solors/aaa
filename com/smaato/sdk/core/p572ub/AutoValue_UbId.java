package com.smaato.sdk.core.p572ub;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p572ub.UbId;

/* renamed from: com.smaato.sdk.core.ub.b */
/* loaded from: classes7.dex */
final class AutoValue_UbId extends UbId {

    /* renamed from: a */
    private final String f71913a;

    /* renamed from: b */
    private final String f71914b;

    /* compiled from: AutoValue_UbId.java */
    /* renamed from: com.smaato.sdk.core.ub.b$b */
    /* loaded from: classes7.dex */
    static final class C27280b extends UbId.Builder {

        /* renamed from: a */
        private String f71915a;

        /* renamed from: b */
        private String f71916b;

        @Override // com.smaato.sdk.core.p572ub.UbId.Builder
        public UbId.Builder adSpaceId(String str) {
            if (str != null) {
                this.f71916b = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        @Override // com.smaato.sdk.core.p572ub.UbId.Builder
        public UbId build() {
            String str = "";
            if (this.f71915a == null) {
                str = " sessionId";
            }
            if (this.f71916b == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbId(this.f71915a, this.f71916b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.p572ub.UbId.Builder
        public UbId.Builder sessionId(String str) {
            if (str != null) {
                this.f71915a = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }
    }

    @Override // com.smaato.sdk.core.p572ub.UbId
    @NonNull
    public String adSpaceId() {
        return this.f71914b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UbId)) {
            return false;
        }
        UbId ubId = (UbId) obj;
        if (this.f71913a.equals(ubId.sessionId()) && this.f71914b.equals(ubId.adSpaceId())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f71913a.hashCode() ^ 1000003) * 1000003) ^ this.f71914b.hashCode();
    }

    @Override // com.smaato.sdk.core.p572ub.UbId
    @NonNull
    public String sessionId() {
        return this.f71913a;
    }

    private AutoValue_UbId(String str, String str2) {
        this.f71913a = str;
        this.f71914b = str2;
    }
}
