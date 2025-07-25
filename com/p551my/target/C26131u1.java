package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.u1 */
/* loaded from: classes7.dex */
public class C26131u1 extends FrameLayout {

    /* renamed from: a */
    public final ImageView f67983a;

    public C26131u1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f67983a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.f67983a.setImageBitmap(bitmap);
    }
}
