package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* renamed from: com.facebook.ads.redexgen.X.OS */
/* loaded from: assets/audience_network.dex */
public final class C12326OS extends FrameLayout {
    public static String[] A07 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC12200MQ A00;
    public final AbstractC13171cD A01;
    public final C13029Zs A02;
    public final InterfaceC12201MR A03;
    public final InterfaceC12325OR A04;
    public final C12614T7 A05;
    public final View[] A06;

    public C12326OS(C12346Om c12346Om, AbstractC13171cD abstractC13171cD, C12614T7 c12614t7, InterfaceC12201MR interfaceC12201MR, InterfaceC12325OR interfaceC12325OR, View... viewArr) {
        this(c12346Om.A05(), c12346Om.A09(), abstractC13171cD, c12614t7, interfaceC12201MR, interfaceC12325OR, viewArr);
    }

    public C12326OS(C12346Om c12346Om, AbstractC13171cD abstractC13171cD, C12614T7 c12614t7, C12241N5 c12241n5, AbstractC12312OE abstractC12312OE, InterfaceC12201MR interfaceC12201MR, InterfaceC12325OR interfaceC12325OR) {
        this(c12346Om, abstractC13171cD, c12614t7, interfaceC12201MR, interfaceC12325OR, c12241n5, abstractC12312OE);
    }

    public C12326OS(C13029Zs c13029Zs, AbstractC12200MQ abstractC12200MQ, AbstractC13171cD abstractC13171cD, C12614T7 c12614t7, InterfaceC12201MR interfaceC12201MR, InterfaceC12325OR interfaceC12325OR, View... viewArr) {
        super(c13029Zs);
        this.A02 = c13029Zs;
        this.A00 = abstractC12200MQ;
        this.A01 = abstractC13171cD;
        this.A06 = viewArr;
        this.A03 = interfaceC12201MR;
        this.A05 = c12614t7;
        this.A04 = interfaceC12325OR;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0W = this.A01.A0W();
        if (A0W == null) {
            title = this.A01.A1R().A05();
        } else {
            title = this.A01.A1R().A06(A0W.getCurrency(), A0W.getQuantity());
        }
        C12223Mn c12223Mn = new C12223Mn(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A1R().A04(), this.A01.A1R().A03(), AbstractC12186MC.A01(EnumC12185MB.REWARD_ICON));
        c12223Mn.A02.setOnClickListener(new View$OnClickListenerC12323OP(this));
        c12223Mn.A01.setOnClickListener(new View$OnClickListenerC12324OQ(this));
        addView(c12223Mn, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A05 != null) {
            this.A05.A0a(EnumC12471Qn.A07);
        }
        this.A04.AB7();
        if (!this.A01.A1P().A0Q()) {
            this.A01.A1X(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        if (this.A05 != null && !this.A05.A0k()) {
            this.A05.A0f(false, false, 11);
            String[] strArr = A07;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[4] = "1Ran1dt8ESvXQPCOL";
            strArr2[1] = BidResponsed.KEY_WN;
            AbstractC12177M3.A0N(this.A05, 4);
        }
        if (this.A00 != null) {
            AbstractC12177M3.A0H(this.A00);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC12177M3.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACd();
    }
}
