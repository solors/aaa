package p993u4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/* renamed from: u4.i */
/* loaded from: classes6.dex */
public class GzipUtil {
    /* renamed from: a */
    public static byte[] m3003a(String str) {
        if (str != null && str.length() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes(StandardCharsets.UTF_8));
                    gZIPOutputStream2.close();
                } catch (IOException e) {
                    e = e;
                    gZIPOutputStream = gZIPOutputStream2;
                    C44433l.m2992f(e);
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (IOException e3) {
                e = e3;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return new byte[0];
    }
}
