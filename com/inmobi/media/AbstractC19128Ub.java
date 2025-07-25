package com.inmobi.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* renamed from: com.inmobi.media.Ub */
/* loaded from: classes6.dex */
public abstract class AbstractC19128Ub {

    /* renamed from: a */
    public static final Charset f47847a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f47848b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static String m60636a(InputStreamReader inputStreamReader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            inputStreamReader.close();
        }
    }

    /* renamed from: a */
    public static void m60637a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m60637a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    public static void m60638a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
