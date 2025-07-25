package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C16310R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {

    /* renamed from: h0 */
    private static final String f38259h0 = "BaseSlider";

    /* renamed from: i0 */
    static final int f38260i0 = C16310R.C16317style.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    private int f38261A;

    /* renamed from: B */
    private int f38262B;

    /* renamed from: C */
    private int f38263C;

    /* renamed from: D */
    private int f38264D;

    /* renamed from: E */
    private float f38265E;

    /* renamed from: F */
    private MotionEvent f38266F;

    /* renamed from: G */
    private LabelFormatter f38267G;

    /* renamed from: H */
    private boolean f38268H;

    /* renamed from: I */
    private float f38269I;

    /* renamed from: J */
    private float f38270J;

    /* renamed from: K */
    private ArrayList<Float> f38271K;

    /* renamed from: L */
    private int f38272L;

    /* renamed from: M */
    private int f38273M;

    /* renamed from: N */
    private float f38274N;

    /* renamed from: O */
    private float[] f38275O;

    /* renamed from: P */
    private boolean f38276P;

    /* renamed from: Q */
    private int f38277Q;

    /* renamed from: R */
    private boolean f38278R;

    /* renamed from: S */
    private boolean f38279S;

    /* renamed from: T */
    private boolean f38280T;
    @NonNull

    /* renamed from: U */
    private ColorStateList f38281U;
    @NonNull

    /* renamed from: V */
    private ColorStateList f38282V;
    @NonNull

    /* renamed from: W */
    private ColorStateList f38283W;
    @NonNull

    /* renamed from: a0 */
    private ColorStateList f38284a0;
    @NonNull

    /* renamed from: b */
    private final Paint f38285b;
    @NonNull

    /* renamed from: b0 */
    private ColorStateList f38286b0;
    @NonNull

    /* renamed from: c */
    private final Paint f38287c;
    @NonNull

    /* renamed from: c0 */
    private final MaterialShapeDrawable f38288c0;
    @NonNull

    /* renamed from: d */
    private final Paint f38289d;
    @Nullable

    /* renamed from: d0 */
    private Drawable f38290d0;
    @NonNull

    /* renamed from: e0 */
    private List<Drawable> f38291e0;
    @NonNull

    /* renamed from: f */
    private final Paint f38292f;

    /* renamed from: f0 */
    private float f38293f0;
    @NonNull

    /* renamed from: g */
    private final Paint f38294g;

    /* renamed from: g0 */
    private int f38295g0;
    @NonNull

    /* renamed from: h */
    private final Paint f38296h;
    @NonNull

    /* renamed from: i */
    private final AccessibilityHelper f38297i;

    /* renamed from: j */
    private final AccessibilityManager f38298j;

    /* renamed from: k */
    private BaseSlider<S, L, T>.AccessibilityEventSender f38299k;
    @NonNull

    /* renamed from: l */
    private final TooltipDrawableFactory f38300l;
    @NonNull

    /* renamed from: m */
    private final List<TooltipDrawable> f38301m;
    @NonNull

    /* renamed from: n */
    private final List<L> f38302n;
    @NonNull

    /* renamed from: o */
    private final List<T> f38303o;

    /* renamed from: p */
    private boolean f38304p;

    /* renamed from: q */
    private ValueAnimator f38305q;

    /* renamed from: r */
    private ValueAnimator f38306r;

    /* renamed from: s */
    private final int f38307s;

    /* renamed from: t */
    private int f38308t;

    /* renamed from: u */
    private int f38309u;

    /* renamed from: v */
    private int f38310v;

    /* renamed from: w */
    private int f38311w;

    /* renamed from: x */
    private int f38312x;

    /* renamed from: y */
    private int f38313y;

    /* renamed from: z */
    private int f38314z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class AccessibilityEventSender implements Runnable {

        /* renamed from: b */
        int f38320b;

        private AccessibilityEventSender() {
            this.f38320b = -1;
        }

        /* renamed from: a */
        void m70916a(int i) {
            this.f38320b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f38297i.sendEventForVirtualView(this.f38320b, 4);
        }
    }

    /* loaded from: classes5.dex */
    private static class AccessibilityHelper extends ExploreByTouchHelper {

        /* renamed from: a */
        private final BaseSlider<?, ?, ?> f38322a;

        /* renamed from: b */
        final Rect f38323b;

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f38323b = new Rect();
            this.f38322a = baseSlider;
        }

        @NonNull
        /* renamed from: a */
        private String m70915a(int i) {
            if (i == this.f38322a.getValues().size() - 1) {
                return this.f38322a.getContext().getString(C16310R.C16316string.material_slider_range_end);
            }
            if (i == 0) {
                return this.f38322a.getContext().getString(C16310R.C16316string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f38322a.getValues().size(); i++) {
                this.f38322a.m70948g0(i, this.f38323b);
                if (this.f38323b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f38322a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f38322a.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float m70939l = this.f38322a.m70939l(20);
                if (i2 == 8192) {
                    m70939l = -m70939l;
                }
                if (this.f38322a.m70979I()) {
                    m70939l = -m70939l;
                }
                if (this.f38322a.m70952e0(i, MathUtils.clamp(this.f38322a.getValues().get(i).floatValue() + m70939l, this.f38322a.getValueFrom(), this.f38322a.getValueTo()))) {
                    this.f38322a.m70946h0();
                    this.f38322a.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
                return false;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.f38322a.m70952e0(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.f38322a.m70946h0();
                    this.f38322a.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f38322a.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f38322a.getValueFrom();
            float valueTo = this.f38322a.getValueTo();
            if (this.f38322a.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f38322a.getContentDescription() != null) {
                sb2.append(this.f38322a.getContentDescription());
                sb2.append(",");
            }
            if (values.size() > 1) {
                sb2.append(m70915a(i));
                sb2.append(this.f38322a.m70987A(floatValue));
            }
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            this.f38322a.m70948g0(i, this.f38323b);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f38323b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        };

        /* renamed from: b */
        float f38324b;

        /* renamed from: c */
        float f38325c;

        /* renamed from: d */
        ArrayList<Float> f38326d;

        /* renamed from: f */
        float f38327f;

        /* renamed from: g */
        boolean f38328g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f38324b);
            parcel.writeFloat(this.f38325c);
            parcel.writeList(this.f38326d);
            parcel.writeFloat(this.f38327f);
            parcel.writeBooleanArray(new boolean[]{this.f38328g});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.f38324b = parcel.readFloat();
            this.f38325c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f38326d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f38327f = parcel.readFloat();
            this.f38328g = parcel.createBooleanArray()[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface TooltipDrawableFactory {
        TooltipDrawable createTooltipDrawable();
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public String m70987A(float f) {
        String str;
        if (hasLabelFormatter()) {
            return this.f38267G.getFormattedValue(f);
        }
        if (((int) f) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f));
    }

    /* renamed from: B */
    private static float m70986B(ValueAnimator valueAnimator, float f) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f;
    }

    /* renamed from: C */
    private float m70985C(int i, float f) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.f38295g0 == 0) {
            minSeparation = m70929q(minSeparation);
        }
        if (m70979I()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.f38271K.size()) {
            floatValue = this.f38270J;
        } else {
            floatValue = this.f38271K.get(i2).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            floatValue2 = this.f38269I;
        } else {
            floatValue2 = this.f38271K.get(i3).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f, floatValue2, floatValue);
    }

    @ColorInt
    /* renamed from: D */
    private int m70984D(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: E */
    private Drawable m70983E(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        m70947h(newDrawable);
        return newDrawable;
    }

    /* renamed from: F */
    private void m70982F() {
        this.f38285b.setStrokeWidth(this.f38314z);
        this.f38287c.setStrokeWidth(this.f38314z);
        this.f38294g.setStrokeWidth(this.f38314z / 2.0f);
        this.f38296h.setStrokeWidth(this.f38314z / 2.0f);
    }

    /* renamed from: G */
    private boolean m70981G() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: H */
    private boolean m70980H(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f38274N)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m70978J(@NonNull Resources resources) {
        this.f38311w = resources.getDimensionPixelSize(C16310R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C16310R.dimen.mtrl_slider_track_side_padding);
        this.f38308t = dimensionPixelOffset;
        this.f38261A = dimensionPixelOffset;
        this.f38309u = resources.getDimensionPixelSize(C16310R.dimen.mtrl_slider_thumb_radius);
        this.f38310v = resources.getDimensionPixelSize(C16310R.dimen.mtrl_slider_track_height);
        this.f38264D = resources.getDimensionPixelSize(C16310R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: K */
    private void m70977K() {
        if (this.f38274N <= 0.0f) {
            return;
        }
        m70940k0();
        int min = Math.min((int) (((this.f38270J - this.f38269I) / this.f38274N) + 1.0f), (this.f38277Q / (this.f38314z * 2)) + 1);
        float[] fArr = this.f38275O;
        if (fArr == null || fArr.length != min * 2) {
            this.f38275O = new float[min * 2];
        }
        float f = this.f38277Q / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f38275O;
            fArr2[i] = this.f38261A + ((i / 2) * f);
            fArr2[i + 1] = m70937m();
        }
    }

    /* renamed from: L */
    private void m70976L(@NonNull Canvas canvas, int i, int i2) {
        if (m70958b0()) {
            int m70970R = (int) (this.f38261A + (m70970R(this.f38271K.get(this.f38273M).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f38263C;
                canvas.clipRect(m70970R - i3, i2 - i3, m70970R + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(m70970R, i2, this.f38263C, this.f38292f);
        }
    }

    /* renamed from: M */
    private void m70975M(@NonNull Canvas canvas) {
        if (this.f38276P && this.f38274N > 0.0f) {
            float[] activeRange = getActiveRange();
            int m70965W = m70965W(this.f38275O, activeRange[0]);
            int m70965W2 = m70965W(this.f38275O, activeRange[1]);
            int i = m70965W * 2;
            canvas.drawPoints(this.f38275O, 0, i, this.f38294g);
            int i2 = m70965W2 * 2;
            canvas.drawPoints(this.f38275O, i, i2 - i, this.f38296h);
            float[] fArr = this.f38275O;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f38294g);
        }
    }

    /* renamed from: N */
    private boolean m70974N() {
        int max = this.f38308t + Math.max(Math.max(this.f38262B - this.f38309u, 0), Math.max((this.f38314z - this.f38310v) / 2, 0));
        if (this.f38261A == max) {
            return false;
        }
        this.f38261A = max;
        if (ViewCompat.isLaidOut(this)) {
            m70944i0(getWidth());
            return true;
        }
        return true;
    }

    /* renamed from: O */
    private boolean m70973O() {
        int max = Math.max(this.f38311w, Math.max(this.f38314z + getPaddingTop() + getPaddingBottom(), (this.f38262B * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.f38312x) {
            return false;
        }
        this.f38312x = max;
        return true;
    }

    /* renamed from: P */
    private boolean m70972P(int i) {
        int i2 = this.f38273M;
        int clamp = (int) MathUtils.clamp(i2 + i, 0L, this.f38271K.size() - 1);
        this.f38273M = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.f38272L != -1) {
            this.f38272L = clamp;
        }
        m70946h0();
        postInvalidate();
        return true;
    }

    /* renamed from: Q */
    private boolean m70971Q(int i) {
        if (m70979I()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return m70972P(i);
    }

    /* renamed from: R */
    private float m70970R(float f) {
        float f2 = this.f38269I;
        float f3 = (f - f2) / (this.f38270J - f2);
        if (m70979I()) {
            return 1.0f - f3;
        }
        return f3;
    }

    @Nullable
    /* renamed from: S */
    private Boolean m70969S(int i, @NonNull KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    m70971Q(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    m70971Q(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        m70972P(-1);
                        return Boolean.TRUE;
                    }
                }
                m70972P(1);
                return Boolean.TRUE;
            }
            this.f38272L = this.f38273M;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m70972P(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m70972P(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: T */
    private void m70968T() {
        for (T t : this.f38303o) {
            t.onStartTrackingTouch(this);
        }
    }

    /* renamed from: U */
    private void m70967U() {
        for (T t : this.f38303o) {
            t.onStopTrackingTouch(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: V */
    public static TooltipDrawable m70966V(@NonNull Context context, @NonNull TypedArray typedArray) {
        return TooltipDrawable.createFromAttributes(context, null, 0, typedArray.getResourceId(C16310R.styleable.Slider_labelStyle, C16310R.C16317style.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: W */
    private static int m70965W(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    /* renamed from: X */
    private void m70964X(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C16310R.styleable.Slider, i, f38260i0, new int[0]);
        this.f38269I = obtainStyledAttributes.getFloat(C16310R.styleable.Slider_android_valueFrom, 0.0f);
        this.f38270J = obtainStyledAttributes.getFloat(C16310R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f38269I));
        this.f38274N = obtainStyledAttributes.getFloat(C16310R.styleable.Slider_android_stepSize, 0.0f);
        int i4 = C16310R.styleable.Slider_trackColor;
        boolean hasValue = obtainStyledAttributes.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C16310R.styleable.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = C16310R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, i2);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, C16310R.C16311color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i4);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, C16310R.C16311color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.f38288c0.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.Slider_thumbColor));
        int i5 = C16310R.styleable.Slider_thumbStrokeColor;
        if (obtainStyledAttributes.hasValue(i5)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, i5));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(C16310R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, C16310R.C16311color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.f38276P = obtainStyledAttributes.getBoolean(C16310R.styleable.Slider_tickVisible, true);
        int i6 = C16310R.styleable.Slider_tickColor;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C16310R.styleable.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = C16310R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i3);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, C16310R.C16311color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i6);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, C16310R.C16311color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbRadius(obtainStyledAttributes.getDimensionPixelSize(C16310R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(C16310R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(C16310R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(C16310R.styleable.Slider_trackHeight, 0));
        setLabelBehavior(obtainStyledAttributes.getInt(C16310R.styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(C16310R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Y */
    private void m70963Y(int i) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.f38299k;
        if (accessibilityEventSender == null) {
            this.f38299k = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.f38299k.m70916a(i);
        postDelayed(this.f38299k, 200L);
    }

    /* renamed from: Z */
    private void m70962Z(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(m70987A(f));
        int m70970R = (this.f38261A + ((int) (m70970R(f) * this.f38277Q))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int m70937m = m70937m() - (this.f38264D + this.f38262B);
        tooltipDrawable.setBounds(m70970R, m70937m - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + m70970R, m70937m);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    /* renamed from: a0 */
    private boolean m70960a0() {
        if (this.f38313y == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m70958b0() {
        if (!this.f38278R && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private boolean m70956c0(float f) {
        return m70952e0(this.f38272L, f);
    }

    /* renamed from: d0 */
    private double m70954d0(float f) {
        float f2 = this.f38274N;
        if (f2 > 0.0f) {
            int i = (int) ((this.f38270J - this.f38269I) / f2);
            return Math.round(f * i) / i;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m70952e0(int i, float f) {
        this.f38273M = i;
        if (Math.abs(f - this.f38271K.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f38271K.set(i, Float.valueOf(m70985C(i, f)));
        m70927r(i);
        return true;
    }

    /* renamed from: f0 */
    private boolean m70950f0() {
        return m70956c0(getValueOfTouchPosition());
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f38271K.size() == 1) {
            floatValue2 = this.f38269I;
        }
        float m70970R = m70970R(floatValue2);
        float m70970R2 = m70970R(floatValue);
        return m70979I() ? new float[]{m70970R2, m70970R} : new float[]{m70970R, m70970R2};
    }

    private float getValueOfTouchPosition() {
        double m70954d0 = m70954d0(this.f38293f0);
        if (m70979I()) {
            m70954d0 = 1.0d - m70954d0;
        }
        float f = this.f38270J;
        float f2 = this.f38269I;
        return (float) ((m70954d0 * (f - f2)) + f2);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f38293f0;
        if (m70979I()) {
            f = 1.0f - f;
        }
        float f2 = this.f38270J;
        float f3 = this.f38269I;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: h */
    private void m70947h(Drawable drawable) {
        int i = this.f38262B * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = i / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m70946h0() {
        if (!m70958b0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m70970R = (int) ((m70970R(this.f38271K.get(this.f38273M).floatValue()) * this.f38277Q) + this.f38261A);
                int m70937m = m70937m();
                int i = this.f38263C;
                DrawableCompat.setHotspotBounds(background, m70970R - i, m70937m - i, m70970R + i, m70937m + i);
            }
        }
    }

    /* renamed from: i */
    private void m70945i(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    /* renamed from: i0 */
    private void m70944i0(int i) {
        this.f38277Q = Math.max(i - (this.f38261A * 2), 0);
        m70977K();
    }

    @Nullable
    /* renamed from: j */
    private Float m70943j(int i) {
        float m70941k;
        if (this.f38279S) {
            m70941k = m70939l(20);
        } else {
            m70941k = m70941k();
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 69) {
                    if (i != 70 && i != 81) {
                        return null;
                    }
                    return Float.valueOf(m70941k);
                }
                return Float.valueOf(-m70941k);
            }
            if (m70979I()) {
                m70941k = -m70941k;
            }
            return Float.valueOf(m70941k);
        }
        if (!m70979I()) {
            m70941k = -m70941k;
        }
        return Float.valueOf(m70941k);
    }

    /* renamed from: j0 */
    private void m70942j0() {
        boolean m70973O = m70973O();
        boolean m70974N = m70974N();
        if (m70973O) {
            requestLayout();
        } else if (m70974N) {
            postInvalidate();
        }
    }

    /* renamed from: k */
    private float m70941k() {
        float f = this.f38274N;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: k0 */
    private void m70940k0() {
        if (this.f38280T) {
            m70934n0();
            m70932o0();
            m70936m0();
            m70930p0();
            m70938l0();
            m70924s0();
            this.f38280T = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public float m70939l(int i) {
        float f;
        float f2;
        float m70941k = m70941k();
        if ((this.f38270J - this.f38269I) / m70941k <= i) {
            return m70941k;
        }
        return Math.round(f / f2) * m70941k;
    }

    /* renamed from: l0 */
    private void m70938l0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f38274N;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f38295g0 == 1) {
                    if (minSeparation < f || !m70980H(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f38274N), Float.valueOf(this.f38274N)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f38274N)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    /* renamed from: m */
    private int m70937m() {
        int i = this.f38312x / 2;
        int i2 = 0;
        if (this.f38313y == 1 || m70960a0()) {
            i2 = this.f38301m.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: m0 */
    private void m70936m0() {
        if (this.f38274N > 0.0f && !m70928q0(this.f38270J)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f38274N), Float.valueOf(this.f38269I), Float.valueOf(this.f38270J)));
        }
    }

    /* renamed from: n */
    private ValueAnimator m70935n(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        long j;
        TimeInterpolator timeInterpolator;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f38306r;
        } else {
            valueAnimator = this.f38305q;
        }
        float m70986B = m70986B(valueAnimator, f);
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m70986B, f2);
        if (z) {
            j = 83;
        } else {
            j = 117;
        }
        ofFloat.setDuration(j);
        if (z) {
            timeInterpolator = AnimationUtils.DECELERATE_INTERPOLATOR;
        } else {
            timeInterpolator = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                for (TooltipDrawable tooltipDrawable : BaseSlider.this.f38301m) {
                    tooltipDrawable.setRevealFraction(floatValue);
                }
                ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
            }
        });
        return ofFloat;
    }

    /* renamed from: n0 */
    private void m70934n0() {
        if (this.f38269I < this.f38270J) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f38269I), Float.valueOf(this.f38270J)));
    }

    /* renamed from: o */
    private void m70933o() {
        if (this.f38301m.size() > this.f38271K.size()) {
            List<TooltipDrawable> subList = this.f38301m.subList(this.f38271K.size(), this.f38301m.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    m70931p(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (this.f38301m.size() < this.f38271K.size()) {
            TooltipDrawable createTooltipDrawable = this.f38300l.createTooltipDrawable();
            this.f38301m.add(createTooltipDrawable);
            if (ViewCompat.isAttachedToWindow(this)) {
                m70945i(createTooltipDrawable);
            }
        }
        int i = 1;
        if (this.f38301m.size() == 1) {
            i = 0;
        }
        for (TooltipDrawable tooltipDrawable2 : this.f38301m) {
            tooltipDrawable2.setStrokeWidth(i);
        }
    }

    /* renamed from: o0 */
    private void m70932o0() {
        if (this.f38270J > this.f38269I) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f38270J), Float.valueOf(this.f38269I)));
    }

    /* renamed from: p */
    private void m70931p(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    /* renamed from: p0 */
    private void m70930p0() {
        Iterator<Float> it = this.f38271K.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.f38269I && next.floatValue() <= this.f38270J) {
                if (this.f38274N > 0.0f && !m70928q0(next.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.f38269I), Float.valueOf(this.f38274N), Float.valueOf(this.f38274N)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.f38269I), Float.valueOf(this.f38270J)));
            }
        }
    }

    /* renamed from: q */
    private float m70929q(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f38261A) / this.f38277Q;
        float f3 = this.f38269I;
        return (f2 * (f3 - this.f38270J)) + f3;
    }

    /* renamed from: q0 */
    private boolean m70928q0(float f) {
        return m70980H(f - this.f38269I);
    }

    /* renamed from: r */
    private void m70927r(int i) {
        for (L l : this.f38302n) {
            l.onValueChange(this, this.f38271K.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f38298j;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m70963Y(i);
        }
    }

    /* renamed from: r0 */
    private float m70926r0(float f) {
        return (m70970R(f) * this.f38277Q) + this.f38261A;
    }

    /* renamed from: s */
    private void m70925s() {
        for (L l : this.f38302n) {
            Iterator<Float> it = this.f38271K.iterator();
            while (it.hasNext()) {
                l.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: s0 */
    private void m70924s0() {
        float f = this.f38274N;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            Log.w(f38259h0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f)));
        }
        float f2 = this.f38269I;
        if (((int) f2) != f2) {
            Log.w(f38259h0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2)));
        }
        float f3 = this.f38270J;
        if (((int) f3) != f3) {
            Log.w(f38259h0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3)));
        }
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f38271K.size() == arrayList.size() && this.f38271K.equals(arrayList)) {
                return;
            }
            this.f38271K = arrayList;
            this.f38280T = true;
            this.f38273M = 0;
            m70946h0();
            m70933o();
            m70925s();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: t */
    private void m70923t(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f38261A;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f), f2, i3 + (activeRange[1] * f), f2, this.f38287c);
    }

    /* renamed from: u */
    private void m70922u(@NonNull Canvas canvas, int i, int i2) {
        int i3;
        float[] activeRange = getActiveRange();
        float f = i;
        float f2 = this.f38261A + (activeRange[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f38285b);
        }
        int i4 = this.f38261A;
        float f4 = i4 + (activeRange[0] * f);
        if (f4 > i4) {
            float f5 = i2;
            canvas.drawLine(i4, f5, f4, f5, this.f38285b);
        }
    }

    /* renamed from: v */
    private void m70921v(@NonNull Canvas canvas, int i, int i2, float f, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f38261A + ((int) (m70970R(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: w */
    private void m70920w(@NonNull Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f38271K.size(); i3++) {
            float floatValue = this.f38271K.get(i3).floatValue();
            Drawable drawable = this.f38290d0;
            if (drawable != null) {
                m70921v(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f38291e0.size()) {
                m70921v(canvas, i, i2, floatValue, this.f38291e0.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f38261A + (m70970R(floatValue) * i), i2, this.f38262B, this.f38289d);
                }
                m70921v(canvas, i, i2, floatValue, this.f38288c0);
            }
        }
    }

    /* renamed from: x */
    private void m70919x() {
        if (this.f38313y == 2) {
            return;
        }
        if (!this.f38304p) {
            this.f38304p = true;
            ValueAnimator m70935n = m70935n(true);
            this.f38305q = m70935n;
            this.f38306r = null;
            m70935n.start();
        }
        Iterator<TooltipDrawable> it = this.f38301m.iterator();
        for (int i = 0; i < this.f38271K.size() && it.hasNext(); i++) {
            if (i != this.f38273M) {
                m70962Z(it.next(), this.f38271K.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            m70962Z(it.next(), this.f38271K.get(this.f38273M).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f38301m.size()), Integer.valueOf(this.f38271K.size())));
    }

    /* renamed from: y */
    private void m70918y() {
        if (this.f38304p) {
            this.f38304p = false;
            ValueAnimator m70935n = m70935n(false);
            this.f38306r = m70935n;
            this.f38305q = null;
            m70935n.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(BaseSlider.this);
                    for (TooltipDrawable tooltipDrawable : BaseSlider.this.f38301m) {
                        contentViewOverlay.remove(tooltipDrawable);
                    }
                }
            });
            this.f38306r.start();
        }
    }

    /* renamed from: z */
    private void m70917z(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        m70971Q(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                m70971Q(Integer.MAX_VALUE);
                return;
            }
            m70972P(Integer.MIN_VALUE);
            return;
        }
        m70972P(Integer.MAX_VALUE);
    }

    /* renamed from: I */
    final boolean m70979I() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    public void addOnChangeListener(@NonNull L l) {
        this.f38302n.add(l);
    }

    public void addOnSliderTouchListener(@NonNull T t) {
        this.f38303o.add(t);
    }

    public void clearOnChangeListeners() {
        this.f38302n.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.f38303o.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.f38297i.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f38285b.setColor(m70984D(this.f38286b0));
        this.f38287c.setColor(m70984D(this.f38284a0));
        this.f38294g.setColor(m70984D(this.f38283W));
        this.f38296h.setColor(m70984D(this.f38282V));
        for (TooltipDrawable tooltipDrawable : this.f38301m) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.f38288c0.isStateful()) {
            this.f38288c0.setState(getDrawableState());
        }
        this.f38292f.setColor(m70984D(this.f38281U));
        this.f38292f.setAlpha(63);
    }

    /* renamed from: g0 */
    void m70948g0(int i, Rect rect) {
        int m70970R = this.f38261A + ((int) (m70970R(getValues().get(i).floatValue()) * this.f38277Q));
        int m70937m = m70937m();
        int i2 = this.f38262B;
        rect.set(m70970R - i2, m70937m - i2, m70970R + i2, m70937m + i2);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f38297i.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f38272L;
    }

    public int getFocusedThumbIndex() {
        return this.f38273M;
    }

    @Dimension
    public int getHaloRadius() {
        return this.f38263C;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f38281U;
    }

    public int getLabelBehavior() {
        return this.f38313y;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f38274N;
    }

    public float getThumbElevation() {
        return this.f38288c0.getElevation();
    }

    @Dimension
    public int getThumbRadius() {
        return this.f38262B;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f38288c0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.f38288c0.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f38288c0.getFillColor();
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f38282V;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f38283W;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f38283W.equals(this.f38282V)) {
            return this.f38282V;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f38284a0;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f38314z;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f38286b0;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f38261A;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f38286b0.equals(this.f38284a0)) {
            return this.f38284a0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f38277Q;
    }

    public float getValueFrom() {
        return this.f38269I;
    }

    public float getValueTo() {
        return this.f38270J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f38271K);
    }

    public boolean hasLabelFormatter() {
        if (this.f38267G != null) {
            return true;
        }
        return false;
    }

    public boolean isTickVisible() {
        return this.f38276P;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable tooltipDrawable : this.f38301m) {
            m70945i(tooltipDrawable);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.f38299k;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.f38304p = false;
        for (TooltipDrawable tooltipDrawable : this.f38301m) {
            m70931p(tooltipDrawable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.f38280T) {
            m70940k0();
            m70977K();
        }
        super.onDraw(canvas);
        int m70937m = m70937m();
        m70922u(canvas, this.f38277Q, m70937m);
        if (((Float) Collections.max(getValues())).floatValue() > this.f38269I) {
            m70923t(canvas, this.f38277Q, m70937m);
        }
        m70975M(canvas);
        if ((this.f38268H || isFocused() || m70960a0()) && isEnabled()) {
            m70976L(canvas, this.f38277Q, m70937m);
            if (this.f38272L == -1 && !m70960a0()) {
                m70918y();
            } else {
                m70919x();
            }
        } else {
            m70918y();
        }
        m70920w(canvas, this.f38277Q, m70937m);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f38272L = -1;
            this.f38297i.clearKeyboardFocusForVirtualView(this.f38273M);
            return;
        }
        m70917z(i);
        this.f38297i.requestKeyboardFocusForVirtualView(this.f38273M);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f38271K.size() == 1) {
            this.f38272L = 0;
        }
        if (this.f38272L == -1) {
            Boolean m70969S = m70969S(i, keyEvent);
            if (m70969S != null) {
                return m70969S.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f38279S |= keyEvent.isLongPress();
        Float m70943j = m70943j(i);
        if (m70943j != null) {
            if (m70956c0(this.f38271K.get(this.f38272L).floatValue() + m70943j.floatValue())) {
                m70946h0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m70972P(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m70972P(-1);
            }
        }
        this.f38272L = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f38279S = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f38312x;
        int i4 = 0;
        if (this.f38313y == 1 || m70960a0()) {
            i4 = this.f38301m.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f38269I = sliderState.f38324b;
        this.f38270J = sliderState.f38325c;
        setValuesInternal(sliderState.f38326d);
        this.f38274N = sliderState.f38327f;
        if (sliderState.f38328g) {
            requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f38324b = this.f38269I;
        sliderState.f38325c = this.f38270J;
        sliderState.f38326d = new ArrayList<>(this.f38271K);
        sliderState.f38327f = this.f38274N;
        sliderState.f38328g = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        m70944i0(i);
        m70946h0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.f38261A) / this.f38277Q;
        this.f38293f0 = f;
        float max = Math.max(0.0f, f);
        this.f38293f0 = max;
        this.f38293f0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f38268H) {
                        if (m70981G() && Math.abs(x - this.f38265E) < this.f38307s) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m70968T();
                    }
                    if (pickActiveThumb()) {
                        this.f38268H = true;
                        m70950f0();
                        m70946h0();
                        invalidate();
                    }
                }
            } else {
                this.f38268H = false;
                MotionEvent motionEvent2 = this.f38266F;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f38266F.getX() - motionEvent.getX()) <= this.f38307s && Math.abs(this.f38266F.getY() - motionEvent.getY()) <= this.f38307s && pickActiveThumb()) {
                    m70968T();
                }
                if (this.f38272L != -1) {
                    m70950f0();
                    this.f38272L = -1;
                    m70967U();
                }
                invalidate();
            }
        } else {
            this.f38265E = x;
            if (!m70981G()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.f38268H = true;
                    m70950f0();
                    m70946h0();
                    invalidate();
                    m70968T();
                }
            }
        }
        setPressed(this.f38268H);
        this.f38266F = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        for (TooltipDrawable tooltipDrawable : this.f38301m) {
            contentViewOverlay.remove(tooltipDrawable);
        }
    }

    protected boolean pickActiveThumb() {
        boolean z;
        if (this.f38272L != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float m70926r0 = m70926r0(valueOfTouchPositionAbsolute);
        this.f38272L = 0;
        float abs = Math.abs(this.f38271K.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f38271K.size(); i++) {
            float abs2 = Math.abs(this.f38271K.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float m70926r02 = m70926r0(this.f38271K.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!m70979I() ? m70926r02 - m70926r0 < 0.0f : m70926r02 - m70926r0 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f38272L = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m70926r02 - m70926r0) < this.f38307s) {
                    this.f38272L = -1;
                    return false;
                } else if (z) {
                    this.f38272L = i;
                }
            }
            abs = abs2;
        }
        if (this.f38272L != -1) {
            return true;
        }
        return false;
    }

    public void removeOnChangeListener(@NonNull L l) {
        this.f38302n.remove(l);
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
        this.f38303o.remove(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.f38272L = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@DrawableRes int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.f38271K.size()) {
            this.f38273M = i;
            this.f38297i.requestKeyboardFocusForVirtualView(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.f38263C) {
            return;
        }
        this.f38263C = i;
        Drawable background = getBackground();
        if (!m70958b0() && (background instanceof RippleDrawable)) {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.f38263C);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38281U)) {
            return;
        }
        this.f38281U = colorStateList;
        Drawable background = getBackground();
        if (!m70958b0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f38292f.setColor(m70984D(colorStateList));
        this.f38292f.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f38313y != i) {
            this.f38313y = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.f38267G = labelFormatter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSeparationUnit(int i) {
        this.f38295g0 = i;
        this.f38280T = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f38274N != f) {
                this.f38274N = f;
                this.f38280T = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f38269I), Float.valueOf(this.f38270J)));
    }

    public void setThumbElevation(float f) {
        this.f38288c0.setElevation(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.f38262B) {
            return;
        }
        this.f38262B = i;
        this.f38288c0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.f38262B).build());
        MaterialShapeDrawable materialShapeDrawable = this.f38288c0;
        int i2 = this.f38262B;
        materialShapeDrawable.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.f38290d0;
        if (drawable != null) {
            m70947h(drawable);
        }
        for (Drawable drawable2 : this.f38291e0) {
            m70947h(drawable2);
        }
        m70942j0();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f38288c0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f38288c0.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38288c0.getFillColor())) {
            return;
        }
        this.f38288c0.setFillColor(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38282V)) {
            return;
        }
        this.f38282V = colorStateList;
        this.f38296h.setColor(m70984D(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38283W)) {
            return;
        }
        this.f38283W = colorStateList;
        this.f38294g.setColor(m70984D(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f38276P != z) {
            this.f38276P = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38284a0)) {
            return;
        }
        this.f38284a0 = colorStateList;
        this.f38287c.setColor(m70984D(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        if (this.f38314z != i) {
            this.f38314z = i;
            m70982F();
            m70942j0();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f38286b0)) {
            return;
        }
        this.f38286b0 = colorStateList;
        this.f38285b.setColor(m70984D(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f38269I = f;
        this.f38280T = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f38270J = f;
        this.f38280T = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C16310R.attr.sliderStyle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.f38290d0 = m70983E(drawable);
        this.f38291e0.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable final AttributeSet attributeSet, final int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f38260i0), attributeSet, i);
        this.f38301m = new ArrayList();
        this.f38302n = new ArrayList();
        this.f38303o = new ArrayList();
        this.f38304p = false;
        this.f38268H = false;
        this.f38271K = new ArrayList<>();
        this.f38272L = -1;
        this.f38273M = -1;
        this.f38274N = 0.0f;
        this.f38276P = true;
        this.f38279S = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f38288c0 = materialShapeDrawable;
        this.f38291e0 = Collections.emptyList();
        this.f38295g0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f38285b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f38287c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f38289d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f38292f = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f38294g = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f38296h = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m70978J(context2.getResources());
        this.f38300l = new TooltipDrawableFactory() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // com.google.android.material.slider.BaseSlider.TooltipDrawableFactory
            public TooltipDrawable createTooltipDrawable() {
                TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(BaseSlider.this.getContext(), attributeSet, C16310R.styleable.Slider, i, BaseSlider.f38260i0, new int[0]);
                TooltipDrawable m70966V = BaseSlider.m70966V(BaseSlider.this.getContext(), obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                return m70966V;
            }
        };
        m70964X(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.f38307s = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.f38297i = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        this.f38298j = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f38290d0 = null;
        this.f38291e0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f38291e0.add(m70983E(drawable));
        }
        postInvalidate();
    }
}
