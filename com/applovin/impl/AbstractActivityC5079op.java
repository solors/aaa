package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.C6200R;
import com.facebook.internal.AnalyticsEvents;
import com.maticoo.sdk.MaticooAdsConstant;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.op */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5079op extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f8922a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC4251dc f8923b;

    /* renamed from: com.applovin.impl.op$a */
    /* loaded from: classes2.dex */
    class C5080a extends AbstractView$OnClickListenerC4251dc {
        C5080a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return EnumC5083d.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            return i == EnumC5083d.SETTINGS.ordinal() ? AbstractActivityC5079op.this.m96624c() : AbstractActivityC5079op.this.m96630a();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            if (i == EnumC5083d.SETTINGS.ordinal()) {
                return EnumC5084e.values().length;
            }
            return EnumC5082c.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            if (i == EnumC5083d.SETTINGS.ordinal()) {
                return new C4398fj("SETTINGS");
            }
            return new C4398fj("GDPR APPLICABILITY");
        }
    }

    /* renamed from: com.applovin.impl.op$b */
    /* loaded from: classes2.dex */
    class C5081b implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ C5416j f8925a;

        C5081b(C5416j c5416j) {
            this.f8925a = c5416j;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            if (c4708kb.m97991b() == EnumC5083d.SETTINGS.ordinal()) {
                if (c4708kb.m97992a() == EnumC5084e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f8925a.m95048u().m98783g() != null) {
                        AbstractC5576tp.m94375a(this.f8925a.m95048u().m98783g(), C5416j.m95072m(), this.f8925a);
                    } else {
                        AbstractC5927yp.m92679a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", AbstractActivityC5079op.this);
                    }
                } else if (c4708kb.m97992a() == EnumC5084e.TERMS_OF_SERVICE_URL.ordinal() && this.f8925a.m95048u().m98782h() != null) {
                    AbstractC5576tp.m94375a(this.f8925a.m95048u().m98782h(), C5416j.m95072m(), this.f8925a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.op$c */
    /* loaded from: classes2.dex */
    public enum EnumC5082c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* renamed from: com.applovin.impl.op$d */
    /* loaded from: classes2.dex */
    private enum EnumC5083d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.op$e */
    /* loaded from: classes2.dex */
    public enum EnumC5084e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public List m96624c() {
        ArrayList arrayList = new ArrayList(EnumC5084e.values().length);
        arrayList.add(m96627b());
        arrayList.add(m96623d());
        return arrayList;
    }

    /* renamed from: d */
    private C4176cc m96623d() {
        C4176cc.C4178b m100198d = C4176cc.m100221a().m100198d("Terms of Service URL");
        if (this.f8922a.m95048u().m98782h() != null) {
            m100198d.m100210a(C6200R.C6203drawable.applovin_ic_check_mark_bordered);
            m100198d.m100205b(AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_checkmarkColor, this));
            m100198d.m100206a(true);
        } else {
            m100198d.m100200c(MaticooAdsConstant.VALUE_AD_MEDIATION);
            m100198d.m100206a(false);
        }
        return m100198d.m100211a();
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f8922a;
    }

    public void initialize(C5416j c5416j) {
        this.f8922a = c5416j;
        C5080a c5080a = new C5080a(this);
        this.f8923b = c5080a;
        c5080a.m99823a(new C5081b(c5416j));
        this.f8923b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(C6200R.C6205id.listView)).setAdapter((ListAdapter) this.f8923b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractView$OnClickListenerC4251dc abstractView$OnClickListenerC4251dc = this.f8923b;
        if (abstractView$OnClickListenerC4251dc != null) {
            abstractView$OnClickListenerC4251dc.m99823a((AbstractView$OnClickListenerC4251dc.InterfaceC4252a) null);
        }
    }

    /* renamed from: a */
    private C4176cc m96628a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return C4176cc.m100221a().m100198d("Consent Flow Geography").m100200c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN).m100202b(z).m100211a();
    }

    /* renamed from: b */
    private C4176cc m96625b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return C4176cc.m100221a().m100198d("Debug User Geography").m100200c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : MaticooAdsConstant.VALUE_AD_MEDIATION).m100202b(z).m100211a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List m96630a() {
        ArrayList arrayList = new ArrayList(EnumC5082c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f8922a.m95054s().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography m98787e = this.f8922a.m95048u().m98787e();
        boolean z = AbstractC5927yp.m92645c(this.f8922a) && m98787e != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(C4176cc.m100221a().m100198d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").m100211a());
        arrayList.add(m96628a(consentFlowUserGeography, !z));
        arrayList.add(m96625b(m98787e, z));
        return arrayList;
    }

    /* renamed from: b */
    private C4176cc m96627b() {
        boolean z = this.f8922a.m95048u().m98783g() != null;
        return C4176cc.m100221a().m100198d("Privacy Policy URL").m100210a(z ? C6200R.C6203drawable.applovin_ic_check_mark_bordered : C6200R.C6203drawable.applovin_ic_x_mark).m100205b(AbstractC5539t3.m94551a(z ? C6200R.C6202color.applovin_sdk_checkmarkColor : C6200R.C6202color.applovin_sdk_xmarkColor, this)).m100206a(true).m100211a();
    }
}
