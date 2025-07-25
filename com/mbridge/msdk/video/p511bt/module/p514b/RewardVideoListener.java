package com.mbridge.msdk.video.p511bt.module.p514b;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* renamed from: com.mbridge.msdk.video.bt.module.b.g */
/* loaded from: classes6.dex */
public interface RewardVideoListener {
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdShow(MBridgeIds mBridgeIds);

    void onEndcardShow(MBridgeIds mBridgeIds);

    void onLoadSuccess(MBridgeIds mBridgeIds);

    void onShowFail(MBridgeIds mBridgeIds, String str);

    void onVideoAdClicked(MBridgeIds mBridgeIds);

    void onVideoComplete(MBridgeIds mBridgeIds);

    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
