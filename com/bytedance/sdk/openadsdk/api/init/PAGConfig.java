package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6508bX;
import com.bytedance.sdk.component.p257iR.eqN.C7634bX;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.DDQ;
import com.bytedance.sdk.openadsdk.utils.C9510LZ;
import com.bytedance.sdk.openadsdk.utils.ayS;

/* loaded from: classes3.dex */
public final class PAGConfig implements InitConfig {

    /* renamed from: VB */
    private static String f17697VB;

    /* renamed from: IL */
    private boolean f17698IL;

    /* renamed from: Kg */
    private boolean f17699Kg;

    /* renamed from: WR */
    private String f17700WR;

    /* renamed from: bX */
    private int f17701bX;

    /* renamed from: bg */
    private String f17702bg;

    /* renamed from: eo */
    private String f17703eo;
    private int eqN = -1;

    /* renamed from: zx */
    private int f17705zx = -1;
    private int ldr = -1;

    /* renamed from: iR */
    private int f17704iR = 0;

    public static void debugLog(boolean z) {
        if (DDQ.m85917bg() != null) {
            if (z) {
                DDQ.m85917bg().mo84947zx(1);
                DDQ.m85917bg().mo84953bg();
                return;
            }
            DDQ.m85917bg().mo84947zx(0);
            C7634bX.m88302bg(C7634bX.EnumC7638bg.OFF);
            C7741PX.m87878bX();
            C6508bX.m91681IL();
            C9510LZ.m82620IL();
        }
    }

    public static int getChildDirected() {
        if (!ayS.m82477WR("getCoppa")) {
            return -1;
        }
        return DDQ.m85917bg().mo84959IL();
    }

    public static int getDoNotSell() {
        if (!ayS.m82477WR("getCCPA")) {
            return -1;
        }
        return DDQ.m85917bg().ldr();
    }

    public static int getGDPRConsent() {
        if (!ayS.m82477WR("getGdpr")) {
            return -1;
        }
        int mo84956bX = DDQ.m85917bg().mo84956bX();
        if (mo84956bX == 1) {
            return 0;
        }
        if (mo84956bX == 0) {
            return 1;
        }
        return mo84956bX;
    }

    public static void setAppIconId(int i) {
        if (DDQ.m85917bg() != null) {
            DDQ.m85917bg().ldr(i);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i) {
        if (!ayS.m82477WR("setCoppa")) {
            return;
        }
        if (i < -1 || i > 1) {
            i = -1;
        }
        DDQ.m85917bg().mo84958IL(i);
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i) {
        if (!ayS.m82477WR("setCCPA")) {
            return;
        }
        if (i < -1 || i > 1) {
            i = -1;
        }
        DDQ.m85917bg().eqN(i);
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
        ayS.m82477WR("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        DDQ.m85917bg().mo84955bX(i);
    }

    public static void setPackageName(String str) {
        f17697VB = str;
    }

    public static void setUserData(String str) {
        if (DDQ.m85917bg() != null) {
            DDQ.m85917bg().mo84957IL(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.f17701bX;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.f17702bg;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.f17703eo;
    }

    public boolean getDebugLog() {
        return this.f17698IL;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.f17705zx;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.f17700WR)) {
            return f17697VB;
        }
        return this.f17700WR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.f17704iR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.f17699Kg;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.ldr = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zx */
    public void m87032zx(int i) {
        this.f17704iR = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public void m87042bX(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.f17705zx = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m87044IL(String str) {
        this.f17702bg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public void m87039bX(String str) {
        this.f17700WR = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m87034bg(String str) {
        this.f17703eo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m87048IL(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.eqN = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m87033bg(boolean z) {
        this.f17698IL = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m87043IL(boolean z) {
        this.f17699Kg = z;
        C6492bX.m91755bg(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m87038bg(int i) {
        this.f17701bX = i;
    }

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: IL */
        private boolean f17706IL;

        /* renamed from: VB */
        private String f17708VB;

        /* renamed from: WR */
        private String[] f17709WR;

        /* renamed from: bX */
        private int f17710bX;

        /* renamed from: bg */
        private String f17711bg;

        /* renamed from: eo */
        private String f17712eo;
        private int eqN = -1;

        /* renamed from: zx */
        private int f17714zx = -1;
        private int ldr = -1;

        /* renamed from: iR */
        private int f17713iR = 0;

        /* renamed from: Kg */
        private boolean f17707Kg = false;

        public Builder appIcon(int i) {
            this.f17710bX = i;
            return this;
        }

        public Builder appId(String str) {
            this.f17711bg = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.m87044IL(this.f17711bg);
            pAGConfig.m87048IL(this.eqN);
            pAGConfig.m87038bg(this.f17710bX);
            pAGConfig.m87032zx(this.f17713iR);
            pAGConfig.m87043IL(this.f17707Kg);
            pAGConfig.m87042bX(this.f17714zx);
            pAGConfig.eqN(this.ldr);
            pAGConfig.m87033bg(this.f17706IL);
            pAGConfig.m87039bX(this.f17712eo);
            pAGConfig.m87034bg(this.f17708VB);
            return pAGConfig;
        }

        public Builder debugLog(boolean z) {
            this.f17706IL = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.f17709WR = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i) {
            this.eqN = i;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i) {
            this.ldr = i;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
            this.f17714zx = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f17712eo = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f17708VB = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.f17707Kg = z;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.f17713iR = i;
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }
    }
}
