package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.j */
/* loaded from: classes6.dex */
public class DomainDeviceInfo extends BaseDomainDeviceInfo {

    /* renamed from: w */
    public int f57005w;

    /* renamed from: x */
    public int f57006x;

    public DomainDeviceInfo(Context context) {
        super(context);
        this.f57006x = SameDiTool.m51873o();
        this.f57005w = SameDiTool.m51891f();
    }

    @Override // com.mbridge.msdk.foundation.tools.BaseDomainDeviceInfo
    /* renamed from: a */
    public JSONObject mo51647a() {
        JSONObject mo51647a = super.mo51647a();
        try {
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f57006x + "");
                jSONObject.put("dmf", this.f57005w);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("DomainDeviceInfo", e.getMessage());
            }
        }
        return mo51647a;
    }
}
