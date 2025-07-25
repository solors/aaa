package com.mbridge.msdk.out;

import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.p426e.AllTypeErrorMsgToCodeUtils;

/* loaded from: classes6.dex */
public abstract class InterstitialVideoWithCodeListener implements InterstitialVideoListener {
    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, 3900, str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, AllTypeErrorMsgToCodeUtils.m52910a(3000, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);
}
