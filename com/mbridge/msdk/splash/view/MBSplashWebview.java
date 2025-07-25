package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;

/* loaded from: classes6.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* renamed from: e */
    private static final String f59615e = "MBSplashWebview";

    /* renamed from: f */
    private String f59616f;

    /* renamed from: g */
    private AdSession f59617g;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f59617g;
            if (adSession != null) {
                adSession.finish();
                this.f59617g = null;
                SameLogTool.m51827a(POBOMSDKUtil.TAG, "finish adSession");
            }
        } catch (Exception e) {
            SameLogTool.m51827a(POBOMSDKUtil.TAG, e.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f59617g;
    }

    public String getRequestId() {
        return this.f59616f;
    }

    public void setAdSession(AdSession adSession) {
        this.f59617g = adSession;
    }

    public void setRequestId(String str) {
        this.f59616f = str;
    }
}
