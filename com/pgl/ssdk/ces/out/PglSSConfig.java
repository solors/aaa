package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes7.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a */
    private String f69881a;

    /* renamed from: b */
    private final int f69882b;

    /* renamed from: c */
    private final int f69883c;

    /* renamed from: d */
    private String f69884d;

    /* renamed from: e */
    private Map<String, Object> f69885e;

    /* renamed from: f */
    private String f69886f;

    /* renamed from: g */
    private String f69887g;

    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        private String f69888a;

        /* renamed from: b */
        private int f69889b = -1;

        /* renamed from: c */
        private int f69890c = 0;

        /* renamed from: d */
        private String f69891d;

        public PglSSConfig build() {
            if (!TextUtils.isEmpty(this.f69888a)) {
                int i = this.f69889b;
                if (i == 2 || i == 1 || i == 0) {
                    int i2 = this.f69890c;
                    if (i2 == 0 || i2 == 1) {
                        return new PglSSConfig(this.f69888a, i, i2, this.f69891d);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }

        public Builder setAdsdkVersion(String str) {
            this.f69891d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f69888a = str;
            return this;
        }

        public Builder setCollectMode(int i) {
            this.f69890c = i;
            return this;
        }

        public Builder setOVRegionType(int i) {
            this.f69889b = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f69884d;
    }

    public String getAppId() {
        return this.f69881a;
    }

    public String getCnReportUrl() {
        return this.f69886f;
    }

    public String getCnTokenUrl() {
        return this.f69887g;
    }

    public int getCollectMode() {
        return this.f69883c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f69885e;
    }

    public int getOVRegionType() {
        return this.f69882b;
    }

    public void setCnReportUrl(String str) {
        this.f69886f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f69887g = str;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f69885e = map;
    }

    private PglSSConfig(String str, int i, int i2, String str2) {
        this.f69881a = str;
        this.f69882b = i;
        this.f69883c = i2;
        this.f69884d = str2;
    }
}
