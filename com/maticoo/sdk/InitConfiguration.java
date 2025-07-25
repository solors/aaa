package com.maticoo.sdk;

import java.util.Map;

/* loaded from: classes6.dex */
public class InitConfiguration {
    private final boolean dynamicRes;
    private final boolean isLogEnable;
    private final Map<String, Object> localExtra;
    private final String mAppKey;

    /* loaded from: classes6.dex */
    public static class Builder {
        private String appKey;
        private boolean dynamicRes;
        private Map<String, Object> localExtra;
        private boolean logEnable;

        public Builder appKey(String str) {
            this.appKey = str;
            return this;
        }

        public InitConfiguration build() {
            return new InitConfiguration(this);
        }

        public Builder dynamicRes(boolean z) {
            this.dynamicRes = z;
            return this;
        }

        public Builder localExtra(Map<String, Object> map) {
            this.localExtra = map;
            return this;
        }

        public Builder logEnable(boolean z) {
            this.logEnable = z;
            return this;
        }
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public Map<String, Object> getLocalExtra() {
        return this.localExtra;
    }

    public boolean isDynamicRes() {
        return this.dynamicRes;
    }

    public boolean isLogEnable() {
        return this.isLogEnable;
    }

    private InitConfiguration(Builder builder) {
        this.mAppKey = builder.appKey;
        this.isLogEnable = builder.logEnable;
        this.dynamicRes = builder.dynamicRes;
        this.localExtra = builder.localExtra;
    }
}
