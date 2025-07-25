package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0M */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC108860M {
    public static byte[] A00;
    public static String[] A01 = {"", "5RMLmaPj2fddIFPW54nmiFQPDQKlIy2x", "0506SZgMJJ7sv8mHDOEz9KlkL25eIrXm", "3YZMJbChCuRHZ", "0tP", "k2qiQoSuFgoxV", "", "m4QFNGv2UqCrxsi4qbKPCdwxAuw6y7wM"};

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "AJnFEtF8h38YXxkoJFDHCzPhEs51Q6lq";
            strArr[1] = "PqTCDiOjjtdJiv33jQVs3cEvP8T1eChE";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
            i4++;
        }
    }

    public static void A06() {
        A00 = new byte[]{-42, -39, -36, -43, -86, -97, -97};
        String[] strArr = A01;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "";
        strArr2[0] = "";
    }

    static {
        A06();
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C108870N c108870n = new C108870N(inputStream);
        c108870n.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c108870n, null, options);
        c108870n.reset();
        if (!c108870n.A00()) {
            options.inSampleSize = A00(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c108870n, null, options);
        }
        return BitmapFactory.decodeStream(c108870n);
    }

    public static Bitmap A02(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap A03(String str, int i, int i2, boolean z) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i > 0 && i2 > 0) {
                if (z) {
                    Bitmap A012 = A01(fileInputStream, i, i2);
                    A07(fileInputStream);
                    return A012;
                }
                Bitmap A02 = A02(str, i, i2);
                A07(fileInputStream);
                return A02;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return decodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    public static String A05(File file) {
        if (file != null) {
            return A04(0, 7, 92) + file.getPath();
        }
        return null;
    }

    public static void A07(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
