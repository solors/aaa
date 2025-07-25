package com.facebook.ads.redexgen.p370X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.p370X.AbstractC1117656;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4c */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111464c<VH extends AbstractC1117656> {
    public static byte[] A02;
    public static String[] A03 = {"jUIKGw1ynNKnpAPmELSBfekQdKvvLP7N", "sNNGTv9KS6vRRQA34Mdww0wVckPktM11", "3xVPsODXVzGzX7adQrLtZXDPvj0RZqnv", "LC797JiAE7pTB", "T5D6LMII5PxeSeaFwmiiVgotr7WAYFJE", "TBv1Ih1UUm000Zp3KSd8PMLF2uMFBpSk", "SYlNiiXgaMsNCcAbu", "5Eyk2D6YZF50L"};
    public final C111474d A01 = new C111474d();
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-73, -69, -123, -88, -41, -54, -58, -39, -54, -69, -50, -54, -36, -122, -118, 84, -125, -94, 118, -99, -94, -104, -118, -99, -103, -85};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i);

    public abstract void A0D(VH vh, int i);

    public abstract int A0E();

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    private final void A02(VH holder, int i, List<Object> payloads) {
        A0D(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final int A03(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final long A04(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final VH A05(ViewGroup viewGroup, int i) {
        AbstractC110392q.A01(A00(0, 13, 100));
        VH holder = A0C(viewGroup, i);
        holder.A00 = i;
        AbstractC110392q.A00();
        return holder;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A07(AbstractC111484e abstractC111484e) {
        this.A01.registerObserver(abstractC111484e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A08(AbstractC111484e abstractC111484e) {
        this.A01.unregisterObserver(abstractC111484e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A09(VH vh, int i) {
        vh.A03 = i;
        if (A0A()) {
            long A04 = A04(i);
            String[] strArr = A03;
            if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A03[0] = "nL6OAJIdW8sl7jDyOoO0QwKhwUxIf89k";
            vh.A05 = A04;
        }
        vh.A0U(1, 519);
        AbstractC110392q.A01(A00(13, 13, 51));
        A02(vh, i, vh.A0L());
        vh.A0N();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof C111594p) {
            ((C111594p) layoutParams).A01 = true;
        }
        AbstractC110392q.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0B(VH holder) {
        return false;
    }
}
