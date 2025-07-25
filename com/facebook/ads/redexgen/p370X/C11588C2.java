package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.C2 */
/* loaded from: assets/audience_network.dex */
public final class C11588C2 {
    public final C11939I4 A00 = new C11939I4(10);

    public final Metadata A00(InterfaceC11584By interfaceC11584By, InterfaceC11695Dn interfaceC11695Dn) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC11584By.AEO(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = C12896Xi.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC11584By.AEO(bArr, 10, A0D);
                    metadata = new C12896Xi(interfaceC11695Dn).A0O(bArr, framesLength);
                } else {
                    interfaceC11584By.A3s(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC11584By.AFq();
        interfaceC11584By.A3s(tagLength);
        return metadata;
    }
}
