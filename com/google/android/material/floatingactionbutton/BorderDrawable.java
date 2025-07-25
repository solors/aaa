package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class BorderDrawable extends Drawable {
    @NonNull

    /* renamed from: b */
    private final Paint f37493b;
    @Dimension

    /* renamed from: h */
    float f37499h;
    @ColorInt

    /* renamed from: i */
    private int f37500i;
    @ColorInt

    /* renamed from: j */
    private int f37501j;
    @ColorInt

    /* renamed from: k */
    private int f37502k;
    @ColorInt

    /* renamed from: l */
    private int f37503l;
    @ColorInt

    /* renamed from: m */
    private int f37504m;

    /* renamed from: o */
    private ShapeAppearanceModel f37506o;
    @Nullable

    /* renamed from: p */
    private ColorStateList f37507p;

    /* renamed from: a */
    private final ShapeAppearancePathProvider f37492a = ShapeAppearancePathProvider.getInstance();

    /* renamed from: c */
    private final Path f37494c = new Path();

    /* renamed from: d */
    private final Rect f37495d = new Rect();

    /* renamed from: e */
    private final RectF f37496e = new RectF();

    /* renamed from: f */
    private final RectF f37497f = new RectF();

    /* renamed from: g */
    private final BorderState f37498g = new BorderState();

    /* renamed from: n */
    private boolean f37505n = true;

    /* loaded from: classes5.dex */
    private class BorderState extends Drawable.ConstantState {
        private BorderState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f37506o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f37493b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    /* renamed from: a */
    private Shader m71473a() {
        Rect rect = this.f37495d;
        copyBounds(rect);
        float height = this.f37499h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f37500i, this.f37504m), ColorUtils.compositeColors(this.f37501j, this.f37504m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f37501j, 0), this.f37504m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f37503l, 0), this.f37504m), ColorUtils.compositeColors(this.f37503l, this.f37504m), ColorUtils.compositeColors(this.f37502k, this.f37504m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    /* renamed from: b */
    protected RectF m71472b() {
        this.f37497f.set(getBounds());
        return this.f37497f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m71471c(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f37504m = colorStateList.getColorForState(getState(), this.f37504m);
        }
        this.f37507p = colorStateList;
        this.f37505n = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m71470d(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this.f37500i = i;
        this.f37501j = i2;
        this.f37502k = i3;
        this.f37503l = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f37505n) {
            this.f37493b.setShader(m71473a());
            this.f37505n = false;
        }
        float strokeWidth = this.f37493b.getStrokeWidth() / 2.0f;
        copyBounds(this.f37495d);
        this.f37496e.set(this.f37495d);
        float min = Math.min(this.f37506o.getTopLeftCornerSize().getCornerSize(m71472b()), this.f37496e.width() / 2.0f);
        if (this.f37506o.isRoundRect(m71472b())) {
            this.f37496e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f37496e, min, min, this.f37493b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f37498g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f37499h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f37506o.isRoundRect(m71472b())) {
            outline.setRoundRect(getBounds(), this.f37506o.getTopLeftCornerSize().getCornerSize(m71472b()));
            return;
        }
        copyBounds(this.f37495d);
        this.f37496e.set(this.f37495d);
        this.f37492a.calculatePath(this.f37506o, 1.0f, this.f37496e, this.f37494c);
        if (this.f37494c.isConvex()) {
            outline.setConvexPath(this.f37494c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (this.f37506o.isRoundRect(m71472b())) {
            int round = Math.round(this.f37499h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f37506o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f37507p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f37505n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f37507p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f37504m)) != this.f37504m) {
            this.f37505n = true;
            this.f37504m = colorForState;
        }
        if (this.f37505n) {
            invalidateSelf();
        }
        return this.f37505n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m105510to = 255) int i) {
        this.f37493b.setAlpha(i);
        invalidateSelf();
    }

    public void setBorderWidth(@Dimension float f) {
        if (this.f37499h != f) {
            this.f37499h = f;
            this.f37493b.setStrokeWidth(f * 1.3333f);
            this.f37505n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f37493b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.f37506o = shapeAppearanceModel;
        invalidateSelf();
    }
}
