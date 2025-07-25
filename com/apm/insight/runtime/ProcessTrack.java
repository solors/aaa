package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.C3822f;
import com.apm.insight.p130l.LogPath;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.p */
/* loaded from: classes2.dex */
public final class ProcessTrack {

    /* renamed from: a */
    private static File f4086a;

    /* compiled from: ProcessTrack.java */
    /* renamed from: com.apm.insight.runtime.p$a */
    /* loaded from: classes2.dex */
    public static class C3860a {

        /* renamed from: a */
        public String f4087a;

        /* renamed from: b */
        private String f4088b;

        /* renamed from: c */
        private long f4089c;

        C3860a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.f4088b = split[0];
                this.f4087a = split[1];
                try {
                    this.f4089c = Long.parseLong(split[2]);
                    return;
                } catch (Throwable th) {
                    Ensure.m102051a();
                    MonitorCrashInner.m101391a(new RuntimeException("err ProcessTrack line:".concat(str), th), "NPTH_CATCH");
                    return;
                }
            }
            Ensure.m102051a();
            MonitorCrashInner.m101391a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
        }
    }

    /* renamed from: a */
    public static File m101333a(long j) {
        String m101650j = LogPath.m101650j(NpthBus.m102011g());
        return new File(m101650j, "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    @NonNull
    /* renamed from: a */
    public static HashMap<String, C3860a> m101332a(long j, String str) {
        File file = new File(LogPath.m101650j(NpthBus.m102011g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, C3860a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray m101726a = C3822f.m101726a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = m101726a.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = m101726a.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new C3860a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:2:0x0000, B:4:0x0004, B:10:0x0051, B:7:0x0010, B:8:0x004d), top: B:13:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m101331a(java.lang.String r10, java.lang.String r11) {
        /*
            java.io.File r0 = com.apm.insight.runtime.ProcessTrack.f4086a     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L4d
            android.content.Context r0 = com.apm.insight.NpthBus.m102011g()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = com.apm.insight.p130l.App.m101754d(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L10
            r0 = 0
            goto L4f
        L10:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L78
            android.content.Context r4 = com.apm.insight.NpthBus.m102011g()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = com.apm.insight.p130l.LogPath.m101650j(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "apminsight/ProcessTrack/"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L78
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r1 % r6
            long r1 = r1 - r8
            long r1 = r1 / r6
            r5.append(r1)     // Catch: java.lang.Throwable -> L78
            r1 = 47
            r5.append(r1)     // Catch: java.lang.Throwable -> L78
            r1 = 58
            r2 = 95
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L78
            r5.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = ".txt"
            r5.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L78
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L78
            com.apm.insight.runtime.ProcessTrack.f4086a = r3     // Catch: java.lang.Throwable -> L78
        L4d:
            java.io.File r0 = com.apm.insight.runtime.ProcessTrack.f4086a     // Catch: java.lang.Throwable -> L78
        L4f:
            if (r0 == 0) goto L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            r1.append(r10)     // Catch: java.lang.Throwable -> L78
            r10 = 32
            r1.append(r10)     // Catch: java.lang.Throwable -> L78
            r1.append(r11)     // Catch: java.lang.Throwable -> L78
            r1.append(r10)     // Catch: java.lang.Throwable -> L78
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78
            r1.append(r10)     // Catch: java.lang.Throwable -> L78
            r10 = 10
            r1.append(r10)     // Catch: java.lang.Throwable -> L78
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L78
            r11 = 1
            com.apm.insight.p130l.C3822f.m101721a(r0, r10, r11)     // Catch: java.lang.Throwable -> L78
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.ProcessTrack.m101331a(java.lang.String, java.lang.String):void");
    }
}
