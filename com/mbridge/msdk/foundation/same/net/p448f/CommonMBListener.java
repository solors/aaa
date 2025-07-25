package com.mbridge.msdk.foundation.same.net.p448f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import com.mbridge.msdk.foundation.same.net.p447e.CommonHttpConfig;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.d */
/* loaded from: classes6.dex */
public abstract class CommonMBListener extends Listener<JSONObject> {

    /* renamed from: a */
    private static final String f56674a = "d";

    /* renamed from: a */
    private void m52178a(C21990d<JSONObject> c21990d) {
        JSONObject jSONObject = c21990d.f56586c;
        if (jSONObject == null) {
            mo48368a("response result is null");
            return;
        }
        int optInt = jSONObject.optInt("status", -9999);
        if (optInt == -9999) {
            mo48367a(c21990d.f56586c);
        } else if (optInt != 1 && optInt != 200) {
            String optString = c21990d.f56586c.optString("msg");
            if (TextUtils.isEmpty(optString)) {
                optString = "error message is null";
            }
            mo48368a(optString);
        } else {
            mo48367a(c21990d.f56586c.optJSONObject("data"));
        }
    }

    /* renamed from: a */
    public abstract void mo48368a(String str);

    /* renamed from: a */
    public abstract void mo48367a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        String str = f56674a;
        SameLogTool.m51824b(str, "errorCode = " + commonError.f56579a);
        mo48368a(CommonHttpConfig.m52203a(commonError));
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<JSONObject> c21990d) {
        if (c21990d == null) {
            mo48368a("response is null");
            return;
        }
        super.onSuccess(c21990d);
        C21991a c21991a = c21990d.f56585b;
        if (c21991a == null) {
            m52178a(c21990d);
        } else if (c21991a.f56590d == 204) {
            mo48367a(new JSONObject());
        } else {
            m52178a(c21990d);
        }
    }
}
