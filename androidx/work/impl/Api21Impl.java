package androidx.work.impl;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkDatabasePathHelper.kt */
@RequiresApi(21)
@Metadata
/* loaded from: classes2.dex */
public final class Api21Impl {
    @NotNull
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    @DoNotInline
    @NotNull
    public final File getNoBackupFilesDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
