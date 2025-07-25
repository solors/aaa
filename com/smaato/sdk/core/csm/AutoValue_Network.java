package com.smaato.sdk.core.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.csm.Network;

/* renamed from: com.smaato.sdk.core.csm.b */
/* loaded from: classes7.dex */
final class AutoValue_Network extends Network {

    /* renamed from: a */
    private final String f71446a;

    /* renamed from: b */
    private final String f71447b;

    /* renamed from: c */
    private final String f71448c;

    /* renamed from: d */
    private final String f71449d;

    /* renamed from: e */
    private final String f71450e;

    /* renamed from: f */
    private final String f71451f;

    /* renamed from: g */
    private final int f71452g;

    /* renamed from: h */
    private final int f71453h;

    /* renamed from: i */
    private final int f71454i;

    /* compiled from: AutoValue_Network.java */
    /* renamed from: com.smaato.sdk.core.csm.b$b */
    /* loaded from: classes7.dex */
    static final class C27067b extends Network.Builder {

        /* renamed from: a */
        private String f71455a;

        /* renamed from: b */
        private String f71456b;

        /* renamed from: c */
        private String f71457c;

        /* renamed from: d */
        private String f71458d;

        /* renamed from: e */
        private String f71459e;

        /* renamed from: f */
        private String f71460f;

        /* renamed from: g */
        private Integer f71461g;

        /* renamed from: h */
        private Integer f71462h;

        /* renamed from: i */
        private Integer f71463i;

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network build() {
            String str = "";
            if (this.f71455a == null) {
                str = " name";
            }
            if (this.f71456b == null) {
                str = str + " impression";
            }
            if (this.f71457c == null) {
                str = str + " clickUrl";
            }
            if (this.f71461g == null) {
                str = str + " priority";
            }
            if (this.f71462h == null) {
                str = str + " width";
            }
            if (this.f71463i == null) {
                str = str + " height";
            }
            if (str.isEmpty()) {
                return new AutoValue_Network(this.f71455a, this.f71456b, this.f71457c, this.f71458d, this.f71459e, this.f71460f, this.f71461g.intValue(), this.f71462h.intValue(), this.f71463i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setAdUnitId(@Nullable String str) {
            this.f71458d = str;
            return this;
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setClassName(@Nullable String str) {
            this.f71459e = str;
            return this;
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setClickUrl(String str) {
            if (str != null) {
                this.f71457c = str;
                return this;
            }
            throw new NullPointerException("Null clickUrl");
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setCustomData(@Nullable String str) {
            this.f71460f = str;
            return this;
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setHeight(int i) {
            this.f71463i = Integer.valueOf(i);
            return this;
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setImpression(String str) {
            if (str != null) {
                this.f71456b = str;
                return this;
            }
            throw new NullPointerException("Null impression");
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setName(String str) {
            if (str != null) {
                this.f71455a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setPriority(int i) {
            this.f71461g = Integer.valueOf(i);
            return this;
        }

        @Override // com.smaato.sdk.core.csm.Network.Builder
        public Network.Builder setWidth(int i) {
            this.f71462h = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (this.f71446a.equals(network.getName()) && this.f71447b.equals(network.getImpression()) && this.f71448c.equals(network.getClickUrl()) && ((str = this.f71449d) != null ? str.equals(network.getAdUnitId()) : network.getAdUnitId() == null) && ((str2 = this.f71450e) != null ? str2.equals(network.getClassName()) : network.getClassName() == null) && ((str3 = this.f71451f) != null ? str3.equals(network.getCustomData()) : network.getCustomData() == null) && this.f71452g == network.getPriority() && this.f71453h == network.getWidth() && this.f71454i == network.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @Nullable
    public String getAdUnitId() {
        return this.f71449d;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @Nullable
    public String getClassName() {
        return this.f71450e;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @NonNull
    public String getClickUrl() {
        return this.f71448c;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @Nullable
    public String getCustomData() {
        return this.f71451f;
    }

    @Override // com.smaato.sdk.core.csm.Network
    public int getHeight() {
        return this.f71454i;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @NonNull
    public String getImpression() {
        return this.f71447b;
    }

    @Override // com.smaato.sdk.core.csm.Network
    @NonNull
    public String getName() {
        return this.f71446a;
    }

    @Override // com.smaato.sdk.core.csm.Network
    public int getPriority() {
        return this.f71452g;
    }

    @Override // com.smaato.sdk.core.csm.Network
    public int getWidth() {
        return this.f71453h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((this.f71446a.hashCode() ^ 1000003) * 1000003) ^ this.f71447b.hashCode()) * 1000003) ^ this.f71448c.hashCode()) * 1000003;
        String str = this.f71449d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        String str2 = this.f71450e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f71451f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((i3 ^ i) * 1000003) ^ this.f71452g) * 1000003) ^ this.f71453h) * 1000003) ^ this.f71454i;
    }

    public String toString() {
        return "Network{name=" + this.f71446a + ", impression=" + this.f71447b + ", clickUrl=" + this.f71448c + ", adUnitId=" + this.f71449d + ", className=" + this.f71450e + ", customData=" + this.f71451f + ", priority=" + this.f71452g + ", width=" + this.f71453h + ", height=" + this.f71454i + "}";
    }

    private AutoValue_Network(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, int i3) {
        this.f71446a = str;
        this.f71447b = str2;
        this.f71448c = str3;
        this.f71449d = str4;
        this.f71450e = str5;
        this.f71451f = str6;
        this.f71452g = i;
        this.f71453h = i2;
        this.f71454i = i3;
    }
}
