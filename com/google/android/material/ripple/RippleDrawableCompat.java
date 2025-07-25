package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* renamed from: b */
    private RippleDrawableCompatState f38107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class RippleDrawableCompatState extends Drawable.ConstantState {
        @NonNull

        /* renamed from: a */
        MaterialShapeDrawable f38108a;

        /* renamed from: b */
        boolean f38109b;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.f38108a = materialShapeDrawable;
            this.f38109b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(@NonNull RippleDrawableCompatState rippleDrawableCompatState) {
            this.f38108a = (MaterialShapeDrawable) rippleDrawableCompatState.f38108a.getConstantState().newDrawable();
            this.f38109b = rippleDrawableCompatState.f38109b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.f38107b;
        if (rippleDrawableCompatState.f38109b) {
            rippleDrawableCompatState.f38108a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f38107b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f38107b.f38108a.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f38107b.f38108a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f38107b.f38108a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f38107b.f38108a.setState(iArr)) {
            onStateChange = true;
        }
        boolean shouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.f38107b;
        if (rippleDrawableCompatState.f38109b != shouldDrawRippleCompat) {
            rippleDrawableCompatState.f38109b = shouldDrawRippleCompat;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f38107b.f38108a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f38107b.f38108a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f38107b.f38108a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i) {
        this.f38107b.f38108a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f38107b.f38108a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f38107b.f38108a.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public RippleDrawableCompat mutate() {
        this.f38107b = new RippleDrawableCompatState(this.f38107b);
        return this;
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.f38107b = rippleDrawableCompatState;
    }
}
