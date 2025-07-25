package com.squareup.picasso;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public interface Transformation {
    String key();

    Bitmap transform(Bitmap bitmap);
}
