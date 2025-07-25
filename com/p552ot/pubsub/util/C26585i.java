package com.p552ot.pubsub.util;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: com.ot.pubsub.util.i */
/* loaded from: classes7.dex */
public class C26585i {

    /* renamed from: a */
    public static final int f69731a = -1;

    /* renamed from: b */
    private static final String f69732b = "IOUtil";

    /* renamed from: c */
    private static final int f69733c = 4096;

    /* renamed from: a */
    public static void m41087a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static byte[] m41084b(InputStream inputStream) {
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
                    C26586j.m41078a(f69732b, "readInputStream e", e);
                    m41085b(byteArrayOutputStream);
                    return null;
                }
            } finally {
                m41085b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: c */
    public static byte[] m41083c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m41090a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static void m41091a(InputStream inputStream) {
        m41092a((Closeable) inputStream);
    }

    /* renamed from: a */
    public static void m41088a(OutputStream outputStream) {
        m41092a((Closeable) outputStream);
    }

    /* renamed from: a */
    public static void m41092a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m41090a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m41089a(inputStream, outputStream, 4096);
    }

    /* renamed from: a */
    public static long m41089a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: a */
    public static String m41086a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m41085b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(f69732b, "closeSafely e", th);
            }
        }
    }
}
