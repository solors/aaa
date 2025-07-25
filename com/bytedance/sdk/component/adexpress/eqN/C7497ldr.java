package com.bytedance.sdk.component.adexpress.eqN;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p275zx.p277bX.p278IL.C7786bg;
import com.bytedance.sdk.component.utils.C7738Kg;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.ldr */
/* loaded from: classes3.dex */
public class C7497ldr {

    /* renamed from: bg */
    private static final byte[] f16276bg = m88658bg("VP8X");

    /* renamed from: IL */
    public static void m88661IL(ImageView imageView, byte[] bArr, int i, int i2) {
        if (TextUtils.equals("png", C7738Kg.m87892bg(Arrays.copyOfRange(bArr, 0, C7738Kg.m87894bg())))) {
            m88660bX(imageView, bArr, i, i2);
        } else {
            m88659bg(imageView, bArr, i, i2);
        }
    }

    /* renamed from: bX */
    private static void m88660bX(ImageView imageView, byte[] bArr, int i, int i2) {
        eqN(imageView, bArr, i, i2);
    }

    /* renamed from: bg */
    private static byte[] m88658bg(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static void eqN(ImageView imageView, byte[] bArr, int i, int i2) {
        Bitmap m87773bg = new C7786bg(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).m87773bg(bArr);
        if (m87773bg != null) {
            imageView.setImageBitmap(m87773bg);
        }
    }

    /* renamed from: bg */
    public static void m88659bg(ImageView imageView, byte[] bArr, int i, int i2) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(wrap);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                imageView.setImageDrawable(decodeDrawable);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        eqN(imageView, bArr, i, i2);
    }

    /* renamed from: bg */
    public static boolean m88657bg(byte[] bArr, int i) {
        boolean m88656bg;
        int i2;
        try {
            m88656bg = m88656bg(bArr, i + 12, f16276bg);
            i2 = i + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i2) {
            return false;
        }
        return m88656bg && ((bArr[i2] & 2) == 2);
    }

    /* renamed from: bg */
    private static boolean m88656bg(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
