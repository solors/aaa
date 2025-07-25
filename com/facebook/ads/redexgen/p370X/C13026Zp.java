package com.facebook.ads.redexgen.p370X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Zp */
/* loaded from: assets/audience_network.dex */
public final class C13026Zp extends AbstractC113387w {
    public static byte[] A00;
    public static String[] A01 = {"v5MZzRzrTL11f6lKUt2ZQD1OVIavmnrt", "OQAuAlzJEKPfh7ZgcR4xCXzzkMNpdJq1", "ORBVlGZaT9NsACLTU7PLH6nx7c52uYSI", "kFePfToViPIZQeUiwoBs", "eRXXWt8NkKb0AEFThzS2KgPgrvMEJJml", "Br8mzprdPK1S49BanGBC", "SoemqsWiEpTnAycOeZvswJMc9fMJVUnI", "UAbmRevtk8pEhuOi2MMFgEMoVQVmS6xB"};
    public static final C113327q A02;
    public static final C113327q A03;
    public static final C113327q[] A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{122, 103, 122, 40, 43, 118, 119, 126, 119, 102, 119, 18, 116, 96, 125, Byte.MAX_VALUE, 18, 70, 93, 89, 87, 92, 65, 18, 101, 122, 119, 96, 119, 18, 124, 125, 102, 18, 119, 106, 123, 97, 102, 97, 18, 26, 97, 119, 126, 119, 113, 102, 18, 3, 18, 116, 96, 125, Byte.MAX_VALUE, 18, 87, 68, 87, 92, 70, 65, 18, 101, 122, 119, 96, 119, 18, 70, 93, 89, 87, 92, 65, 28, 27, 38, 61, 59, 46, 42, 55, 49, 48, 126, 41, 54, 59, 48, 126, 42, 44, 39, 55, 48, 57, 126, 42, 49, 126, 58, 59, 50, 59, 42, 59, 126, 61, 54, 55, 50, 58, 50, 59, 45, 45, 126, 42, 49, 53, 59, 48, 45, 112, 124, 91, 67, 84, 89, 92, 81, 21, 65, 90, 94, 80, 91, 27, 20, 5, 24, 20, 36, 53, 40, 36, 80, 32, 34, 57, 61, 49, 34, 41, 80, 59, 53, 41, 66, 81, 66, 73, 83, 84, 5, 30, 26, 20, 31, 125, 102, 98, 108, 103, 86, 96, 109, 67, 88, 92, 82, 89, 68};
    }

    static {
        A04();
        A03 = new C113327q(0, A00(170, 8, 107), A00(143, 16, 18));
        A02 = new C113327q(1, A00(165, 5, 19), A00(139, 4, 34));
        A04 = new C113327q[]{A03, A02};
        A08 = C13026Zp.class.getSimpleName();
        C113327q[] c113327qArr = A04;
        String A002 = A00(178, 6, 85);
        A06 = AbstractC113387w.A02(A002, c113327qArr);
        A07 = AbstractC113387w.A03(A002, A04, A02);
        A05 = A00(5, 71, 80) + A03.A01 + A00(0, 3, 56) + A00(159, 6, 69) + A00(4, 1, 103) + C13027Zq.A09.A01 + A00(3, 1, 99);
    }

    public C13026Zp(C113347s c113347s) {
        super(c113347s);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC113387w
    public final String A06() {
        return A00(178, 6, 85);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC113387w
    public final C113327q[] A0A() {
        return A04;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A06, null);
    }

    public final String A0C(String str) throws IllegalArgumentException, SQLiteException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursor = null;
            try {
                cursor = A05().rawQuery(A07, new String[]{str});
                String string = cursor.moveToNext() ? cursor.getString(A03.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String uuid = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A03.A01, uuid);
                contentValues.put(A02.A01, str);
                A05().insertOrThrow(A00(178, 6, 85), null, contentValues);
                if (cursor != null) {
                    cursor.close();
                }
                return uuid;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 87));
    }

    public final void A0D(C13028Zr c13028Zr) {
        try {
            A05().execSQL(A05);
        } catch (SQLException e) {
            InterfaceC113307o A042 = c13028Zr.A04();
            if (A01[0].charAt(14) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "zGpOEoeFk9mKuFaHfebiepQHWPBtYRlV";
            strArr[4] = "gQOnf7kUk2P1iMeHKJrfxPX4gK9wMRl8";
            if (A042.A9O()) {
                Log.e(A08, A00(76, 49, 60), e);
            }
        }
    }
}
