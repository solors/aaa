package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* loaded from: classes2.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: b */
    private String f3499b;

    /* renamed from: c */
    private int f3500c;
    @Nullable

    /* renamed from: d */
    private Drawable f3501d;
    @Nullable

    /* renamed from: f */
    private Bitmap f3502f;

    /* renamed from: g */
    private int f3503g;
    @Nullable

    /* renamed from: h */
    private Drawable f3504h;
    @Nullable

    /* renamed from: i */
    private Bitmap f3505i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.NetworkImageView$a */
    /* loaded from: classes2.dex */
    public class C3757a implements Response.InterfaceC3755a {

        /* renamed from: a */
        final /* synthetic */ boolean f3506a;

        C3757a(boolean z) {
            this.f3506a = z;
        }

        @Override // com.android.volley.Response.InterfaceC3755a
        public void onErrorResponse(VolleyError volleyError) {
            if (NetworkImageView.this.f3503g != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f3503g);
            } else if (NetworkImageView.this.f3504h != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f3504h);
            } else if (NetworkImageView.this.f3505i != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f3505i);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m102271e() {
        int i = this.f3500c;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.f3501d;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f3502f;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    /* renamed from: d */
    void m102272d(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getLayoutParams().height == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z2 || !z3) {
            z4 = false;
        }
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (TextUtils.isEmpty(this.f3499b)) {
            m102271e();
        } else {
            new C3757a(z);
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m102272d(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f3500c = 0;
        this.f3501d = null;
        this.f3502f = bitmap;
    }

    public void setDefaultImageDrawable(@Nullable Drawable drawable) {
        this.f3500c = 0;
        this.f3502f = null;
        this.f3501d = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f3502f = null;
        this.f3501d = null;
        this.f3500c = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f3503g = 0;
        this.f3504h = null;
        this.f3505i = bitmap;
    }

    public void setErrorImageDrawable(@Nullable Drawable drawable) {
        this.f3503g = 0;
        this.f3505i = null;
        this.f3504h = drawable;
    }

    public void setErrorImageResId(int i) {
        this.f3505i = null;
        this.f3504h = null;
        this.f3503g = i;
    }

    @MainThread
    public void setImageUrl(String str, ImageLoader imageLoader) {
        Threads.m102201a();
        this.f3499b = str;
        m102272d(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
