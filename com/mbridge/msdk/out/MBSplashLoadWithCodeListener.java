package com.mbridge.msdk.out;

import com.mbridge.msdk.p426e.AllTypeErrorMsgToCodeUtils;

/* loaded from: classes6.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i) {
        onLoadFailedWithCode(mBridgeIds, AllTypeErrorMsgToCodeUtils.m52910a(5000, str), str, i);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str, int i2);
}
