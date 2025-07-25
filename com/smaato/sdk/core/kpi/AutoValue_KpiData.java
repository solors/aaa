package com.smaato.sdk.core.kpi;

import com.smaato.sdk.core.kpi.KpiData;

/* renamed from: com.smaato.sdk.core.kpi.a */
/* loaded from: classes7.dex */
final class AutoValue_KpiData extends KpiData {

    /* renamed from: a */
    private final String f71582a;

    /* renamed from: b */
    private final String f71583b;

    /* renamed from: c */
    private final String f71584c;

    /* renamed from: d */
    private final String f71585d;

    /* compiled from: AutoValue_KpiData.java */
    /* renamed from: com.smaato.sdk.core.kpi.a$b */
    /* loaded from: classes7.dex */
    static final class C27120b extends KpiData.Builder {

        /* renamed from: a */
        private String f71586a;

        /* renamed from: b */
        private String f71587b;

        /* renamed from: c */
        private String f71588c;

        /* renamed from: d */
        private String f71589d;

        @Override // com.smaato.sdk.core.kpi.KpiData.Builder
        public KpiData build() {
            String str = "";
            if (this.f71586a == null) {
                str = " rollingFillRatePerAdSpace";
            }
            if (this.f71587b == null) {
                str = str + " sessionDepthPerAdSpace";
            }
            if (this.f71588c == null) {
                str = str + " totalAdRequests";
            }
            if (this.f71589d == null) {
                str = str + " totalFillRate";
            }
            if (str.isEmpty()) {
                return new AutoValue_KpiData(this.f71586a, this.f71587b, this.f71588c, this.f71589d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.kpi.KpiData.Builder
        public KpiData.Builder setRollingFillRatePerAdSpace(String str) {
            if (str != null) {
                this.f71586a = str;
                return this;
            }
            throw new NullPointerException("Null rollingFillRatePerAdSpace");
        }

        @Override // com.smaato.sdk.core.kpi.KpiData.Builder
        public KpiData.Builder setSessionDepthPerAdSpace(String str) {
            if (str != null) {
                this.f71587b = str;
                return this;
            }
            throw new NullPointerException("Null sessionDepthPerAdSpace");
        }

        @Override // com.smaato.sdk.core.kpi.KpiData.Builder
        public KpiData.Builder setTotalAdRequests(String str) {
            if (str != null) {
                this.f71588c = str;
                return this;
            }
            throw new NullPointerException("Null totalAdRequests");
        }

        @Override // com.smaato.sdk.core.kpi.KpiData.Builder
        public KpiData.Builder setTotalFillRate(String str) {
            if (str != null) {
                this.f71589d = str;
                return this;
            }
            throw new NullPointerException("Null totalFillRate");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KpiData)) {
            return false;
        }
        KpiData kpiData = (KpiData) obj;
        if (this.f71582a.equals(kpiData.getRollingFillRatePerAdSpace()) && this.f71583b.equals(kpiData.getSessionDepthPerAdSpace()) && this.f71584c.equals(kpiData.getTotalAdRequests()) && this.f71585d.equals(kpiData.getTotalFillRate())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.kpi.KpiData
    public String getRollingFillRatePerAdSpace() {
        return this.f71582a;
    }

    @Override // com.smaato.sdk.core.kpi.KpiData
    public String getSessionDepthPerAdSpace() {
        return this.f71583b;
    }

    @Override // com.smaato.sdk.core.kpi.KpiData
    public String getTotalAdRequests() {
        return this.f71584c;
    }

    @Override // com.smaato.sdk.core.kpi.KpiData
    public String getTotalFillRate() {
        return this.f71585d;
    }

    public int hashCode() {
        return ((((((this.f71582a.hashCode() ^ 1000003) * 1000003) ^ this.f71583b.hashCode()) * 1000003) ^ this.f71584c.hashCode()) * 1000003) ^ this.f71585d.hashCode();
    }

    public String toString() {
        return "KpiData{rollingFillRatePerAdSpace=" + this.f71582a + ", sessionDepthPerAdSpace=" + this.f71583b + ", totalAdRequests=" + this.f71584c + ", totalFillRate=" + this.f71585d + "}";
    }

    private AutoValue_KpiData(String str, String str2, String str3, String str4) {
        this.f71582a = str;
        this.f71583b = str2;
        this.f71584c = str3;
        this.f71585d = str4;
    }
}
