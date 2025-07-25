package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p431c.FailureInfo;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsConstResult;
import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.function.p494g.ReportHandler;
import com.mbridge.msdk.newreward.p477a.AdapterModel;
import com.mbridge.msdk.newreward.player.imodel.IBigTempModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.model.BigTemplateModel;
import com.mbridge.msdk.video.dynview.DynamicBean;
import com.mbridge.msdk.video.dynview.MBUIController;
import com.mbridge.msdk.video.dynview.ViewOption;
import com.mbridge.msdk.video.dynview.p517c.EnumError;
import com.mbridge.msdk.video.dynview.p519e.ChoiceOneCallback;
import com.mbridge.msdk.video.dynview.p519e.ViewInflaterCallback;
import com.mbridge.msdk.video.dynview.p528j.ViewOptionWrapper;
import io.bidmachine.protobuf.EventTypeExtended;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class BigTemplatePresenter extends AbsPresenter implements ChoiceOneCallback {
    BigTemplateModel bigTemplateModel;
    IBigTempModel iBigTempModel;
    IBaseView iView;
    CampaignEx.C21961c rewardTemplateMode;
    int videoTemplateCode;

    public BigTemplatePresenter(IBaseView iBaseView) {
        super(iBaseView);
        this.videoTemplateCode = EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE;
        this.redirectModel.setCampaignEx(getDefaultCampaign(this.adapterModel));
        this.TEMPLATE_MARK_TYPE = 1;
        this.iView = iBaseView;
        BigTemplateModel bigTemplateModel = new BigTemplateModel(this.commandManager, this.rewardVideoListener);
        this.bigTemplateModel = bigTemplateModel;
        this.iBigTempModel = (IBigTempModel) Proxy.newProxyInstance(bigTemplateModel.getClass().getClassLoader(), new Class[]{IBigTempModel.class}, new ReportHandler(this.bigTemplateModel, this.adapterModel, this.commandManager));
    }

    private CampaignEx getDefaultCampaign(AdapterModel adapterModel) {
        try {
            if (adapterModel.m50815D() == null || adapterModel.m50815D().m50347a() == null || adapterModel.m50815D().m50347a().isEmpty()) {
                return null;
            }
            return adapterModel.m50815D().m50347a().get(0);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowFail(String str, int i) {
        if (!this.adapterModel.m50794Y()) {
            this.adapterModel.m50731j(true);
            super.adShowFail(str, i);
            IBigTempModel iBigTempModel = this.iBigTempModel;
            if (iBigTempModel != null) {
                iBigTempModel.onShowFail(this.mBridgeIds, str, i);
            }
            finish(true);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        if (!this.adapterModel.m50768ah()) {
            this.adapterModel.m50717q(true);
            this.iBigTempModel.onAdShow(this.mBridgeIds);
            this.iBigTempModel.eventOnlyImpression(this.redirectModel);
        }
    }

    @Override // com.mbridge.msdk.video.dynview.p519e.ChoiceOneCallback
    public void countDownClick() {
        CampaignEx defaultCampaign = getDefaultCampaign(this.adapterModel);
        if (defaultCampaign == null) {
            finish(true);
            return;
        }
        try {
            this.adapterModel.m50784a(defaultCampaign);
            CampaignEx.C21961c c21961c = this.rewardTemplateMode;
            if (c21961c != null) {
                this.videoTemplateCode = c21961c.m52522f();
            }
            CommandManager commandManager = this.commandManager;
            commandManager.m50452g(commandManager.m50468a("add_temple", Integer.valueOf(this.videoTemplateCode), "template_type", 17, "parent_temple", this.data.getRootViewGroup(), "adapter_model", this.adapterModel), CommandType.SHOW_ADD_TEMPLE);
            this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        if (z) {
            Context context = this.context;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        ViewOption m48884a = new ViewOptionWrapper().m48884a(this.context, this.adapterModel.m50815D().m50347a());
        HashMap hashMap = new HashMap();
        hashMap.put("choice_one_callback", this);
        MBUIController.m49040a().m49038a(m48884a, new ViewInflaterCallback() { // from class: com.mbridge.msdk.newreward.player.presenter.BigTemplatePresenter.1
            @Override // com.mbridge.msdk.video.dynview.p519e.ViewInflaterCallback
            public void viewInflaterFail(EnumError enumError) {
                BigTemplatePresenter.this.adShowFail(FailureInfo.m52837a(890008), 890008);
            }

            @Override // com.mbridge.msdk.video.dynview.p519e.ViewInflaterCallback
            public void viewInflaterSuccess(DynamicBean dynamicBean) {
                BigTemplatePresenter.this.initDataForView(dynamicBean);
            }
        }, hashMap);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(DynamicBean dynamicBean) {
        if (dynamicBean != null) {
            try {
                if (dynamicBean.m49046a() != null) {
                    dynamicBean.m49046a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.iView.addViewToCurrentViewGroup(dynamicBean.m49046a());
                }
                this.is_dy = dynamicBean.m49041c();
                adShowSuccess();
                this.iView.initViews(this.is_dy);
            } catch (Exception e) {
                adShowFail(FailureInfo.m52837a(890008), 890008);
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.dynview.p519e.ChoiceOneCallback
    public void itemClick(CampaignEx campaignEx) {
        if (campaignEx == null) {
            finish(true);
            return;
        }
        try {
            campaignEx.setShowType(MetricsConstResult.f56728d);
            this.campaignEx = campaignEx;
            this.adapterModel.m50784a(campaignEx);
            CampaignEx.C21961c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            this.rewardTemplateMode = rewardTemplateMode;
            if (rewardTemplateMode != null) {
                this.videoTemplateCode = rewardTemplateMode.m52522f();
            }
            CommandManager commandManager = this.commandManager;
            commandManager.m50452g(commandManager.m50468a("add_temple", Integer.valueOf(this.videoTemplateCode), "template_type", 17, "adapter_model", this.adapterModel, "parent_temple", this.data.getRootViewGroup()), CommandType.SHOW_ADD_TEMPLE);
            this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }
}
