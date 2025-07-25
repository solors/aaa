package com.facebook.ads.redexgen.p370X;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1F */
/* loaded from: assets/audience_network.dex */
public final class C109401F implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C109421H A00;
    public C109431I A01;
    public C109471M A02;
    public C109501P A03;
    public C109511Q A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{103, 90, 14, 89, 71, 66, 66, 14, 79, 91, 90, 65, 67, 79, 90, 71, 77, 79, 66, 66, 87, 14, 65, 94, 75, SignedBytes.MAX_POWER_OF_TWO, 14, 71, SignedBytes.MAX_POWER_OF_TWO, 14, 117, 93, 75, 77, 93, 115, 93, 27, 30, 37, 25, 8, 31, 27, 14, 19, 12, 31, 37, 14, 3, 10, 31, 71, 86, 86, 121, 85, 79, 92, 67, 56, 53, 62, 35, 85, 66, 67, 67, 88, 89, 104, 94, 84, 88, 89, 100, 102, 107, 107, 88, 115, 104, 88, 102, 100, 115, 110, 104, 105, 100, 102, 115, 98, 96, 104, 117, 126, 10, 11, 2, 15, 23, 49, 13, 2, 7, 13, 5, 49, 26, 11, 22, 26, 53, 52, 34, 37, 56, 63, 48, 37, 56, 62, 63, 14, 37, 56, 37, 61, 52, 70, 77, 85, 76, 78, 77, 67, 70, 125, 65, 77, 87, 76, 86, 73, 66, 72, 115, 79, 77, 94, 72, 115, 74, 67, 94, 79, 73, 115, 90, 69, 73, 91, 115, 88, 69, 65, 73, 101, 110, 100, 95, 99, 97, 114, 100, 95, 105, 109, 97, 103, 101, 115, 32, 36, 39, 34, 25, 37, 41, 43, 43, 39, 40, 34, 114, 112, 123, 112, 103, 124, 118, 74, 97, 112, 109, 97, 109, 96, 108, 98, 109, 113, 19, 23, 27, 29, 31, 72, 82, 126, 83, 68, 86, SignedBytes.MAX_POWER_OF_TWO, 83, 69, 68, 69, 126, SignedBytes.MAX_POWER_OF_TWO, 69, 120, 98, 78, 103, 120, 117, 116, 126, 78, 112, 100, 117, 120, 126, 78, 124, 100, 101, 116, 117, 31, 5, 41, 1, 23, 2, 21, 30, 41, 23, 24, 18, 41, 20, 4, 25, 1, 5, 19, 69, 84, 86, 94, 84, 82, 80, 82, 65, 84, 73, 78, 71, Byte.MAX_VALUE, 67, 79, 85, 78, 84, 41, 58, 47, 50, 53, 60, 4, 45, 58, 55, 46, 62, 53, 35, 37, 41, 40, 34, 53, 25, 32, 41, 52, 25, 52, 35, 49, 39, 52, 34, 119, 108, 107, 115, 91, 97, 106, 96, 91, 103, 101, 118, 96, 118, 109, 106, 114, 90, 96, 125, 108, 113, 90, 113, 119, 100, 107, 118, 108, 113, 108, 106, 107, 97, 122, 125, 101, 77, 123, 124, 102, 96, 125, 77, 102, 96, 115, 124, 97, 123, 102, 123, 125, 124, 56, 32, 34, 59, 20, 42, 37, 47, 20, 39, 36, 56, 46, 20, 57, 46, 60, 42, 57, 47, 119, 111, 109, 116, 116, 101, 102, 104, 97, 91, 119, 97, 103, 107, 106, 96, 119, 68, 88, 84, 94, 86, 91, 104, 84, 88, 89, 67, 82, 79, 67, 37, 35, 52, 34, 63, 34, 58, 51, 67, 94, 67, 91, 82, 39, 60, 33, 57, 59, 34, 34, 51, 48, 62, 55, 13, 33, 55, 49, 61, 60, 54, 33, 119, 112, 110, 36, 59, 54, 55, 61, 13, 51, 39, 38, 61, 34, 62, 51, 43, 13, 55, 60, 51, 48, 62, 55, 54, 100, 123, 118, 119, 125, 77, 118, 103, 96, 115, 102, 123, 125, 124, 77, 97, 119, 113, 89, 70, 75, 74, SignedBytes.MAX_POWER_OF_TWO, 112, 95, 93, 74, 67, SignedBytes.MAX_POWER_OF_TWO, 78, 75, 112, 92, 70, 85, 74, 112, 77, 86, 91, 74, 92, 120, 103, 106, 107, 97, 81, 123, 124, 98, 71, 89, 84, 68, 88};
    }

    public static C109401F A00(JSONObject jSONObject) {
        int optInt;
        C109401F c109401f = new C109401F();
        c109401f.A06(new C109461L().A0L(jSONObject.optString(A01(434, 5, 46))).A0K(jSONObject.optString(A01(426, 8, 79))).A0E(jSONObject.optString(A01(61, 4, 67))).A0J(jSONObject.optString(A01(412, 14, 46))).A0I(jSONObject.optString(A01(291, 12, 66))).A0H(jSONObject.optString(A01(279, 12, 57))).A0C(jSONObject.optString(A01(53, 8, 63))).A0G(jSONObject.optString(A01(131, 14, 59))).A0B(jSONObject.optString(A01(37, 16, 99))).A0D(jSONObject.optString(A01(90, 8, 30))).A0F(jSONObject.optString(A01(114, 17, 72))).A0M());
        c109401f.A09(jSONObject.optString(A01(272, 7, 44)));
        c109401f.A07(new C109501P(jSONObject.optString(A01(184, 12, 95)), jSONObject.optString(A01(76, 14, 30)), jSONObject.optJSONObject(A01(65, 11, 46)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(439, 19, 75);
        if (jSONObject.optInt(A01, -1) == -1) {
            optInt = jSONObject.optInt(A01(395, 17, 29), -1);
        } else {
            optInt = jSONObject.optInt(A01, -1);
        }
        C109421H A0I = new C109421H().A0J(jSONObject.optString(A01(IronSourceError.ERROR_AD_FORMAT_CAPPED, 9, 23))).A0H(jSONObject.optLong(A01(501, 24, 54), -1L)).A0D(optInt).A0C(jSONObject.optInt(A01(303, 18, 95), Integer.MAX_VALUE)).A0I(C109621b.A01(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(214, 5, 99));
        if (optJSONObject != null) {
            A0I.A0K(optJSONObject.optString(A01(FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 3, 27))).A0G(optJSONObject.optInt(A01(534, 5, 41))).A0F(optJSONObject.optInt(A01(208, 6, 28)));
        }
        c109401f.A04(A0I);
        c109401f.A0D(jSONObject.optBoolean(A01(354, 21, 11)));
        c109401f.A08(new C109511Q(AbstractC12143LV.A04(jSONObject.optJSONArray(A01(169, 15, 25))), jSONObject.optLong(A01(145, 24, 53), 0L)));
        c109401f.A0A(jSONObject.optBoolean(A01(253, 19, 111)));
        return c109401f;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(98, 16, 119);
        String A012 = A01(0, 37, 55);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(196, 12, 12));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    private void A04(C109421H c109421h) {
        this.A00 = c109421h;
    }

    private final void A05(C109431I c109431i) {
        this.A01 = c109431i;
    }

    private final void A06(C109471M c109471m) {
        this.A02 = c109471m;
    }

    private final void A07(C109501P c109501p) {
        this.A03 = c109501p;
    }

    private final void A08(C109511Q c109511q) {
        this.A04 = c109511q;
    }

    private final void A09(String str) {
        this.A05 = str;
    }

    private final void A0A(boolean z) {
        this.A07 = z;
    }

    private final void A0B(boolean z) {
        this.A08 = z;
    }

    private final void A0C(boolean z) {
        this.A09 = z;
    }

    private final void A0D(boolean z) {
        this.A0A = z;
    }

    public final C109431I A0E() {
        return this.A01;
    }

    public final C109471M A0F() {
        return this.A02;
    }

    public final C109501P A0G() {
        return this.A03;
    }

    public final C109511Q A0H() {
        return this.A04;
    }

    public final String A0I() {
        return this.A05;
    }

    public final void A0J(JSONObject jSONObject) {
        A05(this.A00.A0O());
    }

    public final void A0K(JSONObject jSONObject) {
        this.A00.A0M(jSONObject.optBoolean(A01(461, 22, 75)));
        this.A00.A0L(jSONObject.optBoolean(A01(233, 20, 8), true));
        A05(this.A00.A0O());
        A0N(jSONObject.optBoolean(A01(219, 14, 56)));
        A0B(jSONObject.optBoolean(A01(321, 13, 29)));
        A0C(jSONObject.optBoolean(A01(334, 20, 28)));
    }

    public final void A0L(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(233, 20, 8), true));
        A05(this.A00.A0O());
    }

    public final void A0M(JSONObject jSONObject) {
        this.A00.A0E(jSONObject.optInt(A01(483, 18, 11)));
        this.A00.A0L(jSONObject.optBoolean(A01(233, 20, 8), true));
        this.A00.A0N(jSONObject.optBoolean(A01(375, 20, 82), false));
        A05(this.A00.A0O());
        A0B(jSONObject.optBoolean(A01(321, 13, 29)));
    }

    public final void A0N(boolean z) {
        this.A06 = z;
    }

    public final boolean A0O() {
        return this.A06;
    }

    public final boolean A0P() {
        return this.A07;
    }

    public final boolean A0Q() {
        return this.A08;
    }

    public final boolean A0R() {
        return this.A0A;
    }
}
