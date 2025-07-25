package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
class CrashlyticsAppQualitySessionsStore {

    /* renamed from: d */
    private static final FilenameFilter f42305d = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsAppQualitySessionsStore.m67188a(file, str);
        }
    };

    /* renamed from: e */
    private static final Comparator<File> f42306e = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return CrashlyticsAppQualitySessionsStore.m67187b((File) obj, (File) obj2);
        }
    };

    /* renamed from: a */
    private final FileStore f42307a;
    @Nullable

    /* renamed from: b */
    private String f42308b = null;
    @Nullable

    /* renamed from: c */
    private String f42309c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f42307a = fileStore;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m67188a(File file, String str) {
        return m67186c(file, str);
    }

    /* renamed from: b */
    public static /* synthetic */ int m67187b(File file, File file2) {
        return m67185d(file, file2);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m67186c(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* renamed from: d */
    public static /* synthetic */ int m67185d(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: e */
    private static void m67184e(FileStore fileStore, @Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            try {
                fileStore.getSessionFile(str, "aqs." + str2).createNewFile();
            } catch (IOException e) {
                Logger.getLogger().m67207w("Failed to persist App Quality Sessions session id.", e);
            }
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: f */
    static String m67183f(FileStore fileStore, @NonNull String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, f42305d);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().m67208w("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(sessionFiles, f42306e)).getName().substring(4);
    }

    @Nullable
    public synchronized String getAppQualitySessionId(@NonNull String str) {
        if (Objects.equals(this.f42308b, str)) {
            return this.f42309c;
        }
        return m67183f(this.f42307a, str);
    }

    public synchronized void rotateAppQualitySessionId(@NonNull String str) {
        if (!Objects.equals(this.f42309c, str)) {
            m67184e(this.f42307a, this.f42308b, str);
            this.f42309c = str;
        }
    }

    public synchronized void rotateSessionId(@Nullable String str) {
        if (!Objects.equals(this.f42308b, str)) {
            m67184e(this.f42307a, str, this.f42309c);
            this.f42308b = str;
        }
    }
}
