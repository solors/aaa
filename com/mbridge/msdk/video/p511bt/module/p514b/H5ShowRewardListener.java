package com.mbridge.msdk.video.p511bt.module.p514b;

import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.p511bt.module.p513a.MBridgeTempCallback;
import com.mbridge.msdk.videocommon.p536b.Reward;

/* renamed from: com.mbridge.msdk.video.bt.module.b.c */
/* loaded from: classes6.dex */
public final class H5ShowRewardListener extends DefaultShowRewardListener {

    /* renamed from: a */
    private MBridgeTempCallback f60193a;

    /* renamed from: d */
    private String f60194d;

    public H5ShowRewardListener(MBridgeTempCallback mBridgeTempCallback, String str) {
        this.f60193a = mBridgeTempCallback;
        this.f60194d = str;
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49053a(MetricsData metricsData) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onAdShow");
            this.f60193a.mo49069a(this.f60194d);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: b */
    public final void mo49047b(String str, String str2) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onEndcardShow");
            this.f60193a.mo49062c(this.f60194d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49051a(MetricsData metricsData, boolean z, Reward reward) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onAdClose");
            this.f60193a.mo49065a(this.f60194d, z, reward);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49052a(MetricsData metricsData, String str) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onShowFail");
            this.f60193a.mo49067a(this.f60194d, str);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49048a(boolean z, String str, String str2) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onVideoAdClicked");
            this.f60193a.mo49066a(this.f60194d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49050a(String str, String str2) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onVideoComplete");
            this.f60193a.mo49063b(this.f60194d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.p511bt.module.p514b.DefaultShowRewardListener, com.mbridge.msdk.video.p511bt.module.p514b.ShowRewardListener
    /* renamed from: a */
    public final void mo49054a(int i, String str, String str2) {
        if (this.f60193a != null) {
            SameLogTool.m51827a("H5ShowRewardListener", "onAutoLoad");
            this.f60193a.mo49068a(this.f60194d, i, str, str2);
        }
    }
}
