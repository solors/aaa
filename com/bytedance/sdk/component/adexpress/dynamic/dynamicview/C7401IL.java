package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL */
/* loaded from: classes3.dex */
public class C7401IL extends GradientDrawable {

    /* renamed from: IL */
    private final Paint f16024IL;

    /* renamed from: bg */
    protected Path f16025bg;

    public C7401IL() {
        this.f16025bg = new Path();
        Paint paint = new Paint(1);
        this.f16024IL = paint;
        paint.setColor(-1);
    }

    /* renamed from: bg */
    protected void mo89037bg(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.f16025bg;
        if (path != null && !path.isEmpty()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f16024IL, 31);
            mo89037bg(canvas);
            this.f16024IL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.f16025bg, this.f16024IL);
            this.f16024IL.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        mo89037bg(canvas);
    }

    /* renamed from: bg */
    public void m89049bg(int i, int i2, int i3, int i4) {
        this.f16025bg.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    public C7401IL(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.f16025bg = new Path();
        Paint paint = new Paint(1);
        this.f16024IL = paint;
        paint.setColor(-1);
    }
}
