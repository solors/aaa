package androidx.core.net;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.net.UriKt */
/* loaded from: classes.dex */
public final class Uri {
    @NotNull
    public static final File toFile(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (Intrinsics.m17075f(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    @NotNull
    public static final android.net.Uri toUri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        android.net.Uri parse = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }

    @NotNull
    public static final android.net.Uri toUri(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
        return fromFile;
    }
}
