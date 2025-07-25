package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cicc2iiccc */
/* loaded from: classes8.dex */
public class C32455cicc2iiccc {
    private static final String coo2iico = "IOUtil";

    public static byte[] coo2iico(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                } catch (Exception e) {
                    MLog.m25888e(coo2iico, "readInputStream e : ", e);
                    coo2iico((Closeable) inputStream);
                    coo2iico(byteArrayOutputStream);
                    return null;
                }
            } finally {
                coo2iico((Closeable) inputStream);
                coo2iico(byteArrayOutputStream);
            }
        }
    }

    public static void coo2iico(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "closeSafely e : ", e);
            }
        }
    }
}
