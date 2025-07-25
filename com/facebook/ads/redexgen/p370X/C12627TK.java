package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.TK */
/* loaded from: assets/audience_network.dex */
public final class C12627TK extends AbstractC1117656 implements InterfaceC12208MY {
    public C109541T A00;
    public AbstractC12529Rj A01;
    public C12530Rk A02;
    public C12530Rk A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C13029Zs A09;
    public final AbstractC11551BP A0A;

    public C12627TK(AbstractC11551BP abstractC11551BP, SparseBooleanArray sparseBooleanArray, C12530Rk c12530Rk, int i, int i2, int i3, int i4, C13029Zs c13029Zs, C109541T c109541t) {
        super(abstractC11551BP);
        this.A09 = c13029Zs;
        this.A0A = abstractC11551BP;
        this.A08 = sparseBooleanArray;
        this.A02 = c12530Rk;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c109541t;
    }

    private void A0A(InterfaceC12000J7 interfaceC12000J7, C12169Lv c12169Lv, String str, C12442QK c12442qk) {
        if (this.A08.get(c12442qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C12629TM(this, str, c12442qk, interfaceC12000J7, c12442qk.A04(), c12169Lv);
        this.A03 = new C12530Rk(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C12628TL(this, c12442qk));
    }

    public final void A0j(C12442QK c12442qk, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, C12169Lv c12169Lv, String str) {
        int A02 = c12442qk.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c12442qk.A03().A0E().A07();
        String A08 = c12442qk.A03().A0E().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c112726f.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c12442qk.A03().A0F().A08(), c12442qk.A03().A0F().A02());
        this.A0A.setCTAInfo(c12442qk.A03().A0G(), c12442qk.A04());
        this.A0A.A1B(c12442qk.A04());
        A0A(interfaceC12000J7, c12169Lv, str, c12442qk);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12208MY
    public final void AGH() {
        this.A0A.A13();
    }
}
