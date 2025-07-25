package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.as */
/* loaded from: assets/audience_network.dex */
public class C13090as extends AbstractC1117151 {
    public static byte[] A06;
    public static String[] A07 = {"ZeVLivVBnS1aoVlC2PGSN001bhNNVWpd", "UVHNMhASFprendMTBixyPal4p5ABOqh9", "McvoL7vwBcNsRrFgWF8", "NjfWBR2llDufPeBAgLyuBDteRTJCHxSb", "wixo9thO", "Otknv8q9MbYFm1QayK0knTm3Lm4p4QUP", "Dtck5bq60bDmwFSuqNFF3ANsa4oCLChk", "09JoBoJUIjBPlvD9emsVrlLKVUsGd7rc"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i) {
        AbstractC111584o A08 = A08();
        if (A08 == null || !A08.A21()) {
            return 0;
        }
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return A0N(A08.A0o(view) - c111594p.topMargin, A08.A0j(view) + c111594p.bottomMargin, A08.A0g(), A08.A0X() - A08.A0d(), i);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{45, 8, 15, 4, 0, 19, 50, 12, 14, 14, 21, 9, 50, 2, 19, 14, 13, 13, 4, 19, 124, 74, 80, 5, 86, 77, 74, 80, 73, 65, 5, 74, 83, SignedBytes.MAX_POWER_OF_TWO, 87, 87, 76, 65, SignedBytes.MAX_POWER_OF_TWO, 5, 70, 74, 72, 85, 80, 81, SignedBytes.MAX_POWER_OF_TWO, 118, 70, 87, 74, 73, 73, 115, SignedBytes.MAX_POWER_OF_TWO, 70, 81, 74, 87, 99, 74, 87, 117, 74, 86, 76, 81, 76, 74, 75, 5, 82, 77, SignedBytes.MAX_POWER_OF_TWO, 75, 5, 81, 77, SignedBytes.MAX_POWER_OF_TWO, 5, 105, 68, 92, 74, 80, 81, 104, 68, 75, 68, 66, SignedBytes.MAX_POWER_OF_TWO, 87, 5, 65, 74, SignedBytes.MAX_POWER_OF_TWO, 86, 5, 75, 74, 81, 5, 76, 72, 85, 73, SignedBytes.MAX_POWER_OF_TWO, 72, SignedBytes.MAX_POWER_OF_TWO, 75, 81, 5, 117, 104, 103, 118, 38, 118, 116, 99, 96, 99, 116, 99, 104, 101, 99, 38, 117, 110, 105, 115, 106, 98, 38, 100, 99, 38, 105, 104, 99, 38, 105, 96, 38, 114, 110, 99, 38, 101, 105, 104, 117, 114, 103, 104, 114, 117, 38, 98, 99, 96, 111, 104, 99, 98, 38, 111, 104, 38, 85, 107, 105, 105, 114, 110, 85, 101, 116, 105, 106, 106, 99, 116, 42, 38, 117, 114, 103, 116, 114, 111, 104, 97, 38, 113, 111, 114, 110, 38, 85, 72, 71, 86, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i) {
        AbstractC111584o A08 = A08();
        if (A08 == null || !A08.A20()) {
            return 0;
        }
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return A0N(A08.A0k(view) - c111594p.leftMargin, A08.A0n(view) + c111594p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
    }

    static {
        A06();
    }

    public C13090as(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        if (this.A02 == null || this.A02.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int before = i - i2;
        if (i * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C111694z c111694z) {
        PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            c111694z.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        int A0L = A0L(10000);
        int i = (int) (this.A00 * 1.2f);
        int i2 = (int) (this.A01 * 1.2f);
        int time = A07[2].length();
        if (time != 19) {
            throw new RuntimeException();
        }
        A07[1] = "hx3pIt9eJlYI2ywoto5TCaec45lSGfjK";
        int time2 = (int) (A0L * 1.2f);
        c111694z.A04(i, i2, time2, this.A05);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC1117151
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC1117151
    public final void A0H(int i, int i2, C1117353 c1117353, C111694z c111694z) {
        if (A06() == 0) {
            A09();
            if (A07[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "mtmNmOzcoe2a0U4cnzAn20gs4sdBvWQ8";
            strArr[3] = "eV2w3A07ZjFunHiJvnAZuuNmUx5etHx7";
            return;
        }
        this.A00 = A01(this.A00, i);
        this.A01 = A01(this.A01, i2);
        if (A07[4].length() != 8) {
            if (this.A00 != 0) {
                return;
            }
        } else {
            String[] strArr2 = A07;
            strArr2[7] = "DcFC9yFlUF16xNqjYqSfoPj4l29Ulhpi";
            strArr2[3] = "h8WgdOPxw0F7hfvsQm1LsAkbSgkBaMel";
            if (this.A00 != 0) {
                return;
            }
        }
        if (this.A01 == 0) {
            A07(c111694z);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC1117151
    public void A0I(View view, C1117353 c1117353, C111694z c111694z) {
        int A0O = A0O(view, A0K());
        int dx = A00();
        int A03 = A03(view, dx);
        int dy = A0O * A0O;
        int dx2 = A03 * A03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -A0O;
            int dy2 = -A03;
            c111694z.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        if (this.A02 == null || this.A02.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException(A04(113, 93, 125));
        }
    }

    public PointF A0P(int i) {
        AbstractC111584o A08 = A08();
        if (A08 instanceof InterfaceC1117050) {
            return ((InterfaceC1117050) A08).A4k(i);
        }
        Log.w(A04(0, 20, 26), A04(20, 93, 94) + InterfaceC1117050.class.getCanonicalName());
        return null;
    }
}
