package com.mbridge.msdk.p411c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.g */
/* loaded from: classes6.dex */
public final class Setting extends BaseSetting {
    /* renamed from: e */
    public static Setting m53287e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BaseSetting.m53476a(new JSONObject(str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("Setting", "parseSetting", e);
            }
            return null;
        }
    }

    /* renamed from: aM */
    public final String m53288aM() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", m53390r());
            jSONObject.put("cfc", m53386t());
            jSONObject.put("cfb", m53470aE());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, m53460ac());
            jSONObject.put("awct", m53394p());
            jSONObject.put("rurl", m53465aJ());
            jSONObject.put("ujds", m53464aK());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, m53459ad());
            jSONObject.put("tcto", m53445ar());
            jSONObject.put("mv_wildcard", m53486V());
            jSONObject.put("is_startup_crashsystem", m53496L());
            jSONObject.put("sfct", m53448ao());
            jSONObject.put("pcrn", m53482Z());
            jSONObject.put("adct", m53402l());
            jSONObject.put("atrqt", m53396o());
            jSONObject.put("omsdkjs_url", m53484X());
            jSONObject.put("mcs", m53488T());
            jSONObject.put("GDPR_area", m53467aH());
            jSONObject.put("alrbs", m53400m());
            jSONObject.put("ct", m53507A());
            jSONObject.put("isDefault", m53497K());
            jSONObject.put("st_net", m53446aq());
            jSONObject.put("vtag", m53438ay());
            return jSONObject.toString();
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("Setting", "toJSON", th);
            }
            return null;
        }
    }
}
