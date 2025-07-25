package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DK */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11668DK {
    public static byte[] A00;
    public static String[] A01 = {"AEqcgD4JaCbPweJRtkvRLWDeBNXI7i1o", "t1RWgXS6cSNFHJshXIU", "SMSgrwiwgA3rvPhzq7oQfB6kFQMWr4k6", "PKYIcXxZrPtrP9ucCCQI249qFUNZtca8", "hoRPpA13YBWl9kQe0Ju06B8Ej2HuGhLd", "yAYAhjQoLGQW20rPw3ZVtIPdVrFUhvbM", "chuWCtlWb8fn1IFv6bl", "tlzhwX"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C12903Xq A00(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        AbstractC11914Hf.A01(interfaceC11584By);
        C11939I4 c11939i4 = new C11939I4(16);
        if (C11667DJ.A00(interfaceC11584By, c11939i4).A00 != AbstractC11953IK.A08(A01(111, 4, 13))) {
            return null;
        }
        int i = 0;
        interfaceC11584By.AEO(c11939i4.A00, 0, 4);
        c11939i4.A0Y(0);
        int A08 = c11939i4.A08();
        int A082 = AbstractC11953IK.A08(A01(195, 4, 2));
        String A012 = A01(199, 15, 98);
        if (A08 != A082) {
            Log.e(A012, A01(115, 25, 29) + A08);
            return null;
        }
        C11667DJ A002 = C11667DJ.A00(interfaceC11584By, c11939i4);
        while (A002.A00 != AbstractC11953IK.A08(A01(218, 4, 72))) {
            interfaceC11584By.A3s((int) A002.A01);
            A002 = C11667DJ.A00(interfaceC11584By, c11939i4);
        }
        AbstractC11914Hf.A04(A002.A01 >= 16);
        interfaceC11584By.AEO(c11939i4.A00, 0, 16);
        c11939i4.A0Y(0);
        int A0C = c11939i4.A0C();
        int A0C2 = c11939i4.A0C();
        int A0B = c11939i4.A0B();
        int A0B2 = c11939i4.A0B();
        int A0C3 = c11939i4.A0C();
        int A0C4 = c11939i4.A0C();
        int i2 = (A0C2 * A0C4) / 8;
        if (A0C3 == i2) {
            switch (A0C) {
                case 1:
                case 65534:
                    i = AbstractC11953IK.A02(A0C4);
                    break;
                case 3:
                    if (A0C4 == 32) {
                        i = 4;
                        break;
                    }
                    break;
                default:
                    Log.e(A012, A01(166, 29, 118) + A0C);
                    return null;
            }
            if (i == 0) {
                Log.e(A012, A01(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 26, 97) + A0C4 + A01(0, 10, 38) + A0C);
                return null;
            }
            interfaceC11584By.A3s(((int) A002.A01) - 16);
            return new C12903Xq(A0C2, A0B, A0B2, A0C3, A0C4, i);
        }
        throw new C11464A0(A01(57, 26, 27) + i2 + A01(10, 7, 80) + A0C3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{71, -115, -106, -103, 71, -101, -96, -105, -116, 71, -116, 113, -72, -64, -59, -117, 113, -107, -70, -57, -64, -67, 114, -69, -59, 114, -58, -63, -63, 114, -66, -77, -60, -71, -73, 114, 122, -48, -124, -103, -108, 125, 123, 114, -58, -63, 114, -59, -67, -69, -62, -115, 114, -69, -74, -116, 114, 97, -108, -116, -127, Byte.MAX_VALUE, -112, -127, UnsignedBytes.MAX_POWER_OF_TWO, 60, 126, -120, -117, Byte.MAX_VALUE, -121, 60, 125, -120, -123, -125, -118, -119, -127, -118, -112, 86, 60, -107, -77, -70, -69, -66, -75, -70, -77, 108, -63, -70, -73, -70, -69, -61, -70, 108, -93, -115, -94, 108, -81, -76, -63, -70, -73, -122, 108, 96, 87, 84, 84, 115, -116, -111, -109, -114, -114, -115, -112, -110, -125, -126, 62, 112, 103, 100, 100, 62, -124, -115, -112, -117, Byte.MAX_VALUE, -110, 88, 62, -73, -48, -43, -41, -46, -46, -47, -44, -42, -57, -58, -126, -71, -93, -72, -126, -60, -53, -42, -126, -58, -57, -46, -42, -54, -126, -52, -27, -22, -20, -25, -25, -26, -23, -21, -36, -37, -105, -50, -72, -51, -105, -35, -26, -23, -28, -40, -21, -105, -21, -16, -25, -36, -79, -105, 90, 68, 89, 72, -70, -60, -39, -85, -56, -60, -57, -56, -43, -75, -56, -60, -57, -56, -43, 112, 109, UnsignedBytes.MAX_POWER_OF_TWO, 109, -81, -74, -67, 105};
    }

    static {
        A02();
    }

    public static void A03(InterfaceC11584By interfaceC11584By, C12903Xq c12903Xq) throws IOException, InterruptedException {
        AbstractC11914Hf.A01(interfaceC11584By);
        AbstractC11914Hf.A01(c12903Xq);
        interfaceC11584By.AFq();
        C11939I4 c11939i4 = new C11939I4(8);
        C11667DJ A002 = C11667DJ.A00(interfaceC11584By, c11939i4);
        while (true) {
            int i = A002.A00;
            if (A01[2].charAt(16) == 'G') {
                throw new RuntimeException();
            }
            A01[7] = "pjtu3pP43CbuIQWGV1GCDykZbZDfz";
            if (i != AbstractC11953IK.A08(A01(214, 4, 11))) {
                Log.w(A01(199, 15, 98), A01(83, 28, 75) + A002.A00);
                long j = A002.A01 + 8;
                if (A002.A00 == AbstractC11953IK.A08(A01(111, 4, 13))) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    interfaceC11584By.AGq((int) j);
                    A002 = C11667DJ.A00(interfaceC11584By, c11939i4);
                } else {
                    throw new C11464A0(A01(17, 40, 81) + A002.A00);
                }
            } else {
                interfaceC11584By.AGq(8);
                c12903Xq.A06(interfaceC11584By.A86(), A002.A01);
                return;
            }
        }
    }
}
