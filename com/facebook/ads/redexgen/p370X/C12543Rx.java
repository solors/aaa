package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rx */
/* loaded from: assets/audience_network.dex */
public class C12543Rx {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public InterfaceC12534Ro A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, 44, 61, 59, 32, 44, 58, 105, 36, 60, 58, 61, 105, 43, 44, 105, 43, 44, 61, 62, 44, 44, 39, 105, 120, 105, 40, 39, 45, 105, 120, 113};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final C12543Rx A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C12543Rx A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final C12543Rx A04(int i) {
        this.A02 = i;
        return this;
    }

    public final C12543Rx A05(int i) {
        this.A03 = i;
        return this;
    }

    public final C12543Rx A06(int i) {
        this.A04 = i;
        return this;
    }

    public final C12543Rx A07(InterfaceC12534Ro interfaceC12534Ro) {
        this.A05 = interfaceC12534Ro;
        return this;
    }

    public final C12543Rx A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C12544Ry A09() {
        return new C12544Ry(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
