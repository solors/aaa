package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9Z */
/* loaded from: assets/audience_network.dex */
public final class C114389Z extends AbstractC12756VP {
    public static byte[] A0F;
    public static String[] A0G = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC13171cD A03;
    public C112726f A04;
    public C111003r A05;
    public C12327OT A06;
    public C12638TV A07;
    public AbstractC12529Rj A08;
    public C12530Rk A09;
    public String A0A;
    public List<C12442QK> A0B;
    public boolean A0C;
    public final C13029Zs A0D;
    public final C12169Lv A0E;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, 15, 33, 4, 36, 1, 20, 1, 34, 21, 14, 4, 12, 5};
    }

    static {
        A0C();
        A0H = (int) (AbstractC12137LP.A02 * 48.0f);
        A0I = (int) (AbstractC12137LP.A02 * 8.0f);
        A0J = (int) (AbstractC12137LP.A02 * 8.0f);
        A0L = (int) (AbstractC12137LP.A02 * 56.0f);
        A0K = (int) (AbstractC12137LP.A02 * 12.0f);
    }

    public C114389Z(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, InterfaceC12201MR interfaceC12201MR, C11797Fk c11797Fk) {
        super(c13029Zs, interfaceC12000J7, interfaceC12201MR, c11797Fk);
        this.A0E = new C12169Lv();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new C12460Qc(c13029Zs, new C12736V5(), super.A0A.A0m(), interfaceC12201MR);
        this.A04 = c112726f;
        this.A0D = c13029Zs;
    }

    public C114389Z(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, C112726f c112726f, InterfaceC12201MR interfaceC12201MR, C11799Fm c11799Fm) {
        super(c13029Zs, interfaceC12000J7, interfaceC12201MR, c11799Fm);
        this.A0E = new C12169Lv();
        this.A0C = false;
        this.A04 = c112726f;
        this.A0D = c13029Zs;
    }

    private AbstractC13171cD A00(Intent intent) {
        if (super.A07) {
            return (AbstractC13171cD) intent.getSerializableExtra(A0A(14, 25, 103));
        }
        return (AbstractC13171cD) intent.getSerializableExtra(A0A(0, 14, 36));
    }

    private final void A0D() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0G[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0G[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1Q();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0E(int i, Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = AbstractC12137LP.A03.widthPixels;
        int i4 = AbstractC12137LP.A03.heightPixels;
        if (i == 1) {
            extraSpacing = Math.min(i3 - (A0I * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - ((A0L + A0H) + (A0I * 4));
            i2 = A0I;
            height = i2 * 2;
        }
        this.A08 = new C12632TP(this);
        this.A09 = new C12530Rk(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C111003r(this.A0D);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C12638TV(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C12633TQ(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, super.A0E));
        this.A05.A1f(this.A05.getOnScrollListener());
        if (i == 1) {
            A0G(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C11979Im.A1p(this.A0D)) {
            this.A0D.A0A().AHO(this.A05, super.A0A.A1U(), false);
        }
        A0V(this.A02, false, i);
    }

    private void A0F(AbstractC13171cD abstractC13171cD) {
        this.A03 = abstractC13171cD;
        this.A0A = this.A03.A1U();
        this.A00 = this.A03.A0O();
        this.A01 = this.A03.A0P();
        List<C109401F> A1W = this.A03.A1W();
        List<AdInfo> adInfoList = new ArrayList<>(A1W.size());
        this.A0B = adInfoList;
        for (int i = 0; i < A1W.size(); i++) {
            List<C12442QK> list = this.A0B;
            int i2 = A1W.size();
            list.add(new C12442QK(i, i2, A1W.get(i)));
        }
    }

    private void A0G(C12638TV c12638tv) {
        new C11775FM().A0G(this.A05);
        c12638tv.A0Y(new C12631TO(this));
        this.A06 = new C12327OT(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12756VP
    public final boolean A0b() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void A9q(Intent intent, Bundle bundle, C111965Q c111965q) {
        AbstractC13171cD dataBundle = A00(intent);
        A0W(c111965q);
        A0F(dataBundle);
        A0E(c111965q.A05().getResources().getConfiguration().orientation, bundle);
        c111965q.A0A(new C12630TN(this, c111965q));
        AbstractC13171cD dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A1P().A0E().A03();
        if (super.A07) {
            AbstractC13171cD dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A1P().A0E().A02();
        }
        if (unskippableSec > 0) {
            A0U(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12756VP, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ACz(boolean z) {
        super.ACz(z);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12756VP, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void ADN(boolean z) {
        super.ADN(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void AFx(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12756VP
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AFx(bundle);
        A0D();
        A0E(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12756VP, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void onDestroy() {
        super.onDestroy();
        if (C11979Im.A1p(this.A0D)) {
            this.A0D.A0A().AHC(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9x(this.A0A, new C12306O8().A03(this.A09).A02(this.A0E).A05());
        }
        A0D();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
