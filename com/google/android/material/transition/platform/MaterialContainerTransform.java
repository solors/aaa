package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C16310R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.platform.TransitionUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes5.dex */
public final class MaterialContainerTransform extends Transition {

    /* renamed from: B */
    private static final String f39093B = "MaterialContainerTransform";
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    /* renamed from: A */
    private float f39099A;

    /* renamed from: b */
    private boolean f39100b;

    /* renamed from: c */
    private boolean f39101c;

    /* renamed from: d */
    private boolean f39102d;

    /* renamed from: f */
    private boolean f39103f;
    @IdRes

    /* renamed from: g */
    private int f39104g;
    @IdRes

    /* renamed from: h */
    private int f39105h;
    @IdRes

    /* renamed from: i */
    private int f39106i;
    @ColorInt

    /* renamed from: j */
    private int f39107j;
    @ColorInt

    /* renamed from: k */
    private int f39108k;
    @ColorInt

    /* renamed from: l */
    private int f39109l;
    @ColorInt

    /* renamed from: m */
    private int f39110m;

    /* renamed from: n */
    private int f39111n;

    /* renamed from: o */
    private int f39112o;

    /* renamed from: p */
    private int f39113p;
    @Nullable

    /* renamed from: q */
    private View f39114q;
    @Nullable

    /* renamed from: r */
    private View f39115r;
    @Nullable

    /* renamed from: s */
    private ShapeAppearanceModel f39116s;
    @Nullable

    /* renamed from: t */
    private ShapeAppearanceModel f39117t;
    @Nullable

    /* renamed from: u */
    private ProgressThresholds f39118u;
    @Nullable

    /* renamed from: v */
    private ProgressThresholds f39119v;
    @Nullable

    /* renamed from: w */
    private ProgressThresholds f39120w;
    @Nullable

    /* renamed from: x */
    private ProgressThresholds f39121x;

    /* renamed from: y */
    private boolean f39122y;

    /* renamed from: z */
    private float f39123z;

