package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: WorkDatabasePathHelper.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class WorkDatabasePathHelper {
    @NotNull
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @RequiresApi(23)
    private final File getNoBackupPath(Context context) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }

    public static final void migrateDatabase(@NotNull Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger logger = Logger.get();
            str = WorkDatabasePathHelperKt.TAG;
            logger.debug(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger logger2 = Logger.get();
                        str4 = WorkDatabasePathHelperKt.TAG;
                        logger2.warning(str4, "Over-writing contents of " + value);
                    }
                    if (key.renameTo(value)) {
                        str2 = "Migrated " + key + "to " + value;
                    } else {
                        str2 = "Renaming " + key + " to " + value + " failed";
                    }
                    Logger logger3 = Logger.get();
                    str3 = WorkDatabasePathHelperKt.TAG;
                    logger3.debug(str3, str2);
                }
            }
        }
    }

    @NotNull
    public final File getDatabasePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getNoBackupPath(context);
    }

    @NotNull
    public final File getDefaultDatabasePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    @NotNull
    public final Map<File, File> migrationPaths(@NotNull Context context) {
        String[] strArr;
        int m17292f;
        int m16917e;
        Map<File, File> m17275s;
        Intrinsics.checkNotNullParameter(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        m17292f = MapsJVM.m17292f(strArr.length);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (String str : strArr) {
            Tuples m14532a = C38513v.m14532a(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        m17275s = C37559r0.m17275s(linkedHashMap, C38513v.m14532a(defaultDatabasePath, databasePath));
        return m17275s;
    }
}
