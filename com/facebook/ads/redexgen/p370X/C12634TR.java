package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.TR */
/* loaded from: assets/audience_network.dex */
public final class C12634TR extends AbstractC1117656 implements InterfaceC12208MY {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C109541T A00;
    public AbstractC12529Rj A01;
    public C12530Rk A02;
    public C12530Rk A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C13029Zs A06;
    public final C11561BZ A07;

    public C12634TR(C11561BZ c11561bz, SparseBooleanArray sparseBooleanArray, C12530Rk c12530Rk, int i, C13029Zs c13029Zs, C109541T c109541t) {
        super(c11561bz);
        this.A06 = c13029Zs;
        this.A07 = c11561bz;
        this.A05 = sparseBooleanArray;
        this.A02 = c12530Rk;
        this.A04 = i;
        this.A00 = c109541t;
    }

    private void A0A(InterfaceC12000J7 interfaceC12000J7, C12169Lv c12169Lv, String str, C12442QK c12442qk) {
        if (this.A05.get(c12442qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C12636TT(this, str, c12442qk, interfaceC12000J7, c12442qk.A04(), c12169Lv);
        this.A03 = new C12530Rk(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C12635TS(this, c12442qk));
    }

    public final void A0j(C12442QK c12442qk, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, C12169Lv c12169Lv, String str, int i, int i2, int i3) {
        int A02 = c12442qk.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c12442qk);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i3 : i2;
        if (A02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String A07 = c12442qk.A03().A0E().A07();
        String A082 = c12442qk.A03().A0E().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A082));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c112726f.A0S(A082));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c12442qk.A03().A0G(), c12442qk.A04());
        this.A07.A19(c12442qk.A04());
        A0A(interfaceC12000J7, c12169Lv, str, c12442qk);
    }

    public final void A0k(C12530Rk c12530Rk) {
        this.A02 = c12530Rk;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12208MY
    public final void AGH() {
        this.A07.A13();
    }
}
