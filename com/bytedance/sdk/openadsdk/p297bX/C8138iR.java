package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.bX.iR */
/* loaded from: classes3.dex */
public class C8138iR extends LinearLayout {

    /* renamed from: IL */
    private C8106Kg f17819IL;

    /* renamed from: bX */
    private final C8126eo f17820bX;

    /* renamed from: bg */
    private final FilterWord f17821bg;

    public C8138iR(Context context, FilterWord filterWord, C8126eo c8126eo) {
        super(context);
        setOrientation(1);
        this.f17821bg = filterWord;
        this.f17820bX = c8126eo;
        m86936bg();
    }

    /* renamed from: IL */
    private void m86938IL() {
        this.f17819IL = new C8106Kg(getContext(), this.f17820bX);
        new LinearLayout.LayoutParams(-1, -2);
        this.f17819IL.m87003bg(this.f17821bg.getOptions());
        addView(this.f17819IL);
    }

    /* renamed from: bX */
    private void m86937bX() {
        int i;
        String name = this.f17821bg.getName();
        C9101Kg c9101Kg = new C9101Kg(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = ZQc.m82537bX(getContext(), 12.0f);
        layoutParams.gravity = 17;
        c9101Kg.setGravity(17);
        c9101Kg.setText(name);
        c9101Kg.setTextColor(Color.argb(85, 22, 24, 35));
        if (this.f17820bX.m86968WR()) {
            i = 14;
        } else {
            i = 10;
        }
        c9101Kg.setTextSize(i);
        addView(c9101Kg, layoutParams);
    }

    /* renamed from: bg */
    private void m86936bg() {
        m86937bX();
        m86938IL();
    }
}
