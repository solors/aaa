package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zl */
/* loaded from: assets/audience_network.dex */
public final class C13022Zl implements InterfaceC1134280 {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC113417z A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C113397x A01 = A00();

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C13022Zl(Context context, InterfaceC113417z interfaceC113417z) {
        this.A00 = context;
        this.A02 = interfaceC113417z;
    }

    private C113397x A00() {
        return C113397x.A00(AbstractC12071KJ.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.AAq(new C13023Zm(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C113397x c113397x = new C113397x(strArr, num, num2);
        C113397x newSettings = this.A01;
        if (c113397x.equals(newSettings)) {
            return;
        }
        this.A01 = c113397x;
        this.A03.set(true);
        SharedPreferences.Editor edit = AbstractC12071KJ.A00(this.A00).edit();
        C113397x newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1134280
    public final C113397x A76() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1134280
    public final boolean A9e() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0Y = C11979Im.A0Y(this.A00);
        String identifier = this.A01.A07();
        for (String str : A0Y) {
            if (identifier.contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1134280
    public final boolean AGj() {
        A02();
        return this.A03.getAndSet(false);
    }
}
