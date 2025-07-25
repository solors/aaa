package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a */
    Runnable f55704a;

    /* renamed from: b */
    private Camera f55705b;

    /* renamed from: c */
    private Matrix f55706c;

    /* renamed from: d */
    private int f55707d;

    /* renamed from: e */
    private int f55708e;

    /* renamed from: f */
    private int f55709f;

    /* renamed from: g */
    private int f55710g;

    /* renamed from: h */
    private int f55711h;

    /* renamed from: i */
    private int f55712i;

    /* renamed from: j */
    private int f55713j;

    /* renamed from: k */
    private int f55714k;

    /* renamed from: l */
    private float f55715l;

    /* renamed from: m */
    private float f55716m;

    /* renamed from: n */
    private boolean f55717n;

    /* renamed from: o */
    private boolean f55718o;

    /* renamed from: p */
    private boolean f55719p;

    public MBRotationView(Context context) {
        super(context);
        this.f55709f = 40;
        this.f55710g = 20;
        this.f55711h = 0;
        this.f55712i = 0;
        this.f55714k = 0;
        this.f55715l = 0.5f;
        this.f55716m = 0.9f;
        this.f55717n = true;
        this.f55718o = false;
        this.f55719p = false;
        this.f55704a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.m53025a(MBRotationView.this);
            }
        };
        m53029a();
    }

    /* renamed from: a */
    private void m53029a() {
        this.f55705b = new Camera();
        this.f55706c = new Matrix();
        setWillNotDraw(false);
    }

    /* renamed from: b */
    private void m53024b(int i, int i2, int i3) {
        if (i3 == 0) {
            float f = (-i) / 2;
            this.f55705b.translate(f, 0.0f, 0.0f);
            float f2 = -i2;
            this.f55705b.rotateY(f2);
            this.f55705b.translate(f, 0.0f, 0.0f);
            this.f55705b.translate(f, 0.0f, 0.0f);
            this.f55705b.rotateY(f2);
            this.f55705b.translate(f, 0.0f, 0.0f);
        } else if (i3 == 1) {
            float f3 = i / 2;
            this.f55705b.translate(f3, 0.0f, 0.0f);
            this.f55705b.rotateY(i2);
            this.f55705b.translate(f3, 0.0f, 0.0f);
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f55705b.rotateY(0.0f);
        } else {
            float f4 = (-i) / 2;
            this.f55705b.translate(f4, 0.0f, 0.0f);
            this.f55705b.rotateY(-i2);
            this.f55705b.translate(f4, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f55718o) {
            int height = getHeight() / 2;
            int i = ((this.f55711h * this.f55707d) / 2) / this.f55709f;
            m53026a(canvas, i, height, 0);
            m53026a(canvas, i, height, 1);
            if (Math.abs(this.f55711h) > this.f55709f / 2) {
                m53026a(canvas, i, height, 3);
                m53026a(canvas, i, height, 2);
                return;
            }
            m53026a(canvas, i, height, 2);
            m53026a(canvas, i, height, 3);
            return;
        }
        int width = getWidth() / 2;
        int i2 = ((this.f55711h * this.f55708e) / 2) / this.f55709f;
        m53023b(canvas, i2, width, 0);
        m53023b(canvas, i2, width, 1);
        if (Math.abs(this.f55711h) > this.f55709f / 2) {
            m53023b(canvas, i2, width, 3);
            m53023b(canvas, i2, width, 2);
            return;
        }
        m53023b(canvas, i2, width, 2);
        m53023b(canvas, i2, width, 3);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = i5;
        float f2 = this.f55715l;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = i7;
        float f4 = this.f55716m;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.f55707d = (int) (f3 * f4);
        this.f55708e = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f55708e;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.f55707d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f55704a, 1000 / this.f55710g);
        }
        this.f55717n = z;
    }

    public void setHeightRatio(float f) {
        this.f55716m = f;
    }

    public void setRotateV(boolean z) {
        this.f55718o = z;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.f55715l = f;
    }

    /* renamed from: a */
    private void m53027a(int i, int i2, int i3) {
        float f = (-i) / 2.0f;
        if (i3 == 0) {
            this.f55705b.translate(0.0f, f, 0.0f);
            float f2 = -i2;
            this.f55705b.rotateX(f2);
            this.f55705b.translate(0.0f, f, 0.0f);
            this.f55705b.translate(0.0f, f, 0.0f);
            this.f55705b.rotateX(f2);
            this.f55705b.translate(0.0f, f, 0.0f);
        } else if (i3 == 1) {
            this.f55705b.translate(0.0f, f, 0.0f);
            this.f55705b.rotateX(i2);
            this.f55705b.translate(0.0f, f, 0.0f);
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f55705b.rotateX(0.0f);
        } else {
            this.f55705b.translate(0.0f, f, 0.0f);
            this.f55705b.rotateX(-i2);
            this.f55705b.translate(0.0f, f, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55709f = 40;
        this.f55710g = 20;
        this.f55711h = 0;
        this.f55712i = 0;
        this.f55714k = 0;
        this.f55715l = 0.5f;
        this.f55716m = 0.9f;
        this.f55717n = true;
        this.f55718o = false;
        this.f55719p = false;
        this.f55704a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.m53025a(MBRotationView.this);
            }
        };
        m53029a();
    }

    /* renamed from: b */
    private void m53023b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f55705b.save();
        this.f55706c.reset();
        float f = i;
        this.f55705b.translate(f, 0.0f, 0.0f);
        this.f55705b.rotateY(this.f55711h);
        this.f55705b.translate(f, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f55719p) {
                m53024b(this.f55708e, this.f55709f, i3);
            } else {
                m53024b(-this.f55708e, -this.f55709f, i3);
            }
        } else if (i > 0) {
            m53024b(this.f55708e, this.f55709f, i3);
        } else if (i < 0) {
            m53024b(-this.f55708e, -this.f55709f, i3);
        }
        this.f55705b.getMatrix(this.f55706c);
        this.f55705b.restore();
        this.f55706c.preTranslate(-i2, (-getHeight()) / 2);
        this.f55706c.postTranslate(i2, getHeight() / 2);
        canvas.concat(this.f55706c);
        View childAt = getChildAt(m53028a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m53026a(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f55705b.save();
        this.f55706c.reset();
        float f = i;
        this.f55705b.translate(0.0f, f, 0.0f);
        this.f55705b.rotateX(this.f55711h);
        this.f55705b.translate(0.0f, f, 0.0f);
        if (i == 0) {
            if (this.f55719p) {
                m53027a(this.f55707d, this.f55709f, i3);
            } else {
                m53027a(-this.f55707d, -this.f55709f, i3);
            }
        } else if (i > 0) {
            m53027a(this.f55707d, this.f55709f, i3);
        } else if (i < 0) {
            m53027a(-this.f55707d, -this.f55709f, i3);
        }
        this.f55705b.getMatrix(this.f55706c);
        this.f55705b.restore();
        this.f55706c.preTranslate((-getWidth()) / 2, -i2);
        this.f55706c.postTranslate(getWidth() / 2, i2);
        canvas.concat(this.f55706c);
        View childAt = getChildAt(m53028a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55709f = 40;
        this.f55710g = 20;
        this.f55711h = 0;
        this.f55712i = 0;
        this.f55714k = 0;
        this.f55715l = 0.5f;
        this.f55716m = 0.9f;
        this.f55717n = true;
        this.f55718o = false;
        this.f55719p = false;
        this.f55704a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.m53025a(MBRotationView.this);
            }
        };
        m53029a();
    }

    /* renamed from: a */
    private int m53028a(int i) {
        int i2;
        int i3;
        int i4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i2 = i != 3 ? 0 : this.f55712i;
                } else if (this.f55719p) {
                    i3 = this.f55712i;
                    i2 = i3 - 1;
                } else {
                    i4 = this.f55712i;
                    i2 = i4 + 1;
                }
            } else if (this.f55719p) {
                i4 = this.f55712i;
                i2 = i4 + 1;
            } else {
                i3 = this.f55712i;
                i2 = i3 - 1;
            }
        } else if (this.f55719p) {
            i2 = this.f55712i - 2;
        } else {
            i2 = this.f55712i + 2;
        }
        int childCount = i2 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    /* renamed from: a */
    static /* synthetic */ void m53025a(MBRotationView mBRotationView) {
        int m53028a;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i = mBRotationView.f55711h - 1;
        mBRotationView.f55711h = i;
        int i2 = mBRotationView.f55712i;
        mBRotationView.f55713j = i2;
        int i3 = mBRotationView.f55709f;
        int i4 = i % i3;
        mBRotationView.f55711h = i4;
        mBRotationView.f55712i = i2 - (i / i3);
        if (Math.abs(i4) > mBRotationView.f55709f / 2) {
            m53028a = mBRotationView.m53028a(2);
        } else {
            m53028a = mBRotationView.m53028a(3);
        }
        if (mBRotationView.f55714k != m53028a) {
            mBRotationView.f55714k = m53028a;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f55717n) {
            mBRotationView.postDelayed(mBRotationView.f55704a, 1000 / mBRotationView.f55710g);
        }
    }
}
