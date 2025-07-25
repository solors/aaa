package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.bytedance.sdk.component.utils.Kg */
/* loaded from: classes3.dex */
public class C7738Kg {

    /* renamed from: IL */
    private static final byte[] f16916IL;

    /* renamed from: bX */
    private static final byte[] f16917bX;

    /* renamed from: bg */
    private static final byte[] f16918bg;
    private static final byte[] eqN;

    /* renamed from: iR */
    private static final int f16919iR;
    private static final byte[] ldr;

    /* renamed from: zx */
    private static final byte[] f16920zx;

    static {
        byte[] bArr = {-1, -40, -1};
        f16918bg = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f16916IL = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        f16917bX = bArr3;
        byte[] m87893bg = m87893bg("BM");
        eqN = m87893bg;
        f16920zx = m87893bg("GIF87a");
        ldr = m87893bg("GIF89a");
        f16919iR = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(m87893bg.length), 6))).intValue();
    }

    /* renamed from: IL */
    private static boolean m87896IL(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f16918bg;
        if (length >= bArr2.length && m87891bg(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    /* renamed from: bX */
    private static boolean m87895bX(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f16916IL;
        if (length >= bArr2.length && m87891bg(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static int m87894bg() {
        return f16919iR;
    }

    private static boolean eqN(byte[] bArr) {
        if ((bArr.length >= 6 && m87891bg(bArr, f16920zx)) || m87891bg(bArr, ldr)) {
            return true;
        }
        return false;
    }

    private static boolean ldr(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f16917bX;
        if (length >= bArr2.length && m87891bg(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    /* renamed from: zx */
    private static boolean m87889zx(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = eqN;
        if (length >= bArr2.length && m87891bg(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static final String m87892bg(byte[] bArr) {
        return m87896IL(bArr) ? "jpeg" : m87895bX(bArr) ? "png" : eqN(bArr) ? "gif" : m87889zx(bArr) ? "bmp" : ldr(bArr) ? "ico" : "other";
    }

    /* renamed from: bg */
    private static boolean m87891bg(byte[] bArr, byte[] bArr2) {
        return m87890bg(bArr, bArr2, 0);
    }

    /* renamed from: bg */
    private static boolean m87890bg(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bg */
    private static byte[] m87893bg(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
