package com.taurusx.tax.p594e;

/* renamed from: com.taurusx.tax.e.t0 */
/* loaded from: classes7.dex */
public class C28379t0 extends AbstractC28349l0 {

    /* renamed from: a */
    public final boolean f73652a;

    public C28379t0(boolean z) {
        this.f73652a = z;
    }

    @Override // com.taurusx.tax.p594e.AbstractC28349l0
    /* renamed from: a */
    public String mo38209a() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("viewable: ");
        if (this.f73652a) {
            str = "true";
        } else {
            str = "false";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
