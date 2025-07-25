package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Y */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111424Y {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC111584o A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public AbstractC111424Y(AbstractC111584o abstractC111584o) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC111584o;
    }

    public /* synthetic */ AbstractC111424Y(AbstractC111584o abstractC111584o, C13089ar c13089ar) {
        this(abstractC111584o);
    }

    public static C13089ar A00(AbstractC111584o abstractC111584o) {
        return new C13089ar(abstractC111584o);
    }

    public static C13088aq A01(AbstractC111584o abstractC111584o) {
        return new C13088aq(abstractC111584o);
    }

    public static AbstractC111424Y A02(AbstractC111584o abstractC111584o, int i) {
        switch (i) {
            case 0:
                return A00(abstractC111584o);
            case 1:
                return A01(abstractC111584o);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
