package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bl */
/* loaded from: assets/audience_network.dex */
public final class C11571Bl extends C12638TV {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C11571Bl(C111003r c111003r, int i, List<C12442QK> list, C12530Rk c12530Rk, Bundle bundle) {
        super(c111003r, i, list, c12530Rk, bundle);
        c111003r.A1f(this);
        this.A03 = new C12728Ux(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A23 = this.A0C.A23();
        if (this.A05 == null || A23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A23 < curPos - 1) {
            int i = A23 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.p370X.C12638TV, com.facebook.ads.redexgen.p370X.AbstractC111634t
    public final void A0L(C11774FL c11774fl, int i) {
    }

    @Override // com.facebook.ads.redexgen.p370X.C12638TV, com.facebook.ads.redexgen.p370X.AbstractC111634t
    public final void A0M(C11774FL c11774fl, int i, int i2) {
        if (this.A0C.A23() != -1) {
            AbstractC12693UO curCard = (AbstractC12693UO) this.A0C.A1m(this.A0C.A23());
            if (curCard != null && curCard.A18() && !curCard.A17()) {
                curCard.A15();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.C12638TV
    public final void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.p370X.C12638TV
    public final void A0Z(AbstractC12693UO abstractC12693UO, boolean z) {
        A0X(abstractC12693UO, z);
        if (!z && abstractC12693UO.A17()) {
            abstractC12693UO.A14();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.C12638TV
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C12530Rk A0b() {
        return this.A04;
    }

    public final void A0c(C12530Rk c12530Rk) {
        this.A04 = c12530Rk;
    }

    public final void A0d(List<C12442QK> list) {
        this.A05 = list;
    }
}
