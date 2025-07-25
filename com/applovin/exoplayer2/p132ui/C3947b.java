package com.applovin.exoplayer2.p132ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import com.applovin.exoplayer2.p132ui.InterfaceC3964i;
import com.applovin.impl.AbstractC4100b1;
import com.applovin.impl.AbstractC5863xp;
import com.applovin.sdk.C6200R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.applovin.exoplayer2.ui.b */
/* loaded from: classes2.dex */
public class C3947b extends View implements InterfaceC3964i {

    /* renamed from: A */
    private final float f4266A;

    /* renamed from: B */
    private int f4267B;

    /* renamed from: C */
    private long f4268C;

    /* renamed from: D */
    private int f4269D;

    /* renamed from: E */
    private Rect f4270E;

    /* renamed from: F */
    private ValueAnimator f4271F;

    /* renamed from: G */
    private float f4272G;

    /* renamed from: H */
    private boolean f4273H;

    /* renamed from: I */
    private boolean f4274I;

    /* renamed from: J */
    private long f4275J;

    /* renamed from: K */
    private long f4276K;

    /* renamed from: L */
    private long f4277L;

    /* renamed from: M */
    private long f4278M;

    /* renamed from: N */
    private int f4279N;

    /* renamed from: O */
    private long[] f4280O;

    /* renamed from: P */
    private boolean[] f4281P;

    /* renamed from: a */
    private final Rect f4282a;

    /* renamed from: b */
    private final Rect f4283b;

    /* renamed from: c */
    private final Rect f4284c;

    /* renamed from: d */
    private final Rect f4285d;

    /* renamed from: f */
    private final Paint f4286f;

    /* renamed from: g */
    private final Paint f4287g;

    /* renamed from: h */
    private final Paint f4288h;

    /* renamed from: i */
    private final Paint f4289i;

    /* renamed from: j */
    private final Paint f4290j;

    /* renamed from: k */
    private final Paint f4291k;

    /* renamed from: l */
    private final Drawable f4292l;

    /* renamed from: m */
    private final int f4293m;

    /* renamed from: n */
    private final int f4294n;

    /* renamed from: o */
    private final int f4295o;

    /* renamed from: p */
    private final int f4296p;

    /* renamed from: q */
    private final int f4297q;

    /* renamed from: r */
    private final int f4298r;

    /* renamed from: s */
    private final int f4299s;

    /* renamed from: t */
    private final int f4300t;

    /* renamed from: u */
    private final int f4301u;

    /* renamed from: v */
    private final StringBuilder f4302v;

    /* renamed from: w */
    private final Formatter f4303w;

    /* renamed from: x */
    private final Runnable f4304x;

    /* renamed from: y */
    private final CopyOnWriteArraySet f4305y;

    /* renamed from: z */
    private final Point f4306z;

