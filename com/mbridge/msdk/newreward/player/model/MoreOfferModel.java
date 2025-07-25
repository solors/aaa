package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel;
import com.mbridge.msdk.newreward.player.redirect.MoreOfferRedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MoreOfferModel extends BaseModel implements IMoreOfferModel {
    boolean eventOnlyImpression;
    public final List<Integer> mImpressionId;

    public MoreOfferModel(CommandManager commandManager) {
        super(commandManager);
        this.eventOnlyImpression = false;
        this.mImpressionId = new ArrayList();
    }

    public void eventImpression(MoreOfferRedirectModel moreOfferRedirectModel) {
        int itemPositionId = moreOfferRedirectModel.getItemPositionId();
        if (this.mImpressionId.contains(Integer.valueOf(itemPositionId))) {
            return;
        }
        this.mImpressionId.add(Integer.valueOf(itemPositionId));
        sendDirectEvent(moreOfferRedirectModel.setRedirectType(RedirectType.IMPRESSION_URL));
    }

    public void eventOnlyImpression(MoreOfferRedirectModel moreOfferRedirectModel) {
        if (!this.eventOnlyImpression) {
            this.eventOnlyImpression = true;
            sendDirectEvent(moreOfferRedirectModel.setRedirectType(RedirectType.ONLY_IMPRESSION_URL));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel
    public void onMoreOfferRes(@BridgeParameter(key = "result") String str, @BridgeParameter(key = "retry") String str2) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel
    public void onMoreOfferRes(@BridgeParameter(key = "code") String str, @BridgeParameter(key = "result") String str2, @BridgeParameter(key = "retry") String str3) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel
    public void onMoreOfferReq(@BridgeParameter(key = "retry") String str) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel
    public void onMoreOfferShow(@BridgeParameter(key = "scene") String str) {
    }
}
