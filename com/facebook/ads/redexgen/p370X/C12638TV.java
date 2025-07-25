package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.TV */
/* loaded from: assets/audience_network.dex */
public class C12638TV extends AbstractC111634t {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC12374PE A02;
    public C12530Rk A04;
    public List<C12442QK> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C13091at A0C;
    public final AbstractC1117151 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC12378PI A0F = new C12641TY(this);
    public InterfaceC12376PG A03 = new C12640TX(this);
    public final InterfaceC12377PH A0E = new C12639TW(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public C12638TV(C111003r c111003r, int i, List<C12442QK> list, C12530Rk c12530Rk, Bundle bundle) {
        this.A0C = c111003r.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c12530Rk;
        this.A0D = new C13090as(c111003r.getContext());
        this.A0B = c111003r.getContext();
        c111003r.A1f(this);
        A0D(bundle);
    }

    private AbstractC12693UO A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private AbstractC12693UO A04(int i, int i2, boolean z) {
        AbstractC12693UO abstractC12693UO = null;
        while (i <= i2) {
            AbstractC12693UO abstractC12693UO2 = (AbstractC12693UO) this.A0C.A1m(i);
            if (abstractC12693UO2 == null || abstractC12693UO2.A17()) {
                return null;
            }
            boolean A0a = A0a(abstractC12693UO2);
            if (abstractC12693UO == null && abstractC12693UO2.A18() && A0a && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(abstractC12693UO2, this.A0A))) {
                abstractC12693UO = abstractC12693UO2;
            }
            if (abstractC12693UO2.A18() && !A0a) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC12693UO;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        AbstractC12693UO A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A15();
        }
    }

    public void A07() {
        int A23 = this.A0C.A23();
        if (A23 != -1) {
            int curPos = this.A05.size();
            if (A23 < curPos - 1) {
                int curPos2 = A23 + 1;
                A0U(curPos2);
            }
        }
    }

    public void A09(int i) {
        AbstractC12693UO A04 = A04(i + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A15();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC12342Oi abstractC12342Oi, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = AbstractC12137LP.A03.widthPixels - 1;
        } else {
            int width = abstractC12342Oi.getWidth();
            int allowedAreaMinX = AbstractC12137LP.A03.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i2 = AbstractC12137LP.A03.widthPixels;
            int allowedAreaMinX2 = abstractC12342Oi.getWidth();
            furthestX = (int) (((i2 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC12342Oi.getX();
        int allowedAreaMinX3 = abstractC12342Oi.getWidth();
        if (((int) (x + allowedAreaMinX3)) <= allowedAreaMaxX) {
            int allowedAreaMinX4 = (abstractC12342Oi.getX() > furthestX ? 1 : (abstractC12342Oi.getX() == furthestX ? 0 : -1));
            if (allowedAreaMinX4 >= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0J(AbstractC12693UO abstractC12693UO) {
        if (this.A08 && abstractC12693UO.A18()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111634t
    public void A0L(C11774FL c11774fl, int i) {
        super.A0L(c11774fl, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111634t
    public void A0M(C11774FL c11774fl, int i, int i2) {
        super.A0M(c11774fl, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC12376PG A0N() {
        return this.A03;
    }

    public final InterfaceC12377PH A0O() {
        return this.A0E;
    }

    public final InterfaceC12378PI A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A25 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= A25 && A24 >= 0; A24++) {
            AbstractC12693UO card = (AbstractC12693UO) this.A0C.A1m(A24);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A17()) {
                this.A01 = A24;
                card.A14();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC12693UO abstractC12693UO = (AbstractC12693UO) this.A0C.A1m(this.A01);
        if (abstractC12693UO != null && this.A01 >= 0) {
            abstractC12693UO.A15();
        }
    }

    public final void A0S(int i) {
        AbstractC12693UO abstractC12693UO = (AbstractC12693UO) this.A0C.A1m(i);
        if (abstractC12693UO != null && !A0a(abstractC12693UO)) {
            A0Z(abstractC12693UO, false);
        }
    }

    public final void A0T(int i) {
        AbstractC12693UO abstractC12693UO = (AbstractC12693UO) this.A0C.A1m(i);
        if (abstractC12693UO == null) {
            return;
        }
        if (A0a(abstractC12693UO)) {
            A0Z(abstractC12693UO, true);
        }
        if (!A0J(abstractC12693UO) || this.A05 == null) {
            return;
        }
        this.A0F.setVolume(this.A05.get(((Integer) abstractC12693UO.getTag(-1593835536)).intValue()).A03().A0E().A09() ? 0.0f : 1.0f);
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AHH(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC12374PE interfaceC12374PE) {
        this.A02 = interfaceC12374PE;
    }

    public void A0Z(AbstractC12693UO abstractC12693UO, boolean z) {
        if (A0H()) {
            A0X(abstractC12693UO, z);
        }
        if (!z && abstractC12693UO.A17()) {
            abstractC12693UO.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
