package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cicic */
/* loaded from: classes8.dex */
public class C32579cicic {
    private static final String coo2iico = "Streams";

    private C32579cicic() {
    }

    public static void coo2iico(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null || outputStream == null) {
            throw new IOException("Unable to copy from or to a null stream.");
        }
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void coo2iico(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
            MLog.m25889e(coo2iico, "Unable to close stream. Ignoring.");
        }
    }
}
