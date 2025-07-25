package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.C42750R;

/* loaded from: classes10.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* renamed from: a */
    private float f114777a;

    /* renamed from: b */
    private float f114778b;

    /* renamed from: c */
    private float f114779c;

    /* renamed from: d */
    private float f114780d;

    /* renamed from: e */
    private float f114781e;

    /* renamed from: f */
    private int f114782f;

    /* renamed from: g */
    private Paint f114783g;

    /* renamed from: h */
    private RectF f114784h;

    /* renamed from: i */
    private int f114785i;

    /* renamed from: j */
    private float f114786j;

    /* renamed from: k */
    private Paint f114787k;

    /* renamed from: l */
    private RectF f114788l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m4754a() {
        if (this.f114786j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f114787k = paint;
            paint.setShadowLayer(this.f114786j, 0.0f, 0.0f, this.f114785i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f = this.f114777a;
        float f2 = this.f114778b;
        float f3 = this.f114780d;
        float f4 = this.f114779c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = this.f114788l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        if (this.f114787k != null) {
            float f = this.f114786j;
            RectF rectF = new RectF(f, f, getWidth() - this.f114786j, getHeight() - this.f114786j);
            this.f114788l = rectF;
            float f2 = this.f114777a;
            canvas.drawRoundRect(rectF, f2, f2, this.f114787k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f114783g;
        float f3 = this.f114781e;
        RectF rectF2 = this.f114784h;
        if (paint != null && rectF2 != null && f3 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f114782f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f3);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f4 = this.f114777a;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restoreToCount(save);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f114779c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f114780d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f114777a;
    }

    public float getCornerRadiusTopRight() {
        return this.f114778b;
    }

    public void setCornerRadius(float f) {
        m4753a(f, f, f, f);
    }

    public void setShadowColor(@ColorInt int i) {
        this.f114785i = i;
        invalidate();
    }

    public void setShadowRadius(float f) {
        boolean z;
        if (this.f114787k == null) {
            z = true;
        } else {
            z = false;
        }
        this.f114786j = f;
        if (z) {
            m4754a();
        }
        invalidate();
    }

    public void setStrokeColor(@ColorInt int i) {
        this.f114782f = i;
        if (this.f114783g == null) {
            this.f114783g = new Paint();
        }
        if (this.f114784h == null) {
            this.f114784h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f114781e = f;
        if (this.f114783g == null) {
            this.f114783g = new Paint();
        }
        if (this.f114784h == null) {
            this.f114784h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public final void m4753a(float f, float f2, float f3, float f4) {
        this.f114777a = f;
        this.f114778b = f2;
        this.f114779c = f3;
        this.f114780d = f4;
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114782f = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42750R.styleable.RoundedFrameLayout);
        try {
            float dimension = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_radius, 0.0f);
            this.f114777a = dimension;
            this.f114778b = dimension;
            this.f114779c = dimension;
            this.f114780d = dimension;
            if (dimension == 0.0f) {
                this.f114777a = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_topLeftRadius, 0.0f);
                this.f114778b = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_topRightRadius, 0.0f);
                this.f114779c = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_bottomLeftRadius, 0.0f);
                this.f114780d = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_bottomRightRadius, 0.0f);
            }
            this.f114785i = obtainStyledAttributes.getColor(C42750R.styleable.RoundedFrameLayout_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f114786j = obtainStyledAttributes.getDimension(C42750R.styleable.RoundedFrameLayout_shadowRadius, -1.0f);
            m4754a();
        } catch (Exception unused) {
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
