package com.yandex.mobile.ads.impl;

import androidx.exifinterface.media.ExifInterface;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.ip */
/* loaded from: classes8.dex */
public final class C30575ip {

    /* renamed from: a */
    private static final byte[] f80576a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f80577b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, C26485b.f69244a, "C"};

    /* renamed from: a */
    public static String m33158a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f80577b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        int i5 = y32.f88010a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static byte[] m33156a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f80576a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: a */
    public static boolean m33157a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
