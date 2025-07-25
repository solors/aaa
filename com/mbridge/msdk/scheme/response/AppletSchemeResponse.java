package com.mbridge.msdk.scheme.response;

import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AppletSchemeResponse extends Listener<JSONObject> {
    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        super.onError(commonError);
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<JSONObject> c21990d) {
        super.onSuccess(c21990d);
    }
}
