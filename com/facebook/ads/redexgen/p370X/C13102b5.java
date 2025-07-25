package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.b5 */
/* loaded from: assets/audience_network.dex */
public class C13102b5 implements InterfaceC110613D {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ C110903h A01;

    public C13102b5(C110903h c110903h) {
        this.A01 = c110903h;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110613D
    public final C110933k ABA(View view, C110933k c110933k) {
        C110933k A06 = AbstractC110773T.A06(view, c110933k);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int count = this.A01.getChildCount();
        for (int i = 0; i < count; i++) {
            C110933k A05 = AbstractC110773T.A05(this.A01.getChildAt(i), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C110933k applied = A06.A06(i2, i3, i4, i5);
        return applied;
    }
}
