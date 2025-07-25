package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Y4 */
/* loaded from: assets/audience_network.dex */
public final class C12917Y4 implements InterfaceC11651D3 {
    public static byte[] A06;
    public static String[] A07 = {"ozKLM35x", "89s31JUfMrZJWctE45qdGJ6T2D36rtw7", "wULMSiUE8pED8KlvKGUtDiqYD06PaSsy", "mcN6y4oYymoPFWefFDUXFi8CnKpvaN4w", "77Zhk1ZaT9yzzMoTBrvRuLN3tL52p4ST", "AG5z22qrSfB0ERoxPe8dtbPUPVXzTs03", "F3a", "7gV"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC11595C9 A03;
    public boolean A04;
    public final C11939I4 A05 = new C11939I4(10);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-18, 19, 29, 13, 11, 28, 14, 19, 24, 17, -54, 19, 24, 32, 11, 22, 19, 14, -54, -13, -18, -35, -54, 30, 11, 17, -40, -13, -62, -31, -12, -16, -13, -12, 1, -9, 6, 6, 2, -1, -7, -9, 10, -1, 5, 4, -59, -1, -6, -55};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void A4n(C11939I4 c11939i4) {
        if (!this.A04) {
            return;
        }
        int A04 = c11939i4.A04();
        int bytesAvailable = this.A00;
        if (bytesAvailable < 10) {
            int bytesAvailable2 = this.A00;
            int min = Math.min(A04, 10 - bytesAvailable2);
            byte[] bArr = c11939i4.A00;
            int A062 = c11939i4.A06();
            byte[] bArr2 = this.A05.A00;
            int bytesAvailable3 = this.A00;
            System.arraycopy(bArr, A062, bArr2, bytesAvailable3, min);
            int bytesAvailable4 = this.A00;
            if (bytesAvailable4 + min == 10) {
                this.A05.A0Y(0);
                int A0E = this.A05.A0E();
                String[] strArr = A07;
                String str = strArr[1];
                String str2 = strArr[4];
                int headerBytesAvailable = str.charAt(15);
                int bytesAvailable5 = str2.charAt(15);
                if (headerBytesAvailable == bytesAvailable5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[1] = "LZR4cpLkXUeIdB94hJ2WViwfeKsCeQUI";
                strArr2[4] = "aZRBdk8aNDprtCeVGfVDyLvszKflkztm";
                if (73 == A0E) {
                    int headerBytesAvailable2 = this.A05.A0E();
                    if (68 == headerBytesAvailable2) {
                        int headerBytesAvailable3 = this.A05.A0E();
                        if (51 == headerBytesAvailable3) {
                            this.A05.A0Z(3);
                            int bytesAvailable6 = this.A05.A0D();
                            this.A01 = bytesAvailable6 + 10;
                        }
                    }
                }
                Log.w(A00(26, 9, 25), A00(0, 26, 52));
                this.A04 = false;
                return;
            }
        }
        int headerBytesAvailable4 = this.A01;
        int bytesAvailable7 = this.A00;
        int bytesToWrite = Math.min(A04, headerBytesAvailable4 - bytesAvailable7);
        this.A03.AFv(c11939i4, bytesToWrite);
        int bytesAvailable8 = this.A00;
        this.A00 = bytesAvailable8 + bytesToWrite;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void A5B(InterfaceC11585Bz interfaceC11585Bz, C11665DH c11665dh) {
        c11665dh.A05();
        this.A03 = interfaceC11585Bz.AHA(c11665dh.A03(), 4);
        this.A03.A69(Format.A0B(c11665dh.A04(), A00(35, 15, 32), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AEL() {
        if (!this.A04 || this.A01 == 0 || this.A00 != this.A01) {
            return;
        }
        this.A03.AFw(this.A02, 1, this.A01, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AEM(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11651D3
    public final void AG6() {
        this.A04 = false;
    }
}
