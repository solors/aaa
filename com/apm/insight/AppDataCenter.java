package com.apm.insight;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p126h.JavaCalls;
import com.apm.insight.p130l.LogPath;
import com.apm.insight.runtime.ApmConfig;
import com.apm.insight.runtime.MonitorCrashInner;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.a */
/* loaded from: classes2.dex */
public final class AppDataCenter {

    /* renamed from: a */
    private Map<CrashType, List<AttachUserData>> f3565a = new HashMap();

    /* renamed from: b */
    private Map<CrashType, List<AttachUserData>> f3566b = new HashMap();

    /* renamed from: c */
    private Map<String, String> f3567c = new HashMap();

    /* renamed from: d */
    private ICrashFilter f3568d = null;

    /* renamed from: c */
    private void m102154c(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.f3565a.get(crashType) == null) {
            list = new ArrayList<>();
            this.f3565a.put(crashType, list);
        } else {
            list = this.f3565a.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: d */
    private void m102152d(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.f3566b.get(crashType) == null) {
            list = new ArrayList<>();
            this.f3566b.put(crashType, list);
        } else {
            list = this.f3566b.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: e */
    private void m102150e(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f3565a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: f */
    private void m102148f(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f3566b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    @NonNull
    /* renamed from: g */
    private static File m102147g() {
        File file = new File(LogPath.m101663e(NpthBus.m102011g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m101579f(file.getAbsolutePath());
        return file;
    }

    @NonNull
    /* renamed from: h */
    private static File m102146h() {
        File file = new File(LogPath.m101663e(NpthBus.m102011g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m101583d(file.getAbsolutePath());
        return file;
    }

    /* renamed from: i */
    private static File m102145i() {
        File file = new File(LogPath.m101663e(NpthBus.m102011g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m101581e(file.getAbsolutePath());
        return file;
    }

    /* renamed from: j */
    private static File m102144j() {
        File file = new File(LogPath.m101663e(NpthBus.m102011g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m101577g(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m102185a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m102154c(CrashType.LAUNCH, attachUserData);
            m102154c(CrashType.JAVA, attachUserData);
            m102154c(CrashType.CUSTOM_JAVA, attachUserData);
            m102154c(CrashType.NATIVE, attachUserData);
            m102154c(CrashType.ANR, attachUserData);
            m102154c(CrashType.DART, attachUserData);
            return;
        }
        m102154c(crashType, attachUserData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m102163b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m102152d(CrashType.LAUNCH, attachUserData);
            m102152d(CrashType.JAVA, attachUserData);
            m102152d(CrashType.CUSTOM_JAVA, attachUserData);
            m102152d(CrashType.NATIVE, attachUserData);
            m102152d(CrashType.ANR, attachUserData);
            m102152d(CrashType.DART, attachUserData);
            return;
        }
        m102152d(crashType, attachUserData);
    }

    /* renamed from: e */
    public static File m102151e() {
        BufferedWriter bufferedWriter;
        File file = new File(LogPath.m101663e(NpthBus.m102011g()), "anr_trace.txt");
        if (!file.exists() && ApmConfig.m101507e()) {
            File file2 = new File("/data/anr/traces.txt");
            if (file2.exists()) {
                BufferedReader bufferedReader = null;
                try {
                    file.getParentFile().mkdirs();
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        int i = 0;
                        do {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                bufferedWriter.write(readLine);
                                bufferedWriter.write(10);
                                i += readLine.length();
                            } catch (IOException unused) {
                                bufferedReader = bufferedReader2;
                                m102180a((Closeable) bufferedReader);
                                m102180a((Closeable) bufferedWriter);
                                return file;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                m102180a((Closeable) bufferedReader);
                                m102180a((Closeable) bufferedWriter);
                                throw th;
                            }
                        } while (i < 1048576);
                        m102180a((Closeable) bufferedReader2);
                    } catch (IOException unused2) {
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = null;
                    }
                } catch (IOException unused3) {
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                }
                m102180a((Closeable) bufferedWriter);
                return file;
            }
            return file;
        }
        return file;
    }

    /* renamed from: f */
    public static int m102149f() {
        int myPid = Process.myPid();
        try {
            return new File("/proc/" + myPid + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m102155c() {
        File[] listFiles;
        File file = new File(NpthBus.m102011g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    file2.getName().split("_")[0].equals("0");
                    file2.delete();
                } catch (Throwable th) {
                    Ensure.m102051a();
                    MonitorCrashInner.m101391a(th, "NPTH_CATCH");
                    try {
                        file2.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static void m102153d() {
        try {
            m102177a(NpthBus.m102012f(), NpthBus.m102009i().getLogcatDumpCount(), NpthBus.m102009i().getLogcatLevel());
            if (NpthBus.m101996v()) {
                m102147g();
                m102145i();
                m102146h();
                m102144j();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m102183a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m102150e(CrashType.LAUNCH, attachUserData);
            m102150e(CrashType.JAVA, attachUserData);
            m102150e(CrashType.CUSTOM_JAVA, attachUserData);
            m102150e(CrashType.NATIVE, attachUserData);
            m102150e(CrashType.ANR, attachUserData);
            m102150e(CrashType.DART, attachUserData);
            return;
        }
        m102150e(crashType, attachUserData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m102161b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m102148f(CrashType.LAUNCH, attachUserData);
            m102148f(CrashType.JAVA, attachUserData);
            m102148f(CrashType.CUSTOM_JAVA, attachUserData);
            m102148f(CrashType.NATIVE, attachUserData);
            m102148f(CrashType.ANR, attachUserData);
            m102148f(CrashType.DART, attachUserData);
            return;
        }
        m102148f(crashType, attachUserData);
    }

    @Nullable
    /* renamed from: a */
    public final List<AttachUserData> m102184a(CrashType crashType) {
        return this.f3565a.get(crashType);
    }

    @Nullable
    /* renamed from: b */
    public final List<AttachUserData> m102162b(CrashType crashType) {
        return this.f3566b.get(crashType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m102173a(Map<? extends String, ? extends String> map) {
        this.f3567c.putAll(map);
    }

    @Nullable
    /* renamed from: b */
    public final ICrashFilter m102164b() {
        return this.f3568d;
    }

    /* renamed from: b */
    public static JSONArray m102157b(JSONArray jSONArray) {
        int i;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i2 = 0;
        while (true) {
            if (i2 >= 256) {
                break;
            }
            jSONArray2.put(jSONArray.opt(i2));
            i2++;
        }
        for (i = 256; i < 384; i++) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i)));
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public final Map<String, String> m102186a() {
        return this.f3567c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m102182a(ICrashFilter iCrashFilter) {
        this.f3568d = iCrashFilter;
    }

    @NonNull
    /* renamed from: a */
    public static File m102177a(String str, int i, int i2) {
        File file = new File(LogPath.m101678a(NpthBus.m102011g(), str), "logcat.txt");
        if (!file.exists() || file.length() <= 0) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
            NativeImpl.m101593a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
            return file;
        }
        return file;
    }

    @Nullable
    /* renamed from: b */
    public static JSONObject m102156b(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            m102175a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                m102176a("JSONUtil", "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m102180a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m102172a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public static void m102160b(Object obj) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m102178a(String str) {
        JavaCalls.m101876a("android.os.FileUtils", "setPermissions", str, Integer.valueOf((int) FacebookRequestErrorClassification.ESC_APP_INACTIVE), -1, -1);
    }

    /* renamed from: a */
    public static boolean m102170a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* renamed from: b */
    public static void m102158b(Throwable th) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static boolean m102171a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    @Nullable
    /* renamed from: a */
    public static String m102166a(JSONObject jSONObject, String... strArr) {
        JSONObject m102156b = m102156b(jSONObject, strArr);
        if (m102156b == null) {
            return null;
        }
        String optString = m102156b.optString(strArr[1]);
        m102176a("ApmConfig", "normal get configArray: " + strArr[1] + " : " + optString);
        return optString;
    }

    /* renamed from: b */
    public static boolean m102159b(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m102169a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject m102156b = m102156b(jSONObject, strArr);
        if (m102156b == null) {
            return i;
        }
        int optInt = m102156b.optInt(strArr[strArr.length - 1], i);
        m102176a("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + optInt);
        return optInt;
    }

    /* renamed from: a */
    public static boolean m102168a(JSONObject jSONObject, String str) {
        return m102170a(jSONObject) || m102171a(jSONObject.optJSONArray(str));
    }

    /* renamed from: a */
    public static void m102167a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static JSONArray m102165a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m102179a(Object obj) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m102174a(Throwable th) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    private static void m102175a(String str, Object obj, Throwable th) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }

    /* renamed from: a */
    public static void m102176a(String str, Object obj) {
        if (NpthBus.m102009i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* renamed from: a */
    public static void m102181a(CrashBody crashBody, Header header, CrashType crashType) {
        JSONObject m101944c;
        if (crashBody == null || (m101944c = crashBody.m101944c()) == null || crashType == null) {
            return;
        }
        long optLong = m101944c.optLong("crash_time");
        String m101405a = NpthBus.m102017c().m101405a();
        if (optLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + m101405a + "_" + optLong + "_" + crashType;
            if (header != null) {
                JSONObject m101969f = header.m101969f();
                if (m101969f != null) {
                    m101969f.put("unique_key", str);
                    return;
                }
                return;
            }
            m101944c.put("unique_key", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
