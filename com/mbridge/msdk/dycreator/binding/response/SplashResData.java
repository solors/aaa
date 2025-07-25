package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData;

/* loaded from: classes6.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a */
    private BaseViewData f55895a;

    /* renamed from: b */
    private EAction f55896b;

    public BaseViewData getBaseViewData() {
        return this.f55895a;
    }

    public EAction geteAction() {
        return this.f55896b;
    }

    public void setBaseViewData(BaseViewData baseViewData) {
        this.f55895a = baseViewData;
    }

    public void seteAction(EAction eAction) {
        this.f55896b = eAction;
    }
}
