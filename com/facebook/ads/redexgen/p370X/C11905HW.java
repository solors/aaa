package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.HW */
/* loaded from: assets/audience_network.dex */
public final class C11905HW {
    public static byte[] A05;
    public static String[] A06 = {"2revu11PJC5JJW9Wa0yU7IMUA1J5NejP", "fJ5JOQQqtdBcbj27U0gmUjzU2HCLlz0g", "ET0kkCf4ARvl2PzoyLeVITbW2fplMVfR", "GxObTRUuHNyvHf6tkdVAqKD8xwa6jlLn", "B7q0fr4uC5I7vD4MQhzL4Z47zRUcP8kJ", "568trPd6mwfCGSMgqCQm2IVOVBWhAbWi", "EbkNl16qbhIMOqvfmLsDQ8wggfaUXum1", "SV9S1jJDj189NNWmtagkrr9CNMxjn3Dk"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C12840Wm A00 = C12840Wm.A04;
    public final TreeSet<C12838Wk> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[3].charAt(30) == 'V') {
                throw new RuntimeException();
            }
            A06[6] = "S0u5zKZmiQfdscAZx2bCvjbBnL2oTB1W";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{120, 62, 57, 49, 52, 61, 60, 118, 117, 33, 58, 117, SignedBytes.MAX_POWER_OF_TWO, 119, 124, 115, Byte.MAX_VALUE, 123, 124, 117, 50, 125, 116, 50};
    }

    static {
        A02();
    }

    public C11905HW(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static C11905HW A00(int i, DataInputStream dataInputStream) throws IOException {
        C11905HW c11905hw = new C11905HW(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            C11910Hb c11910Hb = new C11910Hb();
            AbstractC11909Ha.A05(c11910Hb, readLong);
            c11905hw.A0F(c11910Hb);
        } else {
            c11905hw.A00 = C12840Wm.A00(dataInputStream);
        }
        return c11905hw;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i2 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = AbstractC11909Ha.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j2) {
        C12838Wk A062 = A06(j);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j2);
        }
        long j3 = j + j2;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j3) {
            for (C12838Wk c12838Wk : this.A04.tailSet(A062, false)) {
                String[] strArr = A06;
                if (strArr[2].charAt(8) == strArr[1].charAt(8)) {
                    throw new RuntimeException();
                }
                A06[7] = "b0ZaIIxnoqImZ25xzDHzhq2wNwo0sHmR";
                long currentEndPosition = c12838Wk.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = c12838Wk.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + c12838Wk.A01);
                if (queryEndPosition >= j3) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j, j2);
    }

    public final C12840Wm A05() {
        return this.A00;
    }

    public final C12838Wk A06(long j) {
        C12838Wk A01 = C12838Wk.A01(this.A03, j);
        C12838Wk floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        C12838Wk lookupSpan = this.A04.ceiling(A01);
        if (lookupSpan == null) {
            return C12838Wk.A02(this.A03, j);
        }
        return C12838Wk.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final C12838Wk A07(C12838Wk c12838Wk) throws C11896HN {
        AbstractC11914Hf.A04(this.A04.remove(c12838Wk));
        C12838Wk A08 = c12838Wk.A08(this.A02);
        if (c12838Wk.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C11896HN(A01(12, 12, 14) + c12838Wk.A03 + A01(8, 4, 73) + A08.A03 + A01(0, 8, 68));
    }

    public final TreeSet<C12838Wk> A08() {
        return this.A04;
    }

    public final void A09(C12838Wk c12838Wk) {
        this.A04.add(c12838Wk);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(C11902HT c11902ht) {
        if (this.A04.remove(c11902ht)) {
            c11902ht.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(C11910Hb c11910Hb) {
        C12840Wm c12840Wm = this.A00;
        C12840Wm oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(c11910Hb);
        C12840Wm oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c12840Wm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11905HW c11905hw = (C11905HW) obj;
        if (this.A02 == c11905hw.A02 && this.A03.equals(c11905hw.A03)) {
            TreeSet<C12838Wk> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].charAt(21) != strArr[0].charAt(21)) {
                throw new RuntimeException();
            }
            A06[4] = "6WixUlfTKGOdvAUaxQ2Z5ifCzkckXFCZ";
            if (treeSet.equals(c11905hw.A04) && this.A00.equals(c11905hw.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
