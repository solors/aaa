package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f36544a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f36544a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public Matrix get(@NonNull ImageView imageView) {
        this.f36544a.set(imageView.getImageMatrix());
        return this.f36544a;
    }

    @Override // android.util.Property
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
