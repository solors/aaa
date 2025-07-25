package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.H3 */
/* loaded from: assets/audience_network.dex */
public final class C11876H3 {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{111, 99, 110, 75, 94, 75, 121, 90, 79, 73, 113, 71};
    }

    public C11876H3(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C11876H3(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C11876H3(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C11876H3(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        AbstractC11914Hf.A03(j >= 0);
        AbstractC11914Hf.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        AbstractC11914Hf.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i;
    }

    public final boolean A02(int i) {
        return (this.A00 & i) == i;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 67)).append(this.A04);
        String A00 = A00(0, 2, 42);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, 115)).toString();
    }
}
