package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.util.s */
/* loaded from: classes4.dex */
public abstract class AbstractC15471s {
    /* renamed from: a */
    public static StringBuffer m76463a(InputStream inputStream) {
        if (inputStream != null) {
            ByteBuffer byteBuffer = (ByteBuffer) C15445f.f30593b.f30594a.poll();
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocateDirect(16384);
            }
            StringBuffer stringBuffer = new StringBuffer();
            byte[] array = (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
            int i = 0;
            while (i != -1) {
                stringBuffer.append(new String(array, 0, i));
                i = inputStream.read(array);
            }
            C15445f.f30593b.f30594a.offer(byteBuffer);
            return stringBuffer;
        }
        throw new IllegalArgumentException("stream required");
    }

    /* renamed from: b */
    public static void m76458b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m76462a(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (inputStream == null) {
            throw new IOException("Unable to copy from or to a null stream.");
        }
        byte[] bArr = new byte[65536];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                IAlog.m76529a("Copied stream content length = %d", Integer.valueOf(i));
                return;
            } else {
                i += read;
                fileOutputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: a */
    public static String m76460a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    /* renamed from: a */
    public static void m76465a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static Object m76459a(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: a */
    public static int m76461a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static void m76464a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m76466a(int i, int i2) {
        return Integer.compare(i, i2);
    }
}
