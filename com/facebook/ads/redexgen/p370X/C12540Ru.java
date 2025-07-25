package com.facebook.ads.redexgen.p370X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ru */
/* loaded from: assets/audience_network.dex */
public class C12540Ru {
    public C12544Ry A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C12540Ru A00(C12544Ry c12544Ry) {
        this.A00 = c12544Ry;
        return this;
    }

    public final C12540Ru A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C12540Ru A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C12540Ru A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C12540Ru A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C12541Rv A05() {
        return new C12541Rv(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
