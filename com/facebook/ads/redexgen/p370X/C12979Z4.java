package com.facebook.ads.redexgen.p370X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Z4 */
/* loaded from: assets/audience_network.dex */
public final class C12979Z4 implements InterfaceC11523Ax {
    public static byte[] A01;
    public final /* synthetic */ C12978Z3 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 44, -97, -45, -62, -57, -51, -78, -48, -65, -63, -55, -90, -60, -53, -52, -49, -58, -53, -60, 125, -58, -54, -51, -52, -48, -48, -58, -65, -55, -42, 125, -55, -66, -49, -60, -62, 125, -66, -46, -63, -58, -52, 125, -55, -66, -47, -62, -53, -64, -42, -105, 125, -92, -63, -58, -61, -70, -64, -58, -60, 113, -78, -58, -75, -70, -64, 113, -59, -70, -66, -74, -60, -59, -78, -66, -63, 113, 121, -73, -61, -78, -66, -74, 113, -63, -64, -60, -70, -59, -70, -64, -65, 113, -66, -70, -60, -66, -78, -59, -76, -71, 122, -117, 113, 118, -109, -104, -107, -116, -110, -104, -106, 67, -124, -104, -121, -116, -110, 67, -105, -116, -112, -120, -106, -105, -124, -112, -109, 67, 75, -106, -100, -106, -105, -120, -112, 67, -122, -113, -110, -122, -114, 67, -112, -116, -106, -112, -124, -105, -122, -117, 76, 93, 67};
    }

    public C12979Z4(C12978Z3 c12978z3) {
        this.A00 = c12978z3;
    }

    public /* synthetic */ C12979Z4(C12978Z3 c12978z3, C11526B0 c11526b0) {
        this(c12978z3);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11523Ax
    public final void ACM(long j) {
        Log.w(A00(2, 10, 85), A00(12, 41, 84) + j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11523Ax
    public final void ADB(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(53, 52, 72)).append(j);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb2 = append3.append(A04).toString();
        if (!C12978Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb2);
            return;
        }
        throw new C11529B3(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11523Ax
    public final void ADk(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(105, 50, 26)).append(j);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb2 = append3.append(A04).toString();
        if (!C12978Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb2);
            return;
        }
        throw new C11529B3(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11523Ax
    public final void ADt(int i, long j) {
        InterfaceC11517Ar interfaceC11517Ar;
        long j2;
        InterfaceC11517Ar interfaceC11517Ar2;
        interfaceC11517Ar = this.A00.A0R;
        if (interfaceC11517Ar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A0E;
            long j3 = elapsedRealtime - j2;
            interfaceC11517Ar2 = this.A00.A0R;
            interfaceC11517Ar2.ADu(i, j, j3);
        }
    }
}
