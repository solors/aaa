package com.apm.insight.p130l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.FtsOptions;
import com.apm.insight.AppDataCenter;
import com.apm.insight.CrashType;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p124f.EnsureReporter;
import com.apm.insight.p129k.CrashUploader;
import com.apm.insight.runtime.MonitorCrashInner;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21018tj;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FileUtils.java */
/* renamed from: com.apm.insight.l.f */
/* loaded from: classes2.dex */
public final class C3822f {

    /* renamed from: a */
    private final int f3921a;

    /* renamed from: b */
    private String f3922b;

    /* renamed from: c */
    private JSONObject f3923c;

    /* renamed from: d */
    private byte[] f3924d;

    public C3822f(int i) {
        this.f3921a = i;
    }

    /* renamed from: a */
    public static void m101721a(@NonNull File file, @NonNull String str, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file, z);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            AppDataCenter.m102180a((Closeable) fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            AppDataCenter.m102180a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: b */
    private static String m101709b(File file, String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        if (sb2.length() != 0 && str != null) {
                            sb2.append(str);
                        }
                        sb2.append(readLine);
                    } else {
                        AppDataCenter.m102180a((Closeable) bufferedReader2);
                        return sb2.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    AppDataCenter.m102180a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0041 */
    @Nullable
    /* renamed from: c */
    public static Map<String, String> m101705c(File file) {
        FileInputStream fileInputStream;
        Closeable closeable;
        Properties properties;
        Closeable closeable2 = null;
        try {
            try {
                properties = new Properties();
                fileInputStream = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                AppDataCenter.m102180a(closeable2);
                throw th;
            }
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String str : stringPropertyNames) {
                    hashMap.put(str, properties.getProperty(str));
                }
                AppDataCenter.m102180a((Closeable) fileInputStream);
                return hashMap;
            } catch (IOException e2) {
                e = e2;
                AppDataCenter.m102158b((Throwable) e);
                AppDataCenter.m102180a((Closeable) fileInputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            AppDataCenter.m102180a(closeable2);
            throw th;
        }
    }

    /* renamed from: d */
    public static void m101703d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.m101585c(file2.getAbsolutePath());
        } catch (Throwable th) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
        }
    }

    /* renamed from: e */
    public static boolean m101702e(File file) {
        int m101585c;
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            m101585c = NativeImpl.m101585c(file.getAbsolutePath());
        } catch (Throwable th) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
        }
        if (m101585c > 0) {
            NativeImpl.m101599a(m101585c);
            return false;
        } else if (m101585c >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private static CrashBody m101701f(File file) {
        String str;
        CrashBody m101717a = m101717a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            File m101676a = LogPath.m101676a(file, ".".concat(String.valueOf(i)));
            if (m101676a.exists()) {
                try {
                    m101717a.m101941c(new JSONObject(m101714a(m101676a.getAbsolutePath(), "\n")));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        if (z) {
            str = "step";
        } else {
            str = FtsOptions.TOKENIZER_SIMPLE;
        }
        m101717a.m101959a("crash_type", str);
        JSONObject optJSONObject = m101717a.m101944c().optJSONObject("header");
        NpthBus.m102011g();
        JSONObject m101969f = Header.m101983a(m101717a.m101944c().optLong("crash_time", 0L)).m101969f();
        if (optJSONObject == null) {
            m101717a.m101955a(m101969f);
        } else {
            AppDataCenter.m102167a(optJSONObject, m101969f);
        }
        return m101717a;
    }

    public C3822f(byte[] bArr) {
        this.f3921a = 204;
        this.f3924d = bArr;
    }

    public C3822f(int i, Throwable th) {
        this.f3921a = i;
        this.f3922b = th.getMessage();
    }

    /* renamed from: a */
    public static void m101718a(@NonNull File file, @NonNull JSONObject jSONObject) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                JSONWriter.m101690a(jSONObject, bufferedWriter);
                AppDataCenter.m102180a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                AppDataCenter.m102180a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    public C3822f(String str) {
        this.f3921a = 206;
        this.f3922b = str;
    }

    /* renamed from: b */
    public static boolean m101710b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* renamed from: a */
    public static void m101719a(@NonNull File file, @NonNull JSONArray jSONArray) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                JSONWriter.m101692a(jSONArray, bufferedWriter);
                AppDataCenter.m102180a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                AppDataCenter.m102180a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    /* renamed from: c */
    public static EnsureReporter m101704c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m101714a(str, "\n"));
            EnsureReporter ensureReporter = new EnsureReporter();
            ensureReporter.m101902d(jSONObject.optString(C21018tj.f53565b));
            ensureReporter.m101904c(jSONObject.optString(KeyConstants.RequestBody.KEY_DID));
            ensureReporter.m101900e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                ensureReporter.m101913a(arrayList);
            }
            return ensureReporter;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public C3822f(JSONObject jSONObject) {
        this.f3921a = 0;
        this.f3923c = jSONObject;
    }

    /* renamed from: b */
    private static String m101708b(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z);
            m101718a(file2, jSONObject2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: a */
    public static boolean m101727a(@NonNull File file) {
        boolean m101727a;
        boolean z = true;
        if (file.exists()) {
            if (file.canWrite()) {
                if (file.isFile()) {
                    return file.delete();
                }
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; listFiles != null && i < listFiles.length; i++) {
                        if (listFiles[i].isFile()) {
                            if (listFiles[i].canWrite()) {
                                m101727a = listFiles[i].delete();
                            } else {
                                z = false;
                            }
                        } else {
                            m101727a = m101727a(listFiles[i]);
                        }
                        z &= m101727a;
                    }
                    return z & file.delete();
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m101706b(String str, String str2) throws Exception {
        ZipOutputStream zipOutputStream;
        Throwable th;
        File file = new File(str);
        try {
            new File(str2).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
        } catch (Throwable th2) {
            zipOutputStream = null;
            th = th2;
        }
        try {
            m101712a(zipOutputStream, file, "");
            AppDataCenter.m102180a((Closeable) zipOutputStream);
        } catch (Throwable th3) {
            th = th3;
            AppDataCenter.m102180a((Closeable) zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m101714a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m101709b(new File(str), str2);
    }

    /* renamed from: b */
    public static EnsureReporter m101707b(String str) {
        try {
            String m101714a = m101714a(str, "\n");
            if (m101714a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(m101714a);
            EnsureReporter ensureReporter = new EnsureReporter();
            ensureReporter.m101916a(jSONObject.optString("url"));
            ensureReporter.m101911a(jSONObject.optJSONObject("body"));
            ensureReporter.m101906b(jSONObject.optString("dump_file"));
            ensureReporter.m101910a(jSONObject.optBoolean("encrypt", false));
            return ensureReporter;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m101723a(File file, String str) throws IOException {
        return m101709b(file, str);
    }

    /* renamed from: a */
    public static JSONArray m101715a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m101726a(new File(str), -1L);
    }

    /* renamed from: a */
    public static JSONArray m101726a(@NonNull File file, long j) throws IOException {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    AppDataCenter.m102180a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    AppDataCenter.m102180a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    /* renamed from: b */
    public final byte[] m101711b() {
        return this.f3924d;
    }

    /* renamed from: a */
    public static EnsureReporter m101725a(File file, CrashType crashType) {
        String m101802c;
        CrashBody m101701f = m101701f(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = m101701f.m101944c().optJSONObject("header");
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + NpthBus.m102017c().m101405a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        EnsureReporter ensureReporter = new EnsureReporter();
        if (crashType == CrashType.LAUNCH) {
            m101802c = CrashUploader.m101798e();
        } else {
            m101802c = CrashUploader.m101802c();
        }
        ensureReporter.m101916a(m101802c);
        ensureReporter.m101911a(m101701f.m101944c());
        ensureReporter.m101910a(CrashUploader.m101815a());
        return ensureReporter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
        if (r18 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        r3 = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011b, code lost:
        r0 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r18 != false) goto L5;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.apm.insight.entity.CrashBody m101717a(java.io.File r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p130l.C3822f.m101717a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    @Nullable
    /* renamed from: a */
    public static void m101720a(File file, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO);
                    AppDataCenter.m102180a((Closeable) fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    AppDataCenter.m102158b((Throwable) e);
                    AppDataCenter.m102180a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    AppDataCenter.m102180a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    public static String m101722a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m101708b(file, str, str2, jSONObject, z);
    }

    /* renamed from: a */
    public static void m101724a(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file2 == null) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            file2.getParentFile().mkdirs();
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            AppDataCenter.m102180a((Closeable) fileInputStream);
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            try {
                e.printStackTrace();
                AppDataCenter.m102180a((Closeable) fileInputStream2);
                AppDataCenter.m102180a((Closeable) fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                AppDataCenter.m102180a((Closeable) fileInputStream2);
                AppDataCenter.m102180a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            AppDataCenter.m102180a((Closeable) fileInputStream2);
            AppDataCenter.m102180a((Closeable) fileOutputStream);
            throw th;
        }
        AppDataCenter.m102180a((Closeable) fileOutputStream);
    }

    /* renamed from: a */
    public static void m101716a(OutputStream outputStream, File... fileArr) throws IOException {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry(RemoteSettings.FORWARD_SLASH_STRING));
            for (File file : fileArr) {
                m101713a(zipOutputStream, file);
            }
            AppDataCenter.m102180a((Closeable) zipOutputStream);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            AppDataCenter.m102180a((Closeable) zipOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m101713a(ZipOutputStream zipOutputStream, File file) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            m101712a(zipOutputStream, file2, file2.getName());
        }
    }

    /* renamed from: a */
    private static void m101712a(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + RemoteSettings.FORWARD_SLASH_STRING));
            String str2 = str.length() == 0 ? "" : str + RemoteSettings.FORWARD_SLASH_STRING;
            for (int i = 0; i < listFiles.length; i++) {
                m101712a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (-1 != read) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    AppDataCenter.m102180a((Closeable) fileInputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            AppDataCenter.m102180a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean m101728a() {
        return this.f3921a != 207;
    }
}
