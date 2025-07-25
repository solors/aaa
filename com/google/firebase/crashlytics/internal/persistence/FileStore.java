package com.google.firebase.crashlytics.internal.persistence;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class FileStore {

    /* renamed from: a */
    private final File f42917a;

    /* renamed from: b */
    private final File f42918b;

    /* renamed from: c */
    private final File f42919c;

    /* renamed from: d */
    private final File f42920d;

    /* renamed from: e */
    private final File f42921e;

    /* renamed from: f */
    private final File f42922f;

    public FileStore(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f42917a = filesDir;
        if (m66918h()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(m66919g(processName));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m66923c = m66923c(new File(filesDir, str));
        this.f42918b = m66923c;
        this.f42919c = m66923c(new File(m66923c, "open-sessions"));
        this.f42920d = m66923c(new File(m66923c, "reports"));
        this.f42921e = m66923c(new File(m66923c, "priority-reports"));
        this.f42922f = m66923c(new File(m66923c, "native-reports"));
    }

    /* renamed from: a */
    private void m66925a(File file) {
        if (file.exists() && m66921e(file)) {
            Logger logger = Logger.getLogger();
            logger.m67216d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    private File m66924b(String str) {
        return m66922d(new File(this.f42919c, str));
    }

    /* renamed from: c */
    private static synchronized File m66923c(File file) {
        synchronized (FileStore.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                Logger logger = Logger.getLogger();
                logger.m67216d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger logger2 = Logger.getLogger();
                logger2.m67214e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    /* renamed from: d */
    private static File m66922d(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m66921e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m66921e(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: f */
    private static <T> List<T> m66920f(@Nullable T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    @VisibleForTesting
    /* renamed from: g */
    static String m66919g(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: h */
    private static boolean m66918h() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public void cleanupPreviousFileSystems() {
        m66925a(new File(this.f42917a, ".com.google.firebase.crashlytics"));
        m66925a(new File(this.f42917a, ".com.google.firebase.crashlytics-ndk"));
        if (m66918h()) {
            m66925a(new File(this.f42917a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        m66921e(this.f42918b);
    }

    public boolean deleteSessionFiles(String str) {
        return m66921e(new File(this.f42919c, str));
    }

    public List<String> getAllOpenSessionIds() {
        return m66920f(this.f42919c.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f42918b, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return m66920f(this.f42918b.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f42922f, str);
    }

    public List<File> getNativeReports() {
        return m66920f(this.f42922f.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return m66922d(new File(m66924b(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.f42921e, str);
    }

    public List<File> getPriorityReports() {
        return m66920f(this.f42921e.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f42920d, str);
    }

    public List<File> getReports() {
        return m66920f(this.f42920d.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(m66924b(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return m66920f(m66924b(str).listFiles(filenameFilter));
    }
}
