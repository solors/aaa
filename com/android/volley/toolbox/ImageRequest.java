package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* renamed from: com.android.volley.toolbox.j */
/* loaded from: classes2.dex */
public class ImageRequest extends Request<Bitmap> {

    /* renamed from: k */
    private static final Object f3539k = new Object();

    /* renamed from: d */
    private final Object f3540d;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: f */
    private Response.InterfaceC3756b<Bitmap> f3541f;

    /* renamed from: g */
    private final Bitmap.Config f3542g;

    /* renamed from: h */
    private final int f3543h;

    /* renamed from: i */
    private final int f3544i;

    /* renamed from: j */
    private final ImageView.ScaleType f3545j;

    public ImageRequest(String str, Response.InterfaceC3756b<Bitmap> interfaceC3756b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(0, str, interfaceC3755a);
        this.f3540d = new Object();
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.f3541f = interfaceC3756b;
        this.f3542g = config;
        this.f3543h = i;
        this.f3544i = i2;
        this.f3545j = scaleType;
    }

    /* renamed from: c */
    private Response<Bitmap> m102212c(NetworkResponse networkResponse) {
        Bitmap decodeByteArray;
        byte[] bArr = networkResponse.f3480b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f3543h == 0 && this.f3544i == 0) {
            options.inPreferredConfig = this.f3542g;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int m102210e = m102210e(this.f3543h, this.f3544i, i, i2, this.f3545j);
            int m102210e2 = m102210e(this.f3544i, this.f3543h, i2, i, this.f3545j);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m102211d(i, i2, m102210e, m102210e2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > m102210e || decodeByteArray.getHeight() > m102210e2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, m102210e, m102210e2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return Response.m102284a(new ParseError(networkResponse));
        }
        return Response.m102282c(decodeByteArray, HttpHeaderParser.m102235e(networkResponse));
    }

    @VisibleForTesting
    /* renamed from: d */
    static int m102211d(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 <= min) {
                f = f2;
            } else {
                return (int) f;
            }
        }
    }

    /* renamed from: e */
    private static int m102210e(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                if (i * d < d2) {
                    return (int) (d2 / d);
                }
                return i;
            }
            double d3 = i2;
            if (i * d > d3) {
                return (int) (d3 / d);
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* renamed from: b */
    public void deliverResponse(Bitmap bitmap) {
        Response.InterfaceC3756b<Bitmap> interfaceC3756b;
        synchronized (this.f3540d) {
            interfaceC3756b = this.f3541f;
        }
        if (interfaceC3756b != null) {
            interfaceC3756b.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.f3540d) {
            this.f3541f = null;
        }
    }

    @Override // com.android.volley.Request
    public Request.EnumC3750c getPriority() {
        return Request.EnumC3750c.LOW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public Response<Bitmap> parseNetworkResponse(NetworkResponse networkResponse) {
        Response<Bitmap> m102212c;
        synchronized (f3539k) {
            try {
                try {
                    m102212c = m102212c(networkResponse);
                } catch (OutOfMemoryError e) {
                    VolleyLog.m102196c("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.f3480b.length), getUrl());
                    return Response.m102284a(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m102212c;
    }
}
