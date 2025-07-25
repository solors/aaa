package com.maticoo.sdk.p405ad.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.maticoo.sdk.ad.utils.ImageUtils */
/* loaded from: classes6.dex */
public final class ImageUtils {
    public static BitmapDrawable base64ToDrawable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] decode = Base64.decode(str.substring(str.indexOf(";") + 8), 2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        if (decodeByteArray == null) {
            return null;
        }
        Resources system = Resources.getSystem();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(system, decodeByteArray);
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        bitmapDrawable.setTargetDensity((int) TypedValue.applyDimension(1, displayMetrics.xdpi, displayMetrics));
        return bitmapDrawable;
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable bitmap2Drawable(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public static Drawable bytes2Drawable(Context context, byte[] bArr) {
        return bitmap2Drawable(context, bytes2Bitmap(bArr));
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        while (true) {
            i4 >>= 1;
            if (i4 < i || (i3 = i3 >> 1) < i2) {
                break;
            }
            i5 <<= 1;
        }
        return i5;
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        Bitmap.Config config;
        Bitmap createBitmap;
        Bitmap.Config config2;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config2 = Bitmap.Config.ARGB_8888;
            } else {
                config2 = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        } else {
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(1, 1, config);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat);
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    private static byte[] input2Byte(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            inputStream.close();
        }
    }

    private static boolean isBMP(byte[] bArr) {
        if (bArr.length < 2 || bArr[0] != 66 || bArr[1] != 77) {
            return false;
        }
        return true;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            return false;
        }
        return true;
    }

    private static boolean isGIF(byte[] bArr) {
        if (bArr.length < 6 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 56) {
            return false;
        }
        byte b = bArr[4];
        if ((b != 55 && b != 57) || bArr[5] != 97) {
            return false;
        }
        return true;
    }

    private static boolean isJPEG(byte[] bArr) {
        if (bArr.length < 2 || bArr[0] != -1 || bArr[1] != -40) {
            return false;
        }
        return true;
    }

    private static boolean isPNG(byte[] bArr) {
        if (bArr.length < 8 || bArr[0] != -119 || bArr[1] != 80 || bArr[2] != 78 || bArr[3] != 71 || bArr[4] != 13 || bArr[5] != 10 || bArr[6] != 26 || bArr[7] != 10) {
            return false;
        }
        return true;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Bitmap getBitmap(String str) {
        if (isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap getBitmap(byte[] bArr, int i) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i, bArr.length);
    }
}
