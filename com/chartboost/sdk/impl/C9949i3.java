package com.chartboost.sdk.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import p1046xd.Closeable;

/* renamed from: com.chartboost.sdk.impl.i3 */
/* loaded from: classes3.dex */
public final class C9949i3 {

    /* renamed from: a */
    public static final C9949i3 f22279a = new C9949i3();

    /* renamed from: b */
    public static final byte[] f22280b = new byte[0];

    /* renamed from: a */
    public final int m81421a(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        long m81418b = m81418b(input, output);
        if (m81418b > 2147483647L) {
            return -1;
        }
        return (int) m81418b;
    }

    /* renamed from: b */
    public final long m81418b(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return m81420a(input, output, 8192);
    }

    /* renamed from: a */
    public final long m81420a(InputStream input, OutputStream output, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return m81419a(input, output, new byte[i]);
    }

    /* renamed from: a */
    public final long m81419a(InputStream input, OutputStream output, byte[] buffer) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        long j = 0;
        while (true) {
            int read = input.read(buffer);
            if (read == -1) {
                return j;
            }
            output.write(buffer, 0, read);
            j += read;
        }
    }

    /* renamed from: a */
    public final byte[] m81422a(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f22279a.m81421a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            Closeable.m1220a(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }
}
