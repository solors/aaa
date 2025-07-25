package com.mbridge.msdk.newout;

import android.content.Context;
import com.mbridge.msdk.newreward.p481b.IController;
import com.mbridge.msdk.newreward.p481b.RewardVideoController;

/* loaded from: classes6.dex */
public class MBRewardVideoHandler implements IMBRRewardVideoHandler {
    private IController controller;
    private String unitId;

    public MBRewardVideoHandler(Context context, String str, String str2) {
        this.controller = null;
        this.controller = new RewardVideoController(94, str, str2, false);
        this.unitId = str2;
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public boolean isReady() {
        return this.controller.mo50686a(true);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load(String str) {
        this.controller.mo50685a(true, str);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.controller.mo50688a(rewardVideoListener);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void show(String str) {
        this.controller.mo50687a(str, "", "");
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load() {
        this.controller.mo50685a(true, "");
    }
}
