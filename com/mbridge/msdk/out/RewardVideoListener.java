package com.mbridge.msdk.out;

/* loaded from: classes6.dex */
public interface RewardVideoListener extends com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener {
    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onAdShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onEndcardShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onLoadSuccess(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onShowFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onVideoAdClicked(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onVideoComplete(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.RewardVideoListener
    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
