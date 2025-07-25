package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a */
    private Xfermode f55745a;

    /* renamed from: b */
    private int f55746b;

    /* renamed from: c */
    private int f55747c;

    /* renamed from: d */
    private int f55748d;

    /* renamed from: e */
    private int f55749e;

    /* renamed from: f */
    private int f55750f;

    /* renamed from: g */
    private int f55751g;

    /* renamed from: h */
    private int f55752h;

    /* renamed from: i */
    private int f55753i;

    /* renamed from: j */
    private int f55754j;

    /* renamed from: k */
    private float[] f55755k;

    /* renamed from: l */
    private float[] f55756l;

    /* renamed from: m */
    private RectF f55757m;

    /* renamed from: n */
    private RectF f55758n;

    /* renamed from: o */
    private boolean f55759o;

    /* renamed from: p */
    private boolean f55760p;

    /* renamed from: q */
    private Path f55761q;

    /* renamed from: r */
    private Paint f55762r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f55757m, null, 31);
            int i = this.f55746b;
            int i2 = this.f55753i;
            int i3 = this.f55747c;
            canvas.scale(((i - (i2 * 2)) * 1.0f) / i, ((i3 - (i2 * 2)) * 1.0f) / i3, i / 2.0f, i3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f55762r;
            if (paint != null) {
                paint.reset();
                this.f55762r.setAntiAlias(true);
                this.f55762r.setStyle(Paint.Style.FILL);
                this.f55762r.setXfermode(this.f55745a);
            }
            Path path = this.f55761q;
            if (path != null) {
                path.reset();
                this.f55761q.addRoundRect(this.f55757m, this.f55756l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f55761q, this.f55762r);
            Paint paint2 = this.f55762r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f55759o) {
                int i4 = this.f55753i;
                int i5 = this.f55754j;
                RectF rectF = this.f55758n;
                float[] fArr = this.f55755k;
                try {
                    Path path2 = this.f55761q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f55762r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i4);
                        this.f55762r.setColor(i5);
                        this.f55762r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f55761q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f55761q, this.f55762r);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            SameLogTool.m51827a("MBridgeImageView", e2.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onSizeChanged(i, i2, i3, i4);
        this.f55746b = i;
        this.f55747c = i2;
        int i8 = 0;
        if (this.f55760p) {
            try {
                if (this.f55755k != null && this.f55756l != null) {
                    while (true) {
                        i5 = 2;
                        if (i8 >= 2) {
                            break;
                        }
                        float[] fArr = this.f55755k;
                        int i9 = this.f55749e;
                        fArr[i8] = i9;
                        this.f55756l[i8] = i9 - (this.f55753i / 2.0f);
                        i8++;
                    }
                    while (true) {
                        i6 = 4;
                        if (i5 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f55755k;
                        int i10 = this.f55750f;
                        fArr2[i5] = i10;
                        this.f55756l[i5] = i10 - (this.f55753i / 2.0f);
                        i5++;
                    }
                    while (true) {
                        if (i6 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f55755k;
                        int i11 = this.f55751g;
                        fArr3[i6] = i11;
                        this.f55756l[i6] = i11 - (this.f55753i / 2.0f);
                        i6++;
                    }
                    for (i7 = 6; i7 < 8; i7++) {
                        float[] fArr4 = this.f55755k;
                        int i12 = this.f55752h;
                        fArr4[i7] = i12;
                        this.f55756l[i7] = i12 - (this.f55753i / 2.0f);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (this.f55755k != null && this.f55756l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f55755k;
                    if (i8 >= fArr5.length) {
                        break;
                    }
                    int i13 = this.f55748d;
                    fArr5[i8] = i13;
                    this.f55756l[i8] = i13 - (this.f55753i / 2.0f);
                    i8++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        RectF rectF = this.f55758n;
        if (rectF != null) {
            int i14 = this.f55753i;
            rectF.set(i14 / 2.0f, i14 / 2.0f, this.f55746b - (i14 / 2.0f), this.f55747c - (i14 / 2.0f));
        }
        RectF rectF2 = this.f55757m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f55746b, this.f55747c);
        }
    }

    public void setBorder(int i, int i2, int i3) {
        this.f55759o = true;
        this.f55753i = i2;
        this.f55754j = i3;
        this.f55748d = i;
    }

    public void setCornerRadius(int i) {
        this.f55748d = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f55759o = true;
        this.f55760p = true;
        this.f55753i = i5;
        this.f55754j = i6;
        this.f55749e = i;
        this.f55751g = i3;
        this.f55750f = i2;
        this.f55752h = i4;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55761q = new Path();
        this.f55762r = new Paint();
        this.f55755k = new float[8];
        this.f55756l = new float[8];
        this.f55758n = new RectF();
        this.f55757m = new RectF();
        this.f55745a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
