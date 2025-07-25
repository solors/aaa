package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ep */
/* loaded from: assets/audience_network.dex */
public final class C11742Ep {
    public static byte[] A03;
    public InterfaceC11583Bx A00;
    public final InterfaceC11585Bz A01;
    public final InterfaceC11583Bx[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{67, 74, 9, 5, 31, 6, 14, 74, 24, 15, 11, 14, 74, 30, 2, 15, 74, 25, 30, 24, 15, 11, 7, 68, 12, 45, 44, 39, 98, 45, 36, 98, 54, 42, 39, 98, 35, 52, 35, 43, 46, 35, 32, 46, 39, 98, 39, 58, 54, 48, 35, 33, 54, 45, 48, 49, 98, 106};
    }

    public C11742Ep(InterfaceC11583Bx[] interfaceC11583BxArr, InterfaceC11585Bz interfaceC11585Bz) {
        this.A02 = interfaceC11583BxArr;
        this.A01 = interfaceC11585Bz;
    }

    public final InterfaceC11583Bx A02(InterfaceC11584By interfaceC11584By, Uri uri) throws IOException, InterruptedException {
        if (this.A00 != null) {
            return this.A00;
        }
        InterfaceC11583Bx[] interfaceC11583BxArr = this.A02;
        int length = interfaceC11583BxArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC11583Bx interfaceC11583Bx = interfaceC11583BxArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC11584By.AFq();
                throw th;
            }
            if (interfaceC11583Bx.AGs(interfaceC11584By)) {
                this.A00 = interfaceC11583Bx;
                interfaceC11584By.AFq();
                break;
            }
            continue;
            interfaceC11584By.AFq();
            i++;
        }
        if (this.A00 != null) {
            this.A00.A9D(this.A01);
            return this.A00;
        }
        throw new C12881XR(A00(24, 34, 107) + AbstractC11953IK.A0S(this.A02) + A00(0, 24, 67), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
