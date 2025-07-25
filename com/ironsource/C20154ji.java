package com.ironsource;

import com.ironsource.AbstractC20325m7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.ji */
/* loaded from: classes6.dex */
public class C20154ji extends AbstractC20325m7 {

    /* renamed from: R */
    private static C20154ji f50718R;

    /* renamed from: P */
    private String f50719P;

    /* renamed from: Q */
    private final InterfaceC20470mg f50720Q = C19821el.m58797N().mo57093k();

    private C20154ji() {
        this.f51145H = "ironbeast";
        this.f51144G = 2;
        this.f51146I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f50719P = "";
    }

    /* renamed from: i */
    public static synchronized C20154ji m57833i() {
        C20154ji c20154ji;
        synchronized (C20154ji.class) {
            if (f50718R == null) {
                C20154ji c20154ji2 = new C20154ji();
                f50718R = c20154ji2;
                c20154ji2.m57235e();
            }
            c20154ji = f50718R;
        }
        return c20154ji;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: c */
    protected int mo53775c(C20200kb c20200kb) {
        InterfaceC20470mg interfaceC20470mg;
        IronSource.AD_UNIT ad_unit;
        int m57231f = m57231f(c20200kb.m57653c());
        if (m57231f == AbstractC20325m7.EnumC20330e.BANNER.m57215a()) {
            interfaceC20470mg = this.f50720Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (m57231f == AbstractC20325m7.EnumC20330e.NATIVE_AD.m57215a()) {
            interfaceC20470mg = this.f50720Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            interfaceC20470mg = this.f50720Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return interfaceC20470mg.mo56312a(ad_unit);
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: d */
    protected void mo53774d() {
        this.f51147J.add(2001);
        this.f51147J.add(2002);
        this.f51147J.add(2003);
        this.f51147J.add(2004);
        this.f51147J.add(2200);
        this.f51147J.add(2213);
        this.f51147J.add(2211);
        this.f51147J.add(2212);
        this.f51147J.add(3001);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f51147J.add(3002);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f51147J.add(3005);
        this.f51147J.add(3300);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f51147J.add(3009);
        this.f51147J.add(4001);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.f51147J.add(4002);
        this.f51147J.add(4005);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_SHOW));
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: e */
    protected String mo53772e(int i) {
        return this.f50719P;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: f */
    protected void mo53771f(C20200kb c20200kb) {
        this.f50719P = c20200kb.m57654b().optString("placement");
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: j */
    protected boolean mo53768j(C20200kb c20200kb) {
        return false;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: d */
    protected boolean mo53773d(C20200kb c20200kb) {
        int m57653c = c20200kb.m57653c();
        return m57653c == 2004 || m57653c == 2005 || m57653c == 2204 || m57653c == 2301 || m57653c == 2300 || m57653c == 3009 || m57653c == 3502 || m57653c == 3501 || m57653c == 4005 || m57653c == 4009 || m57653c == 4502 || m57653c == 4501;
    }
}
