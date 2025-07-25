package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zc */
/* loaded from: assets/audience_network.dex */
public class C13013Zc implements InterfaceC12076KO {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12076KO
    public final void AFg(Throwable th, Object obj) {
        if (obj instanceof InterfaceC113207e) {
            C13029Zs adContext = ((InterfaceC113207e) obj).A6G();
            if (adContext != null) {
                adContext.A0P(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C13029Zs)) {
                return;
            }
            ((C13029Zs) context).A0P(th);
        }
    }
}
