package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YC */
/* loaded from: assets/audience_network.dex */
public final class C12925YC implements InterfaceC11583Bx {
    public static byte[] A04;
    public static String[] A05 = {"N3GpeYjJMdKFRv0SshHJKYsMOuO8p0tA", "wiC15XfKNpxiBv337rdfaN7iMk56huNL", "A3rsL6GYIxDIsUnc56leVSLnuuwWJE", "ZqwBdGbE4SmgDsULJVLTHbFOP2ezpJEQ", "xoPpoqfJCAQQdXeq5BVdnLmzIY6pHKhI", "B8ZA", "v1zw", "7spihzsXhr8LXNxcY6XClUbYBtHjjuHe"};
    public static final InterfaceC11586C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C12924YB A02;
    public final C11939I4 A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A05[2].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "3ZPkzOiGV9NVnE4h3utFZ5OzDgmotOaN";
            strArr[1] = "eEVTlcljeWNjgsJMtw5K8hnVppEY0YPV";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{79, 66, 53};
    }

    static {
        A01();
        A06 = new C12926YD();
        A07 = AbstractC11953IK.A08(A00(0, 3, 93));
    }

    public C12925YC() {
        this(0L);
    }

    public C12925YC(long j) {
        this.A01 = j;
        this.A02 = new C12924YB(true);
        this.A03 = new C11939I4(200);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A02.A5B(interfaceC11585Bz, new C11665DH(0, 1));
        interfaceC11585Bz.A5u();
        interfaceC11585Bz.AG8(new C12963Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        int read = interfaceC11584By.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            C12924YB c12924yb = this.A02;
            long j = this.A01;
            String[] strArr = A05;
            String str = strArr[3];
            String str2 = strArr[1];
            int charAt = str.charAt(14);
            int bytesRead = str2.charAt(14);
            if (charAt == bytesRead) {
                throw new RuntimeException();
            }
            A05[6] = "35by";
            c12924yb.AEM(j, true);
            this.A00 = true;
        }
        this.A02.A4n(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        this.A00 = false;
        this.A02.AG6();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        C11939I4 c11939i4 = new C11939I4(10);
        C11938I3 c11938i3 = new C11938I3(c11939i4.A00);
        int startPosition = 0;
        while (true) {
            interfaceC11584By.AEO(c11939i4.A00, 0, 10);
            c11939i4.A0Y(0);
            if (c11939i4.A0G() != A07) {
                break;
            }
            c11939i4.A0Z(3);
            int A0D = c11939i4.A0D();
            startPosition += A0D + 10;
            interfaceC11584By.A3s(A0D);
        }
        interfaceC11584By.AFq();
        interfaceC11584By.A3s(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i = 0;
        while (true) {
            interfaceC11584By.AEO(c11939i4.A00, 0, 2);
            c11939i4.A0Y(0);
            int headerPosition = 65526 & c11939i4.A0I();
            if (headerPosition != 65520) {
                i = 0;
                validFramesCount = 0;
                interfaceC11584By.AFq();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC11584By.A3s(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC11584By.AEO(c11939i4.A00, 0, 4);
                c11938i3.A07(14);
                int headerPosition3 = c11938i3.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC11584By.A3s(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
