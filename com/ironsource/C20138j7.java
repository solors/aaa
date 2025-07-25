package com.ironsource;

import com.ironsource.InterfaceC20501n2;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.j7 */
/* loaded from: classes6.dex */
public class C20138j7<Listener extends InterfaceC20501n2> extends AbstractC19956g7<Listener> implements AdapterAdRewardListener {

    /* renamed from: r */
    private C21008ta f50686r;

    /* renamed from: com.ironsource.j7$a */
    /* loaded from: classes6.dex */
    class C20139a extends AbstractRunnableC21276yp {
        C20139a() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            C20138j7.this.m57866U();
        }
    }

    public C20138j7(InterfaceC20215ko interfaceC20215ko, C20072i1 c20072i1, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C21108v2 c21108v2, C19897f5 c19897f5, Listener listener) {
        super(interfaceC20215ko, c20072i1, baseAdAdapter, c21108v2, c19897f5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m57866U() {
        if (this.f50796g != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(m57712a("placement name = " + m57696j()));
            if (this.f50793d != null) {
                HashMap hashMap = new HashMap();
                if (C20423p.m56615m().m56603s() != null) {
                    for (String str : C20423p.m56615m().m56603s().keySet()) {
                        hashMap.put("custom_" + str, C20423p.m56615m().m56603s().get(str));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f50793d.f54408j.m57920a(m57696j(), this.f50796g.getRewardName(), this.f50796g.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, mo56362c()), C21008ta.m54805a(this.f50686r), hashMap, C20423p.m56615m().m56617l());
            }
            ((InterfaceC20501n2) this.f50791b).mo56231a((C20138j7<?>) this, this.f50796g);
            return;
        }
        IronLog.INTERNAL.verbose(m57712a("placement is null "));
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            C21096ut c21096ut = c21205x1.f54409k;
            c21096ut.m54567f("mCurrentPlacement is null state = " + this.f50794e);
        }
    }

    @Override // com.ironsource.AbstractC19956g7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f50686r = new C21008ta();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC20186k7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f50686r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (!m57685u().mo57624c()) {
            m57866U();
        } else {
            m57685u().mo57625a(new C20139a());
        }
    }
}
