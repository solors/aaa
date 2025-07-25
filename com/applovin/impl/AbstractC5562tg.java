package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.tg */
/* loaded from: classes2.dex */
public abstract class AbstractC5562tg {
    /* renamed from: a */
    public static List m94447a(byte[] bArr) {
        long m94446b = m94446b(m94444c(bArr));
        long m94446b2 = m94446b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m94448a(m94446b));
        arrayList.add(m94448a(m94446b2));
        return arrayList;
    }

    /* renamed from: b */
    public static int m94445b(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: c */
    private static int m94444c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: b */
    private static long m94446b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: a */
    private static byte[] m94448a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
