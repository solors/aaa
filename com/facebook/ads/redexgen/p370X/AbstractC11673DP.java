package com.facebook.ads.redexgen.p370X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DP */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11673DP extends AbstractC12969Yu<C11672DO, AbstractC11670DM, C11807Fu> implements InterfaceC12880XQ {
    public static byte[] A01;
    public static String[] A02 = {"Y6iEYcT7zry5i7Oc3Z", "04pEmQzwcYeUfpdk9PqlLIcwm62m4", "Bed18TpTKJb5sLpTCdiGUSxVMjXfmE9e", "4Xs", "", "zUuia8YnRm0GUNbZhXhhg7iUMyzv7XkB", "vFzU3JWXjm0ZZYoWpiZ", "DhOBPQIIWrNpSVq3fDHAHYKNMWYv2IOx"};
    public final String A00;

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{60, 7, 12, 17, 25, 12, 10, 29, 12, 13, 73, 13, 12, 10, 6, 13, 12, 73, 12, 27, 27, 6, 27};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "1AT";
        strArr2[1] = "mPu6QXTRp9h4XliHh3A308dhTdRxx";
    }

    public abstract InterfaceC11806Ft A0b(byte[] bArr, int i, boolean z) throws C11807Fu;

    static {
        A0J();
    }

    public AbstractC11673DP(String str) {
        super(new C11672DO[2], new AbstractC11670DM[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6T] */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC12969Yu
    /* renamed from: A0E */
    public final C112606T A0V() {
        return new AbstractC11670DM(this) { // from class: com.facebook.ads.redexgen.X.6T
            public final AbstractC11673DP A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.p370X.AbstractC11670DM
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC12969Yu
    /* renamed from: A0F */
    public final C11807Fu A0W(C11672DO c11672do, AbstractC11670DM abstractC11670DM, boolean z) {
        try {
            ByteBuffer inputData = c11672do.A01;
            abstractC11670DM.A09(((C12971Yw) c11672do).A00, A0b(inputData.array(), inputData.limit(), z), c11672do.A00);
            abstractC11670DM.A01(Integer.MIN_VALUE);
            return null;
        } catch (C11807Fu e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC12969Yu
    /* renamed from: A0G */
    public final C11807Fu A0X(Throwable th) {
        return new C11807Fu(A0I(0, 23, 32), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC12969Yu
    /* renamed from: A0H */
    public final C11672DO A0T() {
        return new C11672DO();
    }

    public final void A0c(AbstractC11670DM abstractC11670DM) {
        super.A0a(abstractC11670DM);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12880XQ
    public final void AGb(long j) {
    }
}
