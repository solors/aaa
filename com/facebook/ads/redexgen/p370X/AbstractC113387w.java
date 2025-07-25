package com.facebook.ads.redexgen.p370X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7w */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC113387w {
    public static byte[] A01;
    public final C113347s A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, SignedBytes.MAX_POWER_OF_TWO, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, 61, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract C113327q[] A0A();

    public AbstractC113387w(C113347s c113347s) {
        this.A00 = c113347s;
    }

    private String A00() {
        C113327q[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i = 0; i < A0A.length - 1; i++) {
            result = result + A0A[i].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, C113327q[] c113327qArr) {
        StringBuilder sb2 = new StringBuilder(A01(56, 7, 114));
        for (int i = 0; i < c113327qArr.length - 1; i++) {
            sb2.append(c113327qArr[i].A01);
            sb2.append(A01(20, 2, 43));
        }
        sb2.append(c113327qArr[c113327qArr.length - 1].A01);
        sb2.append(A01(6, 6, 21));
        sb2.append(str);
        return sb2.toString();
    }

    public static String A03(String str, C113327q[] c113327qArr, C113327q c113327q) {
        return A02(str, c113327qArr) + A01(12, 7, 119) + c113327q.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
