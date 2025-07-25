package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;

/* renamed from: com.my.target.x */
/* loaded from: classes7.dex */
public final class C26203x extends FrameLayout {

    /* renamed from: a */
    public final TextureView f68163a;

    /* renamed from: b */
    public SurfaceView f68164b;

    /* renamed from: c */
    public int f68165c;

    /* renamed from: d */
    public int f68166d;

    /* renamed from: e */
    public InterfaceC26204a f68167e;

    /* renamed from: f */
    public int f68168f;

    /* renamed from: com.my.target.x$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26204a {
        /* renamed from: p */
        void mo42449p();
    }

    public C26203x(Context context) {
        super(context);
        this.f68163a = new TextureView(context);
        m42550a();
    }

    /* renamed from: a */
    public final void m42550a() {
        View view;
        C25869ka.m43594b(this.f68163a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f68168f == 0) {
            view = this.f68163a;
        } else {
            if (this.f68164b == null) {
                this.f68164b = new SurfaceView(getContext());
            }
            view = this.f68164b;
        }
        addView(view, layoutParams);
    }

    @Nullable
    public Bitmap getScreenShot() {
        if (this.f68168f == 1) {
            return null;
        }
        try {
            return this.f68163a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @NonNull
    public TextureView getTextureView() {
        return this.f68163a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC26204a interfaceC26204a;
        super.onAttachedToWindow();
        if (!C25869ka.m43606a(this) && (interfaceC26204a = this.f68167e) != null) {
            interfaceC26204a.mo42449p();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.f68165c;
        if (i4 > 0 && (i3 = this.f68166d) > 0) {
            float f = i4 / i3;
            if (mode == 0 && mode2 == 0) {
                size = i4;
                size2 = i3;
            } else {
                if (mode == 0) {
                    size = (int) (size2 * f);
                } else if (mode2 == 0) {
                    size2 = (int) (size / f);
                } else if (AbstractC26075s1.m42940a(f, 1.0f) != -1) {
                    i4 = size;
                    i3 = size2;
                    size2 = (int) (size / f);
                } else {
                    i4 = size;
                    i3 = size2;
                    size = (int) (size2 * f);
                }
                i4 = size;
                i3 = size2;
            }
            this.f68163a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            SurfaceView surfaceView = this.f68164b;
            if (surfaceView != null) {
                surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            setMeasuredDimension(i4, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setAdVideoViewListener(@Nullable InterfaceC26204a interfaceC26204a) {
        this.f68167e = interfaceC26204a;
    }

    public void setExoPlayer(@Nullable ExoPlayer exoPlayer) {
        if (exoPlayer == null) {
            return;
        }
        int i = this.f68168f;
        if (i != 0) {
            if (i == 1) {
                exoPlayer.setVideoTextureView(null);
                exoPlayer.setVideoSurfaceView(this.f68164b);
                return;
            }
            return;
        }
        exoPlayer.setVideoSurfaceView(null);
        exoPlayer.setVideoTextureView(this.f68163a);
    }

    public void setViewMode(int i) {
        if (this.f68168f == i) {
            return;
        }
        this.f68168f = i;
        m42550a();
    }

    /* renamed from: a */
    public void m42549a(int i, int i2) {
        this.f68165c = i;
        this.f68166d = i2;
        requestLayout();
        invalidate();
    }
}
