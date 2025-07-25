package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.QJ */
/* loaded from: assets/audience_network.dex */
public final class C12441QJ extends LinearLayout {
    public static final int A04 = (int) (AbstractC12137LP.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC12137LP.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C12328OU A02;
    public final C13029Zs A03;

    public C12441QJ(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A03 = c13029Zs;
        A00(c13029Zs);
    }

    private final void A00(C13029Zs c13029Zs) {
        setGravity(16);
        this.A02 = new C12328OU(c13029Zs);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c13029Zs);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c13029Zs);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC12177M3.A0Y(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c13029Zs);
        AbstractC12177M3.A0Y(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C109601Z c109601z) {
        AsyncTaskC12718Un asyncTaskC12718Un = new AsyncTaskC12718Un(this.A02, this.A03);
        asyncTaskC12718Un.A05(A04, A04);
        asyncTaskC12718Un.A07(c109601z.A01());
        this.A00.setText(c109601z.A02());
        this.A01.setText(c109601z.A03());
    }
}
