package com.taurusx.tax.p604i;

import com.taurusx.tax.p618ui.TaxMediaView;

/* renamed from: com.taurusx.tax.i.l */
/* loaded from: classes7.dex */
public class RunnableC28451l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaxMediaView f73878a;

    public RunnableC28451l(TaxMediaView taxMediaView) {
        this.f73878a = taxMediaView;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaxMediaView.InterfaceC28588f interfaceC28588f;
        if (!this.f73878a.f74202x.isHardwareAccelerated() && (interfaceC28588f = this.f73878a.f74194p) != null) {
            interfaceC28588f.mo37850d();
        }
    }
}
