package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public class MBRoundRectImageViewC extends MBImageView {

    /* renamed from: a */
    private Paint f55632a;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55632a = new Paint();
    }

    /* renamed from: a */
    private Bitmap m53035a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                int width = getWidth();
                int height = getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(width / bitmap.getWidth(), height / bitmap.getHeight());
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e) {
                SameLogTool.m51824b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap m53035a = m53035a(((BitmapDrawable) drawable).getBitmap());
            if (m53035a != null && !m53035a.isRecycled()) {
                Bitmap m53034a = m53034a(m53035a, 30);
                if (m53034a != null && !m53034a.isRecycled()) {
                    Rect rect = new Rect(0, 0, m53034a.getWidth(), m53034a.getHeight());
                    this.f55632a.reset();
                    canvas.drawBitmap(m53034a, rect, rect, this.f55632a);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e) {
            SameLogTool.m51824b("MBRoundRectImageViewC", e.getMessage());
        }
    }

    /* renamed from: a */
    private Bitmap m53034a(Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f = i;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
                return createBitmap;
            } catch (Exception e) {
                SameLogTool.m51824b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }
}
