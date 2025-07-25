package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bytedance.sdk.component.utils.eqN */
/* loaded from: classes3.dex */
public class C7754eqN {
    /* renamed from: bg */
    public static Bitmap m87833bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static byte[] m87835bg(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: bg */
    public static Bitmap m87834bg(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i < width && i2 < height) {
                Matrix matrix = new Matrix();
                matrix.postScale(i / width, i2 / height);
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            }
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
