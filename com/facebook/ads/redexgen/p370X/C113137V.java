package com.facebook.ads.redexgen.p370X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.7V */
/* loaded from: assets/audience_network.dex */
public final class C113137V extends AbstractC12594Sm {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C13029Zs A01;
    public final AbstractC114008x<C114309R> A02;
    public final AbstractC114008x<C12581SZ> A03;

    public C113137V(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A03 = new C12288Nq(this);
        this.A02 = new C12253NH(this);
        this.A01 = c13029Zs;
        this.A00 = new ImageView(c13029Zs);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AbstractC12177M3.A0M(this.A00, ViewCompat.MEASURED_STATE_MASK);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12594Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C113998w<AbstractC114008x, C113988v> eventBus = getVideoView().getEventBus();
            AbstractC114008x[] abstractC114008xArr = new AbstractC114008x[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC114008xArr[0] = this.A03;
            abstractC114008xArr[1] = this.A02;
            eventBus.A03(abstractC114008xArr);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12594Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC12305O7 interfaceC12305O7) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC12718Un downloadImageTask = new AsyncTaskC12718Un(this.A00, this.A01).A04();
        if (interfaceC12305O7 != null) {
            downloadImageTask.A06(interfaceC12305O7);
        }
        downloadImageTask.A07(str);
    }
}
