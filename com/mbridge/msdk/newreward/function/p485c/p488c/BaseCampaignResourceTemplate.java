package com.mbridge.msdk.newreward.function.p485c.p488c;

import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.d */
/* loaded from: classes6.dex */
public abstract class BaseCampaignResourceTemplate<Resource> extends BaseCampaignResource<Resource> {
    public BaseCampaignResourceTemplate(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        super(mBridgeCampaigns, mBridgeCampaign);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource
    /* renamed from: d */
    public final boolean mo50509d() {
        if (!mo50507g() && !super.mo50509d()) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource
    /* renamed from: e */
    public final boolean mo50508e() {
        if (!mo50507g() && !super.mo50508e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public abstract boolean mo50507g();

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: k */
    public final boolean mo50498k() {
        return true;
    }
}
