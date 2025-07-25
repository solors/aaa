package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.X2 */
/* loaded from: assets/audience_network.dex */
public final class C12856X2 implements InterfaceC11872Gz {
    public static byte[] A00;
    public static final InterfaceC11871Gy A01;
    public static final C12856X2 A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{95, 110, 118, 118, 98, 59, 104, 116, 110, 105, 120, 126};
    }

    static {
        A01();
        A02 = new C12856X2();
        A01 = new C12857X3();
    }

    public C12856X2() {
    }

    public /* synthetic */ C12856X2(C12857X3 c12857x3) {
        this();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws IOException {
        throw new IOException(A00(0, 12, 90));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
