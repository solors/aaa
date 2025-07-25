package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsConstResult;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.function.command.receiver.ReceiverFactory;
import com.mbridge.msdk.newreward.function.p494g.ReportHandler;
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.model.ECTempleModel;
import com.mbridge.msdk.newreward.player.redirect.UrlReDirectController;
import com.mbridge.msdk.video.dynview.DynamicBean;
import java.lang.reflect.Proxy;

/* loaded from: classes6.dex */
public class ECVastPresenter extends AbsPresenter {
    private final String TAG;
    IECModel ecTempleModel;
    IBaseView mBaseView;

    public ECVastPresenter(IBaseView iBaseView) {
        super(iBaseView);
        this.TAG = "ECVastPresenter";
        this.mBaseView = (IBaseView) Proxy.newProxyInstance(iBaseView.getClass().getClassLoader(), new Class[]{IBaseView.class}, new ReportHandler(iBaseView, this.adapterModel, this.commandManager));
        this.ecTempleModel = (IECModel) Proxy.newProxyInstance(ECTempleModel.class.getClassLoader(), new Class[]{IECModel.class}, new ReportHandler(new ECTempleModel(this.commandManager, this.rewardVideoListener), this.adapterModel, this.commandManager));
        this.TEMPLATE_MARK_TYPE = 3;
    }

    private void closeViewClick() {
        try {
            this.mBaseView.removeTempleFromSuperView(this.data.getRootViewGroup());
            if (isIVRewardEnable()) {
                this.rewardVideoListener.onAdCloseWithIVReward(this.mBridgeIds, this.adapterModel.m50774ab(), this.adapterModel.m50711w());
            }
            adClosed();
            this.ecTempleModel.onCloseViewClick(1);
            if (!this.isIV && !this.adapterModel.m50795X() && this.adapterModel.m50774ab()) {
                this.adapterModel.m50733i(true);
                this.ecTempleModel.eventAddReward(this.redirectModel);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("ECVastPresenter", e.getMessage());
        }
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (view != null) {
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_vastclose")) {
                closeViewClick();
            }
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_vastok")) {
                new UrlReDirectController().setCommandManager(this.commandManager);
                CampaignEx campaignEx = this.campaignEx;
                if (campaignEx != null) {
                    campaignEx.setClickTempSource(MetricsConstResult.f56732h);
                }
                this.ecTempleModel.eventClickUrl(this.redirectModel);
                this.ecTempleModel.eventTrackingForClick(this.redirectModel);
                this.ecTempleModel.onAdClick(this.mBridgeIds);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        ReceiverFactory.m50389a().m50383d(CommandType.SHOW_OR_PRELOAD_WEB_EC);
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        initDataForView(null);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(DynamicBean dynamicBean) {
        this.mBaseView.initViews(false);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }
}
