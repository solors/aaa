package com.mbridge.msdk.video.dynview.p522g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: com.mbridge.msdk.video.dynview.g.a */
/* loaded from: classes6.dex */
public final class BackgroundDrawable extends ShapeDrawable {

    /* renamed from: a */
    private int f60267a;

    /* renamed from: b */
    private float f60268b;

    /* renamed from: c */
    private float f60269c;

    /* renamed from: d */
    private int f60270d;

    /* renamed from: e */
    private int f60271e;

    /* renamed from: f */
    private Bitmap f60272f;

    /* renamed from: g */
    private Bitmap f60273g;

    /* renamed from: h */
    private boolean f60274h;

    /* renamed from: i */
    private Paint f60275i;

    /* renamed from: j */
    private Matrix f60276j;

    /* compiled from: BackgroundDrawable.java */
    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a */
    /* loaded from: classes6.dex */
    public static class C23007a implements InterfaceC23008b {

        /* renamed from: a */
        private RectShape f60277a;

        /* renamed from: b */
        private Bitmap f60278b;

        /* renamed from: c */
        private Bitmap f60279c;

        /* renamed from: d */
        private boolean f60280d;

        /* renamed from: e */
        private int f60281e;

        /* renamed from: f */
        private int f60282f;

        /* renamed from: g */
        private int f60283g;

        /* renamed from: h */
        private float f60284h;

        /* renamed from: i */
        private float f60285i;

        private C23007a() {
            this.f60282f = 100;
            this.f60283g = 10;
            this.f60277a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.p522g.BackgroundDrawable.InterfaceC23008b
        /* renamed from: a */
        public final InterfaceC23008b mo48960a(Bitmap bitmap) {
            this.f60278b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.p522g.BackgroundDrawable.InterfaceC23008b
        /* renamed from: b */
        public final InterfaceC23008b mo48957b(Bitmap bitmap) {
            this.f60279c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.p522g.BackgroundDrawable.InterfaceC23008b
        /* renamed from: a */
        public final InterfaceC23008b mo48959a(boolean z) {
            this.f60280d = z;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.p522g.BackgroundDrawable.InterfaceC23008b
        /* renamed from: b */
        public final InterfaceC23008b mo48958b(float f) {
            this.f60285i = f;
            return this;
        }

        /* renamed from: a */
        public final InterfaceC23008b m48970a(int i) {
            this.f60281e = i;
            return this;
        }

        /* renamed from: a */
        public final InterfaceC23008b m48971a(float f) {
            this.f60284h = f;
            return this;
        }

        /* renamed from: a */
        public final BackgroundDrawable m48972a() {
            return new BackgroundDrawable(this);
        }
    }

    /* compiled from: BackgroundDrawable.java */
    /* renamed from: com.mbridge.msdk.video.dynview.g.a$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC23008b {
        /* renamed from: a */
        InterfaceC23008b mo48960a(Bitmap bitmap);

        /* renamed from: a */
        InterfaceC23008b mo48959a(boolean z);

        /* renamed from: b */
        InterfaceC23008b mo48958b(float f);

        /* renamed from: b */
        InterfaceC23008b mo48957b(Bitmap bitmap);
    }

    /* renamed from: a */
    private void m48973a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.f60268b / bitmap.getWidth(), this.f60269c / bitmap.getHeight());
            if (this.f60276j == null) {
                this.f60276j = new Matrix();
            }
            this.f60276j.reset();
            this.f60276j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f60276j);
        this.f60275i.setShader(bitmapShader);
        canvas.drawPath(path, this.f60275i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f60267a == 1) {
            float f = this.f60269c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f60270d + f) - this.f60271e);
            path.lineTo(this.f60268b, (f - this.f60270d) - this.f60271e);
            path.lineTo(this.f60268b, 0.0f);
            if (this.f60274h) {
                try {
                    m48974a(canvas, path);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f60272f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        m48973a(canvas, path, this.f60272f);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f60270d + f + this.f60271e);
            path2.lineTo(0.0f, this.f60269c);
            path2.lineTo(this.f60268b, this.f60269c);
            path2.lineTo(this.f60268b, (f - this.f60270d) + this.f60271e);
            if (this.f60274h) {
                try {
                    m48974a(canvas, path2);
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f60273g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    m48973a(canvas, path2, this.f60273g);
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f2 = this.f60268b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f60269c);
        path3.lineTo((f2 - this.f60270d) - this.f60271e, this.f60269c);
        path3.lineTo((this.f60270d + f2) - this.f60271e, 0.0f);
        if (this.f60274h) {
            try {
                m48974a(canvas, path3);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f60272f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    m48973a(canvas, path3, this.f60272f);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f60270d + f2 + this.f60271e, 0.0f);
        path4.lineTo(this.f60268b, 0.0f);
        path4.lineTo(this.f60268b, this.f60269c);
        path4.lineTo((f2 - this.f60270d) + this.f60271e, this.f60269c);
        if (this.f60274h) {
            try {
                m48974a(canvas, path4);
                return;
            } catch (Exception e7) {
                e7.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f60273g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                m48973a(canvas, path4, this.f60273g);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private BackgroundDrawable(C23007a c23007a) {
        super(c23007a.f60277a);
        this.f60274h = false;
        this.f60272f = c23007a.f60278b;
        this.f60273g = c23007a.f60279c;
        this.f60274h = c23007a.f60280d;
        this.f60267a = c23007a.f60281e;
        this.f60270d = c23007a.f60282f;
        this.f60271e = c23007a.f60283g;
        this.f60268b = c23007a.f60284h;
        this.f60269c = c23007a.f60285i;
        Paint paint = new Paint();
        this.f60275i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f60275i.setAntiAlias(true);
        this.f60276j = new Matrix();
    }

    /* renamed from: a */
    private void m48974a(Canvas canvas, Path path) {
        this.f60275i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f60275i);
    }

    /* renamed from: a */
    public static C23007a m48975a() {
        return new C23007a();
    }
}
