package androidx.work.impl;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkDatabasePathHelper.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WorkDatabasePathHelperKt {
    @NotNull
    private static final String[] DATABASE_EXTRA_FILES;
    @NotNull
    private static final String TAG;
    @NotNull
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WrkDbPathHelper\")");
        TAG = tagWithPrefix;
        DATABASE_EXTRA_FILES = new String[]{"-journal", "-shm", "-wal"};
    }
}