    /* renamed from: C */
    private static final String[] f39094C = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: D */
    private static final ProgressThresholdsGroup f39095D = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));

    /* renamed from: E */
    private static final ProgressThresholdsGroup f39096E = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));

    /* renamed from: F */
    private static final ProgressThresholdsGroup f39097F = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    /* renamed from: G */
    private static final ProgressThresholdsGroup f39098G = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface FitMode {
    }

    /* loaded from: classes5.dex */
    public static class ProgressThresholds {
        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)

        /* renamed from: a */
        private final float f39131a;
        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)

        /* renamed from: b */
        private final float f39132b;

        public ProgressThresholds(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
            this.f39131a = f;
            this.f39132b = f2;
        }

        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        public float getEnd() {
            return this.f39132b;
        }

        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        public float getStart() {
            return this.f39131a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ProgressThresholdsGroup {
        @NonNull

        /* renamed from: a */
        private final ProgressThresholds f39133a;
        @NonNull

        /* renamed from: b */
        private final ProgressThresholds f39134b;
        @NonNull

        /* renamed from: c */
        private final ProgressThresholds f39135c;
        @NonNull

        /* renamed from: d */
        private final ProgressThresholds f39136d;

        private ProgressThresholdsGroup(@NonNull ProgressThresholds progressThresholds, @NonNull ProgressThresholds progressThresholds2, @NonNull ProgressThresholds progressThresholds3, @NonNull ProgressThresholds progressThresholds4) {
            this.f39133a = progressThresholds;
            this.f39134b = progressThresholds2;
            this.f39135c = progressThresholds3;
            this.f39136d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface TransitionDirection {
    }

    /* loaded from: classes5.dex */
    private static final class TransitionDrawable extends Drawable {

        /* renamed from: A */
        private final ProgressThresholdsGroup f39137A;

        /* renamed from: B */
        private final FadeModeEvaluator f39138B;

        /* renamed from: C */
        private final FitModeEvaluator f39139C;

        /* renamed from: D */
        private final boolean f39140D;

        /* renamed from: E */
        private final Paint f39141E;

        /* renamed from: F */
        private final Path f39142F;

        /* renamed from: G */
        private FadeModeResult f39143G;

        /* renamed from: H */
        private FitModeResult f39144H;

        /* renamed from: I */
        private RectF f39145I;

        /* renamed from: J */
        private float f39146J;

        /* renamed from: K */
        private float f39147K;

        /* renamed from: L */
        private float f39148L;

        /* renamed from: a */
        private final View f39149a;

        /* renamed from: b */
        private final RectF f39150b;

        /* renamed from: c */
        private final ShapeAppearanceModel f39151c;

        /* renamed from: d */
        private final float f39152d;

        /* renamed from: e */
        private final View f39153e;

        /* renamed from: f */
        private final RectF f39154f;

        /* renamed from: g */
        private final ShapeAppearanceModel f39155g;

        /* renamed from: h */
        private final float f39156h;

        /* renamed from: i */
        private final Paint f39157i;

        /* renamed from: j */
        private final Paint f39158j;

        /* renamed from: k */
        private final Paint f39159k;

        /* renamed from: l */
        private final Paint f39160l;

        /* renamed from: m */
        private final Paint f39161m;

        /* renamed from: n */
        private final MaskEvaluator f39162n;

        /* renamed from: o */
        private final PathMeasure f39163o;

        /* renamed from: p */
        private final float f39164p;

        /* renamed from: q */
        private final float[] f39165q;

        /* renamed from: r */
        private final boolean f39166r;

        /* renamed from: s */
        private final float f39167s;

        /* renamed from: t */
        private final float f39168t;

        /* renamed from: u */
        private final boolean f39169u;

        /* renamed from: v */
        private final MaterialShapeDrawable f39170v;

        /* renamed from: w */
        private final RectF f39171w;

        /* renamed from: x */
        private final RectF f39172x;

        /* renamed from: y */
        private final RectF f39173y;

        /* renamed from: z */
        private final RectF f39174z;

        /* renamed from: d */
        private static float m70207d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        private static float m70206e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: f */
        private void m70205f(Canvas canvas, RectF rectF, Path path, @ColorInt int i) {
            PointF m70198m = m70198m(rectF);
            if (this.f39148L == 0.0f) {
                path.reset();
                path.moveTo(m70198m.x, m70198m.y);
                return;
            }
            path.lineTo(m70198m.x, m70198m.y);
            this.f39141E.setColor(i);
            canvas.drawPath(path, this.f39141E);
        }

        /* renamed from: g */
        private void m70204g(Canvas canvas, RectF rectF, @ColorInt int i) {
            this.f39141E.setColor(i);
            canvas.drawRect(rectF, this.f39141E);
        }

        /* renamed from: h */
        private void m70203h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f39162n.m70229d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m70201j(canvas);
            } else {
                m70202i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        private void m70202i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f39170v;
            RectF rectF = this.f39145I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f39170v.setElevation(this.f39146J);
            this.f39170v.setShadowVerticalOffset((int) this.f39147K);
            this.f39170v.setShapeAppearanceModel(this.f39162n.m70230c());
            this.f39170v.draw(canvas);
        }

        /* renamed from: j */
        private void m70201j(Canvas canvas) {
            ShapeAppearanceModel m70230c = this.f39162n.m70230c();
            if (m70230c.isRoundRect(this.f39145I)) {
                float cornerSize = m70230c.getTopLeftCornerSize().getCornerSize(this.f39145I);
                canvas.drawRoundRect(this.f39145I, cornerSize, cornerSize, this.f39160l);
                return;
            }
            canvas.drawPath(this.f39162n.m70229d(), this.f39160l);
        }

        /* renamed from: k */
        private void m70200k(Canvas canvas) {
            m70197n(canvas, this.f39159k);
            Rect bounds = getBounds();
            RectF rectF = this.f39173y;
            TransitionUtils.m70143u(canvas, bounds, rectF.left, rectF.top, this.f39144H.f39083b, this.f39143G.f39062b, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f39153e.draw(canvas2);
                }
            });
        }

        /* renamed from: l */
        private void m70199l(Canvas canvas) {
            m70197n(canvas, this.f39158j);
            Rect bounds = getBounds();
            RectF rectF = this.f39171w;
            TransitionUtils.m70143u(canvas, bounds, rectF.left, rectF.top, this.f39144H.f39082a, this.f39143G.f39061a, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f39149a.draw(canvas2);
                }
            });
        }

        /* renamed from: m */
        private static PointF m70198m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: n */
        private void m70197n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m70196o(float f) {
            if (this.f39148L != f) {
                m70195p(f);
            }
        }

        /* renamed from: p */
        private void m70195p(float f) {
            float m70153k;
            float f2;
            float f3;
            RectF rectF;
            this.f39148L = f;
            Paint paint = this.f39161m;
            if (this.f39166r) {
                m70153k = TransitionUtils.m70153k(0.0f, 255.0f, f);
            } else {
                m70153k = TransitionUtils.m70153k(255.0f, 0.0f, f);
            }
            paint.setAlpha((int) m70153k);
            this.f39163o.getPosTan(this.f39164p * f, this.f39165q, null);
            float[] fArr = this.f39165q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.f39163o.getPosTan(this.f39164p * f2, fArr, null);
                float[] fArr2 = this.f39165q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            FitModeResult evaluate = this.f39139C.evaluate(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39134b.f39131a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39134b.f39132b))).floatValue(), this.f39150b.width(), this.f39150b.height(), this.f39154f.width(), this.f39154f.height());
            this.f39144H = evaluate;
            RectF rectF2 = this.f39171w;
            float f8 = evaluate.f39084c;
            rectF2.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, evaluate.f39085d + f7);
            RectF rectF3 = this.f39173y;
            FitModeResult fitModeResult = this.f39144H;
            float f9 = fitModeResult.f39086e;
            rectF3.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), fitModeResult.f39087f + f7);
            this.f39172x.set(this.f39171w);
            this.f39174z.set(this.f39173y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39135c.f39131a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39135c.f39132b))).floatValue();
            boolean shouldMaskStartBounds = this.f39139C.shouldMaskStartBounds(this.f39144H);
            if (shouldMaskStartBounds) {
                rectF = this.f39172x;
            } else {
                rectF = this.f39174z;
            }
            float m70152l = TransitionUtils.m70152l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!shouldMaskStartBounds) {
                m70152l = 1.0f - m70152l;
            }
            this.f39139C.applyMask(rectF, m70152l, this.f39144H);
            this.f39145I = new RectF(Math.min(this.f39172x.left, this.f39174z.left), Math.min(this.f39172x.top, this.f39174z.top), Math.max(this.f39172x.right, this.f39174z.right), Math.max(this.f39172x.bottom, this.f39174z.bottom));
            this.f39162n.m70231b(f, this.f39151c, this.f39155g, this.f39171w, this.f39172x, this.f39174z, this.f39137A.f39136d);
            this.f39146J = TransitionUtils.m70153k(this.f39152d, this.f39156h, f);
            float m70207d = m70207d(this.f39145I, this.f39167s);
            float m70206e = m70206e(this.f39145I, this.f39168t);
            float f10 = this.f39146J;
            float f11 = (int) (m70206e * f10);
            this.f39147K = f11;
            this.f39160l.setShadowLayer(f10, (int) (m70207d * f10), f11, 754974720);
            this.f39143G = this.f39138B.evaluate(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39133a.f39131a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f39137A.f39133a.f39132b))).floatValue(), 0.35f);
            if (this.f39158j.getColor() != 0) {
                this.f39158j.setAlpha(this.f39143G.f39061a);
            }
            if (this.f39159k.getColor() != 0) {
                this.f39159k.setAlpha(this.f39143G.f39062b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            int i;
            if (this.f39161m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f39161m);
            }
            if (this.f39140D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f39169u && this.f39146J > 0.0f) {
                m70203h(canvas);
            }
            this.f39162n.m70232a(canvas);
            m70197n(canvas, this.f39157i);
            if (this.f39143G.f39063c) {
                m70199l(canvas);
                m70200k(canvas);
            } else {
                m70200k(canvas);
                m70199l(canvas);
            }
            if (this.f39140D) {
                canvas.restoreToCount(i);
                m70205f(canvas, this.f39171w, this.f39142F, -65281);
                m70204g(canvas, this.f39172x, InputDeviceCompat.SOURCE_ANY);
                m70204g(canvas, this.f39171w, -16711936);
                m70204g(canvas, this.f39174z, -16711681);
                m70204g(canvas, this.f39173y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            Paint paint = new Paint();
            this.f39157i = paint;
            Paint paint2 = new Paint();
            this.f39158j = paint2;
            Paint paint3 = new Paint();
            this.f39159k = paint3;
            this.f39160l = new Paint();
            Paint paint4 = new Paint();
            this.f39161m = paint4;
            this.f39162n = new MaskEvaluator();
            this.f39165q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f39170v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f39141E = paint5;
            this.f39142F = new Path();
            this.f39149a = view;
            this.f39150b = rectF;
            this.f39151c = shapeAppearanceModel;
            this.f39152d = f;
            this.f39153e = view2;
            this.f39154f = rectF2;
            this.f39155g = shapeAppearanceModel2;
            this.f39156h = f2;
            this.f39166r = z;
            this.f39169u = z2;
            this.f39138B = fadeModeEvaluator;
            this.f39139C = fitModeEvaluator;
            this.f39137A = progressThresholdsGroup;
            this.f39140D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f39167s = displayMetrics.widthPixels;
            this.f39168t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f39171w = rectF3;
            this.f39172x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f39173y = rectF4;
            this.f39174z = new RectF(rectF4);
            PointF m70198m = m70198m(rectF);
            PointF m70198m2 = m70198m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m70198m.x, m70198m.y, m70198m2.x, m70198m2.y), false);
            this.f39163o = pathMeasure;
            this.f39164p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.m70161c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m70195p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f39100b = false;
        this.f39101c = false;
        this.f39102d = false;
        this.f39103f = false;
        this.f39104g = 16908290;
        this.f39105h = -1;
        this.f39106i = -1;
        this.f39107j = 0;
        this.f39108k = 0;
        this.f39109l = 0;
        this.f39110m = 1375731712;
        this.f39111n = 0;
        this.f39112o = 0;
        this.f39113p = 0;
        this.f39122y = Build.VERSION.SDK_INT >= 28;
        this.f39123z = -1.0f;
        this.f39099A = -1.0f;
    }

    /* renamed from: c */
    private ProgressThresholdsGroup m70226c(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof MaterialArcMotion)) {
            return m70220i(z, f39095D, f39096E);
        }
        return m70220i(z, f39097F, f39098G);
    }

    /* renamed from: d */
    private static RectF m70225d(View view, @Nullable View view2, float f, float f2) {
        if (view2 != null) {
            RectF m70157g = TransitionUtils.m70157g(view2);
            m70157g.offset(f, f2);
            return m70157g;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    /* renamed from: e */
    private static ShapeAppearanceModel m70224e(@NonNull View view, @NonNull RectF rectF, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.m70162b(m70221h(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: f */
    private static void m70223f(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        RectF m70157g;
        if (i != -1) {
            transitionValues.view = TransitionUtils.m70158f(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i2 = C16310R.C16313id.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                transitionValues.view.setTag(i2, null);
                transitionValues.view = (View) transitionValues.view.getTag(i2);
            }
        }
        View view3 = transitionValues.view;
        if (ViewCompat.isLaidOut(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                m70157g = TransitionUtils.m70156h(view3);
            } else {
                m70157g = TransitionUtils.m70157g(view3);
            }
            transitionValues.values.put("materialContainerTransition:bounds", m70157g);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m70224e(view3, m70157g, shapeAppearanceModel));
        }
    }

    /* renamed from: g */
    private static float m70222g(float f, View view) {
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        return f;
    }

    /* renamed from: h */
    private static ShapeAppearanceModel m70221h(@NonNull View view, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i = C16310R.C16313id.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i);
        }
        Context context = view.getContext();
        int m70219j = m70219j(context);
        if (m70219j != -1) {
            return ShapeAppearanceModel.builder(context, m70219j, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    /* renamed from: i */
    private ProgressThresholdsGroup m70220i(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.m70160d(this.f39118u, progressThresholdsGroup.f39133a), (ProgressThresholds) TransitionUtils.m70160d(this.f39119v, progressThresholdsGroup.f39134b), (ProgressThresholds) TransitionUtils.m70160d(this.f39120w, progressThresholdsGroup.f39135c), (ProgressThresholds) TransitionUtils.m70160d(this.f39121x, progressThresholdsGroup.f39136d));
    }

    @StyleRes
    /* renamed from: j */
    private static int m70219j(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C16310R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    private boolean m70218k(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i = this.f39111n;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f39111n);
        } else if (TransitionUtils.m70163a(rectF2) <= TransitionUtils.m70163a(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: l */
    private void m70217l(Context context, boolean z) {
        int i;
        TransitionUtils.m70147q(this, context, C16310R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            i = C16310R.attr.motionDurationLong2;
        } else {
            i = C16310R.attr.motionDurationMedium4;
        }
        TransitionUtils.m70148p(this, context, i);
        if (!this.f39102d) {
            TransitionUtils.m70146r(this, context, C16310R.attr.motionPath);
        }
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m70223f(transitionValues, this.f39115r, this.f39106i, this.f39117t);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m70223f(transitionValues, this.f39114q, this.f39105h, this.f39116s);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View view;
        final View m70159e;
        View view2;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && shapeAppearanceModel2 != null) {
                    final View view3 = transitionValues.view;
                    final View view4 = transitionValues2.view;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.f39104g == view.getId()) {
                        m70159e = (View) view.getParent();
                        view2 = view;
                    } else {
                        m70159e = TransitionUtils.m70159e(view, this.f39104g);
                        view2 = null;
                    }
                    RectF m70157g = TransitionUtils.m70157g(m70159e);
                    float f = -m70157g.left;
                    float f2 = -m70157g.top;
                    RectF m70225d = m70225d(m70159e, view2, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean m70218k = m70218k(rectF, rectF2);
                    if (!this.f39103f) {
                        m70217l(view.getContext(), m70218k);
                    }
                    final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view3, rectF, shapeAppearanceModel, m70222g(this.f39123z, view3), view4, rectF2, shapeAppearanceModel2, m70222g(this.f39099A, view4), this.f39107j, this.f39108k, this.f39109l, this.f39110m, m70218k, this.f39122y, FadeModeEvaluators.m70239a(this.f39112o, m70218k), FitModeEvaluators.m70234a(this.f39113p, m70218k, rectF, rectF2), m70226c(m70218k), this.f39100b);
                    transitionDrawable.setBounds(Math.round(m70225d.left), Math.round(m70225d.top), Math.round(m70225d.right), Math.round(m70225d.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            transitionDrawable.m70196o(valueAnimator.getAnimatedFraction());
                        }
                    });
                    addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionEnd(@NonNull Transition transition) {
                            MaterialContainerTransform.this.removeListener(this);
                            if (MaterialContainerTransform.this.f39101c) {
                                return;
                            }
                            view3.setAlpha(1.0f);
                            view4.setAlpha(1.0f);
                            ViewUtils.getOverlay(m70159e).remove(transitionDrawable);
                        }

                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionStart(@NonNull Transition transition) {
                            ViewUtils.getOverlay(m70159e).add(transitionDrawable);
                            view3.setAlpha(0.0f);
                            view4.setAlpha(0.0f);
                        }
                    });
                    return ofFloat;
                }
                Log.w(f39093B, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f39093B, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f39107j;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f39104g;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f39109l;
    }

    public float getEndElevation() {
        return this.f39099A;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f39117t;
    }

    @Nullable
    public View getEndView() {
        return this.f39115r;
    }

    @IdRes
    public int getEndViewId() {
        return this.f39106i;
    }

    public int getFadeMode() {
        return this.f39112o;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f39118u;
    }

    public int getFitMode() {
        return this.f39113p;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f39120w;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f39119v;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f39110m;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f39121x;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f39108k;
    }

    public float getStartElevation() {
        return this.f39123z;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f39116s;
    }

    @Nullable
    public View getStartView() {
        return this.f39114q;
    }

    @IdRes
    public int getStartViewId() {
        return this.f39105h;
    }

    public int getTransitionDirection() {
        return this.f39111n;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f39094C;
    }

    public boolean isDrawDebugEnabled() {
        return this.f39100b;
    }

    public boolean isElevationShadowEnabled() {
        return this.f39122y;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f39101c;
    }

    public void setAllContainerColors(@ColorInt int i) {
        this.f39107j = i;
        this.f39108k = i;
        this.f39109l = i;
    }

    public void setContainerColor(@ColorInt int i) {
        this.f39107j = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f39100b = z;
    }

    public void setDrawingViewId(@IdRes int i) {
        this.f39104g = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f39122y = z;
    }

    public void setEndContainerColor(@ColorInt int i) {
        this.f39109l = i;
    }

    public void setEndElevation(float f) {
        this.f39099A = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f39117t = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f39115r = view;
    }

    public void setEndViewId(@IdRes int i) {
        this.f39106i = i;
    }

    public void setFadeMode(int i) {
        this.f39112o = i;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f39118u = progressThresholds;
    }

    public void setFitMode(int i) {
        this.f39113p = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f39101c = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f39102d = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f39120w = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f39119v = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f39110m = i;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f39121x = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i) {
        this.f39108k = i;
    }

    public void setStartElevation(float f) {
        this.f39123z = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f39116s = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f39114q = view;
    }

    public void setStartViewId(@IdRes int i) {
        this.f39105h = i;
    }

    public void setTransitionDirection(int i) {
        this.f39111n = i;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z) {
        this.f39100b = false;
        this.f39101c = false;
        this.f39102d = false;
        this.f39103f = false;
        this.f39104g = 16908290;
        this.f39105h = -1;
        this.f39106i = -1;
        this.f39107j = 0;
        this.f39108k = 0;
        this.f39109l = 0;
        this.f39110m = 1375731712;
        this.f39111n = 0;
        this.f39112o = 0;
        this.f39113p = 0;
        this.f39122y = Build.VERSION.SDK_INT >= 28;
        this.f39123z = -1.0f;
        this.f39099A = -1.0f;
        m70217l(context, z);
        this.f39103f = true;
    }
}
