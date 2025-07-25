package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC20186k7;
import com.ironsource.InterfaceC19667c2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Locale;

/* renamed from: com.ironsource.g7 */
/* loaded from: classes6.dex */
public abstract class AbstractC19956g7<Listener extends InterfaceC19667c2> extends AbstractC20186k7<Listener> implements AdapterAdInteractionListener {

    /* renamed from: com.ironsource.g7$a */
    /* loaded from: classes6.dex */
    class C19957a extends AbstractRunnableC21276yp {
        C19957a() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58467P();
        }
    }

    /* renamed from: com.ironsource.g7$b */
    /* loaded from: classes6.dex */
    class C19958b extends AbstractRunnableC21276yp {
        C19958b() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58464S();
        }
    }

    /* renamed from: com.ironsource.g7$c */
    /* loaded from: classes6.dex */
    class C19959c extends AbstractRunnableC21276yp {
        C19959c() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58466Q();
        }
    }

    /* renamed from: com.ironsource.g7$d */
    /* loaded from: classes6.dex */
    class C19960d extends AbstractRunnableC21276yp {
        C19960d() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58463T();
        }
    }

    /* renamed from: com.ironsource.g7$e */
    /* loaded from: classes6.dex */
    class C19961e extends AbstractRunnableC21276yp {
        C19961e() {
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58465R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.g7$f */
    /* loaded from: classes6.dex */
    public class C19962f extends AbstractRunnableC21276yp {

        /* renamed from: a */
        final /* synthetic */ int f50187a;

        /* renamed from: b */
        final /* synthetic */ String f50188b;

        C19962f(int i, String str) {
            this.f50187a = i;
            this.f50188b = str;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC19956g7.this.m58458b(this.f50187a, this.f50188b);
        }
    }

    public AbstractC19956g7(InterfaceC20215ko interfaceC20215ko, C20072i1 c20072i1, BaseAdAdapter<?, ?> baseAdAdapter, C21108v2 c21108v2, C19897f5 c19897f5, Listener listener) {
        super(interfaceC20215ko, c20072i1, baseAdAdapter, c21108v2, c19897f5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m58467P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57704d());
        synchronized (this.f50806q) {
            if (this.f50794e == AbstractC20186k7.EnumC20194h.SHOWING) {
                m57718a(AbstractC20186k7.EnumC20194h.NONE);
                if (this.f50793d != null) {
                    String str2 = "";
                    if (this.f50790a.m58063a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        String mo58618d = ((InterfaceC19667c2) this.f50791b).mo58618d();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("otherInstanceAvailable = ");
                        if (mo58618d.length() > 0) {
                            str = "true|" + mo58618d;
                        } else {
                            str = "false";
                        }
                        sb2.append(str);
                        str2 = sb2.toString();
                    }
                    this.f50793d.f54408j.m57921a(m57696j(), str2);
                }
                ((InterfaceC19667c2) this.f50791b).mo58627a(this);
                return;
            }
            ironLog.error("unexpected ad closed for " + m57695k() + " - state = " + this.f50794e);
            C21205x1 c21205x1 = this.f50793d;
            if (c21205x1 != null) {
                c21205x1.f54409k.m54563j("unexpected ad closed - state = " + this.f50794e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m58466Q() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57914d(m57696j());
        }
        ((InterfaceC19667c2) this.f50791b).mo58619c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m58465R() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57906l(m57696j());
        }
        ((InterfaceC19667c2) this.f50791b).mo58620b((AbstractC19956g7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m58464S() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57909i(m57696j());
        }
        ((InterfaceC19667c2) this.f50791b).mo58617d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m58463T() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57907k(m57696j());
        }
    }

    /* renamed from: a */
    static String m58459a(AbstractC20186k7.EnumC20194h enumC20194h, int i, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", enumC20194h, Integer.valueOf(i), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m58458b(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("error = " + i + ", " + str));
        AbstractC20186k7.EnumC20194h enumC20194h = this.f50794e;
        if (enumC20194h == AbstractC20186k7.EnumC20194h.SHOWING) {
            m57718a(AbstractC20186k7.EnumC20194h.FAILED);
            C21205x1 c21205x1 = this.f50793d;
            if (c21205x1 != null) {
                c21205x1.f54408j.m57922a(m57696j(), i, str, "");
            }
            ((InterfaceC19667c2) this.f50791b).mo58625a(new IronSourceError(i, str), (AbstractC19956g7<?>) this);
            return;
        }
        String m58459a = m58459a(enumC20194h, i, str);
        ironLog.error(m57712a(m58459a));
        C21205x1 c21205x12 = this.f50793d;
        if (c21205x12 != null) {
            c21205x12.f54409k.m54555r(m58459a);
        }
    }

    @Override // com.ironsource.AbstractC20186k7
    /* renamed from: B */
    public boolean mo57732B() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter;
        if (this.f50800k == null || !m57681y()) {
            return false;
        }
        try {
            baseAdAdapter = this.f50792c;
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.f50794e;
            IronLog.INTERNAL.error(m57712a(str));
            C21205x1 c21205x1 = this.f50793d;
            if (c21205x1 != null) {
                c21205x1.f54409k.m54567f(str);
            }
        }
        if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) baseAdAdapter).isAdAvailable(this.f50800k);
        }
        IronLog.INTERNAL.error(m57712a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        C21205x1 c21205x12 = this.f50793d;
        if (c21205x12 != null) {
            c21205x12.f54409k.m54567f("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (!m57685u().mo57624c()) {
            m58467P();
        } else {
            m57685u().mo57625a(new C19957a());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (!m57685u().mo57624c()) {
            m58466Q();
        } else {
            m57685u().mo57625a(new C19959c());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        if (!m57685u().mo57624c()) {
            m58458b(i, str);
        } else {
            m57685u().mo57625a(new C19962f(i, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (!m57685u().mo57624c()) {
            m58465R();
        } else {
            m57685u().mo57625a(new C19961e());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (!m57685u().mo57624c()) {
            m58464S();
        } else {
            m57685u().mo57625a(new C19958b());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (!m57685u().mo57624c()) {
            m58463T();
        } else {
            m57685u().mo57625a(new C19960d());
        }
    }

    /* renamed from: a */
    public void m58462a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("placementName = " + placement.getPlacementName()));
        try {
            this.f50796g = placement;
            m57718a(AbstractC20186k7.EnumC20194h.SHOWING);
            this.f50793d.f54408j.m57924a(activity, m57696j());
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f50792c;
            if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) baseAdAdapter).showAd(this.f50800k, this);
            } else {
                ironLog.error(m57712a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                C21205x1 c21205x1 = this.f50793d;
                if (c21205x1 != null) {
                    c21205x1.f54409k.m54567f("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m57718a(AbstractC20186k7.EnumC20194h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.f50794e;
            IronLog.INTERNAL.error(m57712a(str));
            C21205x1 c21205x12 = this.f50793d;
            if (c21205x12 != null) {
                c21205x12.f54409k.m54567f(str);
            }
            onAdShowFailed(C20996t1.m54863h(this.f50790a.m58063a()), str);
        }
    }

    /* renamed from: b */
    public void m58456b(boolean z) {
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57918a(z);
        }
    }
}
