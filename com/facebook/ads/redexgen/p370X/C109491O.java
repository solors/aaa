package com.facebook.ads.redexgen.p370X;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1O */
/* loaded from: assets/audience_network.dex */
public final class C109491O implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, UnsignedBytes.MAX_POWER_OF_TWO, -61, -61, -111, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, 24, 29, 21, 25, 37, 34, 37, 40, 22, 35, 24, 45, 19, 23, 35, 32, 35, 38, 27, 44, 25, 23, 27, 39, 36, 39, 42, 14, 31, 12, 10, 14, 26, 23, 26, 29, 10, 26, 33, 16, 29, 10, 24, 16, 15, 20, 12, 17, 34, 15, 13, 34, 19, 38, 34, 13, 17, 29, 26, 29, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, -20, -4, 3, -14, -1, -20, -6, -14, -15, -10, -18, 48, 50, 31, 49, 38, 49, 41, 34, 28, 32, 44, 41, 44, 47, 29, 18, 29, 21, 14, 8, 12, 24, 21, 24, 27};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 76));
        A0B = Color.parseColor(A02(7, 7, 18));
        A0C = Color.parseColor(A02(21, 7, 40));
        String A02 = A02(28, 9, 25);
        A0D = Color.parseColor(A02);
        A0E = Color.parseColor(A02(0, 7, 7));
        A0F = Color.parseColor(A02);
    }

    public C109491O(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
        this.A08 = i9;
    }

    public static int A00(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i;
    }

    public static C109491O A01(JSONObject jSONObject) {
        return new C109491O(A00(jSONObject, A02(37, 12, 27), A0A), A00(jSONObject, A02(57, 10, 112), A0B), A00(jSONObject, A02(135, 14, 121), ViewCompat.MEASURED_STATE_MASK), A00(jSONObject, A02(49, 8, 114), A0C), A00(jSONObject, A02(67, 9, 116), A0D), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(96, 14, 106), -1), A00(jSONObject, A02(110, 25, 73), A0F), A00(jSONObject, A02(149, 11, 101), ViewCompat.MEASURED_STATE_MASK));
    }

    public final int A04(boolean z) {
        if (z) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z) {
        if (z) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z) {
        if (z) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z) {
        return z ? A0E : this.A03;
    }

    public final int A08(boolean z) {
        return z ? this.A05 : this.A04;
    }

    public final int A09(boolean z) {
        return z ? this.A07 : this.A06;
    }

    public final int A0A(boolean z) {
        if (z) {
            return -1;
        }
        return this.A08;
    }
}
