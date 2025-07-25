package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ProcessDetailsProvider {
    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    /* renamed from: a */
    private final ProcessDetails m66289a(String str, int i, int i2, boolean z) {
        return new ProcessDetails(str, i, i2, z);
    }

    /* renamed from: b */
    static /* synthetic */ ProcessDetails m66288b(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.m66289a(str, i, i2, z);
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        ActivityManager activityManager;
        List m17534m0;
        int m17154x;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = C37563v.m17166m();
        }
        m17534m0 = _Collections.m17534m0(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : m17534m0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        m17154x = C37566w.m17154x(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m17154x);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.m17075f(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ProcessDetails) obj).getPid() == myPid) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (processDetails == null) {
            return m66288b(this, getProcessName$com_google_firebase_firebase_sessions(), myPid, 0, false, 12, null);
        }
        return processDetails;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = android.app.Application.getProcessName();
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getProcessName$com_google_firebase_firebase_sessions() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "myProcessName()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = androidx.work.impl.utils.C3316a.m104005a()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.ProcessDetailsProvider.getProcessName$com_google_firebase_firebase_sessions():java.lang.String");
    }
}
