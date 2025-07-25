package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.widget.MBImageView;

/* loaded from: classes6.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: a */
    private int f61425a;

    /* renamed from: b */
    private int f61426b;

    /* renamed from: c */
    private Paint f61427c;

    /* renamed from: d */
    private int f61428d;

    /* renamed from: e */
    private Matrix f61429e;

    /* renamed from: f */
    private BitmapShader f61430f;

    /* renamed from: g */
    private int f61431g;

    /* renamed from: h */
    private RectF f61432h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61429e = new Matrix();
        Paint paint = new Paint();
        this.f61427c = paint;
        paint.setAntiAlias(true);
        this.f61426b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f61425a = 1;
    }

    /* renamed from: a */
    private Bitmap m48094a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            SameLogTool.m51824b("View", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap m48094a;
        try {
            if (getDrawable() == null) {
                return;
            }
            Drawable drawable = getDrawable();
            if (drawable != null && (m48094a = m48094a(drawable)) != null && !m48094a.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f61430f = new BitmapShader(m48094a, tileMode, tileMode);
                int i = this.f61425a;
                float f = 1.0f;
                if (i == 0) {
                    f = (this.f61431g * 1.0f) / Math.min(m48094a.getWidth(), m48094a.getHeight());
                } else if (i == 1) {
                    f = Math.max((getWidth() * 1.0f) / m48094a.getWidth(), (getHeight() * 1.0f) / m48094a.getHeight());
                }
                this.f61429e.setScale(f, f);
                this.f61430f.setLocalMatrix(this.f61429e);
                this.f61427c.setShader(this.f61430f);
            }
            if (this.f61425a == 1) {
                RectF rectF = this.f61432h;
                int i2 = this.f61426b;
                canvas.drawRoundRect(rectF, i2, i2, this.f61427c);
                return;
            }
            int i3 = this.f61428d;
            canvas.drawCircle(i3, i3, i3, this.f61427c);
        } catch (Throwable th) {
            SameLogTool.m51824b("RoundImageView", th.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f61425a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f61431g = min;
            this.f61428d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f61425a = bundle.getInt("state_type");
            this.f61426b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f61425a);
        bundle.putInt("state_border_radius", this.f61426b);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f61425a == 1) {
            this.f61432h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int m51772a = SameTool.m51772a(getContext(), i);
        if (this.f61426b != m51772a) {
            this.f61426b = m51772a;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f61425a != i) {
            this.f61425a = i;
            if (i != 1 && i != 0) {
                this.f61425a = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61429e = new Matrix();
        Paint paint = new Paint();
        this.f61427c = paint;
        paint.setAntiAlias(true);
        this.f61426b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f61425a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f61429e = new Matrix();
        Paint paint = new Paint();
        this.f61427c = paint;
        paint.setAntiAlias(true);
        this.f61426b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f61425a = 1;
    }
}
