package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDirContext;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDirManager;
import java.io.File;
import java.util.UUID;

/* renamed from: com.mbridge.msdk.foundation.tools.ai */
/* loaded from: classes6.dex */
public final class SameSDCardTool {

    /* renamed from: a */
    public static char[] f56912a = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: b */
    static String f56913b = "";

    /* renamed from: c */
    static boolean f56914c = false;

    /* renamed from: d */
    private static int f56915d = -1;

    /* renamed from: e */
    private static int f56916e = -1;

    /* renamed from: f */
    private static boolean f56917f = false;

    /* renamed from: g */
    private static int f56918g = -1;

    /* renamed from: h */
    private static int f56919h = -1;

    /* renamed from: a */
    public static int m51800a() {
        try {
            Context m52792c = MBSDKContext.m52746m().m52792c();
            long longValue = ((Long) SharedPreferencesUtils.m51698a(m52792c, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f56916e == -1) {
                f56916e = Long.valueOf((m51795c() / 1000) / 1000).intValue();
                SharedPreferencesUtils.m51697b(m52792c, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            SameLogTool.m51823b("SameSDCardTool", th.getMessage(), th);
        }
        return f56916e;
    }

    /* renamed from: b */
    public static int m51797b() {
        if (f56919h == -1) {
            try {
                f56919h = new Long((m51792e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                SameLogTool.m51823b("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f56919h;
    }

    /* renamed from: c */
    private static long m51795c() {
        if (m51793d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* renamed from: d */
    private static boolean m51793d() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            SameLogTool.m51824b("", "hasSDCard is failed");
            return false;
        }
    }

    /* renamed from: e */
    private static long m51792e() {
        if (m51793d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* renamed from: b */
    private static void m51796b(Context context) {
        MBridgeDirManager.m52274a(new MBridgeDirContext(m51794c(context)));
        MBridgeDirManager.m52276a().m52272b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        if ((m51795c() > 31457280) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m51794c(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L14
            java.io.File r1 = m51798a(r1)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r1 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(r2, r3, r1)
        L14:
            r1 = r0
        L15:
            boolean r2 = com.mbridge.msdk.foundation.tools.SameSDCardTool.f56914c
            if (r2 == 0) goto L65
            if (r1 != 0) goto L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r3 = "Android"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "data"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = m51798a(r2)
        L54:
            long r2 = m51795c()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 != 0) goto L65
            goto L66
        L65:
            r0 = r1
        L66:
            if (r0 == 0) goto L6e
            boolean r1 = r0.exists()
            if (r1 != 0) goto L76
        L6e:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r0 = r6.getAbsoluteFile()
        L76:
            java.lang.String r6 = r0.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameSDCardTool.m51794c(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static void m51799a(Context context) {
        if (context == null || f56917f) {
            return;
        }
        try {
            try {
                f56913b = context.getFilesDir().getAbsolutePath() + File.separator;
                f56914c = false;
                m51796b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            f56913b = context.getFilesDir().getAbsolutePath() + File.separator;
            m51796b(context);
        }
        f56917f = true;
    }

    /* renamed from: a */
    private static File m51798a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (file2.mkdirs()) {
            file2.delete();
            return file.getAbsoluteFile();
        }
        return null;
    }
}
