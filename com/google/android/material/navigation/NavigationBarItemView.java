package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C16310R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {

    /* renamed from: G */
    private static final int[] f37883G = {16842912};

    /* renamed from: H */
    private static final ActiveIndicatorTransform f37884H = new ActiveIndicatorTransform();

    /* renamed from: I */
    private static final ActiveIndicatorTransform f37885I = new ActiveIndicatorUnlabeledTransform();

    /* renamed from: A */
    private boolean f37886A;

    /* renamed from: B */
    private int f37887B;

    /* renamed from: C */
    private int f37888C;

    /* renamed from: D */
    private boolean f37889D;

    /* renamed from: E */
    private int f37890E;
    @Nullable

    /* renamed from: F */
    private BadgeDrawable f37891F;

    /* renamed from: b */
    private boolean f37892b;

    /* renamed from: c */
    private ColorStateList f37893c;
    @Nullable

    /* renamed from: d */
    Drawable f37894d;

    /* renamed from: f */
    private int f37895f;

    /* renamed from: g */
    private int f37896g;

    /* renamed from: h */
    private float f37897h;

    /* renamed from: i */
    private float f37898i;

    /* renamed from: j */
    private float f37899j;

    /* renamed from: k */
    private int f37900k;

    /* renamed from: l */
    private boolean f37901l;
    @Nullable

    /* renamed from: m */
    private final FrameLayout f37902m;
    @Nullable

    /* renamed from: n */
    private final View f37903n;

    /* renamed from: o */
    private final ImageView f37904o;

    /* renamed from: p */
    private final ViewGroup f37905p;

    /* renamed from: q */
    private final TextView f37906q;

    /* renamed from: r */
    private final TextView f37907r;

    /* renamed from: s */
    private int f37908s;
    @Nullable

    /* renamed from: t */
    private MenuItemImpl f37909t;
    @Nullable

    /* renamed from: u */
    private ColorStateList f37910u;
    @Nullable

    /* renamed from: v */
    private Drawable f37911v;
    @Nullable

    /* renamed from: w */
    private Drawable f37912w;

    /* renamed from: x */
    private ValueAnimator f37913x;

    /* renamed from: y */
    private ActiveIndicatorTransform f37914y;

    /* renamed from: z */
    private float f37915z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ActiveIndicatorTransform {
        private ActiveIndicatorTransform() {
        }

        /* renamed from: a */
        protected float m71251a(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
            float f3;
            float f4;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            return AnimationUtils.lerp(0.0f, 1.0f, f3, f4, f);
        }

        /* renamed from: b */
        protected float m71250b(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
            return AnimationUtils.lerp(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        protected float mo71249c(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
            return 1.0f;
        }

        public void updateForProgress(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2, @NonNull View view) {
            view.setScaleX(m71250b(f, f2));
            view.setScaleY(mo71249c(f, f2));
            view.setAlpha(m71251a(f, f2));
        }
    }

    /* loaded from: classes5.dex */
    private static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        /* renamed from: c */
        protected float mo71249c(float f, float f2) {
            return m71250b(f, f2);
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f37892b = false;
        this.f37908s = -1;
        this.f37914y = f37884H;
        this.f37915z = 0.0f;
        this.f37886A = false;
        this.f37887B = 0;
        this.f37888C = 0;
        this.f37889D = false;
        this.f37890E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f37902m = (FrameLayout) findViewById(C16310R.C16313id.navigation_bar_item_icon_container);
        this.f37903n = findViewById(C16310R.C16313id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C16310R.C16313id.navigation_bar_item_icon_view);
        this.f37904o = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C16310R.C16313id.navigation_bar_item_labels_group);
        this.f37905p = viewGroup;
        TextView textView = (TextView) findViewById(C16310R.C16313id.navigation_bar_item_small_label_view);
        this.f37906q = textView;
        TextView textView2 = (TextView) findViewById(C16310R.C16313id.navigation_bar_item_large_label_view);
        this.f37907r = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f37895f = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f37896g = viewGroup.getPaddingBottom();
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        m71271e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (NavigationBarItemView.this.f37904o.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.m71255u(navigationBarItemView.f37904o);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m71271e(float f, float f2) {
        this.f37897h = f - f2;
        this.f37898i = (f2 * 1.0f) / f;
        this.f37899j = (f * 1.0f) / f2;
    }

    /* renamed from: g */
    private static Drawable m71269g(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f37902m;
        if (frameLayout == null) {
            return this.f37904o;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        BadgeDrawable badgeDrawable = this.f37891F;
        if (badgeDrawable != null) {
            i = badgeDrawable.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f37904o.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        BadgeDrawable badgeDrawable = this.f37891F;
        if (badgeDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = badgeDrawable.getMinimumWidth() - this.f37891F.getHorizontalOffset();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f37904o.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    @Nullable
    /* renamed from: h */
    private FrameLayout m71268h(View view) {
        ImageView imageView = this.f37904o;
        if (view != imageView || !BadgeUtils.USE_COMPAT_PARENT) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: i */
    private boolean m71267i() {
        if (this.f37891F != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m71266j() {
        if (this.f37889D && this.f37900k == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m71265k(@FloatRange(from = 0.0d, m105511to = 1.0d) final float f) {
        if (this.f37886A && this.f37892b && ViewCompat.isAttachedToWindow(this)) {
            ValueAnimator valueAnimator = this.f37913x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f37913x = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37915z, f);
            this.f37913x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NavigationBarItemView.this.m71261o(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
                }
            });
            this.f37913x.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C16310R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.f37913x.setDuration(MotionUtils.resolveThemeDuration(getContext(), C16310R.attr.motionDurationLong2, getResources().getInteger(C16310R.integer.material_motion_duration_long_1)));
            this.f37913x.start();
            return;
        }
        m71261o(f, f);
    }

    /* renamed from: l */
    private void m71264l() {
        MenuItemImpl menuItemImpl = this.f37909t;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* renamed from: m */
    private void m71263m() {
        Drawable drawable = this.f37894d;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f37893c != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f37886A && getActiveIndicatorDrawable() != null && this.f37902m != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f37893c), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = m71269g(this.f37893c);
            }
        }
        FrameLayout frameLayout = this.f37902m;
        if (frameLayout != null) {
            ViewCompat.setBackground(frameLayout, rippleDrawable);
        }
        ViewCompat.setBackground(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m71261o(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, float f2) {
        View view = this.f37903n;
        if (view != null) {
            this.f37914y.updateForProgress(f, f2, view);
        }
        this.f37915z = f;
    }

    /* renamed from: p */
    private static void m71260p(TextView textView, @StyleRes int i) {
        TextViewCompat.setTextAppearance(textView, i);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    /* renamed from: q */
    private static void m71259q(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: r */
    private static void m71258r(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: s */
    private void m71257s(@Nullable View view) {
        if (m71267i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.f37891F, view, m71268h(view));
        }
    }

    /* renamed from: t */
    private void m71256t(@Nullable View view) {
        if (!m71267i()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeUtils.detachBadgeDrawable(this.f37891F, view);
        }
        this.f37891F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m71255u(View view) {
        if (!m71267i()) {
            return;
        }
        BadgeUtils.setBadgeDrawableBounds(this.f37891F, view, m71268h(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m71254v(int i) {
        int i2;
        if (this.f37903n == null) {
            return;
        }
        int min = Math.min(this.f37887B, i - (this.f37890E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37903n.getLayoutParams();
        if (m71266j()) {
            i2 = min;
        } else {
            i2 = this.f37888C;
        }
        layoutParams.height = i2;
        layoutParams.width = min;
        this.f37903n.setLayoutParams(layoutParams);
    }

    /* renamed from: w */
    private void m71253w() {
        if (m71266j()) {
            this.f37914y = f37885I;
        } else {
            this.f37914y = f37884H;
        }
    }

    /* renamed from: x */
    private static void m71252x(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f37902m;
        if (frameLayout != null && this.f37886A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m71270f() {
        m71262n();
        this.f37909t = null;
        this.f37915z = 0.0f;
        this.f37892b = false;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f37903n;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f37891F;
    }

    @DrawableRes
    protected int getItemBackgroundResId() {
        return C16310R.C16312drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f37909t;
    }

    @DimenRes
    protected int getItemDefaultMarginResId() {
        return C16310R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f37908s;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37905p.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f37905p.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37905p.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f37905p.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        CharSequence title;
        int i2;
        this.f37909t = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        if (!TextUtils.isEmpty(menuItemImpl.getTooltipText())) {
            title = menuItemImpl.getTooltipText();
        } else {
            title = menuItemImpl.getTitle();
        }
        TooltipCompat.setTooltipText(this, title);
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.f37892b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m71262n() {
        m71256t(this.f37904o);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f37909t;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f37909t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f37883G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f37891F;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f37909t.getTitle();
            if (!TextUtils.isEmpty(this.f37909t.getContentDescription())) {
                title = this.f37909t.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f37891F.getContentDescription()));
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(C16310R.C16316string.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.m71254v(i);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f37903n;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m71263m();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f37886A = z;
        m71263m();
        View view = this.f37903n;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f37888C = i;
        m71254v(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@InterfaceC0152Px int i) {
        this.f37890E = i;
        m71254v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f37889D = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f37887B = i;
        m71254v(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.f37891F == badgeDrawable) {
            return;
        }
        if (m71267i() && this.f37904o != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m71256t(this.f37904o);
        }
        this.f37891F = badgeDrawable;
        ImageView imageView = this.f37904o;
        if (imageView != null) {
            m71257s(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        float f;
        this.f37907r.setPivotX(textView.getWidth() / 2);
        this.f37907r.setPivotY(textView2.getBaseline());
        this.f37906q.setPivotX(textView3.getWidth() / 2);
        this.f37906q.setPivotY(textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        m71265k(f);
        int i = this.f37900k;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m71258r(getIconOrContainer(), this.f37895f, 17);
                        this.f37907r.setVisibility(8);
                        this.f37906q.setVisibility(8);
                    }
                } else {
                    m71252x(this.f37905p, this.f37896g);
                    if (z) {
                        m71258r(getIconOrContainer(), (int) (this.f37895f + this.f37897h), 49);
                        m71259q(this.f37907r, 1.0f, 1.0f, 0);
                        TextView textView5 = this.f37906q;
                        float f2 = this.f37898i;
                        m71259q(textView5, f2, f2, 4);
                    } else {
                        m71258r(getIconOrContainer(), this.f37895f, 49);
                        TextView textView6 = this.f37907r;
                        float f3 = this.f37899j;
                        m71259q(textView6, f3, f3, 4);
                        m71259q(this.f37906q, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z) {
                    m71258r(getIconOrContainer(), this.f37895f, 49);
                    m71252x(this.f37905p, this.f37896g);
                    this.f37907r.setVisibility(0);
                } else {
                    m71258r(getIconOrContainer(), this.f37895f, 17);
                    m71252x(this.f37905p, 0);
                    this.f37907r.setVisibility(4);
                }
                this.f37906q.setVisibility(4);
            }
        } else if (this.f37901l) {
            if (z) {
                m71258r(getIconOrContainer(), this.f37895f, 49);
                m71252x(this.f37905p, this.f37896g);
                this.f37907r.setVisibility(0);
            } else {
                m71258r(getIconOrContainer(), this.f37895f, 17);
                m71252x(this.f37905p, 0);
                this.f37907r.setVisibility(4);
            }
            this.f37906q.setVisibility(4);
        } else {
            m71252x(this.f37905p, this.f37896g);
            if (z) {
                m71258r(getIconOrContainer(), (int) (this.f37895f + this.f37897h), 49);
                m71259q(this.f37907r, 1.0f, 1.0f, 0);
                TextView textView7 = this.f37906q;
                float f4 = this.f37898i;
                m71259q(textView7, f4, f4, 4);
            } else {
                m71258r(getIconOrContainer(), this.f37895f, 49);
                TextView textView8 = this.f37907r;
                float f5 = this.f37899j;
                m71259q(textView8, f5, f5, 4);
                m71259q(this.f37906q, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f37906q.setEnabled(z);
        this.f37907r.setEnabled(z);
        this.f37904o.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f37911v) {
            return;
        }
        this.f37911v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.f37912w = drawable;
            ColorStateList colorStateList = this.f37910u;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.f37904o.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37904o.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f37904o.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f37910u = colorStateList;
        if (this.f37909t != null && (drawable = this.f37912w) != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            this.f37912w.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f37896g != i) {
            this.f37896g = i;
            m71264l();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f37895f != i) {
            this.f37895f = i;
            m71264l();
        }
    }

    public void setItemPosition(int i) {
        this.f37908s = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f37893c = colorStateList;
        m71263m();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f37900k != i) {
            this.f37900k = i;
            m71253w();
            m71254v(getWidth());
            m71264l();
        }
    }

    public void setShifting(boolean z) {
        if (this.f37901l != z) {
            this.f37901l = z;
            m71264l();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        m71260p(this.f37907r, i);
        m71271e(this.f37906q.getTextSize(), this.f37907r.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        m71260p(this.f37906q, i);
        m71271e(this.f37906q.getTextSize(), this.f37907r.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f37906q.setTextColor(colorStateList);
            this.f37907r.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.f37906q.setText(charSequence);
        this.f37907r.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f37909t;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f37909t;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.f37909t.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f37894d = drawable;
        m71263m();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }
}
