package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AbstractC4028e;

/* renamed from: com.applovin.impl.adview.n */
/* loaded from: classes2.dex */
public final class C4045n extends AbstractC4028e {

    /* renamed from: c */
    private static final Paint f4690c = new Paint(1);

    /* renamed from: d */
    private static final Paint f4691d = new Paint(1);

    /* renamed from: f */
    private static final Paint f4692f = new Paint(1);

    public C4045n(Context context) {
        super(context);
        f4690c.setColor(-1);
        f4691d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f4692f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f4657a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f4657a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f4657a * 3.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC4028e
    public AbstractC4028e.EnumC4029a getStyle() {
        return AbstractC4028e.EnumC4029a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f4690c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f4691d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f4692f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
