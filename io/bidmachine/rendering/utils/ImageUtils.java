package io.bidmachine.rendering.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class ImageUtils {
    public static void compressBitmap(@Nullable Bitmap bitmap, @NonNull OutputStream outputStream) {
        if (bitmap == null) {
            return;
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 85, outputStream);
        bitmap.recycle();
    }

    @NonNull
    public static BitmapFactory.Options createDefaultBitmapFactoryOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    @Nullable
    public static Bitmap getImageByFile(@NonNull File file, @NonNull BitmapFactory.Options options) {
        if (FileUtils.isEmpty(file)) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public static void saveImage(@NonNull File file, @NonNull byte[] bArr) {
        saveImage(file, bArr, createDefaultBitmapFactoryOptions());
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull File file, @NonNull BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public static void writeBitmap(@NonNull byte[] bArr, @NonNull OutputStream outputStream) {
        writeBitmap(bArr, outputStream, createDefaultBitmapFactoryOptions());
    }

    public static void saveImage(@NonNull File file, @NonNull byte[] bArr, @NonNull BitmapFactory.Options options) {
        FileOutputStream fileOutputStream;
        options.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            writeBitmap(bArr, fileOutputStream, options);
            C10512g.m79300q(fileOutputStream);
            C10512g.m79304m(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            C10512g.m79300q(fileOutputStream2);
            C10512g.m79304m(fileOutputStream2);
            throw th;
        }
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull byte[] bArr) {
        return toBitmap(bArr, createDefaultBitmapFactoryOptions());
    }

    public static void writeBitmap(@NonNull byte[] bArr, @NonNull OutputStream outputStream, @NonNull BitmapFactory.Options options) {
        compressBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), outputStream);
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull byte[] bArr, @NonNull BitmapFactory.Options options) {
        ByteArrayOutputStream byteArrayOutputStream;
        options.inJustDecodeBounds = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        } catch (Throwable th) {
            th = th;
        }
        try {
            writeBitmap(bArr, byteArrayOutputStream, options);
            Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            C10512g.m79300q(byteArrayOutputStream);
            C10512g.m79304m(byteArrayOutputStream);
            return decodeStream;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C10512g.m79300q(byteArrayOutputStream2);
            C10512g.m79304m(byteArrayOutputStream2);
            throw th;
        }
    }
}
