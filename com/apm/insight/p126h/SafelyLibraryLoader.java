package com.apm.insight.p126h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.p130l.C3822f;
import com.google.firebase.sessions.settings.RemoteSettings;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.apm.insight.h.c */
/* loaded from: classes2.dex */
public class SafelyLibraryLoader {
    static {
        new ArrayList();
    }

    @Nullable
    /* renamed from: a */
    public static String m101866a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String m101865a = m101865a(applicationInfo.sourceDir, str, file);
        if (m101865a == null) {
            return null;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            m101865a = m101865a(str2, str, file);
            if (m101865a == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = SafelyLibraryLoader.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (classLoader instanceof BaseDexClassLoader) {
                Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(classLoader);
                Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
                declaredField2.setAccessible(true);
                for (String str3 : (String[]) declaredField2.get(obj)) {
                    File file2 = new File(str3, System.mapLibraryName(str));
                    if (file2.exists()) {
                        C3822f.m101724a(file2, file);
                        AppDataCenter.m102178a(file.getAbsolutePath());
                        return null;
                    }
                }
                return "not_found";
            }
            return m101865a;
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* renamed from: a */
    private static String m101865a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str3;
        ZipEntry entry;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb2 = new StringBuilder("lib/");
                str3 = Build.CPU_ABI;
                sb2.append(str3);
                sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb2.append(System.mapLibraryName(str2));
                entry = zipFile.getEntry(sb2.toString());
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str3.indexOf(45);
            StringBuilder sb3 = new StringBuilder("lib/");
            if (indexOf <= 0) {
                indexOf = str3.length();
            }
            sb3.append(str3.substring(0, indexOf));
            sb3.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb3.append(System.mapLibraryName(str2));
            String sb4 = sb3.toString();
            ZipEntry entry2 = zipFile.getEntry(sb4);
            if (entry2 == null) {
                message = "Library entry not found:".concat(String.valueOf(sb4));
                AppDataCenter.m102180a((Closeable) null);
                AppDataCenter.m102180a((Closeable) null);
                AppDataCenter.m102172a(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        AppDataCenter.m102178a(file.getAbsolutePath());
                        AppDataCenter.m102180a((Closeable) fileOutputStream2);
                        AppDataCenter.m102180a((Closeable) inputStream2);
                        AppDataCenter.m102172a(zipFile);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                fileOutputStream = fileOutputStream2;
                inputStream = inputStream2;
                th = th3;
                try {
                    message = th.getMessage();
                    AppDataCenter.m102180a((Closeable) fileOutputStream);
                    AppDataCenter.m102180a((Closeable) inputStream);
                    AppDataCenter.m102172a(zipFile);
                    return message;
                } catch (Throwable th4) {
                    AppDataCenter.m102180a((Closeable) fileOutputStream);
                    AppDataCenter.m102180a((Closeable) inputStream);
                    AppDataCenter.m102172a(zipFile);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            inputStream = inputStream2;
            th = th5;
        }
    }
}
