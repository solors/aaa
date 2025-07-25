package com.mbridge.msdk.foundation.same.report.p450b;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.same.report.EventLibraryCommon;
import com.mbridge.msdk.foundation.same.report.MetricsReportUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.tracker.C22885e;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.b.c */
/* loaded from: classes6.dex */
public final class AnrMonitorManager {

    /* renamed from: a */
    private static long f56711a;

    /* renamed from: b */
    private static long f56712b;

    /* compiled from: AnrMonitorManager.java */
    /* renamed from: com.mbridge.msdk.foundation.same.report.b.c$a */
    /* loaded from: classes6.dex */
    private static final class C22006a implements ANRListener {
        @Override // com.mbridge.msdk.foundation.same.report.p450b.ANRListener
        /* renamed from: a */
        public final void mo52129a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.p450b.ANRListener
        /* renamed from: a */
        public final void mo52128a(final String str, final StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("AnrMonitorManager", "onAnrHappened: " + str);
            }
            if (AnrMonitorManager.m52133b(str)) {
                long unused = AnrMonitorManager.f56712b = System.currentTimeMillis();
                ThreadPoolUtils.m52224e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.b.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            AnrMonitorManager.m52136a(str, stackTraceElementArr);
                        } catch (Exception e) {
                            SameLogTool.m51823b("AnrMonitorManager", "handler anr failed", e);
                        }
                    }
                });
                return;
            }
            SameLogTool.m51827a("AnrMonitorManager", "onAnrHappened: can track false");
        }
    }

    /* renamed from: b */
    public static String m52132b(StackTraceElement[] stackTraceElementArr) {
        return m52130c(stackTraceElementArr) ? "1" : "0";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:7:0x0008, B:9:0x0011, B:11:0x0015, B:14:0x0020, B:31:0x0059, B:17:0x002b, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004b, B:32:0x005c, B:33:0x005f, B:36:0x0066), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m52130c(java.lang.StackTraceElement[] r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L7d
            int r1 = r6.length
            if (r1 != 0) goto L8
            goto L7d
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L71
            int r2 = r6.length     // Catch: java.lang.Exception -> L71
            r3 = r0
        Lf:
            if (r3 >= r2) goto L5f
            r4 = r6[r3]     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L5c
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L71
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L20
            goto L5c
        L20:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L71
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L2b
            goto L54
        L2b:
            java.lang.String r5 = "com.android"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "com.google"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "java.lang"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "android.os"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "android.app"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L54
            goto L56
        L54:
            r5 = r0
            goto L57
        L56:
            r5 = 1
        L57:
            if (r5 != 0) goto L5c
            r1.add(r4)     // Catch: java.lang.Exception -> L71
        L5c:
            int r3 = r3 + 1
            goto Lf
        L5f:
            int r6 = r1.size()     // Catch: java.lang.Exception -> L71
            if (r6 != 0) goto L66
            return r0
        L66:
            java.lang.Object r6 = r1.get(r0)     // Catch: java.lang.Exception -> L71
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L71
            boolean r6 = m52133b(r6)     // Catch: java.lang.Exception -> L71
            return r6
        L71:
            r6 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L7d
            java.lang.String r1 = "AnrMonitorManager"
            java.lang.String r2 = "isMBridgeFirst exception"
            com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(r1, r2, r6)
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.p450b.AnrMonitorManager.m52130c(java.lang.StackTraceElement[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m52133b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : CrashHandlerUtil.m52124a(CrashHandlerUtil.m52127a())) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static String m52135a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append("\r\n");
                    }
                }
                return sb2.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m52139a() {
        if (!m52134b()) {
            SameLogTool.m51827a("AnrMonitorManager", "anr monitor is not available");
            return;
        }
        try {
            AnrMonitor.m52146a().m52145a(m52131c(), new C22006a()).start();
        } catch (Exception e) {
            SameLogTool.m51823b("AnrMonitorManager", "start anr monitor failed", e);
        }
    }

    /* renamed from: b */
    private static boolean m52134b() {
        try {
            return SameOptimizedController.m51814a().m51810a("anr_monitor_available", false);
        } catch (Exception e) {
            SameLogTool.m51823b("AnrMonitorManager", "get anr monitor available failed", e);
            return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m52136a(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject m52116b = CrashHandlerUtil.m52126a(MBSDKContext.m52746m().m52792c()).m52116b(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
            m52116b.put("crashinfo", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", m52116b.toString());
            jSONObject.put("crash_first_index_from_mtg", m52132b(stackTraceElementArr));
            C22885e c22885e = new C22885e("m_anr_report");
            c22885e.m49601a(jSONObject);
            c22885e.m49603a(EventLibraryCommon.m52108c());
            c22885e.m49605a(0);
            c22885e.m49598b(1);
            MetricsReportUtil.m51992a().m51988d().m49540a(c22885e);
        } catch (JSONException e) {
            SameLogTool.m51823b("AnrMonitorManager", "reportANRByEventLibrary anr failed", e);
        }
    }

    /* renamed from: c */
    private static int m52131c() {
        try {
            int m51813a = SameOptimizedController.m51814a().m51813a("anr_check_timeout", 5000);
            if (m51813a <= 0) {
                return 5000;
            }
            return m51813a;
        } catch (Exception e) {
            SameLogTool.m51823b("AnrMonitorManager", "get anr check timeout failed", e);
            return 5000;
        }
    }
}
