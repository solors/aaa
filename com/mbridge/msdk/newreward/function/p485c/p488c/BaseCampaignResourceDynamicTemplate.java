package com.mbridge.msdk.newreward.function.p485c.p488c;

import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import java.io.File;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.b */
/* loaded from: classes6.dex */
public abstract class BaseCampaignResourceDynamicTemplate extends BaseCampaignResourceTemplate<File> {

    /* renamed from: b */
    private File f58339b;

    public BaseCampaignResourceDynamicTemplate(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        super(mBridgeCampaigns, mBridgeCampaign);
    }

    /* renamed from: a */
    public final void m50512a(File file) {
        this.f58339b = file;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResourceTemplate
    /* renamed from: g */
    public final boolean mo50507g() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: h */
    public final boolean mo50500h() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResource
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50504a() {
        return this.f58339b;
    }
}
