package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bg */
/* loaded from: classes3.dex */
public class C7426bg extends C7401IL {

    /* renamed from: bX */
    private final Bitmap f16067bX;

    /* renamed from: IL */
    private final Rect f16066IL = new Rect();
    private final Paint eqN = new Paint(1);

    public C7426bg(Bitmap bitmap, C7401IL c7401il) {
        this.f16067bX = bitmap;
        if (c7401il != null) {
            this.f16025bg = c7401il.f16025bg;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7401IL
    /* renamed from: bg */
    protected void mo89037bg(Canvas canvas) {
        canvas.drawBitmap(this.f16067bX, this.f16066IL, getBounds(), this.eqN);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.f16067bX.getWidth();
        int height2 = this.f16067bX.getHeight();
        this.f16066IL.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                Rect rect2 = this.f16066IL;
                int i = (width2 - width) / 2;
                rect2.left = i;
                rect2.right = i + width;
            }
            if (height2 > height) {
                Rect rect3 = this.f16066IL;
                int i2 = (height2 - height) / 2;
                rect3.top = i2;
                rect3.bottom = i2 + height;
                return;
            }
            return;
        }
        float f = height;
        float f2 = f * 1.0f;
        float f3 = height2;
        float f4 = f2 / f3;
        float f5 = width;
        float f6 = 1.0f * f5;
        float f7 = width2;
        if (Math.max(f4, f6 / f7) > f4) {
            int i3 = (int) ((f2 / f5) * f7);
            Rect rect4 = this.f16066IL;
            int i4 = (height2 - i3) / 2;
            rect4.top = i4;
            rect4.bottom = i4 + i3;
            return;
        }
        int i5 = (int) ((f6 / f) * f3);
        Rect rect5 = this.f16066IL;
        int i6 = (width2 - i5) / 2;
        rect5.left = i6;
        rect5.right = i6 + i5;
    }
}
