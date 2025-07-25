package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.p423f.MBRewardData;
import com.mbridge.msdk.dycreator.p425g.ClickSubject;
import com.mbridge.msdk.dycreator.p425g.ConcreteSubject;
import com.mbridge.msdk.dycreator.p425g.EffectSubject;
import com.mbridge.msdk.dycreator.p425g.ReportSubject;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes6.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* renamed from: a */
    private ConcreteSubject f55974a;

    /* renamed from: b */
    private ClickSubject f55975b;

    /* renamed from: c */
    private EffectSubject f55976c;

    /* renamed from: d */
    private ReportSubject f55977d;

    /* renamed from: e */
    private DynamicViewBackListener f55978e;

    /* renamed from: f */
    private DyOption f55979f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f55979f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f55978e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(ClickSubject clickSubject) {
        if (clickSubject != null) {
            this.f55975b = clickSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        if (concreteSubject != null) {
            this.f55974a = concreteSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f55978e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(EffectSubject effectSubject) {
        if (effectSubject != null) {
            this.f55976c = effectSubject;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBRewardData mBRewardData = new MBRewardData(this.f55979f);
        ConcreteSubject concreteSubject = this.f55974a;
        if (concreteSubject != null) {
            concreteSubject.m52933a(mBRewardData);
        }
        ClickSubject clickSubject = this.f55975b;
        if (clickSubject != null) {
            clickSubject.m52934a(mBRewardData);
        }
        EffectSubject effectSubject = this.f55976c;
        if (effectSubject != null) {
            effectSubject.m52931a(mBRewardData);
        }
        ReportSubject reportSubject = this.f55977d;
        if (reportSubject != null) {
            reportSubject.m52929a(mBRewardData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(ReportSubject reportSubject) {
        if (reportSubject != null) {
            this.f55977d = reportSubject;
        }
    }
}
