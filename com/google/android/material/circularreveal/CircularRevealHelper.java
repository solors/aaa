package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* renamed from: a */
    private final Delegate f37146a;
    @NonNull

    /* renamed from: b */
    private final View f37147b;
    @NonNull

    /* renamed from: c */
    private final Path f37148c;
    @NonNull

    /* renamed from: d */
    private final Paint f37149d;
    @NonNull

    /* renamed from: e */
    private final Paint f37150e;
    @Nullable

    /* renamed from: f */
    private CircularRevealWidget.RevealInfo f37151f;
    @Nullable

    /* renamed from: g */
    private Drawable f37152g;

    /* renamed from: h */
    private boolean f37153h;

    /* renamed from: i */
    private boolean f37154i;

    /* loaded from: classes5.dex */
    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Strategy {
    }

    public CircularRevealHelper(Delegate delegate) {
        this.f37146a = delegate;
        View view = (View) delegate;
        this.f37147b = view;
        view.setWillNotDraw(false);
        this.f37148c = new Path();
        this.f37149d = new Paint(7);
        Paint paint = new Paint(1);
        this.f37150e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    private void m71719a(@NonNull Canvas canvas) {
        if (m71715e()) {
            Rect bounds = this.f37152g.getBounds();
            float width = this.f37151f.centerX - (bounds.width() / 2.0f);
            float height = this.f37151f.centerY - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f37152g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: b */
    private float m71718b(@NonNull CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.f37147b.getWidth(), this.f37147b.getHeight());
    }

    /* renamed from: c */
    private void m71717c() {
        if (STRATEGY == 1) {
            this.f37148c.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.f37151f;
            if (revealInfo != null) {
                this.f37148c.addCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, Path.Direction.CW);
            }
        }
        this.f37147b.invalidate();
    }

    /* renamed from: d */
    private boolean m71716d() {
        boolean z;
        CircularRevealWidget.RevealInfo revealInfo = this.f37151f;
        if (revealInfo != null && !revealInfo.isInvalid()) {
            z = false;
        } else {
            z = true;
        }
        if (STRATEGY == 0) {
            if (z || !this.f37154i) {
                return false;
            }
            return true;
        }
        return !z;
    }

    /* renamed from: e */
    private boolean m71715e() {
        if (!this.f37153h && this.f37152g != null && this.f37151f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m71714f() {
        if (!this.f37153h && Color.alpha(this.f37150e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f37153h = true;
            this.f37154i = false;
            this.f37147b.buildDrawingCache();
            Bitmap drawingCache = this.f37147b.getDrawingCache();
            if (drawingCache == null && this.f37147b.getWidth() != 0 && this.f37147b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f37147b.getWidth(), this.f37147b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f37147b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f37149d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f37153h = false;
            this.f37154i = true;
        }
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f37154i = false;
            this.f37147b.destroyDrawingCache();
            this.f37149d.setShader(null);
            this.f37147b.invalidate();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (m71716d()) {
            int i = STRATEGY;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f37146a.actualDraw(canvas);
                        if (m71714f()) {
                            canvas.drawRect(0.0f, 0.0f, this.f37147b.getWidth(), this.f37147b.getHeight(), this.f37150e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f37148c);
                    this.f37146a.actualDraw(canvas);
                    if (m71714f()) {
                        canvas.drawRect(0.0f, 0.0f, this.f37147b.getWidth(), this.f37147b.getHeight(), this.f37150e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                CircularRevealWidget.RevealInfo revealInfo = this.f37151f;
                canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.f37149d);
                if (m71714f()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.f37151f;
                    canvas.drawCircle(revealInfo2.centerX, revealInfo2.centerY, revealInfo2.radius, this.f37150e);
                }
            }
        } else {
            this.f37146a.actualDraw(canvas);
            if (m71714f()) {
                canvas.drawRect(0.0f, 0.0f, this.f37147b.getWidth(), this.f37147b.getHeight(), this.f37150e);
            }
        }
        m71719a(canvas);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f37152g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.f37150e.getColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.f37151f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = m71718b(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        if (this.f37146a.actualIsOpaque() && !m71716d()) {
            return true;
        }
        return false;
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f37152g = drawable;
        this.f37147b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f37150e.setColor(i);
        this.f37147b.invalidate();
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.f37151f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f37151f;
            if (revealInfo2 == null) {
                this.f37151f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, m71718b(revealInfo), 1.0E-4f)) {
                this.f37151f.radius = Float.MAX_VALUE;
            }
        }
        m71717c();
    }
}
