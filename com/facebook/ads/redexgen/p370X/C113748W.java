package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8W */
/* loaded from: assets/audience_network.dex */
public final class C113748W {
    public static byte[] A0A;
    public static String[] A0B = {"HvWirbE21CthcAzglwYfTu8hbbodSMpt", "IeFog7wu84ahUP8wrgQRktORVTrd36mu", "iK4FOuTHNOskZfjZXsfgR2qFw0uXKXeK", "C94HT2jeMQxh5gbTQbuMo6", "sYjDRqqzhUlQiHGhQNwIRm9nE6", "ToeXfBs6HhTxzZ9ArPJAGMlk", "KWsBEUuyQyen4sbZ9JEq20dYDlqTcXTf", "JMF3DYKQmRYKnieuthRXwzFPxh0qj8YI"};
    public C113758X A01;
    public AdPlacementType A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public JSONObject A09;
    public int A00 = 0;
    public List<C113728U> A08 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-8, 9};
    }

    static {
        A01();
    }

    public C113748W(C113758X c113758x, String str, String str2, String str3, String str4, String str5) {
        this.A01 = c113758x;
        this.A05 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A07 = str5;
        if (this.A01 != null) {
            this.A02 = this.A01.A0D();
        }
    }

    public final int A02() {
        return this.A08.size();
    }

    public final long A03() {
        if (this.A01 != null) {
            return this.A01.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C113728U A04() {
        if (this.A00 < this.A08.size()) {
            this.A00++;
            return this.A08.get(this.A00 - 1);
        }
        return null;
    }

    public final C113758X A05() {
        return this.A01;
    }

    public final AdPlacementType A06() {
        return this.A02;
    }

    public final String A07() {
        return this.A03;
    }

    public final String A08() {
        return this.A04;
    }

    public final String A09() {
        if (this.A00 > 0) {
            int i = this.A00;
            if (A0B[2].charAt(13) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[4] = "rOOT956xIOu8KS0VzerRP9k2FI";
            strArr[3] = "CsBaNUluQU2chTuAQUApCe";
            if (i <= this.A08.size()) {
                return this.A08.get(this.A00 - 1).A04().optString(A00(0, 2, 63));
            }
        }
        if (A0B[7].charAt(12) != 'n') {
            return null;
        }
        A0B[2] = "3lTgH9thszczufuEmz4eSAEm15D6iTfe";
        return null;
    }

    public final String A0A() {
        return this.A05;
    }

    public final String A0B() {
        C113728U c113728u;
        if (this.A08.isEmpty() || (c113728u = this.A08.get(0)) == null || c113728u.A04() == null) {
            return null;
        }
        return c113728u.A04().optString(A00(0, 2, 63));
    }

    public final String A0C() {
        return this.A06;
    }

    public final String A0D() {
        return this.A07;
    }

    public final JSONObject A0E() {
        return this.A09;
    }

    public final void A0F(C113728U c113728u) {
        this.A08.add(c113728u);
    }

    public final void A0G(JSONObject jSONObject) {
        this.A09 = jSONObject;
    }

    public final boolean A0H() {
        return this.A01 == null || C12168Lu.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
