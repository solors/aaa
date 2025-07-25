package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.p425g.ClickSubject;
import com.mbridge.msdk.dycreator.p425g.ConcreteSubject;
import com.mbridge.msdk.dycreator.p425g.EffectSubject;
import com.mbridge.msdk.dycreator.p425g.ReportSubject;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes6.dex */
public interface BaseViewModel {
    void setClickSubject(ClickSubject clickSubject);

    void setConcreteSubject(ConcreteSubject concreteSubject);

    void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener);

    void setEffectSubject(EffectSubject effectSubject);

    void setModelDataAndBind();

    void setReportSubject(ReportSubject reportSubject);
}
