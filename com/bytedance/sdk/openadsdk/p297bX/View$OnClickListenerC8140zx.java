package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.p297bX.C8126eo;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.zx */
/* loaded from: classes3.dex */
public class View$OnClickListenerC8140zx extends C9109zx implements View.OnClickListener, C8126eo.InterfaceC8131bX {

    /* renamed from: Kg */
    private final int f17827Kg;

    /* renamed from: iR */
    private StateListDrawable f17828iR;
    private FilterWord ldr;

    /* renamed from: zx */
    private final C8126eo f17829zx;

    /* renamed from: bg */
    public static FilterWord f17826bg = new FilterWord("100:1", "GOOD");

    /* renamed from: IL */
    public static FilterWord f17824IL = new FilterWord("100:2", "NOT_BAD");

    /* renamed from: bX */
    public static FilterWord f17825bX = new FilterWord("100:3", "BAD");
    public static List<View$OnClickListenerC8140zx> eqN = new ArrayList(3);

    public View$OnClickListenerC8140zx(@NonNull Context context, int i, C8126eo c8126eo) {
        super(context);
        this.f17827Kg = i;
        this.f17829zx = c8126eo;
        if (c8126eo != null) {
            c8126eo.m86958bg(this);
        }
        m86929bg(i);
        m86930bg();
        m86931IL();
        eqN.add(this);
    }

    /* renamed from: IL */
    private void m86931IL() {
        int i;
        float f;
        int i2;
        C9101Kg c9101Kg = new C9101Kg(getContext());
        if (this.f17829zx.m86968WR()) {
            i = 40;
        } else {
            i = 30;
        }
        c9101Kg.setTextSize(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Context context = getContext();
        if (this.f17829zx.m86968WR()) {
            f = 8.0f;
        } else {
            f = 4.0f;
        }
        layoutParams.setMargins(0, ZQc.m82537bX(getContext(), 12.0f), 0, ZQc.m82537bX(context, f));
        addView(c9101Kg, layoutParams);
        C8125bg c8125bg = new C8125bg(getContext());
        if (this.f17829zx.m86968WR()) {
            i2 = 17;
        } else {
            i2 = 12;
        }
        c8125bg.setTextSize(i2);
        c8125bg.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c8125bg.setMaxLines(1);
        c8125bg.setSingleLine();
        c8125bg.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, ZQc.m82537bX(getContext(), 12.0f));
        addView(c8125bg, layoutParams2);
        int i3 = this.f17827Kg;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    c8125bg.setText(C7730Fy.m87917bg(getContext(), "tt_bad"));
                    c9101Kg.setText("😡");
                    return;
                }
                return;
            }
            c8125bg.setText(C7730Fy.m87917bg(getContext(), "tt_not_bad"));
            c9101Kg.setText("😐");
            return;
        }
        c9101Kg.setText("😍");
        c8125bg.setText(C7730Fy.m87917bg(getContext(), "tt_good"));
    }

    /* renamed from: bg */
    private void m86929bg(int i) {
        if (i == 1) {
            this.ldr = f17826bg;
        } else if (i == 2) {
            this.ldr = f17824IL;
        } else if (i != 3) {
        } else {
            this.ldr = f17825bX;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.f17829zx.m86960bg(C8126eo.f17798bg);
        } else {
            this.f17829zx.m86960bg(this.ldr);
        }
    }

    /* renamed from: bg */
    private void m86930bg() {
        if (this.f17828iR == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ZQc.m82537bX(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(ZQc.m82537bX(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(ZQc.m82537bX(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f17828iR = stateListDrawable;
            stateListDrawable.addState(new int[]{16842913}, gradientDrawable2);
            this.f17828iR.addState(new int[0], gradientDrawable);
        }
        setBackground(this.f17828iR);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.p297bX.C8126eo.InterfaceC8131bX
    /* renamed from: bg */
    public void mo86928bg(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.ldr) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
