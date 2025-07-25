package p752k3;

import com.helpshift.log.HSLogger;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: k3.e */
/* loaded from: classes5.dex */
public class FileUtil {
    /* renamed from: a */
    public static void m18261a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m18261a(file2.getAbsolutePath());
                }
                if (!file2.delete()) {
                    HSLogger.m65441d("fileutil", "Failed to delete file : " + file2.getPath());
                }
            }
            if (!file.delete()) {
                HSLogger.m65441d("fileutil", "Failed to delete directory : " + str);
            }
        } else if (!file.delete()) {
            HSLogger.m65441d("fileutil", "Failed to delete directory : " + str);
        }
    }

    /* renamed from: b */
    public static String m18260b(String str) {
        FileInputStream fileInputStream;
        Exception e;
        File file;
        FileInputStream fileInputStream2 = null;
        try {
            file = new File(str);
            fileInputStream = new FileInputStream(file);
        } catch (Exception e2) {
            fileInputStream = null;
            e = e2;
        } catch (Throwable th) {
            th = th;
            C37383m.m18238b(fileInputStream2);
            throw th;
        }
        try {
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                fileInputStream.read(bArr, 0, length);
                String str2 = new String(bArr);
                C37383m.m18238b(fileInputStream);
                return str2;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C37383m.m18238b(fileInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            HSLogger.m65438e("fileutil", "Error reading file: " + str, e);
            C37383m.m18238b(fileInputStream);
            return "";
        }
    }
}
