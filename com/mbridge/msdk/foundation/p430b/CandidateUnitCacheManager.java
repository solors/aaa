package com.mbridge.msdk.foundation.p430b;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.p434db.CacheCampaignDao;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.b.d */
/* loaded from: classes6.dex */
public final class CandidateUnitCacheManager extends BaseCandidateCache {
    public CandidateUnitCacheManager(String str, JSONArray jSONArray) {
        this.f56041a = CacheCampaignDao.m52652a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
        m52878a(jSONArray);
        m52872e(str);
    }
}
