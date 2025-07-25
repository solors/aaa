package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4k */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111544k {
    public static byte[] A06;
    public static String[] A07 = {"7", "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public InterfaceC111524i A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract boolean A0D(AbstractC1117656 abstractC1117656);

    public abstract boolean A0E(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2);

    public abstract boolean A0F(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2);

    public abstract boolean A0G(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2);

    public abstract boolean A0H(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, C111534j c111534j, C111534j c111534j2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC1117656 abstractC1117656);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC1117656 abstractC1117656) {
        int i;
        i = abstractC1117656.A0C;
        int i2 = i & 14;
        if (abstractC1117656.A0Z()) {
            return 4;
        }
        int flags = i2 & 4;
        if (flags == 0) {
            int pos = abstractC1117656.A0J();
            int oldPos = abstractC1117656.A0G();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    private final C111534j A01() {
        return new C111534j();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C111534j A08(C1117353 c1117353, AbstractC1117656 abstractC1117656) {
        return A01().A01(abstractC1117656);
    }

    public final C111534j A09(C1117353 c1117353, AbstractC1117656 abstractC1117656, int i, List<Object> payloads) {
        return A01().A01(abstractC1117656);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 112));
        } else {
            this.A05.clear();
        }
    }

    public final void A0B(InterfaceC111524i interfaceC111524i) {
        this.A04 = interfaceC111524i;
    }

    public final void A0C(AbstractC1117656 abstractC1117656) {
        if (this.A04 != null) {
            this.A04.AB9(abstractC1117656);
        }
    }

    public boolean A0M(AbstractC1117656 abstractC1117656, List<Object> payloads) {
        return A0D(abstractC1117656);
    }
}
