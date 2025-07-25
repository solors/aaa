package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bO */
/* loaded from: assets/audience_network.dex */
public final class C13120bO implements InterfaceC113217f {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public InterfaceC10846Ad A09;
    public WeakReference<InterfaceC10846Ad> A0A;
    public final C13029Zs A0B;
    public final InterfaceC113808d A0C;
    public final String A0D;

    public C13120bO(C13029Zs c13029Zs, String str, InterfaceC10846Ad interfaceC10846Ad, InterfaceC113808d interfaceC113808d) {
        this.A0B = c13029Zs;
        this.A0D = str;
        this.A09 = interfaceC10846Ad;
        this.A0A = new WeakReference<>(interfaceC10846Ad);
        this.A0C = interfaceC113808d;
        c13029Zs.A0M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113217f
    /* renamed from: A00 */
    public final RewardedVideoAdListener A6I() {
        return this.A04;
    }

    public final C13029Zs A01() {
        return this.A0B;
    }

    public final void A02(InterfaceC10846Ad interfaceC10846Ad) {
        if (interfaceC10846Ad == null && !C11979Im.A0r(this.A0B)) {
            return;
        }
        this.A09 = interfaceC10846Ad;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113217f
    public final InterfaceC10846Ad A6E() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
