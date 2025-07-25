package com.facebook.ads.redexgen.p370X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.Qh */
/* loaded from: assets/audience_network.dex */
public final class C12465Qh extends LinearLayout {
    public static final int A00 = (int) (AbstractC12137LP.A02 * 32.0f);
    public static final int A01 = (int) (AbstractC12137LP.A02 * 8.0f);

    public C12465Qh(C13029Zs c13029Zs, NativeAd nativeAd, C12025JW c12025jw, C12328OU c12328ou, AdOptionsView adOptionsView) {
        super(c13029Zs);
        setOrientation(0);
        c12328ou.setFullCircleCorners(true);
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c12328ou, iconViewParams);
        TextView textView = new TextView(c13029Zs);
        c12025jw.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c13029Zs);
        c12025jw.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c13029Zs);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        LinearLayout.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
