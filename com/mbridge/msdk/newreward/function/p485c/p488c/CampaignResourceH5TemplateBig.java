package com.mbridge.msdk.newreward.function.p485c.p488c;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.i */
/* loaded from: classes6.dex */
public final class CampaignResourceH5TemplateBig extends BaseCampaignResourceH5Template {
    public CampaignResourceH5TemplateBig(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        super(mBridgeCampaigns, mBridgeCampaign);
        m50515b(true);
        m50517a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResourceH5Template
    /* renamed from: a_ */
    protected final boolean mo50505a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: b_ */
    public final int mo50501b_() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource, com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: j */
    public final String mo50499j() {
        if (m50514c() == null) {
            return "";
        }
        String m50619B = m50516b().m50619B();
        if (TextUtils.isEmpty(m50619B)) {
            return "";
        }
        return m50619B;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource, com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: l */
    public final MBridgeBaseDownloader mo50497l() {
        return new MbridgeH5ResourceDownloaderEmpty(m50516b(), m50514c(), this);
    }
}
