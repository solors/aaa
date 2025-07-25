package com.apm.insight.p130l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.AppDataCenter;
import com.apm.insight.p129k.CrashUploader;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.apm.insight.l.d */
/* loaded from: classes2.dex */
public final class Device {

    /* renamed from: a */
    private static boolean f3914a = false;

    /* renamed from: b */
    private static int f3915b = -1;

    /* renamed from: c */
    private static final Pattern f3916c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static boolean m101738a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m101736b("ro.build.version.emui");
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m101731e();
        }
        return true;
    }

    /* renamed from: b */
    private static String m101736b(String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
            try {
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                AppDataCenter.m102180a((Closeable) bufferedReader);
                return str2;
            } catch (Throwable unused) {
                AppDataCenter.m102180a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* renamed from: c */
    public static boolean m101735c() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* renamed from: d */
    public static int m101733d() {
        int i = f3915b;
        if (i > 0) {
            return i;
        }
        int m101734c = m101734c("/sys/devices/system/cpu/possible");
        if (m101734c <= 0) {
            m101734c = m101734c("/sys/devices/system/cpu/present");
        }
        if (m101734c <= 0) {
            m101734c = m101730e("/sys/devices/system/cpu/");
        }
        if (m101734c <= 0) {
            m101734c = Runtime.getRuntime().availableProcessors();
        }
        if (m101734c <= 0) {
            m101734c = 1;
        }
        f3915b = m101734c;
        return m101734c;
    }

    /* renamed from: e */
    private static boolean m101731e() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static int m101734c(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    int m101732d = m101732d(readLine);
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    return m101732d;
                }
            } catch (Throwable unused2) {
                if (bufferedReader == null) {
                    return -1;
                }
                bufferedReader.close();
            }
        } catch (Throwable unused3) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
            return -1;
        }
    }

    /* renamed from: e */
    private static int m101730e(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.apm.insight.l.d.1

                /* renamed from: a */
                private final Pattern f3917a = Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    return this.f3917a.matcher(str2).matches();
                }
            });
            if (listFiles == null || listFiles.length <= 0) {
                return -1;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m101739a() {
        return m101736b("ro.build.version.emui");
    }

    /* renamed from: b */
    public static boolean m101737b() {
        if (!f3914a) {
            try {
                Class.forName("miui.os.Build");
                CrashUploader.f3868a = true;
                f3914a = true;
                return true;
            } catch (Exception unused) {
                f3914a = true;
            }
        }
        return CrashUploader.f3868a;
    }

    /* renamed from: d */
    private static int m101732d(String str) {
        Matcher matcher = f3916c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }
}
