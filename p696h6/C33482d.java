package p696h6;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: FileUtils.java */
/* renamed from: h6.d */
/* loaded from: classes6.dex */
public class C33482d {
    @NonNull
    /* renamed from: a */
    public static String m23674a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[1024];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb2.append(new String(bArr, 0, read));
            }
            String sb3 = sb2.toString();
            try {
                inputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return sb3;
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                return "";
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static String m23673b(File file) {
        BufferedInputStream bufferedInputStream;
        if (file == null || !file.exists()) {
            return "";
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb2.append(new String(bArr, 0, read));
            }
            String sb3 = sb2.toString();
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            return sb3;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                th.printStackTrace();
                return "";
            } finally {
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m23672c(File file, String str) {
        if (file != null && !TextUtils.isEmpty(str)) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        bufferedOutputStream2.write(str.getBytes());
                        bufferedOutputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        try {
                            th.printStackTrace();
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                        } catch (Throwable th2) {
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
    }
}
