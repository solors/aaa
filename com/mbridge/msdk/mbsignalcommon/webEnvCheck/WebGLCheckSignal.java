package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* renamed from: g */
    public static final /* synthetic */ int f57714g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            MBSDKContext.m52746m().m52791c(jSONObject.optInt("webgl"));
            MBSDKContext.m52746m().m52797a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
