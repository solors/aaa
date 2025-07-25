package com.facebook.ads.redexgen.p370X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Rv */
/* loaded from: assets/audience_network.dex */
public final class C12541Rv {
    public C12544Ry A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04;

    public C12541Rv(C12544Ry c12544Ry, boolean z, Set<String> pinnedPublicKeys, Set<String> pinnedCertificates, boolean z2) {
        this.A00 = c12544Ry;
        this.A04 = z;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z2;
    }

    public final C12544Ry A00() {
        return this.A00;
    }

    public final Set<String> A01() {
        return this.A01;
    }

    public final Set<String> A02() {
        return this.A02;
    }

    public final boolean A03() {
        return this.A04;
    }

    public final boolean A04() {
        return this.A03;
    }
}
