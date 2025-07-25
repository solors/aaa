package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43822e;

/* loaded from: classes10.dex */
public class Indicator extends View {

    /* renamed from: a */
    public float f114720a;

    /* renamed from: b */
    private int f114721b;

    /* renamed from: c */
    private Paint f114722c;

    /* renamed from: d */
    private Paint f114723d;

    /* renamed from: e */
    private int f114724e;

    /* renamed from: f */
    private float f114725f;

    /* renamed from: g */
    private int f114726g;

    /* renamed from: h */
    private float f114727h;

    /* renamed from: i */
    private int f114728i;

    /* renamed from: j */
    private float f114729j;

    /* renamed from: k */
    private float f114730k;

    /* renamed from: l */
    private int f114731l;

    /* renamed from: m */
    private float f114732m;

    public Indicator(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static float m4778a(int i, float f, float f2, float f3) {
        float f4 = i - 1;
        return (f2 * 2.0f * f4) + (f * f4) + f3;
    }

    public float getDistance() {
        return this.f114729j;
    }

    public float getLengthSelected() {
        return this.f114727h;
    }

    public float getRadius() {
        return this.f114725f;
    }

    public int getType() {
        return this.f114721b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f114721b == 1) {
            if (this.f114732m > 0.0f) {
                float f = this.f114732m;
                canvas.translate(((canvas.getWidth() - f) / 2.0f) + this.f114725f, canvas.getHeight() / 2.0f);
                m4781a();
                float f2 = this.f114725f;
                RectF rectF = new RectF(0.0f, -f2, f, f2);
                float f3 = this.f114725f;
                canvas.drawRoundRect(rectF, f3, f3, this.f114722c);
                float f4 = (f - this.f114727h) * this.f114720a;
                float f5 = this.f114725f;
                RectF rectF2 = new RectF(f4, -f5, this.f114727h + f4, f5);
                float f6 = this.f114725f;
                canvas.drawRoundRect(rectF2, f6, f6, this.f114723d);
                return;
            }
            return;
        }
        m4777a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.f114724e;
        float paddingLeft = (this.f114725f * 2.0f * (i3 - 1)) + (this.f114729j * (i3 - 1)) + this.f114727h + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.f114725f * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, (int) paddingTop);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
        } else {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        }
    }

    public void setColor(int i) {
        if (this.f114726g != i) {
            this.f114726g = i;
            invalidate();
        }
    }

    public void setColorSelected(int i) {
        if (this.f114728i != i) {
            this.f114728i = i;
            invalidate();
        }
    }

    public void setLineLength(float f) {
        if (this.f114732m != f) {
            this.f114732m = f;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i) {
        if (this.f114724e != i) {
            C43782a.m5008a("Indicator", "onMeasure, setNum=".concat(String.valueOf(i)));
            this.f114724e = i;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f) {
        if (f != this.f114725f) {
            this.f114725f = f;
            this.f114727h = 8.0f * f;
            this.f114729j = f * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f114721b != i) {
            this.f114721b = i;
            invalidate();
        }
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m4781a() {
        Paint paint = new Paint();
        this.f114722c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f114722c.setColor(this.f114726g);
        this.f114722c.setAntiAlias(true);
        this.f114722c.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(this.f114722c);
        this.f114723d = paint2;
        paint2.setColor(this.f114728i);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114721b = 0;
        this.f114726g = -2130706433;
        float m4906a = C43822e.m4906a(getContext(), 2);
        this.f114725f = m4906a;
        this.f114728i = -1;
        this.f114727h = 8.0f * m4906a;
        this.f114729j = m4906a * 2.0f;
        this.f114724e = 0;
        this.f114730k = 0.0f;
        this.f114731l = 0;
    }

    /* renamed from: a */
    public final void m4780a(float f, int i) {
        if (i == this.f114731l) {
            this.f114730k = (-f) * 2.0f;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void m4779a(int i) {
        if (this.f114731l != i) {
            this.f114731l = i;
            this.f114730k = 0.0f;
            invalidate();
        }
    }

    /* renamed from: a */
    private void m4777a(Canvas canvas) {
        float f;
        if (this.f114724e <= 0) {
            return;
        }
        canvas.translate(((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - m4778a(this.f114724e, this.f114729j, this.f114725f, this.f114727h)) / 2.0f) + getPaddingLeft() + this.f114725f, (((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        m4781a();
        float f2 = -this.f114725f;
        for (int i = 0; i < this.f114724e; i++) {
            if (i == this.f114731l) {
                float f3 = this.f114725f;
                canvas.drawCircle(f2 + f3, 0.0f, f3, this.f114722c);
                float f4 = this.f114725f;
                canvas.drawCircle((this.f114727h + f2) - f4, 0.0f, f4, this.f114722c);
                float f5 = (this.f114729j * this.f114730k) + f2;
                float f6 = this.f114725f;
                RectF rectF = new RectF(f5, -f6, this.f114727h + f5, f6);
                float f7 = this.f114725f;
                canvas.drawRoundRect(rectF, f7, f7, this.f114723d);
                f = this.f114727h;
            } else {
                float f8 = this.f114725f;
                canvas.drawCircle(f2 + f8, 0.0f, f8, this.f114722c);
                f = this.f114725f * 2.0f;
            }
            f2 = f2 + f + this.f114729j;
        }
    }
}
