package com.bytedance.adsdk.ugeno.p207WR.eqN;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* renamed from: com.bytedance.adsdk.ugeno.WR.eqN.IL */
/* loaded from: classes3.dex */
public class C7014IL extends Drawable {

    /* renamed from: Fy */
    private ImageView.ScaleType f15014Fy;

    /* renamed from: Kg */
    private final RectF f15016Kg;

    /* renamed from: Lq */
    private float f15017Lq;

    /* renamed from: PX */
    private Shader.TileMode f15018PX;

    /* renamed from: Ta */
    private Shader.TileMode f15019Ta;

    /* renamed from: VB */
    private final RectF f15020VB;
    private float VzQ;

    /* renamed from: WR */
    private final Paint f15021WR;

    /* renamed from: bX */
    private final RectF f15022bX;

    /* renamed from: eo */
    private final Matrix f15024eo;
    private final Bitmap eqN;

    /* renamed from: iR */
    private final int f15025iR;
    private final int ldr;
    private ColorStateList tuV;

    /* renamed from: vb */
    private final boolean[] f15026vb;
    private boolean xxp;
    private boolean yDt;

    /* renamed from: zx */
    private final Paint f15027zx;

    /* renamed from: bg */
    private final RectF f15023bg = new RectF();

    /* renamed from: IL */
    private final RectF f15015IL = new RectF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.WR.eqN.IL$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C70151 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f15028bg;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f15028bg = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15028bg[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15028bg[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15028bg[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15028bg[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15028bg[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15028bg[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C7014IL(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f15022bX = rectF;
        this.f15016Kg = new RectF();
        this.f15024eo = new Matrix();
        this.f15020VB = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f15018PX = tileMode;
        this.f15019Ta = tileMode;
        this.yDt = true;
        this.f15017Lq = 0.0f;
        this.f15026vb = new boolean[]{true, true, true, true};
        this.xxp = false;
        this.VzQ = 0.0f;
        this.tuV = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f15014Fy = ImageView.ScaleType.FIT_CENTER;
        this.eqN = bitmap;
        int width = bitmap.getWidth();
        this.ldr = width;
        int height = bitmap.getHeight();
        this.f15025iR = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f15027zx = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f15021WR = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tuV.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.VzQ);
    }

    /* renamed from: IL */
    public static Bitmap m90276IL(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    /* renamed from: bg */
    public static C7014IL m90270bg(Bitmap bitmap) {
        if (bitmap != null) {
            return new C7014IL(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.yDt) {
            BitmapShader bitmapShader = new BitmapShader(this.eqN, this.f15018PX, this.f15019Ta);
            Shader.TileMode tileMode = this.f15018PX;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f15019Ta == tileMode2) {
                bitmapShader.setLocalMatrix(this.f15024eo);
            }
            this.f15027zx.setShader(bitmapShader);
            this.yDt = false;
        }
        if (this.xxp) {
            if (this.VzQ > 0.0f) {
                canvas.drawOval(this.f15015IL, this.f15027zx);
                canvas.drawOval(this.f15016Kg, this.f15021WR);
                return;
            }
            canvas.drawOval(this.f15015IL, this.f15027zx);
        } else if (m90264bg(this.f15026vb)) {
            float f = this.f15017Lq;
            if (this.VzQ > 0.0f) {
                canvas.drawRoundRect(this.f15015IL, f, f, this.f15027zx);
                canvas.drawRoundRect(this.f15016Kg, f, f, this.f15021WR);
                m90269bg(canvas);
                m90278IL(canvas);
                return;
            }
            canvas.drawRoundRect(this.f15015IL, f, f, this.f15027zx);
            m90269bg(canvas);
        } else {
            canvas.drawRect(this.f15015IL, this.f15027zx);
            if (this.VzQ > 0.0f) {
                canvas.drawRect(this.f15016Kg, this.f15021WR);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15027zx.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f15027zx.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15025iR;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.ldr;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tuV.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15023bg.set(rect);
        m90274bg();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.tuV.getColorForState(iArr, 0);
        if (this.f15021WR.getColor() != colorForState) {
            this.f15021WR.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f15027zx.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15027zx.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f15027zx.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f15027zx.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: bg */
    public static Drawable m90267bg(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C7014IL) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m90267bg(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap m90276IL = m90276IL(drawable);
        return m90276IL != null ? new C7014IL(m90276IL) : drawable;
    }

    /* renamed from: IL */
    private void m90278IL(Canvas canvas) {
        float f;
        if (m90275IL(this.f15026vb) || this.f15017Lq == 0.0f) {
            return;
        }
        RectF rectF = this.f15015IL;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width() + f2;
        float height = f3 + this.f15015IL.height();
        float f4 = this.f15017Lq;
        float f5 = this.VzQ / 2.0f;
        if (!this.f15026vb[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.f15021WR);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.f15021WR);
        }
        if (!this.f15026vb[1]) {
            canvas.drawLine((width - f4) - f5, f3, width, f3, this.f15021WR);
            canvas.drawLine(width, f3 - f5, width, f3 + f4, this.f15021WR);
        }
        if (this.f15026vb[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((width - f4) - f5, height, width + f5, height, this.f15021WR);
            canvas.drawLine(width, height - f, width, height, this.f15021WR);
        }
        if (this.f15026vb[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, height, f2 + f, height, this.f15021WR);
        canvas.drawLine(f2, height - f, f2, height, this.f15021WR);
    }

    /* renamed from: bg */
    private void m90274bg() {
        float width;
        float height;
        int i = C70151.f15028bg[this.f15014Fy.ordinal()];
        if (i == 1) {
            this.f15016Kg.set(this.f15023bg);
            RectF rectF = this.f15016Kg;
            float f = this.VzQ;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f15024eo.reset();
            this.f15024eo.setTranslate((int) (((this.f15016Kg.width() - this.ldr) * 0.5f) + 0.5f), (int) (((this.f15016Kg.height() - this.f15025iR) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.f15016Kg.set(this.f15023bg);
            RectF rectF2 = this.f15016Kg;
            float f2 = this.VzQ;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f15024eo.reset();
            float f3 = 0.0f;
            if (this.ldr * this.f15016Kg.height() > this.f15016Kg.width() * this.f15025iR) {
                width = this.f15016Kg.height() / this.f15025iR;
                height = 0.0f;
                f3 = (this.f15016Kg.width() - (this.ldr * width)) * 0.5f;
            } else {
                width = this.f15016Kg.width() / this.ldr;
                height = (this.f15016Kg.height() - (this.f15025iR * width)) * 0.5f;
            }
            this.f15024eo.setScale(width, width);
            Matrix matrix = this.f15024eo;
            float f4 = this.VzQ;
            matrix.postTranslate(((int) (f3 + 0.5f)) + (f4 / 2.0f), ((int) (height + 0.5f)) + (f4 / 2.0f));
        } else if (i == 3) {
            this.f15024eo.reset();
            float min = (((float) this.ldr) > this.f15023bg.width() || ((float) this.f15025iR) > this.f15023bg.height()) ? Math.min(this.f15023bg.width() / this.ldr, this.f15023bg.height() / this.f15025iR) : 1.0f;
            this.f15024eo.setScale(min, min);
            this.f15024eo.postTranslate((int) (((this.f15023bg.width() - (this.ldr * min)) * 0.5f) + 0.5f), (int) (((this.f15023bg.height() - (this.f15025iR * min)) * 0.5f) + 0.5f));
            this.f15016Kg.set(this.f15022bX);
            this.f15024eo.mapRect(this.f15016Kg);
            RectF rectF3 = this.f15016Kg;
            float f5 = this.VzQ;
            rectF3.inset(f5 / 2.0f, f5 / 2.0f);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15016Kg, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f15016Kg.set(this.f15022bX);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15023bg, Matrix.ScaleToFit.END);
            this.f15024eo.mapRect(this.f15016Kg);
            RectF rectF4 = this.f15016Kg;
            float f6 = this.VzQ;
            rectF4.inset(f6 / 2.0f, f6 / 2.0f);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15016Kg, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.f15016Kg.set(this.f15022bX);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15023bg, Matrix.ScaleToFit.START);
            this.f15024eo.mapRect(this.f15016Kg);
            RectF rectF5 = this.f15016Kg;
            float f7 = this.VzQ;
            rectF5.inset(f7 / 2.0f, f7 / 2.0f);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15016Kg, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.f15016Kg.set(this.f15022bX);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15023bg, Matrix.ScaleToFit.CENTER);
            this.f15024eo.mapRect(this.f15016Kg);
            RectF rectF6 = this.f15016Kg;
            float f8 = this.VzQ;
            rectF6.inset(f8 / 2.0f, f8 / 2.0f);
            this.f15024eo.setRectToRect(this.f15022bX, this.f15016Kg, Matrix.ScaleToFit.FILL);
        } else {
            this.f15016Kg.set(this.f15023bg);
            RectF rectF7 = this.f15016Kg;
            float f9 = this.VzQ;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.f15024eo.reset();
            this.f15024eo.setRectToRect(this.f15022bX, this.f15016Kg, Matrix.ScaleToFit.FILL);
        }
        this.f15015IL.set(this.f15016Kg);
        this.yDt = true;
    }

    /* renamed from: IL */
    public C7014IL m90277IL(Shader.TileMode tileMode) {
        if (this.f15019Ta != tileMode) {
            this.f15019Ta = tileMode;
            this.yDt = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: IL */
    private static boolean m90275IL(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bg */
    private void m90269bg(Canvas canvas) {
        if (m90275IL(this.f15026vb) || this.f15017Lq == 0.0f) {
            return;
        }
        RectF rectF = this.f15015IL;
        float f = rectF.left;
        float f2 = rectF.top;
        float width = rectF.width() + f;
        float height = this.f15015IL.height() + f2;
        float f3 = this.f15017Lq;
        if (!this.f15026vb[0]) {
            this.f15020VB.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f15020VB, this.f15027zx);
        }
        if (!this.f15026vb[1]) {
            this.f15020VB.set(width - f3, f2, width, f3);
            canvas.drawRect(this.f15020VB, this.f15027zx);
        }
        if (!this.f15026vb[2]) {
            this.f15020VB.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.f15020VB, this.f15027zx);
        }
        if (this.f15026vb[3]) {
            return;
        }
        this.f15020VB.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.f15020VB, this.f15027zx);
    }

    /* renamed from: bg */
    public C7014IL m90272bg(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.f15017Lq = floatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
                }
            } else {
                this.f15017Lq = 0.0f;
            }
            boolean[] zArr = this.f15026vb;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            zArr[3] = f4 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    /* renamed from: bg */
    public C7014IL m90273bg(float f) {
        this.VzQ = f;
        this.f15021WR.setStrokeWidth(f);
        return this;
    }

    /* renamed from: bg */
    public C7014IL m90271bg(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.tuV = colorStateList;
        this.f15021WR.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    /* renamed from: bg */
    public C7014IL m90265bg(boolean z) {
        this.xxp = z;
        return this;
    }

    /* renamed from: bg */
    public C7014IL m90266bg(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f15014Fy != scaleType) {
            this.f15014Fy = scaleType;
            m90274bg();
        }
        return this;
    }

    /* renamed from: bg */
    public C7014IL m90268bg(Shader.TileMode tileMode) {
        if (this.f15018PX != tileMode) {
            this.f15018PX = tileMode;
            this.yDt = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: bg */
    private static boolean m90264bg(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
