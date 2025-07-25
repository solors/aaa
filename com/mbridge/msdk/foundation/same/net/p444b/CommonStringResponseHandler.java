package com.mbridge.msdk.foundation.same.net.p444b;

import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p447e.CommonHttpConfig;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.foundation.same.net.b.a */
/* loaded from: classes6.dex */
public abstract class CommonStringResponseHandler extends Listener<String> {

    /* renamed from: a */
    private static final String f56582a = "a";

    /* renamed from: a */
    public abstract void mo52213a(String str);

    /* renamed from: b */
    public abstract void mo52212b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        String str = f56582a;
        SameLogTool.m51824b(str, "errorCode = " + commonError.f56579a);
        mo52213a(CommonHttpConfig.m52203a(commonError));
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<String> c21990d) {
        if (c21990d != null) {
            mo52212b(c21990d.f56586c);
        }
    }
}
