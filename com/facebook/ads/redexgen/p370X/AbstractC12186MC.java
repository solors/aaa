package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.MC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12186MC {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC12185MB enumC12185MB) {
        byte[] decode = Base64.decode(enumC12185MB.A01(AbstractC12137LP.A02), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(EnumC12185MB enumC12185MB) {
        byte[] decode = Base64.decode(enumC12185MB.A01(AbstractC12137LP.A02), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C13029Zs c13029Zs, EnumC12185MB enumC12185MB) {
        return new BitmapDrawable(c13029Zs.getResources(), A01(enumC12185MB));
    }
}
