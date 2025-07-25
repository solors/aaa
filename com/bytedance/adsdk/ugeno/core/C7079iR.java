package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;

/* renamed from: com.bytedance.adsdk.ugeno.core.iR */
/* loaded from: classes3.dex */
public class C7079iR {

    /* renamed from: IL */
    private C7072bg f15219IL;

    /* renamed from: bX */
    private AnimatorSet f15220bX = new AnimatorSet();

    /* renamed from: bg */
    Paint f15221bg;
    private View eqN;

    /* renamed from: iR */
    private String f15222iR;
    private int ldr;

    /* renamed from: zx */
    private int f15223zx;

    public C7079iR(View view, C7072bg c7072bg) {
        this.eqN = view;
        this.f15219IL = c7072bg;
        Paint paint = new Paint();
        this.f15221bg = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: IL */
    public void m90091IL() {
        AnimatorSet animatorSet = this.f15220bX;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
        if (r2.equals("accelerate") == false) goto L42;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m90090bg() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.C7079iR.m90090bg():void");
    }

    /* renamed from: bg */
    public void m90088bg(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.f15222iR)) {
                return;
            }
            this.f15221bg.setColor(C7118bg.m89995bg(this.f15222iR));
            this.f15221bg.setAlpha(90);
            ((ViewGroup) this.eqN.getParent()).setClipChildren(true);
            int i = this.f15223zx;
            int i2 = this.ldr;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRipple(), this.f15221bg);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    /* renamed from: bg */
    public void m90089bg(int i, int i2) {
        this.f15223zx = i / 2;
        this.ldr = i2 / 2;
    }
}
