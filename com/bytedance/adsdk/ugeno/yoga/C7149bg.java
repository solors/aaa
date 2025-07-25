package com.bytedance.adsdk.ugeno.yoga;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.C7140Kg;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.bg */
/* loaded from: classes3.dex */
public class C7149bg extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C7149bg) {
            throw null;
        }
        AbstractC7144PX m89899bg = AbstractC7145Ta.m89899bg();
        C7140Kg.m89919bg(new C7140Kg.C7142bg(layoutParams), m89899bg, view);
        m89899bg.mo89865bg(view);
        m89899bg.mo89871bg((InterfaceC7147WR) new C7140Kg.C7141IL());
        throw null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7140Kg.C7142bg;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7140Kg.C7142bg(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7140Kg.C7142bg(layoutParams);
    }

    public AbstractC7144PX getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
