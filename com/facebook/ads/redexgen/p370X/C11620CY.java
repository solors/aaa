package com.facebook.ads.redexgen.p370X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.CY */
/* loaded from: assets/audience_network.dex */
public final class C11620CY implements InterfaceC12841Wn, Comparator<C11902HT> {
    public long A00;
    public final long A01;
    public final TreeSet<C11902HT> A02 = new TreeSet<>(this);

    public C11620CY(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C11902HT c11902ht, C11902HT c11902ht2) {
        if (c11902ht.A00 - c11902ht2.A00 == 0) {
            return c11902ht.compareTo(c11902ht2);
        }
        return c11902ht.A00 < c11902ht2.A00 ? -1 : 1;
    }

    private void A01(InterfaceC11898HP interfaceC11898HP, long j) {
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            try {
                interfaceC11898HP.AFc(this.A02.first());
            } catch (C11896HN unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11897HO
    public final void ADe(InterfaceC11898HP interfaceC11898HP, C11902HT c11902ht) {
        this.A02.add(c11902ht);
        this.A00 += c11902ht.A01;
        A01(interfaceC11898HP, 0L);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11897HO
    public final void ADf(InterfaceC11898HP interfaceC11898HP, C11902HT c11902ht) {
        this.A02.remove(c11902ht);
        this.A00 -= c11902ht.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11897HO
    public final void ADg(InterfaceC11898HP interfaceC11898HP, C11902HT c11902ht, C11902HT c11902ht2) {
        ADf(interfaceC11898HP, c11902ht);
        ADe(interfaceC11898HP, c11902ht2);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12841Wn
    public final void ADh(InterfaceC11898HP interfaceC11898HP, String str, long j, long j2) {
        A01(interfaceC11898HP, j2);
    }
}
