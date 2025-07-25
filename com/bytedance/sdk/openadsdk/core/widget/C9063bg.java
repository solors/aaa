package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.bytedance.sdk.openadsdk.core.widget.bg */
/* loaded from: classes3.dex */
public class C9063bg extends C9105eqN {

    /* renamed from: IL */
    private int f20207IL;

    /* renamed from: bg */
    private int f20208bg;

    public C9063bg(Context context) {
        super(context);
        this.f20208bg = 0;
        this.f20207IL = 0;
    }

    /* renamed from: IL */
    private boolean m83676IL() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            if (!(getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) getDrawable()).getBitmap() != null) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: bg */
    private boolean m83675bg() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.f20208bg == 0) {
            this.f20208bg = getWidth();
        }
        if (this.f20207IL == 0) {
            this.f20207IL = getHeight();
        }
        int i = this.f20208bg;
        int i2 = this.f20207IL;
        if (i >= i2) {
            i = i2;
        }
        return i / 2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int radius;
        Bitmap bitmap2;
        if (m83675bg()) {
            return;
        }
        measure(0, 0);
        if (m83676IL()) {
            return;
        }
        try {
            bitmap = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            bitmap2 = m83674bg(bitmap, getRadius());
        } catch (Throwable unused2) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmap2, (this.f20208bg / 2) - radius, (this.f20207IL / 2) - radius, (Paint) null);
        }
    }

    /* renamed from: bg */
    private Bitmap m83674bg(Bitmap bitmap, int i) {
        Bitmap createBitmap;
        int i2 = i * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            createBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (createBitmap != null) {
            bitmap = createBitmap;
        }
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i2) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap2;
    }
}
