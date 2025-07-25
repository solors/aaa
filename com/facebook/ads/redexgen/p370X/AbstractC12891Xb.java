package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Xb */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12891Xb implements InterfaceC11748Ev {
    public InterfaceC12986ZB A00;
    public AbstractC11486AM A01;
    public Object A02;
    public final ArrayList<InterfaceC11747Eu> A04 = new ArrayList<>(1);
    public final C11759F6 A03 = new C11759F6();

    public abstract void A02();

    public abstract void A03(InterfaceC12986ZB interfaceC12986ZB, boolean z);

    public final C11759F6 A00(C11746Et c11746Et) {
        return this.A03.A02(0, c11746Et, 0L);
    }

    public final void A01(AbstractC11486AM abstractC11486AM, Object obj) {
        this.A01 = abstractC11486AM;
        this.A02 = obj;
        Iterator<InterfaceC11747Eu> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ADd(this, abstractC11486AM, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void A3k(Handler handler, InterfaceC11762F9 interfaceC11762F9) {
        this.A03.A07(handler, interfaceC11762F9);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void AEa(InterfaceC12986ZB interfaceC12986ZB, boolean z, InterfaceC11747Eu interfaceC11747Eu) {
        AbstractC11914Hf.A03(this.A00 == null || this.A00 == interfaceC12986ZB);
        this.A04.add(interfaceC11747Eu);
        if (this.A00 == null) {
            this.A00 = interfaceC12986ZB;
            A03(interfaceC12986ZB, z);
        } else if (this.A01 == null) {
        } else {
            interfaceC11747Eu.ADd(this, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void AF4(InterfaceC11747Eu interfaceC11747Eu) {
        this.A04.remove(interfaceC11747Eu);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11748Ev
    public final void AFa(InterfaceC11762F9 interfaceC11762F9) {
        this.A03.A0D(interfaceC11762F9);
    }
}
