package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7411VB;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX */
/* loaded from: classes3.dex */
public class C7354bX {

    /* renamed from: IL */
    Path f15879IL = new Path();

    /* renamed from: bX */
    Path f15880bX = new Path();

    /* renamed from: bg */
    Paint f15881bg;
    private int eqN;
    private int ldr;

    /* renamed from: zx */
    private int f15882zx;

    public C7354bX() {
        Paint paint = new Paint();
        this.f15881bg = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m89097bg(android.graphics.Canvas r23, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.C7354bX.m89097bg(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    /* renamed from: bg */
    public void m89096bg(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.ldr;
        int i2 = (int) (i * f);
        layoutParams.width = i2;
        view.setTranslationX((i - i2) / 2);
        if (view instanceof C7411VB) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i3).setTranslationX((-(this.ldr - layoutParams.width)) / 2);
                i3++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: bg */
    public void m89095bg(View view, int i, int i2) {
        String str;
        this.eqN = i / 2;
        this.f15882zx = i2 / 2;
        if (this.ldr == 0 && view.getLayoutParams().width > 0) {
            this.ldr = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f15880bX.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.eqN * 2);
            view.setPivotY(this.f15882zx);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f15882zx);
        } else {
            view.setPivotX(this.eqN);
            view.setPivotY(this.f15882zx);
        }
    }
}
