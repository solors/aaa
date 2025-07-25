package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.imodel.IBigTempModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes6.dex */
public class BigTemplateModel extends BaseModel implements IBigTempModel {
    boolean adShownState;
    boolean eventImpression;
    RewardVideoListener rewardVideoListener;

    public BigTemplateModel(CommandManager commandManager, RewardVideoListener rewardVideoListener) {
        super(commandManager);
        this.adShownState = false;
        this.eventImpression = false;
        this.rewardVideoListener = rewardVideoListener;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IBigTempModel
    public void eventOnlyImpression(RedirectModel redirectModel) {
        if (!this.eventImpression) {
            this.eventImpression = true;
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.ONLY_IMPRESSION_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IBigTempModel
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

    @Override // com.mbridge.msdk.newreward.player.imodel.IBigTempModel
    public boolean onShowFail(MBridgeIds mBridgeIds, @BridgeParameter(key = "reason") String str, @BridgeParameter(key = "code") int i) {
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
}
