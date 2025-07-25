package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1h */
/* loaded from: assets/audience_network.dex */
public final class C109681h {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C112726f A00;
    public EnumC12310OC A01 = EnumC12310OC.A05;
    public ArrayList<C12397Pb> A02 = new ArrayList<>();
    public final AbstractC109391E A03;
    public final InterfaceC109671g A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C109681h(C13029Zs c13029Zs, C109811u c109811u, InterfaceC109671g interfaceC109671g, String str) {
        JSONObject dataObject = c109811u.A03();
        this.A03 = A01(c13029Zs, c109811u, str, dataObject);
        this.A04 = interfaceC109671g;
    }

    private AdError A00(C13029Zs c13029Zs, AbstractC13171cD abstractC13171cD) {
        if (abstractC13171cD == null || abstractC13171cD.A1W().isEmpty()) {
            c13029Zs.A07().AA0(A04(62, 3, 33), AbstractC113568E.A0Z, new C113578F(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static AbstractC109391E A01(C13029Zs c13029Zs, C109811u c109811u, String str, JSONObject jSONObject) {
        AbstractC109391E abstractC109391E = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC109391E = C13169cB.A03(jSONObject, c13029Zs, true);
                abstractC109391E.A0x(true);
                abstractC109391E.A0u(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (abstractC109391E == null) {
            abstractC109391E = C11799Fm.A02(jSONObject, c13029Zs);
        }
        abstractC109391E.A0t(str);
        C113758X A01 = c109811u.A01();
        if (A01 != null) {
            abstractC109391E.A0p(A01.A06());
        }
        return abstractC109391E;
    }

    private C112726f A03(C13029Zs c13029Zs) {
        return this.A00 != null ? this.A00 : new C112726f(c13029Zs);
    }

    private void A08(C13029Zs c13029Zs, C11799Fm c11799Fm) {
        C109621b playableData = c11799Fm.A1P().A0E().A06();
        A0B(playableData != null ? playableData.A0B() : EnumC12310OC.A05);
        C13160c2 c13160c2 = new C13160c2(this);
        C112726f c112726f = new C112726f(c13029Zs);
        boolean z = C11979Im.A26(c13029Zs) && C1123765.A0A(c11799Fm.A0o());
        if (z) {
            C1123765 unifiedAssetsLoader = new C1123765(c112726f, c11799Fm.A0o(), c11799Fm.A0c(), c11799Fm.A0l(), z, new C13159c1(this));
            c112726f.A0d(new C12008JF(c11799Fm.A1U(), c13029Zs.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC109781r.A02(c13029Zs, c11799Fm, true, c13160c2);
    }

    private void A09(C13029Zs c13029Zs, EnumSet<CacheFlag> enumSet, AbstractC13171cD abstractC13171cD, int i, InterfaceC109671g interfaceC109671g) {
        boolean A19 = abstractC13171cD.A19();
        C112726f A03 = A03(c13029Zs);
        A03.A0d(new C12008JF(abstractC13171cD.A1U(), c13029Zs.A09()));
        boolean z = C11979Im.A26(c13029Zs) && C1123765.A0A(abstractC13171cD.A0o());
        if (z) {
            new C1123765(A03, abstractC13171cD.A0o(), abstractC13171cD.A0c(), abstractC13171cD.A0l(), z, new C13163c5(this, c13029Zs, A19, abstractC13171cD, interfaceC109671g)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (A19) {
            C112686b c112686b = new C112686b(abstractC13171cD.A0Z(), abstractC13171cD.A0l(), A04);
            c112686b.A04 = true;
            c112686b.A03 = A04(0, 5, 78);
            A03.A0X(c112686b);
        }
        A03.A0c(new C112706d(abstractC13171cD.A1S().A01(), C12441QJ.A04, C12441QJ.A04, abstractC13171cD.A0l(), A04(96, 12, 117)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A2n = C11979Im.A2n(c13029Zs, C12512RS.A03());
        for (C109401F adInfo : abstractC13171cD.A1W()) {
            C112706d c112706d = new C112706d(adInfo.A0E().A07(), AbstractC109741n.A00(adInfo.A0E()), AbstractC109741n.A01(adInfo.A0E()), abstractC13171cD.A0l(), A04(96, 12, 117));
            if (i2 == 0) {
                A03.A0b(c112706d);
            } else {
                A03.A0c(c112706d);
            }
            for (String str : adInfo.A0H().A01()) {
                A03.A0c(new C112706d(str, -1, -1, abstractC13171cD.A0l(), A04(96, 12, 117)));
            }
            if (contains && !TextUtils.isEmpty(adInfo.A0E().A08())) {
                C112686b c112686b2 = new C112686b(adInfo.A0E().A08(), abstractC13171cD.A0l(), A04(96, 12, 117), adInfo.A0E().A05());
                c112686b2.A04 = false;
                if (i2 == 0) {
                    if (A19 && !A2n) {
                        A03.A0X(c112686b2);
                    } else {
                        A03.A0a(c112686b2);
                    }
                } else if (A19 && !A2n) {
                    A03.A0Y(c112686b2);
                } else {
                    A03.A0Z(c112686b2);
                }
            }
            i2++;
        }
        A03.A0W(new C13161c3(this, c13029Zs, A19, abstractC13171cD, interfaceC109671g), new C112656Y(abstractC13171cD.A0l(), A04, i));
    }

    public void A0A(C13029Zs c13029Zs, EnumSet<CacheFlag> enumSet, C13169cB c13169cB, AbstractC13171cD abstractC13171cD, int i, InterfaceC109671g interfaceC109671g) {
        A09(c13029Zs, enumSet, abstractC13171cD, i, new C13165c7(this, c13029Zs, abstractC13171cD, c13169cB, i, interfaceC109671g, enumSet));
    }

    private void A0B(EnumC12310OC enumC12310OC) {
        this.A01 = enumC12310OC;
    }

    private boolean A0C(C13029Zs c13029Zs, AbstractC13171cD abstractC13171cD) {
        AdError A00 = A00(c13029Zs, abstractC13171cD);
        if (A00 != null) {
            this.A04.AB4(A00);
            return true;
        }
        return false;
    }

    public final AbstractC109391E A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006c, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0070, code lost:
        return com.facebook.ads.redexgen.p370X.EnumC12069KG.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0071, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0076, code lost:
        return com.facebook.ads.redexgen.p370X.EnumC12069KG.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p370X.EnumC12069KG A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.1E r0 = r5.A03
            boolean r0 = r0.A15()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1E r4 = r5.A03
            com.facebook.ads.redexgen.X.cD r4 = (com.facebook.ads.redexgen.p370X.AbstractC13171cD) r4
            boolean r0 = r4.A19()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A06
            return r0
        L18:
            java.util.List r0 = r4.A1W()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.1F r0 = r4.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            com.facebook.ads.redexgen.X.1b r3 = r0.A06()
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C109681h.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C109681h.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C109681h.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C109681h.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.p370X.EnumC12069KG.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C109681h.A0E():com.facebook.ads.redexgen.X.KG");
    }

    public final EnumC12310OC A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A15()) {
            return ((C13169cB) this.A03).A1Q();
        }
        return ((AbstractC13171cD) this.A03).A1U();
    }

    public final void A0H() {
        this.A04.AHE();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0r(rewardData);
        this.A03.A0v(str);
        if (A0D().A15()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C13029Zs c13029Zs, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC12069KG.A04) {
            C13169cB c13169cB = (C13169cB) this.A03;
            AbstractC13171cD A1M = c13169cB.A1M();
            if (A0C(c13029Zs, A1M) || A1M == null) {
                return;
            }
            this.A04.AEv();
            A0A(c13029Zs, enumSet, c13169cB, A1M, 0, this.A04);
            return;
        }
        AbstractC13171cD abstractC13171cD = (AbstractC13171cD) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c13029Zs, abstractC13171cD)) {
            return;
        }
        this.A04.AEv();
        if (A0E() == EnumC12069KG.A0C) {
            C11799Fm c11799Fm = (C11799Fm) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c13029Zs, c11799Fm);
                return;
            }
            A08(c13029Zs, c11799Fm);
            return;
        }
        A09(c13029Zs, enumSet, (C11799Fm) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A11();
    }

    public final boolean A0L(AbstractC13171cD abstractC13171cD) {
        return !TextUtils.isEmpty(abstractC13171cD.A1P().A0E().A08());
    }
}
