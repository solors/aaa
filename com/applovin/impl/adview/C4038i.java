package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.AbstractC4028e;

/* renamed from: com.applovin.impl.adview.i */
/* loaded from: classes2.dex */
public final class C4038i extends AbstractC4028e {

    /* renamed from: c */
    private static final Paint f4679c = new Paint(1);

    /* renamed from: d */
    private static final Paint f4680d = new Paint(1);

    public C4038i(Context context) {
        super(context);
        f4679c.setARGB(80, 0, 0, 0);
        Paint paint = f4680d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.AbstractC4028e
    /* renamed from: a */
    public void mo100836a(int i) {
        setViewScale(i / 30.0f);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f4657a * 8.0f;
    }

    protected float getStrokeWidth() {
        return this.f4657a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC4028e
    public AbstractC4028e.EnumC4029a getStyle() {
        return AbstractC4028e.EnumC4029a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f4679c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f4680d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
