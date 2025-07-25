package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.PathParser;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

@RequiresApi(21)
/* loaded from: classes5.dex */
class TransitionUtils {

    /* renamed from: a */
    private static final RectF f39221a = new RectF();

    /* loaded from: classes5.dex */
    interface CanvasOperation {
        void run(Canvas canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m70163a(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ShapeAppearanceModel m70162b(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                if (!(cornerSize instanceof RelativeCornerSize)) {
                    return new RelativeCornerSize(cornerSize.getCornerSize(rectF) / rectF.height());
                }
                return cornerSize;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Shader m70161c(@ColorInt int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public static <T> T m70160d(@Nullable T t, @NonNull T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static View m70159e(View view, @IdRes int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() == i) {
                return view;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static View m70158f(View view, @IdRes int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m70159e(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static RectF m70157g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static RectF m70156h(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Rect m70155i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    private static boolean m70154j(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static float m70153k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static float m70152l(float f, float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f3, @FloatRange(from = 0.0d, m105511to = 1.0d) float f4, @FloatRange(from = 0.0d, m105511to = 1.0d) float f5) {
        return m70151m(f, f2, f3, f4, f5, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static float m70151m(float f, float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f3, @FloatRange(from = 0.0d, m105511to = 1.0d) float f4, @FloatRange(from = 0.0d) float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m70153k(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m70153k(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m70150n(int i, int i2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) m70153k(i, i2, (f3 - f) / (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static ShapeAppearanceModel m70149o(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, @FloatRange(from = 0.0d, m105511to = 1.0d) final float f, @FloatRange(from = 0.0d, m105511to = 1.0d) final float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) final float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        if (f3 > f2) {
            return shapeAppearanceModel2;
        }
        return m70142v(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.2
            @Override // com.google.android.material.transition.platform.TransitionUtils.CornerSizeBinaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.m70152l(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f, f2, f3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static boolean m70148p(Transition transition, Context context, @AttrRes int i) {
        int resolveThemeDuration;
        if (i != 0 && transition.getDuration() == -1 && (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i, -1)) != -1) {
            transition.setDuration(resolveThemeDuration);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static boolean m70147q(Transition transition, Context context, @AttrRes int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m70146r(Transition transition, Context context, @AttrRes int i) {
        PathMotion m70145s;
        if (i != 0 && (m70145s = m70145s(context, i)) != null) {
            transition.setPathMotion(m70145s);
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: s */
    static PathMotion m70145s(Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: t */
    private static int m70144t(Canvas canvas, Rect rect, int i) {
        RectF rectF = f39221a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m70143u(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            m70144t(canvas, rect, i);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: v */
    static ShapeAppearanceModel m70142v(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        ShapeAppearanceModel shapeAppearanceModel3;
        if (m70154j(shapeAppearanceModel, rectF)) {
            shapeAppearanceModel3 = shapeAppearanceModel;
        } else {
            shapeAppearanceModel3 = shapeAppearanceModel2;
        }
        return shapeAppearanceModel3.toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
