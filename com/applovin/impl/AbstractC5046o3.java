package com.applovin.impl;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.o3 */
/* loaded from: classes2.dex */
public abstract class AbstractC5046o3 {

    /* renamed from: a */
    private static final byte[] f8711a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f8712b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, C26485b.f69244a, "C"};

    /* renamed from: a */
    public static String m96880a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public static List m96877a(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: a */
    public static String m96879a(C4123bh c4123bh) {
        c4123bh.m100431d(24);
        int m100435b = c4123bh.m100435b(2);
        boolean m100434c = c4123bh.m100434c();
        int m100435b2 = c4123bh.m100435b(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (c4123bh.m100434c()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = c4123bh.m100435b(8);
        }
        int m100435b3 = c4123bh.m100435b(8);
        Object[] objArr = new Object[5];
        objArr[0] = f8712b[m100435b];
        objArr[1] = Integer.valueOf(m100435b2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(m100434c ? 'H' : 'L');
        objArr[4] = Integer.valueOf(m100435b3);
        StringBuilder sb2 = new StringBuilder(AbstractC5863xp.m93012a("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static byte[] m96875a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f8711a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: a */
    public static boolean m96878a(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    /* renamed from: a */
    public static Pair m96876a(byte[] bArr) {
        C4066ah c4066ah = new C4066ah(bArr);
        c4066ah.m100780f(9);
        int m100762w = c4066ah.m100762w();
        c4066ah.m100780f(20);
        return Pair.create(Integer.valueOf(c4066ah.m100801A()), Integer.valueOf(m100762w));
    }
}
