package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.om1;

/* loaded from: classes8.dex */
public final class xg0 extends ml1<Bitmap> {

    /* renamed from: y */
    private static final Object f87678y = new Object();

    /* renamed from: s */
    private final Object f87679s;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: t */
    private om1.InterfaceC31054b<Bitmap> f87680t;

    /* renamed from: u */
    private final Bitmap.Config f87681u;

    /* renamed from: v */
    private final int f87682v;

    /* renamed from: w */
    private final int f87683w;

    /* renamed from: x */
    private final ImageView.ScaleType f87684x;

    public xg0(String str, om1.InterfaceC31054b<Bitmap> interfaceC31054b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable om1.InterfaceC31053a interfaceC31053a) {
        super(0, str, interfaceC31053a);
        this.f87679s = new Object();
        m31960a(new C31859xy(2.0f, 1000, 2));
        this.f87680t = interfaceC31054b;
        this.f87681u = config;
        this.f87682v = i;
        this.f87683w = i2;
        this.f87684x = scaleType;
    }

    /* renamed from: b */
    private om1<Bitmap> m27504b(c91 c91Var) {
        Bitmap decodeByteArray;
        byte[] bArr = c91Var.f77557b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f87682v == 0 && this.f87683w == 0) {
            options.inPreferredConfig = this.f87681u;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int m27507a = m27507a(this.f87682v, this.f87683w, i, i2, this.f87684x);
            int m27507a2 = m27507a(this.f87683w, this.f87682v, i2, i, this.f87684x);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(i / m27507a, i2 / m27507a2)) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > m27507a || decodeByteArray.getHeight() > m27507a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, m27507a, m27507a2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return om1.m30957a(new fc1(c91Var));
        }
        return om1.m30956a(decodeByteArray, ef0.m34601a(c91Var));
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final void mo27508a() {
        super.mo27508a();
        synchronized (this.f87679s) {
            this.f87680t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: g */
    public final int mo27503g() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final void mo27505a(Bitmap bitmap) {
        om1.InterfaceC31054b<Bitmap> interfaceC31054b;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f87679s) {
            interfaceC31054b = this.f87680t;
        }
        if (interfaceC31054b != null) {
            interfaceC31054b.mo28555a(bitmap2);
        }
    }

    /* renamed from: a */
    private static int m27507a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
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

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final om1<Bitmap> mo27506a(c91 c91Var) {
        om1<Bitmap> m27504b;
        synchronized (f87678y) {
            try {
                try {
                    m27504b = m27504b(c91Var);
                } catch (OutOfMemoryError e) {
                    Object[] objArr = {Integer.valueOf(c91Var.f77557b.length), mo31943l()};
                    boolean z = zc2.f88824a;
                    um0.m28727b(objArr);
                    return om1.m30957a(new fc1(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m27504b;
    }
}
