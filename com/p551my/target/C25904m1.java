package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.my.target.m1 */
/* loaded from: classes7.dex */
public final class C25904m1 {

    /* renamed from: b */
    public static final long f67242b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: c */
    public static final FilenameFilter f67243c = new FilenameFilter() { // from class: com.my.target.tc
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C25904m1.m43486a(file, str);
        }
    };

    /* renamed from: d */
    public static final FilenameFilter f67244d = new FilenameFilter() { // from class: com.my.target.uc
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C25904m1.m43478b(file, str);
        }
    };

    /* renamed from: e */
    public static volatile C25904m1 f67245e;

    /* renamed from: a */
    public final File f67246a;

    public C25904m1(File file) {
        this.f67246a = file;
    }

    /* renamed from: a */
    public final int m43484a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return i;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            }
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("DiskCache: Error - " + th.getMessage());
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized String m43475b(String str, String str2) {
        m43473d();
        File m43481a = m43481a(str, str2);
        if (m43481a.exists()) {
            AbstractC25846ja.m43680a("DiskCache: Get path - " + m43481a.getPath());
            return m43481a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: c */
    public final void m43474c() {
        File[] listFiles = this.f67246a.listFiles(f67244d);
        if (listFiles != null && listFiles.length >= 10) {
            Arrays.sort(listFiles, new Comparator() { // from class: com.my.target.vc
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C25904m1.m43487a((File) obj, (File) obj2);
                }
            });
            for (int length = listFiles.length - 1; length >= 10; length--) {
                String path = listFiles[length].getPath();
                AbstractC25846ja.m43680a("DiskCache: Remove redundant video - " + path);
                if (!listFiles[length].delete()) {
                    AbstractC25846ja.m43680a("DiskCache: Unable to remove file - " + path);
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void m43473d() {
        try {
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("DiskCache: exception - " + th);
        }
        if (!this.f67246a.exists()) {
            m43491a();
            return;
        }
        m43480b();
        m43474c();
    }

    /* renamed from: a */
    public synchronized Bitmap m43482a(String str) {
        String str2;
        m43473d();
        File m43481a = m43481a(str, ".img");
        if (m43481a.exists()) {
            AbstractC25846ja.m43680a("DiskCache: Get image - " + m43481a.getPath());
            try {
                return BitmapFactory.decodeFile(m43481a.getAbsolutePath());
            } catch (OutOfMemoryError e) {
                System.gc();
                AbstractC25846ja.m43676c("DiskCache: OutOfMemoryError, trying once again");
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    return BitmapFactory.decodeFile(m43481a.getAbsolutePath(), options);
                } catch (OutOfMemoryError unused) {
                    str2 = "DiskCache: OutOfMemoryError, called twice - " + e;
                    AbstractC25846ja.m43676c(str2);
                    return null;
                }
            } catch (Throwable th) {
                str2 = "DiskCache: exception - " + th;
                AbstractC25846ja.m43676c(str2);
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m43476b(String str) {
        return m43475b(str, ".mp4");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m43478b(File file, String str) {
        return str.endsWith(".mp4");
    }

    /* renamed from: a */
    public synchronized String m43490a(int i, long j) {
        m43473d();
        File m43481a = m43481a(Integer.toString(i), ".json");
        if (m43481a.exists()) {
            if (m43481a.isFile() && System.currentTimeMillis() - m43481a.lastModified() > j) {
                AbstractC25846ja.m43680a("DiskCache: Remove expired file - " + m43481a.getPath());
                if (!m43481a.delete()) {
                    AbstractC25846ja.m43680a("DiskCache: Unable to delete file - " + m43481a.getAbsolutePath());
                }
                return null;
            }
            AbstractC25846ja.m43680a("DiskCache: Get text - " + m43481a.getPath());
            FileInputStream fileInputStream = new FileInputStream(m43481a);
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb2.append(new String(cArr, 0, read));
            }
            if (sb2.length() == 0) {
                AbstractC25846ja.m43680a("DiskCache: Error - cache file is empty");
                fileInputStream.close();
                return null;
            }
            String sb3 = sb2.toString();
            fileInputStream.close();
            return sb3;
        }
        return null;
    }

    /* renamed from: b */
    public static C25904m1 m43479b(Context context) {
        C25904m1 c25904m1 = f67245e;
        if (c25904m1 == null) {
            synchronized (C25904m1.class) {
                c25904m1 = f67245e;
                if (c25904m1 == null) {
                    try {
                        c25904m1 = new C25904m1(m43488a(context));
                        f67245e = c25904m1;
                    } catch (Exception e) {
                        AbstractC25846ja.m43676c("DiskCache: unable to create cache dir: " + e);
                        return null;
                    }
                }
            }
        }
        return c25904m1;
    }

    /* renamed from: a */
    public final File m43481a(String str, String str2) {
        return new File(this.f67246a.getAbsolutePath() + File.separator + ("mytrg_" + AbstractC25925n1.m43419c(str) + str2));
    }

    /* renamed from: a */
    public static File m43488a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "mytargetcache");
            if (file.exists() || file.mkdirs()) {
                if (file.isDirectory() && file.canWrite()) {
                    return file;
                }
                throw new Exception("can't write to mytarget cache dir");
            }
            throw new Exception("can't create mytarget cache dir");
        }
        throw new Exception("can't get context cache dir");
    }

    /* renamed from: b */
    public synchronized File m43477b(InputStream inputStream, String str) {
        File m43481a;
        m43473d();
        m43481a = m43481a(str, ".mp4");
        AbstractC25846ja.m43680a("DiskCache: Save video - " + m43481a.getPath());
        return m43485a(inputStream, m43481a);
    }

    /* renamed from: a */
    public static /* synthetic */ int m43487a(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: b */
    public final void m43480b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f67246a.lastModified() <= f67242b) {
            return;
        }
        File[] listFiles = this.f67246a.listFiles(f67243c);
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && currentTimeMillis - file.lastModified() > f67242b) {
                    AbstractC25846ja.m43680a("DiskCache: Remove expired file - " + file.getPath());
                    if (!file.delete()) {
                        AbstractC25846ja.m43680a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                    }
                }
            }
        }
        if (this.f67246a.setLastModified(currentTimeMillis)) {
            return;
        }
        AbstractC25846ja.m43680a("DiskCache: Unable to set last modified to dir - " + this.f67246a.getAbsolutePath());
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m43486a(File file, String str) {
        return str.startsWith("mytrg_");
    }

    /* renamed from: a */
    public synchronized File m43489a(int i, String str, boolean z) {
        File m43481a;
        m43473d();
        m43481a = m43481a(Integer.toString(i), ".json");
        AbstractC25846ja.m43680a("DiskCache: Save text - " + m43481a.getPath());
        long currentTimeMillis = System.currentTimeMillis();
        if (m43481a.exists() && z) {
            currentTimeMillis = m43481a.lastModified();
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(m43481a), StandardCharsets.UTF_8.newEncoder());
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            if (!m43481a.setLastModified(currentTimeMillis)) {
                AbstractC25846ja.m43680a("DiskCache: Unable to set last modified to file - " + m43481a.getPath());
            }
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return m43481a;
    }

    /* renamed from: a */
    public final File m43485a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            m43484a(inputStream, fileOutputStream);
            fileOutputStream.close();
            return file;
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("DiskCache: exception - " + th);
            return null;
        }
    }

    /* renamed from: a */
    public synchronized File m43483a(InputStream inputStream, String str) {
        File m43481a;
        m43473d();
        m43481a = m43481a(str, ".img");
        AbstractC25846ja.m43680a("DiskCache: Save image - " + m43481a.getPath());
        return m43485a(inputStream, m43481a);
    }

    /* renamed from: a */
    public final void m43491a() {
        AbstractC25846ja.m43680a("DiskCache: cache dir was deleted during runtime, re-creating...");
        if (!this.f67246a.mkdirs()) {
            throw new Exception("can't re-create cache dir in runtime");
        }
    }
}
