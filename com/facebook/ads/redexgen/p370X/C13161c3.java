package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.c3 */
/* loaded from: assets/audience_network.dex */
public class C13161c3 implements InterfaceC112646X {
    public final /* synthetic */ AbstractC13171cD A00;
    public final /* synthetic */ InterfaceC109671g A01;
    public final /* synthetic */ C109681h A02;
    public final /* synthetic */ C13029Zs A03;
    public final /* synthetic */ boolean A04;

    public C13161c3(C109681h c109681h, C13029Zs c13029Zs, boolean z, AbstractC13171cD abstractC13171cD, InterfaceC109671g interfaceC109671g) {
        this.A02 = c109681h;
        this.A03 = c13029Zs;
        this.A04 = z;
        this.A00 = abstractC13171cD;
        this.A01 = interfaceC109671g;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (C11979Im.A1g(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC12398Pc.A01(this.A03, this.A00, 1, new C13162c4(this)));
                return;
            }
            this.A01.AB5();
            return;
        }
        this.A01.AB4(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112646X
    public final void ABT() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112646X
    public final void ABc() {
        A00(true);
    }
}
