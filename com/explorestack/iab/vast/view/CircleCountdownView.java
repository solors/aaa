package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10504a;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.InterfaceC10506c;

/* loaded from: classes3.dex */
public class CircleCountdownView extends View implements InterfaceC10506c {

    /* renamed from: b */
    private Bitmap f24283b;

    /* renamed from: c */
    private int f24284c;

    /* renamed from: d */
    private int f24285d;

    /* renamed from: f */
    private int f24286f;

    /* renamed from: g */
    private boolean f24287g;

    /* renamed from: h */
    private float f24288h;

    /* renamed from: i */
    private float f24289i;

    /* renamed from: j */
    private final RectF f24290j;

    /* renamed from: k */
    private final RectF f24291k;

    /* renamed from: l */
    private float f24292l;

    /* renamed from: m */
    private float f24293m;

    /* renamed from: n */
    private float f24294n;
    @Nullable

    /* renamed from: o */
    private Paint f24295o;
    @Nullable

    /* renamed from: p */
    private Paint f24296p;
    @Nullable

    /* renamed from: q */
    private Rect f24297q;
    @Nullable

    /* renamed from: r */
    private RectF f24298r;
    @Nullable

    /* renamed from: s */
    private Paint f24299s;
    @Nullable

    /* renamed from: t */
    private Paint f24300t;

    /* renamed from: u */
    private float f24301u;

    /* renamed from: v */
    private int f24302v;

    public CircleCountdownView(@NonNull Context context) {
        super(context);
        this.f24285d = C10504a.f23989a;
        this.f24286f = C10504a.f23991c;
        this.f24287g = false;
        this.f24288h = 0.0f;
        this.f24289i = 0.071428575f;
        this.f24290j = new RectF();
        this.f24291k = new RectF();
        this.f24292l = 54.0f;
        this.f24293m = 54.0f;
        this.f24294n = 5.0f;
        this.f24301u = 100.0f;
        m78962c(context);
    }

    /* renamed from: a */
    private float m78964a(float f, boolean z) {
        float width = this.f24290j.width();
        if (z) {
            width -= this.f24294n * 2.0f;
        }
        float sqrt = (float) ((width / 2.0f) * Math.sqrt(2.0d));
        return sqrt - ((f * sqrt) * 2.0f);
    }

    /* renamed from: b */
    private void m78963b() {
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = min / 2.0f;
        float width = (getWidth() / 2.0f) - f;
        float height = (getHeight() / 2.0f) - f;
        this.f24290j.set(width, height, width + min, min + height);
        this.f24292l = this.f24290j.centerX();
        this.f24293m = this.f24290j.centerY();
        RectF rectF = this.f24291k;
        RectF rectF2 = this.f24290j;
        float f2 = rectF2.left;
        float f3 = this.f24294n / 2.0f;
        rectF.set(f2 + f3, rectF2.top + f3, rectF2.right - f3, rectF2.bottom - f3);
    }

    /* renamed from: c */
    private void m78962c(@NonNull Context context) {
        setLayerType(1, null);
        this.f24294n = C10512g.m79302o(context, 3.0f);
    }

    /* renamed from: d */
    private void m78961d(Canvas canvas) {
        if (this.f24299s == null) {
            Paint paint = new Paint(7);
            this.f24299s = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f24299s.setAntiAlias(true);
        }
        if (this.f24297q == null) {
            this.f24297q = new Rect();
        }
        if (this.f24298r == null) {
            this.f24298r = new RectF();
        }
        float m78964a = m78964a(this.f24288h, this.f24287g);
        float f = m78964a / 2.0f;
        float f2 = this.f24292l - f;
        float f3 = this.f24293m - f;
        this.f24297q.set(0, 0, this.f24283b.getWidth(), this.f24283b.getHeight());
        this.f24298r.set(f2, f3, f2 + m78964a, m78964a + f3);
        this.f24299s.setColorFilter(new PorterDuffColorFilter(this.f24285d, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f24283b, this.f24297q, this.f24298r, this.f24299s);
        if (this.f24287g) {
            if (this.f24300t == null) {
                Paint paint2 = new Paint(1);
                this.f24300t = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f24300t.setStrokeWidth(this.f24294n);
            this.f24300t.setColor(this.f24285d);
            canvas.drawArc(this.f24291k, 0.0f, 360.0f, false, this.f24300t);
        }
    }

    /* renamed from: e */
    private void m78960e(Canvas canvas) {
        if (this.f24295o == null) {
            this.f24295o = new Paint(1);
        }
        float f = 360.0f - ((this.f24301u * 360.0f) * 0.01f);
        this.f24295o.setColor(this.f24286f);
        this.f24295o.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f24290j, 0.0f, 360.0f, false, this.f24295o);
        this.f24295o.setColor(this.f24285d);
        this.f24295o.setStyle(Paint.Style.STROKE);
        this.f24295o.setStrokeWidth(this.f24294n);
        canvas.drawArc(this.f24291k, 270.0f, f, false, this.f24295o);
    }

    /* renamed from: f */
    private void m78959f(Canvas canvas) {
        if (this.f24296p == null) {
            Paint paint = new Paint(1);
            this.f24296p = paint;
            paint.setAntiAlias(true);
            this.f24296p.setStyle(Paint.Style.FILL);
            this.f24296p.setTextAlign(Paint.Align.CENTER);
        }
        String valueOf = String.valueOf(this.f24302v);
        this.f24296p.setColor(this.f24285d);
        this.f24296p.setTypeface(Typeface.create(Typeface.DEFAULT, this.f24284c));
        this.f24296p.setTextSize(m78964a(this.f24289i, true));
        canvas.drawText(valueOf, this.f24292l, this.f24293m - ((this.f24296p.descent() + this.f24296p.ascent()) / 2.0f), this.f24296p);
    }

    public void changePercentage(float f, int i) {
        if (this.f24283b == null || f == 100.0f) {
            this.f24301u = f;
            this.f24302v = i;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.f24302v != 0 || this.f24283b != null) {
                m78960e(canvas);
                if (this.f24283b != null) {
                    m78961d(canvas);
                } else {
                    m78959f(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m78963b();
    }

    public void setColors(int i, int i2) {
        this.f24285d = i;
        this.f24286f = i2;
        m78963b();
    }

    public void setImage(Bitmap bitmap) {
        this.f24283b = bitmap;
        if (bitmap != null) {
            this.f24301u = 100.0f;
        }
        postInvalidate();
    }

    @Override // com.explorestack.iab.utils.InterfaceC10506c
    public void setStyle(C10507d c10507d) {
        this.f24284c = c10507d.m79369i().intValue();
        this.f24285d = c10507d.m79356v().intValue();
        this.f24286f = c10507d.m79371g().intValue();
        this.f24287g = c10507d.m79400C().booleanValue();
        this.f24294n = c10507d.m79355w(getContext()).floatValue();
        setPadding(c10507d.m79359s(getContext()).intValue(), c10507d.m79357u(getContext()).intValue(), c10507d.m79358t(getContext()).intValue(), c10507d.m79360r(getContext()).intValue());
        setAlpha(c10507d.m79361q().floatValue());
        m78963b();
        postInvalidate();
    }

    public CircleCountdownView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24285d = C10504a.f23989a;
        this.f24286f = C10504a.f23991c;
        this.f24287g = false;
        this.f24288h = 0.0f;
        this.f24289i = 0.071428575f;
        this.f24290j = new RectF();
        this.f24291k = new RectF();
        this.f24292l = 54.0f;
        this.f24293m = 54.0f;
        this.f24294n = 5.0f;
        this.f24301u = 100.0f;
        m78962c(context);
    }
}
