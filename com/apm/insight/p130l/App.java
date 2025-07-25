package com.apm.insight.p130l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.apm.insight.AppDataCenter;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.runtime.p131a.ActivityDataManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.a */
/* loaded from: classes2.dex */
public final class App {

    /* renamed from: a */
    private static String f3907a = null;

    /* renamed from: b */
    private static Class<?> f3908b = null;

    /* renamed from: c */
    private static Field f3909c = null;

    /* renamed from: d */
    private static Field f3910d = null;

    /* renamed from: e */
    private static boolean f3911e = false;

    /* renamed from: a */
    private static long m101760a(int i) {
        if (i < 0) {
            return 0L;
        }
        return i << 10;
    }

    /* renamed from: b */
    public static ActivityManager.ProcessErrorStateInfo m101756b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == myPid && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m101755c(Context context) {
        String m101754d = m101754d(context);
        if (m101754d != null && m101754d.contains(":")) {
            return false;
        }
        if (m101754d != null && m101754d.equals(context.getPackageName())) {
            return true;
        }
        if (m101754d == null || !m101754d.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static String m101754d(Context context) {
        if (!TextUtils.isEmpty(f3907a)) {
            return f3907a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f3907a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String m101761a = m101761a();
        f3907a = m101761a;
        if (m101761a == null) {
            return "";
        }
        return m101761a;
    }

    /* renamed from: e */
    public static String m101753e(Context context) {
        Class<?> m101750h = m101750h(context);
        if (f3909c == null && m101750h != null) {
            try {
                f3909c = m101750h.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f3909c;
        if (field != null) {
            try {
                return String.valueOf(field.get(null));
            } catch (Throwable unused2) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: f */
    public static int m101752f(Context context) {
        Class<?> m101750h = m101750h(context);
        if (f3910d == null && m101750h != null) {
            try {
                f3910d = m101750h.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f3910d;
        if (field != null) {
            try {
                return ((Integer) field.get(null)).intValue();
            } catch (Throwable unused2) {
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static boolean m101751g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: h */
    private static Class<?> m101750h(Context context) {
        if (f3908b == null && !f3911e) {
            try {
                f3908b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f3911e = true;
        }
        return f3908b;
    }

    /* renamed from: a */
    public static boolean m101759a(Context context) {
        if (context == null) {
            return ActivityDataManager.m101483d().m101475f();
        }
        return ActivityDataManager.m101483d().m101475f() || m101751g(context);
    }

    /* renamed from: a */
    public static void m101757a(String str) {
        f3907a = str;
    }

    /* renamed from: a */
    private static String m101761a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb2.append((char) read);
                    } else {
                        String sb3 = sb2.toString();
                        AppDataCenter.m102180a((Closeable) bufferedReader);
                        return sb3;
                    }
                }
            } catch (Throwable unused) {
                AppDataCenter.m102180a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* renamed from: a */
    public static void m101758a(Context context, JSONObject jSONObject) {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dalvikPrivateDirty", m101760a(memoryInfo.dalvikPrivateDirty));
            jSONObject2.put("dalvikPss", m101760a(memoryInfo.dalvikPss));
            jSONObject2.put("dalvikSharedDirty", m101760a(memoryInfo.dalvikSharedDirty));
            jSONObject2.put("nativePrivateDirty", m101760a(memoryInfo.nativePrivateDirty));
            jSONObject2.put("nativePss", m101760a(memoryInfo.nativePss));
            jSONObject2.put("nativeSharedDirty", m101760a(memoryInfo.nativeSharedDirty));
            jSONObject2.put("otherPrivateDirty", m101760a(memoryInfo.otherPrivateDirty));
            jSONObject2.put("otherPss", m101760a(memoryInfo.otherPss));
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m101760a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("totalPrivateClean", DebugMemInfoCompat.m101748a(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", m101760a(memoryInfo.getTotalPss()));
            jSONObject2.put("totalSharedClean", DebugMemInfoCompat.m101747b(memoryInfo));
            jSONObject2.put("totalSharedDirty", m101760a(memoryInfo.getTotalSharedDirty()));
            jSONObject2.put("totalSwappablePss", m101760a(DebugMemInfoCompat.m101746c(memoryInfo)));
            jSONObject.put("memory_info", jSONObject2);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                JSONObject jSONObject3 = new JSONObject();
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put("availMem", memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", JellyBeanV16Compat.m101682a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            boolean z = true;
            CrashBody.m101954a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
            jSONObject4.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            jSONObject4.put("max_memory", maxMemory);
            jSONObject4.put("free_memory", freeMemory);
            jSONObject4.put("total_memory", j);
            if (((float) (j - freeMemory)) <= ((float) maxMemory) * 0.95f) {
                z = false;
            }
            CrashBody.m101954a(jSONObject, "filters", "java_heap_leak", String.valueOf(z));
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", activityManager.getLargeMemoryClass());
            }
            jSONObject.put("app_memory_info", jSONObject4);
        } catch (Throwable unused2) {
        }
    }
}
