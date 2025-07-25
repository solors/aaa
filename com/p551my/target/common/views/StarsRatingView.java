package com.p551my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.common.views.StarsRatingView;

/* renamed from: com.my.target.common.views.StarsRatingView */
/* loaded from: classes7.dex */
public class StarsRatingView extends View {
    private static final float ACCURACY = 0.2f;
    private static final int GRAY = -3355444;
    private static final int ORANGE = -552162;
    private static final float RAY_LENGTH = 0.45f;
    private static final Paint STAR_PAINT;
    private boolean bitmapCreating;
    private float rating;
    private float starPadding;
    private int starSize;
    @Nullable
    private Bitmap starsBitmap;

    static {
        Paint paint = new Paint();
        STAR_PAINT = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public StarsRatingView(@NonNull Context context) {
        super(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m44054a(StarsRatingView starsRatingView) {
        starsRatingView.createBitmap();
    }

    public void createBitmap() {
        boolean z;
        if (this.starSize <= 0) {
            return;
        }
        int floor = (int) Math.floor(this.rating);
        int ceil = (int) Math.ceil(5.0f - this.rating);
        float f = floor;
        if (this.rating - f >= 0.2f) {
            z = true;
        } else {
            z = false;
        }
        try {
            int i = this.starSize;
            this.starsBitmap = Bitmap.createBitmap((int) ((i + this.starPadding) * 5.0f), i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.starsBitmap);
            drawStars(0, this.starSize, ORANGE, canvas, floor);
            int i2 = this.starSize;
            int i3 = (int) (0 + ((i2 + this.starPadding) * f));
            drawStars(i3, i2, GRAY, canvas, ceil);
            if (z) {
                int i4 = this.starSize;
                double d = this.rating;
                drawOrangePartStar(i3, i4, (float) (d - Math.floor(d)), canvas);
            }
            invalidate();
            this.bitmapCreating = false;
        } catch (OutOfMemoryError unused) {
            AbstractC25846ja.m43680a("StarsRatingView: Unable to create rating bitmap because of OOME");
        }
    }

    private void drawOrangePartStar(int i, int i2, float f, @NonNull Canvas canvas) {
        Paint paint = STAR_PAINT;
        paint.setColor(ORANGE);
        Path drawStarPath = drawStarPath(0, i2 / 2, 1);
        float f2 = i2 * f;
        Rect rect = new Rect(i, 0, (int) (i + f2), i2);
        Bitmap createBitmap = Bitmap.createBitmap((int) f2, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawPath(drawStarPath, paint);
        canvas.drawBitmap(createBitmap, (Rect) null, rect, paint);
    }

    @NonNull
    private Path drawStarPath(int i, float f, int i2) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i3 = 0;
        while (i3 < i2) {
            float f2 = i3;
            float f3 = i + f + (f2 * f * 2.0f) + (f2 * this.starPadding);
            float f4 = RAY_LENGTH * f;
            double d = f3;
            double d2 = f;
            float f5 = 2.0f * f;
            path.moveTo((float) (d + (Math.sin(0.0d) * d2)), f5 - ((float) ((Math.cos(0.0d) * d2) + d2)));
            double d3 = f4;
            path.lineTo((float) (d + (Math.sin(0.6283185307179586d) * d3)), f5 - ((float) (d2 + (Math.cos(0.6283185307179586d) * d3))));
            int i4 = 1;
            while (i4 < 5) {
                double d4 = i4 * 1.2566370614359172d;
                path.lineTo((float) (d + (Math.sin(d4) * d2)), f5 - ((float) (d2 + (Math.cos(d4) * d2))));
                double d5 = d4 + 0.6283185307179586d;
                path.lineTo((float) (d + (Math.sin(d5) * d3)), f5 - ((float) ((Math.cos(d5) * d3) + d2)));
                i4++;
                i3 = i3;
            }
            i3++;
        }
        path.close();
        return path;
    }

    private void drawStars(int i, int i2, int i3, @NonNull Canvas canvas, int i4) {
        Paint paint = STAR_PAINT;
        paint.setColor(i3);
        canvas.drawPath(drawStarPath(i, i2 / 2, i4), paint);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.rating > 0.0f) {
            Bitmap bitmap = this.starsBitmap;
            if (bitmap == null) {
                if (this.starSize > 0 && !this.bitmapCreating) {
                    this.bitmapCreating = true;
                    post(new Runnable() { // from class: j7.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsRatingView.m44054a(StarsRatingView.this);
                        }
                    });
                    return;
                }
                return;
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.starSize;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
            this.starSize = i3;
        }
        setMeasuredDimension((int) ((i3 * 5) + (this.starPadding * 4.0f)), i3);
    }

    public void setRating(float f) {
        setContentDescription(Float.toString(f));
        if (f <= 5.0f && f >= 0.0f) {
            this.rating = f;
        } else {
            AbstractC25846ja.m43680a("StarsRatingView: Rating is out of bounds - " + f);
            this.rating = 0.0f;
        }
        invalidate();
    }

    public void setStarSize(int i) {
        this.starSize = i;
    }

    public void setStarsPadding(float f) {
        this.starPadding = f;
    }
}
