package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tl */
/* loaded from: assets/audience_network.dex */
public class C12654Tl implements InterfaceC112025W {
    public static String[] A01 = {"EbGpmssVJ7ns5QL3Rl3UMQ1bkFVQ99jJ", "NZiaRg2dkcqShBYEYgfcfS6cvloj595L", "orBeTHrcfmlzSHmkgrBC5PhD7dWIdW6R", "A0QUoJlw", "r5xapKwo2g0pU1r2itXQ9K5SrPer64wf", "XFka6Ze1I6IepT0r6LvaraMv7MRENHMC", "Xj0im9L41l0kDU7dj2M6tiOB0nkMWcds", "VCdvqSH1BrwZZsOdC7BZghv3f2EYDVkv"};
    public final /* synthetic */ C11468A4 A00;

    public C12654Tl(C11468A4 c11468a4) {
        this.A00 = c11468a4;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC112025W
    public final boolean A9J() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        if (atomicBoolean.get()) {
            boolean A0Z = this.A00.A0Z();
            String[] strArr = A01;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A01[0] = "O5SuZCLVdBOcw9avK46kWbT1hYIehzyg";
            if (!A0Z) {
                return false;
            }
        }
        return true;
    }
}
