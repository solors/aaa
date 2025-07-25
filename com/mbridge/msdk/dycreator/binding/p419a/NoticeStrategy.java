package com.mbridge.msdk.dycreator.binding.p419a;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData;

/* renamed from: com.mbridge.msdk.dycreator.binding.a.e */
/* loaded from: classes6.dex */
public final class NoticeStrategy<T extends View, K> implements BaseStrategy {
    @Override // com.mbridge.msdk.dycreator.binding.base.BaseStrategy
    public final void bindClickData(View view, BaseViewData baseViewData) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(baseViewData);
        splashResData.seteAction(EAction.NOTICE);
        EventBus.getDefault().post(splashResData);
    }
}
