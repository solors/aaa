package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class ShadowRenderer {

    /* renamed from: i */
    private static final int[] f38138i = new int[3];

    /* renamed from: j */
    private static final float[] f38139j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f38140k = new int[4];

    /* renamed from: l */
    private static final float[] f38141l = {0.0f, 0.0f, 0.5f, 1.0f};
    @NonNull

    /* renamed from: a */
    private final Paint f38142a;
    @NonNull

    /* renamed from: b */
    private final Paint f38143b;
    @NonNull

    /* renamed from: c */
    private final Paint f38144c;

    /* renamed from: d */
    private int f38145d;

    /* renamed from: e */
    private int f38146e;

    /* renamed from: f */
    private int f38147f;

    /* renamed from: g */
    private final Path f38148g;

    /* renamed from: h */
    private final Paint f38149h;

    public ShadowRenderer() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    public void drawCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f38148g;
        if (z) {
            int[] iArr = f38140k;
            iArr[0] = 0;
            iArr[1] = this.f38147f;
            iArr[2] = this.f38146e;
            iArr[3] = this.f38145d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f38140k;
            iArr2[0] = 0;
            iArr2[1] = this.f38145d;
            iArr2[2] = this.f38146e;
            iArr2[3] = this.f38147f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f38141l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f38143b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f38140k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f38149h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f38143b);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f38138i;
        iArr[0] = this.f38147f;
        iArr[1] = this.f38146e;
        iArr[2] = this.f38145d;
        Paint paint = this.f38144c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f38139j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f38144c);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2, @NonNull float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        drawCornerShadow(canvas, matrix, rectF, i, f, f2);
        Path path = this.f38148g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f38149h);
        canvas.drawPath(path, this.f38142a);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.f38142a;
    }

    public void setShadowColor(int i) {
        this.f38145d = ColorUtils.setAlphaComponent(i, 68);
        this.f38146e = ColorUtils.setAlphaComponent(i, 20);
        this.f38147f = ColorUtils.setAlphaComponent(i, 0);
        this.f38142a.setColor(this.f38145d);
    }

    public ShadowRenderer(int i) {
        this.f38148g = new Path();
        Paint paint = new Paint();
        this.f38149h = paint;
        this.f38142a = new Paint();
        setShadowColor(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f38143b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f38144c = new Paint(paint2);
    }
}
