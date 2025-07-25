package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes5.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {

    /* renamed from: A */
    private static final Paint f38162A;
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;

    /* renamed from: z */
    private static final String f38163z = "MaterialShapeDrawable";

    /* renamed from: b */
    private MaterialShapeDrawableState f38164b;

    /* renamed from: c */
    private final ShapePath.ShadowCompatOperation[] f38165c;

    /* renamed from: d */
    private final ShapePath.ShadowCompatOperation[] f38166d;

    /* renamed from: f */
    private final BitSet f38167f;

    /* renamed from: g */
    private boolean f38168g;

    /* renamed from: h */
    private final Matrix f38169h;

    /* renamed from: i */
    private final Path f38170i;

    /* renamed from: j */
    private final Path f38171j;

    /* renamed from: k */
    private final RectF f38172k;

    /* renamed from: l */
    private final RectF f38173l;

    /* renamed from: m */
    private final Region f38174m;

    /* renamed from: n */
    private final Region f38175n;

    /* renamed from: o */
    private ShapeAppearanceModel f38176o;

    /* renamed from: p */
    private final Paint f38177p;

    /* renamed from: q */
    private final Paint f38178q;

    /* renamed from: r */
    private final ShadowRenderer f38179r;
    @NonNull

    /* renamed from: s */
    private final ShapeAppearancePathProvider.PathListener f38180s;

    /* renamed from: t */
    private final ShapeAppearancePathProvider f38181t;
    @Nullable

    /* renamed from: u */
    private PorterDuffColorFilter f38182u;
    @Nullable

    /* renamed from: v */
    private PorterDuffColorFilter f38183v;

    /* renamed from: w */
    private int f38184w;
    @NonNull

    /* renamed from: x */
    private final RectF f38185x;

    /* renamed from: y */
    private boolean f38186y;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CompatibilityShadowMode {
    }

    static {
        Paint paint = new Paint(1);
        f38162A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: A */
    private boolean m71109A(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f38164b.fillColor != null && color2 != (colorForState2 = this.f38164b.fillColor.getColorForState(iArr, (color2 = this.f38177p.getColor())))) {
            this.f38177p.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.f38164b.strokeColor != null && color != (colorForState = this.f38164b.strokeColor.getColorForState(iArr, (color = this.f38178q.getColor())))) {
            this.f38178q.setColor(colorForState);
            return true;
        }
        return z;
    }

    /* renamed from: B */
    private boolean m71108B() {
        PorterDuffColorFilter porterDuffColorFilter = this.f38182u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f38183v;
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        this.f38182u = m71097j(materialShapeDrawableState.tintList, materialShapeDrawableState.tintMode, this.f38177p, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f38164b;
        this.f38183v = m71097j(materialShapeDrawableState2.strokeTintList, materialShapeDrawableState2.tintMode, this.f38178q, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f38164b;
        if (materialShapeDrawableState3.useTintColorForShadow) {
            this.f38179r.setShadowColor(materialShapeDrawableState3.tintList.getColorForState(getState(), 0));
        }
        if (!ObjectsCompat.equals(porterDuffColorFilter, this.f38182u) || !ObjectsCompat.equals(porterDuffColorFilter2, this.f38183v)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m71107C() {
        float z = getZ();
        this.f38164b.shadowCompatRadius = (int) Math.ceil(0.75f * z);
        this.f38164b.shadowCompatOffset = (int) Math.ceil(z * 0.25f);
        m71108B();
        m71085w();
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    @Nullable
    /* renamed from: e */
    private PorterDuffColorFilter m71102e(@NonNull Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int m71096k = m71096k(color);
            this.f38184w = m71096k;
            if (m71096k != color) {
                return new PorterDuffColorFilter(m71096k, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    private void m71101f(@NonNull RectF rectF, @NonNull Path path) {
        m71100g(rectF, path);
        if (this.f38164b.scale != 1.0f) {
            this.f38169h.reset();
            Matrix matrix = this.f38169h;
            float f = this.f38164b.scale;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f38169h);
        }
        path.computeBounds(this.f38185x, true);
    }

    /* renamed from: h */
    private void m71099h() {
        final float f = -m71089s();
        ShapeAppearanceModel withTransformedCornerSizes = getShapeAppearanceModel().withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                if (!(cornerSize instanceof RelativeCornerSize)) {
                    return new AdjustedCornerSize(f, cornerSize);
                }
                return cornerSize;
            }
        });
        this.f38176o = withTransformedCornerSizes;
        this.f38181t.calculatePath(withTransformedCornerSizes, this.f38164b.interpolation, m71090r(), this.f38171j);
    }

    @NonNull
    /* renamed from: i */
    private PorterDuffColorFilter m71098i(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m71096k(colorForState);
        }
        this.f38184w = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    /* renamed from: j */
    private PorterDuffColorFilter m71097j(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m71098i(colorStateList, mode, z);
        }
        return m71102e(paint, z);
    }

    /* renamed from: l */
    private void m71095l(@NonNull Canvas canvas) {
        if (this.f38167f.cardinality() > 0) {
            Log.w(f38163z, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f38164b.shadowCompatOffset != 0) {
            canvas.drawPath(this.f38170i, this.f38179r.getShadowPaint());
        }
        for (int i = 0; i < 4; i++) {
            this.f38165c[i].draw(this.f38179r, this.f38164b.shadowCompatRadius, canvas);
            this.f38166d[i].draw(this.f38179r, this.f38164b.shadowCompatRadius, canvas);
        }
        if (this.f38186y) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f38170i, f38162A);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    /* renamed from: m */
    private void m71094m(@NonNull Canvas canvas) {
        m71092o(canvas, this.f38177p, this.f38170i, this.f38164b.shapeAppearanceModel, m71091q());
    }

    /* renamed from: o */
    private void m71092o(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
        if (shapeAppearanceModel.isRoundRect(rectF)) {
            float cornerSize = shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) * this.f38164b.interpolation;
            canvas.drawRoundRect(rectF, cornerSize, cornerSize, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    @NonNull
    /* renamed from: r */
    private RectF m71090r() {
        this.f38173l.set(m71091q());
        float m71089s = m71089s();
        this.f38173l.inset(m71089s, m71089s);
        return this.f38173l;
    }

    /* renamed from: s */
    private float m71089s() {
        if (m71086v()) {
            return this.f38178q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: t */
    private boolean m71088t() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        int i = materialShapeDrawableState.shadowCompatMode;
        if (i != 1 && materialShapeDrawableState.shadowCompatRadius > 0 && (i == 2 || requiresCompatShadow())) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private boolean m71087u() {
        Paint.Style style = this.f38164b.paintStyle;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m71086v() {
        Paint.Style style = this.f38164b.paintStyle;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f38178q.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private void m71085w() {
        super.invalidateSelf();
    }

    /* renamed from: x */
    private void m71084x(@NonNull Canvas canvas) {
        if (!m71088t()) {
            return;
        }
        canvas.save();
        m71082z(canvas);
        if (!this.f38186y) {
            m71095l(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f38185x.width() - getBounds().width());
        int height = (int) (this.f38185x.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f38185x.width()) + (this.f38164b.shadowCompatRadius * 2) + width, ((int) this.f38185x.height()) + (this.f38164b.shadowCompatRadius * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f38164b.shadowCompatRadius) - width;
            float f2 = (getBounds().top - this.f38164b.shadowCompatRadius) - height;
            canvas2.translate(-f, -f2);
            m71095l(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    /* renamed from: y */
    private static int m71083y(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: z */
    private void m71082z(@NonNull Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f38177p.setColorFilter(this.f38182u);
        int alpha = this.f38177p.getAlpha();
        this.f38177p.setAlpha(m71083y(alpha, this.f38164b.alpha));
        this.f38178q.setColorFilter(this.f38183v);
        this.f38178q.setStrokeWidth(this.f38164b.strokeWidth);
        int alpha2 = this.f38178q.getAlpha();
        this.f38178q.setAlpha(m71083y(alpha2, this.f38164b.alpha));
        if (this.f38168g) {
            m71099h();
            m71101f(m71091q(), this.f38170i);
            this.f38168g = false;
        }
        m71084x(canvas);
        if (m71087u()) {
            m71094m(canvas);
        }
        if (m71086v()) {
            mo70734p(canvas);
        }
        this.f38177p.setAlpha(alpha);
        this.f38178q.setAlpha(alpha2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public final void m71100g(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f38181t;
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        shapeAppearancePathProvider.calculatePath(materialShapeDrawableState.shapeAppearanceModel, materialShapeDrawableState.interpolation, rectF, this.f38180s, path);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38164b.alpha;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.f38164b.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(m71091q());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.f38164b.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(m71091q());
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f38164b;
    }

    public float getElevation() {
        return this.f38164b.elevation;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.f38164b.fillColor;
    }

    public float getInterpolation() {
        return this.f38164b.interpolation;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f38164b.shadowCompatMode == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.f38164b.interpolation);
            return;
        }
        m71101f(m71091q(), this.f38170i);
        if (this.f38170i.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f38170i);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f38164b.padding;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public Paint.Style getPaintStyle() {
        return this.f38164b.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.f38164b.parentAbsoluteElevation;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, @NonNull Path path) {
        m71100g(new RectF(0.0f, 0.0f, i, i2), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.f38184w;
    }

    public float getScale() {
        return this.f38164b.scale;
    }

    public int getShadowCompatRotation() {
        return this.f38164b.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.f38164b.shadowCompatMode;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        return (int) (materialShapeDrawableState.shadowCompatOffset * Math.sin(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)));
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        return (int) (materialShapeDrawableState.shadowCompatOffset * Math.cos(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)));
    }

    public int getShadowRadius() {
        return this.f38164b.shadowCompatRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.f38164b.shadowCompatOffset;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f38164b.shapeAppearanceModel;
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f38164b.strokeColor;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.f38164b.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.f38164b.strokeWidth;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.f38164b.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.f38164b.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(m71091q());
    }

    public float getTopRightCornerResolvedSize() {
        return this.f38164b.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(m71091q());
    }

    public float getTranslationZ() {
        return this.f38164b.translationZ;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f38174m.set(getBounds());
        m71101f(m71091q(), this.f38170i);
        this.f38175n.setPath(this.f38170i, this.f38174m);
        this.f38174m.op(this.f38175n, Region.Op.DIFFERENCE);
        return this.f38174m;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    public void initializeElevationOverlay(Context context) {
        this.f38164b.elevationOverlayProvider = new ElevationOverlayProvider(context);
        m71107C();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f38168g = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.f38164b.elevationOverlayProvider;
        if (elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isElevationOverlayInitialized() {
        if (this.f38164b.elevationOverlayProvider != null) {
            return true;
        }
        return false;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        return this.f38164b.shapeAppearanceModel.isRoundRect(m71091q());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.f38164b.shadowCompatMode;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f38164b.tintList) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f38164b.strokeTintList) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f38164b.strokeColor) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f38164b.fillColor) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public int m71096k(@ColorInt int i) {
        float z = getZ() + getParentAbsoluteElevation();
        ElevationOverlayProvider elevationOverlayProvider = this.f38164b.elevationOverlayProvider;
        if (elevationOverlayProvider != null) {
            return elevationOverlayProvider.compositeOverlayIfNeeded(i, z);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f38164b = new MaterialShapeDrawableState(this.f38164b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public void m71093n(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        m71092o(canvas, paint, path, this.f38164b.shapeAppearanceModel, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f38168g = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m71109A = m71109A(iArr);
        boolean m71108B = m71108B();
        if (!m71109A && !m71108B) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public void mo70734p(@NonNull Canvas canvas) {
        m71092o(canvas, this.f38178q, this.f38171j, this.f38176o, m71090r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    /* renamed from: q */
    public RectF m71091q() {
        this.f38172k.set(getBounds());
        return this.f38172k;
    }

    public boolean requiresCompatShadow() {
        int i = Build.VERSION.SDK_INT;
        if (!isRoundRect() && !this.f38170i.isConvex() && i < 29) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m105510to = 255) int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.alpha != i) {
            materialShapeDrawableState.alpha = i;
            m71085w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f38164b.colorFilter = colorFilter;
        m71085w();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.f38164b.shapeAppearanceModel.withCornerSize(f));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.f38181t.m71051k(z);
    }

    public void setElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.elevation != f) {
            materialShapeDrawableState.elevation = f;
            m71107C();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.fillColor != colorStateList) {
            materialShapeDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.interpolation != f) {
            materialShapeDrawableState.interpolation = f;
            this.f38168g = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.padding == null) {
            materialShapeDrawableState.padding = new Rect();
        }
        this.f38164b.padding.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f38164b.paintStyle = style;
        m71085w();
    }

    public void setParentAbsoluteElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.parentAbsoluteElevation != f) {
            materialShapeDrawableState.parentAbsoluteElevation = f;
            m71107C();
        }
    }

    public void setScale(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.scale != f) {
            materialShapeDrawableState.scale = f;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z) {
        this.f38186y = z;
    }

    public void setShadowColor(int i) {
        this.f38179r.setShadowColor(i);
        this.f38164b.useTintColorForShadow = false;
        m71085w();
    }

    public void setShadowCompatRotation(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.shadowCompatRotation != i) {
            materialShapeDrawableState.shadowCompatRotation = i;
            m71085w();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.shadowCompatMode != i) {
            materialShapeDrawableState.shadowCompatMode = i;
            m71085w();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation(i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.f38164b.shadowCompatRadius = i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.shadowCompatOffset != i) {
            materialShapeDrawableState.shadowCompatOffset = i;
            m71085w();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f38164b.shapeAppearanceModel = shapeAppearanceModel;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f, @ColorInt int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.strokeColor != colorStateList) {
            materialShapeDrawableState.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f38164b.strokeTintList = colorStateList;
        m71108B();
        m71085w();
    }

    public void setStrokeWidth(float f) {
        this.f38164b.strokeWidth = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f38164b.tintList = colorStateList;
        m71108B();
        m71085w();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.tintMode != mode) {
            materialShapeDrawableState.tintMode = mode;
            m71108B();
            m71085w();
        }
    }

    public void setTranslationZ(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.translationZ != f) {
            materialShapeDrawableState.translationZ = f;
            m71107C();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f38164b;
        if (materialShapeDrawableState.useTintColorForShadow != z) {
            materialShapeDrawableState.useTintColorForShadow = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f) {
        int color = MaterialColors.getColor(context, C16310R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        materialShapeDrawable.setElevation(f);
        return materialShapeDrawable;
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.f38164b.shapeAppearanceModel.withCornerSize(cornerSize));
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i, i2).build());
    }

    public void setStroke(float f, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    public void setStrokeTint(@ColorInt int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    private MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f38165c = new ShapePath.ShadowCompatOperation[4];
        this.f38166d = new ShapePath.ShadowCompatOperation[4];
        this.f38167f = new BitSet(8);
        this.f38169h = new Matrix();
        this.f38170i = new Path();
        this.f38171j = new Path();
        this.f38172k = new RectF();
        this.f38173l = new RectF();
        this.f38174m = new Region();
        this.f38175n = new Region();
        Paint paint = new Paint(1);
        this.f38177p = paint;
        Paint paint2 = new Paint(1);
        this.f38178q = paint2;
        this.f38179r = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.getInstance();
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.f38181t = shapeAppearancePathProvider;
        this.f38185x = new RectF();
        this.f38186y = true;
        this.f38164b = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m71108B();
        m71109A(getState());
        this.f38180s = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f38167f.set(i, shapePath.m71047c());
                MaterialShapeDrawable.this.f38165c[i] = shapePath.m71046d(matrix);
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f38167f.set(i + 4, shapePath.m71047c());
                MaterialShapeDrawable.this.f38166d[i] = shapePath.m71046d(matrix);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class MaterialShapeDrawableState extends Drawable.ConstantState {
        public int alpha;
        @Nullable
        public ColorFilter colorFilter;
        public float elevation;
        @Nullable
        public ElevationOverlayProvider elevationOverlayProvider;
        @Nullable
        public ColorStateList fillColor;
        public float interpolation;
        @Nullable
        public Rect padding;
        public Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public int shadowCompatRotation;
        @NonNull
        public ShapeAppearanceModel shapeAppearanceModel;
        @Nullable
        public ColorStateList strokeColor;
        @Nullable
        public ColorStateList strokeTintList;
        public float strokeWidth;
        @Nullable
        public ColorStateList tintList;
        @Nullable
        public PorterDuff.Mode tintMode;
        public float translationZ;
        public boolean useTintColorForShadow;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.elevationOverlayProvider = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f38168g = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = materialShapeDrawableState.shapeAppearanceModel;
            this.elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
            this.strokeWidth = materialShapeDrawableState.strokeWidth;
            this.colorFilter = materialShapeDrawableState.colorFilter;
            this.fillColor = materialShapeDrawableState.fillColor;
            this.strokeColor = materialShapeDrawableState.strokeColor;
            this.tintMode = materialShapeDrawableState.tintMode;
            this.tintList = materialShapeDrawableState.tintList;
            this.alpha = materialShapeDrawableState.alpha;
            this.scale = materialShapeDrawableState.scale;
            this.shadowCompatOffset = materialShapeDrawableState.shadowCompatOffset;
            this.shadowCompatMode = materialShapeDrawableState.shadowCompatMode;
            this.useTintColorForShadow = materialShapeDrawableState.useTintColorForShadow;
            this.interpolation = materialShapeDrawableState.interpolation;
            this.parentAbsoluteElevation = materialShapeDrawableState.parentAbsoluteElevation;
            this.elevation = materialShapeDrawableState.elevation;
            this.translationZ = materialShapeDrawableState.translationZ;
            this.shadowCompatRadius = materialShapeDrawableState.shadowCompatRadius;
            this.shadowCompatRotation = materialShapeDrawableState.shadowCompatRotation;
            this.strokeTintList = materialShapeDrawableState.strokeTintList;
            this.paintStyle = materialShapeDrawableState.paintStyle;
            if (materialShapeDrawableState.padding != null) {
                this.padding = new Rect(materialShapeDrawableState.padding);
            }
        }
    }
}
