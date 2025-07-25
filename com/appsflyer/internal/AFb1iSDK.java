package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class AFb1iSDK implements AFb1tSDK {
    private final AFd1nSDK valueOf;

    public AFb1iSDK(AFd1nSDK aFd1nSDK) {
        this.valueOf = aFd1nSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.appsflyer.internal.AFb1qSDK valueOf(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            long r3 = r5.length()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            int r3 = (int) r3     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            char[] r3 = new char[r3]     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            r2.read(r3)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            com.appsflyer.internal.AFb1qSDK r4 = new com.appsflyer.internal.AFb1qSDK     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            r4.<init>(r3)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            r4.AFInAppEventType = r5     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L2e:
            return r4
        L2f:
            r5 = move-exception
            goto L35
        L31:
            r5 = move-exception
            goto L47
        L33:
            r5 = move-exception
            r2 = r1
        L35:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L44
            r2.close()     // Catch: java.io.IOException -> L40
            goto L44
        L40:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L44:
            return r1
        L45:
            r5 = move-exception
            r1 = r2
        L47:
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.valueOf(java.io.File):com.appsflyer.internal.AFb1qSDK");
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    @NonNull
    @WorkerThread
    public final List<AFb1qSDK> AFInAppEventParameterName() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.valueOf.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.CACHE;
            StringBuilder sb2 = new StringBuilder("Found cached request");
            sb2.append(file2.getName());
            aFLogger.m92149i(aFg1bSDK, sb2.toString());
            arrayList.add(valueOf(file2));
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    @WorkerThread
    public final void AFInAppEventType() {
        try {
            if (new File(this.valueOf.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.valueOf.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    @WorkerThread
    public final void AFKeystoreWrapper() {
        try {
            File file = new File(this.valueOf.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1bSDK aFg1bSDK = AFg1bSDK.CACHE;
                StringBuilder sb2 = new StringBuilder("Found cached request");
                sb2.append(file2.getName());
                aFLogger.m92149i(aFg1bSDK, sb2.toString());
                StringBuilder sb3 = new StringBuilder("Deleting ");
                sb3.append(file2.getName());
                sb3.append(" from cache");
                aFLogger.m92149i(aFg1bSDK, sb3.toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1tSDK
    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String AFInAppEventType(com.appsflyer.internal.AFb1qSDK r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.AFInAppEventType(com.appsflyer.internal.AFb1qSDK):java.lang.String");
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    @WorkerThread
    public final boolean valueOf(String str) {
        File file = new File(new File(this.valueOf.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.CACHE;
        StringBuilder sb2 = new StringBuilder("Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        aFLogger.m92149i(aFg1bSDK, sb2.toString());
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("CACHE: Could not delete ");
                sb3.append(str);
                sb3.append(" from cache");
                AFLogger.afErrorLog(sb3.toString(), e);
                return false;
            }
        }
        return true;
    }
}
