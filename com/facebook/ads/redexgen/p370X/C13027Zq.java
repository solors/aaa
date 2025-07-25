package com.facebook.ads.redexgen.p370X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zq */
/* loaded from: assets/audience_network.dex */
public final class C13027Zq extends AbstractC113387w {
    public static byte[] A00;
    public static String[] A01 = {"S72iqLUHJq0HxavSC6ufHzOfLzRtkhG1", "2e23vyAJ1VfrYECWW2PuMy9", "U", "BHx2UoB4woyKjmRGK8g7VJyuwo8iE1MX", "2k4S21J4fALKY04XcYptMZ4CnaCsWgOl", "PftoDMjSF3TujDQXHZcKzxMpxF8wabcx", "G9sGcewQNY3LQ1dDEReskE69oTmTF8fU", "WiiYP1Z6q1ZZMC28sRcL9b9"};
    public static final C113327q A02;
    public static final C113327q A03;
    public static final C113327q A04;
    public static final C113327q A05;
    public static final C113327q A06;
    public static final C113327q A07;
    public static final C113327q A08;
    public static final C113327q A09;
    public static final C113327q A0A;
    public static final C113327q[] A0B;
    public static final String A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -75, -104, -73, -102, -97, -91, -106, -104, -106, -93, -9, -22, -26, -15, -47, -61, -54, -61, -63, -46, -98, -88, -98, -60, -48, -51, -53, -98, -29, -12, -29, -20, -14, -15, -98, -43, -58, -61, -48, -61, -98, -29, -43, -36, -43, -45, -28, -80, -13, -1, 5, -2, 4, -72, -70, -71, -80, -42, -30, -33, -35, -80, -11, 6, -11, -2, 4, 3, 21, 6, 25, 21, 32, 17, 36, 32, -20, 28, 30, 21, 25, 13, 30, 37, -20, 23, 17, 37, 13, -2, 17, 13, -39, 11, -2, -1, -2, 11, -2, 7, -4, -2, 12, -39, 45, 40, 36, 30, 39, 44, -39, 8, 7, -39, 14, 9, -3, -6, 13, -2, -39, -4, -6, 12, -4, -6, -3, -2, -39, 8, 7, -39, -3, -2, 5, -2, 13, -2, -39, 11, -2, 12, 13, 11, 2, -4, 13, -74, -55, -55, -70, -62, -59, -55, 24, 21, 40, 21, -77, -60, -77, -68, -62, -83, -73, -78, 19, 36, 19, 28, 34, 33, -63, -61, -70, -64, -61, -70, -59, -54, 23, 9, 23, 23, 13, 19, 18, 3, 13, 8, -33, -47, -33, -33, -43, -37, -38, -53, -32, -43, -39, -47, -29, -40, -36, -44, -37, -42, -46, -52, -43, -58, -48, -53, -55, -50, -59, -70};
    }

    static {
        A04();
        A04 = new C113327q(0, A00(159, 8, 1), A00(73, 16, 127));
        A09 = new C113327q(1, A00(207, 8, 26), A00(89, 59, 108));
        String A002 = A00(173, 8, 4);
        String A003 = A00(4, 7, 4);
        A05 = new C113327q(2, A002, A003);
        String A004 = A00(215, 4, 8);
        String A005 = A00(69, 4, 116);
        A0A = new C113327q(3, A004, A005);
        String A006 = A00(203, 4, 34);
        String A007 = A00(11, 4, 88);
        A08 = new C113327q(4, A006, A007);
        A07 = new C113327q(5, A00(191, 12, 31), A007);
        A06 = new C113327q(6, A00(181, 10, 87), A005);
        A03 = new C113327q(7, A00(155, 4, 103), A005);
        A02 = new C113327q(8, A00(148, 7, 8), A003);
        A0B = new C113327q[]{A04, A09, A05, A0A, A08, A07, A06, A03, A02};
        A0C = AbstractC113387w.A02(A00(167, 6, 97), A0B);
    }

    public C13027Zq(C113347s c113347s) {
        super(c113347s);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC113387w
    public final String A06() {
        return A00(167, 6, 97);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC113387w
    public final C113327q[] A0A() {
        return A0B;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A00(42, 27, 67), null);
    }

    public final Cursor A0C() {
        return A05().rawQuery(A0C, null);
    }

    public final Cursor A0D(String str) {
        return A05().rawQuery(A00(15, 27, 49) + A04.A01 + A00(0, 4, 43), new String[]{str});
    }

    public final String A0E(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) throws SQLiteException {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        String eventId = A04.A01;
        contentValues.put(eventId, uuid);
        String eventId2 = A09.A01;
        contentValues.put(eventId2, str);
        contentValues.put(A05.A01, Integer.valueOf(i));
        String eventId3 = A0A.A01;
        contentValues.put(eventId3, str2);
        contentValues.put(A08.A01, Double.valueOf(d));
        contentValues.put(A07.A01, Double.valueOf(d2));
        String eventId4 = A06.A01;
        contentValues.put(eventId4, str3);
        String str4 = A03.A01;
        String eventId5 = map != null ? new JSONObject(map).toString() : null;
        contentValues.put(str4, eventId5);
        String str5 = A02.A01;
        String[] strArr = A01;
        if (strArr[5].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "LHixrdeQ9nvdAu8uzIal1NDup18dDyzZ";
        strArr2[3] = "Oc0hVPeTX1hGgtg7NBB4ZrhrOq8xlSVE";
        contentValues.put(str5, (Integer) 0);
        SQLiteDatabase A052 = A05();
        String eventId6 = A00(167, 6, 97);
        A052.insertOrThrow(eventId6, null, contentValues);
        return uuid;
    }

    public final boolean A0F(String str) {
        return A05().delete(A00(167, 6, 97), new StringBuilder().append(A04.A01).append(A00(0, 4, 43)).toString(), new String[]{str}) > 0;
    }
}
