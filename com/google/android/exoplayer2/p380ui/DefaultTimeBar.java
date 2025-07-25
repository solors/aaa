package com.google.android.exoplayer2.p380ui;

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
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.p380ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
/* loaded from: classes4.dex */
public class DefaultTimeBar extends View implements TimeBar {
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;

    /* renamed from: A */
    private final Point f35250A;

    /* renamed from: B */
    private final float f35251B;

    /* renamed from: C */
    private int f35252C;

    /* renamed from: D */
    private long f35253D;

    /* renamed from: E */
    private int f35254E;

    /* renamed from: F */
    private Rect f35255F;

    /* renamed from: G */
    private ValueAnimator f35256G;

    /* renamed from: H */
    private float f35257H;

    /* renamed from: I */
    private boolean f35258I;

    /* renamed from: J */
    private boolean f35259J;

    /* renamed from: K */
    private long f35260K;

    /* renamed from: L */
    private long f35261L;

    /* renamed from: M */
    private long f35262M;

    /* renamed from: N */
    private long f35263N;

    /* renamed from: O */
    private int f35264O;
    @Nullable

    /* renamed from: P */
    private long[] f35265P;
    @Nullable

    /* renamed from: Q */
    private boolean[] f35266Q;

    /* renamed from: b */
    private final Rect f35267b;

    /* renamed from: c */
    private final Rect f35268c;

    /* renamed from: d */
    private final Rect f35269d;

    /* renamed from: f */
    private final Rect f35270f;

    /* renamed from: g */
    private final Paint f35271g;

    /* renamed from: h */
    private final Paint f35272h;

    /* renamed from: i */
    private final Paint f35273i;

    /* renamed from: j */
    private final Paint f35274j;

    /* renamed from: k */
    private final Paint f35275k;

    /* renamed from: l */
    private final Paint f35276l;
    @Nullable

    /* renamed from: m */
    private final Drawable f35277m;

    /* renamed from: n */
    private final int f35278n;

    /* renamed from: o */
    private final int f35279o;

    /* renamed from: p */
    private final int f35280p;

    /* renamed from: q */
    private final int f35281q;

    /* renamed from: r */
    private final int f35282r;

    /* renamed from: s */
    private final int f35283s;

    /* renamed from: t */
    private final int f35284t;

    /* renamed from: u */
    private final int f35285u;

    /* renamed from: v */
    private final int f35286v;

    /* renamed from: w */
    private final StringBuilder f35287w;

    /* renamed from: x */
    private final Formatter f35288x;

    /* renamed from: y */
    private final Runnable f35289y;

