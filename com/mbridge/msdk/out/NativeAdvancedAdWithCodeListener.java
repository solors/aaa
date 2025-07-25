package com.mbridge.msdk.out;

import com.mbridge.msdk.p426e.AllTypeErrorMsgToCodeUtils;

/* loaded from: classes6.dex */
public abstract class NativeAdvancedAdWithCodeListener implements NativeAdvancedAdListener {
    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, AllTypeErrorMsgToCodeUtils.m52910a(6000, str), str);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str);
}
