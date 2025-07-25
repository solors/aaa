package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sg.bigo.ads.common.utils.g */
/* loaded from: classes10.dex */
public final class C43824g {
    /* renamed from: a */
    public static File m4887a(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m4885b(java.io.File r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.C43824g.m4885b(java.io.File):byte[]");
    }

    @NonNull
    /* renamed from: a */
    public static String m4886a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        String str = "";
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            str = byteArrayOutputStream.toString();
            m4888a((Closeable) inputStream);
            m4888a(byteArrayOutputStream);
        } catch (IOException unused2) {
            byteArrayOutputStream2 = byteArrayOutputStream;
            m4888a((Closeable) inputStream);
            if (byteArrayOutputStream2 != null) {
                m4888a(byteArrayOutputStream2);
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            m4888a((Closeable) inputStream);
            if (byteArrayOutputStream2 != null) {
                m4888a(byteArrayOutputStream2);
            }
            throw th;
        }
        return str;
    }

    /* renamed from: a */
    public static void m4888a(Closeable closeable) {
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
