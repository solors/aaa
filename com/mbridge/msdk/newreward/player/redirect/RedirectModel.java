package com.mbridge.msdk.newreward.player.redirect;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.newreward.function.p492e.SettingModel;
import com.mbridge.msdk.newreward.p477a.DevExtraData;
import com.mbridge.msdk.videocommon.p536b.Reward;

/* loaded from: classes6.dex */
public class RedirectModel {
    private CampaignEx campaignEx;
    public int clickSenario = 0;
    public Context context;
    private int currPercentAge;
    public DevExtraData devExtraData;
    private int endScreenType;
    private int percentRate;
    public RedirectType redirectType;
    public Reward reward;
    public SettingModel settingModel;
    public String unitId;
    private int videoSourceCompleteTime;
    public float xInScreen;
    public float yInScreen;

    public CampaignEx getCampaignEx() {
        return this.campaignEx;
    }

    public int getClickSenario() {
        return this.clickSenario;
    }

    public Context getContext() {
        return this.context;
    }

    public int getCurrPercentAge() {
        return this.currPercentAge;
    }

    public DevExtraData getDevExtraData() {
        return this.devExtraData;
    }

    public int getEndScreenType() {
        return this.endScreenType;
    }

    public int getPercentRate() {
        return this.percentRate;
    }

    public RedirectType getRedirectType() {
        return this.redirectType;
    }

    public Reward getReward() {
        return this.reward;
    }

    public SettingModel getSettingModel() {
        return this.settingModel;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public int getVideoSourceCompleteTime() {
        return this.videoSourceCompleteTime;
    }

    public int getxInScreen() {
        return SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.xInScreen);
    }

    public int getyInScreen() {
        return SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.yInScreen);
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.campaignEx = campaignEx;
    }

    public void setClickSenario(int i) {
        this.clickSenario = i;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setCurrPercentAge(int i) {
        this.currPercentAge = i;
    }

    public void setDevExtraData(DevExtraData devExtraData) {
        this.devExtraData = devExtraData;
    }

    public void setEndScreenType(int i) {
        this.endScreenType = i;
    }

    public void setPercentRate(int i) {
        this.percentRate = i;
    }

    public RedirectModel setRedirectType(RedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public void setSettingModel(SettingModel settingModel) {
        this.settingModel = settingModel;
        if (settingModel != null && settingModel.m50306b() != null) {
            setEndScreenType(settingModel.m50306b().m48271q());
        }
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void setVideoSourceCompleteTime(int i) {
        this.videoSourceCompleteTime = i;
    }

    public void setxInScreen(float f) {
        this.xInScreen = f;
    }

    public void setyInScreen(float f) {
        this.yInScreen = f;
    }
}
