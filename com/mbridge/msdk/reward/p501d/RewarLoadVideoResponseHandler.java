package com.mbridge.msdk.reward.p501d;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C22909h;
import java.util.List;

/* renamed from: com.mbridge.msdk.reward.d.a */
/* loaded from: classes6.dex */
public abstract class RewarLoadVideoResponseHandler extends RewardResponseHandler {
    /* renamed from: a */
    public abstract void mo49999a(int i, String str, MetricsData metricsData);

    /* renamed from: a */
    public abstract void mo49998a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.p501d.RewardResponseHandler
    /* renamed from: a */
    public final void mo49994a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.reward.p501d.RewardResponseHandler
    /* renamed from: b */
    public final void mo49991b(int i, String str, MetricsData metricsData) {
        mo49999a(i, str, metricsData);
    }

    @Override // com.mbridge.msdk.reward.p501d.RewardResponseHandler
    /* renamed from: a */
    public final void mo49993a(List<C22909h> list, CampaignUnit campaignUnit) {
        mo49998a(campaignUnit);
    }
}
