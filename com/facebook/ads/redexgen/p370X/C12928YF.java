package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YF */
/* loaded from: assets/audience_network.dex */
public final class C12928YF implements InterfaceC11583Bx {
    public static byte[] A04;
    public static String[] A05 = {"AiK3pMNNShJak6s4MDLMsY9qimC26KFX", "M3v5gYKO4WFk3hn1", "2bb5Udvw00t6fegOsnQl4tXMAy7GQwkC", "3", "dcu35K4BbIgCoJa", "BMLQYda91yK3g7bccAaGNV4e5Wl83Iq9", "nA", "RGGuL4yAG6ucZ0xM2RL0jO8aPQRkkz4r"};
    public static final InterfaceC11586C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C12927YE A02;
    public final C11939I4 A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-99, -104, -121};
        if (A05[5].charAt(3) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "7bqpxfmR5XZPxNNPiA9CZDDyjHiTp2U9";
        strArr[2] = "KfpMkYA6TjN2MknexbVN3Qli6xlYiONa";
        A04 = bArr;
    }

    static {
        A01();
        A06 = new C12929YG();
        A07 = AbstractC11953IK.A08(A00(0, 3, 5));
    }

    public C12928YF() {
        this(0L);
    }

    public C12928YF(long j) {
        this.A01 = j;
        this.A02 = new C12927YE();
        this.A03 = new C11939I4(2786);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A02.A5B(interfaceC11585Bz, new C11665DH(0, 1));
        interfaceC11585Bz.A5u();
        interfaceC11585Bz.AG8(new C12963Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        int read = interfaceC11584By.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AEM(this.A01, true);
            if (A05[5].charAt(3) == 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "3";
            strArr[4] = "MtZ9V1bvQ7N7yp1";
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
        int frameSize = 0;
        while (true) {
            interfaceC11584By.AEO(c11939i4.A00, 0, 10);
            c11939i4.A0Y(0);
            if (c11939i4.A0G() != A07) {
                break;
            }
            c11939i4.A0Z(3);
            int A0D = c11939i4.A0D();
            frameSize += A0D + 10;
            interfaceC11584By.A3s(A0D);
        }
        interfaceC11584By.AFq();
        interfaceC11584By.A3s(frameSize);
        if (A05[1].length() == 16) {
            A05[0] = "tOwruLAkjfEjUTDr1GyBFqGyTAmtcW9W";
            int validFramesCount = frameSize;
            int i = 0;
            while (true) {
                interfaceC11584By.AEO(c11939i4.A00, 0, 5);
                c11939i4.A0Y(0);
                int headerPosition = c11939i4.A0I();
                if (headerPosition != 2935) {
                    i = 0;
                    int headerPosition2 = A05[1].length();
                    if (headerPosition2 != 16) {
                        throw new RuntimeException();
                    }
                    A05[0] = "KHjFfqD3l504BCehGNYpAbtEvQEoYsdd";
                    interfaceC11584By.AFq();
                    validFramesCount++;
                    int headerPosition3 = validFramesCount - frameSize;
                    if (headerPosition3 >= 8192) {
                        return false;
                    }
                    interfaceC11584By.A3s(validFramesCount);
                } else {
                    i++;
                    int headerPosition4 = A05[1].length();
                    if (headerPosition4 == 16) {
                        A05[0] = "LsSuBgAQvpKIYN4XhQWhBdLWOoSFJdWu";
                        if (i >= 4) {
                            return true;
                        }
                        int headerPosition5 = AbstractC11495AV.A05(c11939i4.A00);
                        if (headerPosition5 != -1) {
                            int i2 = headerPosition5 - 5;
                            String[] strArr = A05;
                            String str = strArr[7];
                            String str2 = strArr[2];
                            int headerPosition6 = str.charAt(2);
                            if (headerPosition6 == str2.charAt(2)) {
                                break;
                            }
                            A05[5] = "PITbGjnQaqQDwu6bC7Vc8Pqy2Vnu7Nmf";
                            interfaceC11584By.A3s(i2);
                        } else {
                            return false;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        throw new RuntimeException();
    }
}
