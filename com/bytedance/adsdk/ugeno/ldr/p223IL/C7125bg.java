package com.bytedance.adsdk.ugeno.ldr.p223IL;

import android.view.View;
import com.bytedance.adsdk.ugeno.p206Kg.C6991bX;

/* renamed from: com.bytedance.adsdk.ugeno.ldr.IL.bg */
/* loaded from: classes3.dex */
public class C7125bg implements C6991bX.InterfaceC7003zx {

    /* renamed from: bg */
    final float f15297bg = 0.8f;

    /* renamed from: IL */
    final float f15296IL = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.p206Kg.C6991bX.InterfaceC7003zx
    /* renamed from: bg */
    public void mo89983bg(View view, float f) {
        float f2;
        float f3;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0) {
            f2 = 0.19999999f;
        } else {
            f2 = -0.19999999f;
        }
        float f4 = (f2 * f) + 1.0f;
        if (i < 0) {
            f3 = 0.5f;
        } else {
            f3 = -0.5f;
        }
        float f5 = (f * f3) + 1.0f;
        if (i < 0) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f4);
        view.setScaleY(f4);
        view.setAlpha(Math.abs(f5));
    }
}
