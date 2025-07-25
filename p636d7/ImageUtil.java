package p636d7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: d7.e */
/* loaded from: classes5.dex */
public class ImageUtil {

    /* renamed from: a */
    private static final LruCache<String, WeakReference<Bitmap>> f89539a = new LruCache<>(2097152);

    /* renamed from: a */
    public static Bitmap m25707a(Context context) {
        int intrinsicWidth;
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            if (applicationIcon instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) applicationIcon;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            int i = 1;
            if (applicationIcon.getIntrinsicWidth() <= 0) {
                intrinsicWidth = 1;
            } else {
                intrinsicWidth = applicationIcon.getIntrinsicWidth();
            }
            if (applicationIcon.getIntrinsicHeight() > 0) {
                i = applicationIcon.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            applicationIcon.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m25706b(int i, int i2, int i3, String str) {
        Bitmap bitmap = null;
        try {
            int parseColor = Color.parseColor(str);
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(parseColor);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint);
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: c */
    public static Bitmap m25705c(int i, Bitmap bitmap) {
        if (i > bitmap.getHeight()) {
            i = bitmap.getHeight();
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), i);
    }

    @Nullable
    /* renamed from: d */
    public static Bitmap m25704d(Context context, String str) {
        return m25703e(context, str).m25714a();
    }

    @NonNull
    /* renamed from: e */
    public static BitMapLoadResult m25703e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return new BitMapLoadResult(null, "0_3", "empty url");
        }
        String m25700b = MD5Util.m25700b(str);
        LruCache<String, WeakReference<Bitmap>> lruCache = f89539a;
        WeakReference<Bitmap> weakReference = lruCache.get(m25700b);
        if (weakReference != null && weakReference.get() != null) {
            Bitmap bitmap = weakReference.get();
            if (!bitmap.isRecycled()) {
                return new BitMapLoadResult(bitmap);
            }
        }
        File file = new File(context.getCacheDir(), m25700b);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                fileInputStream.close();
                if (decodeStream != null) {
                    lruCache.put(m25700b, new WeakReference<>(decodeStream));
                    return new BitMapLoadResult(decodeStream);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setDoInput(true);
            openConnection.setConnectTimeout(15000);
            openConnection.setReadTimeout(15000);
            openConnection.connect();
            return m25702f(openConnection.getInputStream(), file);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new BitMapLoadResult(null, "0_1", e2.toString());
        }
    }

    /* renamed from: f */
    private static BitMapLoadResult m25702f(InputStream inputStream, File file) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    inputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    bufferedOutputStream.write(byteArray);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArrayOutputStream.size());
                    f89539a.put(file.getName(), new WeakReference<>(decodeByteArray));
                    byteArrayOutputStream.close();
                    return new BitMapLoadResult(decodeByteArray);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BitMapLoadResult(null, "0_2", e.toString());
        }
    }
}
