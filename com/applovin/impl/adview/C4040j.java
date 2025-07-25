package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.AbstractC4028e;

/* renamed from: com.applovin.impl.adview.j */
/* loaded from: classes2.dex */
public final class C4040j extends AbstractC4028e {

    /* renamed from: f */
    private static final Paint f4682f = new Paint(1);

    /* renamed from: g */
    private static final Paint f4683g = new Paint(1);

    /* renamed from: c */
    private final float[] f4684c;

    /* renamed from: d */
    private Path f4685d;

    public C4040j(Context context) {
        super(context);
        this.f4684c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f4682f.setARGB(80, 0, 0, 0);
        Paint paint = f4683g;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.AbstractC4028e
    /* renamed from: a */
    public void mo100836a(int i) {
        setViewScale(i / 30.0f);
        m100837a();
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getStrokeWidth() {
        return this.f4657a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC4028e
    public AbstractC4028e.EnumC4029a getStyle() {
        return AbstractC4028e.EnumC4029a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f4682f);
        Paint paint = f4683g;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f4685d, paint);
    }

    /* renamed from: a */
    private void m100837a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f4684c;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f4657a;
                i++;
            } else {
                Path path = new Path();
                this.f4685d = path;
                float[] fArr2 = this.f4684c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f4685d;
                float[] fArr3 = this.f4684c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f4685d;
                float[] fArr4 = this.f4684c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f4685d;
                float[] fArr5 = this.f4684c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f4685d;
                float[] fArr6 = this.f4684c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f4685d;
                float[] fArr7 = this.f4684c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
