package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.C19821el;
import com.ironsource.C20062hs;
import com.ironsource.C20086i9;
import com.ironsource.C21114v8;
import com.ironsource.C21314zf;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceStorageUtils {

    /* renamed from: a */
    private static final String f53462a = "supersonicads";

    /* renamed from: b */
    private static C20062hs f53463b = null;

    /* renamed from: c */
    private static boolean f53464c = false;

    /* renamed from: a */
    private static void m54980a(Context context) {
        C20062hs c20062hs = f53463b;
        if (c20062hs != null && c20062hs.m58074b()) {
            deleteCacheDirectories(context);
        }
        C20062hs c20062hs2 = f53463b;
        if (c20062hs2 == null || !c20062hs2.m58073c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    /* renamed from: b */
    private static File m54978b(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        C20062hs c20062hs = f53463b;
        return (c20062hs == null || !c20062hs.m58072d()) ? mo57096f.mo57113t(context) : mo57096f.mo57142e(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object m54975c;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    m54975c = m54975c(file2);
                } catch (JSONException e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                if (m54975c instanceof JSONArray) {
                    name = "files";
                } else if (m54975c instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, m54975c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C21314zf c21314zf, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (c21314zf != null && c21314zf.isDirectory()) {
            File[] listFiles = c21314zf.listFiles();
            if (listFiles == null) {
                return new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            for (File file : listFiles) {
                C21314zf c21314zf2 = new C21314zf(file.getPath());
                if (c21314zf2.isFile()) {
                    name = c21314zf2.getName();
                    buildFilesMapOfDirectory = c21314zf2.m53847a();
                    if (jSONObject.has(name)) {
                        buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                    }
                } else if (c21314zf2.isDirectory()) {
                    name = c21314zf2.getName();
                    buildFilesMapOfDirectory = buildFilesMapOfDirectory(c21314zf2, jSONObject);
                }
                jSONObject2.put(name, buildFilesMapOfDirectory);
            }
            return jSONObject2;
        }
        return new JSONObject();
    }

    /* renamed from: c */
    private static File m54976c(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        C20062hs c20062hs = f53463b;
        return (c20062hs == null || !c20062hs.m58072d()) ? mo57096f.mo57111v(context) : mo57096f.mo57130k(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        m54979a(mo57096f.mo57142e(context));
        m54979a(mo57096f.mo57130k(context));
    }

    public static synchronized boolean deleteFile(C21314zf c21314zf) {
        synchronized (IronSourceStorageUtils.class) {
            if (c21314zf.exists()) {
                return c21314zf.delete();
            }
            return false;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        m54979a(mo57096f.mo57113t(context));
        m54979a(mo57096f.mo57111v(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                if (file.delete()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C20062hs c20062hs = f53463b;
        if (c20062hs != null && c20062hs.m58071e()) {
            return;
        }
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        if (canonicalPath2.startsWith(canonicalPath)) {
            return;
        }
        throw new Exception(C21114v8.C21117c.f53928u + canonicalPath2);
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File m54978b;
        if (m54981a() && SDKUtils.isExternalStorageAvailable() && (m54978b = m54978b(context)) != null && m54978b.canWrite()) {
            f53464c = true;
            return m54978b.getPath();
        }
        return m54976c(context).getPath();
    }

    public static ArrayList<C21314zf> getFilesInFolderRecursive(C21314zf c21314zf) {
        if (c21314zf != null && c21314zf.isDirectory()) {
            ArrayList<C21314zf> arrayList = new ArrayList<>();
            File[] listFiles = c21314zf.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    C21314zf c21314zf2 = new C21314zf(file.getPath());
                    if (c21314zf2.isDirectory()) {
                        arrayList.addAll(getFilesInFolderRecursive(c21314zf2));
                    }
                    if (c21314zf2.isFile()) {
                        arrayList.add(c21314zf2);
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList<>();
    }

    public static String getNetworkStorageDir(Context context) {
        File m54977b = m54977b(new File(getDiskCacheDirPath(context)));
        if (!m54977b.exists()) {
            m54977b.mkdir();
        }
        return m54977b.getPath();
    }

    public static long getTotalSizeOfDir(C21314zf c21314zf) {
        long totalSizeOfDir;
        long j = 0;
        if (c21314zf != null && c21314zf.isDirectory()) {
            File[] listFiles = c21314zf.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                C21314zf c21314zf2 = new C21314zf(file.getPath());
                if (c21314zf2.isFile()) {
                    totalSizeOfDir = c21314zf2.length();
                } else if (c21314zf2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c21314zf2);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(@NotNull Context context, @NotNull C20062hs c20062hs) {
        f53463b = c20062hs;
        m54980a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f53464c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file.getPath();
    }

    public static String readFile(C21314zf c21314zf) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c21314zf));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append('\n');
            } else {
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read != -1) {
                    fileOutputStream.write(bArr2, 0, read);
                    i += read;
                } else {
                    return i;
                }
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    /* renamed from: a */
    private static void m54979a(File file) {
        if (file != null) {
            deleteFolder(m54977b(file).getPath());
        }
    }

    /* renamed from: b */
    private static File m54977b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(f53462a);
        sb2.append(str);
        return new File(sb2.toString());
    }

    /* renamed from: c */
    private static Object m54975c(File file) {
        File[] listFiles;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), m54975c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static boolean m54981a() {
        C20062hs c20062hs;
        return Build.VERSION.SDK_INT > 29 && (c20062hs = f53463b) != null && c20062hs.m58075a();
    }
}
