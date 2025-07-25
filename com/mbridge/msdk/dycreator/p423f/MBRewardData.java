package com.mbridge.msdk.dycreator.p423f;

import com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.mbridge.msdk.dycreator.f.a */
/* loaded from: classes6.dex */
public final class MBRewardData implements BaseViewData {

    /* renamed from: a */
    private DyOption f55964a;

    /* renamed from: b */
    private CampaignEx f55965b;

    public MBRewardData(DyOption dyOption) {
        this.f55964a = dyOption;
        this.f55965b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData
    public final CampaignEx getBindData() {
        return this.f55965b;
    }

    @Override // com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData
    public final DyOption getEffectData() {
        return this.f55964a;
    }
}
