package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes6.dex */
public class ECTempleModel extends BaseModel implements IECModel {
    boolean adCloseState;
    boolean adShownState;
    boolean addRewardState;
    boolean endCardShowState;
    boolean eventImpression;
    boolean eventOnlyImpression;
    boolean eventPvUrls;
    boolean eventTrackingImp;
    RewardVideoListener rewardVideoListener;
    boolean trackClick;
    boolean trackClose;
    boolean trackEndCardShow;

    public ECTempleModel(CommandManager commandManager, RewardVideoListener rewardVideoListener) {
        super(commandManager);
        this.endCardShowState = false;
        this.adCloseState = false;
        this.trackEndCardShow = false;
        this.trackClose = false;
        this.trackClick = false;
        this.addRewardState = false;
        this.adShownState = false;
        this.eventImpression = false;
        this.eventOnlyImpression = false;
        this.eventPvUrls = false;
        this.eventTrackingImp = false;
        this.rewardVideoListener = rewardVideoListener;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean eventAddReward(RedirectModel redirectModel) {
        if (this.addRewardState) {
            return true;
        }
        this.addRewardState = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.ADD_REWARD));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void eventImpression(RedirectModel redirectModel) {
        if (!this.eventImpression) {
            this.eventImpression = true;
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.IMPRESSION_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void eventOnlyImpression(RedirectModel redirectModel) {
        if (!this.eventOnlyImpression) {
            this.eventOnlyImpression = true;
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.ONLY_IMPRESSION_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void eventPvUrls(RedirectModel redirectModel) {
        if (!this.eventPvUrls) {
            this.eventPvUrls = true;
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.PV_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean eventTrackingForClick(RedirectModel redirectModel) {
        if (this.trackClick) {
            return true;
        }
        this.trackClick = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_CLICK_URL));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void eventTrackingForEndCardShow(RedirectModel redirectModel, @BridgeParameter(key = "type") int i) {
        if (!this.trackEndCardShow) {
            this.trackEndCardShow = true;
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_EC_SHOW_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean eventTrackingForImpression(RedirectModel redirectModel) {
        if (this.eventTrackingImp) {
            return true;
        }
        this.eventTrackingImp = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_IMPRESSION_URL));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public int getRenderStatus() {
        return 0;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void onAdClick(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener == null) {
            return;
        }
        rewardVideoListener.onVideoAdClicked(mBridgeIds);
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo, @BridgeParameter(key = "type") int i) {
        if (this.adCloseState) {
            return true;
        }
        this.adCloseState = true;
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
            return false;
        }
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z, int i) {
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z, i);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean onAdShow(MBridgeIds mBridgeIds) {
        if (this.adShownState) {
            return true;
        }
        this.adShownState = true;
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
            return false;
        }
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void onEndCardShow(MBridgeIds mBridgeIds, @BridgeParameter(key = "type") int i) {
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null && !this.endCardShowState) {
            this.endCardShowState = true;
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public boolean onShowFail(MBridgeIds mBridgeIds, String str, int i) {
        if (this.adShownState) {
            return true;
        }
        this.adShownState = true;
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
            return false;
        }
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void onCloseViewClick(@BridgeParameter(key = "type") int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IECModel
    public void setRenderStatus(int i) {
    }
}
