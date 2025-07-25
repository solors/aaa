package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import com.vungle.ads.internal.util.C29518o;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.p */
/* loaded from: classes7.dex */
public final class PathProvider {
    @NotNull
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    @NotNull
    public static final C29520a Companion = new C29520a(null);
    @NotNull
    private static final String DOWNLOADS_FOLDER = "downloads";
    @NotNull
    private static final String JS_FOLDER = "js";
    private static final long UNKNOWN_SIZE = -1;
    @NotNull
    private static final String VUNGLE_FOLDER = "vungle_cache";
    @NotNull
    private final File cleverCacheDir;
    @NotNull
    private final Context context;
    @NotNull
    private final File downloadsDir;
    @NotNull
    private final File jsDir;
    @NotNull
    private final File vungleDir;

    /* compiled from: PathProvider.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.p$a */
    /* loaded from: classes7.dex */
    public static final class C29520a {
        private C29520a() {
        }

        public /* synthetic */ C29520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PathProvider(@NotNull Context context) {
        List<File> m17163p;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, DOWNLOADS_FOLDER);
        this.downloadsDir = file2;
        File file3 = new File(file, JS_FOLDER);
        this.jsDir = file3;
        File file4 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file4;
        m17163p = C37563v.m17163p(file, file2, file3, file4);
        for (File file5 : m17163p) {
            if (!file5.exists()) {
                file5.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37463w("PathProvider", "Failed to get available bytes " + e.getMessage());
            return -1L;
        }
    }

    @NotNull
    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final File getDownloadDir() {
        if (!this.downloadsDir.exists()) {
            this.downloadsDir.mkdirs();
        }
        return this.downloadsDir;
    }

    @Nullable
    public final File getDownloadsDirForAd(@Nullable String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        File downloadDir = getDownloadDir();
        File file = new File(downloadDir.getPath() + File.separator + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    public final File getJsAssetDir(@NotNull String jsVersion) {
        Intrinsics.checkNotNullParameter(jsVersion, "jsVersion");
        File file = new File(getJsDir(), jsVersion);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    public final File getJsDir() {
        if (!this.jsDir.exists()) {
            this.jsDir.mkdirs();
        }
        return this.jsDir;
    }

    @NotNull
    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "{\n        context.noBackupFilesDir\n    }");
        return noBackupFilesDir;
    }

    @NotNull
    public final File getUnclosedAdFile(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    @NotNull
    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
