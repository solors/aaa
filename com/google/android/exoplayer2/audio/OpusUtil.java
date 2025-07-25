package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class OpusUtil {
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
    }

    /* renamed from: a */
    private static byte[] m74933a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: b */
    private static long m74932b(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long m74930d = m74930d(m74931c(bArr));
        long m74930d2 = m74930d(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m74933a(m74930d));
        arrayList.add(m74933a(m74930d2));
        return arrayList;
    }

    /* renamed from: c */
    private static int m74931c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: d */
    private static long m74930d(long j) {
        return (j * 1000000000) / 48000;
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static long getPacketDurationUs(byte[] bArr) {
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return m74932b(b2, b);
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((m74932b(b2, b) * 48000) / 1000000);
    }
}
