package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.CK */
/* loaded from: assets/audience_network.dex */
public final class C11606CK {
    public static String[] A06 = {"ASrRCYsKepDTUmzFsC2sW3QzilFSgfPw", "pk2aHy5Gwagx08DT23n03plQM468sRYy", "xOM6LRz9nNuHtWN", "TvyhqxunvhStLR7Kd", "aVtXkPwucpWHbVIgTuViY5Suu", "ZnIfrZLnsjfgp1sFLfOTBH8y8Mk5lEFn", "0lbnIxGi57zCIaJmDAHnbRN3bazOyET0", "5wZWnu4zbKghJljNFYmlUiyghG2Nmbcr"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC11584By interfaceC11584By, int i, int i2) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC11584By.AEO(this.A05, 0, 10);
            interfaceC11584By.AFq();
            if (AbstractC11495AV.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            if (A06[4].length() != 25) {
                throw new RuntimeException();
            }
            A06[3] = "JjREElMDljsf0pPk3";
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(C11605CJ c11605cj) {
        if (this.A04) {
            int i = this.A02;
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[3] = "G4r0EfytzI47OGcaJ";
            if (i > 0) {
                c11605cj.A0W.AFw(this.A03, this.A00, this.A01, 0, c11605cj.A0V);
                this.A02 = 0;
            }
        }
    }

    public final void A03(C11605CJ c11605cj, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        this.A02 = i + 1;
        if (i == 0) {
            this.A03 = j;
        }
        if (this.A02 < 16) {
            return;
        }
        c11605cj.A0W.AFw(this.A03, this.A00, this.A01, 0, c11605cj.A0V);
        this.A02 = 0;
    }
}
