package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.common.C43597c;
import sg.bigo.ads.common.p909c.C43599b;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p940w.C43887b;

/* renamed from: sg.bigo.ads.common.utils.d */
/* loaded from: classes10.dex */
public final class C43819d {

    /* renamed from: a */
    public static int f114652a = 16908288;

    /* renamed from: b */
    private static int f114653b = 40;

    /* renamed from: c */
    private static int f114654c = 128;

    /* renamed from: d */
    private static int f114655d = 128;

    /* renamed from: a */
    public static Bitmap m4922a(int i, int i2, Bitmap.Config config) {
        try {
            return Bitmap.createBitmap(i, i2, config);
        } catch (Exception e) {
            C43782a.m5009a(0, "BitmapUtils", Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: b */
    private static Bitmap m4911b(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (Exception e) {
            C43782a.m5009a(0, "BitmapUtils", Log.getStackTraceString(e));
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static C43597c m4909c(String str) {
        Bitmap bitmap;
        BitmapFactory.Options m4912a = m4912a(str, C43617a.f114190a.getResources().getDisplayMetrics().widthPixels, C43822e.m4903c(C43617a.f114190a));
        try {
            bitmap = BitmapFactory.decodeFile(str, m4912a);
        } catch (OutOfMemoryError unused) {
            C43782a.m5009a(0, "BitmapUtils", "decodeImage OutOfMemoryError:size = " + m4912a.inSampleSize + ",filePath=" + str);
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        return new C43597c(bitmap, m4912a.outMimeType, str);
    }

    @Nullable
    /* renamed from: d */
    public static C43597c m4908d(String str) {
        Bitmap bitmap;
        BitmapFactory.Options m4912a = m4912a(str, f114654c, f114655d);
        try {
            bitmap = BitmapFactory.decodeFile(str, m4912a);
        } catch (OutOfMemoryError unused) {
            C43782a.m5009a(0, "BitmapUtils", "decodeIcon OutOfMemoryError:size = " + m4912a.inSampleSize + ",filePath=" + str);
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        return new C43597c(bitmap, m4912a.outMimeType, str);
    }

    /* renamed from: a */
    public static Bitmap m4921a(Context context, float f, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3) {
        return m4920a(context, f, i, i2, i3, false);
    }

    @Nullable
    /* renamed from: b */
    public static Bitmap m4910b(String str) {
        C43597c m4908d = m4908d(str);
        if (m4908d != null) {
            return m4908d.f114168a;
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m4920a(Context context, float f, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, boolean z) {
        Drawable m4955a;
        Paint paint;
        Paint paint2;
        Context context2 = context;
        Paint paint3 = null;
        if (f > 0.0f && (m4955a = C43810a.m4955a(context2, i)) != null) {
            Bitmap bitmap = ((BitmapDrawable) C43810a.m4955a(context2, i2)).getBitmap();
            Bitmap extractAlpha = z ? bitmap.extractAlpha() : null;
            Bitmap bitmap2 = ((BitmapDrawable) m4955a).getBitmap();
            Bitmap extractAlpha2 = z ? bitmap2.extractAlpha() : null;
            int width = bitmap2.getWidth() / 4;
            int i4 = 5;
            Bitmap m4922a = m4922a((bitmap2.getWidth() * 5) + (width * 4), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            if (m4922a == null) {
                return null;
            }
            m4922a.setDensity(bitmap2.getDensity());
            if (z) {
                paint = new Paint();
                paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.NORMAL));
            } else {
                paint = null;
            }
            Canvas canvas = new Canvas(m4922a);
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i4) {
                if (i5 <= f) {
                    if (paint != null && extractAlpha2 != null) {
                        paint.setColor(-12303292);
                        canvas.drawBitmap(extractAlpha2, i6, 0.0f, paint);
                    }
                    canvas.drawBitmap(bitmap2, i6, 0.0f, paint3);
                    i6 += bitmap2.getWidth() + width;
                    paint2 = paint3;
                } else {
                    if (paint != null && extractAlpha != null) {
                        paint.setColor(C43887b.m4686a(-12303292, 0.15f));
                        canvas.drawBitmap(extractAlpha, i6, 0.0f, paint);
                    }
                    float f2 = i6;
                    canvas.drawBitmap(bitmap, f2, 0.0f, paint3);
                    if (i5 == ((int) (f + 0.5f))) {
                        Bitmap bitmap3 = ((BitmapDrawable) C43810a.m4955a(context2, i3)).getBitmap();
                        if (paint != null) {
                            Bitmap extractAlpha3 = bitmap3.extractAlpha();
                            paint.setColor(-12303292);
                            canvas.drawBitmap(extractAlpha3, f2, 0.0f, paint);
                        }
                        paint2 = null;
                        canvas.drawBitmap(bitmap3, f2, 0.0f, (Paint) null);
                    } else {
                        paint2 = paint3;
                    }
                    i6 += bitmap.getWidth() + width;
                }
                i5++;
                paint3 = paint2;
                i4 = 5;
                context2 = context;
            }
            return m4922a;
        }
        return null;
    }

    @RequiresApi(api = 17)
    @WorkerThread
    /* renamed from: a */
    public static Bitmap m4919a(Context context, Bitmap bitmap) {
        Bitmap m4915a;
        if (bitmap == null) {
            return null;
        }
        int round = Math.round(bitmap.getWidth() * 0.25f);
        int round2 = Math.round(bitmap.getHeight() * 0.25f);
        if (round <= 0 || round2 <= 0 || (m4915a = m4915a(bitmap, round, round2)) == null) {
            return null;
        }
        Bitmap.Config config = m4915a.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            m4915a = bitmap.copy(config2, true);
        }
        Bitmap m4911b = m4911b(m4915a);
        C43599b c43599b = new C43599b(context);
        if (c43599b.m5328a(10.0f)) {
            c43599b.mo5324a(m4915a, m4911b);
            m4915a.recycle();
            c43599b.mo5326a();
            return m4911b;
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m4917a(Resources resources, int i) {
        try {
            return BitmapFactory.decodeResource(resources, i);
        } catch (Exception e) {
            C43782a.m5009a(0, "BitmapUtils", Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m4916a(@NonNull Bitmap bitmap) {
        Bitmap m4922a;
        float f;
        float f2;
        float f3;
        float f4;
        if (bitmap.isRecycled()) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0 || (m4922a = m4922a(width, height, Bitmap.Config.ARGB_8888)) == null) {
            return bitmap;
        }
        Canvas canvas = new Canvas(m4922a);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        if (width >= height) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f114653b, (int) ViewCompat.MEASURED_SIZE_MASK, -1, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            f4 = 0.0f;
            f3 = width;
            canvas.drawRect(0.0f, 0.0f, f3, f114653b, paint);
            f2 = height;
            paint2.setShader(new LinearGradient(0.0f, height - f114653b, 0.0f, f2, -1, (int) ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            f = height - f114653b;
        } else {
            paint.setShader(new LinearGradient(0.0f, 0.0f, f114653b, 0.0f, (int) ViewCompat.MEASURED_SIZE_MASK, -1, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            f = 0.0f;
            f2 = height;
            canvas.drawRect(0.0f, 0.0f, f114653b, f2, paint);
            f3 = width;
            paint2.setShader(new LinearGradient(width - f114653b, 0.0f, f3, 0.0f, -1, (int) ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            f4 = width - f114653b;
        }
        canvas.drawRect(f4, f, f3, f2, paint2);
        return m4922a;
    }

    /* renamed from: a */
    public static Bitmap m4915a(Bitmap bitmap, int i, int i2) {
        try {
            return Bitmap.createScaledBitmap(bitmap, i, i2, false);
        } catch (Exception e) {
            C43782a.m5009a(0, "BitmapUtils", Log.getStackTraceString(e));
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m4913a(String str) {
        C43597c m4909c = m4909c(str);
        if (m4909c != null) {
            return m4909c.f114168a;
        }
        return null;
    }

    /* renamed from: a */
    private static BitmapFactory.Options m4912a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i || i5 > i2) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (true) {
                if (i6 / i3 < i && i7 / i3 < i2) {
                    break;
                }
                i3 *= 2;
            }
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i3;
        return options;
    }

    @Nullable
    /* renamed from: a */
    public static AnimationDrawable m4914a(ImageView imageView, Bitmap bitmap) {
        if (imageView == null || bitmap == null) {
            return null;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            animationDrawable.addFrame(drawable, 0);
        }
        animationDrawable.addFrame(new BitmapDrawable(imageView.getResources(), bitmap), 300);
        animationDrawable.setOneShot(true);
        animationDrawable.setEnterFadeDuration(300);
        animationDrawable.start();
        imageView.setImageDrawable(animationDrawable);
        return animationDrawable;
    }

    /* renamed from: a */
    public static Drawable m4925a(float f, float f2, float f3, float f4, int i, float f5, @Nullable boolean[] zArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (C43828k.m4871a(zArr)) {
            return shapeDrawable;
        }
        float f6 = 0.0f;
        float f7 = (zArr.length <= 0 || !zArr[0]) ? 0.0f : -f5;
        float f8 = (zArr.length < 2 || !zArr[1]) ? 0.0f : -f5;
        float f9 = (zArr.length < 3 || !zArr[2]) ? 0.0f : -f5;
        if (zArr.length >= 4 && zArr[3]) {
            f6 = -f5;
        }
        return new InsetDrawable((Drawable) shapeDrawable, (int) f7, (int) f8, (int) f9, (int) f6);
    }

    /* renamed from: a */
    public static Drawable m4924a(float f, float f2, float f3, float f4, int i, int i2, float f5) {
        Drawable m4923a = m4923a(f, f2, f3, f4, (Rect) null, i);
        if (i2 == 0 || f5 <= 0.0f) {
            return m4923a;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m4923a, m4925a(f, f2, f3, f4, i2, f5, (boolean[]) null)});
        layerDrawable.setId(0, f114652a);
        return layerDrawable;
    }

    /* renamed from: a */
    public static Drawable m4923a(float f, float f2, float f3, float f4, @Nullable Rect rect, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return rect == null ? shapeDrawable : new InsetDrawable((Drawable) shapeDrawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    @RequiresApi(api = 17)
    /* renamed from: a */
    public static void m4918a(final Context context, final Bitmap bitmap, final ValueCallback<Bitmap> valueCallback) {
        if (context == null || bitmap == null) {
            return;
        }
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.utils.d.1
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap m4919a = C43819d.m4919a(context, bitmap);
                C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.common.utils.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        valueCallback.onReceiveValue(m4919a);
                    }
                });
            }
        });
    }
}
