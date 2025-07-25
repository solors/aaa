package com.bytedance.adsdk.ugeno.ldr.p224bg;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.ldr.C7133eqN;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.ldr.bg.bg */
/* loaded from: classes3.dex */
public class C7132bg extends LinearLayout {

    /* renamed from: IL */
    private int f15317IL;

    /* renamed from: Kg */
    private boolean f15318Kg;

    /* renamed from: WR */
    private int f15319WR;

    /* renamed from: bX */
    private int f15320bX;

    /* renamed from: bg */
    private List<View> f15321bg;
    private Context eqN;

    /* renamed from: iR */
    private int f15322iR;
    private int ldr;

    /* renamed from: zx */
    private int f15323zx;

    public C7132bg(Context context) {
        super(context);
        this.f15317IL = SupportMenu.CATEGORY_MASK;
        this.f15320bX = -16776961;
        this.f15323zx = 5;
        this.ldr = 20;
        this.f15322iR = 20;
        this.eqN = context;
        this.f15321bg = new ArrayList();
        m89956bg();
    }

    /* renamed from: IL */
    public void m89959IL() {
        View view = new View(getContext());
        view.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ldr, this.f15322iR);
        int i = this.f15323zx;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        addView(view, layoutParams);
        view.setBackground(m89958IL(this.f15320bX));
        this.f15321bg.add(view);
    }

    /* renamed from: bg */
    public void m89953bg(int i, int i2) {
        for (View view : this.f15321bg) {
            view.setBackground(m89958IL(this.f15320bX));
        }
        i = (i < 0 || i >= this.f15321bg.size()) ? 0 : 0;
        if (this.f15321bg.size() > 0) {
            this.f15321bg.get(i).setBackground(m89958IL(this.f15317IL));
            this.f15319WR = i2;
        }
    }

    public int getSize() {
        return this.f15321bg.size();
    }

    public void setLoop(boolean z) {
        this.f15318Kg = z;
    }

    public void setSelectedColor(int i) {
        this.f15317IL = i;
    }

    public void setUnSelectedColor(int i) {
        this.f15320bX = i;
    }

    /* renamed from: bg */
    public void m89956bg() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) C7114Kg.m90009bg(this.eqN, 10.0f);
        setLayoutParams(layoutParams);
    }

    /* renamed from: IL */
    private GradientDrawable m89958IL(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: bg */
    public void m89954bg(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ldr, this.f15322iR);
        int i2 = this.f15323zx;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.ldr, this.f15322iR);
        int i3 = this.f15323zx;
        layoutParams2.leftMargin = i3;
        layoutParams2.rightMargin = i3;
        int m89947bg = C7133eqN.m89947bg(this.f15318Kg, this.f15319WR, this.f15321bg.size());
        int m89947bg2 = C7133eqN.m89947bg(this.f15318Kg, i, this.f15321bg.size());
        if (this.f15321bg.size() == 0) {
            m89947bg2 = 0;
        }
        if (!this.f15321bg.isEmpty() && C7133eqN.m89948bg(m89947bg, this.f15321bg) && C7133eqN.m89948bg(m89947bg2, this.f15321bg)) {
            this.f15321bg.get(m89947bg).setBackground(m89958IL(this.f15320bX));
            this.f15321bg.get(m89947bg).setLayoutParams(layoutParams2);
            this.f15321bg.get(m89947bg2).setBackground(m89958IL(this.f15317IL));
            this.f15321bg.get(m89947bg2).setLayoutParams(layoutParams);
            this.f15319WR = i;
        }
    }
}
