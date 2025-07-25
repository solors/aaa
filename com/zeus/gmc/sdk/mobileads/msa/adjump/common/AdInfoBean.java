package com.zeus.gmc.sdk.mobileads.msa.adjump.common;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AdInfoBean implements Serializable {
    private String jjppjjupu;
    private String jjuj;
    private int jjuuju;
    private String jpjjjjp;
    private int jujujpjjp;
    private String jupppjuju;
    private Map<String, String> juupjpuppj;
    private String juupuj;
    private String pppjujup;
    private long puujujuupp;
    private String puuuuj;
    private String ujjuupp;
    private String ujpupujju;
    private String uppj;
    private int uppjpjj;
    private String upupjjppj;
    private String uujpuuupj;

    public long getAdId() {
        return this.puujujuupp;
    }

    public String getAppClientId() {
        return this.uppj;
    }

    public String getAppRef() {
        return this.jjppjjupu;
    }

    public String getAppSignature() {
        return this.upupjjppj;
    }

    public int getBrowserType() {
        return this.jjuuju;
    }

    public String getCosdkVersion() {
        return this.ujpupujju;
    }

    public String getCreativeType() {
        return this.jjuj;
    }

    public Map<String, String> getCustomMap() {
        return this.juupjpuppj;
    }

    public String getDeeplink() {
        return this.juupuj;
    }

    public String getDownloadPackageName() {
        return this.jpjjjjp;
    }

    public String getDspName() {
        return this.ujjuupp;
    }

    public String getEx() {
        return this.puuuuj;
    }

    public String getLandingPageUrl() {
        return this.jupppjuju;
    }

    public int getMaxJumptimes() {
        return this.uppjpjj;
    }

    public String getNonce() {
        return this.pppjujup;
    }

    public String getTagID() {
        return this.uujpuuupj;
    }

    public int getTargetType() {
        return this.jujujpjjp;
    }

    private AdInfoBean(Builder builder) {
        this.uppjpjj = 10;
        this.jujujpjjp = builder.jujujpjjp;
        this.uppjpjj = builder.uppjpjj;
        this.puujujuupp = builder.puujujuupp;
        this.jupppjuju = builder.jupppjuju;
        this.jpjjjjp = builder.jpjjjjp;
        this.ujjuupp = builder.ujjuupp;
        this.jjppjjupu = builder.jjppjjupu;
        this.uppj = builder.uppj;
        this.upupjjppj = builder.upupjjppj;
        this.pppjujup = builder.pppjujup;
        this.juupuj = builder.juupuj;
        this.uujpuuupj = builder.uujpuuupj;
        this.puuuuj = builder.puuuuj;
        this.jjuuju = builder.jjuuju;
        this.ujpupujju = builder.ujpupujju;
        this.jjuj = builder.jjuj;
        this.juupjpuppj = builder.juupjpuppj;
    }

    /* loaded from: classes8.dex */
    public static final class Builder {
        private String jjppjjupu;
        private String jjuj;
        private int jjuuju;
        private String jpjjjjp;
        private int jujujpjjp;
        private String jupppjuju;
        private String juupuj;
        private String pppjujup;
        private long puujujuupp;
        private String puuuuj;
        private String ujjuupp;
        private String ujpupujju;
        private String uppj;
        private String upupjjppj;
        private String uujpuuupj;
        private int uppjpjj = 10;
        private Map<String, String> juupjpuppj = new HashMap();

        public AdInfoBean build() {
            return new AdInfoBean(this);
        }

        public Builder setAdId(long j) {
            this.puujujuupp = j;
            return this;
        }

        public Builder setAppClientId(String str) {
            this.uppj = str;
            return this;
        }

        public Builder setAppRef(String str) {
            this.jjppjjupu = str;
            return this;
        }

        public Builder setAppSignature(String str) {
            this.upupjjppj = str;
            return this;
        }

        public Builder setBrowserType(int i) {
            this.jjuuju = i;
            return this;
        }

        public Builder setCosdkVersion(String str) {
            this.ujpupujju = str;
            return this;
        }

        public Builder setCreativeType(String str) {
            this.jjuj = str;
            return this;
        }

        public Builder setCustomMap(String str, String str2) {
            if (this.juupjpuppj == null) {
                this.juupjpuppj = new HashMap();
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.juupjpuppj.put(str, str2);
            }
            return this;
        }

        public Builder setDeeplink(String str) {
            this.juupuj = str;
            return this;
        }

        public Builder setDownloadPackageName(String str) {
            this.jpjjjjp = str;
            return this;
        }

        public Builder setDspName(String str) {
            this.ujjuupp = str;
            return this;
        }

        public Builder setEx(String str) {
            this.puuuuj = str;
            return this;
        }

        public Builder setLandingPageUrl(String str) {
            this.jupppjuju = str;
            return this;
        }

        public Builder setMaxJumptimes(int i) {
            this.uppjpjj = i;
            return this;
        }

        public Builder setNonce(String str) {
            this.pppjujup = str;
            return this;
        }

        public Builder setTagID(String str) {
            this.uujpuuupj = str;
            return this;
        }

        public Builder setTargetType(int i) {
            this.jujujpjjp = i;
            return this;
        }

        public Builder setCustomMap(Map<String, String> map) {
            if (this.juupjpuppj == null) {
                this.juupjpuppj = new HashMap();
            }
            if (map != null) {
                this.juupjpuppj.putAll(map);
            }
            return this;
        }
    }
}
