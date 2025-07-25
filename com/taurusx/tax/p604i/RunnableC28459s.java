package com.taurusx.tax.p604i;

import com.taurusx.tax.p618ui.TaxVideoActivity;

/* renamed from: com.taurusx.tax.i.s */
/* loaded from: classes7.dex */
public class RunnableC28459s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaxVideoActivity f73887a;

    public RunnableC28459s(TaxVideoActivity taxVideoActivity) {
        this.f73887a = taxVideoActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f73887a.f74240c.getVisibility() == 8 && this.f73887a.f74250h.getVisibility() == 8) {
            this.f73887a.f74240c.setVisibility(0);
            this.f73887a.f74242d.setVisibility(0);
        }
    }
}
