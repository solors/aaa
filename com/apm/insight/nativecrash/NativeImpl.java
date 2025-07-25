package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.AppDataCenter;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.p119b.ANRUtils;
import com.apm.insight.p119b.CrashANRHandler;
import com.apm.insight.p126h.NpthSoData;
import com.apm.insight.p130l.LogPath;
import java.io.File;

/* loaded from: classes2.dex */
public class NativeImpl {

    /* renamed from: a */
    private static volatile boolean f3947a = false;

    /* renamed from: b */
    private static volatile boolean f3948b = false;

    /* renamed from: c */
    private static boolean f3949c = true;

    /* renamed from: a */
    public static boolean m101600a() {
        if (f3948b) {
            return f3947a;
        }
        f3948b = true;
        if (!f3947a) {
            f3947a = AppDataCenter.m102159b("apminsighta");
        }
        return f3947a;
    }

    /* renamed from: b */
    public static int m101591b() {
        if (f3947a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    /* renamed from: c */
    public static void m101587c() {
    }

    /* renamed from: d */
    public static void m101584d() {
    }

    @Keep
    private static native boolean doCheckNativeCrash();

    @Keep
    private static native void doCloseFile(int i);

    @Keep
    private static native int doCreateCallbackThread();

    @Keep
    private static native void doDump(String str);

    @Keep
    private static native void doDumpFds(String str);

    @Keep
    private static native void doDumpHprof(String str);

    @Keep
    private static native void doDumpLogcat(String str, String str2, String str3);

    @Keep
    private static native void doDumpMaps(String str);

    @Keep
    private static native void doDumpMemInfo(String str);

    @Keep
    private static native void doDumpThreads(String str);

    @Keep
    private static native long doGetAppCpuTime();

    @Keep
    private static native long doGetChildCpuTime();

    @Keep
    private static native String doGetCrashHeader(String str);

    @Keep
    private static native long doGetDeviceCpuTime();

    @Keep
    private static native int doGetFDCount();

    @Keep
    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    @Keep
    private static native long doGetFreeMemory();

    @Keep
    private static native long doGetThreadCpuTime(int i);

    @Keep
    private static native int doGetThreadsCount();

    @Keep
    private static native long doGetTotalMemory();

    @Keep
    private static native long doGetVMSize();

    @Keep
    private static native void doInitThreadDump();

    @Keep
    private static native int doLock(String str, int i);

    @Keep
    private static native int doOpenFile(String str);

    @Keep
    private static native void doRebuildTombstone(String str, String str2, String str3);

    @Keep
    private static native void doSetAlogConfigPath(String str);

    @Keep
    private static native void doSetAlogFlushAddr(long j);

    @Keep
    private static native void doSetAlogLogDirAddr(long j);

    @Keep
    private static native void doSetResendSigQuit(int i);

    @Keep
    private static native void doSetUploadEnd();

    @Keep
    private static native void doSignalMainThread();

    @Keep
    private static native int doStart(int i, String str, String str2, String str3, int i2);

    @Keep
    private static native void doStartAnrMonitor(int i);

    @Keep
    private static native void doWriteFile(int i, String str, int i2);

    /* renamed from: e */
    public static boolean m101582e() {
        if (f3947a) {
            try {
                return doCheckNativeCrash();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m101580f() {
        if (f3947a) {
            try {
                return is64Bit();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m101578g() {
        new Thread(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    NativeImpl.m101570l();
                } catch (Throwable th) {
                    try {
                        Ensure.m102050a(th, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    /* renamed from: h */
    public static int m101575h(String str) {
        if (f3947a) {
            try {
                return doOpenFile(str);
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }

    @Keep
    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: i */
    public static void m101573i(String str) {
        if (f3947a) {
            doDump(str);
        }
    }

    @Keep
    private static native boolean is64Bit();

    /* renamed from: j */
    public static void m101572j() {
        if (!f3947a) {
            return;
        }
        doSetUploadEnd();
    }

    /* renamed from: k */
    public static void m101571k() {
        if (!f3947a) {
            return;
        }
        doInitThreadDump();
    }

    /* renamed from: l */
    static /* synthetic */ void m101570l() {
        if (f3947a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            NpthBus.m102008j();
            ANRUtils.m102101c();
            CrashANRHandler.m102099a(NpthBus.m102011g()).m102100a().m102119e();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static int m101585c(String str) {
        if (f3947a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static void m101583d(String str) {
        if (f3947a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m101589b(long j) {
        if (f3947a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m101581e(String str) {
        if (f3947a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public static void m101579f(String str) {
        if (f3947a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: h */
    public static boolean m101576h() {
        return f3949c;
    }

    /* renamed from: i */
    public static void m101574i() {
        if (f3947a) {
            doSignalMainThread();
        }
    }

    /* renamed from: c */
    public static long m101586c(int i) {
        if (f3947a) {
            return doGetThreadCpuTime(i);
        }
        return 0L;
    }

    /* renamed from: g */
    public static void m101577g(String str) {
        if (f3947a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m101588b(String str) {
        if (f3947a) {
            doDumpHprof(str);
        }
    }

    /* renamed from: a */
    public static boolean m101596a(@NonNull Context context) {
        String m101875a;
        boolean m101600a = m101600a();
        if (m101600a) {
            String str = LogPath.m101650j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                m101875a = context.getApplicationInfo().nativeLibraryDir;
            } else {
                m101875a = NpthSoData.m101875a();
                NpthSoData.m101872b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, m101875a, str, NpthBus.m102012f(), NpthBus.m102005m());
        }
        return m101600a;
    }

    /* renamed from: b */
    public static void m101590b(int i) {
        if (f3947a) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m101597a(long j) {
        if (f3947a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m101594a(String str) {
        if (f3947a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m101595a(File file) {
        if (f3947a) {
            doRebuildTombstone(LogPath.m101668c(file).getAbsolutePath(), LogPath.m101672b(file).getAbsolutePath(), LogPath.m101665d(file).getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static int m101599a(int i) {
        if (f3947a && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m101593a(String str, String str2, String str3) {
        if (f3947a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m101598a(int i, String str) {
        if (f3947a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m101592a(boolean z) {
        f3949c = z;
        if (f3947a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }
}
