package com.applovin.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.applovin.impl.rd */
/* loaded from: classes2.dex */
public abstract class AbstractC5262rd {
    /* renamed from: a */
    public static void m95905a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public static void m95908a(MediaFormat mediaFormat, C5235r3 c5235r3) {
        if (c5235r3 != null) {
            m95906a(mediaFormat, "color-transfer", c5235r3.f9302c);
            m95906a(mediaFormat, "color-standard", c5235r3.f9300a);
            m95906a(mediaFormat, "color-range", c5235r3.f9301b);
            m95905a(mediaFormat, "hdr-static-info", c5235r3.f9303d);
        }
    }

    /* renamed from: a */
    public static void m95907a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: a */
    public static void m95906a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m95904a(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
