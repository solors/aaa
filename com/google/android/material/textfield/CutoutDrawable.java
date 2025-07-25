package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes5.dex */
class CutoutDrawable extends MaterialShapeDrawable {
    @NonNull

    /* renamed from: B */
    private final RectF f38520B;

    CutoutDrawable() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m70738D() {
        return !this.f38520B.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m70737E() {
        m70736F(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: F */
    void m70736F(float f, float f2, float f3, float f4) {
        RectF rectF = this.f38520B;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m70735G(@NonNull RectF rectF) {
        m70736F(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.shape.MaterialShapeDrawable
    /* renamed from: p */
    public void mo70734p(@NonNull Canvas canvas) {
        if (this.f38520B.isEmpty()) {
            super.mo70734p(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f38520B);
        } else {
            canvas.clipRect(this.f38520B, Region.Op.DIFFERENCE);
        }
        super.mo70734p(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CutoutDrawable(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new ShapeAppearanceModel() : shapeAppearanceModel);
        this.f38520B = new RectF();
    }
}
