package com.mbridge.msdk.newreward.function.p485c.p488c;

import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.c */
/* loaded from: classes6.dex */
public abstract class BaseCampaignResourceH5Template extends BaseCampaignResourceTemplate<String> {

    /* renamed from: b */
    protected Boolean f58340b;

    /* renamed from: c */
    private String f58341c;

    public BaseCampaignResourceH5Template(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        super(mBridgeCampaigns, mBridgeCampaign);
        this.f58340b = null;
    }

    /* renamed from: a */
    public final void m50511a(String str) {
        this.f58341c = str;
    }

    /* renamed from: a_ */
    protected abstract boolean mo50505a_();

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResourceTemplate
    /* renamed from: g */
    public final boolean mo50507g() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: h */
    public final boolean mo50500h() {
        Boolean bool = this.f58340b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(mo50505a_());
        this.f58340b = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: i */
    public final String m50510i() {
        return this.f58341c;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50504a() {
        return this.f58341c;
    }
}
