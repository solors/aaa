package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7756ldr;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import java.io.File;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.bytedance.sdk.openadsdk.core.widget.zx */
/* loaded from: classes3.dex */
public class C9086zx extends ImageView {

    /* renamed from: IL */
    private Movie f20285IL;

    /* renamed from: Kg */
    private float f20286Kg;

    /* renamed from: Lq */
    private boolean f20287Lq;

    /* renamed from: PX */
    private int f20288PX;

    /* renamed from: Ta */
    private volatile boolean f20289Ta;

    /* renamed from: VB */
    private int f20290VB;

    /* renamed from: WR */
    private float f20291WR;

    /* renamed from: bX */
    private long f20292bX;

    /* renamed from: bg */
    private int f20293bg;

    /* renamed from: eo */
    private float f20294eo;
    private int eqN;

    /* renamed from: iR */
    private boolean f20295iR;
    private boolean ldr;
    private boolean yDt;

    /* renamed from: zx */
    private AnimatedImageDrawable f20296zx;

    public C9086zx(Context context) {
        super(context);
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        this.ldr = z;
        this.f20295iR = false;
        this.yDt = true;
        this.f20287Lq = true;
        m83593bg();
    }

    /* renamed from: IL */
    private AnimatedImageDrawable m83597IL(int i) {
        ImageDecoder.Source createSource;
        if (i != -1 && Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(getResources(), i);
            return m83588bg(createSource);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r2 == null) goto L22;
     */
    /* renamed from: bX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.ImageDecoder.Source m83594bX(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.getContext()     // Catch: java.lang.Throwable -> L34
            boolean r2 = com.bytedance.sdk.openadsdk.multipro.C9307IL.m83088bX()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto Le
            java.lang.String r2 = "GIF_AD_CACHE/"
            goto L10
        Le:
            java.lang.String r2 = "/GIF_CACHE/"
        L10:
            java.lang.String r3 = "TT_GIF_FILE"
            java.io.File r1 = m83590bg(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34
            int r3 = r6.length     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r2.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L32
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r3 = 28
            if (r6 < r3) goto L2e
            android.graphics.ImageDecoder$Source r6 = com.bytedance.sdk.openadsdk.core.p326VB.C8792a.m84916a(r1)     // Catch: java.lang.Throwable -> L32
            r2.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return r6
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L40
            goto L40
        L32:
            r6 = move-exception
            goto L36
        L34:
            r6 = move-exception
            r2 = r0
        L36:
            java.lang.String r1 = "GifView"
            java.lang.String r3 = "GifView  getSourceByFile fail : "
            com.bytedance.sdk.component.utils.C7741PX.m87871bg(r1, r3, r6)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            goto L2e
        L40:
            return r0
        L41:
            r6 = move-exception
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.lang.Throwable -> L47
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.C9086zx.m83594bX(byte[]):android.graphics.ImageDecoder$Source");
    }

    private void eqN() {
        if (this.f20285IL == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f20292bX == 0) {
            this.f20292bX = uptimeMillis;
        }
        int duration = this.f20285IL.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.f20287Lq && Math.abs(duration - this.eqN) < 60) {
            this.eqN = duration;
            this.f20289Ta = true;
            return;
        }
        this.eqN = (int) ((uptimeMillis - this.f20292bX) % duration);
    }

    /* renamed from: bg */
    void m83593bg() {
        if (this.ldr) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f20285IL != null && !this.ldr) {
            try {
                if (!this.f20289Ta) {
                    eqN();
                    m83589bg(canvas);
                    m83595bX();
                    return;
                }
                m83589bg(canvas);
                return;
            } catch (Throwable th) {
                C7741PX.m87871bg("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f20285IL != null && !this.ldr) {
            this.f20286Kg = (getWidth() - this.f20290VB) / 2.0f;
            this.f20291WR = (getHeight() - this.f20288PX) / 2.0f;
        }
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.yDt = z2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        float f;
        float f2;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (!this.ldr && (movie = this.f20285IL) != null) {
            int width = movie.width();
            int height = this.f20285IL.height();
            if (View.MeasureSpec.getMode(i) != 0 && width > (size2 = View.MeasureSpec.getSize(i))) {
                f = width / size2;
            } else {
                f = 1.0f;
            }
            if (View.MeasureSpec.getMode(i2) != 0 && height > (size = View.MeasureSpec.getSize(i2))) {
                f2 = height / size;
            } else {
                f2 = 1.0f;
            }
            float max = 1.0f / Math.max(f, f2);
            this.f20294eo = max;
            int i3 = (int) (width * max);
            this.f20290VB = i3;
            int i4 = (int) (height * max);
            this.f20288PX = i4;
            setMeasuredDimension(i3, i4);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.f20285IL != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.yDt = z;
            m83595bX();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (this.f20285IL != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.yDt = z;
            m83595bX();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (this.f20285IL != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.yDt = z;
            m83595bX();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.f20287Lq = z;
        if (!z) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.f20296zx) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e) {
                C7741PX.m87871bg("GifView", "setRepeatConfig error", e);
            }
        }
    }

    /* renamed from: bg */
    public void m83591bg(int i, boolean z) {
        this.f20289Ta = z;
        this.f20293bg = i;
        if (i != -1) {
            if (!this.ldr) {
                this.f20285IL = m83592bg(i);
            } else {
                this.f20296zx = m83597IL(i);
            }
        }
    }

    /* renamed from: IL */
    private AnimatedImageDrawable m83596IL(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return m83588bg(m83594bX(bArr));
    }

    /* renamed from: IL */
    public void m83598IL() {
        boolean isRunning;
        if (this.f20285IL == null || !this.f20289Ta) {
            return;
        }
        this.f20289Ta = false;
        if (!this.ldr) {
            this.f20292bX = SystemClock.uptimeMillis() - this.eqN;
            invalidate();
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = this.f20296zx;
        if (animatedImageDrawable != null) {
            isRunning = animatedImageDrawable.isRunning();
            if (isRunning) {
                return;
            }
            this.f20296zx.start();
        }
    }

    /* renamed from: bg */
    public void m83586bg(byte[] bArr, boolean z) {
        this.f20289Ta = z;
        if (bArr != null) {
            if (!this.ldr) {
                this.f20285IL = m83587bg(bArr);
            } else {
                this.f20296zx = m83596IL(bArr);
            }
            m83595bX();
        }
    }

    /* renamed from: bX */
    private void m83595bX() {
        if (this.f20285IL == null || this.ldr || !this.yDt) {
            return;
        }
        postInvalidateOnAnimation();
    }

    /* renamed from: bg */
    private Movie m83592bg(int i) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    private Movie m83587bg(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    private AnimatedImageDrawable m83588bg(ImageDecoder.Source source) {
        Drawable decodeDrawable;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        decodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(decodeDrawable);
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) decodeDrawable;
            if (!this.f20289Ta) {
                animatedImageDrawable.start();
            }
            return animatedImageDrawable;
        }
        return null;
    }

    /* renamed from: bg */
    public static File m83590bg(Context context, String str, String str2) {
        return C7756ldr.m87822bg(context, C9307IL.m83088bX(), str, str2);
    }

    /* renamed from: bg */
    private void m83589bg(Canvas canvas) {
        Movie movie = this.f20285IL;
        if (movie == null) {
            return;
        }
        movie.setTime(this.eqN);
        float f = this.f20294eo;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.f20285IL.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.f20285IL;
            float f2 = this.f20286Kg;
            float f3 = this.f20294eo;
            movie2.draw(canvas, f2 / f3, this.f20291WR / f3);
        }
        canvas.restore();
    }
}
