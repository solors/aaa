package net.pubnative.lite.sdk.views.shape;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import net.pubnative.lite.sdk.views.shape.shader.ShaderHelper;

/* loaded from: classes10.dex */
public abstract class ShaderImageView extends ImageView {
    private static final boolean DEBUG = false;
    private ShaderHelper pathHelper;

    public ShaderImageView(Context context) {
        super(context);
        setup(context, null, 0);
    }

    private void setup(Context context, AttributeSet attributeSet, int i) {
        getPathHelper().init(context, attributeSet, i);
    }

    protected abstract ShaderHelper createImageViewHelper();

    public float getBorderAlpha() {
        return getPathHelper().getBorderAlpha();
    }

    public int getBorderWidth() {
        return getPathHelper().getBorderWidth();
    }

    protected ShaderHelper getPathHelper() {
        if (this.pathHelper == null) {
            this.pathHelper = createImageViewHelper();
        }
        return this.pathHelper;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!getPathHelper().onDraw(canvas)) {
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (getPathHelper().isSquare()) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getPathHelper().onSizeChanged(i, i2);
    }

    public void setBorderAlpha(float f) {
        getPathHelper().setBorderAlpha(f);
        invalidate();
    }

    public void setBorderColor(int i) {
        getPathHelper().setBorderColor(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        getPathHelper().setBorderWidth(i);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    public void setSquare(boolean z) {
        getPathHelper().setSquare(z);
        invalidate();
    }

    public ShaderImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(context, attributeSet, 0);
    }

    public ShaderImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup(context, attributeSet, i);
    }
}
