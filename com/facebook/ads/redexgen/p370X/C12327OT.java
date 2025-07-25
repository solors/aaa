package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.OT */
/* loaded from: assets/audience_network.dex */
public final class C12327OT extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C12327OT(C13029Zs c13029Zs, C109491O c109491o, int i) {
        super(c13029Zs);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = AbstractC12137LP.A02;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.A02 = (int) (1.0f * f);
        this.A04 = c109491o.A04(false);
        this.A03 = AbstractC110382p.A01(this.A04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c13029Zs);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(int r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            if (r0 != r6) goto L5
            return
        L5:
            r5.A00 = r6
            r4 = 0
        L8:
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            int r0 = r0.size()
            if (r4 >= r0) goto L40
            if (r4 != r6) goto L3c
            int r3 = r5.A04
            int r2 = r5.A04
        L16:
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r1 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r5.A02
            r1.setStroke(r0, r2)
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r0 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setColor(r3)
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r0 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.invalidateSelf()
            int r4 = r4 + 1
            goto L8
        L3c:
            int r3 = r5.A03
            r2 = 0
            goto L16
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12327OT.A00(int):void");
    }
}
