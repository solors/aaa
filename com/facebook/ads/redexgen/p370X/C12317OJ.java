package com.facebook.ads.redexgen.p370X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.OJ */
/* loaded from: assets/audience_network.dex */
public final class C12317OJ extends View {
    public static byte[] A0D;
    public static String[] A0E = {"6CPTD", "fXgP9xh", "ib2e4in6DthWL0Q8yAPc5xfntbPyX", "G2AJONpeKHBBwjt4Sz8dsS7zReejT0Uv", "ehyeN", "WBwJl6", "LCSmLTdRFMhZrs9WeNkLEUS62n49AyUU", "TtqxlXaAwuHndX0DwnqxXM3nrIfVxGxz"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public float A00;
    public int A01;
    public ObjectAnimator A02;
    public Bitmap A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final RectF A0B;
    public final RectF A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0E[2] = "SahMn6yRzkp23Kmva3Z5gQPUDBgZr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
            i4++;
        }
    }

    public static void A01() {
        A0D = new byte[]{96, 98, Byte.MAX_VALUE, 119, 98, 117, 99, 99};
    }

    static {
        A01();
        A0F = (int) (AbstractC12137LP.A02 * 5.0f);
        A0G = (int) (AbstractC12137LP.A02 * 4.0f);
        A0H = (int) (AbstractC12137LP.A02 * 10.0f);
    }

    public C12317OJ(C13029Zs c13029Zs, boolean z) {
        super(c13029Zs);
        this.A06 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A05 = Resources.getSystem().getDisplayMetrics().density * 2.0f;
        this.A00 = 0.0f;
        this.A02 = null;
        this.A01 = -1;
        this.A04 = z;
        this.A0B = new RectF();
        this.A0C = new RectF();
        this.A07 = new Paint(1);
        this.A07.setStyle(Paint.Style.STROKE);
        this.A07.setStrokeWidth(!this.A04 ? this.A06 : this.A05);
        this.A08 = new Paint(1);
        this.A08.setStyle(Paint.Style.STROKE);
        this.A08.setStrokeWidth(!this.A04 ? this.A06 : this.A05);
        this.A09 = new Paint(1);
        this.A0A = new Paint();
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(-1);
        this.A0A.setTextSize(A0H);
    }

    public final void A02(float f, int i) {
        this.A01 = i;
        setProgressWithAnimation(f);
    }

    public final void A03(int i, int i2, int i3) {
        this.A07.setColor(i);
        this.A08.setColor(i2);
        this.A09.setColorFilter(new PorterDuffColorFilter(AbstractC110382p.A01(i2, i3), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A0B, 0.0f, 360.0f, false, this.A07);
        canvas.drawArc(this.A0B, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A08);
        if (this.A03 != null) {
            canvas.drawBitmap(this.A03, new Rect(0, 0, this.A03.getWidth(), this.A03.getHeight()), this.A0C, this.A09);
        }
        if (this.A01 >= 0) {
            String str = this.A01 + A00(0, 0, 8);
            float f = this.A0B.left;
            float f2 = this.A0B.right;
            float sweepAngle = this.A0B.left;
            float sweepAngle2 = this.A0A.measureText(str);
            float f3 = (f + ((f2 - sweepAngle) / 2.0f)) - (sweepAngle2 / 2.0f);
            float f4 = this.A0B.top;
            float sweepAngle3 = A0G;
            float f5 = f4 + sweepAngle3;
            float f6 = this.A0B.bottom;
            float sweepAngle4 = this.A0B.top;
            canvas.drawText(str, f3, f5 + ((f6 - sweepAngle4) / 2.0f), this.A0A);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        float f = !this.A04 ? this.A06 : this.A05;
        RectF rectF = this.A0B;
        int min2 = getPaddingLeft();
        float f2 = (f / 2.0f) + 0.0f + min2;
        int min3 = getPaddingTop();
        float f3 = (f / 2.0f) + 0.0f + min3;
        int min4 = getPaddingRight();
        float f4 = (min - (f / 2.0f)) - min4;
        float strokeWidth = min;
        int min5 = getPaddingBottom();
        rectF.set(f2, f3, f4, (strokeWidth - (f / 2.0f)) - min5);
        int i3 = !this.A04 ? A0F : A0G;
        RectF rectF2 = this.A0C;
        float f5 = this.A0B.left + i3;
        float f6 = this.A0B.top + i3;
        float f7 = this.A0B.right - i3;
        float strokeWidth2 = this.A0B.bottom;
        rectF2.set(f5, f6, f7, strokeWidth2 - i3);
    }

    public void setImage(EnumC12185MB enumC12185MB) {
        this.A03 = enumC12185MB == null ? null : AbstractC12186MC.A01(enumC12185MB);
        invalidate();
    }

    public void setProgress(float f) {
        this.A00 = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        this.A02 = ObjectAnimator.ofFloat(this, A00(0, 8, 107), f);
        this.A02.setDuration(400L);
        this.A02.setInterpolator(new LinearInterpolator());
        this.A02.start();
    }
}
