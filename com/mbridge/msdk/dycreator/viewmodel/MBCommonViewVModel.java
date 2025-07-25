package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.p425g.ClickSubject;
import com.mbridge.msdk.dycreator.p425g.ConcreteSubject;
import com.mbridge.msdk.dycreator.p425g.EffectSubject;
import com.mbridge.msdk.dycreator.p425g.ReportSubject;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes6.dex */
public class MBCommonViewVModel implements BaseViewModel {

    /* renamed from: a */
    private ConcreteSubject f55969a;

    /* renamed from: b */
    private ClickSubject f55970b;

    /* renamed from: c */
    private EffectSubject f55971c;

    /* renamed from: d */
    private ReportSubject f55972d;

    /* renamed from: e */
    private DynamicViewBackListener f55973e;

    public MBCommonViewVModel() {
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f55973e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(ClickSubject clickSubject) {
        if (clickSubject != null) {
            this.f55970b = clickSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        if (concreteSubject != null) {
            this.f55969a = concreteSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f55973e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(EffectSubject effectSubject) {
        if (effectSubject != null) {
            this.f55971c = effectSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(ReportSubject reportSubject) {
        if (reportSubject != null) {
            this.f55972d = reportSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
    }
}
