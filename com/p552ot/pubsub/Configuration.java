package com.p552ot.pubsub;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;

/* renamed from: com.ot.pubsub.Configuration */
/* loaded from: classes7.dex */
public class Configuration {

    /* renamed from: a */
    private String f69155a;

    /* renamed from: b */
    private String f69156b;

    /* renamed from: c */
    private String f69157c;

    /* renamed from: d */
    private String f69158d;

    /* renamed from: e */
    private boolean f69159e;

    /* renamed from: f */
    private String f69160f;

    /* renamed from: g */
    private boolean f69161g;

    /* renamed from: h */
    private String f69162h;

    /* renamed from: i */
    private boolean f69163i;

    /* renamed from: j */
    private boolean f69164j;

    /* renamed from: k */
    private boolean f69165k;

    /* renamed from: com.ot.pubsub.Configuration$Builder */
    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        private String f69166a;

        /* renamed from: b */
        private String f69167b;

        /* renamed from: c */
        private String f69168c;

        /* renamed from: d */
        private String f69169d;

        /* renamed from: e */
        private boolean f69170e;

        /* renamed from: f */
        private String f69171f;

        /* renamed from: i */
        private String f69174i;

        /* renamed from: g */
        private boolean f69172g = false;

        /* renamed from: h */
        private boolean f69173h = false;

        /* renamed from: j */
        private boolean f69175j = false;

        public Configuration build() {
            return new Configuration(this);
        }

        public Builder setAppId(String str) {
            this.f69166a = str;
            return this;
        }

        public Builder setChannel(String str) {
            this.f69167b = str;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f69174i = str;
            return this;
        }

        public Builder setInternational(boolean z) {
            this.f69170e = z;
            return this;
        }

        public Builder setNeedGzipAndEncrypt(boolean z) {
            this.f69173h = z;
            return this;
        }

        public Builder setOverrideMiuiRegionSetting(boolean z) {
            this.f69172g = z;
            return this;
        }

        public Builder setPrivateKeyId(String str) {
            this.f69169d = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.f69168c = str;
            return this;
        }

        public Builder setRegion(String str) {
            this.f69171f = str;
            return this;
        }

        public Builder setUseCustomPrivacyPolicy(boolean z) {
            this.f69175j = z;
            return this;
        }
    }

    /* renamed from: a */
    private String m41491a(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str) && str.length() > 4) {
            for (int i = 0; i < str.length(); i++) {
                if (i != 0 && i != 1 && i != str.length() - 2 && i != str.length() - 1) {
                    sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
                } else {
                    sb2.append(str.charAt(i));
                }
            }
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public String getAppId() {
        return this.f69155a;
    }

    public String getChannel() {
        return this.f69158d;
    }

    public String getInstanceId() {
        return this.f69162h;
    }

    public String getPrivateKeyId() {
        return this.f69157c;
    }

    public String getProjectId() {
        return this.f69156b;
    }

    public String getRegion() {
        return this.f69160f;
    }

    public boolean isInternational() {
        return this.f69159e;
    }

    public boolean isNeedGzipAndEncrypt() {
        return this.f69165k;
    }

    public boolean isOverrideMiuiRegionSetting() {
        return this.f69164j;
    }

    public boolean isUseCustomPrivacyPolicy() {
        return this.f69163i;
    }

    public String toString() {
        try {
            return "Configuration{appId='" + m41491a(this.f69155a) + "', channel='" + this.f69158d + "'mProjectId='" + m41491a(this.f69156b) + "', mPrivateKeyId='" + m41491a(this.f69157c) + "', mInternational=" + this.f69159e + ", mNeedGzipAndEncrypt=" + this.f69165k + ", mRegion='" + this.f69160f + "', overrideMiuiRegionSetting=" + this.f69164j + ", instanceId=" + m41491a(this.f69162h) + '}';
        } catch (Exception unused) {
            return "";
        }
    }

    private Configuration(Builder builder) {
        this.f69163i = false;
        this.f69164j = false;
        this.f69165k = false;
        this.f69155a = builder.f69166a;
        this.f69158d = builder.f69167b;
        this.f69156b = builder.f69168c;
        this.f69157c = builder.f69169d;
        this.f69159e = builder.f69170e;
        this.f69160f = builder.f69171f;
        this.f69164j = builder.f69172g;
        this.f69165k = builder.f69173h;
        this.f69162h = builder.f69174i;
        this.f69163i = builder.f69175j;
    }
}
