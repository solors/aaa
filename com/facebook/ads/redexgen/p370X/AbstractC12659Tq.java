package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tq */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12659Tq extends FrameLayout implements InterfaceC12202MS {
    public static String[] A0D = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC13171cD A01;
    public final C112726f A02;
    public final C13029Zs A03;
    public final InterfaceC12000J7 A04;
    public final C12008JF A05;
    public final C12169Lv A06;
    public final AbstractC12200MQ A07;
    public final InterfaceC12201MR A08;
    public final InterfaceC12245N9 A09;
    public final C12530Rk A0A;
    public final View$OnSystemUiVisibilityChangeListenerC12164Lq A0B;
    public final AbstractC12529Rj A0C;

    public abstract void A0W();

    public abstract void A0Y(C111965Q c111965q);

    public abstract boolean A0Z();

    public AbstractC12659Tq(C13029Zs c13029Zs, InterfaceC12245N9 interfaceC12245N9, InterfaceC12000J7 interfaceC12000J7, AbstractC13171cD abstractC13171cD, C112726f c112726f, InterfaceC12201MR interfaceC12201MR) {
        super(c13029Zs);
        this.A0C = new C12663Tu(this);
        this.A06 = new C12169Lv();
        this.A00 = false;
        this.A03 = c13029Zs;
        this.A09 = interfaceC12245N9;
        this.A04 = interfaceC12000J7;
        this.A01 = abstractC13171cD;
        this.A02 = c112726f;
        this.A08 = interfaceC12201MR;
        this.A05 = new C12008JF(this.A01.A1U(), this.A04);
        this.A0A = new C12530Rk(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0O());
        this.A0A.A0X(this.A01.A0P());
        this.A07 = A0T();
        this.A0B = new View$OnSystemUiVisibilityChangeListenerC12164Lq(this);
        this.A0B.A05(EnumC12163Lp.A02);
    }

    private FullScreenAdToolbar A0T() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A1J(), this.A01.A1D());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A1P().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A1S(), this.A01.A1U(), A03, this.A01.A1T());
        fullScreenAdToolbar.A09(this.A01.A1O().A01(), View$OnClickListenerC12713Ui.A08(this.A01));
        if (A03 < 0) {
            boolean A0O = this.A01.A1P().A0O();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 14) {
                throw new RuntimeException();
            }
            A0D[6] = "uU4tl2aYQOakqMcDwa3XaYHVuDk2NjaN";
            if (A0O) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C12660Tr(this));
        return fullScreenAdToolbar;
    }

    private void A0U() {
        if (this.A01.A1P().A0R()) {
            C12429Q7 A0F = new C12427Q5(this.A03, this.A01.A1P().A0F(), this.A01.A1S()).A0A(this.A01.A1O().A01()).A0F();
            AbstractC12010JH.A04(A0F, this.A05, EnumC12007JE.A0U);
            addView(A0F, A0E);
            A0F.A04(new C12661Ts(this));
            return;
        }
        A0W();
    }

    public final void A0V() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0X(int i, AbstractRunnableC12086KY abstractRunnableC12086KY) {
        new C12129LH(i, new C12662Tt(this, i, abstractRunnableC12086KY)).A07();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void A9q(Intent intent, Bundle bundle, C111965Q c111965q) {
        this.A08.A3q(this, A0E);
        A0Y(c111965q);
        A0U();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public String getCurrentClientToken() {
        return this.A01.A1U();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A1U())) {
            this.A04.A9x(this.A01.A1U(), new C12306O8().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC12201MR interfaceC12201MR) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC12163Lp enumC12163Lp;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            enumC12163Lp = EnumC12163Lp.A03;
        } else {
            enumC12163Lp = EnumC12163Lp.A02;
        }
        this.A0B.A05(enumC12163Lp);
    }
}
