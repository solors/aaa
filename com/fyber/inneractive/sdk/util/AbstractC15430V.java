package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: com.fyber.inneractive.sdk.util.V */
/* loaded from: classes4.dex */
public abstract class AbstractC15430V {
    /* renamed from: a */
    public static String m76515a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* renamed from: a */
    public static Bitmap m76514a(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            IAlog.m76529a("IAimageLoaderUtil failed stringToBitMap with %s", e.getMessage());
            return null;
        }
    }
}
