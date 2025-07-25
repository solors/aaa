package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.cZ */
/* loaded from: assets/audience_network.dex */
public final class C13193cZ implements InterfaceC109140p, InterfaceC109671g {
    public static byte[] A0B;
    public static String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", "z"};
    public long A00;
    public RewardData A01;
    public InterfaceC1092510 A02;
    public C1092611 A03;
    public C109681h A04;
    public C13029Zs A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, 12, -72, 11, 12, -7, 10, 12, -72, -39, 13, -4, 1, -3, 6, -5, -3, -26, -3, 12, 15, 7, 10, 3, -39, -5, 12, 1, 14, 1, 12, 17, -58, -72, -27, -7, 3, -3, -72, 11, 13, 10, -3, -72, 12, 0, -7, 12, -72, 1, 12, -65, 11, -72, 1, 6, -72, 17, 7, 13, 10, -72, -39, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, 11, 12, -58, 16, 5, 4, -72, -2, 1, 4, -3, -58, -16, -20, -21, 31, 14, 19, 15, 24, 13, 15, -8, 15, 30, 33, 25, 28, 21, -55, -48, -35, -50, -48, -46, -29, -40, -27, -40, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -55, -53, -66, -67, -66, -65, -62, -57, -66, -67, -88, -53, -62, -66, -57, -51, -70, -51, -62, -56, -57, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, -50, -23, 34, 21, 17, 35, 0, 37, 28, 17, 12, -2, 3, -7, 4, 12};
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        EnumC12310OC A02 = A02();
        if (A02 == EnumC12310OC.A05) {
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (A02 == EnumC12310OC.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    String[] strArr4 = A0C;
                    String str3 = strArr4[4];
                    String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 != str4.length()) {
                        String[] strArr5 = A0C;
                        strArr5[0] = "VdY7";
                        strArr5[2] = "KFhl";
                        return 1;
                    }
                    throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }

    private final EnumC12069KG A01() {
        return this.A04.A0E();
    }

    private EnumC12310OC A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        this.A04.A0I(intent, this.A01, C12460Qc.A03(this.A01, this.A0A, this.A06));
    }

    private final void A07(C13029Zs c13029Zs, InterfaceC1092510 interfaceC1092510, C109811u c109811u, EnumSet<CacheFlag> cacheFlags, String str) {
        C109681h c109681h = new C109681h(c13029Zs, c109811u, this, str);
        AbstractC109391E A0D = c109681h.A0D();
        if (C11979Im.A0s(c13029Zs) && (A0D instanceof AbstractC13171cD) && AbstractC109110l.A06(this.A05, AbstractC109110l.A01(c13029Zs, c109811u.A03(), ((AbstractC13171cD) A0D).A1U()), c13029Zs.A09())) {
            this.A05.A0E().A4g();
            this.A02.ACG(this, AdError.NO_FILL);
            return;
        }
        this.A04 = c109681h;
        A08(c109681h.A0E());
        c109681h.A0J(c13029Zs, cacheFlags);
    }

    private void A08(EnumC12069KG enumC12069KG) {
        if (enumC12069KG.equals(EnumC12069KG.A04)) {
            this.A05.A0E().AGg(EnumC109040e.A05);
        } else if (enumC12069KG.equals(EnumC12069KG.A0A)) {
            this.A05.A0E().AGg(EnumC109040e.A04);
        } else if (enumC12069KG.equals(EnumC12069KG.A0B)) {
            this.A05.A0E().AGg(EnumC109040e.A0B);
        } else if (enumC12069KG.equals(EnumC12069KG.A0D)) {
            this.A05.A0E().AGg(EnumC109040e.A0D);
        } else if (enumC12069KG.equals(EnumC12069KG.A0C)) {
            this.A05.A0E().AGg(EnumC109040e.A0C);
        } else if (!enumC12069KG.equals(EnumC12069KG.A06)) {
        } else {
            if (this.A04.A0K()) {
                this.A05.A0E().AGg(EnumC109040e.A08);
            } else if ((A09() instanceof AbstractC13171cD) && this.A04.A0L((AbstractC13171cD) A09())) {
                InterfaceC108920S A0E = this.A05.A0E();
                if (A0C[1].length() == 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "5zP";
                strArr[3] = "kcwn0HZtMTZNOx";
                A0E.AGg(EnumC109040e.A0A);
            } else {
                this.A05.A0E().AGg(EnumC109040e.A09);
            }
        }
    }

    public final AbstractC109391E A09() {
        return this.A04.A0D();
    }

    public final void A0A(C13029Zs c13029Zs, InterfaceC1092510 interfaceC1092510, C109811u c109811u, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c13029Zs;
        this.A02 = interfaceC1092510;
        this.A08 = c109811u.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = c109811u.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c13029Zs, interfaceC1092510, c109811u, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.ACG(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A04 = C12104Kq.A04(this.A05);
        A04.putExtra(A03(143, 24, 5), A00());
        A04.putExtra(A03(178, 8, 49), this.A0A);
        A04.putExtra(A03(132, 11, 76), this.A08);
        A04.putExtra(A03(167, 11, 51), this.A00);
        EnumC12069KG A01 = A01();
        A08(A01);
        A04.putExtra(A03(186, 8, 88), A01);
        if (this.A07 != null) {
            A04.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(A04);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            A04.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C12104Kq.A0J(this.A05, A04)) {
                    this.A05.A0E().AFT();
                    if (this.A02 != null) {
                        this.A02.ACG(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C12104Kq.A0A(this.A05, A04);
            return true;
        } catch (C12102Ko e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A05.A07().AA0(A03(108, 11, 27), AbstractC113568E.A0D, new C113578F(th));
            Log.e(A03(90, 17, 86), A03(0, 90, 68), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final String A6r() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final AdPlacementType A82() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109671g
    public final void AB4(AdError adError) {
        if (this.A02 != null) {
            this.A02.ACG(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109671g
    public final void AB5() {
        A04();
        this.A02.ACF(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109671g
    public final void AEv() {
        this.A03 = new C1092611(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final boolean AH5() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109671g
    public final void AHE() {
        if (this.A03 != null) {
            C1092611 c1092611 = this.A03;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            c1092611.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
