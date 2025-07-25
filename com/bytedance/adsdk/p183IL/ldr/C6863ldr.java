package com.bytedance.adsdk.p183IL.ldr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.p183IL.C6873zx;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6789eqN;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6815tC;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.bytedance.adsdk.IL.ldr.ldr */
/* loaded from: classes3.dex */
public final class C6863ldr {

    /* renamed from: bg */
    private static final ThreadLocal<PathMeasure> f14757bg = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: bg */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* renamed from: IL */
    private static final ThreadLocal<Path> f14755IL = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: bg */
        public Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: bX */
    private static final ThreadLocal<Path> f14756bX = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: bg */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> eqN = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: bg */
        public float[] initialValue() {
            return new float[4];
        }
    };

    /* renamed from: zx */
    private static final float f14758zx = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: IL */
    public static boolean m90622IL(Matrix matrix) {
        float[] fArr = eqN.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    /* renamed from: bg */
    public static int m90620bg(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: bg */
    public static boolean m90619bg(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: bg */
    public static Path m90611bg(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: bg */
    public static void m90610bg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public static float m90614bg(Matrix matrix) {
        float[] fArr = eqN.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f14758zx;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: bg */
    public static void m90612bg(Path path, C6815tC c6815tC) {
        if (c6815tC == null || c6815tC.ldr()) {
            return;
        }
        m90613bg(path, ((C6789eqN) c6815tC.m90783bX()).m90829WR() / 100.0f, ((C6789eqN) c6815tC.eqN()).m90829WR() / 100.0f, ((C6789eqN) c6815tC.m90781zx()).m90829WR() / 360.0f);
    }

    /* renamed from: bg */
    public static void m90613bg(Path path, float f, float f2, float f3) {
        C6873zx.m90580bg("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f14757bg.get();
        Path path2 = f14755IL.get();
        Path path3 = f14756bX.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C6873zx.m90583IL("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C6868zx.m90601bg(min, length);
                max = C6868zx.m90601bg(max, length);
            }
            if (min < 0.0f) {
                min = C6868zx.m90601bg(min, length);
            }
            if (max < 0.0f) {
                max = C6868zx.m90601bg(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C6873zx.m90583IL("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C6873zx.m90583IL("applyTrimPathIfNeeded");
        } else {
            C6873zx.m90583IL("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: bg */
    public static float m90621bg() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: bg */
    public static float m90618bg(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: bg */
    public static Bitmap m90617bg(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: bg */
    public static boolean m90609bg(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: bg */
    public static void m90616bg(Canvas canvas, RectF rectF, Paint paint) {
        m90615bg(canvas, rectF, paint, 31);
    }

    /* renamed from: bg */
    public static void m90615bg(Canvas canvas, RectF rectF, Paint paint, int i) {
        C6873zx.m90580bg("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C6873zx.m90583IL("Utils#saveLayer");
    }
}
