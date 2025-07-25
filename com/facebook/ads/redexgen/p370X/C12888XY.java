package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.XY */
/* loaded from: assets/audience_network.dex */
public final class C12888XY implements InterfaceC11886HD {
    public static String[] A0C = {"UHBxdqqmUd0cBUfteuxO11fv3nMetCkr", "bpIfqspTf2B8hIKXxN8UsfP", "nQLLlj7yvR51GKiSLDNkBhCd9wKHTmtF", "g1T6MLNH1r6BMEQeXhAGdqkubnn7KLBM", "2gOIWdRNZvq1Kh3BpRyp9hP618T8MmgQ", "QpJVxxzC0ZK3g", "rEgoyo7biwWjWc5JH9k81Kz3GFe4jtfN", "VeB4zDZa"};
    public long A00;
    public long A02;
    public C11876H3 A03;
    public final Uri A05;
    public final C11742Ep A07;
    public final InterfaceC11872Gz A08;
    public final C11920Hl A09;
    public volatile boolean A0A;
    public final /* synthetic */ C11688Dg A0B;
    public final C11590C4 A06 = new C11590C4();
    public boolean A04 = true;
    public long A01 = -1;

    public C12888XY(C11688Dg c11688Dg, Uri uri, InterfaceC11872Gz interfaceC11872Gz, C11742Ep c11742Ep, C11920Hl c11920Hl) {
        this.A0B = c11688Dg;
        this.A05 = (Uri) AbstractC11914Hf.A01(uri);
        this.A08 = (InterfaceC11872Gz) AbstractC11914Hf.A01(interfaceC11872Gz);
        this.A07 = (C11742Ep) AbstractC11914Hf.A01(c11742Ep);
        this.A09 = c11920Hl;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11886HD
    public final void A4W() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11886HD
    public final void A9o() throws IOException, InterruptedException {
        int result = 0;
        while (result == 0) {
            boolean z = this.A0A;
            if (A0C[4].charAt(0) == 'C') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "tFp1bRZRusaEJJa7j65nePC0dyA6HXa4";
            strArr[2] = "yrMehS8ZHN9WesRJaME1jcDTy2vBV8ag";
            if (!z) {
                InterfaceC11584By interfaceC11584By = null;
                try {
                    long j = this.A06.A00;
                    this.A03 = new C11876H3(this.A05, j, -1L, C11688Dg.A08(this.A0B));
                    this.A01 = this.A08.AEE(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j;
                    }
                    C12967Ys c12967Ys = new C12967Ys(this.A08, j, this.A01);
                    InterfaceC11583Bx extractor = this.A07.A02(c12967Ys, this.A08.A8c());
                    if (this.A04) {
                        extractor.AG7(j, this.A02);
                        this.A04 = false;
                    }
                    while (result == 0 && !this.A0A) {
                        this.A09.A00();
                        result = extractor.AEk(c12967Ys, this.A06);
                        if (c12967Ys.A86() > C11688Dg.A03(this.A0B) + j) {
                            j = c12967Ys.A86();
                            this.A09.A01();
                            C11688Dg.A04(this.A0B).post(C11688Dg.A06(this.A0B));
                        }
                    }
                    if (result == 1) {
                        result = 0;
                    } else {
                        this.A06.A00 = c12967Ys.A86();
                        C11590C4 c11590c4 = this.A06;
                        if (A0C[4].charAt(0) == 'C') {
                            throw new RuntimeException();
                        }
                        A0C[4] = "PQr9p7FkEdqUiF3RXdEEuViBVQM7OAy8";
                        this.A00 = c11590c4.A00 - this.A03.A01;
                    }
                    AbstractC11953IK.A0W(this.A08);
                } catch (Throwable th) {
                    if (result != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC11584By.A86();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    AbstractC11953IK.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
