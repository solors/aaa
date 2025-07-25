package io.appmetrica.analytics.coreutils.internal.p726io;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44983m;

@Metadata
/* renamed from: io.appmetrica.analytics.coreutils.internal.io.FileUtils */
/* loaded from: classes9.dex */
public final class FileUtils {
    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();
    @NotNull
    public static final String SDK_FILES_PREFIX = "appmetrica_analytics";
    @NotNull
    public static final String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";

    /* renamed from: a */
    private static volatile File f92425a;

    private FileUtils() {
    }

    public static final boolean copyToNullable(@Nullable File file, @Nullable File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                C44983m.m1176q(file, file2, false, 0, 6, null);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final File getAppDataDir(@NotNull Context context) {
        if (AndroidUtils.isApiAchieved(24)) {
            return AppDataDirProviderForN.INSTANCE.dataDir(context);
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getParentFile();
        }
        return null;
    }

    @Nullable
    public static final File getAppStorageDirectory(@NotNull Context context) {
        return context.getNoBackupFilesDir();
    }

    @Nullable
    public static final File getCrashesDirectory(@NotNull Context context) {
        return getFileFromSdkStorage(context, "crashes");
    }

    @Nullable
    public static final File getFileFromAppStorage(@NotNull Context context, @NotNull String str) {
        File appStorageDirectory = getAppStorageDirectory(context);
        if (appStorageDirectory != null) {
            return new File(appStorageDirectory, str);
        }
        return null;
    }

    @NotNull
    public static final File getFileFromPath(@NotNull String str) {
        return new File(str);
    }

    @Nullable
    public static final File getFileFromSdkStorage(@NotNull Context context, @NotNull String str) {
        File sdkStorage = sdkStorage(context);
        if (sdkStorage != null) {
            return new File(sdkStorage, str);
        }
        return null;
    }

    @Nullable
    public static final File getNativeCrashDirectory(@NotNull Context context) {
        return getFileFromSdkStorage(context, "native_crashes");
    }

    public static final boolean move(@Nullable File file, @Nullable File file2) {
        FileUtils fileUtils = INSTANCE;
        if (!fileUtils.moveByRename(file, file2) && !fileUtils.moveByCopy(file, file2)) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public static final void resetSdkStorage() {
        synchronized (INSTANCE) {
            f92425a = null;
            Unit unit = Unit.f99208a;
        }
    }

    @Nullable
    public static final File sdkStorage(@NotNull Context context) {
        File file;
        if (f92425a == null) {
            synchronized (INSTANCE) {
                File appStorageDirectory = getAppStorageDirectory(context);
                if (appStorageDirectory == null) {
                    file = null;
                } else {
                    File file2 = new File(appStorageDirectory, SDK_STORAGE_RELATIVE_PATH);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    file = file2;
                }
                f92425a = file;
                Unit unit = Unit.f99208a;
            }
        }
        return f92425a;
    }

    public final boolean moveByCopy(@Nullable File file, @Nullable File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                C44983m.m1176q(file, file2, false, 0, 6, null);
                file.delete();
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean moveByRename(@Nullable File file, @Nullable File file2) {
        Boolean bool;
        if (file2 != null) {
            if (file != null) {
                bool = Boolean.valueOf(file.renameTo(file2));
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
