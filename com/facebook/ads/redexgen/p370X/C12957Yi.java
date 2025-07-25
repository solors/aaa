package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Yi */
/* loaded from: assets/audience_network.dex */
public final class C12957Yi extends AbstractC11597CB {
    public static byte[] A01;
    public static String[] A02 = {"swRCXzzYsYoP8OECiDxTO54f3LG38", "4mMxchX9eTKWcUMbEzzbeTKtMtPaQOs", "Xh7ZpLnI5g0AvtHLdYA6RWKofXnumxIG", "5RXJ", "Vqtapz8Iv", "pVwTkokalGpdr", "NZeIzFT7NtL3BMGbT6cfoawDteogj", "Nl9nBczWjc"};
    public long A00;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{89, 106, 103, 86, 105, 94, 100, 99, 51, 50, 17, 41, 56, 37, 8, 37, 56, 37};
    }

    static {
        A0A();
    }

    public C12957Yi() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C11939I4 c11939i4) {
        return c11939i4.A0E();
    }

    public static Boolean A01(C11939I4 c11939i4) {
        return Boolean.valueOf(c11939i4.A0E() == 1);
    }

    public static Double A02(C11939I4 c11939i4) {
        return Double.valueOf(Double.longBitsToDouble(c11939i4.A0L()));
    }

    public static Object A03(C11939I4 c11939i4, int i) {
        switch (i) {
            case 0:
                return A02(c11939i4);
            case 1:
                return A01(c11939i4);
            case 2:
                return A05(c11939i4);
            case 3:
                return A09(c11939i4);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                return null;
            case 8:
                HashMap<String, Object> A08 = A08(c11939i4);
                if (A02[2].charAt(22) != 'K') {
                    throw new RuntimeException();
                }
                A02[2] = "Sxm2Bc4tXHoV7tL5LxeqP9KUDfvbsTCx";
                return A08;
            case 10:
                return A06(c11939i4);
            case 11:
                return A07(c11939i4);
        }
    }

    public static String A05(C11939I4 c11939i4) {
        int A0I = c11939i4.A0I();
        int A06 = c11939i4.A06();
        c11939i4.A0Z(A0I);
        return new String(c11939i4.A00, A06, A0I);
    }

    public static ArrayList<Object> A06(C11939I4 c11939i4) {
        int A0H = c11939i4.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int i = 0; i < A0H; i++) {
            int count = A00(c11939i4);
            arrayList.add(A03(c11939i4, count));
        }
        return arrayList;
    }

    public static Date A07(C11939I4 c11939i4) {
        Date date = new Date((long) A02(c11939i4).doubleValue());
        c11939i4.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C11939I4 c11939i4) {
        int A0H = c11939i4.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int type = 0; type < A0H; type++) {
            String key = A05(c11939i4);
            if (A02[5].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "s6CWgTXMjjwS89lYbS7BwJEShue9hkZ";
            strArr[3] = "FaY1";
            int count = A00(c11939i4);
            hashMap.put(key, A03(c11939i4, count));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C11939I4 c11939i4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c11939i4);
            int A00 = A00(c11939i4);
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(c11939i4, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11597CB
    public final void A0B(C11939I4 c11939i4, long j) throws C11464A0 {
        if (A00(c11939i4) == 2) {
            if (!A04(8, 10, 73).equals(A05(c11939i4)) || A00(c11939i4) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c11939i4);
            String name = A04(0, 8, 122);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                int nameType = (durationSeconds > 0.0d ? 1 : (durationSeconds == 0.0d ? 0 : -1));
                if (nameType > 0) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C11464A0();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11597CB
    public final boolean A0C(C11939I4 c11939i4) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
