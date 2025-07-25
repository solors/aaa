package com.amazon.p047a.p048a.p051b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.StringUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.amazon.a.a.b.c */
/* loaded from: classes2.dex */
public class CrashReport implements Serializable {

    /* renamed from: A */
    private static final String f2337A = "deviceDisplay";

    /* renamed from: B */
    private static final String f2338B = "deviceBrand";

    /* renamed from: C */
    private static final String f2339C = "deviceBoard";

    /* renamed from: D */
    private static final String f2340D = "androidVersion";

    /* renamed from: E */
    private static final String f2341E = "deviceModel";

    /* renamed from: F */
    private static final String f2342F = "packageFilePath";

    /* renamed from: G */
    private static final String f2343G = "packageName";

    /* renamed from: H */
    private static final String f2344H = "packageVersionName";

    /* renamed from: a */
    private static final KiwiLogger f2345a = new KiwiLogger("CrashReport");

    /* renamed from: b */
    private static final long f2346b = 1;

    /* renamed from: c */
    private static final String f2347c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* renamed from: d */
    private static final String f2348d = "SHA1";

    /* renamed from: e */
    private static final String f2349e = "crashTime";

    /* renamed from: f */
    private static final String f2350f = "UTF-8";

    /* renamed from: g */
    private static final String f2351g = "crashId";

    /* renamed from: h */
    private static final String f2352h = "threadDump";

    /* renamed from: i */
    private static final String f2353i = "stackTrace";

    /* renamed from: j */
    private static final String f2354j = "threadAllocSize";

    /* renamed from: k */
    private static final String f2355k = "threadAllocCount";

    /* renamed from: l */
    private static final String f2356l = "nativeHeapFreeSize";

    /* renamed from: m */
    private static final String f2357m = "nativeHeapSize";

    /* renamed from: n */
    private static final String f2358n = "memLowThreshold";

    /* renamed from: o */
    private static final String f2359o = "memLowFlag";

    /* renamed from: p */
    private static final String f2360p = "availableInternalMemorySize";

    /* renamed from: q */
    private static final String f2361q = "totalInternalMemorySize";

    /* renamed from: r */
    private static final String f2362r = "deviceUser";

    /* renamed from: s */
    private static final String f2363s = "deviceType";

    /* renamed from: t */
    private static final String f2364t = "deviceTime";

    /* renamed from: u */
    private static final String f2365u = "deviceTags";

    /* renamed from: v */
    private static final String f2366v = "deviceProduct";

    /* renamed from: w */
    private static final String f2367w = "deviceManufacturer";

    /* renamed from: x */
    private static final String f2368x = "deviceId";

    /* renamed from: y */
    private static final String f2369y = "deviceHost";

    /* renamed from: z */
    private static final String f2370z = "deviceFingerPrint";

    /* renamed from: I */
    private final HashMap<String, String> f2371I = new LinkedHashMap();

    public CrashReport(Application application, Throwable th) {
        try {
            m103156a(application, th);
        } catch (Throwable th2) {
            if (KiwiLogger.f2771b) {
                f2345a.m102825b("Error collection crash report details", th2);
            }
        }
    }

    /* renamed from: a */
    private void m103156a(Application application, Throwable th) {
        m103154b();
        m103157a(application);
        m103151c(application);
        m103155a(th);
        m103149e();
        m103148f();
    }

    /* renamed from: b */
    private void m103154b() {
        this.f2371I.put(f2349e, new Date().toString());
    }

    /* renamed from: c */
    private void m103151c(Application application) {
        this.f2371I.put("deviceModel", Build.MODEL);
        this.f2371I.put(f2340D, Build.VERSION.RELEASE);
        this.f2371I.put(f2339C, Build.BOARD);
        this.f2371I.put(f2338B, Build.BRAND);
        this.f2371I.put(f2337A, Build.DISPLAY);
        this.f2371I.put(f2370z, Build.FINGERPRINT);
        this.f2371I.put(f2369y, Build.HOST);
        this.f2371I.put(f2368x, Build.ID);
        this.f2371I.put(f2367w, Build.MANUFACTURER);
        this.f2371I.put(f2366v, Build.PRODUCT);
        this.f2371I.put(f2365u, Build.TAGS);
        this.f2371I.put(f2364t, Long.toString(Build.TIME));
        this.f2371I.put(f2363s, Build.TYPE);
        this.f2371I.put(f2362r, Build.USER);
        this.f2371I.put(f2361q, Long.toString(m103150d()));
        this.f2371I.put(f2360p, Long.toString(m103152c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f2371I.put(f2359o, Boolean.toString(memoryInfo.lowMemory));
            this.f2371I.put(f2358n, Long.toString(memoryInfo.threshold));
        }
        this.f2371I.put(f2357m, Long.toString(Debug.getNativeHeapSize()));
        this.f2371I.put(f2356l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f2371I.put(f2355k, Long.toString(Debug.getThreadAllocCount()));
        this.f2371I.put(f2354j, Long.toString(Debug.getThreadAllocSize()));
    }

    /* renamed from: d */
    private long m103150d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    /* renamed from: e */
    private void m103149e() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb2.append("Thread : " + key.getId());
            if (!StringUtils.m102808a(key.getName())) {
                sb2.append(RemoteSettings.FORWARD_SLASH_STRING + key.getName());
            }
            sb2.append("\n");
            sb2.append("isAlive : " + key.isAlive() + "\n");
            sb2.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb2.append("isDaemon : " + key.isDaemon() + "\n");
            for (int i = 0; i < value.length; i++) {
                sb2.append("\tat " + value[i] + "\n");
            }
            sb2.append("\n\n");
        }
        this.f2371I.put(f2352h, sb2.toString());
    }

    /* renamed from: f */
    private void m103148f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f2371I.get("packageName"));
            sb2.append(this.f2371I.get(f2344H));
            sb2.append(this.f2371I.get(f2340D));
            String str = this.f2371I.get(f2353i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f2347c).matcher(str);
                while (matcher.find()) {
                    sb2.append(matcher.group());
                }
            }
            this.f2371I.put(f2351g, new BigInteger(MessageDigest.getInstance(f2348d).digest(sb2.toString().getBytes("UTF-8"))).abs().toString(16));
        } catch (Exception e) {
            if (KiwiLogger.f2771b) {
                f2345a.m102825b("Error capturing crash id", e);
            }
        }
    }

    /* renamed from: b */
    private PackageInfo m103153b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (KiwiLogger.f2771b) {
                f2345a.m102825b("Unable to fetch package info", e);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private void m103157a(Application application) {
        PackageInfo m103153b = m103153b(application);
        if (m103153b == null) {
            return;
        }
        this.f2371I.put(f2344H, m103153b.versionName);
        this.f2371I.put("packageName", m103153b.packageName);
        this.f2371I.put(f2342F, application.getFilesDir().getAbsolutePath());
    }

    /* renamed from: a */
    private void m103155a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb2.append(stringWriter.toString());
        sb2.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb2.append(stringWriter.toString());
            cause = cause.getCause();
            sb2.append("\n\n");
        }
        printWriter.close();
        this.f2371I.put(f2353i, sb2.toString());
    }

    /* renamed from: a */
    public Map<String, String> m103158a() {
        return this.f2371I;
    }

    /* renamed from: c */
    private long m103152c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
