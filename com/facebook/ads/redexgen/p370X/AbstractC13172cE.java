package com.facebook.ads.redexgen.p370X;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cE */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13172cE extends AbstractC111464c<C12762VW> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (AbstractC12137LP.A02 * 4.0f);
    public InterfaceC109351A A00;
    public final List<C12799W7> A01;
    public final int A02;
    public final C13029Zs A03;
    public final AbstractC12529Rj A04 = new C13174cG(this);

    public AbstractC13172cE(C110603C c110603c, List<C12799W7> list, C13029Zs c13029Zs) {
        this.A03 = c13029Zs;
        this.A02 = c110603c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) != strArr[4].charAt(2)) {
            String[] strArr2 = A05;
            strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
            strArr2[1] = "gQBYn2ao1l5plthpQQ";
            marginLayoutParams.setMargins(i2, 0, i >= size ? this.A02 * 2 : this.A02, 0);
            return marginLayoutParams;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111464c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        C12799W7 c12799w7 = this.A01.get(i);
        C12023JU adCoverImage = c12799w7.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC12718Un A04 = new AsyncTaskC12718Un(imageView, this.A03).A04();
            A04.A06(new C13173cF(this, i, c12799w7));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(InterfaceC109351A interfaceC109351A) {
        this.A00 = interfaceC109351A;
    }

    public void A0H(C12762VW c12762vw, int i) {
        c12762vw.A0j().setLayoutParams(A02(i));
    }
}
