package com.bytedance.sdk.component.embedapplog;

import android.util.Log;

/* loaded from: classes3.dex */
class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e) {
            Log.e("pangle-encrypt", e.getMessage());
        }
    }

    PangleEncryptUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] decrypt(byte[] bArr, int i) {
        try {
            return ttDecrypt(bArr, i);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] encrypt(byte[] bArr, int i) {
        try {
            return ttEncrypt(bArr, i);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] bArr, int i);

    private static native byte[] ttEncrypt(byte[] bArr, int i);
}
