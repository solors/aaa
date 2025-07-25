package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.C16310R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
/* loaded from: classes5.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    /* renamed from: A */
    int f38419A;

    /* renamed from: B */
    int f38420B;

    /* renamed from: C */
    boolean f38421C;

    /* renamed from: D */
    boolean f38422D;

    /* renamed from: E */
    int f38423E;

    /* renamed from: F */
    int f38424F;

    /* renamed from: G */
    boolean f38425G;

    /* renamed from: H */
    private TabIndicatorInterpolator f38426H;
    @Nullable

    /* renamed from: I */
    private BaseOnTabSelectedListener f38427I;

    /* renamed from: J */
    private final ArrayList<BaseOnTabSelectedListener> f38428J;
    @Nullable

    /* renamed from: K */
    private BaseOnTabSelectedListener f38429K;

    /* renamed from: L */
    private ValueAnimator f38430L;
    @Nullable

    /* renamed from: M */
    ViewPager f38431M;
    @Nullable

    /* renamed from: N */
    private PagerAdapter f38432N;

    /* renamed from: O */
    private DataSetObserver f38433O;

    /* renamed from: P */
    private TabLayoutOnPageChangeListener f38434P;

    /* renamed from: Q */
    private AdapterChangeListener f38435Q;

    /* renamed from: R */
    private boolean f38436R;

    /* renamed from: S */
    private final Pools.Pool<TabView> f38437S;

    /* renamed from: b */
    private final ArrayList<Tab> f38438b;
    @Nullable

    /* renamed from: c */
    private Tab f38439c;
    @NonNull

    /* renamed from: d */
    final SlidingTabIndicator f38440d;

    /* renamed from: f */
    int f38441f;

    /* renamed from: g */
    int f38442g;

    /* renamed from: h */
    int f38443h;

    /* renamed from: i */
    int f38444i;

    /* renamed from: j */
    int f38445j;

    /* renamed from: k */
    ColorStateList f38446k;

    /* renamed from: l */
    ColorStateList f38447l;

    /* renamed from: m */
    ColorStateList f38448m;
    @NonNull

    /* renamed from: n */
    Drawable f38449n;

    /* renamed from: o */
    private int f38450o;

    /* renamed from: p */
    PorterDuff.Mode f38451p;

    /* renamed from: q */
    float f38452q;

    /* renamed from: r */
    float f38453r;

    /* renamed from: s */
    final int f38454s;

    /* renamed from: t */
    int f38455t;

    /* renamed from: u */
    private final int f38456u;

    /* renamed from: v */
    private final int f38457v;

    /* renamed from: w */
    private final int f38458w;

    /* renamed from: x */
    private int f38459x;

    /* renamed from: y */
    int f38460y;

    /* renamed from: z */
    int f38461z;

    /* renamed from: T */
    private static final int f38417T = C16310R.C16317style.Widget_Design_TabLayout;

    /* renamed from: U */
    private static final Pools.Pool<Tab> f38418U = new Pools.SynchronizedPool(16);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* renamed from: b */
        private boolean f38463b;

        AdapterChangeListener() {
        }

        /* renamed from: a */
        void m70800a(boolean z) {
            this.f38463b = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f38431M == viewPager) {
                tabLayout.m70805t(pagerAdapter2, this.f38463b);
            }
        }
    }

    @Deprecated
    /* loaded from: classes5.dex */
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    /* loaded from: classes5.dex */
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface Mode {
    }

    /* loaded from: classes5.dex */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m70807r();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m70807r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class SlidingTabIndicator extends LinearLayout {

        /* renamed from: b */
        ValueAnimator f38466b;

        /* renamed from: c */
        private int f38467c;

        SlidingTabIndicator(Context context) {
            super(context);
            this.f38467c = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m70795e() {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.f38426H;
            TabLayout tabLayout = TabLayout.this;
            tabIndicatorInterpolator.m70826c(tabLayout, childAt, tabLayout.f38449n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m70792h(View view, View view2, float f) {
            boolean z;
            if (view != null && view.getWidth() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.f38426H;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.mo70825d(tabLayout, view, view2, f, tabLayout.f38449n);
            } else {
                Drawable drawable = TabLayout.this.f38449n;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f38449n.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        /* renamed from: i */
        private void m70791i(boolean z, int i, int i2) {
            final View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m70795e();
                return;
            }
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.m70792h(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f38466b = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.start();
                return;
            }
            this.f38466b.removeAllUpdateListeners();
            this.f38466b.addUpdateListener(animatorUpdateListener);
        }

        /* renamed from: c */
        void m70797c(int i, int i2) {
            ValueAnimator valueAnimator = this.f38466b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f38466b.cancel();
            }
            m70791i(true, i, i2);
        }

        /* renamed from: d */
        boolean m70796d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f38449n.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f38449n.getIntrinsicHeight();
            }
            int i = TabLayout.this.f38419A;
            if (i != 0) {
                if (i != 1) {
                    height = 0;
                    if (i != 2) {
                        if (i != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.f38449n.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f38449n.getBounds();
                TabLayout.this.f38449n.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f38449n.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: f */
        void m70794f(int i, float f) {
            ValueAnimator valueAnimator = this.f38466b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f38466b.cancel();
            }
            m70792h(getChildAt(i), getChildAt(i + 1), f);
        }

        /* renamed from: g */
        void m70793g(int i) {
            Rect bounds = TabLayout.this.f38449n.getBounds();
            TabLayout.this.f38449n.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f38466b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m70791i(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                m70795e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f38460y == 1 || tabLayout.f38420B == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f38460y = 0;
                    tabLayout2.m70801x(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface TabIndicatorGravity {
    }

    /* loaded from: classes5.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @NonNull

        /* renamed from: b */
        private final WeakReference<TabLayout> f38480b;

        /* renamed from: c */
        private int f38481c;

        /* renamed from: d */
        private int f38482d;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f38480b = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        void m70783a() {
            this.f38482d = 0;
            this.f38481c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f38481c = this.f38482d;
            this.f38482d = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f38480b.get();
            if (tabLayout != null) {
                int i3 = this.f38482d;
                boolean z2 = false;
                if (i3 == 2 && this.f38481c != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 != 2 || this.f38481c != 0) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f38480b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f38482d;
                if (i2 != 0 && (i2 != 2 || this.f38481c != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: b */
        private Tab f38483b;

        /* renamed from: c */
        private TextView f38484c;

        /* renamed from: d */
        private ImageView f38485d;
        @Nullable

        /* renamed from: f */
        private View f38486f;
        @Nullable

        /* renamed from: g */
        private BadgeDrawable f38487g;
        @Nullable

        /* renamed from: h */
        private View f38488h;
        @Nullable

        /* renamed from: i */
        private TextView f38489i;
        @Nullable

        /* renamed from: j */
        private ImageView f38490j;
        @Nullable

        /* renamed from: k */
        private Drawable f38491k;

        /* renamed from: l */
        private int f38492l;

        public TabView(@NonNull Context context) {
            super(context);
            this.f38492l = 2;
            m70757y(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.f38441f, TabLayout.this.f38442g, TabLayout.this.f38443h, TabLayout.this.f38444i);
            setGravity(17);
            setOrientation(!TabLayout.this.f38421C ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* renamed from: A */
        private void m70782A(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            Tab tab = this.f38483b;
            CharSequence charSequence2 = null;
            if (tab != null && tab.getIcon() != null) {
                drawable = DrawableCompat.wrap(this.f38483b.getIcon()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, TabLayout.this.f38447l);
                PorterDuff.Mode mode = TabLayout.this.f38451p;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawable, mode);
                }
            }
            Tab tab2 = this.f38483b;
            if (tab2 != null) {
                charSequence = tab2.getText();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f38483b.f38478g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = (int) ViewUtils.dpToPx(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.f38421C) {
                    if (i != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f38483b;
            if (tab3 != null) {
                charSequence2 = tab3.f38475d;
            }
            if (!z) {
                charSequence = charSequence2;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.f38487g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.f38487g == null) {
                this.f38487g = BadgeDrawable.create(getContext());
            }
            m70760v();
            BadgeDrawable badgeDrawable = this.f38487g;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: i */
        private void m70773i(@Nullable final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        TabView.this.m70759w(view);
                    }
                }
            });
        }

        /* renamed from: j */
        private float m70772j(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: k */
        private void m70771k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @NonNull
        /* renamed from: l */
        private FrameLayout m70770l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public void m70769m(@NonNull Canvas canvas) {
            Drawable drawable = this.f38491k;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f38491k.draw(canvas);
            }
        }

        @Nullable
        /* renamed from: n */
        private FrameLayout m70768n(@NonNull View view) {
            if ((view != this.f38485d && view != this.f38484c) || !BadgeUtils.USE_COMPAT_PARENT) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public boolean m70767o() {
            if (this.f38487g != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        private void m70766p() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = m70770l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C16310R.C16315layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f38485d = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        private void m70765q() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = m70770l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C16310R.C16315layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f38484c = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m70764r() {
            if (this.f38486f != null) {
                m70761u();
            }
            this.f38487g = null;
        }

        /* renamed from: t */
        private void m70762t(@Nullable View view) {
            if (m70767o() && view != null) {
                m70771k(false);
                BadgeUtils.attachBadgeDrawable(this.f38487g, view, m70768n(view));
                this.f38486f = view;
            }
        }

        /* renamed from: u */
        private void m70761u() {
            if (!m70767o()) {
                return;
            }
            m70771k(true);
            View view = this.f38486f;
            if (view != null) {
                BadgeUtils.detachBadgeDrawable(this.f38487g, view);
                this.f38486f = null;
            }
        }

        /* renamed from: v */
        private void m70760v() {
            Tab tab;
            Tab tab2;
            if (!m70767o()) {
                return;
            }
            if (this.f38488h != null) {
                m70761u();
            } else if (this.f38485d != null && (tab2 = this.f38483b) != null && tab2.getIcon() != null) {
                View view = this.f38486f;
                ImageView imageView = this.f38485d;
                if (view != imageView) {
                    m70761u();
                    m70762t(this.f38485d);
                    return;
                }
                m70759w(imageView);
            } else if (this.f38484c != null && (tab = this.f38483b) != null && tab.getTabLabelVisibility() == 1) {
                View view2 = this.f38486f;
                TextView textView = this.f38484c;
                if (view2 != textView) {
                    m70761u();
                    m70762t(this.f38484c);
                    return;
                }
                m70759w(textView);
            } else {
                m70761u();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public void m70759w(@NonNull View view) {
            if (m70767o() && view == this.f38486f) {
                BadgeUtils.setBadgeDrawableBounds(this.f38487g, view, m70768n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: y */
        public void m70757y(Context context) {
            int i = TabLayout.this.f38454s;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i);
                this.f38491k = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f38491k.setState(getDrawableState());
                }
            } else {
                this.f38491k = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f38448m != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.f38448m);
                boolean z = TabLayout.this.f38425G;
                if (z) {
                    gradientDrawable2 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(convertToRippleDrawableColor, gradientDrawable2, gradientDrawable);
            }
            ViewCompat.setBackground(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f38491k;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f38491k.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f38484c, this.f38485d, this.f38488h};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f38484c, this.f38485d, this.f38488h};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        @Nullable
        public Tab getTab() {
            return this.f38483b;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f38487g;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f38487g.getContentDescription()));
            }
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f38483b.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(C16310R.C16316string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f38455t, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f38484c != null) {
                float f = TabLayout.this.f38452q;
                int i3 = this.f38492l;
                ImageView imageView = this.f38485d;
                boolean z = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.f38484c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f38453r;
                    }
                }
                float textSize = this.f38484c.getTextSize();
                int lineCount = this.f38484c.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f38484c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f38420B == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f38484c.getLayout()) == null || m70772j(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f38484c.setTextSize(0, f);
                        this.f38484c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f38483b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f38483b.select();
                return true;
            }
            return performClick;
        }

        /* renamed from: s */
        void m70763s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f38484c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f38485d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f38488h;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(@Nullable Tab tab) {
            if (tab != this.f38483b) {
                this.f38483b = tab;
                m70758x();
            }
        }

        /* renamed from: x */
        final void m70758x() {
            View view;
            boolean z;
            Tab tab = this.f38483b;
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f38488h = view;
                TextView textView = this.f38484c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f38485d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f38485d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f38489i = textView2;
                if (textView2 != null) {
                    this.f38492l = TextViewCompat.getMaxLines(textView2);
                }
                this.f38490j = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f38488h;
                if (view2 != null) {
                    removeView(view2);
                    this.f38488h = null;
                }
                this.f38489i = null;
                this.f38490j = null;
            }
            if (this.f38488h == null) {
                if (this.f38485d == null) {
                    m70766p();
                }
                if (this.f38484c == null) {
                    m70765q();
                    this.f38492l = TextViewCompat.getMaxLines(this.f38484c);
                }
                TextViewCompat.setTextAppearance(this.f38484c, TabLayout.this.f38445j);
                ColorStateList colorStateList = TabLayout.this.f38446k;
                if (colorStateList != null) {
                    this.f38484c.setTextColor(colorStateList);
                }
                m70782A(this.f38484c, this.f38485d);
                m70760v();
                m70773i(this.f38485d);
                m70773i(this.f38484c);
            } else {
                TextView textView3 = this.f38489i;
                if (textView3 != null || this.f38490j != null) {
                    m70782A(textView3, this.f38490j);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.f38475d)) {
                setContentDescription(tab.f38475d);
            }
            if (tab != null && tab.isSelected()) {
                z = true;
            } else {
                z = false;
            }
            setSelected(z);
        }

        /* renamed from: z */
        final void m70756z() {
            setOrientation(!TabLayout.this.f38421C ? 1 : 0);
            TextView textView = this.f38489i;
            if (textView == null && this.f38490j == null) {
                m70782A(this.f38484c, this.f38485d);
            } else {
                m70782A(textView, this.f38490j);
            }
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m70823b(@NonNull TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.setIcon(drawable);
        }
        int i = tabItem.customLayout;
        if (i != 0) {
            newTab.setCustomView(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    /* renamed from: c */
    private void m70822c(@NonNull Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f38440d.addView(tabView, tab.getPosition(), m70814k());
    }

    /* renamed from: d */
    private void m70821d(View view) {
        if (view instanceof TabItem) {
            m70823b((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: e */
    private void m70820e(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && !this.f38440d.m70796d()) {
            int scrollX = getScrollX();
            int m70817h = m70817h(i, 0.0f);
            if (scrollX != m70817h) {
                m70809p();
                this.f38430L.setIntValues(scrollX, m70817h);
                this.f38430L.start();
            }
            this.f38440d.m70797c(i, this.f38461z);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    /* renamed from: f */
    private void m70819f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.f38440d.setGravity(1);
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.f38440d.setGravity(GravityCompat.START);
    }

    /* renamed from: g */
    private void m70818g() {
        int max;
        int i = this.f38420B;
        if (i != 0 && i != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f38459x - this.f38441f);
        }
        ViewCompat.setPaddingRelative(this.f38440d, max, 0, 0, 0);
        int i2 = this.f38420B;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                if (this.f38460y == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f38440d.setGravity(1);
            }
        } else {
            m70819f(this.f38460y);
        }
        m70801x(true);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f38438b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Tab tab = this.f38438b.get(i);
                if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (z && !this.f38421C) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f38456u;
        if (i != -1) {
            return i;
        }
        int i2 = this.f38420B;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.f38458w;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f38440d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private int m70817h(int i, float f) {
        View childAt;
        View view;
        int i2 = this.f38420B;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f38440d.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.f38440d.getChildCount()) {
            view = this.f38440d.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: i */
    private void m70816i(@NonNull Tab tab, int i) {
        tab.m70785f(i);
        this.f38438b.add(i, tab);
        int size = this.f38438b.size();
        while (true) {
            i++;
            if (i < size) {
                this.f38438b.get(i).m70785f(i);
            } else {
                return;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    private static ColorStateList m70815j(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @NonNull
    /* renamed from: k */
    private LinearLayout.LayoutParams m70814k() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m70802w(layoutParams);
        return layoutParams;
    }

    @NonNull
    /* renamed from: l */
    private TabView m70813l(@NonNull Tab tab) {
        TabView tabView;
        Pools.Pool<TabView> pool = this.f38437S;
        if (pool != null) {
            tabView = pool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f38475d)) {
            tabView.setContentDescription(tab.f38474c);
        } else {
            tabView.setContentDescription(tab.f38475d);
        }
        return tabView;
    }

    /* renamed from: m */
    private void m70812m(@NonNull Tab tab) {
        for (int size = this.f38428J.size() - 1; size >= 0; size--) {
            this.f38428J.get(size).onTabReselected(tab);
        }
    }

    /* renamed from: n */
    private void m70811n(@NonNull Tab tab) {
        for (int size = this.f38428J.size() - 1; size >= 0; size--) {
            this.f38428J.get(size).onTabSelected(tab);
        }
    }

    /* renamed from: o */
    private void m70810o(@NonNull Tab tab) {
        for (int size = this.f38428J.size() - 1; size >= 0; size--) {
            this.f38428J.get(size).onTabUnselected(tab);
        }
    }

    /* renamed from: p */
    private void m70809p() {
        if (this.f38430L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f38430L = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f38430L.setDuration(this.f38461z);
            this.f38430L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: q */
    private boolean m70808q() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void m70806s(int i) {
        TabView tabView = (TabView) this.f38440d.getChildAt(i);
        this.f38440d.removeViewAt(i);
        if (tabView != null) {
            tabView.m70763s();
            this.f38437S.release(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f38440d.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f38440d.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* renamed from: u */
    private void m70804u(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f38431M;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f38434P;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.f38435Q;
            if (adapterChangeListener != null) {
                this.f38431M.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.f38429K;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.f38429K = null;
        }
        if (viewPager != null) {
            this.f38431M = viewPager;
            if (this.f38434P == null) {
                this.f38434P = new TabLayoutOnPageChangeListener(this);
            }
            this.f38434P.m70783a();
            viewPager.addOnPageChangeListener(this.f38434P);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.f38429K = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                m70805t(adapter, z);
            }
            if (this.f38435Q == null) {
                this.f38435Q = new AdapterChangeListener();
            }
            this.f38435Q.m70800a(z);
            viewPager.addOnAdapterChangeListener(this.f38435Q);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f38431M = null;
            m70805t(null, false);
        }
        this.f38436R = z2;
    }

    /* renamed from: v */
    private void m70803v() {
        int size = this.f38438b.size();
        for (int i = 0; i < size; i++) {
            this.f38438b.get(i).m70784g();
        }
    }

    /* renamed from: w */
    private void m70802w(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f38420B == 1 && this.f38460y == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.f38438b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m70821d(view);
    }

    public void clearOnTabSelectedListeners() {
        this.f38428J.clear();
    }

    protected Tab createTabFromPool() {
        Tab acquire = f38418U.acquire();
        if (acquire == null) {
            return new Tab();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f38439c;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i) {
        if (i >= 0 && i < getTabCount()) {
            return this.f38438b.get(i);
        }
        return null;
    }

    public int getTabCount() {
        return this.f38438b.size();
    }

    public int getTabGravity() {
        return this.f38460y;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f38447l;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f38424F;
    }

    public int getTabIndicatorGravity() {
        return this.f38419A;
    }

    int getTabMaxWidth() {
        return this.f38455t;
    }

    public int getTabMode() {
        return this.f38420B;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f38448m;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f38449n;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f38446k;
    }

    public boolean hasUnboundedRipple() {
        return this.f38425G;
    }

    public boolean isInlineLabel() {
        return this.f38421C;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.f38422D;
    }

    @NonNull
    public Tab newTab() {
        Tab createTabFromPool = createTabFromPool();
        createTabFromPool.parent = this;
        createTabFromPool.view = m70813l(createTabFromPool);
        if (createTabFromPool.f38479h != -1) {
            createTabFromPool.view.setId(createTabFromPool.f38479h);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f38431M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m70804u((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38436R) {
            setupWithViewPager(null);
            this.f38436R = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f38440d.getChildCount(); i++) {
            View childAt = this.f38440d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m70769m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m70808q() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f38457v
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f38455t = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f38420B
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !m70808q()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: r */
    void m70807r() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.f38432N;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().setText(this.f38432N.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f38431M;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    protected boolean releaseFromTabPool(Tab tab) {
        return f38418U.release(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.f38440d.getChildCount() - 1; childCount >= 0; childCount--) {
            m70806s(childCount);
        }
        Iterator<Tab> it = this.f38438b.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.m70786e();
            releaseFromTabPool(next);
        }
        this.f38439c = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent == this) {
            removeTabAt(tab.getPosition());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        Tab tab;
        Tab tab2 = this.f38439c;
        if (tab2 != null) {
            i2 = tab2.getPosition();
        } else {
            i2 = 0;
        }
        m70806s(i);
        Tab remove = this.f38438b.remove(i);
        if (remove != null) {
            remove.m70786e();
            releaseFromTabPool(remove);
        }
        int size = this.f38438b.size();
        for (int i3 = i; i3 < size; i3++) {
            this.f38438b.get(i3).m70785f(i3);
        }
        if (i2 == i) {
            if (this.f38438b.isEmpty()) {
                tab = null;
            } else {
                tab = this.f38438b.get(Math.max(0, i - 1));
            }
            selectTab(tab);
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f38421C != z) {
            this.f38421C = z;
            for (int i = 0; i < this.f38440d.getChildCount(); i++) {
                View childAt = this.f38440d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m70756z();
                }
            }
            m70818g();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m70809p();
        this.f38430L.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.f38449n = mutate;
        DrawableUtils.setTint(mutate, this.f38450o);
        int i = this.f38423E;
        if (i == -1) {
            i = this.f38449n.getIntrinsicHeight();
        }
        this.f38440d.m70793g(i);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f38450o = i;
        DrawableUtils.setTint(this.f38449n, i);
        m70801x(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f38419A != i) {
            this.f38419A = i;
            ViewCompat.postInvalidateOnAnimation(this.f38440d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f38423E = i;
        this.f38440d.m70793g(i);
    }

    public void setTabGravity(int i) {
        if (this.f38460y != i) {
            this.f38460y = i;
            m70818g();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f38447l != colorStateList) {
            this.f38447l = colorStateList;
            m70803v();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f38424F = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f38426H = new FadeTabIndicatorInterpolator();
                    return;
                }
                throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
            }
            this.f38426H = new ElasticTabIndicatorInterpolator();
            return;
        }
        this.f38426H = new TabIndicatorInterpolator();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f38422D = z;
        this.f38440d.m70795e();
        ViewCompat.postInvalidateOnAnimation(this.f38440d);
    }

    public void setTabMode(int i) {
        if (i != this.f38420B) {
            this.f38420B = i;
            m70818g();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f38448m != colorStateList) {
            this.f38448m = colorStateList;
            for (int i = 0; i < this.f38440d.getChildCount(); i++) {
                View childAt = this.f38440d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m70757y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f38446k != colorStateList) {
            this.f38446k = colorStateList;
            m70803v();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m70805t(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f38425G != z) {
            this.f38425G = z;
            for (int i = 0; i < this.f38440d.getChildCount(); i++) {
                View childAt = this.f38440d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m70757y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    void m70805t(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f38432N;
        if (pagerAdapter2 != null && (dataSetObserver = this.f38433O) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f38432N = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f38433O == null) {
                this.f38433O = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.f38433O);
        }
        m70807r();
    }

    /* renamed from: x */
    void m70801x(boolean z) {
        for (int i = 0; i < this.f38440d.getChildCount(); i++) {
            View childAt = this.f38440d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m70802w((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Tab {
        public static final int INVALID_POSITION = -1;
        @Nullable

        /* renamed from: a */
        private Object f38472a;
        @Nullable

        /* renamed from: b */
        private Drawable f38473b;
        @Nullable

        /* renamed from: c */
        private CharSequence f38474c;
        @Nullable

        /* renamed from: d */
        private CharSequence f38475d;
        @Nullable

        /* renamed from: f */
        private View f38477f;
        @Nullable
        public TabLayout parent;
        @NonNull
        public TabView view;

        /* renamed from: e */
        private int f38476e = -1;
        @LabelVisibility

        /* renamed from: g */
        private int f38478g = 1;

        /* renamed from: h */
        private int f38479h = -1;

        /* renamed from: e */
        void m70786e() {
            this.parent = null;
            this.view = null;
            this.f38472a = null;
            this.f38473b = null;
            this.f38479h = -1;
            this.f38474c = null;
            this.f38475d = null;
            this.f38476e = -1;
            this.f38477f = null;
        }

        /* renamed from: f */
        void m70785f(int i) {
            this.f38476e = i;
        }

        /* renamed from: g */
        void m70784g() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.m70758x();
            }
        }

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.f38477f;
        }

        @Nullable
        public Drawable getIcon() {
            return this.f38473b;
        }

        public int getId() {
            return this.f38479h;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f38476e;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.f38478g;
        }

        @Nullable
        public Object getTag() {
            return this.f38472a;
        }

        @Nullable
        public CharSequence getText() {
            return this.f38474c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.f38476e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.m70764r();
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setContentDescription(@StringRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setCustomView(@Nullable View view) {
            this.f38477f = view;
            m70784g();
            return this;
        }

        @NonNull
        public Tab setIcon(@Nullable Drawable drawable) {
            this.f38473b = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f38460y == 1 || tabLayout.f38420B == 2) {
                tabLayout.m70801x(true);
            }
            m70784g();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.m70767o() && this.view.f38487g.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        public Tab setId(int i) {
            this.f38479h = i;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i);
            }
            return this;
        }

        @NonNull
        public Tab setTabLabelVisibility(@LabelVisibility int i) {
            this.f38478g = i;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f38460y == 1 || tabLayout.f38420B == 2) {
                tabLayout.m70801x(true);
            }
            m70784g();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.m70767o() && this.view.f38487g.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        public Tab setTag(@Nullable Object obj) {
            this.f38472a = obj;
            return this;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f38475d) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.f38474c = charSequence;
            m70784g();
            return this;
        }

        @NonNull
        public Tab setCustomView(@LayoutRes int i) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i, (ViewGroup) this.view, false));
        }

        @NonNull
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.f38475d = charSequence;
            m70784g();
            return this;
        }

        @NonNull
        public Tab setText(@StringRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public Tab setIcon(@DrawableRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C16310R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.f38428J.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.f38428J.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i) {
        addTab(tab, i, this.f38438b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m70821d(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.f38428J.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z) {
        Tab tab2 = this.f38439c;
        if (tab2 == tab) {
            if (tab2 != null) {
                m70812m(tab);
                m70820e(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                m70820e(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f38439c = tab;
        if (tab2 != null) {
            m70810o(tab2);
        }
        if (tab != null) {
            m70811n(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f38427I;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.f38427I = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f38440d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f38440d.m70794f(i, f);
        }
        ValueAnimator valueAnimator = this.f38430L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f38430L.cancel();
        }
        scrollTo(i < 0 ? 0 : m70817h(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z) {
        m70804u(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addTab(@NonNull Tab tab, boolean z) {
        addTab(tab, this.f38438b.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m70821d(view);
    }

    public void addTab(@NonNull Tab tab, int i, boolean z) {
        if (tab.parent == this) {
            m70816i(tab, i);
            m70822c(tab);
            if (z) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m70821d(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m70815j(i, i2));
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes5.dex */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a */
        private final ViewPager f38496a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f38496a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.f38496a.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }
}
