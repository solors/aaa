package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.g5 */
/* loaded from: classes3.dex */
public class C9863g5 {

    /* renamed from: a */
    public final AtomicReference f22084a;

    /* renamed from: b */
    public final C9886h5 f22085b;

    public C9863g5(Context context, AtomicReference atomicReference) {
        C9886h5 c9886h5 = new C9886h5(context.getCacheDir());
        this.f22085b = c9886h5;
        this.f22084a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((C10127p9) atomicReference.get()).f22935o);
            File file = new File(c9886h5.f22157a, "templates");
            if (file.exists()) {
                m81636a(file.listFiles(), currentTimeMillis);
                m81640a(c9886h5);
            }
        } catch (Exception e) {
            C9763c7.m81920b("Exception while cleaning up templates directory at " + this.f22085b.f22162f.getPath(), e);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m81636a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    m81632b(file.listFiles(), j);
                    m81635a(file.listFiles(), file);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m81632b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    C9763c7.m81920b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    /* renamed from: c */
    public File[] m81631c() {
        File m81634b = m81634b();
        if (m81634b != null) {
            return m81634b.listFiles();
        }
        return null;
    }

    /* renamed from: d */
    public File m81629d() {
        return this.f22085b.f22165i;
    }

    /* renamed from: e */
    public JSONObject m81627e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = m81641a().f22157a;
            for (String str : ((C10127p9) this.f22084a.get()).f22936p) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    AbstractC10396z1.m79816a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e) {
            C9763c7.m81920b("getWebViewCacheAssets: " + e, null);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public void m81628d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            C9763c7.m81920b("File not found when attempting to touch", e);
        } catch (IOException e2) {
            C9763c7.m81920b("IOException when attempting to touch file", e2);
        }
    }

    /* renamed from: c */
    public boolean m81630c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    /* renamed from: b */
    public long m81633b(File file) {
        long j = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            j += m81633b(file2);
                        }
                        return j;
                    }
                    return 0L;
                }
            } catch (Exception e) {
                C9763c7.m81920b("getFolderSize: " + e, null);
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    /* renamed from: a */
    public C9886h5 m81641a() {
        return this.f22085b;
    }

    /* renamed from: a */
    public boolean m81638a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    /* renamed from: a */
    public final void m81635a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        C9763c7.m81920b("Unable to delete " + file.getPath(), null);
    }

    /* renamed from: b */
    public File m81634b() {
        return this.f22085b.f22164h;
    }

    /* renamed from: a */
    public File m81637a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    /* renamed from: a */
    public Boolean m81639a(C10273v c10273v) {
        Map m80352d = c10273v.m80352d();
        C9886h5 m81641a = m81641a();
        if (m81641a == null) {
            return Boolean.FALSE;
        }
        File file = m81641a.f22157a;
        for (C9753c1 c9753c1 : m80352d.values()) {
            File m81943a = c9753c1.m81943a(file);
            if (m81943a == null) {
                return Boolean.FALSE;
            }
            if (!m81943a.exists()) {
                C9763c7.m81920b("Asset does not exist: " + c9753c1.f21762b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public final void m81640a(C9886h5 c9886h5) {
        File file = new File(c9886h5.f22157a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        C9763c7.m81920b("Unable to delete " + file.getPath(), null);
    }
}
