package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.Frequence;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.FrequenceDao;

/* renamed from: com.mbridge.msdk.foundation.tools.n */
/* loaded from: classes6.dex */
public class DomainSameTool extends BaseDomainSameTool {
    /* renamed from: a */
    public static void m51645a(Context context, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        FrequenceDao m52576a = FrequenceDao.m52576a(CommonSDKDBHelper.m52593a(context));
        if (campaignEx != null && m52576a != null && !m52576a.m52572b(campaignEx.getId())) {
            Frequence frequence = new Frequence();
            frequence.m52462a(campaignEx.getId());
            frequence.m52460b(campaignEx.getFca());
            frequence.m52458c(campaignEx.getFcb());
            frequence.m52464a(0);
            frequence.m52456d(0);
            frequence.m52463a(System.currentTimeMillis());
            m52576a.m52575a(frequence);
        }
    }
}
