package com.facebook.ads.redexgen.p370X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw */
/* loaded from: assets/audience_network.dex */
public class C12971Yw extends AbstractC11538BC {
    public static byte[] A04;
    public static String[] A05 = {"hKoa2yITZJ5k97cBUGvRmaJeewJ", "hPJiLAFD5JxPyt7IiL", "IjDuRYReq7EwKVoJGoAu0", "v", "6es3mjvaA3VWyPv3uj", "UGQAdGPABwkSCUhUUsZu2mkY3iozmckQ", "N9t7LqoVZtJBHPDtx6gFeqCCQFc4aoCh", "9LzPEDzojfUQvvnuUbV49lrk9sF9njiE"};
    public long A00;
    public ByteBuffer A01;
    public final C11541BF A02 = new C11541BF();
    public final int A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-24, 4, -24, 10, -38, 13, -2, -2, -3, 10, -72, 12, 7, 7, -72, 11, 5, -7, 4, 4, -72, -64};
    }

    static {
        A05();
    }

    public C12971Yw(int i) {
        this.A03 = i;
    }

    public static C12971Yw A02() {
        return new C12971Yw(0);
    }

    private ByteBuffer A04(int i) {
        if (this.A03 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.A03 == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            String[] strArr = A05;
            if (strArr[7].charAt(4) != strArr[5].charAt(4)) {
                String[] strArr2 = A05;
                strArr2[4] = "EnQTDBbcwdEGVgGYQy";
                strArr2[1] = "cOX79vVexcECC7XhRL";
                return allocateDirect;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A03(4, 18, 28) + (this.A01 == null ? 0 : this.A01.capacity()) + A03(0, 3, 76) + i + A03(3, 1, 101));
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11538BC
    public final void A07() {
        super.A07();
        if (this.A01 != null) {
            this.A01.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i) throws IllegalStateException {
        if (this.A01 == null) {
            this.A01 = A04(i);
            return;
        }
        int position = this.A01.capacity();
        int position2 = this.A01.position();
        int capacity = position2 + i;
        if (position >= capacity) {
            return;
        }
        ByteBuffer A042 = A04(capacity);
        if (position2 > 0) {
            this.A01.position(0);
            this.A01.limit(position2);
            A042.put(this.A01);
        }
        this.A01 = A042;
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        return this.A01 == null && this.A03 == 0;
    }
}
