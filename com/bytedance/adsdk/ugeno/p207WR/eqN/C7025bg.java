package com.bytedance.adsdk.ugeno.p207WR.eqN;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.p214bg.C7054ldr;
import com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx;

/* renamed from: com.bytedance.adsdk.ugeno.WR.eqN.bg */
/* loaded from: classes3.dex */
public class C7025bg extends ImageView implements InterfaceC7055zx, IAnimation {

    /* renamed from: IL */
    static final /* synthetic */ boolean f15041IL = true;

    /* renamed from: bg */
    public static final Shader.TileMode f15042bg = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] eqN = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: Fy */
    private InterfaceC7032bX f15043Fy;

    /* renamed from: Kg */
    private float f15044Kg;

    /* renamed from: LZ */
    private C7054ldr f15045LZ;

    /* renamed from: Lq */
    private int f15046Lq;

    /* renamed from: PX */
    private boolean f15047PX;

    /* renamed from: Ta */
    private boolean f15048Ta;

    /* renamed from: VB */
    private Drawable f15049VB;
    private Shader.TileMode VzQ;

    /* renamed from: WR */
    private ColorFilter f15050WR;

    /* renamed from: bX */
    private float f15051bX;

    /* renamed from: eo */
    private boolean f15052eo;

    /* renamed from: iR */
    private ColorStateList f15053iR;
    private Drawable ldr;
    private Shader.TileMode tuV;

    /* renamed from: vb */
    private int f15054vb;
    private ImageView.ScaleType xxp;
    private boolean yDt;

    /* renamed from: zx */
    private final float[] f15055zx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.WR.eqN.bg$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C70261 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f15056bg;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f15056bg = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15056bg[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15056bg[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15056bg[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15056bg[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15056bg[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15056bg[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C7025bg(Context context) {
        super(context);
        this.f15055zx = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f15053iR = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f15044Kg = 0.0f;
        this.f15050WR = null;
        this.f15052eo = false;
        this.f15047PX = false;
        this.f15048Ta = false;
        this.yDt = false;
        Shader.TileMode tileMode = f15042bg;
        this.VzQ = tileMode;
        this.tuV = tileMode;
        this.f15045LZ = new C7054ldr(this);
    }

    /* renamed from: IL */
    private Drawable m90248IL() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f15054vb;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f15054vb, e);
                this.f15054vb = 0;
            }
        }
        return C7014IL.m90267bg(drawable);
    }

    /* renamed from: bX */
    private void m90247bX() {
        m90244bg(this.f15049VB, this.xxp);
    }

    /* renamed from: bg */
    private Drawable m90246bg() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f15046Lq;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f15046Lq, e);
                this.f15046Lq = 0;
            }
        }
        return C7014IL.m90267bg(drawable);
    }

    private void eqN() {
        Drawable drawable = this.f15049VB;
        if (drawable != null && this.f15052eo) {
            Drawable mutate = drawable.mutate();
            this.f15049VB = mutate;
            if (this.f15047PX) {
                mutate.setColorFilter(this.f15050WR);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f15053iR.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f15053iR;
    }

    public float getBorderRadius() {
        return this.f15045LZ.m90177bg();
    }

    public float getBorderWidth() {
        return this.f15044Kg;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.f15055zx) {
            f = Math.max(f2, f);
        }
        return f;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.f15051bX;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getRubIn() {
        return this.f15045LZ.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.xxp;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getShine() {
        return this.f15045LZ.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getStretch() {
        return this.f15045LZ.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.VzQ;
    }

    public Shader.TileMode getTileModeY() {
        return this.tuV;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90224bg(canvas, this);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90226bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            int[] mo90227bg = interfaceC7032bX.mo90227bg(i, i2);
            super.onMeasure(mo90227bg[0], mo90227bg[1]);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX = this.f15043Fy;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90229IL(i, i2, i3, i3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.ldr = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.ldr = drawable;
        m90242bg(true);
        super.setBackgroundDrawable(this.ldr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.f15054vb != i) {
            this.f15054vb = i;
            Drawable m90248IL = m90248IL();
            this.ldr = m90248IL;
            setBackgroundDrawable(m90248IL);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderRadius(float f) {
        C7054ldr c7054ldr = this.f15045LZ;
        if (c7054ldr != null) {
            c7054ldr.m90176bg(f);
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f15050WR != colorFilter) {
            this.f15050WR = colorFilter;
            this.f15047PX = true;
            this.f15052eo = true;
            eqN();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m90245bg(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        m90245bg(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f15046Lq = 0;
        this.f15049VB = C7014IL.m90270bg(bitmap);
        m90247bX();
        super.setImageDrawable(this.f15049VB);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f15046Lq = 0;
        this.f15049VB = C7014IL.m90267bg(drawable);
        m90247bX();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f15046Lq != i) {
            this.f15046Lq = i;
            this.f15049VB = m90246bg();
            m90247bX();
            super.setImageDrawable(this.f15049VB);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f15048Ta = z;
        m90247bX();
        m90242bg(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.f15051bX = f;
        C7054ldr c7054ldr = this.f15045LZ;
        if (c7054ldr != null) {
            c7054ldr.m90179IL(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C7054ldr c7054ldr = this.f15045LZ;
        if (c7054ldr != null) {
            c7054ldr.m90174zx(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f15041IL && scaleType == null) {
            throw new AssertionError();
        }
        if (this.xxp != scaleType) {
            this.xxp = scaleType;
            switch (C70261.f15056bg[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m90247bX();
            m90242bg(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        C7054ldr c7054ldr = this.f15045LZ;
        if (c7054ldr != null) {
            c7054ldr.m90178bX(f);
        }
    }

    public void setStretch(float f) {
        C7054ldr c7054ldr = this.f15045LZ;
        if (c7054ldr != null) {
            c7054ldr.eqN(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.VzQ == tileMode) {
            return;
        }
        this.VzQ = tileMode;
        m90247bX();
        m90242bg(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.tuV == tileMode) {
            return;
        }
        this.tuV = tileMode;
        m90247bX();
        m90242bg(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f15053iR.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f15053iR = colorStateList;
        m90247bX();
        m90242bg(false);
        if (this.f15044Kg > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f15044Kg == f) {
            return;
        }
        this.f15044Kg = f;
        m90247bX();
        m90242bg(false);
        invalidate();
    }

    /* renamed from: bg */
    private void m90242bg(boolean z) {
        if (this.yDt) {
            if (z) {
                this.ldr = C7014IL.m90267bg(this.ldr);
            }
            m90244bg(this.ldr, ImageView.ScaleType.FIT_XY);
        }
    }

    /* renamed from: bg */
    private void m90244bg(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C7014IL) {
            C7014IL c7014il = (C7014IL) drawable;
            c7014il.m90266bg(scaleType).m90273bg(this.f15044Kg).m90271bg(this.f15053iR).m90265bg(this.f15048Ta).m90268bg(this.VzQ).m90277IL(this.tuV);
            float[] fArr = this.f15055zx;
            if (fArr != null) {
                c7014il.m90272bg(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            eqN();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m90244bg(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* renamed from: bg */
    public void m90245bg(float f, float f2, float f3, float f4) {
        float[] fArr = this.f15055zx;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m90247bX();
        m90242bg(false);
        invalidate();
    }

    /* renamed from: bg */
    public void m90243bg(InterfaceC7032bX interfaceC7032bX) {
        this.f15043Fy = interfaceC7032bX;
    }
}
