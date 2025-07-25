package com.mbridge.msdk.video.p511bt.module.p514b;

import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.videocommon.p536b.Reward;

/* renamed from: com.mbridge.msdk.video.bt.module.b.b */
/* loaded from: classes6.dex */
public class DefaultShowRewardListener implements ShowRewardListener {

    /* renamed from: b */
    public boolean f60191b = false;

    /* renamed from: c */
    public boolean f60192c = false;

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49053a(MetricsData metricsData) {
        SameLogTool.m51827a("ShowRewardListener", "onAdShow");
        this.f60191b = true;
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: b */
    public void mo49047b(String str, String str2) {
        SameLogTool.m51827a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49051a(MetricsData metricsData, boolean z, Reward reward) {
        SameLogTool.m51827a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + reward);
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49052a(MetricsData metricsData, String str) {
        SameLogTool.m51827a("ShowRewardListener", "onShowFail:" + str);
        this.f60192c = true;
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49048a(boolean z, String str, String str2) {
        SameLogTool.m51827a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49050a(String str, String str2) {
        SameLogTool.m51827a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49049a(boolean z, int i) {
        SameLogTool.m51827a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public void mo49054a(int i, String str, String str2) {
        SameLogTool.m51827a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
