package com.apm.insight.p119b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.p119b.LooperMonitor;
import com.apm.insight.p130l.App;
import com.apm.insight.p130l.Stack;
import com.apm.insight.runtime.MonitorCrashInner;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.d */
/* loaded from: classes2.dex */
public final class ANRUtils {

    /* renamed from: a */
    private static String f3616a = null;

    /* renamed from: b */
    private static long f3617b = -1;

    /* renamed from: c */
    private static boolean f3618c = false;

    /* renamed from: d */
    private static FileObserver f3619d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f3620e;

    /* renamed from: b */
    public static boolean m102102b() {
        return f3618c;
    }

    /* renamed from: c */
    public static void m102101c() {
        f3620e = null;
    }

    /* renamed from: a */
    public static void m102103a(final String str, final LooperMonitor.InterfaceC3784a interfaceC3784a) {
        FileObserver fileObserver = f3619d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, @Nullable String str2) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        String unused = ANRUtils.f3616a = interfaceC3784a.m102064a();
                    } catch (Throwable th) {
                        Ensure.m102051a();
                        MonitorCrashInner.m101391a(th, "NPTH_CATCH");
                    }
                }
            }
        };
        f3619d = fileObserver2;
        fileObserver2.startWatching();
    }

    /* renamed from: a */
    public static JSONObject m102106a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", Stack.m101624a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
            return null;
        }
    }

    /* renamed from: a */
    public static String m102105a(Context context) {
        if (SystemClock.uptimeMillis() - f3617b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo m101756b = App.m101756b(context);
            if (m101756b != null && Process.myPid() == m101756b.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f3620e;
                if (processErrorStateInfo != null) {
                    if (String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(m101756b.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(m101756b.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(m101756b.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(m101756b.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(m101756b.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(m101756b.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(m101756b.longMsg))) {
                        return null;
                    }
                }
                f3620e = m101756b;
                f3616a = null;
                f3617b = SystemClock.uptimeMillis();
                f3618c = false;
                if (NpthBus.m101998t()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("|------------- processErrorStateInfo--------------|\n");
                    sb2.append("condition: " + m101756b.condition + "\n");
                    sb2.append("processName: " + m101756b.processName + "\n");
                    sb2.append("pid: " + m101756b.pid + "\n");
                    sb2.append("uid: " + m101756b.uid + "\n");
                    sb2.append("tag: " + m101756b.tag + "\n");
                    sb2.append("shortMsg : " + m101756b.shortMsg + "\n");
                    sb2.append("longMsg : " + m101756b.longMsg + "\n");
                    sb2.append("-----------------------end----------------------------");
                    return sb2.toString();
                }
                return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
            }
        } catch (Throwable unused) {
        }
        String str = f3616a;
        if (str != null) {
            f3618c = true;
            f3616a = null;
            f3617b = SystemClock.uptimeMillis();
            return str;
        }
        return null;
    }
}
