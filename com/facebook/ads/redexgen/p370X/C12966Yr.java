package com.facebook.ads.redexgen.p370X;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yr */
/* loaded from: assets/audience_network.dex */
public final class C12966Yr implements InterfaceC11586C0 {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC11583Bx> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{93, 106, 106, 119, 106, 56, 113, 118, 107, 108, 121, 118, 108, 113, 121, 108, 113, 118, Byte.MAX_VALUE, 56, 94, 84, 89, 91, 56, 125, 96, 108, 125, 118, 107, 113, 119, 118, 74, 113, 122, 103, 111, 122, 124, 107, 122, 123, 63, 122, 109, 109, 112, 109, 63, 124, 109, 122, 126, 107, 118, 113, 120, 63, 89, 83, 94, 92, 63, 122, 103, 107, 109, 126, 124, 107, 112, 109, 89, 85, 87, 20, 92, 91, 89, 95, 88, 85, 85, 81, 20, 91, 94, 73, 20, 83, 84, 78, 95, 72, 84, 91, 86, 20, 95, 66, 85, 74, 86, 91, 67, 95, 72, 8, 20, 95, 66, 78, 20, 92, 86, 91, 89, 20, 124, 86, 91, 89, Byte.MAX_VALUE, 66, 78, 72, 91, 89, 78, 85, 72};
    }

    static {
        A01();
        Constructor<? extends InterfaceC11583Bx> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 113)).asSubclass(InterfaceC11583Bx.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 83), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11586C0
    public final synchronized InterfaceC11583Bx[] A4x() {
        InterfaceC11583Bx[] interfaceC11583BxArr;
        interfaceC11583BxArr = new InterfaceC11583Bx[A07 == null ? 12 : 13];
        interfaceC11583BxArr[0] = new C12951Yc(this.A01);
        interfaceC11583BxArr[1] = new C12941YS(this.A00);
        interfaceC11583BxArr[2] = new C12939YQ(this.A03);
        interfaceC11583BxArr[3] = new C12948YZ(this.A02);
        interfaceC11583BxArr[4] = new C12925YC();
        interfaceC11583BxArr[5] = new C12928YF();
        interfaceC11583BxArr[6] = new C12906Xt(this.A05, this.A04);
        interfaceC11583BxArr[7] = new C12958Yj();
        interfaceC11583BxArr[8] = new C12933YK();
        interfaceC11583BxArr[9] = new C12912Xz();
        interfaceC11583BxArr[10] = new C12904Xr();
        interfaceC11583BxArr[11] = new C12961Ym();
        if (A07 != null) {
            try {
                interfaceC11583BxArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 84), e);
            }
        }
        return interfaceC11583BxArr;
    }
}
