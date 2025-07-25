package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0154R;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p1042x9.BaseDivViewExtensions;
import p1059ya.NestedHorizontalScrollCompanion;
import p1072z8.C45188d;
import p1072z8.C45190f;
import p1072z8.C45192h;
import p1072z8.C45193i;
import p670fa.InputFocusTracker;
import p758k9.DivTypefaceProvider;
import p879s9.C39636q;
import sa.Log;

/* loaded from: classes8.dex */
public class BaseIndicatorTabLayout extends HorizontalScrollView {

    /* renamed from: I */
    private static final TimeInterpolator f76286I = new FastOutSlowInInterpolator();

    /* renamed from: J */
    private static final Pools.Pool<C29844e> f76287J = new Pools.SynchronizedPool(16);
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int UNDEFINED_COLOR = -1;
    public static final float UNDEFINED_RADIUS = -1.0f;

    /* renamed from: A */
    private ValueAnimator f76288A;

    /* renamed from: B */
    private ViewPager f76289B;

    /* renamed from: C */
    private PagerAdapter f76290C;

    /* renamed from: D */
    private DataSetObserver f76291D;

    /* renamed from: E */
    private C29845f f76292E;

    /* renamed from: F */
    private final TabTitleDelimitersController f76293F;
    @Nullable

    /* renamed from: G */
    private InputFocusTracker f76294G;
    @NonNull

    /* renamed from: H */
    private final Pools.Pool<TabView> f76295H;

    /* renamed from: b */
    private final ArrayList<C29844e> f76296b;

    /* renamed from: c */
    private C29844e f76297c;

    /* renamed from: d */
    private final OvalIndicators f76298d;

    /* renamed from: f */
    private int f76299f;

    /* renamed from: g */
    private int f76300g;

    /* renamed from: h */
    private int f76301h;

    /* renamed from: i */
    private int f76302i;

    /* renamed from: j */
    private long f76303j;

    /* renamed from: k */
    private int f76304k;

    /* renamed from: l */
    private DivTypefaceProvider f76305l;

    /* renamed from: m */
    private ColorStateList f76306m;

    /* renamed from: n */
    private boolean f76307n;

    /* renamed from: o */
    private int f76308o;

    /* renamed from: p */
    private final int f76309p;

    /* renamed from: q */
    private final int f76310q;

    /* renamed from: r */
    private final int f76311r;

    /* renamed from: s */
    private final boolean f76312s;

    /* renamed from: t */
    private final boolean f76313t;

    /* renamed from: u */
    private final int f76314u;

    /* renamed from: v */
    private final NestedHorizontalScrollCompanion f76315v;

    /* renamed from: w */
    private int f76316w;

    /* renamed from: x */
    private int f76317x;

    /* renamed from: y */
    private int f76318y;

    /* renamed from: z */
    private InterfaceC29842c f76319z;

    /* loaded from: classes8.dex */
    public static class OvalIndicators extends LinearLayout {

        /* renamed from: b */
        private int f76320b;

        /* renamed from: c */
        private final Paint f76321c;

        /* renamed from: d */
        private final Path f76322d;

        /* renamed from: f */
        private final RectF f76323f;

        /* renamed from: g */
        private final int f76324g;

        /* renamed from: h */
        private final int f76325h;

        /* renamed from: i */
        private boolean f76326i;

        /* renamed from: j */
        private float f76327j;

        /* renamed from: k */
        private int f76328k;

        /* renamed from: l */
        private EnumC29841b f76329l;
        protected float[] mCornerRadii;
        protected int mIndicatorHeight;
        protected int[] mIndicatorsLeft;
        protected int[] mIndicatorsRight;
        protected int mItemSpacing;
        protected float mOffset;
        protected int mSelectedColor;
        protected ValueAnimator mSelectedIndicatorAnimator;
        protected int mSelectedIndicatorLeft;
        protected int mSelectedIndicatorRight;
        protected int mSelectedPosition;
        protected int mUnselectedColor;

        /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$OvalIndicators$a */
        /* loaded from: classes8.dex */
        public class C29838a extends AnimatorListenerAdapter {

            /* renamed from: b */
            private boolean f76330b = false;

            C29838a() {
                OvalIndicators.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.f76330b = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!this.f76330b) {
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.f76328k;
                    OvalIndicators.this.mOffset = 0.0f;
                }
            }
        }

        /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$OvalIndicators$b */
        /* loaded from: classes8.dex */
        public class C29839b extends AnimatorListenerAdapter {

            /* renamed from: b */
            private boolean f76332b = false;

