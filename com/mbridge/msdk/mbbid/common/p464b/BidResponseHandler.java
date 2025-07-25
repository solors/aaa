package com.mbridge.msdk.mbbid.common.p464b;

import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import com.mbridge.msdk.foundation.same.net.p447e.CommonHttpConfig;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.tracker.network.C22909h;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbid.common.b.b */
/* loaded from: classes6.dex */
public abstract class BidResponseHandler extends Listener<JSONObject> {

    /* renamed from: a */
    private static final String f57380a = "b";

    public BidResponseHandler(String str, String str2) {
        this.unitId = str2;
        this.placementId = str;
    }

    /* renamed from: a */
    public abstract void mo51359a(int i, String str);

    /* renamed from: a */
    public abstract void mo51358a(BidResponsedEx bidResponsedEx);

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        String str = f57380a;
        SameLogTool.m51824b(str, "errorCode = " + commonError.f56579a);
        mo51359a(commonError.f56579a, CommonHttpConfig.m52203a(commonError));
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<JSONObject> c21990d) {
        C21991a c21991a;
        super.onSuccess(c21990d);
        if (c21990d != null && (c21991a = c21990d.f56585b) != null) {
            List<C22909h> list = c21991a.f56588b;
            JSONObject jSONObject = c21990d.f56586c;
            int optInt = jSONObject.optInt("status");
            if (200 == optInt) {
                BidResponsedEx parseBidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.unitId);
                if (parseBidResponsedEx != null) {
                    mo51358a(parseBidResponsedEx);
                    return;
                } else {
                    mo51359a(optInt, jSONObject.optString("msg"));
                    return;
                }
            }
            mo51359a(optInt, jSONObject.optString("msg"));
        }
    }
}
