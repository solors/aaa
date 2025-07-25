package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DataStoreFile.kt */
@Metadata
/* loaded from: classes.dex */
public final class DataStoreFile {
    @NotNull
    public static final File dataStoreFile(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.m17064q("datastore/", fileName));
    }
}
