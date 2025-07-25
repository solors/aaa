package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import java.util.List;

/* renamed from: com.mbridge.msdk.reward.adapter.a */
/* loaded from: classes6.dex */
public interface LoadRewardListener {
    /* renamed from: a */
    void mo50017a(String str, MetricsData metricsData);

    /* renamed from: a */
    void mo50016a(List<CampaignEx> list, MBFailureReason mBFailureReason, MetricsData metricsData);

    /* renamed from: a */
    void mo50015a(List<CampaignEx> list, MetricsData metricsData);
}
