package com.mbridge.msdk.video.p511bt.module.p514b;

import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* renamed from: com.mbridge.msdk.video.bt.module.b.a */
/* loaded from: classes6.dex */
public final class DecoratorRewardVideoListener implements InterVideoOutListener {

    /* renamed from: a */
    private RewardVideoListener f60188a;

    /* renamed from: b */
    private String f60189b;

    /* renamed from: c */
    private boolean f60190c;

    public DecoratorRewardVideoListener(RewardVideoListener rewardVideoListener, String str, boolean z) {
        this.f60188a = rewardVideoListener;
        this.f60189b = str;
        this.f60190c = z;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onShowFail(MetricsData metricsData, MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoAdClicked(boolean z, MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f60188a;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    public DecoratorRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.f60189b = "";
        this.f60188a = rewardVideoListener;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}
