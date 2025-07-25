package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
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

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String m67206a() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L1d
        L10:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L1c
            java.lang.String r0 = androidx.work.impl.utils.C3316a.m104005a()
            if (r0 != 0) goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.ProcessDetailsProvider.m67206a():java.lang.String");
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i, i2, z);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    @NotNull
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(@NotNull Context context) {
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
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(Intrinsics.m17075f(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) obj).getPid() == myPid) {
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
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (processDetails == null) {
            return buildProcessDetails$default(this, m67206a(), myPid, 0, false, 12, null);
        }
        return processDetails;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i, 0, false, 12, null);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i, int i2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i, i2, false, 8, null);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails build = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(processName).setPid(i).setImportance(i2).setDefaultProcess(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder()\n      .setProc…ltProcess)\n      .build()");
        return build;
    }
}
