package com.mbridge.msdk.newreward.function.p485c.p488c;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.e */
/* loaded from: classes6.dex */
public final class CampaignResourceDynamicTemplateBig extends BaseCampaignResourceDynamicTemplate {

    /* renamed from: b */
    private final MBridgeDynamicViewBigTemplateDownloader f58342b;

    public CampaignResourceDynamicTemplateBig(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        super(mBridgeCampaigns, mBridgeCampaign);
        this.f58342b = new MBridgeDynamicViewBigTemplateDownloader(m50516b(), m50514c(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: b_ */
    public final int mo50501b_() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource, com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: j */
    public final String mo50499j() {
        if (m50516b() == null || TextUtils.isEmpty(m50516b().m50619B())) {
            return "";
        }
        return m50516b().m50619B();
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource, com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: l */
    public final MBridgeBaseDownloader mo50497l() {
        return this.f58342b;
    }
}
