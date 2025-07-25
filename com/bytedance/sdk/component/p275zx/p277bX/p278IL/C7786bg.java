package com.bytedance.sdk.component.p275zx.p277bX.p278IL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: com.bytedance.sdk.component.zx.bX.IL.bg */
/* loaded from: classes3.dex */
public class C7786bg {

    /* renamed from: Kg */
    private final ImageView.ScaleType f16958Kg;

    /* renamed from: bX */
    private final Bitmap.Config f16960bX;
    private int eqN;

    /* renamed from: iR */
    private final int f16962iR;
    private final int ldr;

    /* renamed from: zx */
    private int f16963zx;

    /* renamed from: bg */
    public static final ImageView.ScaleType f16957bg = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: IL */
    public static final Bitmap.Config f16956IL = Bitmap.Config.ARGB_4444;

    /* renamed from: WR */
    private final int f16959WR = 3840;

    /* renamed from: eo */
    private final int f16961eo = 104857600;

    public C7786bg(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.f16960bX = config;
        this.eqN = i;
        this.f16963zx = i2;
        this.f16958Kg = scaleType;
        this.ldr = i3;
        this.f16962iR = i4;
        m87776bg(i, i2);
    }

    /* renamed from: bg */
    static int m87775bg(int i, int i2, int i3, int i4, int i5, int i6) {
        double min = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            min = Math.max(min, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: bg */
    private static int m87774bg(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    /* renamed from: bg */
    public Bitmap m87773bg(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.eqN == 0 && this.f16963zx == 0) {
            options.inPreferredConfig = this.f16960bX;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int m87774bg = m87774bg(this.eqN, this.f16963zx, i, i2, this.f16958Kg);
            int m87774bg2 = m87774bg(this.f16963zx, this.eqN, i2, i, this.f16958Kg);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m87775bg(i, i2, m87774bg, m87774bg2, this.ldr, this.f16962iR);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > m87774bg || decodeByteArray.getHeight() > m87774bg2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, m87774bg, m87774bg2, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 104857600) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    /* renamed from: bg */
    private void m87776bg(int i, int i2) {
        if (i > 3840 && i2 > 3840) {
            if (i > i2) {
                this.eqN = 3840;
                this.f16963zx = (i2 * 3840) / i;
                return;
            }
            this.eqN = (i * 3840) / i2;
            this.f16963zx = 3840;
        } else if (i > 3840) {
            this.eqN = 3840;
            this.f16963zx = (i2 * 3840) / i;
        } else if (i2 > 3840) {
            this.eqN = (i * 3840) / i2;
            this.f16963zx = 3840;
        }
    }
}
