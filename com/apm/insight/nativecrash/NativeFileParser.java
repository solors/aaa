package com.apm.insight.nativecrash;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.AppDataCenter;
import com.apm.insight.Ensure;
import com.apm.insight.ICommonParams;
import com.apm.insight.p130l.C3822f;
import com.apm.insight.p130l.LogPath;
import com.apm.insight.runtime.MonitorCrashInner;
import com.ironsource.C21018tj;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.nativecrash.b */
/* loaded from: classes2.dex */
public final class NativeFileParser {

    /* renamed from: a */
    private Context f3967a;

    /* renamed from: b */
    private ICommonParams f3968b;

    /* renamed from: c */
    private ICommonParams f3969c;

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$a */
    /* loaded from: classes2.dex */
    public static class C3836a extends C3838c {
        C3836a(File file) {
            super(file);
            this.f3971b = "Total FD Count:";
            this.f3972c = ":";
            this.f3973d = -2;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$b */
    /* loaded from: classes2.dex */
    public static class C3837b extends C3838c {
        C3837b(File file) {
            super(file);
            this.f3971b = "VmSize:";
            this.f3972c = "\\s+";
            this.f3973d = -1;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$d */
    /* loaded from: classes2.dex */
    public static class C3839d extends C3838c {
        C3839d(File file) {
            super(file);
        }

        @NonNull
        /* renamed from: b */
        public final HashMap<String, List<String>> m101529b() {
            JSONArray m101715a;
            String str;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                m101715a = C3822f.m101715a(this.f3970a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                Ensure.m102051a();
                MonitorCrashInner.m101391a(th, "NPTH_CATCH");
            }
            if (m101715a == null) {
                return hashMap;
            }
            for (int i = 0; i < m101715a.length(); i++) {
                String optString = m101715a.optString(i);
                if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                    int indexOf = optString.indexOf("[routine:0x");
                    int i2 = indexOf + 11;
                    int indexOf2 = optString.indexOf(93, i2);
                    if (indexOf > 0) {
                        str = optString.substring(i2, indexOf2);
                    } else {
                        str = "unknown addr";
                    }
                    List<String> list = hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(str, list);
                    }
                    list.add(optString);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$e */
    /* loaded from: classes2.dex */
    public static class C3840e extends C3838c {
        C3840e(File file) {
            super(file);
        }

        @NonNull
        /* renamed from: a */
        public final JSONArray m101528a(HashMap<String, List<String>> hashMap) {
            JSONArray m101715a;
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                m101715a = C3822f.m101715a(this.f3970a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                Ensure.m102051a();
                MonitorCrashInner.m101391a(th, "NPTH_CATCH");
            }
            if (m101715a == null) {
                return jSONArray;
            }
            for (int i = 0; i < m101715a.length(); i++) {
                String optString = m101715a.optString(i);
                if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                    String substring = optString.substring(2, indexOf);
                    if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + optString);
                        }
                        hashMap.remove(substring);
                    }
                }
            }
            for (List<String> list2 : hashMap.values()) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$f */
    /* loaded from: classes2.dex */
    public static class C3841f extends C3838c {
        C3841f(File file) {
            super(file);
            this.f3971b = "Total Threads Count:";
            this.f3972c = ":";
            this.f3973d = -2;
        }
    }

    public NativeFileParser(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m101541a(File file, File file2) {
        return new C3840e(file2).m101528a(new C3839d(file).m101529b());
    }

    /* renamed from: b */
    public static int m101537b(String str) {
        return new C3841f(LogPath.m101667c(str)).m101531a();
    }

    /* renamed from: c */
    public static int m101535c(String str) {
        return new C3837b(LogPath.m101664d(str)).m101531a();
    }

    /* renamed from: d */
    public final String m101534d() {
        try {
            return this.f3968b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final String m101533e() {
        try {
            return String.valueOf(this.f3968b.getCommonParams().get(C21018tj.f53565b));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: f */
    public final long m101532f() {
        try {
            return this.f3968b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public NativeFileParser(Context context, ICommonParams iCommonParams, NativeFileParser nativeFileParser) {
        this.f3967a = context;
        this.f3968b = iCommonParams;
        this.f3969c = nativeFileParser == null ? null : nativeFileParser.f3968b;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> m101538b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.f3969c     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L13
            java.util.Map r4 = r4.getCommonParams()     // Catch: java.lang.Throwable -> L28
            goto L18
        L13:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
        L18:
            com.apm.insight.ICommonParams r5 = r9.f3968b     // Catch: java.lang.Throwable -> L23
            java.util.Map r5 = r5.getCommonParams()     // Catch: java.lang.Throwable -> L23
            r4.putAll(r5)     // Catch: java.lang.Throwable -> L23
            r5 = r3
            goto L2d
        L23:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L2a
        L28:
            r4 = move-exception
            r5 = r3
        L2a:
            r8 = r5
            r5 = r4
            r4 = r8
        L2d:
            if (r4 != 0) goto L40
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L40
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.p130l.Stack.m101632a(r5)     // Catch: java.lang.Throwable -> L40
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L40
        L40:
            boolean r5 = m101539a(r4)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto La6
            android.content.Context r5 = r9.f3967a     // Catch: java.lang.Throwable -> L82
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L82
            android.content.Context r7 = r9.f3967a     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L82
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r5.versionName     // Catch: java.lang.Throwable -> L82
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L82
            int r6 = r5.versionCode     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L82
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r4.get(r1)     // Catch: java.lang.Throwable -> L82
            if (r6 != 0) goto Lec
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: java.lang.Throwable -> L82
            android.os.Bundle r5 = r5.metaData     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L78
            java.lang.String r3 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L82
        L78:
            if (r3 != 0) goto L7e
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L82
        L7e:
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L82
            goto Lec
        L82:
            android.content.Context r3 = r9.f3967a
            java.lang.String r3 = com.apm.insight.p130l.App.m101753e(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f3967a
            int r0 = com.apm.insight.p130l.App.m101752f(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto Lec
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto Lec
        La6:
            android.content.Context r0 = r9.f3967a     // Catch: java.lang.Throwable -> Lec
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lec
            android.content.Context r1 = r9.f3967a     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Lec
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> Lec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r1.<init>()     // Catch: java.lang.Throwable -> Lec
            android.content.Context r2 = r9.f3967a     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lec
            r1.append(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = ".BuildConfig"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lec
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lec
            if (r1 != 0) goto Lec
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lec
        Lec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.NativeFileParser.m101538b():java.util.Map");
    }

    @NonNull
    /* renamed from: c */
    public final ICommonParams m101536c() {
        return this.f3968b;
    }

    /* renamed from: a */
    public static int m101540a(String str) {
        return new C3836a(LogPath.m101671b(str)).m101531a();
    }

    /* renamed from: a */
    public final Map<String, Object> m101542a() {
        Object obj;
        Map<String, Object> m101538b = m101538b();
        if (((m101538b == null || (obj = m101538b.get(C21018tj.f53565b)) == null) ? null : String.valueOf(obj)) == null) {
            m101538b.put(C21018tj.f53565b, 4444);
        }
        return m101538b;
    }

    /* renamed from: a */
    public static boolean m101539a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$c */
    /* loaded from: classes2.dex */
    public static class C3838c {

        /* renamed from: a */
        protected File f3970a;

        /* renamed from: b */
        protected String f3971b;

        /* renamed from: c */
        protected String f3972c;

        /* renamed from: d */
        protected int f3973d;

        public C3838c(File file) {
            this.f3970a = file;
        }

        /* renamed from: a */
        public final int m101531a() {
            int i;
            Throwable th;
            if (!this.f3970a.exists() || !this.f3970a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f3970a));
                int i2 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2 = m101530a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        bufferedReader = bufferedReader2;
                        try {
                            Ensure.m102051a();
                            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                AppDataCenter.m102180a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (i2 == -1);
                AppDataCenter.m102180a((Closeable) bufferedReader2);
                return i2;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        /* renamed from: a */
        private int m101530a(String str) {
            int i = this.f3973d;
            if (str.startsWith(this.f3971b)) {
                try {
                    i = Integer.parseInt(str.split(this.f3972c)[1].trim());
                } catch (NumberFormatException e) {
                    Ensure.m102051a();
                    MonitorCrashInner.m101391a(e, "NPTH_CATCH");
                }
                if (i < 0) {
                    return -2;
                }
                return i;
            }
            return i;
        }
    }
}
