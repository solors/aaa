package p690h0;

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
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p1032x.TrimPathContent;
import p1048y.FloatKeyframeAnimation;

/* compiled from: Utils.java */
/* renamed from: h0.j */
/* loaded from: classes2.dex */
public final class C33454j {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f91300a = new C33455a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f91301b = new C33456b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f91302c = new C33457c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f91303d = new C33458d();

    /* renamed from: e */
    private static final float f91304e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f */
    private static float f91305f = -1.0f;

    /* compiled from: Utils.java */
    /* renamed from: h0.j$a */
    /* loaded from: classes2.dex */
    class C33455a extends ThreadLocal<PathMeasure> {
        C33455a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h0.j$b */
    /* loaded from: classes2.dex */
    class C33456b extends ThreadLocal<Path> {
        C33456b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h0.j$c */
    /* loaded from: classes2.dex */
    class C33457c extends ThreadLocal<Path> {
        C33457c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h0.j$d */
    /* loaded from: classes2.dex */
    class C33458d extends ThreadLocal<float[]> {
        C33458d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m23862a(Path path, float f, float f2, float f3) {
        L.m103402a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f91300a.get();
        Path path2 = f91301b.get();
        Path path3 = f91302c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            L.m103401b("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = MiscUtils.m23869g(min, length);
                max = MiscUtils.m23869g(max, length);
            }
            if (min < 0.0f) {
                min = MiscUtils.m23869g(min, length);
            }
            if (max < 0.0f) {
                max = MiscUtils.m23869g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                L.m103401b("applyTrimPathIfNeeded");
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
            L.m103401b("applyTrimPathIfNeeded");
        } else {
            L.m103401b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m23861b(Path path, @Nullable TrimPathContent trimPathContent) {
        if (trimPathContent != null && !trimPathContent.m2076j()) {
            m23862a(path, ((FloatKeyframeAnimation) trimPathContent.m2078h()).m1143p() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.m2081d()).m1143p() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.m2079g()).m1143p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m23860c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m23859d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
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

    /* renamed from: e */
    public static float m23858e() {
        if (f91305f == -1.0f) {
            f91305f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f91305f;
    }

    /* renamed from: f */
    public static float m23857f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m23856g(Matrix matrix) {
        float[] fArr = f91303d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f91304e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m23855h(Matrix matrix) {
        float[] fArr = f91303d.get();
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

    /* renamed from: i */
    public static int m23854i(float f, float f2, float f3, float f4) {
        int i;
        if (f != 0.0f) {
            i = (int) (((float) IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * f);
        } else {
            i = 17;
        }
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            return (int) (i * 31 * f4);
        }
        return i;
    }

    /* renamed from: j */
    public static boolean m23853j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 <= i5 && i3 < i6) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m23852k(Throwable th) {
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static Bitmap m23851l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m23850m(Canvas canvas, RectF rectF, Paint paint) {
        m23849n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m23849n(Canvas canvas, RectF rectF, Paint paint, int i) {
        L.m103402a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        L.m103401b("Utils#saveLayer");
    }
}
