package com.bytedance.sdk.component.p275zx.p277bX.p279bX;

import android.graphics.BitmapFactory;

/* renamed from: com.bytedance.sdk.component.zx.bX.bX.bg */
/* loaded from: classes3.dex */
public class C7797bg {
    /* renamed from: IL */
    public static boolean m87716IL(byte[] bArr) {
        if (bArr == null || bArr.length < 3 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70) {
            return false;
        }
        return true;
    }

    /* renamed from: bg */
    public static boolean m87713bg(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth <= 0) {
            return false;
        }
        return true;
    }
}
