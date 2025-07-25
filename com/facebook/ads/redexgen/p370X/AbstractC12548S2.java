package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.S2 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12548S2 {
    public static byte[] A05;
    public static String[] A06 = {"cXHhWS2U0AEbFhhmPHmVuH", "wVYzC7Nkmxeng7LXEltnvgZwmBeHxDlH", "QdB4DFNTOqs3kzyCIXC3RbQ0s8ofNHfi", "NfO94uVHpQsZyAD7D3sB88", "Qb7NVaH0CDkMRhWHzZDzGB0JzykCOgpa", "79nTtHn72qGvVt6br", "vvJx1YlMdzFVt9WMGmsv2mWYh0j6ZH0a", "LFbWjj4EQG077AWDW1GPYYaHkUkOcLUG"};
    public C12544Ry A00;
    public EnumC12547S1 A01;
    public String A02;
    public String A03;
    public byte[] A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-121};
        String[] strArr = A06;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "4G6bp2JlnqCaKfrAR3d18U2njy0G4HP7";
        strArr2[6] = "szJTv6Q1Z3W9cwFEkaj97Hf7uwsDfHCt";
        A05 = bArr;
    }

    static {
        A01();
    }

    public AbstractC12548S2(String str, C12550S4 c12550s4, C12544Ry c12544Ry) {
        this.A03 = A00(0, 0, 34);
        if (str != null) {
            this.A03 = str;
        }
        if (c12550s4 != null && !c12550s4.A06().isEmpty()) {
            this.A03 += A00(0, 1, 55) + c12550s4.A06();
        }
        this.A00 = c12544Ry;
    }

    public final C12544Ry A02() {
        return this.A00;
    }

    public final EnumC12547S1 A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