            C29839b() {
                OvalIndicators.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.f76332b = true;
                OvalIndicators.this.f76327j = 1.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!this.f76332b) {
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.f76328k;
                    OvalIndicators.this.mOffset = 0.0f;
                }
            }
        }

        /* synthetic */ OvalIndicators(Context context, int i, int i2, C29840a c29840a) {
            this(context, i, i2);
        }

        /* renamed from: h */
        private static float m36169h(float f, float f2, float f3) {
            if (f3 <= 0.0f || f2 <= 0.0f) {
                return 0.0f;
            }
            float min = Math.min(f3, f2) / 2.0f;
            if (f == -1.0f) {
                return min;
            }
            if (f > min) {
                Log.m11981b("BaseIndicatorTabLayout", "Corner radius is too big");
            }
            return Math.min(f, min);
        }

        /* renamed from: i */
        private void m36168i(Canvas canvas, int i, int i2, float f, int i3, float f2) {
            if (i >= 0 && i2 > i) {
                this.f76323f.set(i, this.f76324g, i2, f - this.f76325h);
                float width = this.f76323f.width();
                float height = this.f76323f.height();
                float[] fArr = new float[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    fArr[i4] = m36169h(this.mCornerRadii[i4], width, height);
                }
                this.f76322d.reset();
                this.f76322d.addRoundRect(this.f76323f, fArr, Path.Direction.CW);
                this.f76322d.close();
                this.f76321c.setColor(i3);
                this.f76321c.setAlpha(Math.round(this.f76321c.getAlpha() * f2));
                canvas.drawPath(this.f76322d, this.f76321c);
            }
        }

        /* renamed from: k */
        public int m36166k(int i) {
            if (this.f76326i && i != -1) {
                return i * 2;
            }
            return i;
        }

        /* renamed from: m */
        private void m36164m(int i) {
            this.f76320b = i;
            this.mIndicatorsLeft = new int[i];
            this.mIndicatorsRight = new int[i];
            for (int i2 = 0; i2 < this.f76320b; i2++) {
                this.mIndicatorsLeft[i2] = -1;
                this.mIndicatorsRight[i2] = -1;
            }
        }

        /* renamed from: n */
        private static boolean m36163n(@ColorInt int i) {
            if ((i >> 24) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        public /* synthetic */ void m36162o(ValueAnimator valueAnimator) {
            this.f76327j = 1.0f - valueAnimator.getAnimatedFraction();
            ViewCompat.postInvalidateOnAnimation(this);
        }

        /* renamed from: p */
        public /* synthetic */ void m36161p(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            setSelectedIndicatorPosition(m36160q(i, i2, animatedFraction), m36160q(i3, i4, animatedFraction));
            ViewCompat.postInvalidateOnAnimation(this);
        }

        /* renamed from: q */
        private static int m36160q(int i, int i2, float f) {
            return i + Math.round(f * (i2 - i));
        }

        /* renamed from: x */
        private ViewGroup.MarginLayoutParams m36153x(ViewGroup.LayoutParams layoutParams, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            return marginLayoutParams;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i < 0) {
                i = childCount;
            }
            if (i == 0) {
                if (childCount != 0) {
                    View childAt = getChildAt(0);
                    updateViewLayout(childAt, m36153x(childAt.getLayoutParams(), this.mItemSpacing));
                }
                super.addView(view, i, m36153x(layoutParams, 0));
                return;
            }
            super.addView(view, i, m36153x(layoutParams, this.mItemSpacing));
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float height = getHeight();
            if (this.mUnselectedColor != -1) {
                int i = this.f76320b;
                for (int i2 = 0; i2 < i; i2++) {
                    m36168i(canvas, this.mIndicatorsLeft[i2], this.mIndicatorsRight[i2], height, this.mUnselectedColor, 1.0f);
                }
            }
            if (this.mSelectedColor != -1) {
                int m36166k = m36166k(this.mSelectedPosition);
                int m36166k2 = m36166k(this.f76328k);
                int i3 = C29840a.f76334a[this.f76329l.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        m36168i(canvas, this.mIndicatorsLeft[m36166k], this.mIndicatorsRight[m36166k], height, this.mSelectedColor, 1.0f);
                    } else {
                        m36168i(canvas, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, height, this.mSelectedColor, 1.0f);
                    }
                } else {
                    m36168i(canvas, this.mIndicatorsLeft[m36166k], this.mIndicatorsRight[m36166k], height, this.mSelectedColor, this.f76327j);
                    if (this.f76328k != -1) {
                        m36168i(canvas, this.mIndicatorsLeft[m36166k2], this.mIndicatorsRight[m36166k2], height, this.mSelectedColor, 1.0f - this.f76327j);
                    }
                }
            }
            super.draw(canvas);
        }

        /* renamed from: f */
        void m36171f(int i, long j) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                j = Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * ((float) this.mSelectedIndicatorAnimator.getDuration()));
            }
            long j2 = j;
            View m36167j = m36167j(i);
            if (m36167j == null) {
                updateIndicatorsPosition();
                return;
            }
            int i2 = C29840a.f76334a[this.f76329l.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    m36151z(i, 0.0f);
                    return;
                } else {
                    startSelectedIndicatorSlideAnimation(i, j2, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, m36167j.getLeft(), m36167j.getRight());
                    return;
                }
            }
            startSelectedIndicatorFadeAnimation(i, j2);
        }

        /* renamed from: g */
        boolean m36170g() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        View m36167j(int i) {
            return getChildAt(m36166k(i));
        }

        /* renamed from: l */
        public boolean m36165l() {
            return this.f76326i;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateIndicatorsPosition();
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                m36171f(this.f76328k, Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * ((float) this.mSelectedIndicatorAnimator.getDuration())));
            }
        }

        /* renamed from: r */
        void m36159r(EnumC29841b enumC29841b) {
            if (this.f76329l != enumC29841b) {
                this.f76329l = enumC29841b;
                ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.mSelectedIndicatorAnimator.cancel();
                }
            }
        }

        /* renamed from: s */
        public void m36158s(boolean z) {
            if (this.f76326i != z) {
                this.f76326i = z;
                updateOpacity();
                updateIndicatorsPosition();
            }
        }

        protected void setSelectedIndicatorPosition(int i, int i2) {
            if (i != this.mSelectedIndicatorLeft || i2 != this.mSelectedIndicatorRight) {
                this.mSelectedIndicatorLeft = i;
                this.mSelectedIndicatorRight = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        protected void setUnselectedIndicatorPosition(int i, int i2, int i3) {
            int[] iArr = this.mIndicatorsLeft;
            int i4 = iArr[i];
            int[] iArr2 = this.mIndicatorsRight;
            int i5 = iArr2[i];
            if (i2 != i4 || i3 != i5) {
                iArr[i] = i2;
                iArr2[i] = i3;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        protected void startSelectedIndicatorFadeAnimation(int i, long j) {
            if (i != this.mSelectedPosition) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(BaseIndicatorTabLayout.f76286I);
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.k
                    {
                        BaseIndicatorTabLayout.OvalIndicators.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.this.m36162o(valueAnimator);
                    }
                });
                ofFloat.addListener(new C29839b());
                this.f76328k = i;
                this.mSelectedIndicatorAnimator = ofFloat;
                ofFloat.start();
            }
        }

        protected void startSelectedIndicatorSlideAnimation(int i, long j, final int i2, final int i3, final int i4, final int i5) {
            if (i2 != i4 || i3 != i5) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(BaseIndicatorTabLayout.f76286I);
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.j
                    {
                        BaseIndicatorTabLayout.OvalIndicators.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.this.m36161p(i2, i4, i3, i5, valueAnimator);
                    }
                });
                ofFloat.addListener(new C29838a());
                this.f76328k = i;
                this.mSelectedIndicatorAnimator = ofFloat;
                ofFloat.start();
            }
        }

        /* renamed from: t */
        void m36157t(@ColorInt int i) {
            if (this.mUnselectedColor != i) {
                if (m36163n(i)) {
                    this.mUnselectedColor = -1;
                } else {
                    this.mUnselectedColor = i;
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* renamed from: u */
        void m36156u(@NonNull float[] fArr) {
            if (!Arrays.equals(this.mCornerRadii, fArr)) {
                this.mCornerRadii = fArr;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        protected void updateIndicatorsPosition() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int childCount = getChildCount();
            if (childCount != this.f76320b) {
                m36164m(childCount);
            }
            int m36166k = m36166k(this.mSelectedPosition);
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt instanceof TabView) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        i2 = childAt.getRight();
                        if (this.f76329l == EnumC29841b.SLIDE && i6 == m36166k && this.mOffset > 0.0f && i6 < childCount - 1) {
                            if (this.f76326i) {
                                i5 = i6 + 2;
                            } else {
                                i5 = i6 + 1;
                            }
                            View childAt2 = getChildAt(i5);
                            float left2 = this.mOffset * childAt2.getLeft();
                            float f = this.mOffset;
                            i4 = (int) (left2 + ((1.0f - f) * left));
                            i3 = left;
                            i = (int) ((f * childAt2.getRight()) + ((1.0f - this.mOffset) * i2));
                        } else {
                            i3 = left;
                            i4 = i3;
                            i = i2;
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                        i3 = -1;
                        i4 = -1;
                    }
                    setUnselectedIndicatorPosition(i6, i3, i2);
                    if (i6 == m36166k) {
                        setSelectedIndicatorPosition(i4, i);
                    }
                }
            }
        }

        protected void updateOpacity() {
            float f = 1.0f - this.mOffset;
            if (f != this.f76327j) {
                this.f76327j = f;
                int i = this.mSelectedPosition + 1;
                if (i >= this.f76320b) {
                    i = -1;
                }
                this.f76328k = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* renamed from: v */
        void m36155v(int i) {
            if (this.mIndicatorHeight != i) {
                this.mIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* renamed from: w */
        void m36154w(int i) {
            if (i != this.mItemSpacing) {
                this.mItemSpacing = i;
                int childCount = getChildCount();
                for (int i2 = 1; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    updateViewLayout(childAt, m36153x(childAt.getLayoutParams(), this.mItemSpacing));
                }
            }
        }

        /* renamed from: y */
        void m36152y(@ColorInt int i) {
            if (this.mSelectedColor != i) {
                if (m36163n(i)) {
                    this.mSelectedColor = -1;
                } else {
                    this.mSelectedColor = i;
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* renamed from: z */
        void m36151z(int i, float f) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mOffset = f;
            updateIndicatorsPosition();
            updateOpacity();
        }

        private OvalIndicators(Context context, int i, int i2) {
            super(context);
            this.mSelectedColor = -1;
            this.mUnselectedColor = -1;
            this.mSelectedPosition = -1;
            this.mItemSpacing = 0;
            this.mSelectedIndicatorLeft = -1;
            this.mSelectedIndicatorRight = -1;
            this.f76327j = 1.0f;
            this.f76328k = -1;
            this.f76329l = EnumC29841b.SLIDE;
            setId(C45190f.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.f76320b = childCount;
            if (this.f76326i) {
                this.f76320b = (childCount + 1) / 2;
            }
            m36164m(this.f76320b);
            Paint paint = new Paint();
            this.f76321c = paint;
            paint.setAntiAlias(true);
            this.f76323f = new RectF();
            this.f76324g = i;
            this.f76325h = i2;
            this.f76322d = new Path();
            this.mCornerRadii = new float[8];
        }
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C29840a {

        /* renamed from: a */
        static final /* synthetic */ int[] f76334a;

        static {
            int[] iArr = new int[EnumC29841b.values().length];
            f76334a = iArr;
            try {
                iArr[EnumC29841b.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76334a[EnumC29841b.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$b */
    /* loaded from: classes8.dex */
    public enum EnumC29841b {
        SLIDE,
        FADE,
        NONE
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC29842c {
        /* renamed from: a */
        void mo36130a(C29844e c29844e);

        /* renamed from: b */
        void mo36129b(C29844e c29844e);

        /* renamed from: c */
        void mo36128c(C29844e c29844e);
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$d */
    /* loaded from: classes8.dex */
    public class C29843d extends DataSetObserver {
        private C29843d() {
            BaseIndicatorTabLayout.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout.this.m36184s();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout.this.m36184s();
        }

        /* synthetic */ C29843d(BaseIndicatorTabLayout baseIndicatorTabLayout, C29840a c29840a) {
            this();
        }
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$e */
    /* loaded from: classes8.dex */
    public static final class C29844e {
        @Nullable

        /* renamed from: a */
        private CharSequence f76340a;

        /* renamed from: b */
        private int f76341b;

        /* renamed from: c */
        private BaseIndicatorTabLayout f76342c;

        /* renamed from: d */
        private TabView f76343d;

        /* synthetic */ C29844e(C29840a c29840a) {
            this();
        }

        /* renamed from: i */
        public void m36141i() {
            this.f76342c = null;
            this.f76343d = null;
            this.f76340a = null;
            this.f76341b = -1;
        }

        /* renamed from: m */
        private void m36137m() {
            TabView tabView = this.f76343d;
            if (tabView != null) {
                tabView.m36118i();
            }
        }

        /* renamed from: f */
        public int m36144f() {
            return this.f76341b;
        }

        @Nullable
        /* renamed from: g */
        public TabView m36143g() {
            return this.f76343d;
        }

        @Nullable
        /* renamed from: h */
        public CharSequence m36142h() {
            return this.f76340a;
        }

        /* renamed from: j */
        public void m36140j() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f76342c;
            if (baseIndicatorTabLayout != null) {
                baseIndicatorTabLayout.m36182u(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        void m36139k(int i) {
            this.f76341b = i;
        }

        @NonNull
        /* renamed from: l */
        public C29844e m36138l(@Nullable CharSequence charSequence) {
            this.f76340a = charSequence;
            m36137m();
            return this;
        }

        private C29844e() {
            this.f76341b = -1;
        }
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$f */
    /* loaded from: classes8.dex */
    public static class C29845f implements ViewPager.OnPageChangeListener {

        /* renamed from: b */
        private final WeakReference<BaseIndicatorTabLayout> f76344b;

        /* renamed from: c */
        private int f76345c;

        /* renamed from: d */
        private int f76346d;

        C29845f(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.f76344b = new WeakReference<>(baseIndicatorTabLayout);
        }

        /* renamed from: a */
        public void m36136a() {
            this.f76346d = 0;
            this.f76345c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f76345c = this.f76346d;
            this.f76346d = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f76344b.get();
            if (baseIndicatorTabLayout != null) {
                if (this.f76346d == 2 && this.f76345c != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    baseIndicatorTabLayout.m36179x(i, f, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f76344b.get();
            if (baseIndicatorTabLayout != null && baseIndicatorTabLayout.getSelectedTabPosition() != i) {
                int i2 = this.f76346d;
                if (i2 != 0 && (i2 != 2 || this.f76345c != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                baseIndicatorTabLayout.m36181v(baseIndicatorTabLayout.getTabAt(i), z);
            }
        }
    }

    public BaseIndicatorTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m36203A(boolean z) {
        for (int i = 0; i < this.f76298d.getChildCount(); i++) {
            View childAt = this.f76298d.getChildAt(i);
            if (childAt instanceof TabView) {
                childAt.setMinimumWidth(getTabMinWidth());
                m36177z((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z) {
                    childAt.requestLayout();
                }
            }
        }
    }

    /* renamed from: f */
    private void m36197f(@NonNull TabItem tabItem) {
        C29844e newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.m36138l(charSequence);
        }
        addTab(newTab);
    }

    /* renamed from: g */
    private void m36196g(C29844e c29844e, int i, boolean z) {
        TabView tabView = c29844e.f76343d;
        int m36166k = this.f76298d.m36166k(i);
        this.f76298d.addView(tabView, m36166k, m36187p());
        this.f76293F.m36056e(m36166k);
        if (z) {
            tabView.setSelected(true);
        }
    }

    public int getTabMaxWidth() {
        return this.f76308o;
    }

    private int getTabMinWidth() {
        int i = this.f76309p;
        if (i != -1) {
            return i;
        }
        if (this.f76318y == 0) {
            return this.f76311r;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f76298d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m36195h(C29844e c29844e, boolean z) {
        TabView tabView = c29844e.f76343d;
        this.f76298d.addView(tabView, m36187p());
        this.f76293F.m36056e(this.f76298d.getChildCount() - 1);
        if (z) {
            tabView.setSelected(true);
        }
    }

    /* renamed from: i */
    private void m36194i(View view) {
        if (view instanceof TabItem) {
            m36197f((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: j */
    private void m36193j(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C39636q.m12015d(this) && !this.f76298d.m36170g()) {
            int scrollX = getScrollX();
            int m36191l = m36191l(i, 0.0f);
            if (scrollX != m36191l) {
                if (this.f76288A == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                    this.f76288A = ofInt;
                    ofInt.setInterpolator(f76286I);
                    this.f76288A.setDuration(this.f76303j);
                    this.f76288A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.g
                        {
                            BaseIndicatorTabLayout.this = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BaseIndicatorTabLayout.this.m36185r(valueAnimator);
                        }
                    });
                }
                this.f76288A.setIntValues(scrollX, m36191l);
                this.f76288A.start();
            }
            this.f76298d.m36171f(i, this.f76303j);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    /* renamed from: k */
    private void m36192k() {
        int i;
        int i2;
        if (this.f76318y == 0) {
            i = Math.max(0, this.f76316w - this.f76299f);
            i2 = Math.max(0, this.f76317x - this.f76301h);
        } else {
            i = 0;
            i2 = 0;
        }
        ViewCompat.setPaddingRelative(this.f76298d, i, 0, i2, 0);
        if (this.f76318y != 1) {
            this.f76298d.setGravity(GravityCompat.START);
        } else {
            this.f76298d.setGravity(1);
        }
        m36203A(true);
    }

    /* renamed from: l */
    private int m36191l(int i, float f) {
        View m36167j;
        View view;
        int left;
        int width;
        int i2 = 0;
        if (this.f76318y != 0 || (m36167j = this.f76298d.m36167j(i)) == null) {
            return 0;
        }
        int width2 = m36167j.getWidth();
        if (this.f76313t) {
            left = m36167j.getLeft();
            width = this.f76314u;
        } else {
            int i3 = i + 1;
            if (i3 < this.f76298d.getChildCount()) {
                view = this.f76298d.getChildAt(i3);
            } else {
                view = null;
            }
            if (view != null) {
                i2 = view.getWidth();
            }
            left = m36167j.getLeft() + ((int) ((width2 + i2) * f * 0.5f)) + (m36167j.getWidth() / 2);
            width = getWidth() / 2;
        }
        return left - width;
    }

    /* renamed from: m */
    private void m36190m(C29844e c29844e, int i) {
        c29844e.m36139k(i);
        this.f76296b.add(i, c29844e);
        int size = this.f76296b.size();
        while (true) {
            i++;
            if (i < size) {
                this.f76296b.get(i).m36139k(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    private void m36189n(@NonNull TabView tabView) {
        tabView.setTabPadding(this.f76299f, this.f76300g, this.f76301h, this.f76302i);
        tabView.m36120g(this.f76305l, this.f76304k);
        tabView.setInputFocusTracker(this.f76294G);
        tabView.setTextColorList(this.f76306m);
        tabView.setBoldTextOnSelection(this.f76307n);
        tabView.setEllipsizeEnabled(this.f76312s);
        tabView.setMaxWidthProvider(new TabView.InterfaceC29852a() { // from class: com.yandex.div.internal.widget.tabs.h
            {
                BaseIndicatorTabLayout.this = this;
            }

            @Override // com.yandex.div.internal.widget.tabs.TabView.InterfaceC29852a
            /* renamed from: a */
            public final int mo36053a() {
                int tabMaxWidth;
                tabMaxWidth = BaseIndicatorTabLayout.this.getTabMaxWidth();
                return tabMaxWidth;
            }
        });
        tabView.setOnUpdateListener(new TabView.InterfaceC29853b() { // from class: com.yandex.div.internal.widget.tabs.i
            {
                BaseIndicatorTabLayout.this = this;
            }

            @Override // com.yandex.div.internal.widget.tabs.TabView.InterfaceC29853b
            /* renamed from: a */
            public final void mo36073a(TabView tabView2) {
                BaseIndicatorTabLayout.this.onTabViewUpdated(tabView2);
            }
        });
    }

    /* renamed from: o */
    private static ColorStateList m36188o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: p */
    private LinearLayout.LayoutParams m36187p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m36177z(layoutParams);
        return layoutParams;
    }

    /* renamed from: q */
    private TabView m36186q(@NonNull C29844e c29844e) {
        TabView acquire = this.f76295H.acquire();
        if (acquire == null) {
            acquire = createTabView(getContext());
            m36189n(acquire);
            onTabViewCreated(acquire);
        }
        acquire.setTab(c29844e);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    /* renamed from: r */
    public /* synthetic */ void m36185r(ValueAnimator valueAnimator) {
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    /* renamed from: s */
    public void m36184s() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.f76290C;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().m36138l(this.f76290C.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f76289B;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                m36182u(getTabAt(currentItem));
                return;
            }
            return;
        }
        removeAllTabs();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f76298d.getChildCount();
        int m36166k = this.f76298d.m36166k(i);
        if (m36166k < childCount && !this.f76298d.getChildAt(m36166k).isSelected()) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f76298d.getChildAt(i2);
                if (i2 == m36166k) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: t */
    private void m36183t(int i) {
        TabView tabView = (TabView) this.f76298d.getChildAt(i);
        int m36166k = this.f76298d.m36166k(i);
        this.f76298d.removeViewAt(m36166k);
        this.f76293F.m36055f(m36166k);
        if (tabView != null) {
            tabView.m36121f();
            this.f76295H.release(tabView);
        }
        requestLayout();
    }

    /* renamed from: w */
    private void m36180w(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f76290C;
        if (pagerAdapter2 != null && (dataSetObserver = this.f76291D) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f76290C = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f76291D == null) {
                this.f76291D = new C29843d(this, null);
            }
            pagerAdapter.registerDataSetObserver(this.f76291D);
        }
        m36184s();
    }

    /* renamed from: x */
    public void m36179x(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0 && round < this.f76298d.getChildCount()) {
            if (z2) {
                this.f76298d.m36151z(i, f);
            }
            ValueAnimator valueAnimator = this.f76288A;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f76288A.cancel();
            }
            scrollTo(m36191l(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: y */
    private void m36178y() {
        int m36144f;
        C29844e c29844e = this.f76297c;
        if (c29844e == null || (m36144f = c29844e.m36144f()) == -1) {
            return;
        }
        setScrollPosition(m36144f, 0.0f, true);
    }

    /* renamed from: z */
    private void m36177z(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void addTab(@NonNull C29844e c29844e) {
        addTab(c29844e, this.f76296b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m36194i(view);
    }

    @NonNull
    @MainThread
    public void bindTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        this.f76305l = divTypefaceProvider;
    }

    protected TabView createTabView(@NonNull Context context) {
        return new TabView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f76315v.m993c(motionEvent);
        return dispatchTouchEvent;
    }

    @NonNull
    public C29845f getPageChangeListener() {
        if (this.f76292E == null) {
            this.f76292E = new C29845f(this);
        }
        return this.f76292E;
    }

    public int getSelectedTabPosition() {
        C29844e c29844e = this.f76297c;
        if (c29844e != null) {
            return c29844e.m36144f();
        }
        return -1;
    }

    @ColorInt
    public int getSelectedTabTextColor() {
        return this.f76306m.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    @Nullable
    public C29844e getTabAt(int i) {
        return this.f76296b.get(i);
    }

    public int getTabCount() {
        return this.f76296b.size();
    }

    public int getTabMode() {
        return this.f76318y;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f76306m;
    }

    @NonNull
    public C29844e newTab() {
        C29844e acquire = f76287J.acquire();
        if (acquire == null) {
            acquire = new C29844e(null);
        }
        acquire.f76342c = this;
        acquire.f76343d = m36186q(acquire);
        return acquire;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    protected void onMeasure(int i, int i2) {
        int m1858I = BaseDivViewExtensions.m1858I(44, getResources().getDisplayMetrics()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(m1858I, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(m1858I, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f76310q;
            if (i3 <= 0) {
                i3 = size - BaseDivViewExtensions.m1858I(56, getResources().getDisplayMetrics());
            }
            this.f76308o = i3;
        }
        super.onMeasure(i, i2);
        boolean z = true;
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f76318y == 1 ? childAt.getMeasuredWidth() == getMeasuredWidth() : childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                z = false;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.f76315v.m995a(z);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f76315v.m994b();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 && i3 != i) {
            m36178y();
        }
    }

    public void removeAllTabs() {
        for (int size = this.f76296b.size() - 1; size >= 0; size--) {
            m36183t(size);
        }
        Iterator<C29844e> it = this.f76296b.iterator();
        while (it.hasNext()) {
            C29844e next = it.next();
            it.remove();
            next.m36141i();
            f76287J.release(next);
        }
        this.f76297c = null;
    }

    public void removeTab(C29844e c29844e) {
        if (c29844e.f76342c == this) {
            removeTabAt(c29844e.m36144f());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        C29844e c29844e;
        C29844e c29844e2 = this.f76297c;
        if (c29844e2 != null) {
            i2 = c29844e2.m36144f();
        } else {
            i2 = 0;
        }
        m36183t(i);
        C29844e remove = this.f76296b.remove(i);
        if (remove != null) {
            remove.m36141i();
            f76287J.release(remove);
        }
        int size = this.f76296b.size();
        for (int i3 = i; i3 < size; i3++) {
            this.f76296b.get(i3).m36139k(i3);
        }
        if (i2 == i) {
            if (this.f76296b.isEmpty()) {
                c29844e = null;
            } else {
                c29844e = this.f76296b.get(Math.max(0, i - 1));
            }
            m36182u(c29844e);
        }
    }

    public void selectTab(int i) {
        C29844e tabAt;
        if (getSelectedTabPosition() != i && (tabAt = getTabAt(i)) != null) {
            tabAt.m36140j();
        }
    }

    public void setAnimationDuration(long j) {
        this.f76303j = j;
    }

    public void setAnimationType(EnumC29841b enumC29841b) {
        this.f76298d.m36159r(enumC29841b);
    }

    public void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.f76294G = inputFocusTracker;
    }

    public void setOnTabSelectedListener(InterfaceC29842c interfaceC29842c) {
        this.f76319z = interfaceC29842c;
    }

    public void setScrollPosition(int i, float f, boolean z) {
        m36179x(i, f, z, true);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f76298d.m36152y(i);
    }

    public void setTabBackgroundColor(@ColorInt int i) {
        this.f76298d.m36157t(i);
    }

    public void setTabDelimiter(Bitmap bitmap, int i, int i2) {
        this.f76293F.m36054g(bitmap, i, i2);
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        this.f76298d.m36156u(fArr);
    }

    public void setTabIndicatorHeight(int i) {
        this.f76298d.m36155v(i);
    }

    public void setTabItemSpacing(int i) {
        this.f76298d.m36154w(i);
    }

    public void setTabMode(int i) {
        if (i != this.f76318y) {
            this.f76318y = i;
            m36192k();
        }
    }

    public void setTabPaddings(int i, int i2, int i3, int i4) {
        this.f76299f = i;
        this.f76300g = i2;
        this.f76301h = i3;
        this.f76302i = i4;
        requestLayout();
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f76306m != colorStateList) {
            this.f76306m = colorStateList;
            int size = this.f76296b.size();
            for (int i = 0; i < size; i++) {
                TabView m36143g = this.f76296b.get(i).m36143g();
                if (m36143g != null) {
                    m36143g.setTextColorList(this.f76306m);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        for (int i = 0; i < this.f76296b.size(); i++) {
            this.f76296b.get(i).f76343d.setEnabled(z);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        C29845f c29845f;
        ViewPager viewPager2 = this.f76289B;
        if (viewPager2 != null && (c29845f = this.f76292E) != null) {
            viewPager2.removeOnPageChangeListener(c29845f);
        }
        if (viewPager != null) {
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                this.f76289B = viewPager;
                if (this.f76292E == null) {
                    this.f76292E = new C29845f(this);
                }
                this.f76292E.m36136a();
                viewPager.addOnPageChangeListener(this.f76292E);
                setOnTabSelectedListener(new C29846g(viewPager));
                m36180w(adapter, true);
                return;
            }
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f76289B = null;
        setOnTabSelectedListener(null);
        m36180w(null, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    void m36182u(C29844e c29844e) {
        m36181v(c29844e, true);
    }

    /* renamed from: v */
    void m36181v(C29844e c29844e, boolean z) {
        InterfaceC29842c interfaceC29842c;
        InterfaceC29842c interfaceC29842c2;
        int i;
        C29844e c29844e2 = this.f76297c;
        if (c29844e2 == c29844e) {
            if (c29844e2 != null) {
                InterfaceC29842c interfaceC29842c3 = this.f76319z;
                if (interfaceC29842c3 != null) {
                    interfaceC29842c3.mo36130a(c29844e2);
                }
                m36193j(c29844e.m36144f());
                return;
            }
            return;
        }
        if (z) {
            if (c29844e != null) {
                i = c29844e.m36144f();
            } else {
                i = -1;
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
            C29844e c29844e3 = this.f76297c;
            if ((c29844e3 == null || c29844e3.m36144f() == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                m36193j(i);
            }
        }
        C29844e c29844e4 = this.f76297c;
        if (c29844e4 != null && (interfaceC29842c2 = this.f76319z) != null) {
            interfaceC29842c2.mo36129b(c29844e4);
        }
        this.f76297c = c29844e;
        if (c29844e != null && (interfaceC29842c = this.f76319z) != null) {
            interfaceC29842c.mo36128c(c29844e);
        }
    }

    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addTab(@NonNull C29844e c29844e, int i) {
        addTab(c29844e, i, this.f76296b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m36194i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @SuppressLint({"PrivateResource"})
    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76296b = new ArrayList<>();
        this.f76303j = 300L;
        this.f76305l = DivTypefaceProvider.f98716b;
        this.f76308o = Integer.MAX_VALUE;
        this.f76315v = new NestedHorizontalScrollCompanion(this);
        this.f76295H = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45193i.TabLayout, i, C45192h.Div_Tabs_IndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C45193i.BaseIndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(C45193i.BaseIndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(C45193i.BaseIndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.f76307n = obtainStyledAttributes2.getBoolean(C45193i.BaseIndicatorTabLayout_tabTextBoldOnSelection, false);
        this.f76317x = obtainStyledAttributes2.getDimensionPixelSize(C45193i.BaseIndicatorTabLayout_tabContentEnd, 0);
        this.f76312s = obtainStyledAttributes2.getBoolean(C45193i.BaseIndicatorTabLayout_tabEllipsizeEnabled, true);
        this.f76313t = obtainStyledAttributes2.getBoolean(C45193i.BaseIndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.f76314u = obtainStyledAttributes2.getDimensionPixelSize(C45193i.BaseIndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2, null);
        this.f76298d = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        ovalIndicators.m36155v(obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabIndicatorHeight, 0));
        ovalIndicators.m36152y(obtainStyledAttributes.getColor(C45193i.TabLayout_tabIndicatorColor, 0));
        ovalIndicators.m36157t(obtainStyledAttributes.getColor(C45193i.TabLayout_tabBackground, 0));
        this.f76293F = new TabTitleDelimitersController(getContext(), ovalIndicators);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabPadding, 0);
        this.f76302i = dimensionPixelSize3;
        this.f76301h = dimensionPixelSize3;
        this.f76300g = dimensionPixelSize3;
        this.f76299f = dimensionPixelSize3;
        this.f76299f = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.f76300g = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabPaddingTop, this.f76300g);
        this.f76301h = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabPaddingEnd, this.f76301h);
        this.f76302i = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabPaddingBottom, this.f76302i);
        int resourceId = obtainStyledAttributes.getResourceId(C45193i.TabLayout_tabTextAppearance, C45192h.Div_Tabs_IndicatorTabLayout_Text);
        this.f76304k = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, C0154R.styleable.TextAppearance);
        try {
            this.f76306m = obtainStyledAttributes3.getColorStateList(C0154R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes3.recycle();
            int i2 = C45193i.TabLayout_tabTextColor;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f76306m = obtainStyledAttributes.getColorStateList(i2);
            }
            int i3 = C45193i.TabLayout_tabSelectedTextColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.f76306m = m36188o(this.f76306m.getDefaultColor(), obtainStyledAttributes.getColor(i3, 0));
            }
            this.f76309p = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabMinWidth, -1);
            this.f76310q = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabMaxWidth, -1);
            this.f76316w = obtainStyledAttributes.getDimensionPixelSize(C45193i.TabLayout_tabContentStart, 0);
            this.f76318y = obtainStyledAttributes.getInt(C45193i.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.f76311r = getResources().getDimensionPixelSize(C45188d.tab_scrollable_min_width);
            m36192k();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    public void addTab(@NonNull C29844e c29844e, boolean z) {
        if (c29844e.f76342c == this) {
            m36195h(c29844e, z);
            m36190m(c29844e, this.f76296b.size());
            if (z) {
                c29844e.m36140j();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m36194i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m36194i(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m36188o(i, i2));
    }

    public void addTab(@NonNull C29844e c29844e, int i, boolean z) {
        if (c29844e.f76342c == this) {
            m36196g(c29844e, i, z);
            m36190m(c29844e, i);
            if (z) {
                c29844e.m36140j();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$g */
    /* loaded from: classes8.dex */
    public static class C29846g implements InterfaceC29842c {

        /* renamed from: a */
        private final ViewPager f76347a;

        C29846g(ViewPager viewPager) {
            this.f76347a = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.InterfaceC29842c
        /* renamed from: c */
        public void mo36128c(C29844e c29844e) {
            this.f76347a.setCurrentItem(c29844e.m36144f());
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.InterfaceC29842c
        /* renamed from: a */
        public void mo36130a(C29844e c29844e) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.InterfaceC29842c
        /* renamed from: b */
        public void mo36129b(C29844e c29844e) {
        }
    }

    protected void onTabViewCreated(@NonNull TextView textView) {
    }

    public void onTabViewUpdated(@NonNull TextView textView) {
    }
}