    /* renamed from: z */
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> f35290z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private static int m73166c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    /* renamed from: d */
    private void m73165d(Canvas canvas) {
        int i;
        if (this.f35261L <= 0) {
            return;
        }
        Rect rect = this.f35270f;
        int constrainValue = Util.constrainValue(rect.right, rect.left, this.f35268c.right);
        int centerY = this.f35270f.centerY();
        Drawable drawable = this.f35277m;
        if (drawable == null) {
            if (!this.f35259J && !isFocused()) {
                if (isEnabled()) {
                    i = this.f35282r;
                } else {
                    i = this.f35283s;
                }
            } else {
                i = this.f35284t;
            }
            canvas.drawCircle(constrainValue, centerY, (int) ((i * this.f35257H) / 2.0f), this.f35276l);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f35257H)) / 2;
        int intrinsicHeight = ((int) (this.f35277m.getIntrinsicHeight() * this.f35257H)) / 2;
        this.f35277m.setBounds(constrainValue - intrinsicWidth, centerY - intrinsicHeight, constrainValue + intrinsicWidth, centerY + intrinsicHeight);
        this.f35277m.draw(canvas);
    }

    /* renamed from: e */
    private void m73164e(Canvas canvas) {
        Paint paint;
        int height = this.f35268c.height();
        int centerY = this.f35268c.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f35261L <= 0) {
            Rect rect = this.f35268c;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f35273i);
            return;
        }
        Rect rect2 = this.f35269d;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f35268c.left, i3), this.f35270f.right);
        int i4 = this.f35268c.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f35273i);
        }
        int max2 = Math.max(i2, this.f35270f.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f35272h);
        }
        if (this.f35270f.width() > 0) {
            Rect rect3 = this.f35270f;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f35271g);
        }
        if (this.f35264O == 0) {
            return;
        }
        long[] jArr = (long[]) Assertions.checkNotNull(this.f35265P);
        boolean[] zArr = (boolean[]) Assertions.checkNotNull(this.f35266Q);
        int i5 = this.f35281q / 2;
        for (int i6 = 0; i6 < this.f35264O; i6++) {
            long constrainValue = Util.constrainValue(jArr[i6], 0L, this.f35261L);
            Rect rect4 = this.f35268c;
            int min = rect4.left + Math.min(rect4.width() - this.f35281q, Math.max(0, ((int) ((this.f35268c.width() * constrainValue) / this.f35261L)) - i5));
            if (zArr[i6]) {
                paint = this.f35275k;
            } else {
                paint = this.f35274j;
            }
            canvas.drawRect(min, centerY, min + this.f35281q, i, paint);
        }
    }

    /* renamed from: f */
    private boolean m73163f(float f, float f2) {
        return this.f35267b.contains((int) f, (int) f2);
    }

    /* renamed from: g */
    public /* synthetic */ void m73162g() {
        m73152q(false);
    }

    private long getPositionIncrement() {
        long j = this.f35253D;
        if (j == -9223372036854775807L) {
            long j2 = this.f35261L;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.f35252C;
        }
        return j;
    }

    private String getProgressText() {
        return Util.getStringForTime(this.f35287w, this.f35288x, this.f35262M);
    }

    private long getScrubberPosition() {
        if (this.f35268c.width() > 0 && this.f35261L != -9223372036854775807L) {
            return (this.f35270f.width() * this.f35261L) / this.f35268c.width();
        }
        return 0L;
    }

    /* renamed from: h */
    public /* synthetic */ void m73161h(ValueAnimator valueAnimator) {
        this.f35257H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f35267b);
    }

    /* renamed from: i */
    private void m73160i(float f) {
        Rect rect = this.f35270f;
        Rect rect2 = this.f35268c;
        rect.right = Util.constrainValue((int) f, rect2.left, rect2.right);
    }

    /* renamed from: j */
    private static int m73159j(float f, int i) {
        return (int) (i / f);
    }

    /* renamed from: k */
    private Point m73158k(MotionEvent motionEvent) {
        this.f35250A.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f35250A;
    }

    /* renamed from: l */
    private boolean m73157l(long j) {
        long j2;
        long j3 = this.f35261L;
        if (j3 <= 0) {
            return false;
        }
        if (this.f35259J) {
            j2 = this.f35260K;
        } else {
            j2 = this.f35262M;
        }
        long j4 = j2;
        long constrainValue = Util.constrainValue(j4 + j, 0L, j3);
        if (constrainValue == j4) {
            return false;
        }
        if (!this.f35259J) {
            m73153p(constrainValue);
        } else {
            m73149t(constrainValue);
        }
        m73151r();
        return true;
    }

    /* renamed from: m */
    private boolean m73156m(Drawable drawable) {
        if (Util.SDK_INT >= 23 && m73155n(drawable, getLayoutDirection())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m73155n(Drawable drawable, int i) {
        if (Util.SDK_INT >= 23 && drawable.setLayoutDirection(i)) {
            return true;
        }
        return false;
    }

    @RequiresApi(29)
    /* renamed from: o */
    private void m73154o(int i, int i2) {
        Rect rect = this.f35255F;
        if (rect != null && rect.width() == i && this.f35255F.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.f35255F = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* renamed from: p */
    private void m73153p(long j) {
        this.f35260K = j;
        this.f35259J = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.f35290z.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    /* renamed from: q */
    private void m73152q(boolean z) {
        removeCallbacks(this.f35289y);
        this.f35259J = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.f35290z.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f35260K, z);
        }
    }

    /* renamed from: r */
    private void m73151r() {
        long j;
        this.f35269d.set(this.f35268c);
        this.f35270f.set(this.f35268c);
        if (this.f35259J) {
            j = this.f35260K;
        } else {
            j = this.f35262M;
        }
        if (this.f35261L > 0) {
            Rect rect = this.f35269d;
            Rect rect2 = this.f35268c;
            rect.right = Math.min(rect2.left + ((int) ((this.f35268c.width() * this.f35263N) / this.f35261L)), rect2.right);
            int width = (int) ((this.f35268c.width() * j) / this.f35261L);
            Rect rect3 = this.f35270f;
            Rect rect4 = this.f35268c;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f35269d;
            int i = this.f35268c.left;
            rect5.right = i;
            this.f35270f.right = i;
        }
        invalidate(this.f35267b);
    }

    /* renamed from: s */
    private void m73150s() {
        Drawable drawable = this.f35277m;
        if (drawable != null && drawable.isStateful() && this.f35277m.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: t */
    private void m73149t(long j) {
        if (this.f35260K == j) {
            return;
        }
        this.f35260K = j;
        Iterator<TimeBar.OnScrubListener> it = this.f35290z.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        Assertions.checkNotNull(onScrubListener);
        this.f35290z.add(onScrubListener);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m73150s();
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public long getPreferredUpdateDelay() {
        int m73159j = m73159j(this.f35251B, this.f35268c.width());
        if (m73159j != 0) {
            long j = this.f35261L;
            if (j != 0 && j != -9223372036854775807L) {
                return j / m73159j;
            }
        }
        return Long.MAX_VALUE;
    }

    public void hideScrubber(boolean z) {
        if (this.f35256G.isStarted()) {
            this.f35256G.cancel();
        }
        this.f35258I = z;
        this.f35257H = 0.0f;
        invalidate(this.f35267b);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35277m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m73164e(canvas);
        m73165d(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f35259J && !z) {
            m73152q(false);
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
        if (this.f35261L <= 0) {
            return;
        }
        if (Util.SDK_INT >= 21) {
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
            boolean r0 = r4.m73157l(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f35289y
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f35289y
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f35259J
            if (r0 == 0) goto L30
            r5 = 0
            r4.m73152q(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p380ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
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
        if (this.f35258I) {
            i5 = 0;
        } else {
            i5 = this.f35285u;
        }
        if (this.f35280p == 1) {
            i6 = (i9 - getPaddingBottom()) - this.f35279o;
            int i10 = this.f35278n;
            i7 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i6 = (i9 - this.f35279o) / 2;
            i7 = (i9 - this.f35278n) / 2;
        }
        this.f35267b.set(paddingLeft, i6, paddingRight, this.f35279o + i6);
        Rect rect = this.f35268c;
        Rect rect2 = this.f35267b;
        rect.set(rect2.left + i5, i7, rect2.right - i5, this.f35278n + i7);
        if (Util.SDK_INT >= 29) {
            m73154o(i8, i9);
        }
        m73151r();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f35279o;
        } else if (mode != 1073741824) {
            size = Math.min(this.f35279o, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m73150s();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f35277m;
        if (drawable != null && m73155n(drawable, i)) {
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
            long r2 = r7.f35261L
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m73158k(r8)
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
            boolean r8 = r7.f35259J
            if (r8 == 0) goto L76
            int r8 = r7.f35286v
            if (r0 >= r8) goto L3a
            int r8 = r7.f35254E
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m73160i(r8)
            goto L40
        L3a:
            r7.f35254E = r2
            float r8 = (float) r2
            r7.m73160i(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.m73149t(r0)
            r7.m73151r()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f35259J
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.m73152q(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m73163f(r8, r0)
            if (r0 == 0) goto L76
            r7.m73160i(r8)
            long r0 = r7.getScrubberPosition()
            r7.m73153p(r0)
            r7.m73151r()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p380ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f35261L <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m73157l(-getPositionIncrement())) {
                m73152q(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m73157l(getPositionIncrement())) {
                m73152q(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.f35290z.remove(onScrubListener);
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        boolean z;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkArgument(z);
        this.f35264O = i;
        this.f35265P = jArr;
        this.f35266Q = zArr;
        m73151r();
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f35274j.setColor(i);
        invalidate(this.f35267b);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f35272h.setColor(i);
        invalidate(this.f35267b);
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setBufferedPosition(long j) {
        if (this.f35263N == j) {
            return;
        }
        this.f35263N = j;
        m73151r();
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setDuration(long j) {
        if (this.f35261L == j) {
            return;
        }
        this.f35261L = j;
        if (this.f35259J && j == -9223372036854775807L) {
            m73152q(true);
        }
        m73151r();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p380ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f35259J && !z) {
            m73152q(true);
        }
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f35252C = i;
        this.f35253D = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f35252C = -1;
        this.f35253D = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f35275k.setColor(i);
        invalidate(this.f35267b);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f35271g.setColor(i);
        invalidate(this.f35267b);
    }

    @Override // com.google.android.exoplayer2.p380ui.TimeBar
    public void setPosition(long j) {
        if (this.f35262M == j) {
            return;
        }
        this.f35262M = j;
        setContentDescription(getProgressText());
        m73151r();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f35276l.setColor(i);
        invalidate(this.f35267b);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f35273i.setColor(i);
        invalidate(this.f35267b);
    }

    public void showScrubber() {
        if (this.f35256G.isStarted()) {
            this.f35256G.cancel();
        }
        this.f35258I = false;
        this.f35257H = 1.0f;
        invalidate(this.f35267b);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f35267b = new Rect();
        this.f35268c = new Rect();
        this.f35269d = new Rect();
        this.f35270f = new Rect();
        Paint paint = new Paint();
        this.f35271g = paint;
        Paint paint2 = new Paint();
        this.f35272h = paint2;
        Paint paint3 = new Paint();
        this.f35273i = paint3;
        Paint paint4 = new Paint();
        this.f35274j = paint4;
        Paint paint5 = new Paint();
        this.f35275k = paint5;
        Paint paint6 = new Paint();
        this.f35276l = paint6;
        paint6.setAntiAlias(true);
        this.f35290z = new CopyOnWriteArraySet<>();
        this.f35250A = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f35251B = f;
        this.f35286v = m73166c(f, -50);
        int m73166c = m73166c(f, 4);
        int m73166c2 = m73166c(f, 26);
        int m73166c3 = m73166c(f, 4);
        int m73166c4 = m73166c(f, 12);
        int m73166c5 = m73166c(f, 0);
        int m73166c6 = m73166c(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C16096R.styleable.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C16096R.styleable.DefaultTimeBar_scrubber_drawable);
                this.f35277m = drawable;
                if (drawable != null) {
                    m73156m(drawable);
                    m73166c2 = Math.max(drawable.getMinimumHeight(), m73166c2);
                }
                this.f35278n = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_bar_height, m73166c);
                this.f35279o = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_touch_target_height, m73166c2);
                this.f35280p = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.f35281q = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_ad_marker_width, m73166c3);
                this.f35282r = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_scrubber_enabled_size, m73166c4);
                this.f35283s = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_scrubber_disabled_size, m73166c5);
                this.f35284t = obtainStyledAttributes.getDimensionPixelSize(C16096R.styleable.DefaultTimeBar_scrubber_dragged_size, m73166c6);
                int i3 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_played_color, -1);
                int i4 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i5 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_buffered_color, -855638017);
                int i6 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_unplayed_color, 872415231);
                int i7 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_ad_marker_color, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C16096R.styleable.DefaultTimeBar_played_ad_marker_color, 872414976);
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
            this.f35278n = m73166c;
            this.f35279o = m73166c2;
            this.f35280p = 0;
            this.f35281q = m73166c3;
            this.f35282r = m73166c4;
            this.f35283s = m73166c5;
            this.f35284t = m73166c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f35277m = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f35287w = sb2;
        this.f35288x = new Formatter(sb2, Locale.getDefault());
        this.f35289y = new Runnable() { // from class: com.google.android.exoplayer2.ui.a
            {
                DefaultTimeBar.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.m73162g();
            }
        };
        Drawable drawable2 = this.f35277m;
        if (drawable2 != null) {
            this.f35285u = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f35285u = (Math.max(this.f35283s, Math.max(this.f35282r, this.f35284t)) + 1) / 2;
        }
        this.f35257H = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f35256G = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.b
            {
                DefaultTimeBar.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.this.m73161h(valueAnimator2);
            }
        });
        this.f35261L = -9223372036854775807L;
        this.f35253D = -9223372036854775807L;
        this.f35252C = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long j) {
        if (this.f35256G.isStarted()) {
            this.f35256G.cancel();
        }
        this.f35256G.setFloatValues(this.f35257H, 0.0f);
        this.f35256G.setDuration(j);
        this.f35256G.start();
    }

    public void showScrubber(long j) {
        if (this.f35256G.isStarted()) {
            this.f35256G.cancel();
        }
        this.f35258I = false;
        this.f35256G.setFloatValues(this.f35257H, 1.0f);
        this.f35256G.setDuration(j);
        this.f35256G.start();
    }
}
