package com.facebook.ads.redexgen.p370X;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Nw */
/* loaded from: assets/audience_network.dex */
public final class C12294Nw extends RelativeLayout {
    public static InterfaceC12201MR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC13076ad A00;
    public C13029Zs A01;
    public C1105638 A02;
    public C12727Uw A03;
    public C12327OT A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (AbstractC12137LP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC12137LP.A02 * 15.0f);
        A05 = new C12726Uv();
    }

    public C12294Nw(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A01 = c13029Zs;
        this.A02 = new C1105638(c13029Zs);
        AbstractC12177M3.A0K(this.A02);
        this.A00 = new C11775FM();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C12442QK> A01(AbstractC13171cD abstractC13171cD) {
        if (abstractC13171cD == null) {
            return new ArrayList<>();
        }
        List<C109401F> A1W = abstractC13171cD.A1W();
        ArrayList<C12442QK> arrayList = new ArrayList<>(A1W.size());
        for (int i = 0; i < A1W.size(); i++) {
            arrayList.add(new C12442QK(i, A1W.size(), A1W.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C12799W7 c12799w7, int i) {
        ArrayList<C12442QK> A01 = A01(c12799w7.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C12727Uw(this.A01, A01, c12799w7.A0z(), this.A01.A01().A09(), c12799w7, A05, c12799w7.A0z().A1U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = AbstractC12137LP.A03.widthPixels;
        }
        this.A03.A0F(i - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(c12799w7, A01);
    }

    public final void A06(C12530Rk c12530Rk) {
        if (this.A03 != null) {
            this.A03.A0G(c12530Rk);
        } else {
            this.A01.A07().AA0(A00(51, 7, 24), AbstractC113568E.A1v, new C113578F(A00(0, 51, 125)));
        }
        this.A02.A1y(c12530Rk);
    }

    public static InterfaceC12201MR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0F((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C12799W7 c12799w7, ArrayList<C12442QK> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C12725Uu(this));
        this.A04 = new C12327OT(this.A01, c12799w7.A0z().A1O().A01(), arrayList.size());
        AbstractC12177M3.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