    public C3947b(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m101239a(C3947b c3947b, ValueAnimator valueAnimator) {
        c3947b.m101244a(valueAnimator);
    }

    /* renamed from: b */
    public static /* synthetic */ void m101233b(C3947b c3947b) {
        c3947b.m101250a();
    }

    /* renamed from: c */
    private void m101231c(long j) {
        if (this.f4275J == j) {
            return;
        }
        this.f4275J = j;
        Iterator it = this.f4305y.iterator();
        while (it.hasNext()) {
            ((InterfaceC3964i.InterfaceC3965a) it.next()).mo101101b(this, j);
        }
    }

    private long getPositionIncrement() {
        long j = this.f4268C;
        if (j == -9223372036854775807L) {
            long j2 = this.f4276K;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.f4267B;
        }
        return j;
    }

    private String getProgressText() {
        return AbstractC5863xp.m93011a(this.f4302v, this.f4303w, this.f4277L);
    }

    private long getScrubberPosition() {
        if (this.f4283b.width() > 0 && this.f4276K != -9223372036854775807L) {
            return (this.f4285d.width() * this.f4276K) / this.f4283b.width();
        }
        return 0L;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m101232c();
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    public long getPreferredUpdateDelay() {
        int m101236b = m101236b(this.f4266A, this.f4283b.width());
        if (m101236b != 0) {
            long j = this.f4276K;
            if (j != 0 && j != -9223372036854775807L) {
                return j / m101236b;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4292l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m101234b(canvas);
        m101243a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f4274I && !z) {
            m101238a(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f4276K <= 0) {
            return;
        }
        if (AbstractC5863xp.f12151a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m101245a(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f4304x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f4304x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f4274I
            if (r0 == 0) goto L30
            r5 = 0
            r4.m101238a(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p132ui.C3947b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.f4273H) {
            i5 = 0;
        } else {
            i5 = this.f4300t;
        }
        if (this.f4295o == 1) {
            i6 = (i9 - getPaddingBottom()) - this.f4294n;
            int i10 = this.f4293m;
            i7 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i6 = (i9 - this.f4294n) / 2;
            i7 = (i9 - this.f4293m) / 2;
        }
        this.f4282a.set(paddingLeft, i6, paddingRight, this.f4294n + i6);
        Rect rect = this.f4283b;
        Rect rect2 = this.f4282a;
        rect.set(rect2.left + i5, i7, rect2.right - i5, this.f4293m + i7);
        if (AbstractC5863xp.f12151a >= 29) {
            m101246a(i8, i9);
        }
        m101237b();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f4294n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f4294n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m101232c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f4292l;
        if (drawable != null && m101241a(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f4276K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m101240a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f4274I
            if (r8 == 0) goto L76
            int r8 = r7.f4301u
            if (r0 >= r8) goto L3a
            int r8 = r7.f4269D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m101249a(r8)
            goto L40
        L3a:
            r7.f4269D = r2
            float r8 = (float) r2
            r7.m101249a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.m101231c(r0)
            r7.m101237b()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f4274I
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.m101238a(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m101248a(r8, r0)
            if (r0 == 0) goto L76
            r7.m101249a(r8)
            long r0 = r7.getScrubberPosition()
            r7.m101235b(r0)
            r7.m101237b()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p132ui.C3947b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f4276K <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m101245a(-getPositionIncrement())) {
                m101238a(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m101245a(getPositionIncrement())) {
                m101238a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f4289i.setColor(i);
        invalidate(this.f4282a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f4287g.setColor(i);
        invalidate(this.f4282a);
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    public void setBufferedPosition(long j) {
        if (this.f4278M == j) {
            return;
        }
        this.f4278M = j;
        m101237b();
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    public void setDuration(long j) {
        if (this.f4276K == j) {
            return;
        }
        this.f4276K = j;
        if (this.f4274I && j == -9223372036854775807L) {
            m101238a(true);
        }
        m101237b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.p132ui.InterfaceC3964i
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f4274I && !z) {
            m101238a(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f4267B = i;
        this.f4268C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f4267B = -1;
        this.f4268C = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f4290j.setColor(i);
        invalidate(this.f4282a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f4286f.setColor(i);
        invalidate(this.f4282a);
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    public void setPosition(long j) {
        if (this.f4277L == j) {
            return;
        }
        this.f4277L = j;
        setContentDescription(getProgressText());
        m101237b();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f4291k.setColor(i);
        invalidate(this.f4282a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f4288h.setColor(i);
        invalidate(this.f4282a);
    }

    public C3947b(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f4282a = new Rect();
        this.f4283b = new Rect();
        this.f4284c = new Rect();
        this.f4285d = new Rect();
        Paint paint = new Paint();
        this.f4286f = paint;
        Paint paint2 = new Paint();
        this.f4287g = paint2;
        Paint paint3 = new Paint();
        this.f4288h = paint3;
        Paint paint4 = new Paint();
        this.f4289i = paint4;
        Paint paint5 = new Paint();
        this.f4290j = paint5;
        Paint paint6 = new Paint();
        this.f4291k = paint6;
        paint6.setAntiAlias(true);
        this.f4305y = new CopyOnWriteArraySet();
        this.f4306z = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f4266A = f;
        this.f4301u = m101247a(f, -50);
        int m101247a = m101247a(f, 4);
        int m101247a2 = m101247a(f, 26);
        int m101247a3 = m101247a(f, 4);
        int m101247a4 = m101247a(f, 12);
        int m101247a5 = m101247a(f, 0);
        int m101247a6 = m101247a(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C6200R.styleable.AppLovinDefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C6200R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f4292l = drawable;
                if (drawable != null) {
                    m101242a(drawable);
                    m101247a2 = Math.max(drawable.getMinimumHeight(), m101247a2);
                }
                this.f4293m = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_bar_height, m101247a);
                this.f4294n = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, m101247a2);
                this.f4295o = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f4296p = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, m101247a3);
                this.f4297q = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, m101247a4);
                this.f4298r = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, m101247a5);
                this.f4299s = obtainStyledAttributes.getDimensionPixelSize(C6200R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, m101247a6);
                int i3 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i4 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i5 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i6 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i7 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C6200R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f4293m = m101247a;
            this.f4294n = m101247a2;
            this.f4295o = 0;
            this.f4296p = m101247a3;
            this.f4297q = m101247a4;
            this.f4298r = m101247a5;
            this.f4299s = m101247a6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f4292l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f4302v = sb2;
        this.f4303w = new Formatter(sb2, Locale.getDefault());
        this.f4304x = new Runnable() { // from class: com.applovin.exoplayer2.ui.k
            @Override // java.lang.Runnable
            public final void run() {
                C3947b.m101233b(C3947b.this);
            }
        };
        Drawable drawable2 = this.f4292l;
        if (drawable2 != null) {
            this.f4300t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f4300t = (Math.max(this.f4298r, Math.max(this.f4297q, this.f4299s)) + 1) / 2;
        }
        this.f4272G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f4271F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.applovin.exoplayer2.ui.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C3947b.m101239a(C3947b.this, valueAnimator2);
            }
        });
        this.f4276K = -9223372036854775807L;
        this.f4268C = -9223372036854775807L;
        this.f4267B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    private static int m101247a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    /* renamed from: b */
    private static int m101236b(float f, int i) {
        return (int) (i / f);
    }

    /* renamed from: a */
    public /* synthetic */ void m101250a() {
        m101238a(false);
    }

    /* renamed from: b */
    private void m101235b(long j) {
        this.f4275J = j;
        this.f4274I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f4305y.iterator();
        while (it.hasNext()) {
            ((InterfaceC3964i.InterfaceC3965a) it.next()).mo101103a(this, j);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m101244a(ValueAnimator valueAnimator) {
        this.f4272G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f4282a);
    }

    /* renamed from: c */
    private void m101232c() {
        Drawable drawable = this.f4292l;
        if (drawable != null && drawable.isStateful() && this.f4292l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    /* renamed from: a */
    public void mo101105a(InterfaceC3964i.InterfaceC3965a interfaceC3965a) {
        AbstractC4100b1.m100583a(interfaceC3965a);
        this.f4305y.add(interfaceC3965a);
    }

    @Override // com.applovin.exoplayer2.p132ui.InterfaceC3964i
    /* renamed from: a */
    public void mo101104a(long[] jArr, boolean[] zArr, int i) {
        AbstractC4100b1.m100580a(i == 0 || !(jArr == null || zArr == null));
        this.f4279N = i;
        this.f4280O = jArr;
        this.f4281P = zArr;
        m101237b();
    }

    /* renamed from: b */
    private void m101237b() {
        this.f4284c.set(this.f4283b);
        this.f4285d.set(this.f4283b);
        long j = this.f4274I ? this.f4275J : this.f4277L;
        if (this.f4276K > 0) {
            Rect rect = this.f4284c;
            Rect rect2 = this.f4283b;
            rect.right = Math.min(rect2.left + ((int) ((this.f4283b.width() * this.f4278M) / this.f4276K)), rect2.right);
            int width = (int) ((this.f4283b.width() * j) / this.f4276K);
            Rect rect3 = this.f4285d;
            Rect rect4 = this.f4283b;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f4284c;
            int i = this.f4283b.left;
            rect5.right = i;
            this.f4285d.right = i;
        }
        invalidate(this.f4282a);
    }

    /* renamed from: a */
    private void m101238a(boolean z) {
        removeCallbacks(this.f4304x);
        this.f4274I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f4305y.iterator();
        while (it.hasNext()) {
            ((InterfaceC3964i.InterfaceC3965a) it.next()).mo101102a(this, this.f4275J, z);
        }
    }

    /* renamed from: a */
    private boolean m101245a(long j) {
        long j2 = this.f4276K;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f4274I ? this.f4275J : this.f4277L;
        long m92990b = AbstractC5863xp.m92990b(j3 + j, 0L, j2);
        if (m92990b == j3) {
            return false;
        }
        if (!this.f4274I) {
            m101235b(m92990b);
        } else {
            m101231c(m92990b);
        }
        m101237b();
        return true;
    }

    /* renamed from: b */
    private void m101234b(Canvas canvas) {
        int min;
        int height = this.f4283b.height();
        int centerY = this.f4283b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f4276K <= 0) {
            Rect rect = this.f4283b;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f4288h);
            return;
        }
        Rect rect2 = this.f4284c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f4283b.left, i3), this.f4285d.right);
        int i4 = this.f4283b.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f4288h);
        }
        int max2 = Math.max(i2, this.f4285d.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f4287g);
        }
        if (this.f4285d.width() > 0) {
            Rect rect3 = this.f4285d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f4286f);
        }
        if (this.f4279N == 0) {
            return;
        }
        long[] jArr = (long[]) AbstractC4100b1.m100583a(this.f4280O);
        boolean[] zArr = (boolean[]) AbstractC4100b1.m100583a(this.f4281P);
        int i5 = this.f4296p / 2;
        for (int i6 = 0; i6 < this.f4279N; i6++) {
            long m92990b = AbstractC5863xp.m92990b(jArr[i6], 0L, this.f4276K);
            Rect rect4 = this.f4283b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f4296p, Math.max(0, ((int) ((this.f4283b.width() * m92990b) / this.f4276K)) - i5)), centerY, min + this.f4296p, i, zArr[i6] ? this.f4290j : this.f4289i);
        }
    }

    /* renamed from: a */
    private void m101249a(float f) {
        Rect rect = this.f4285d;
        Rect rect2 = this.f4283b;
        rect.right = AbstractC5863xp.m93039a((int) f, rect2.left, rect2.right);
    }

    /* renamed from: a */
    private Point m101240a(MotionEvent motionEvent) {
        this.f4306z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f4306z;
    }

    /* renamed from: a */
    private boolean m101248a(float f, float f2) {
        return this.f4282a.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private void m101243a(Canvas canvas) {
        int i;
        if (this.f4276K <= 0) {
            return;
        }
        Rect rect = this.f4285d;
        int m93039a = AbstractC5863xp.m93039a(rect.right, rect.left, this.f4283b.right);
        int centerY = this.f4285d.centerY();
        Drawable drawable = this.f4292l;
        if (drawable == null) {
            if (!this.f4274I && !isFocused()) {
                i = isEnabled() ? this.f4297q : this.f4298r;
            } else {
                i = this.f4299s;
            }
            canvas.drawCircle(m93039a, centerY, (int) ((i * this.f4272G) / 2.0f), this.f4291k);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f4272G)) / 2;
        int intrinsicHeight = ((int) (this.f4292l.getIntrinsicHeight() * this.f4272G)) / 2;
        this.f4292l.setBounds(m93039a - intrinsicWidth, centerY - intrinsicHeight, m93039a + intrinsicWidth, centerY + intrinsicHeight);
        this.f4292l.draw(canvas);
    }

    /* renamed from: a */
    private void m101246a(int i, int i2) {
        Rect rect = this.f4270E;
        if (rect != null && rect.width() == i && this.f4270E.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.f4270E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* renamed from: a */
    private boolean m101242a(Drawable drawable) {
        return AbstractC5863xp.f12151a >= 23 && m101241a(drawable, getLayoutDirection());
    }

    /* renamed from: a */
    private static boolean m101241a(Drawable drawable, int i) {
        return AbstractC5863xp.f12151a >= 23 && drawable.setLayoutDirection(i);
    }
}
