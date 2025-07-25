package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.NW */
/* loaded from: assets/audience_network.dex */
public final class C12268NW extends LinearLayout {
    public static final int A03 = (int) (AbstractC12137LP.A02 * 40.0f);
    public static final int A04 = (int) (AbstractC12137LP.A02 * 20.0f);
    public static final int A05 = (int) (AbstractC12137LP.A02 * 10.0f);
    public final C110192W A00;
    public final C13029Zs A01;
    public final InterfaceC12252NG A02;

    public C12268NW(C13029Zs c13029Zs, C110192W c110192w, InterfaceC12252NG interfaceC12252NG, EnumC12185MB enumC12185MB) {
        this(c13029Zs, c110192w, interfaceC12252NG, null, enumC12185MB);
    }

    public C12268NW(C13029Zs c13029Zs, C110192W c110192w, InterfaceC12252NG interfaceC12252NG, String str, EnumC12185MB enumC12185MB) {
        super(c13029Zs);
        this.A01 = c13029Zs;
        this.A00 = c110192w;
        this.A02 = interfaceC12252NG;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC12177M3.A0M(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(enumC12185MB, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C12274Nc A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(EnumC12185MB enumC12185MB, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC12186MC.A01(enumC12185MB));
        TextView textView = new TextView(getContext());
        AbstractC12177M3.A0Y(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC12186MC.A01(EnumC12185MB.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new View$OnClickListenerC12266NU(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        AbstractC12177M3.A0Y(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C12274Nc A03() {
        C12274Nc c12274Nc = new C12274Nc(this.A01);
        for (C110192W c110192w : this.A00.A05()) {
            C12254NI c12254ni = new C12254NI(this.A01);
            c12254ni.setData(c110192w.A04(), null);
            c12254ni.setOnClickListener(new View$OnClickListenerC12267NV(this, c12254ni, c110192w));
            c12274Nc.addView(c12254ni);
        }
        return c12274Nc;
    }
}
