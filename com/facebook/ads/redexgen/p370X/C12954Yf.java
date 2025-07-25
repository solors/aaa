package com.facebook.ads.redexgen.p370X;

import com.p552ot.pubsub.p553a.C26485b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yf */
/* loaded from: assets/audience_network.dex */
public final class C12954Yf implements InterfaceC11601CF {
    public static byte[] A07;
    public static String[] A08 = {C26485b.f69244a, "", "BrvSCWdfcuCaq5cVU07ZhXt", "qubJP7lsNWbo", "NFdit9VNslJwWcMc3jsN0gE8Kfr4ZGkz", "XUMceIPS5Pe", "7dzq6MzNvuPcuITQcDTRqTS6G3kR4", "NdQzj"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC11603CH A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C11600CE> A05 = new ArrayDeque<>();
    public final C11608CM A04 = new C11608CM();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{26, 61, 37, 50, 63, 58, 55, 115, 54, 63, 54, 62, 54, 61, 39, 115, 39, 42, 35, 54, 115, 87, 112, 104, Byte.MAX_VALUE, 114, 119, 122, 62, 120, 114, 113, Byte.MAX_VALUE, 106, 62, 109, 119, 100, 123, 36, 62, 79, 104, 112, 103, 106, 111, 98, 38, 111, 104, 114, 99, 97, 99, 116, 38, 117, 111, 124, 99, 60, 38, 74, 109, 107, 112, 119, 126, 57, 124, 117, 124, 116, 124, 119, 109, 57, 106, 112, 99, 124, 35, 57};
    }

    static {
        A05();
    }

    private double A00(InterfaceC11584By interfaceC11584By, int i) throws IOException, InterruptedException {
        long A02 = A02(interfaceC11584By, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        interfaceC11584By.AFq();
        while (true) {
            interfaceC11584By.AEO(this.A06, 0, 4);
            int A00 = C11608CM.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C11608CM.A01(this.A06, A00, false);
                if (this.A03.A9V(A01)) {
                    interfaceC11584By.AGq(A00);
                    return A01;
                }
            }
            interfaceC11584By.AGq(1);
        }
    }

    private long A02(InterfaceC11584By interfaceC11584By, int i) throws IOException, InterruptedException {
        interfaceC11584By.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    private String A04(InterfaceC11584By interfaceC11584By, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return A03(0, 0, 30);
        }
        byte[] bArr = new byte[i];
        interfaceC11584By.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11601CF
    public final void A9E(InterfaceC11603CH interfaceC11603CH) {
        this.A03 = interfaceC11603CH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11601CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AEm(com.facebook.ads.redexgen.p370X.InterfaceC11584By r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12954Yf.AEm(com.facebook.ads.redexgen.X.By):boolean");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11601CF
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
