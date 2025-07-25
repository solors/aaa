package com.amazon.p047a.p048a.p071o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

/* renamed from: com.amazon.a.a.o.a */
/* loaded from: classes2.dex */
public class FileUtils {
    private FileUtils() {
    }

    /* renamed from: a */
    public static final void m102878a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m102879a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m102877a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }
}
