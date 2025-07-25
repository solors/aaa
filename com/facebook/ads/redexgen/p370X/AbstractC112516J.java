package com.facebook.ads.redexgen.p370X;

import android.content.ContentResolver;
import android.database.Cursor;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6J */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC112516J {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, SignedBytes.MAX_POWER_OF_TWO, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C112506I A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c = null;
        try {
            c = contentResolver.query(AbstractC12117L5.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new C112506I(null, null, false);
            }
            String string = c.getString(c.getColumnIndex(A013));
            String attributionId = c.getString(c.getColumnIndex(A012));
            C112506I c112506i = new C112506I(string, attributionId, Boolean.valueOf(c.getString(c.getColumnIndex(A01))).booleanValue());
            if (c != null) {
                c.close();
            }
            return c112506i;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
