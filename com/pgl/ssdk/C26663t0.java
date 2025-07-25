package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.t0 */
/* loaded from: classes7.dex */
public class C26663t0 {

    /* renamed from: a */
    private static List<String> f69964a = new ArrayList();

    /* renamed from: com.pgl.ssdk.t0$a */
    /* loaded from: classes7.dex */
    public static class C26664a {

        /* renamed from: a */
        public int f69965a;

        /* renamed from: b */
        public String f69966b;

        public C26664a(int i, String... strArr) {
            this.f69965a = i;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.f69966b = jSONArray.toString();
        }
    }

    /* renamed from: a */
    private static File m40761a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C26654p0.m40796a(file.getAbsolutePath());
        }
        return file;
    }

    /* renamed from: b */
    public static synchronized C26664a m40756b(Context context, String str) {
        synchronized (C26663t0.class) {
            if (f69964a.contains(str)) {
                return null;
            }
            try {
                System.loadLibrary(str);
                f69964a.add(str);
            } catch (UnsatisfiedLinkError e) {
                File m40760a = m40760a(context, str);
                if (m40760a == null) {
                    return new C26664a(3, e.getMessage(), "output null");
                }
                if (m40760a.exists()) {
                    m40760a.delete();
                }
                C26664a m40759a = m40759a(context, str, m40760a);
                if (m40759a != null) {
                    return m40759a;
                }
                System.load(m40760a.getAbsolutePath());
                f69964a.add(str);
            } catch (Throwable th) {
                return new C26664a(3, th.getMessage());
            }
            return null;
        }
    }

    /* renamed from: a */
    private static File m40760a(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File m40761a = m40761a(context);
        if (m40761a != null) {
            return new File(m40761a, mapLibraryName);
        }
        return null;
    }

    /* renamed from: a */
    private static C26664a m40759a(Context context, String str, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry m40757a = m40757a(zipFile2, Build.CPU_ABI, str);
                if (m40757a == null) {
                    try {
                        m40757a = m40757a(zipFile2, Build.CPU_ABI2, str);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        try {
                            return new C26664a(3, th.getMessage());
                        } finally {
                            C26654p0.m40797a(fileOutputStream);
                            C26654p0.m40797a(inputStream);
                            C26654p0.m40794a(zipFile);
                        }
                    }
                }
                if (m40757a != null) {
                    file.createNewFile();
                    InputStream inputStream2 = zipFile2.getInputStream(m40757a);
                    try {
                        fileOutputStream2 = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        return new C26664a(3, th.getMessage());
                    }
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read > 0) {
                                fileOutputStream2.write(bArr, 0, read);
                            } else {
                                C26654p0.m40795a(file.getAbsolutePath(), FacebookRequestErrorClassification.ESC_APP_INACTIVE);
                                C26654p0.m40797a(fileOutputStream2);
                                C26654p0.m40797a(inputStream2);
                                C26654p0.m40794a(zipFile2);
                                return null;
                            }
                        }
                    } catch (Throwable th3) {
                        zipFile = zipFile2;
                        inputStream = inputStream2;
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        return new C26664a(3, th.getMessage());
                    }
                } else {
                    C26664a c26664a = new C26664a(2, m40758a(zipFile2, str));
                    C26654p0.m40797a((Closeable) null);
                    C26654p0.m40797a((Closeable) null);
                    C26654p0.m40794a(zipFile2);
                    return c26664a;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    /* renamed from: a */
    private static String m40758a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (m40757a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", asList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static ZipEntry m40757a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + RemoteSettings.FORWARD_SLASH_STRING + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb2 = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        sb2.append(str.substring(0, indexOf));
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb2.toString());
    }
}
