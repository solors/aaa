package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.v1 */
/* loaded from: classes7.dex */
public class C26159v1 extends FrameLayout {

    /* renamed from: a */
    public final ImageView f68053a;

    public C26159v1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f68053a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.f68053a.setImageBitmap(bitmap);
    }
}
