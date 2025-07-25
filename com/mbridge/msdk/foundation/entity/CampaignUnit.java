package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class CampaignUnit extends BaseCampaignUnit implements NoProGuard, Serializable {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.BaseCampaignUnit
    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String m51654c = BaseSameDiTool.m51654c();
            Context m52792c = MBSDKContext.m52746m().m52792c();
            String m51878l = SameDiTool.m51878l(m52792c);
            String m51880k = SameDiTool.m51880k(m52792c);
            if (!SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str = "";
                str2 = str;
            } else {
                str2 = String.valueOf(SameDiTool.m51876m(m52792c));
                str = SameDiTool.m51882j(m52792c) + "x" + SameDiTool.m51886h(m52792c);
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(SameDiTool.m51887h()));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(Integer.valueOf(SameDiTool.m51864s(MBSDKContext.m52746m().m52792c()))));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(SameDiTool.m51862t(MBSDKContext.m52746m().m52792c())));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(str2));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(m51880k));
            stringBuffer2.append(nullToEmpty(m51878l));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(m51654c));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(SameDiTool.m51855x()));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append("");
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(nullToEmpty(CommonConst.f56453V + "," + CommonConst.f56462g));
            stringBuffer2.append(SignedToken.f2767c);
            stringBuffer2.append(SameDiTool.m51885i());
            stringBuffer2.append(SignedToken.f2767c);
            this.cParams = stringBuffer2;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, th.getMessage(), th);
            }
        }
        return this.cParams.toString();
    }
}
