package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.rp */
/* loaded from: classes6.dex */
public class C20772rp extends AbstractC20325m7 {

    /* renamed from: R */
    private static C20772rp f52798R;

    /* renamed from: P */
    private String f52799P;

    /* renamed from: Q */
    private final InterfaceC20470mg f52800Q = C19821el.m58797N().mo57093k();

    private C20772rp() {
        this.f51145H = "outcome";
        this.f51144G = 3;
        this.f51146I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f52799P = "";
    }

    /* renamed from: i */
    public static synchronized C20772rp m55443i() {
        C20772rp c20772rp;
        synchronized (C20772rp.class) {
            if (f52798R == null) {
                C20772rp c20772rp2 = new C20772rp();
                f52798R = c20772rp2;
                c20772rp2.m57235e();
            }
            c20772rp = f52798R;
        }
        return c20772rp;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: c */
    protected int mo53775c(C20200kb c20200kb) {
        return this.f52800Q.mo56312a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: d */
    protected void mo53774d() {
        this.f51147J.add(1000);
        this.f51147J.add(1001);
        this.f51147J.add(1002);
        this.f51147J.add(1003);
        this.f51147J.add(1200);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f51147J.add(1210);
        this.f51147J.add(1211);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f51147J.add(1213);
        this.f51147J.add(Integer.valueOf((int) IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: e */
    protected String mo53772e(int i) {
        if (i != 15 && (i < 300 || i >= 400)) {
            return "";
        }
        return this.f52799P;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: f */
    protected void mo53771f(C20200kb c20200kb) {
        if (c20200kb.m57653c() == 15 || (c20200kb.m57653c() >= 300 && c20200kb.m57653c() < 400)) {
            this.f52799P = c20200kb.m57654b().optString("placement");
        }
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
        return m57653c == 14 || m57653c == 514 || m57653c == 515 || m57653c == 516 || m57653c == 1003 || m57653c == 1005 || m57653c == 1203 || m57653c == 1010 || m57653c == 1301 || m57653c == 1302;
    }
}
