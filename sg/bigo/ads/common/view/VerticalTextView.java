package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/* loaded from: classes10.dex */
public class VerticalTextView extends TextView {

    /* renamed from: a */
    private boolean f114795a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114795a = true;
        int gravity = getGravity();
        if (Gravity.isVertical(gravity) && (gravity & 112) == 80) {
            setGravity((gravity & 7) | 48);
            this.f114795a = false;
            return;
        }
        this.f114795a = true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f114795a) {
            canvas.translate(getWidth(), 0.0f);
            f = 90.0f;
        } else {
            canvas.translate(0.0f, getHeight());
            f = -90.0f;
        }
        canvas.rotate(f);
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
