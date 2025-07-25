package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Functions;
import p1046xd.Closeable;

/* renamed from: io.appmetrica.analytics.network.impl.e */
/* loaded from: classes9.dex */
public abstract class AbstractC35118e {
    /* renamed from: a */
    public static byte[] m20662a(int i, Functions functions) {
        try {
            InputStream inputStream = (InputStream) functions.invoke();
            if (inputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (-1 == read || i2 > i) {
                        break;
                    } else if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                        i2 += read;
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Closeable.m1220a(byteArrayOutputStream, null);
                Closeable.m1220a(inputStream, null);
                return byteArray;
            }
        } catch (Throwable unused) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static final Map m20661a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
